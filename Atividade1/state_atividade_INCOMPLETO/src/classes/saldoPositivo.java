package classes;

import interfaces.IContaState;

public class saldoPositivo implements IContaState {
    
    private Conta _conta;

    

    public saldoPositivo(Conta Pconta) {
        this._conta = Pconta;
    }

    public void Saque(Double valor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Deposito(Double valor) {
        // TODO Auto-generated method stub
        
    }
    
}
