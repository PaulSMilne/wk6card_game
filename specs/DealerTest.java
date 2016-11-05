import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class DealerTest {

     Dealer dealer;
     Player player;
     Card card1;
     Card card2;
     Card card3;
     Card card4;
     Card card5;
     Deck deck;

     @Before 
     public void before() {
          player = new Player();
          dealer = new Dealer();
          deck = new Deck();
          card1 = new Card(Suit.SPADES, Rank.ACE, 11);
          card2 = new Card(Suit.SPADES, Rank.TWO, 2);
          card3 = new Card(Suit.SPADES, Rank.THREE, 3);
          card4 = new Card(Suit.SPADES, Rank.FOUR, 4);
          card5 = new Card(Suit.SPADES, Rank.FIVE, 5);
          deck.addCard(card1);
          deck.addCard(card2);
          deck.addCard(card3);
          deck.addCard(card4);
          deck.addCard(card5);
     }

     @Test
     public void canAddCards(){
          assertEquals(5, deck.cardCount());
     }

}