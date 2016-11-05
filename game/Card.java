package game;

public class Card {
     private Suit suit;
     private Rank rank;
     public int value;

     public Card(Suit suit, Rank rank) {
          this.suit = suit;
          this.rank = rank;
          this.value = 0;
     }

     public Suit getSuit(){
          return this.suit;
     }

     public Rank getRank(){
          return this.rank;
     }

     public int getValue(){
          return this.value;
     }
}