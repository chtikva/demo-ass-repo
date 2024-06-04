import java.util.*;
public class Foititis {
	private String aName;
	private int aYearofBirth;
	private String aAM;
	private Mathima aParakolouthei;
	ArrayList<Mathima> mathimata = new ArrayList<Mathima>();

	public Foititis(String pName) {
		aName = pName;
	}

	public Foititis(String pName, int pYearofBirth) {
		aName = pName;
		aYearofBirth = pYearofBirth;
	}

	public Foititis(String pName, int pYearofBirth, String pAM) {
		aName = pName;
		aYearofBirth = pYearofBirth;
		aAM = pAM;
	}

	public Foititis(String pName, int pYearofBirth, String pAM, Mathima pParakolouthei) {
		aName = pName;
		aYearofBirth = pYearofBirth;
		aAM = pAM;
		aParakolouthei = pParakolouthei;
	}
	
	public String getName() {
		return this.aName;
	}

	public void setName(String pName) {
		this.aName = pName;
	}

	public int getYearofBirth() {
		return this.aYearofBirth;
	}

	public void setYearofBirth(int pYearofBirth) {
		this.aYearofBirth = pYearofBirth;
	}

	public String getAM() {
		return this.aAM;
	}

	public void setAM(String pAM) {
		this.aAM = pAM;
	}

	public Mathima getaParakolouthei() {
		return aParakolouthei;
	}

	public void setaParakolouthei(Mathima aParakolouthei) {
		this.aParakolouthei = aParakolouthei;
	}
	
	public void addMathima (Mathima m1) {
		mathimata.add(m1);
	}
	
	public Mathima getMathima (int i) {
		return mathimata.get(i);
	}
	
	public void deleteMahtima (int i) {
		mathimata.remove(i);
	}
	
	public void printSize() {
		System.out.println(mathimata.size());
	}
	
	public String getMathimaName() {
		return this.aParakolouthei.getName();
	}
}