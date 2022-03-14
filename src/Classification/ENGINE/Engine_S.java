package locklear.ENGINE;

public class Engine_S extends ShipEngine{
	
	Engine_S(String starDestroyerType){
		super();
		if (starDestroyerType.equals("Imperial_I")) {
			super.setEngineType("S");
			super.setStarDestroyerType(starDestroyerType);
			super.setLength(100);
			super.setHeight(50);
			super.setPower(8000000);
			super.setWeight(100);
		}
		else if (starDestroyerType.equals("Imperial_II")) {
			super.setEngineType("C");
			super.setStarDestroyerType(starDestroyerType);
			super.setLength(115);
			super.setHeight(60);
			super.setPower(9000000);
			super.setWeight(100);
		}
	}

}
