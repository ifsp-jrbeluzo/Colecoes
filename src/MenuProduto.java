import java.util.ArrayList;
import java.util.Scanner;

public class MenuProduto {

    ArrayList<Produto> produtos = new ArrayList<>();

    public int exibeOpcoes(){
        int opcao=-1;

        Scanner s = new Scanner(System.in);

        System.out.println("1) Cadastrar Produto");
        System.out.println("2) Remover Produto");
        System.out.println("3) Listar Produtos");
        System.out.println("4) Exibir Informacoes de um Produto");
        System.out.println();
        System.out.println("ou digite 0 (zero) para sair.");
        System.out.print("Qual a opcao desejada? ");

        if(s.hasNextInt()){
            opcao = s.nextInt();
            this.executaAcao(opcao);
        }
        else{
            System.out.println("Opcao escolhida invalida. Digite um numero inteiro da lista.");
        }

        

        return(opcao);
    }
    
    public void executaAcao(int opcao){
        if(opcao==1){
            this.cadastrar();
        }
    }

    public void cadastrar(){
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nome = s.next();
        System.out.print("Digite o preco do produto: ");
        double preco = s.nextDouble();
        Produto p = new Produto(nome,preco);
        produtos.add(p);
        System.out.println("Produto Cadastrado com sucesso.");
    }

}
