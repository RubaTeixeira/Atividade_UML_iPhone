package iPhone.device;

import iPhone.service.AparelhoTelefonico;
import iPhone.service.NavegadorInternet;
import iPhone.service.ReprodutorMusical;

public class Device implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos para ReprodutorMusical
    @Override
    public void tocar() {
        // Implementação
        System.out.println("Tocar música.");
    }

    @Override
    public void pausar() {
        // Implementação
        System.out.println("Pausar música.");
    }

    @Override
    public void selecionarMusica() {
        // Implementação
        System.out.println("Selecionar música.");
    }

    // Implementação dos métodos para AparelhoTelefonico
    @Override
    public void ligar() {
        // Implementação
        System.out.println("Ligar.");
    }

    @Override
    public void atender() {
        // Implementação
        System.out.println("Atender.");
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação
        System.out.println("Iniciar correio de voz.");
    }

    // Implementação dos métodos para NavegadorInternet
    @Override
    public void exibirPagina() {
        // Implementação
        System.out.println("Exibir página.");
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação
        System.out.println("Abrir nova aba.");
    }

    @Override
    public void atualizarPagina() {
        // Implementação
        System.out.println("Atualizar.");
    }
}