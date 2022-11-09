public class Animal {
    private String nome;
    private boolean sexo; // true -> macho | false -> femea
    private int idade;

    public Animal(String nome, boolean sexo, Integer idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getSexo() {
        return this.sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void aumentarIdade() {
        this.idade = this.idade + 1;
    }
}