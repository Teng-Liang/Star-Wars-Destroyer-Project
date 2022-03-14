package locklear.ENGINE;




public class Engine {
	
	private String IDNumber;
	private ShipEngine[] engines;
	
	public Engine(String IDNumber, String starDestroyer) {
		this.IDNumber=IDNumber;
		engines=new ShipEngine[3];
		engines[0]=new Engine_S(starDestroyer);
		engines[1]=new Engine_C(starDestroyer);
		engines[2]=new Engine_S(starDestroyer);
	}
	
	public void displayEngineSpecs() {
		System.out.println("________ENGINE SPECIFICATIONS\nEngine Number: "+IDNumber);
        System.out.printf("%24s%-8s%-8s%-15s%-6s\n", "","Length","Height","Power","Weight");
        System.out.println(String.format("%-24s%s","Engine "+engines[0].getEngineType()+"1:",engines[0].engineInfo()));
        System.out.println(String.format("%-24s%s","Engine "+engines[1].getEngineType()+":",engines[1].engineInfo()));
        System.out.println(String.format("%-24s%s","Engine "+engines[2].getEngineType()+"2:",engines[2].engineInfo()));
	}

}
