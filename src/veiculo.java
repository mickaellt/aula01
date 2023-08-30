import java.security.PublicKey;

public class veiculo {
    // Maneiras de inicializar uma váriavel(Atributo)
    public String cor;
    String modelo;
    public int velocidade = 0;

    // Inicialização de métodos 
    
    // Parámetro declarado dentro da classe
    public void acelerar(int vel_entrada){
        int v = vel_entrada;
        System.out.print(v);
        velocidade = velocidade + vel_entrada;

    }

    public void reduzir(){
         
        velocidade = velocidade - 1;
    }

    public void buzinar(){
        System.out.println("AUUUUUUUUUUUUUUUUUUU!");
    }
}
