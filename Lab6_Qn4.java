package Lab_6;

import java.util.*;

public class Lab6_Qn4 {
    public static void addAndSortHash(HashMap<Integer, Integer> map, int number){
        map.put(6, number);

        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        System.out.println("Hashmap after: " + temp.values());
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        map.put(0, 1);
        map.put(1, 3);
        map.put(2, 5);
        map.put(3, 7);
        map.put(4, 9);
        map.put(5, 11);

        System.out.println("\n-----Qn4-----\nHashmap before: " + map.values());

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        addAndSortHash(map, number);

        input.close();
    }
}
