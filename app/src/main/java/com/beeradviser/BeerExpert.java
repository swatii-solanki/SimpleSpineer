package com.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color){

        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }else {
            brands.add("Jale pale ale");
            brands.add("Gout shout");
        }
        return brands;
    }
}

/*
Name - Swati Solanki
Designation - Android Developer
Good Knowledge of Java Programming knowledge
Experience in designing and developing of android application
Familiarity with Restful APIs to android application connect to Back-end services
Experience in integrating third party libraries
Integrated google play services and Google Maps API
Knowledge of JetPack components such as Data Binding, Navigation Component,Live Data,View Model etc.
Knowledge of GIT Version control systems
Knowledge of firebase
*/
