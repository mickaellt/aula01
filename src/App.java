public class App {
    public static void main(String[] args) throws Exception {
        // Instânciando um objeto, na estrutura "<nome_da_classe> <nome_do_objeto> = new <nome_classe>";
        veiculo mobi = new veiculo();

        // Váriavel global
        mobi.velocidade = 30;
        
        mobi.cor = "Preto";
        mobi.modelo = "Mobi Trekking";
        mobi.buzinar();

        
        
        //  Váriavel do parámetro
        mobi.acelerar(100);
        System.out.println("A velocidade atual é " + mobi.velocidade  + "Km/h");

        mobi.reduzir();
        System.out.println("A velocidade atual é " + mobi.velocidade  + "Km/h");
    }
}
