public class Animal{
    private String nome;
    private  float comprimento;
    private int numerodepatas;
    private String cor;
    private String ambiente;
    private float velocidademedia;

    public Animal(String nome, float comprimento, int numerodepatas, String cor, String ambiente, float velocidademedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numerodepatas = numerodepatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidademedia = velocidademedia;
    }
    public String getNome(){
        return nome;
    }
    public float getComprimento(){
        return comprimento;
    }
    public int getNumerodepatas(){
        return numerodepatas;
    }
    public String getCor(){
        return cor;
    }
    public String getAmbiente(){
        return ambiente;
    }
    public float getVelocidademedia(){
        return velocidademedia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setNumerodepatas(int numerodepatas) {
        this.numerodepatas = numerodepatas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setVelocidademedia(float velocidademedia) {
        this.velocidademedia = velocidademedia;
    }
    public void dados(){
        System.out.println("nome:" + nome);
        System.out.println("comprimento:" + comprimento);
        System.out.println("numerodepatas:" + numerodepatas);
        System.out.println("cor:" + cor);
        System.out.println("ambiente:" + ambiente);
        System.out.println("velocidademedia:" + velocidademedia);
    }
}
