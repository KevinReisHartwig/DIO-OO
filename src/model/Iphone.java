package model;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{

    @Override
    public void pausar() {
        System.out.println("Música pausada");
        
    }

    @Override
    public void selectionarMusica(String musica) {
        System.out.println("Mudando para música "+ musica);
        
    }

    @Override
    public void tocar() {
        System.out.println("play na músuca");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("nova Aba adicionada");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página foi atualizada!");
        
    }

    @Override
    public void exibePagina(String url) {
        System.out.println("Exibindo a página " + url);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o " + numero);     
    }
    

}