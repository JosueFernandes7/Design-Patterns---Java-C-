import negocio.Configuracao;

public class App {

    public static void main(String[] args) {
        Configuracao primeiraInstancia = Configuracao.getInstance();
        int hashPrimeiraInstancia = primeiraInstancia.hashCode();

        // Configurações iniciais
        primeiraInstancia.setIdioma("Português");
        primeiraInstancia.setTema("Claro");
        primeiraInstancia.setVersao("1.0");
        primeiraInstancia.setNomeUsuario("Usuario123");
        primeiraInstancia.exibirConfiguracoes();

        // Criar outra instância para verificar se as configurações são compartilhadas
        Configuracao segundaInstancia = Configuracao.getInstance();
        int hashSegundaInstancia = segundaInstancia.hashCode();
        
        System.out.println("Hash primeira instancia " + hashPrimeiraInstancia);
        System.out.println("Hash segunda instancia " + hashSegundaInstancia);

        // Alterando pela segunda eu muda na primeira, ou seja tem o mesmo endereço e fez uma instancia somente de configuracao
        segundaInstancia.setIdioma("Inglês");
        System.out.println(primeiraInstancia.getIdioma());
    }
}
