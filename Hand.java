package cards;

import java.util.List;
import java.util.Random;

public class Hand {

	 public String[] hand = new String[2];
	    Random random = new Random();

	    // select 2 cards to distribute to player
	    public String[] getHand(List<String> fullDeck) {
	      
	        for(int i = 0; i < this.hand.length; i++) {
	            this.hand[i] = fullDeck.get(random.nextInt(Deck.deckLength));
	        }
	        return this.hand;
	    }

	    // show player hand
	    public void showHand() {
	        for(int i = 0; i < this.hand.length; i++) {
	            System.out.printf("%s ", this.hand[i]);

	        }
	    }

}
