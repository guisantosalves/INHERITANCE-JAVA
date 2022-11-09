public class Pato extends Animal{
    public String corPena;
    
    public Pato(String nome, boolean sexo, int idade, String corPena){
        super(nome, sexo, idade);
        this.corPena = corPena;
    }
    
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    public void aumentarIdade(){
        setIdade(getIdade() + 1);
    }
    
}
