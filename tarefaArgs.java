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
                    case 'a', 'á', 'à', 'ã', 'â': ++a;
                    break;
                    case 'e', 'é', 'è', 'ê': ++e;
                    break;
                    case 'i','í','ì','î': ++i;
                    break;
                    case 'o','ó','ò','õ','ô': ++o;
                    break;
                    case 'u','ú','ù','û': ++u;
                }
            }
        }
        System.out.printf("Qnt A: %d\nQnt E: %d\nQnt I: %d\nQnt O: %d\nQnt U: %d\n",a,e,i,o,u);
    }
}
