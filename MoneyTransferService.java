public class MoneyTransferService {
	
	CurrencyConverter cc = new CurrencyConverter();
	
	double ComputetransferAmount (int countryindex, double amount) {
		return cc.ComputeTransferAmount(countryindex, amount);
	}
	
	double ComputeTransferFee (int countryindex, double amount){
		double transferAmount = ComputetransferAmount(countryindex, amount);
		double transferFee = transferAmount * 0.02;
		return transferFee;
	}

public static void main(String[] args) {
	
	MoneyTransferService transferservice = new MoneyTransferService();
	
	double transferamount = transferservice.ComputetransferAmount(0, 1000);
	double transferfee = transferservice.ComputeTransferFee(0, 1000);
	
	System.out.println("Transfer Amount: " + transferamount);
	System.out.println("Transfer Fee: " + transferfee);

	}
}

	