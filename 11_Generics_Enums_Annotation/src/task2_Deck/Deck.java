package task2_Deck;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ASUS on 3.12.2016 г..
 */
public class Deck {
    ArrayList<Card> cards = new ArrayList<Card>();

    String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King","Ace"};
    String[] suit = {"Clubs","Diamonds", "Hearts", "Spades"};



    public Deck() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < values.length; j++) {
                this.cards.add(new Card(suit[i], values[j]));
            }
        }


    }

    public ArrayList<Card> getDeck() {
        return cards;
    }
}