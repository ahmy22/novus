


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class junit {
	
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();

	@Test
	   public void testYearlySalaryExample() {
		
		   employee.setName("Ahmad");
		   employee.setAge(22);
		   employee.setMonthlySalary(3000);
		   
		   double salary = empBusinessLogic.calculateYearlySalary(employee);
		   Assert.assertEquals(36000, salary);
	   }

}
