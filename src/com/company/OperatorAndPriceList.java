package com.company;

import java.util.HashMap;
import java.util.Map;

public class OperatorAndPriceList extends RoutingOfTelephoneCall  {

    //instantiate Map object;
    private Map<String,Float> operatorA;
    private Map<String,Float> operatorB;


    // Telephone operators List and prices
    public  void telephoneOperators(){


        int countOperatorA=0;
        int countOperatorB=0;
        String [] operatorAPrefixes={"1","268","46","4620","468","4631","46732"};
        float [] operatorAPricePerMinute={0.9f,5.1f,0.17f,0.0f,0.15f,0.9f,1.1f};

        String [] operatorBPrefixes={"1","44","46","467","48"};
        float [] operatorBPricePerMinute={0.92f,0.5f,0.2f,1.0f,1.2f};

        operatorA=new HashMap<>();
        operatorB=new HashMap<>();



        for(String prefixA:operatorAPrefixes){

            operatorA.put(prefixA,operatorAPricePerMinute[countOperatorA]);
            ++countOperatorA;




        }
        for(String prefixB:operatorBPrefixes){

            operatorB.put(prefixB,operatorBPricePerMinute[countOperatorB]);
            ++countOperatorB;
        }


         route(operatorA,operatorB);

    }

    /**
     *
     * @return operatorA and operatorB;
     */
    public Map<String, Float> getOperatorA() {
        return operatorA;
    }


    public Map<String, Float> getOperatorB() {
        return operatorB;
    }


}
