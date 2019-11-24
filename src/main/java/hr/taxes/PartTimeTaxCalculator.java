package hr.taxes;

import hr.personnel.Employee;
import hr.personnel.PartTimeEmployee;

public class PartTimeTaxCalculator implements TaxCalculator {

	private final int BASE_HEALTH_INSURANCE = 100;
	private final int RETIREMENT_TAX_PERCENTAGE = 5;
	private final int INCOME_TAX_PERCENTAGE = 16;

	@Override
	public double calculate(Employee employee) {
		int monthlyIncome = employee.getMonthlyIncome();

		return BASE_HEALTH_INSURANCE + (monthlyIncome * 10) / 100 + (monthlyIncome * RETIREMENT_TAX_PERCENTAGE) / 100
				+ (monthlyIncome * INCOME_TAX_PERCENTAGE) / 100;

	}

}
