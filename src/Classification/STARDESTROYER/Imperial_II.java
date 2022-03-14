package locklear.STARDESTROYER;

import locklear.DECK.Deck;
import locklear.ENGINE.Engine;
import locklear.HULL.Hull;

public class Imperial_II extends StarDestroyer{
	
	public Imperial_II(String ShpNumber, String ShpName) {
		super();
		setShpNumber(ShpNumber);
		setShpName(ShpName);
		setShpClass("Imperial_II");
		setShpCrew(12000);
		setShpHulls(new Hull("H1",getShpClass()));
		setShpDeck(new Deck("D1",getShpClass()));
		setShpEngines(new Engine("E1",getShpClass()));
	}

	@Override
	public void navigatesToPosition(String p) {
		System.out.println("Navigating to Position "+p);
		
	}

}
