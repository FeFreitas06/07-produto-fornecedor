import java.text.DecimalFormat;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public class util {
private Produto[] produto= new Produto[5];
private Fornecedor [] fornecedor= new Fornecedor[5];
private int inxProduto=0;
    private int inxFonecedor =0;


public  void menu(){
    int opcao;
    String msg = "1. Cadastrar produto\n2. Pesquisar produto\n3. Pesquisar fornecedor por cnpj \nFinalzar";
    do {
        opcao = parseInt(showInputDialog(msg));
        if(opcao < 1 || opcao > 3) {
            showMessageDialog(null, "Opção inválida");
        }
        else {
            switch(opcao) {
                case 1:
                    cadastrarProd();
                    break;
                case 2:
                    pesquisarProd();
                    break;
                case 3:
                    pesquisarFornecedor();
                    break;


            }
        }
    } while(opcao != 3);


    }//menu principal


    //metodo para cadastrar Produto
    private void cadastrarProd(){
String nome;
double valorUnitario;
int quantEstoque;
Fornecedor fornecedor = pesquisarFornecedor();

if (fornecedor ==null){
    fornecedor = cadastrarFornecedor();
}
nome = showInputDialog("nome do produto");
valorUnitario = parseDouble(showInputDialog("Valor Unitario"));
quantEstoque = parseInt(showInputDialog("Quantidade em estoque"));
produto[inxProduto] = new Produto(nome, quantEstoque, valorUnitario, fornecedor);
inxProduto++;


}//cadastrar produto


    //metodo para cadastrar o fornecedor
private Fornecedor cadastrarFornecedor(){
    Fornecedor fornecedor;
    String nome = showInputDialog("Nome do fornecedor");
    int cnpj = parseInt(showInputDialog("CNPJ"));

    fornecedor = new Fornecedor(cnpj, nome);
    this.fornecedor[inxFonecedor] = fornecedor;
    inxFonecedor++;
    return fornecedor;


}//cadastrar fornecedor



    //metodo para pesquisar produto
    private void pesquisarProd(){
       String nomeProd;


    }//pesquisar produto


//metodo para pesquisar fornecedor
    private Fornecedor pesquisarFornecedor(){
int cnpj = parseInt(showInputDialog("CNPJ do fornecedor:"));
for (int i=0; i<inxFonecedor;i++){
    if (fornecedor[i].getCnpj() == cnpj){
        return fornecedor[i];
    }

}//for
    showMessageDialog(null, cnpj+" não cadastrado");
    return null;

    }//pesquisar fornecedor



}//class
