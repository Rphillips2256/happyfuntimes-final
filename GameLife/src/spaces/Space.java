package spaces;
import game.Player;

public class Space {

	private int spaceNo;
	private String desc;
	private Player occ;
	
	public Space(int spaceNo, String desc, Player occ){
		this.spaceNo = spaceNo;
		this.desc = desc;
		this.occ = occ;
	}

	public int getSpaceNo(){
		return spaceNo;
	}

	public String getDesc() {
		return desc;
	}

	public Player getOcc() {
		return occ;
	}

	public void setOcc(Player occ) {
		this.occ = occ;
	}

}