public class CtaCte {
    private int saldo = 400000;
    private int clave = 1234;

    public int transaccion (int monto){

        if (monto < this.saldo) {
            this.saldo = this.saldo - monto;
            return 1;
        }
        else
            return 0;

    }
    public boolean validaClave(int clave){
            if (this.clave==clave){
                return true;
            }
            return false;


    }

    public int getSaldo() {
        return saldo;
    }
}
