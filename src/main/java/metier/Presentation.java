package metier;

import dao.ImplementDAO;

public class Presentation {

	public static void main(String[] args) {
		ImplementDAO dao = new ImplementDAO();
		MetierImple metie= new MetierImple();
		metie.setIda(dao);
		System.out.println(metie.calcule());

	}

}
