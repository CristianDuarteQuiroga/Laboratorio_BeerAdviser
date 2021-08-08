package co.edu.unipiloto;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands (String color){

        List<String> brands = new ArrayList<String>();

        if(color.equals("ligth")){
            brands.add("Aguila");
            brands.add("Corona");
        }
        if(color.equals("amber")){
            brands.add("Poker");
        }
        if(color.equals("brown")){
            brands.add("Club Colombia");
        }
        if(color.equals("dark")){
            brands.add("Lager");
        }
        return brands;
    }
}
