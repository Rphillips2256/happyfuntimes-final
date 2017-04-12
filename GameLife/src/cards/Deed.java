package cards;

public class Deed {
	
	private String name;
	private String desc;
	private String realtorCo;
	private int purchasePrice;
	private int insuranceCost;
	
	public Deed(String name, String desc, String realtorCo, int purchasePrice, int insuranceCost) {
		this.name = name;
		this.desc = desc;
		this.realtorCo = realtorCo;
		this.purchasePrice = purchasePrice;
		this.insuranceCost = insuranceCost;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public String getRealtorCo() {
		return realtorCo;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	public int getInsuranceCost() {
		return insuranceCost;
	}
	
}
