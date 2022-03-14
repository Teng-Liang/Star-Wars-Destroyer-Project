package locklear.DECK;

public class MainDeck extends ShipDeck {
	
	public MainDeck(String starDestroyerType) {
		super();
		super.setStarDestroyerType(starDestroyerType);
		super.setDeckType("Main Deck");
		if (starDestroyerType.equals("Imperial_I")) {
			super.setLength(600);
			super.setHeight(50);
			super.setWidth(400);
			super.setWeight(250);
		}
		else if (starDestroyerType.equals("Imperial_II")) {
			super.setLength(700);
			super.setHeight(56);
			super.setWidth(450);
			super.setWeight(300);
		}
	}
	                            
	
}

