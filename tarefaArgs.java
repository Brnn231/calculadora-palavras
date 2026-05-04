public class tarefaArgs {
    public static void main(String[] args) {
        int Qntpalavras = args.length;
        int par = 0, impar = 0;
        for (String ParImpar: args) {
            if (ParImpar.length() % 2 == 0) {
                ++par;
            }else{
                ++impar;
            }
        }
    }
}
