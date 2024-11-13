public class VIP extends Ingresso{
    private final double ValorAdicional;

    public VIP(double ValorAdicional, double valor){
        super(valor);
        this.ValorAdicional = ValorAdicional;
    }

    public double retornaValor(){
        return valor + ValorAdicional;
    }
}
