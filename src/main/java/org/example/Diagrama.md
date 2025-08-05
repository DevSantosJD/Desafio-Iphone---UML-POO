classDiagram

class ReprodutorMusical {
+tocar()
+pausar()
+selecionarMusica(String musica)
}

class AparelhoTelefonico {
    +efetuarLigacao(String numero)
    +atenderLigacao()
    +correioVoz()
}

class NavegadorInternet {
    +exibirPagina(String url)
    +adicionarNovaAba()
    +atualizarPagina()
}

class iPhone {
}

iPhone --> ReprodutorMusical
iPhone --> AparelhoTelefonico
iPhone --> NavegadorInternet
