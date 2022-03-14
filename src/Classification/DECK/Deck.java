package locklear.DECK;

public class Deck {
	private String IDNumber;
	private Bridge Deck_Bridge;
	private TopDeck Deck_Top;
	private MainDeck Deck_Main;
	
	public Deck(String IDNumber, String starDestroyer) {
		this.IDNumber=IDNumber;
		Deck_Bridge= new Bridge(starDestroyer);
		Deck_Top= new TopDeck(starDestroyer);
		Deck_Main=new MainDeck(starDestroyer);
	}
	
	public void displayDeckSpecs() {
		System.out.println("________DECK SPECIFICATIONS\nDeck Number: "+IDNumber);
        System.out.printf("%24s%-8s%-8s%-8s%-6s\n", "","Length","Height","Width","Weight");
        System.out.println(Deck_Bridge.DeckInfo());
        System.out.println(Deck_Top.DeckInfo());
        System.out.println(Deck_Main.DeckInfo());
	}
	

}
