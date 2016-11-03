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
     public void canAddCard(){
          deck.addCard(card);
          assertEquals(Suit.HEARTS, deck.get(0).getSuit());
     }
}