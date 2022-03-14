package locklear.HULL;

public abstract class HullSection {
	private String HullType;
	private String StarDestroyerType;
	private int Length;
	private int Height;
	private int Width;
	private int Weight;
	
	HullSection(){
		
	}
	HullSection(String SectionType, String StarDestroyerType, int Length, int Height, int Width, int Weight) {
		this.HullType=SectionType;
		this.StarDestroyerType=StarDestroyerType;
		this.Length=Length;
		this.Height=Height;
		this.Width=Width;
		this.Weight=Weight;
	}
	
	public String getHullType() {
		return HullType;
	}
	public void setHullType(String hullType) {
		HullType = hullType;
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
	public String HullInfo() {
		return String.format("%-8d%-8d%-8d%-8d", getLength(),getHeight(),getWidth(),getWeight());
	}
}
