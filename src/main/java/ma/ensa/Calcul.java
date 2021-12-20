package  ma.ensa;
public class Calcul {
	
	CalculService calculService;
	
	public Calcul(CalculService calculService) {
	this.calculService = calculService;
	}
	
	
    public Calcul() {
		super();
	}


public double calculNote(int m1, int m2) {

	return (m1 + m2)/2;
}

	public double compare(int x, int y) {

	if (x==y)
		return (x+x)/y;
	else
		return (x+y)/x;

	}

	public double calculSomme(int x, int y) {

	  int var=0;
	  return calculNote(calculService.calculLog(x,var), calculService.calculLog(y,var));


	}

}
