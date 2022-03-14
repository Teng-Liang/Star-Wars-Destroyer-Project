package locklear.ENGINE;

public class Engine_C extends ShipEngine{
	
	Engine_C(String starDestroyerType){
		super();
		if (starDestroyerType.equals("Imperial_I")) {
			super.setEngineType("C");
			super.setStarDestroyerType(starDestroyerType);
			super.setLength(225);
			super.setHeight(75);
			super.setPower(15000000);
			super.setWeight(125);
		}
		else if (starDestroyerType.equals("Imperial_II")) {
			super.setEngineType("C");
			super.setStarDestroyerType(starDestroyerType);
			super.setLength(275);
			super.setHeight(80);
			super.setPower(17000000);
			super.setWeight(125);
		}
	}

}
