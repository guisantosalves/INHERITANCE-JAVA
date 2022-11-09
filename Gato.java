public class Gato extends Animal{
    private boolean isSiames;

    public Gato(String nome, boolean sexo, int idade, boolean isSiames){
        super(nome, sexo, idade);
        this.isSiames = isSiames;
    }

    public boolean isSiames() {
        return isSiames;
    }

    public void setSiames(boolean isSiames) {
        this.isSiames = isSiames;
    }
    
    public void miar(){
        System.out.println("to miando");
    }

    public void ronronar(){
        System.out.println("to ronronando");
    }
}
