public class Peixe extends Animal{
        private String caracteristica;

        public Peixe(String caracteristica, String nome, float comprimento, int numerodepatas, String cor, String ambiente, float velocidademedia){
            super(nome, comprimento, numerodepatas, cor, ambiente, velocidademedia);
            this.caracteristica = caracteristica;
        }
        public String getCaracteristica(){
            return caracteristica;
        }
        public void setCaracteristica(String caracteristica){
            this.caracteristica = caracteristica;
        }
        public void dadosPeixe(){
            super.dados();
            System.out.println("caracteristica" + caracteristica);

        }

    }
