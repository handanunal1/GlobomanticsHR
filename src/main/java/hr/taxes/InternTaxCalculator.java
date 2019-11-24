package hr.taxes;

import hr.personnel.Employee;
import hr.personnel.Intern;

public class InternTaxCalculator  implements TaxCalculator {


	private final int BASE_HEALTH_INSURANCE = 100;
	private final int RETIREMENT_TAX_PERCENTAGE = 5;
	private final int INCOME_TAX_PERCENTAGE = 16;
	@Override
	public double calculate(Employee employee) {
		int monthlyIncome = employee.getMonthlyIncome();

			if (monthlyIncome < 350)
				return 0;
			else {
				return (monthlyIncome * INCOME_TAX_PERCENTAGE) / 100;
			}

	}

}
