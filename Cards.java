package cards;

import java.util.ArrayList;
import java.util.List;

public class Cards {

	public static void main(String[] args) {

        List<String> cards = new ArrayList<String>();
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println(deck);
        deck.drawCard();
        System.out.println(deck);
    
        
        Hand hands = new Hand();
        hands.getHand(deck.getDeck());
        hands.showHand();


    }

}
