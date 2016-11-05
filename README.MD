#Week 6 weekend homework - card game in Java

##Starting point of ReadMe

I started working on this with Kate when we sketched out some basic classes, i.e. the Card class and the Deck class. 

I've struggled with not exceeding the MVP, by making it more complicated than it needs to be at the minute. I know that we are just practicing some basic Java concepts and constructs and I should just concentrate on getting a few basic functions to test out.

I've managed to create a card of a particular rank and suit and add it to a deck.

I know that I've got to create a new deck, but in the meantime I've been working on some logic. Since players and dealers are slightly different, I'm making a seperate Dealer class that extends the Player class. 

I'm toying with the idea of a Game class that keeps track of the value of the player and dealers hands and decided who has one.

One concept I'm swithering with is assigning a value to a card. At this point I might just hard code it into the deck - or should it be in the game? Probably the game.