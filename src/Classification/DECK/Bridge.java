package locklear.DECK;

public class Bridge extends ShipDeck  {
	
	
	public Bridge(String starDestroyerType) {
		super();
		super.setStarDestroyerType(starDestroyerType);
		super.setDeckType("Bridge");
		if (starDestroyerType.equals("Imperial_I")) {
			super.setLength(150);
			super.setHeight(20);
			super.setWidth(100);
			super.setWeight(75);
		}
		else if (starDestroyerType.equals("Imperial_II")) {
			super.setLength(200);
			super.setHeight(22);
			super.setWidth(150);
			super.setWeight(100);
		}
	}
	
	
}
