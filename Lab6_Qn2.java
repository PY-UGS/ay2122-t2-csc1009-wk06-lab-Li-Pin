package Lab_6;

import java.util.*;

public class Lab6_Qn2 {
    public static void changeValue(LinkedList<Integer> list,int value1, int value2){
        int val1 = list.get(value1);
        int val2 = list.get(value2);

        list.set(value2, val1);
        list.set(value1, val2);
    }

    public static void main (String[] args){
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);
        list1.add(11);

        Scanner input = new Scanner(System.in);

        System.out.println("\n-----Qn2-----\nLinked list before: " + list1);
        System.out.print("Enter the index of first value to swap: ");
        int num1 = input.nextInt();
        System.out.print("Enter the index of second value to swap: ");
        int num2 = input.nextInt();

        changeValue(list1, num1, num2);
        System.out.println("Linked list after: " + list1);

        input.close();
    }
}
