package src;

public class Computador {

	private String processador;
	private String tamanhoHd;
	private String memoriaRam;
	private double preco;
	
	
	public Computador(String processador, String tamanhoHd, String memoriaRam, double preco) {
		this.processador = processador;
		this.tamanhoHd = tamanhoHd;
		this.memoriaRam = memoriaRam;
		this.preco = preco;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getTamanhoHd() {
		return tamanhoHd;
	}

	public void setTamanhoHd(String tamanhoHd) {
		this.tamanhoHd = tamanhoHd;
	}

	public String getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
        return "\nProcessador: " + processador + " HD: " + tamanhoHd + " RAM: " + memoriaRam + " Preço: R$ " + preco ;
	}
}