package task6_WordReplacement;

import java.util.*;

/**
 * Created by ASUS on 26.11.2016 г..
 */
public class Task6_WordReplacement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String[] sentence = scn.nextLine().toLowerCase().split(" ");
        int n = Integer.parseInt(scn.nextLine());
        LinkedList<String> a = new LinkedList<>();
        List<String> b = new LinkedList<>();

        String[] lines = new String[n];


        for (int i = 0; i < n; i++) {

            lines[i] = scn.nextLine();


            a.add(lines[i]);

        }
        int l = sentence.length;
        for (int i = 0; i < l; i++) {
            // System.out.println(sentence.length);
            b.add(sentence[i].toLowerCase());


            //System.out.println(b);
            for (String s : a) {
                String firstWords = s.substring(0, s.indexOf(" "));


                String secondWords = s.substring(s.indexOf(" ") + 1, s.length());


                if (sentence[i].contains(firstWords.toLowerCase())) {
                    for (String bb : b) {
                        if (bb.equals(firstWords)) {
                            sentence[i] = sentence[i].replaceAll(bb, secondWords);
                            // System.out.println(sentence[i]);
                        }
                    }
                }

            }
            System.out.print(sentence[i].toLowerCase() + " ");

        }


    }


}


















