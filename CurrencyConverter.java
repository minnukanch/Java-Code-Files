public class CurrencyConverter {
	//int rupee = 63; 
    //int dirham = 3;  
    //int real = 3;   
   
    //int chilean_peso = 595;
    //int mexican_peso = 18;   
    //int _yen = 107;
    //int $australian = 2; 
	
	double[] ExchangeRates = new double[] {63, 3, 3, 595, 18, 107, 2};
    
	
	void SetExchangeRates(double[] rates) {
		ExchangeRates = rates;
	}
	
	double getExchangerates(int countryindex) {
		return ExchangeRates[countryindex];
	}
	
	double ComputeTransferAmount (int countryindex, double amount) {
		return amount * getExchangerates(countryindex);
	}
	
	 void updateExchangeRates (int countryindex, double NewVal) {
		 ExchangeRates[countryindex] = NewVal;
	}
	
	/* void printCurrencies () {
		System.out.println("rupee: " + ExchangeRates[0]);
		System.out.println("dirham: " + ExchangeRates[1]);
		System.out.println("real: " + ExchangeRates[2]);
		System.out.println("chilean_peso: " + ExchangeRates[3]);
		System.out.println("mexican_peso: " + ExchangeRates[4]);
		System.out.println("_yen: " + ExchangeRates[5]);
		System.out.println("rupee: " + ExchangeRates[ExchangeRates.length - 1]);
	} */
			
	/* void printCurrencies() {
		System.out.println("rupee: " + rupee);   
		System.out.println("$australian: " + $australian);
		System.out.println("$dirham: " + dirham);
		System.out.println("real: " + real);
		System.out.println("chilean_peso: " + chilean_peso);
		System.out.println("mexican_peso: " + mexican_peso);
		System.out.println("_yen: " + _yen);
		System.out.println("Rupee: " + Rupee);
		
	} */
	
	public static void main(String[] args) {
		CurrencyConverter cc = new CurrencyConverter();
		
		}
}


	
		