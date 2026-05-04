public class tarefaArgs {
    public static void main(String[] args) {
        int Qntpalavras = args.length;
        int par = 0, impar = 0, a = 0, e = 0, i = 0, o = 0, u = 0;
        for (String ParImpar: args) {
            if (ParImpar.length() % 2 == 0) {
                ++par;
            }else{
                ++impar;
            }
            for(char letra: ParImpar.toLowerCase().toCharArray()) {
                switch (letra){
                    case 'a': ++a;
                    break;
                    case 'e': ++e;
                    break;
                    case 'i': ++i;
                    break;
                    case 'o': ++o;
                    break;
                    case 'u': ++u;
                }
            }
        }
        System.out.println("Quantidade de palavras: "+Qntpalavras);
        System.out.printf("Quantidade de pares: %d\nQuantidade de ímpares: %d\n",par,impar);
        System.out.printf("Qnt A: %d\nQnt E: %d\nQnt I: %d\nQnt O: %d\nQnt U: %d\n",a,e,i,o,u);
        System.out.printf("Total de vogais: %d",a+i+o+u+e);
    }
}
