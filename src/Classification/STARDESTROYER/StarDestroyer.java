package locklear.STARDESTROYER;

import locklear.DECK.Deck;
import locklear.ENGINE.Engine;
import locklear.HULL.Hull;
import locklear.INTERFACES.Maneuvers;

public abstract class StarDestroyer implements Maneuvers{
	private String ShpNumber;
	private static final String ShpType = "Star Destroyer";
	private String ShpName;
	private String ShpClass;
	private int ShpCrew;
	private Hull ShpHulls;
	private Deck ShpDeck;
	private Engine ShpEngines;
	
	public StarDestroyer() {
		
	}
	public StarDestroyer(String ShpNumber, String ShpName) {
		this.ShpNumber=ShpNumber;
		this.ShpName=ShpName;
	}
	
	public String getShpNumber() {
		return ShpNumber;
	}
	public void setShpNumber(String shpNumber) {
		ShpNumber = shpNumber;
	}
	public String getShpName() {
		return ShpName;
	}
	public void setShpName(String shpName) {
		ShpName = shpName;
	}
	public String getShpClass() {
		return ShpClass;
	}
	public void setShpClass(String shpClass) {
		ShpClass = shpClass;
	}
	public int getShpCrew() {
		return ShpCrew;
	}
	public void setShpCrew(int shpCrew) {
		ShpCrew = shpCrew;
	}
	public Hull getShpHulls() {
		return ShpHulls;
	}
	public void setShpHulls(Hull shpHulls) {
		ShpHulls = shpHulls;
	}
	public Deck getShpDeck() {
		return ShpDeck;
	}
	public void setShpDeck(Deck shpDeck) {
		ShpDeck = shpDeck;
	}
	public Engine getShpEngines() {
		return ShpEngines;
	}
	public void setShpEngines(Engine shpEngines) {
		ShpEngines = shpEngines;
	}
	public static String getShpType() {
		return ShpType;
	}
	public void displayShipInfo() {
		System.out.println("_________IMPERIAL STAR DESTROYER "+getShpName());
		System.out.println("Ship Number "+ShpNumber);
		System.out.println("Ship Class "+ShpClass);
		System.out.printf("Crew:  %,d\n",ShpCrew);
		System.out.println();
		ShpHulls.displayHullSpecs();
		System.out.println();
		ShpDeck.displayDeckSpecs();
		System.out.println();
		ShpEngines.displayEngineSpecs();
		
	}

}
