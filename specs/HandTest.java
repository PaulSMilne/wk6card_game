import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class HandTest {
     Hand hand;
     Card card;

     @Before 
     public void before(){
          card = new Card(Suit:HEARTS, Rank:QUEEN, 10);
          hand = new Hand();
     }

     @Test
     public void canAddCard(){
          hand.addCard(card);
          assertEquals(1, hand.cardCount());
     }
}
