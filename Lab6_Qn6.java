package Lab_6;

import java.util.*;

public class Lab6_Qn6 {
    //Qn 6
    public static void findValueHash(HashMap<Integer, Integer> hash, int value1){
        int counter2 = 0;
        boolean checker = false;
        for (Integer key:hash.values()){
            if(value1 == key){
                System.out.println("Value found in position: " + counter2);
                checker = true;
            }
            counter2++;
        }
        if(checker == false){
            System.out.println("-1, value not found");
        }
    }
    
    public static void main (String[] args){
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        //range: 1000 - 9999, [max (exclusive) - min (inclusive)] + min = (10000-1000) + 1000
        int random1 = (int)Math.floor(Math.random() * (9000)+1000);
        System.out.println("\n-----Qn6-----\nRandom value = " + random1 );

        int value1 = 0;
        for (int i = 0; i < 500; i++ ){
            value1 = (int)Math.floor(Math.random() * (9000)+1000);
            hash.put(i, value1);
        }

        System.out.println("Hashmap: " + hash.values());

        findValueHash(hash, random1);
    }
}
