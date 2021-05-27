
public class Fornecedor implements Comparable<Fornecedor> {

    private Integer id;
    private String cnpj;
    private String razaoSocial;
    private String telefone;
    private String observacoes;
    private String email;

    protected Fornecedor() {
    }

    protected Fornecedor(Integer id, String cnpj, String razaoSocial, String telefone, String email,
            String observacoes) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.telefone = telefone;
        this.email = email;
        this.observacoes = observacoes;
    }

    protected Integer getId() {
        return id;
    }

    protected String getCNPJ() {
        return cnpj;
    }

    protected void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    protected String getRazaoSocial() {
        return razaoSocial;
    }

    protected void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    protected String getTelefone() {
        return telefone;
    }

    protected void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected String getObservacoes() {
        return observacoes;
    }

    protected void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String toString() {
        return "(" + getId() + ")" + " - " + getRazaoSocial() + "\n\nCNPJ: " + getCNPJ() + "\n\nTelefone: "
                + getTelefone() + "\n\nE-mail: " + getEmail() + "\n\nObservações: " + getObservacoes();
    }

    protected Fornecedor cadastrarFornecedor(Integer id, String cnpj, String razaoSocial, String telefone, String email,
            String observacoes) {

        return new Fornecedor(id, cnpj, razaoSocial, telefone, email, observacoes);

    }

    @Override
    public int compareTo(Fornecedor fornec2) {

        return id.compareTo(fornec2.getId());
    }
}
