package Users;

import iPhone.device.Device;
import iPhone.service.AparelhoTelefonico;
import iPhone.service.NavegadorInternet;
import iPhone.service.ReprodutorMusical;

public class Interacoes {
    public static void main (String[] args){
      Device device = new Device();

      AparelhoTelefonico aparelhoTelefonico = device;

      aparelhoTelefonico.ligar();
      aparelhoTelefonico.atender();
      aparelhoTelefonico.iniciarCorreioVoz();      
      
      NavegadorInternet navegadorInternet = device;

      navegadorInternet.adicionarNovaAba();
      navegadorInternet.atualizarPagina();
      navegadorInternet.exibirPagina();

      ReprodutorMusical reprodutorMusical = device;

      reprodutorMusical.selecionarMusica();
      reprodutorMusical.tocar();
      reprodutorMusical.pausar();

    }
}
