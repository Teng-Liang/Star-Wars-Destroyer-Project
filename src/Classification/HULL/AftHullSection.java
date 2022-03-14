package locklear.HULL;

import locklear.DECK.Bridge;

public class AftHullSection extends HullSection{
	
	AftHullSection(Bridge bridge){
		super();
		if (bridge.getStarDestroyerType().equals("Imperial_I")) {
			super.setHullType("Aft");
			super.setStarDestroyerType(bridge.getStarDestroyerType());
			super.setLength(700);
			super.setHeight(200);
			super.setWidth(325);
			super.setWeight(550);
		}
		else if (bridge.getStarDestroyerType().equals("Imperial_II")) {
			super.setHullType("Aft");
			super.setStarDestroyerType(bridge.getStarDestroyerType());
			super.setLength(900);
			super.setHeight(275);
			super.setWidth(300);
			super.setWeight(700);
		}
	}

}
