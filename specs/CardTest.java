import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class CardTest {
     Card card;

     @Before
     public void before(){
          card = new Card(Suit.HEARTS, Rank.QUEEN);
     }
}