package store;

public class Cashier extends AbstractStoreEmployee {
	int transactionDone;
	
	public Cashier(int transactionDone, double numberOfHoursWorked, double hourlyRate, String storeDetails, double basePay, String empName) {
		super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, empName);
		this.transactionDone=transactionDone;
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return super.getBasePay() + super.getNumberOfHoursWorked() * super.getHourlyRate();
	}

	@Override
	public boolean checkPromotionEligibility() {
		// TODO Auto-generated method stub
		if (transactionDone >= 400) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
     * Returns the total commission of the Sales Associate in dollars.
     *
     * @return - This method returns the commission in dollars.
     */
    @Override
    public double calculateCommission() {
        if (transactionDone > 400) {
            return super.getBasePay() * COMMISSION_RATE;
        } else {
            return 0.0;
        }
    }

	/**
	 * Abstract method dari interface Employee.
	 * @return - boolean apakah yang bersangkutan berhak mendapat cuti.
	 * */
	@Override
	public boolean layakCuti() {
		// TODO Auto-generated method stub
		if (transactionDone >= 400 && super.getNumberOfHoursWorked() > 160) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Abstract method dari interface Store.
	 * @return - nominal jaminan sosial yang berhak didapat.
	 * */
	@Override
	public double hitungJaminanSosial() {
		// TODO Auto-generated method stub
		if (transactionDone > 300 && super.getNumberOfHoursWorked() > 100) {
			return 0.25 * calculatePay();
		} else {
			return 0.10 * calculatePay();
		}
	}
	
	/**
	 * Abstract method dari abstract class AbstractStoreEmployee.
	 * @return - nominal THR yang akan didapat.
	 * */
	@Override
	public double hitungJumlahTHR(double basePay) {
		// TODO Auto-generated method stub
		return 0.5 * basePay + (transactionDone*100)/400 * basePay;
	}
}