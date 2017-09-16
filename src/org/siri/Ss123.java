package org.siri;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ss123 {
    
    public static void main(String[] args){
            ///String str = "This is the very is the and day and sirisha yadav";
    		Integer[] str = {10,20,30,40,50,10};
            duplicate(str);
    }
    
    public static void  duplicate(Integer[] str){
         //initial empty Linkedhashmap for key and values
            Map<Integer,Integer> lhm = new LinkedHashMap<Integer,Integer>();      
           // String[] strArray = str.split(" "); //convert str to String array,using split() mtd separating words into tokens          
            for(Integer s: str){  //iterate through for loop
                    if(lhm.containsKey(s)){  //start adding word to hashmap
                            lhm.put(s, lhm.get(s)+1); //adds word and increments if it is duplicate word
                    }else{
                            lhm.put(s, 1); //adds only 1 if its not duplicate
                    }                       
            }

            //1st Duplicate word (First repetative Word)
            Integer firstRepetative = null;
            Integer temp = null;
            for(Iterator<Integer> it = lhm.keySet().iterator(); it.hasNext(); ){
                    temp = (Integer)it.next();
                    if(lhm.get(temp) > 1){
                    		firstRepetative = temp;
                            break;
                    }     
            }
            System.out.println("First repetative integer :"+firstRepetative);
            
         //1st Unique Word (First non-repetative Word)
            Integer firstNonRepetative = null;
             temp = null;
            for(Iterator<Integer> it = lhm.keySet().iterator(); it.hasNext(); ){
                    temp = (Integer)it.next();
                    if(lhm.get(temp) == 1){
                            firstNonRepetative = temp;
                            break;
                    }
            }
            System.out.println("First non-repetative integer :"+firstNonRepetative);
             
            //Occurance of all characters
            System.out.println("All Occurances");
            for(Entry<Integer, Integer> entry: lhm.entrySet()){
                System.out.println(entry.getKey()+":"+entry.getValue());
         
                    }
            //Duplicates:Occurance of characters which are more than once
          //keyset gets a Set view of the keys contained in this map. 
          //Duplicates and their occurance will be printed
            Set<Integer> setString =lhm.keySet();
            System.out.println("Duplicates");
            for(Integer s: setString){
                if(lhm.get(s)>1){
                	System.out.println(s+":: "+lhm.get(s));
                }
        }                                      
                    //Max occurence
                     //Input:" This is sirisha This is a sirisha yadav is";
                    //OutPut:is
                    Integer maxOccInt = null;
                    int maxCount = 0;
                    for(Integer s : str){
                            if(lhm.get(s) > maxCount){
                            	maxOccInt = s;
                                    maxCount = lhm.get(s);
                            }
                    }
                    System.out.println("Max Occurance first character:" +maxOccInt);
            
             //Unique characters(for this u dont need code under mtd "duplicate "(cArray forloop code)
            //it include all chars , remove duplicate for eg:
           // Input:  " This is sirisha This is a sirisha yadav";
           //Output:  [, a, yadav, This, is, sirisha]
          //Duplicates and Unique characters  will be printed , no occurance will be printed.
                Set<Integer> unqEleSet = new HashSet<Integer>();
                Set<Integer> dupEleSet = new HashSet<Integer>();
                    for(int i = 0 ;i<str.length;i++ ){
                            //list starts with empty, if element not present then will add it
                            if(unqEleSet.contains(str[i])){
                                    dupEleSet.add(str[i]);
                            }
                            unqEleSet.add(str[i]);
                    
                 }
                    System.out.println("Uniq element list :"+unqEleSet);
                    System.out.println("Duplicate element list:"+dupEleSet);                        
                    
                //Non Repitive Characters
                   //Input:" This is sirisha This is a sirisha yadav";a
                   //OutPut:[, a, yadav]
                    unqEleSet.removeAll(dupEleSet);
                    System.out.println("Non-Repetative element list:"+unqEleSet);               
}
}