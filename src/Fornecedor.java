public class Fornecedor {



        private String nome;
        private int cnpj;

    public Fornecedor(int cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }//fornecedor


    public String getNome() {
        return nome;
    }//get nome

    public void setNome(String nome) {
        this.nome = nome;
    }//set nome

    public int getCnpj() {
        return cnpj;
    }//get cnpj

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }//set cnpj




}//class


