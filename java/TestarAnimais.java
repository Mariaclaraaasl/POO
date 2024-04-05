public class TestarAnimais {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero(
                "planta",
                "camelo",
                "150",
                "4",
                "amarelo",
                "terra",
                "0.2m/s"
                );

        Mamifero ursocanada = new Mamifero(
                "mel",
                "Urso-do-Canadá",
                "180",
                "4",
                "vermelho",
                "terra",
                "0.5m/s"
                );
        dados(camelo,ursocanada);
    }
        public static void dados(Mamifero camelo, Mamifero ursocanada) {
            System.out.println("dados do camelo:");
            camelo.dados();

            System.out.println("dados do ursocanada");
            ursocanada.dados();
        }



}
