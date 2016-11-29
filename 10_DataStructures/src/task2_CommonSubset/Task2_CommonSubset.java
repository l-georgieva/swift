package task2_CommonSubset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by ASUS on 25.11.2016 г..
 */
public class Task2_CommonSubset {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String[] input = scn.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            firstSet.add(scn.nextInt());
        }
        for (int i = 0; i < m; i++) {
            secondSet.add(scn.nextInt());
        }
        Set<Integer> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);
        if (intersection.isEmpty()) {
            System.out.println("NO");
        } else {


            System.out.println(intersection);

        }
    }
}