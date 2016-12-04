package task2_Deck;

/**
 * Created by ASUS on 3.12.2016 г..
 */
public class Card implements Comparable<Card> {

    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }




    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() { return rank; }
    public String getSuit() { return suit; }
    public String toString() { return  rank + " of " + suit; }

    @Override
    public int compareTo(Card card) {
        if (suit.equals(card.suit)) {
            if (rank.equals(card.rank)) {

                return 0;
            }
            return rank.compareTo(card.rank) < 0 ? -1 : 1;
        } else {
            return suit.compareTo(card.suit) < 0 ? -1 : 1;
        }
    }
    }
