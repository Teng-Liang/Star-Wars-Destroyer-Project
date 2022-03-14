package locklear.HULL;

import locklear.DECK.Bridge;

public class Hull {
	
	private String IDNumber;
	private FwdHullSection sectionFWD;
	private AftHullSection sectionAFT;
	
	public Hull(String IDNumber, String starDestroyer) {
		this.IDNumber=IDNumber;
		if (starDestroyer.equals("Imperial_I")){
			sectionFWD= new FwdHullSection(new Bridge(starDestroyer));
			sectionAFT= new AftHullSection(new Bridge(starDestroyer));
		}
		else if (starDestroyer.equals("Imperial_II")){
			sectionFWD= new FwdHullSection(new Bridge(starDestroyer));
			sectionAFT= new AftHullSection(new Bridge(starDestroyer));
		}
	}
	
	public void displayHullSpecs() {
		System.out.println("________HULL SPECIFICATIONS\nHull Number: "+IDNumber);
        System.out.printf("%24s%-8s%-8s%-8s%-6s\n", "","Length","Height","Width","Weight");
        System.out.printf("%-24s%s\n","Forward Hull:",sectionFWD.HullInfo());
        System.out.printf("%-24s%s\n","Aft Hull:",sectionAFT.HullInfo());
      
		
	}

}
