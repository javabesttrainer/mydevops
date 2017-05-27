package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Deck {

	// create possible card combinations
    private static final String[] SUITS = {
        "H", "D", "C", "S"
    };
    private static final String[] RANKS = {
        "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"
    };

    private List<String> cards;
    public final static int deckLength = SUITS.length * RANKS.length;

    public Deck() {
        this.cards = new LinkedList<String>();
        for (int i = 0; i < SUITS.length; i++) {
            for (int j = 0; j < RANKS.length; j++) {
                this.cards.add(RANKS[j] + SUITS[i]);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public String drawCard() throws NoSuchElementException {
        if (this.cards.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.cards.remove(0);
    }

    public void returnCard(String card) {
        this.cards.add(card);
    }

    public List<String> getDeck(){
    	return this.cards;
    }
    public String toString() {
     StringBuilder s =new StringBuilder(" ");
     s.append(this.cards);
     return s.toString();
        
    }



}
