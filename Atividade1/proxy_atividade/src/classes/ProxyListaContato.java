package classes;

import interfaces.ListaContato;

public class ProxyListaContato implements ListaContato{
    private ListaCompleta listaCompleta;
    public String lista;

    public ProxyListaContato(String string) {
    }

    @Override
    public void mostrar() {
        if(listaCompleta == null){
            listaCompleta = new ListaCompleta(lista);
        }
        listaCompleta.mostrar();

    }

    @Override
    public void imprimirListaCompleta() {
        
    }
    
}
