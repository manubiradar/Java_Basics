package Java_Lerning;

public class IfElse {

	public static void main(String[] args) {
		int testScore = 12;
		if(testScore<35 && testScore>=0) 
			System.out.println("C grade");
		    
			else
				if(testScore>=35 && testScore<=60) 
			       System.out.println("B grade");
		           
				else
					if(testScore>=61 && testScore<=75) 
						System.out.println("B+ grade");
					
					else
						if (testScore>=76 && testScore<=85) 
							System.out.println("A- grade");
						
						else
							if(testScore>=86 && testScore<=100) 
								System.out.println("A+ grade");
							else
								if(testScore>100)
									System.out.println("invalid");
								else
									if(testScore<0)
										System.out.println("invalid");
							
				else 
					System.out.println("A+ grade");
				

	}

}
