
package CuentasBanco;


public class cuenta {
    String titular;
    float saldo;    

    public cuenta() {
    }

    public cuenta(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public float abonar(float monto){
        float resultado = monto + this.saldo;
        return resultado;
    }
    
}

