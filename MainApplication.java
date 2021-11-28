/* 
	Fizbin game:
	Affida Haseeb: C0812614
	Fatima Aafreen: C0812461
	Kadeem Griffiths: C0821526
	Sercan Dinckal: C0818636


*/

import java.util.ArrayList;
class MainApplication{
	// think about your Method Choreography
	FizbinGame game = new FizbinGame();
	// game.InitializeGame();
	// setup database connection
	// generate players 
}

class FizbinGame{
	CardDeck gameDeck;
	ArrayList<Player> table;
	Dealer dealer;
	public void InitializeGame() {
		gameDeck = new CardDeck();
		gameDeck.GenerateDeck();
		SeatPlayers();
		dealer = new Dealer(gameDeck, table);
	}
	public void SeatPlayers(){
	}
	
}

class Dealer{
	//case definition of player
	CardDeck gameDeck; //
	ArrayList<Player> table; //
	int dealerIDX; //
	
	//constructor
	public Dealer(CardDeck gameDeck,ArrayList<Player> table){
		this.gameDeck = gameDeck;
		this.table = table;
	}
	
	//Deal cards to players
	public void DealHands(){
	}
	//Shuffle gameDeck
	public void ShuffleDeck(){
	}
	//Play a round of Fizbin game(check if players want to swap/ has fizbin
	public void PlayGameRound(){
	}
	//Picks which player is the current dealer
	public void SelectDealer(){
	}
}

class Player{
	//case definition of player
	String name;
	ArrayList<Card> hand;
	
	//Receives new carda and places it in hand
	public void ReceiveCard(){
	}
	//Check if has fizbin else what cards to swap
	public void EvaluateHand(){
	}
	//swap selected card with deck
	public void SwapCards(){
	}
	//Clear hand in prep for a new game
	public void EmptyHand(){
	}
	//Show hand at end of game
	public void ShowHand(){
	}
}

class CardDeck{
	//collection of cards
	ArrayList<Card> cardDeck= new ArrayList<>();
	
	//gives top card from deck
	public void DealCard(){
	}
	//place received card in deck and then deal card
	public void SwapCard(Card card){
	}
	//populate deck of cards
	public void GenerateDeck(){
	}	
}		

class Card{
	//base definition of Card ADT
	public String suite;
	public int value;
}
