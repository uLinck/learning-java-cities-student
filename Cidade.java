public class Cidade {
    private int codigo;
    private String descricao;
    private String uf;
    private int quantEstudante;

    public Cidade(int codigo, String descricao, String uf) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;
    }

    //region Setters e Getters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getCodigo() {
        return codigo;
    }
    //endregion

    public String exibeDados() {
        return "Cidade{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", uf='" + uf + '\'' +
                ", quantEstudante=" + quantEstudante +
                '}';
    }

    public void adicionaNovoEstudante() {
        this.quantEstudante++;
    }
}
