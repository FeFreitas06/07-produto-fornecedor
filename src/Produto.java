public class Produto {

    private String nomeProd;
    private double valorUnitario;
    private int quantEstoque;
    private Fornecedor fornecedor;

    public Produto(String nomeProd, int quantEstoque, double valorUnitario, Fornecedor fornecedor) {
        this.nomeProd = nomeProd;
        this.quantEstoque = quantEstoque;
        this.valorUnitario = valorUnitario;
        this.fornecedor = fornecedor;
    }

    public String getNomeProd() {
        return nomeProd;
    }//get nome prod

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }//set nome prod


    public double getValorUnitario() {
        return valorUnitario;
    }//get valor unitario

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }// set valor unitario


    public int getQuantEstoque() {
        return quantEstoque;
    }// get quant estoque

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }// set quant estoque


    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}//class
