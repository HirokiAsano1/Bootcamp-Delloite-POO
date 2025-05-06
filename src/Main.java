//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 =  new Pessoa("Lucas",18);
        Pessoa pessoa2 = new Pessoa("Gilberto",17);
        System.out.println(pessoa1.verificarIdade());
        System.out.println(pessoa2.verificarIdade());

        if(pessoa1.getIdade()> pessoa2.getIdade())
        {
            System.out.println("A pessoa 1 é mais velha do que a pessoa 2");
        } else if(pessoa1.getIdade()< pessoa2.getIdade()) {
            System.out.println("A pessoa 2 é mais velha do que a pessoa 1");
        }
        else
        {
            System.out.println("Ambos tem a msm Idade");
        }
    }
}