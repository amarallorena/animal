package Animal;

public class Principal {

	public static void main(String[] args) {
	
		Cachorro cachorro = new Cachorro ("Luna","Fêmea","SRD");
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println("--------------------");

		
		Gato gato = new Gato ("Garfield","Macho","Perça");
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
		
		System.out.println("--------------------");
		
		Leão leao = new Leão ("Simba","Macho","Leão-africano");
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		
		System.out.println("--------------------");
		
		Lobo lobo = new Lobo ("Shenzi","Fêmea","Lobo-cinzento");
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
	lobo.emitirSom();
		
		System.out.println("--------------------");
		
	Tigre tigre = new Tigre ("Tigrão","Macho","Tigre de bengala");
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();
		
		
	}

}
