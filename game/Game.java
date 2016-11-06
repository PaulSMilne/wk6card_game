package game;
import java.util.*;

public class Game {
     public Deck deck; //A Deck is an ArrayList of Cards
     public Player player; //A Player has a Hand which also an ArrayList of Cards

     public Game(){
          this.deck = deck;
          this.player = player;
     }
//Method to move Cards from a Deck to a Player's Hand
     public void dealHand(Player player){  //Think this should be void as it needn't return anything.
          Card card1 = deck.drawCard(); //the drawCard method on the Deck removes the card from index 0
          Card card2 = deck.drawCard(); //now draws the next card which is the new "top" card
          player.hand.add(card1); //declares player.hand to be of Hand type and adds card 1
          player.hand.add(card2); //player.hand already declared and now adds card 2
     }
}
