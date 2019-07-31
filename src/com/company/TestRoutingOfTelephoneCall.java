package com.company;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class TestRoutingOfTelephoneCall{



   //instantiate OperatorAndPriceList class;
    private OperatorAndPriceList operatorAndPriceList;



    @Before
    public void initializeObject()
    {
        //initialize classes
        operatorAndPriceList=new OperatorAndPriceList();

    }


    //Loop through Operator list and price list and find the best price,
    //When several prefixes match the same number, the longest one should be used
    //If a price list does not include a certain prefix you cannot use that
    // operator to dial numbers starting with that prefix

    @Test
    public  void assertOperatorLengthPrefixes()
    {

         operatorAndPriceList.telephoneOperators();

        for (String operatorA:operatorAndPriceList.getOperatorA().keySet()){
            for (String operatorB:operatorAndPriceList.getOperatorB().keySet()){
                if(operatorB.contains(operatorA) && operatorB.length()> operatorA.length() ){
                    assertTrue("The longest prefix should be used ",
                            operatorB.length()>operatorA.length());

                }
            }


        }



    }

    @Test
    public  void assertOperatorIsPriceListInclude()
    {

        operatorAndPriceList.telephoneOperators();

        for (String operatorA:operatorAndPriceList.getOperatorA().keySet()){
            for (String operatorB:operatorAndPriceList.getOperatorB().keySet()){

                if(operatorB.contains(operatorA)){
                    assertTrue("The price list must include a certain prefix. Example A or B",operatorB.contains(operatorA));

                }
            }


        }

        }

}
