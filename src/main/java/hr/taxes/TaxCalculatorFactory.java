package hr.taxes;

import hr.personnel.Employee;
import hr.personnel.FullTimeEmployee;
import hr.personnel.Intern;
import hr.personnel.PartTimeEmployee;

public class TaxCalculatorFactory {
	public static TaxCalculator create(Employee employee) throws Exception {

		if (employee instanceof FullTimeEmployee) {
			return new FullTimeTaxCalculator();
		} else if (employee instanceof PartTimeEmployee) {
			return new PartTimeTaxCalculator();
		} else if (employee instanceof Intern) {
			return new InternTaxCalculator();
		}

		throw new Exception("Invalid employee type");
	}

}
