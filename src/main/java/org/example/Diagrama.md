classDiagram

class ReprodutorMusical {
+tocarMusica()
+pausarMusica()
+selecionarMusica(String musica)
}

class AparelhoTelefonico {
    +efetuarLigacao(String numero)
    +atenderLigacao()
    +correioVoz()
}

class NavegadorInternet {
    +exibirPaginaWeb(String url)
    +adicionarNovaAba()
    +atualizarPaginaWeb()
}

class iPhone {
}

iPhone --> ReprodutorMusical
iPhone --> AparelhoTelefonico
iPhone --> NavegadorInternet
