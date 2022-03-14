package locklear.HULL;

import locklear.DECK.Bridge;

public class FwdHullSection extends HullSection{
	
	FwdHullSection(Bridge bridge){
		super();
		if (bridge.getStarDestroyerType().equals("Imperial_I")) {
			super.setHullType("Fwd");
			super.setStarDestroyerType(bridge.getStarDestroyerType());
			super.setLength(900);
			super.setHeight(100);
			super.setWidth(75);
			super.setWeight(350);
		}
		else if (bridge.getStarDestroyerType().equals("Imperial_II")) {
			super.setHullType("Fwd");
			super.setStarDestroyerType(bridge.getStarDestroyerType());
			super.setLength(900);
			super.setHeight(100);
			super.setWidth(200);
			super.setWeight(400);
		}
	}

}
