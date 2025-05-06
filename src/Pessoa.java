public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome,int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String verificarIdade()
    {
        if(this.idade>=18)
        {
            return this.nome+" é Maior de idade";
        }
        return  this.nome+" é menor de idade";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
