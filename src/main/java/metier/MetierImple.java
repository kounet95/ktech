package metier;

import dao.IDAO;

public class MetierImple implements Imetier{
private IDAO ida;  
	public IDAO getIda() {
	return ida;
}
public void setIda(IDAO ida) {
	this.ida = ida;
}
	public double calcule() {
		double nb= ida.getValues();
		return nb*6;
	}

}
