package locklear.DECK;

public class TopDeck extends ShipDeck{
	
	
		public TopDeck(String starDestroyerType) {
			super();
			super.setStarDestroyerType(starDestroyerType);
			super.setDeckType("Top Deck");
			if (starDestroyerType.equals("Imperial_I")) {
				super.setLength(300);
				super.setHeight(30);
				super.setWidth(250);
				super.setWeight(125);
			}
			else if (starDestroyerType.equals("Imperial_II")) {
				super.setLength(350);
				super.setHeight(34);
				super.setWidth(300);
				super.setWeight(150);
			}
		}
		                            
		
	}


