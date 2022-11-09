import java.net.InetAddress;

public class Cachorro extends Animal {
    private String porte;

    public Cachorro(String nome, boolean sexo, int idade, String porte){
        super(nome, sexo, idade);
        this.porte = porte;
    }
    
    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    
    public void latir(){
        System.out.println("TO LATINDO");
    }

    public void morder(){
        System.out.println("to mordendo");
    }

    public void aumentarIdade(){
        setIdade(getIdade() + 1);
    }

}
