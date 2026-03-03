import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        int opcao = 0;
        MenuProduto m = new MenuProduto();

        do{
            opcao = m.exibeOpcoes();
            
        }while(opcao!=0);

    }
}
