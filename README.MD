#Week 6 weekend homework - card game in Java

##Starting point of ReadMe

I started working on this with Kate when we sketched out some basic classes, i.e. the Card class and the Deck class. 

I've struggled with not exceeding the MVP, by making it more complicated than it needs to be at the minute. I know that we are just practicing some basic Java concepts and constructs and I should just concentrate on getting a few basic functions to test out.

I've managed to create a card of a particular rank and suit and add it to a deck.

I know that I've got to create a new deck, but in the meantime I've been working on some logic. Since players and dealers are slightly different, I'm making a seperate Dealer class that extends the Player class. 

I'm toying with the idea of a Game class that keeps track of the value of the player and dealers hands and decided who has won.

One concept I'm swithering with is assigning a value to a card. At this point I might just hard code it into the deck - or should it be in the game? Probably the game.

Since I'm creating a particular deck with particular values for a particular game, I'm going back to the idea of having a value parameter as part of a Card that takes an integer as an argument.

The way I'm doing this seems a bit roundabout but I'm not sure how else to do it. I've created a player who has a hand and now I've created a dealer who can take a deck and remove a couple of cards and give it to a player. I think. I'll have to test it now which I know is the wrong way around.

After trying loads of things I'm going to create a Hand class to contain the cards dealt by the dealer, and see how I get on with this.

So back for a wee bit Saturday evening, I stripped my expectations back, and at the time of writing I have a Card class, a Deck Class, a Hand class, and a Player class, as well as Rank and Suit enums.

I have managed to test and develop methods for adding cards to the deck and to the hand and for the player to have a hand which can also have cards added to it. So making progress, baby steps.

Was frustrated when I went to bed on Saturday evening as nothing seemed to be working, things were going wrong that I didn't understand. 

Sunday was better and everything seemed to fall into place. I think a lot of trouble was happening because I wasn't understanding the role of all the instance variables and constructors in the interlocking classes. 

I settled on MVP with creating a Game class that has a deal method, a get hand value method and say winner method. I didn't bother doing a deck builder as that would be what I'd do when i was ready to start playing a game. I made up a minimal deck of five cards for testing purposes and was happy with that. I'll look into the deck build method though as it's interesting.

Sunday evening: I had a look at how to set values to my cards, and added an integer value property to my Rank enum with a method to get it. This has worked throughout the programe using Rank.RANK.value.

Last thing Sunday: I was looking at how to build a deck of cards, but realised that I was committing the sin of trying to copy code from Stack Overflow or the classnotes without really understanding what I was doing. So I've deleted it and will ask about it on Monday morning.
