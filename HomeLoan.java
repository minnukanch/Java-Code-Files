public class HomeLoan {
	
	static boolean ifStatement () {
		boolean approved;
	
		int age = 24;
		int salary = 45000;
		boolean hasBadCredit = false;
		
		if (age >= 25 && age <= 35 && salary >= 50000) {
			
			approved = true;
			
			System.out.println(" age >= 25 && age <= 35 && salary >= 50,000:"); 
			
			return true;
			
			
		}else if (age > 35 && age <= 45 && salary >= 70000){
		
			approved = true;
			
			System.out.println(" age > 35 && age <= 45 && salary >= 70000 :");

		    return true;
			
		}else if (age > 45 && age <= 55 && salary >= 90000) {
		
			approved = true;
			
			System.out.println(" age > 45 && age <=55 && salary >= 90000: "); 
			
			return true;
			
			
		}else {
			if (age > 55 && !hasBadCredit) {
				approved = true;
				
				System.out.println(" age > 55 && !hasBadCredit: ");
				
				return true;
				
			} 
			
			System.out.println("Going out: ");
			return false;
		}
		
		//System.out.println("outside if");
		// return approved 
		// if(bookmark.iskidFriendlyStatus()
			&& !bookmark.getKidFriendStatus().equals(
	
		
	}
				
public static void main(String[] args) {	

	   ifStatement();			
  }       
 }