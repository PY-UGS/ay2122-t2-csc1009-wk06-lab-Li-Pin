package Lab_6;

import java.util.*;

public class Lab6_Qn5 {
    public static void changeValueHash (LinkedHashMap<Integer, Integer> map, Integer num1, Integer num2){
        ArrayList<Integer> keySetList = new ArrayList<>();
        keySetList.addAll(map.keySet());

        Collections.swap(keySetList, num1, num2);

        LinkedHashMap<Integer, Integer> swappedMap = new LinkedHashMap<>();

        for(Integer oldSwappedKey:keySetList){
            swappedMap.put(oldSwappedKey, map.get(oldSwappedKey));
        }

        System.out.println("Hashmap after: " + swappedMap.values());
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        LinkedHashMap<Integer, Integer> map1 = new LinkedHashMap<>();
        map1.put(0, 1);
        map1.put(1, 3);
        map1.put(2, 5);
        map1.put(3, 7);
        map1.put(4, 9);
        map1.put(5, 11);

        System.out.println("\n-----Qn5-----\nHashmap before: " + map1.values());
        System.out.print("Enter the index of first value to swap: ");
        int num1 = input.nextInt();
        System.out.print("Enter the index of second value to swap: ");
        int num2 = input.nextInt();

        changeValueHash(map1, num1, num2);

        input.close();
    }
}
