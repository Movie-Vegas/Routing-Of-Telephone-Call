package com.company;

import java.util.*;
class RoutingOfTelephoneCall implements  Router {

    // instantiate objects

    private Map<String,Float> operatorB;
    private Map<String,Float> operatorA;


    //Set Routing processes for operatorA and operateB
    @Override
    public void route(Map<String, Float> operatorA, Map<String,Float> operatorB) {

        int countOperatorA=0;
        int countOperatorB=0;

        this.operatorA=new HashMap<>();
        this.operatorB=new HashMap<>();

        for(String prefixA:operatorA.keySet()){

            this.operatorA.put(prefixA, (Float) operatorA.values().toArray()[countOperatorA]);
            countOperatorA++;




        }
        for(String prefixB:operatorB.keySet()){

            this.operatorB.put(prefixB,(Float) operatorB.values().toArray()[countOperatorB]);
            countOperatorB++;
        }




    }


    /**
     * Method printRouting is used to print routing processes
     */


    @Override
    public void printRouting() {


        //Loop through Operator list and price list and find the best price,
        //When several prefixes match the same number, the longest one should be used
        //If a price list does not include a certain prefix you cannot use that
        // operator to dial numbers starting with that prefix

        for(int x=0;x<operatorA.size();x++) {
            for (int y = 0; y < operatorB.size(); y++) {

                if (!(x > y)) {
                    String keyB=operatorB.keySet().toArray()[y].toString();
                    String keyA=operatorA.keySet().toArray()[x].toString();
                    float valueA= (float) operatorA.values().toArray()[x],
                            valueB=(float) operatorB.values().toArray()[y];


                    if (keyB.length() > keyA.length()
                            && keyB.contains(keyA)){



                          System.out.println("Prefix[" + keyA + "], you will have to pay "
                                  + valueA + "/min with Operator A and " + valueB
                                  + "/min with Operator B prefix[" + keyB+ "]");

                    }
                    if (keyA.length() > keyB.length()
                            && keyA.contains(keyB))
                    {



                        System.out.println("Prefix[" + keyA + "], you will have to pay "
                                + valueA + "/min with Operator A and " + valueB
                                + "/min with Operator B prefix[" + keyB+ "]");

                    }


                }
            }
        }







    }


    @Override
    public String toString() {
        return super.toString();
    }
}


