package spaces;
import game.Player;

public class BranchSpace extends ActiveSpace {

	private int branchNo;

	public BranchSpace(int spaceNo, String desc, Player occ, int branchNo) {
		super(spaceNo, desc, occ);
		this.branchNo = branchNo;
	}

	public int getBranchNo() {
		return branchNo;
	}
	
	public void doInstruction() {
		Player temp = super.getOcc();
		switch(super.getDesc()) {
		case "START COLLEGE (Borrow $40,000) or START CAREER": 
			
		}
	}

}
