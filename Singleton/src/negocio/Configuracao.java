package negocio;

public class Configuracao {

    private static Configuracao instancia;
    
    private String idioma;
    private String tema;
    private String versao;
    private String nomeUsuario;

    private Configuracao() {
        // Construtor privado para evitar instanciação direta
    }

    public static Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void exibirConfiguracoes() {
        System.out.println("Configurações:");
        System.out.println("Idioma: " + idioma);
        System.out.println("Tema: " + tema);
        System.out.println("Versão: " + versao);
        System.out.println("Nome de usuário: " + nomeUsuario);
        System.out.println();
    }
}