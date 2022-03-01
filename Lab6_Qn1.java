package Lab_6;

import java.util.*;

public class Lab6_Qn1{
    public static void addAndSort (LinkedList<Integer> list, int value){
        list.add(value);
        int size = list.size();
        int temp;

        for(int i=0;i<size;i++){
            int j = 0;
            j=i+1;
            for(;j<size;j++){
                if(list.get(i)>list.get(j)){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void main (String[] args){
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);
        list1.add(11);

        System.out.println("-----Qn1-----\nLinked list before: " + list1);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        addAndSort(list1, num);
        System.out.println("Linked list after: " + list1);

        input.close();
    }
}


