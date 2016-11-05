package game;

public class Card {
     private Suit suit;
     private Rank rank;
     private int value;

     public Card(Suit suit, Rank rank, int value) {
          this.suit = suit;
          this.rank = rank;
          this.value = value;
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