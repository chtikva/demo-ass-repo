public class Ergasia {
	private String aName;
	private int aSemester;
	public Kathigitis aEpopteuei;

	public Ergasia(String pName) {
		aName = pName;
	}

	public Ergasia(String pName, int pSemester, Kathigitis pEpopteuei) {
		aName = pName;
		aSemester=pSemester;
		aEpopteuei=pEpopteuei;
	}

	public Ergasia(String pName, int pSemester) {
		aName = pName;
		aSemester=pSemester;

	}

	public String getName() {
		return this.aName;
	}

	public void setName(String pName) {
		this.aName = pName;
	}

	public int getSemester() {
		return this.aSemester;
	}

	public void setSemester(int pSemester) {
		this.aSemester = pSemester;
	}
}
