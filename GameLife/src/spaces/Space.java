package spaces;
import game.Player;

public class Space {

	private int spaceNo;
	private enum spaceColor;
	private String desc;
	private Player occ;
	
	public Space(int spaceNo, enum color, String desc, Player occ) {
		this.spaceNo = spaceNo;
		this.color = color;
		this.desc = desc;
		this.occ = occ;
	}

	public int getSpaceNo() {
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