package game;
import java.util.*;

public class Hand {

     private ArrayList<Card> hand;

     public Hand(){
          this.hand = new ArrayList<Card>();
     }

     public int cardCount(){
          return hand.size();
     }

     public void addCard(Card card){
          hand.add(card);
     }

     // public ArrayList<Card> getDeck(){
     //      return this.deck;
     // }

     public Card discardCard(){
          if (cardCount() > 0){
               Card card = deck.remove(0);
               return card;
          }
          return null;
     }

     public Card getCard(int index){
          return hand.get(index);
     }


}