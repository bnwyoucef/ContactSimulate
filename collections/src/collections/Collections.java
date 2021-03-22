/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author BOUNOUA
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] names = {"youcef","aymen","mohammed","sarah"};
        String[] newnames = new String[5];
        
        
        //System.arraycopy(names, 0, newnames, 0, 4);
            System.arraycopy(names, 1, newnames, 2, 2
            );
        newnames[4] = "tamer";
        
        for(int i =0 ; i<5;i++){
            System.out.println(newnames[i]);
        }
            
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(124);
        numbers.add(254);
        //number.clear();
        numbers.forEach((str) -> {
            System.out.println(str);
        }); 
            
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"youcef");
        map.put(3,"anfel");
        map.put(5,"sarah");
        System.out.println(map.get(2)+" "+map.containsKey(5)); 
    }
    
}
