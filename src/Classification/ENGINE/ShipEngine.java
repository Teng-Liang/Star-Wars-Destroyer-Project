package locklear.ENGINE;

public class ShipEngine {
	String engineType;
	String starDestroyerType;
	int length;
	int height;
	int power;
	int weight;
	
	ShipEngine(){
		
	}
	
	ShipEngine(String engineType, String starDestroyerType, int length, int height, int power, int weight){
		this.engineType=engineType;
		this.starDestroyerType= starDestroyerType;
		this.length=length;
		this.height=height;
		this.power=power;
		this.weight=weight;
	}
	

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getStarDestroyerType() {
		return starDestroyerType;
	}

	public void setStarDestroyerType(String starDestroyerType) {
		this.starDestroyerType = starDestroyerType;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}


	public String engineInfo() {
		return String.format("%-8d%-8d%,-15d%-8d", getLength(),getHeight(),getPower(),getWeight());
	}
}
