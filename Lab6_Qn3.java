package Lab_6;

import java.util.*;

public class Lab6_Qn3 {
    public static void findValue(LinkedList<Integer> list, int searchVal){
        int counter = 0;
        for(int j = 0; j < list.size(); j++){
            if (searchVal == list.get(j)){
                System.out.print("Value found in position: " + j + "\n");
                counter += 1;
            }
        }
        if (counter == 0){
            System.out.println("-1, value not found");
        }
    }

    public static void main (String[] args){
        LinkedList<Integer> linky = new LinkedList<Integer>();

        //range: 1000 - 9999, [max (exclusive) - min (inclusive)] + min = (10000-1000) + 1000
        int random = (int)Math.floor(Math.random() * (9000)+1000);
        System.out.println("\n-----Qn3-----\nRandom value = " + random );

        int value = 0;
        for (int i = 0; i < 500; i++ ){
            value = (int)Math.floor(Math.random() * (9000)+1000); 
            linky.add(value);
        }
        System.out.println("Linked list: " + linky);

        findValue(linky, random);
    }
}
