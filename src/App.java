public class App {
    public static void main(String[] args) throws Exception {
        
        String[] wordListOne = {"Conhecimento", "Evolução", "Aprender", "Adaptar"};
        String[] wordListTwo = {"Nootebok", "Computador", "Tablet", "Celular"};
        String[] wordListThree = {"Mesa", "Caneta", "Porta", "Vidro"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random textoRandomizado = new java.util.Random();
        int Gerar1 = textoRandomizado.nextInt(oneLength);
        int Gerar2 = textoRandomizado.nextInt(twoLength);
        int Gerar3 = textoRandomizado.nextInt(threeLength);

        String Frase = wordListOne[Gerar1] + " " + wordListTwo[Gerar2] + " " + wordListThree[Gerar3];

        System.out.println(Frase);


    }
}
