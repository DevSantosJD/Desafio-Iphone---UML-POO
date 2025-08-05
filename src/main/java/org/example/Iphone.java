package org.example;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {


    @Override
    public void efetuarLigacao(String numero) {
        System.out.println("Efetuando ligação - " + numero);

    }

    @Override
    public void correioVoz() {
        System.out.println("Iniciando correio de voz, aguarde...");

    }

    @Override
    public void atenderLigacao(){
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Iniciando musica... tocando!");

    }

    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);

    }

    @Override
    public void exibirPaginaWeb(String url) {
        System.out.println("Exibindo página: " + url);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");

    }

    @Override
    public void atualizarPaginaWeb() {
        System.out.println("Atualizando página...");

    }
}
