public class Main {

    public static void main(String[] args) {

        int primeiro = 5;
        int segundo = 7;
        //  atribuindo o valor da variavel primeiro pra variavel segundo
        segundo = primeiro;
        // printando o valor da variavel segundo que resulta o resultado da variavel primeiro
        System.out.println(segundo);
        // Modificando valor pra variavel primeiro
        primeiro = 10;
        // primeiro = 10 nao vai ter efeito pra variavel  segundo  por que a variavel guarda valor nao referencia
        System.out.println(segundo);

    }
}