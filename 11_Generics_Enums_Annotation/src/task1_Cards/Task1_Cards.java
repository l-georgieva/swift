package task1_Cards;

/**
 * Created by ASUS on 3.12.2016 г..
 */
public class Task1_Cards {
    public static void main(String[] args) {
            for(CardSuit suit: CardSuit.values()){
                System.out.print(suit + " ");
            }
        System.out.println();
        for(CardRank rank: CardRank.values()){
            System.out.print(rank + " ");
        }
    }
}
