import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class PlayerTest {
     Player player;
     Hand hand;
     Card card;

     @Before
     public void before(){
          player = new Player();
          player.hand = new Hand();
          card = new Card(Suit.HEARTS, Rank.QUEEN, Rank.QUEEN.value);
     }

     @Test
     public void canAddCardToPlayersHand() {
          player.hand.addCard(card);
          assertEquals(1, player.hand.cardCount());
     }
}