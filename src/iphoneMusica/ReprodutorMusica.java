package iphoneMusica;

public class ReprodutorMusica {

	String musicaAtual;
	
	public void selecionarMusica(String nomeMusica) {
		System.out.println("você selecionou a musica " + nomeMusica);
		
	}
	

	public void tocar() {
	  System.out.println("está tocando a musica");
		
	}
	
	
	public void pausar() {
	 System.out.println("você pausou a musica");	
	}
	
	
	public static void main(String[] args) {
		ReprodutorMusica reprodutorMusica = new ReprodutorMusica();
		
		reprodutorMusica.selecionarMusica("Faroeste Caboclo");
		reprodutorMusica.pausar();
		reprodutorMusica.pausar();
		
		
	}
	
}
