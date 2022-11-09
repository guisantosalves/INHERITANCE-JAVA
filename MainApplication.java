public class MainApplication {
    public static void main(String[] args){
        Gato gatin = new Gato("zed", true, 2, false);
        System.out.println(gatin.getIdade());
        gatin.aumentarIdade();
        System.out.println("gatin idade +1: "+gatin.getIdade());

        Cachorro catiorin = new Cachorro("thor", true, 3, "médio");
        catiorin.aumentarIdade();
        System.out.println("catiorin idade +1: "+catiorin.getIdade());   
    }
}
