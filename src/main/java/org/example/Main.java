package org.example;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.selecionarMusica("City Haunts - Nothings But Thieves");
        iphone.tocar();
        iphone.pausar();

        iphone.efetuarLigacao("70707070");
        iphone.atenderLigacao();
        iphone.correioVoz();

    }
}