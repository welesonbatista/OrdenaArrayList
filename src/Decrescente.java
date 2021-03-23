package src;
import java.util.Comparator;

public class Decrescente implements Comparator<Computador> {

	@Override
	public int compare(Computador pc1, Computador pc2) {
		if (pc1.getPreco()> pc2.getPreco()) {
			return -1;
		}
		return 1;
	}

}