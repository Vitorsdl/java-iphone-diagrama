package aparelho;

public interface AparelhoTelefonico {
	
	public static void ligar() {
		System.out.println("Ligando...");
	}
	
	public static void desligar() {
		System.out.println("Chamada encerrada.");
	}
	
	public static void atender() {
		System.out.println("Ligação atendida.");
	}
	
	public static void iniciarCorreioDeVoz() {
		System.out.println("Correio de voz aberto.");
	}
	
	public static void listaContatos() {
		System.out.println("Contatos listado.");
	}
	
	public static void contatosFavoritos() {
		System.out.println("Contatos favoritos listados.");
	}
	
	public default void chamadasRecentes() {
		System.out.println("Chamdas recentes listadas.");
	}

}
