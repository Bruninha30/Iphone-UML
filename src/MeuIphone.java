

public class MeuIphone {
    
    public class MeuIPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

        // Implementação dos métodos do ReprodutorMusical
        @Override
        public void tocar() {
            System.out.println("Reproduzindo música");
        }
    

        public void pausar() {
            System.out.println("Música pausada");
        }
    

        public void selecionarMusica(String musica) {
            System.out.println("Música selecionada: " + musica);
        }
    
        // Implementação dos métodos do AparelhoTelefonico
    
        public void ligar(String numero) {
            System.out.println("Ligando para " + numero);
        }
    
        
        public void atender() {
            System.out.println("Atendendo a chamada");
        }
    
        
        public void  inciarCorreiroVoz() {
            System.out.println("Iniciando correio de voz");
        }
    
        // Implementação dos métodos do NavegadorInternet

        public void exibirPagina(String url) {
            System.out.println("Exibindo página: " + url);
        }

        public void adicionarNovaAba() {
            System.out.println("Nova aba adicionada");
        }
    
        
        public void atualizarPagina() {
            System.out.println("Página atualizada");
        }
    
        public static void main(String[] args) {
            MeuIPhone meuIPhone = iphone();
    
            // Testando ReprodutorMusical
            meuIPhone.tocar();
            meuIPhone.pausar();
            meuIPhone.selecionarMusica("Aquarela do Brasil");
    
            // Testando AparelhoTelefonico
            meuIPhone.ligar("123-456-7890");
            meuIPhone.atender();
            meuIPhone.inciarCorreiroVoz();
    
            // Testando NavegadorInternet
            meuIPhone.exibirPagina("http://www.example.com");
            meuIPhone.adicionarNovaAba();
            meuIPhone.atualizarPagina();
        }
    }

    public static MeuIphone.MeuIPhone iphone() {
        
        throw new UnsupportedOperationException("Unimplemented method 'iphone'");
    }
    
}
