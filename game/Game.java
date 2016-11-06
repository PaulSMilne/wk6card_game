package game;
import java.util.*;

public class Game {
     public Deck deck; 
     public Player player; 
     public Player dealer;
     //public Hand hand;
     //public Card card;

     public Game(){
          this.deck = new Deck();
          this.player = new Player();
          this.dealer = new Player();
          //this.hand = hand;
          //this.card = card;

     }

     public void dealHand(Deck deck, Player player){  
          Card card1 = deck.drawCard(); 
          Card card2 = deck.drawCard(); 
          Hand hand = player.getHand(); 
          hand.addCard(card1); 
          hand.addCard(card2);
     }

     public int getHandValue(Player player){
          Hand hand = player.getHand();
          Card card1 = hand.getCard(0);
          Card card2 = hand.getCard(1);
          int card1Value = card1.getValue();
          int card2Value = card2.getValue();
          int handValue = card1Value + card2Value;
          return handValue; 
     }

     public String sayWinner(Player player, Player dealer){
          int playerHandValue = getHandValue(player);
          int dealerHandValue = getHandValue(dealer);
          if (playerHandValue >= dealerHandValue) {
               return "Player wins.";
          } else {
               return "Dealer wins.";
          }
     }
}