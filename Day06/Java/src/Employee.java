
public class Employee {
	private int eId;
	private String eName;
	private String eCity;
	private float eSal;
	
	public Employee() {
		
	}
	static {
		
	}
	
	{
		
	}

	public void getData(int eId,String eName,String eCity,float eSal) {
		this.eId=eId;
		this.eName=eName;
		this.eCity=eCity;
		this.eSal=eSal;
	}
	public void displayData() {
		System.out.println(eId);
		System.out.println(eName);
		System.out.println(eCity);
		System.out.println(eSal);

	}
	
	public void seteId(int eId) {
		this.eId=eId;
	}
	public int geteId() {
		return eId;
	}
	
	public void seteName(String eName) {
		this.eName=eName;
	}
	public String geteName() {
		return eName;
	}
	
	public String geteCity() {
		return eCity;
	}
	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
	
	public float geteSal() {
		return eSal;
	}
	public void seteSal(float eSal) {
		this.eSal = eSal;
	}
	

}
