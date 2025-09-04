package org.example.dataprocessor.Cleaning;

import java.util.ArrayList;
import java.util.List;
public class RemoveNegatives implements CleaningStrategy {
   public List<Integer> clean (List<Integer> input){
       List<Integer> out = new ArrayList<>();
       for (Integer x: input){
           if (x!=null && x>=0){
               out.add(x);
           }
       }
       return out;
   }

}
