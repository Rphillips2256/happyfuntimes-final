package cards;

public class Salary {
	
	private int salary;
	private int taxes;
	private boolean degReq;
	
	public Salary(int salary, int taxes, boolean degReq) {
		this.salary = salary;
		this.taxes = taxes;
		this.degReq = degReq;
	}

	public int getSalary() {
		return salary;
	}

	public int getTaxes() {
		return taxes;
	}

	public boolean isDegReq() {
		return degReq;
	}
	
}
