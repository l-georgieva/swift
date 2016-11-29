package task5_ChildPlay;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ASUS on 26.11.2016 г..
 */
public class Task5_ChildPlay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());

        String[] kidsHeight = new String[n];
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int l = list.size();

        for (int i = 0; i < n; i++) {
         kidsHeight[i] = scn.nextLine();


        }


        System.out.println(list);
    }

}







