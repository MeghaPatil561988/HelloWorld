
public class PrivateAttributes
{
	private int employeeId;
    private String name; 
	private String department;
	
	
	
	
	
	@Override
	public String toString() {
		return "PrivateAttributes [employeeId=" + employeeId + ", name=" + name + ", department=" + department + "]";
	}

	
	
	public PrivateAttributes(int employeeId, String name, String department) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
	}



	



	public PrivateAttributes() {
		// TODO Auto-generated constructor stub
	}



	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
