package classes;

import interfaces.ListaContato;

public class ListaCompleta implements ListaContato{

    private String lista;

    public ListaCompleta(String lista){
        this.lista = lista;
    }

    @Override
    public void mostrar() {
        System.out.println("Visualizando lista telefônica"); 
    }
    
    public void imprimirListaCompleta(String lista){
        System.out.println("Imprimindo lista telefônica");
    }

    @Override
    public void imprimirListaCompleta() {
    }
}
