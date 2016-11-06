import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class GameTest {
     Player player;
     Player dealer;
     Hand hand;
     Deck deck;
     Card card1;
     Card card2;
     Card card3;
     Card card4;
     Card card5;

     @Before
     public void before(){
          player = new Player();
          dealer = new Player();
          player.hand = new Hand();
          dealer.hand = new Hand();
          deck = new Deck();
          card1 = new Card(Suit.HEARTS, Rank.TEN, 10);
          card2 = new Card(Suit.HEARTS, Rank.KNAVE, 10);
          card3 = new Card(Suit.HEARTS, Rank.QUEEN, 10);
          card4 = new Card(Suit.HEARTS, Rank.KING, 10);
          card5 = new Card(Suit.HEARTS, Rank.ACE, 11);
          deck.addCard(card1);
          deck.addCard(card2);
          deck.addCard(card3);
          deck.addCard(card4);
          deck.addCard(card5);
     }

     // @Test
     // public void canDealCardFromDeckToPlayersHand() {
     //      player.hand.dealHand(deck(0));
     //      assertEquals(1, player.hand.cardCount());
     // }
}