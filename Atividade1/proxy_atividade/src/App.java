import classes.ProxyListaContato;
import interfaces.ListaContato;

public class App {
    public static void main(String[] args) throws Exception {
        ListaContato lista = new ProxyListaContato("de Morrinhos - GO");
        //carregará o arquivo para impressão
        lista.imprimirListaCompleta();
        System.out.println("");
        //só mostrará na tela
        lista.mostrar();

    }
}
