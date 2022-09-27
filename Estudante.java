import javax.swing.plaf.synth.Region;

public class Estudante {
    private int codigo;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private Cidade cidade;

    public Estudante(int codigo, String nome, String dataNascimento, String email, String senha, Cidade cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;

        this.cidade.adicionaNovoEstudante();
    }

    //region Setters e Getters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    //endregion

    public String exibeDados() {
        return "Estudante{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}
