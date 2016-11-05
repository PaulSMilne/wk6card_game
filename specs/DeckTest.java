import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class DeckTest {
     Deck deck;
     Card card;

     @Before
     public void before(){
          deck = new Deck();
          card = new Card(Suit.HEARTS, Rank.QUEEN);
     }

     @Test
     public void canCountCards(){
          assertEquals(0, deck.cardCount());
     }

     @Test
     public void canAddCard() {
          deck.addCard(card);
          assertEquals(1, deck.cardCount());
     }

     
     @Test
     public void canDrawCard(){
          deck.addCard(card);
          Card thisCard = deck.drawCard();
          assertEquals(Suit.HEARTS, thisCard.getSuit());
          //assertNotNull(card);
     }

     @Test
     public void canGetCard(){
          deck.addCard(card);
          Card thisCard = deck.getCard(0);
          assertEquals(Suit.HEARTS, thisCard.getSuit());
     }

     @Test
     public void canAssignValueToCard(){
          card = new Card(Suit.SPADES, Rank.ACE, 1);
          deck.addCard(card);
          deck(0).assignValue(10);
          Card thisCard = deck.getCard(0);
          assertEquals(10, thisCard.getValue());
     }
}