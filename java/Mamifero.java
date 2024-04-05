public class Mamifero extends Animal{
    private String alimento;
    public Mamifero(String alimento, String nome, float comprimento, int numerodepatas, String cor, String ambiente, float velocidademedia) {
        super(nome, comprimento, numerodepatas, cor, ambiente, velocidademedia);
        this.alimento = alimento;
    }
    public String getAlimento(){
        return alimento;
    }
    public void setAlimento(String alimento){
        this.alimento = alimento;
    }
    public void dadosMamifero(){
        super.dados();
        System.out.println("alimento" + alimento);

    }

}

