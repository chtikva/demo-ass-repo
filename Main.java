public class Main 
{
	public static void main(String[] args) {
		
		Mathima m1 = new Mathima("Java", 15);
		Mathima m2 = new Mathima("HTML", 12);
		Mathima m3 = new Mathima("Python", 16);
		
		Metaptyxiakos mf1 = new Metaptyxiakos("Georgiou", 2001, "25/12", m1, 1300);
		
		System.out.println (mf1.getName());
		System.out.println (mf1.getMathimaName());
		
		Foititis f2 = new Foititis("Papadopoulos", 2000, "25/22", m2);
		
		f2.addMathima(m1);
		f2.addMathima(m2);
		f2.addMathima(m3);
		
		System.out.println(f2.getName());
		for(int i = 0; i < f2.mathimata.size(); i++) {   
		    System.out.print(f2.getMathima(i).getName());
		    System.out.print(" ");
		}  
	}

}
