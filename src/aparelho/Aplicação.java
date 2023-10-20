package aparelho;

public class Aplicação implements Iphone, Ipad, AparelhoTelefonico, NavegadorInternet{
	public static void main(String[] args) {
		
		Iphone.abrirfotos();
		Iphone.abrirgoogleMaps();
		Iphone.abriremail();
		
		Ipad.tocarMusica();
		
		Iphone.abrirCalendario();
		
		Ipad.buscarMusica();
		Ipad.pausar();
		
		AparelhoTelefonico.atender();
		AparelhoTelefonico.desligar();
		AparelhoTelefonico.iniciarCorreioDeVoz();
		
		NavegadorInternet.buscarNaInternet();
		NavegadorInternet.atualizarPagina();
		NavegadorInternet.adicionarNovaAba();
		NavegadorInternet.exibirPagina();
		
		AparelhoTelefonico.listaContatos();
		AparelhoTelefonico.contatosFavoritos();
		
		Iphone.abrirSms();
		Iphone.abrirwidgets();
		
	}

}
