package store;

public class Cashier extends AbstractStoreEmployee {
	int transactionDone;
	
	public Cashier(int taskDone, double numberOfHoursWorked, double hourlyRate,
            String storeDetails, double basePay, String adminName) {
		super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, adminName);
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return super.getBasePay() + super.getNumberOfHoursWorked() * super.getHourlyRate();
	}

	@Override
	public boolean checkPromotionEligibility() {
		// TODO Auto-generated method stub
		if (transactionDone >= 120) {
			return true;
		} else {
			return false;
		}
	}
}