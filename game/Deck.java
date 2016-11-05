package game;
import java.util.*;

public class Deck {

     private ArrayList<Card> deck;

     public Deck(){
          this.deck = new ArrayList<Card>();
     }

     public int cardCount(){
          return deck.size();
     }

     public void addCard(Card card){
          deck.add(card);
     }

     public Card getCard(int index){
          return deck.get(index);
     }

     public Card drawCard(){
          Card drawnCard = deck.remove(0);
          return drawnCard;
     }


}