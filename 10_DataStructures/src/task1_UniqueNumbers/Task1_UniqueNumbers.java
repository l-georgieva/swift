package task1_UniqueNumbers;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by ASUS on 20.11.2016 г..
 */
public class Task1_UniqueNumbers {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());

        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < n; i++) {
            //   arr[i] = Integer.parseInt(scn.nextLine());


            list.add(scn.nextInt());
        }
            System.out.println(list);
        }

    }

