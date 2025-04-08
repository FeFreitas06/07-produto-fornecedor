import java.text.DecimalFormat;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public class Util {
private Produto[] produto= new Produto[5];
private Fornecedor [] fornecedor= new Fornecedor[5];
private int inxProduto=0;
    private int inxFonecedor =0;


public  void menu(){
    int opcao;
    String msg = "1. Cadastrar produto\n2. Pesquisar produto\n3. Pesquisar fornecedor por cnpj \n4. Finalzar";
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
                    pesquisar();
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
     DecimalFormat df = new DecimalFormat("0.00");
    String aux = "Produto não encontrado";
    String nome = showInputDialog("Nome do produto: ");
    for (int i=0; i<inxProduto; i++){
        if (produto[i].getNomeProd().equalsIgnoreCase(nome)){
            aux = "";
            aux += "Nome do produto: "+nome +"\n";
            aux += "Valor unitário: R$ "+ df.format(produto[i].getValorUnitario())+"\n";
            aux += "Fornecedor: "+ produto[i].getFornecedor().getNome() + "\n";
        }//if

    }//for
       showMessageDialog(null, aux);

    }//pesquisar produto


//metodo para pesquisar fornecedor
    private Fornecedor pesquisarFornecedor(){
int cnpj = parseInt(showInputDialog("CNPJ do fornecedor:"));
for (int i=0; i<inxFonecedor;i++){
    if (fornecedor[i].getCnpj() == cnpj){
        return fornecedor[i];

    }//if

}//for
    showMessageDialog(null, cnpj+" não cadastrado");
    return null;

    }//pesquisar fornecedor


    //metodo para pesquisar
    private void pesquisar(){
    Fornecedor fornecedor = pesquisarFornecedor();

    if (fornecedor != null){
     String aux = "";
     aux += "Fornecedor: "+fornecedor.getNome() +"\n";
     aux += "CNPJ: "+fornecedor.getCnpj() +"\n";
    }//if

    }//pesquisar




}//class
