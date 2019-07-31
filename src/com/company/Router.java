package com.company;
import java.util.Map;


public interface Router {
    void route(Map<String,Float> operatorA, Map<String,Float> operatorB);
      void printRouting();

}
