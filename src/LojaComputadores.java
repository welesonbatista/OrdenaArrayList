package src;

import java.util.ArrayList;
import java.util.Collections;
public class LojaComputadores {

	Computador moba = new Computador ("i5","1TB", "1x8GB 2666Mhz",2000.0);
	Computador fps = new Computador ("i5","2TB", "2x8GB 2666Mhz",2800.0);
	Computador gamer = new Computador ("i9","4TB", "4x8GB 4000Mhz",9000.0);
	Computador home = new Computador ("i3","1TB", "1x8GB 1600Mhz",1500.0);
	Computador work = new Computador ("i5","2TB", "1x8GB 1600Mhz",2300.0);
	Computador dev = new Computador ("i7","4TB", "2xGB 2666Mhz",5000.0);
	
	ArrayList <Computador> lista = new ArrayList();
	
	
	void Normal () {
		lista.add(moba);
		lista.add(fps);
		lista.add(gamer);
		lista.add(home);
		lista.add(work);
		lista.add(dev);
		
		System.out.print(lista.toString());	
	}
	void Crescente() {
		lista.add(moba);
		lista.add(fps);
		lista.add(gamer);
		lista.add(home);
		lista.add(work);
		lista.add(dev);
		
		Collections.sort(lista, new Crescente());
		System.out.print(lista.toString());	
	}
	void Decrescente() {
		lista.add(moba);
		lista.add(fps);
		lista.add(gamer);
		lista.add(home);
		lista.add(work);
		lista.add(dev);
		
		Collections.sort(lista, new Decrescente());
		System.out.print(lista.toString());	
	}
}
