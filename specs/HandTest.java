import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class HandTest {
     Hand hand;
     Card card;

     @Before
     public void before(){
          hand = new Hand();
          card = new Card(Suit.HEARTS, Rank.QUEEN, 10);
     }

     @Test
     public void canCountCards(){
          assertEquals(0, hand.cardCount());
     }

     @Test
     public void canAddCard() {
          hand.addCard(card);
          assertEquals(1, hand.cardCount());
     }

     

     @Test
     public void canGetCard(){
          hand.addCard(card);
          Card thisCard = hand.getCard(0);
          assertEquals(10, thisCard.getValue());
     }

 }