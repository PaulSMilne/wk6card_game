package game;
import java.util.*;

public class Dealer extends Player{

     private ArrayList<Card> hand;
     private ArrayList<Card> deck;

     public Dealer (){
          this.hand = new ArrayList<Card>();
          this.deck = new ArrayList<Card>();
     }

     public void dealsHand(Player thisPlayer){
          Card card1 = this.deck.remove(0);
          Card card2 = this.deck.remove(0);
          thisPlayer.hand.add(card1);
          thisPlayer.hand.add(card2);
     }
}