public class currencyconverter {
	
	// Currency exchange rates different currencies relative to 1 US dollar
	double[] exchangeRates;
	
	void setExchangeRates(double[] exchangeRates){
		exchangeRates = rates;
	}
	
	void updateExchangeRates(int arrayIndex, double newVal){
		exchangeRates[arrayIndex] = newVal;
	}
	
	double GetExchangeRates(int arrayIndex){
		return exchangeRates[arrayIndex];
	}
	// Money Transfer Service 
	
	double computeTransferAmount(int arrayIndex, double amount){
		return amount * GetExchangeRates[arrayIndex];
	}
	
	void printCurrencies() {
		     System.out.println("\nrupee: " + exchangeRates[0]);
    	     System.out.println("dirham: " + exchangeRates[1]);
    	     System.out.println("real: " + exchangeRates[2]);
    	     System.out.println("chilean_peso: " + exchangeRates[3]);
    	     System.out.println("mexican_peso: " + exchangeRates[4]);
    	     System.out.println("_yen: " + exchangeRates[5]);
    	     System.out.println("$australian: " + exchangeRates[exchangeRates.length-1]);
		
public static void main(String[] args) {
		CurrencyConverter cc = new CurrencyConverter();
        cc.printCurrencies();
		
		double[] rates = {63.0, 3.0, 595.5, 18.0, 107.0, 2.0};
		cc.setExchangeRates(rates)
		
		rates = new double[]{63.0, 5.0, 595.5, 18.0, 107.0, 2.0}
		cc.setExchangeRates(rates);
		
		cc.updateExchangeRates(0, 66);
		cc.printCurrencies();
		
		double amount = cc.computeTransferAmount(0,1000);
		System.out.println("Transfer amount: " + amount);
		
		}
}
