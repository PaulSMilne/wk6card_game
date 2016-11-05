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


     public Card getCard(int index){
          return hand.get(index);
     }

}