package locklear.DECK;

public class ShipDeck {
	private String DeckType;
	private String StarDestroyerType;
	private int Length;
	private int Height;
	private int Width;
	private int Weight;
	
	
	public ShipDeck() {
		DeckType="";
		StarDestroyerType="";
		Length=0;
		Height=0;
		Width=0;
		Weight=0;
	}
	
	public ShipDeck(String DeckType, String StarDestroyerType, int Length, int Height, int Width, int Weight) {
		this.DeckType=DeckType;
		this.StarDestroyerType=StarDestroyerType;
		this.Length=Length;
		this.Height=Height;
		this.Width=Width;
		this.Weight=Weight;
	}
	
	public String getDeckType() {
		return DeckType;
	}
	public void setDeckType(String deckType) {
		DeckType = deckType;
	}
	public String getStarDestroyerType() {
		return StarDestroyerType;
	}
	public void setStarDestroyerType(String starDestroyerType) {
		StarDestroyerType = starDestroyerType;
	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	} 
	
	public String DeckInfo() {
	
	    return String.format("%-24s%-8d%-8d%-8d%-8d", DeckType.toUpperCase()+":", getLength(),getHeight(),getWidth(),getWeight());
	}
}
