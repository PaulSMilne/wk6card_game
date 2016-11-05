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

     // public ArrayList<Card> getDeck(){
     //      return this.deck;
     // }

     public Card drawCard(){
          if (cardCount() > 0){
               Card card = deck.remove(0);
               return card;
          }
          return null;
     }

     public Card getCard(int index){
          return deck.get(index);
     }

     public void assignValue(int cardValue) {
          Card card = deck.get(0);
          card.value = cardValue;
     }
}