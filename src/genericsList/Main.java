package genericsList;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		
		List<Carro> carros = new ArrayList<Carro>();
		carros.add(new Uno(18352.12,2006L,"Fiat"));
		carros.add(new Civic(52000.31,2008L,"Honda"));
		carros.add(new Gol(38622.48,2010L,"VolksWagen"));
		
		System.out.println(carros);
		
		
		
		
		
		

	}

}
