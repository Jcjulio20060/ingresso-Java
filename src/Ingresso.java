public class Ingresso {
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    protected double valor;

    public Ingresso(double valor){
        this.valor = valor;
    }

    public void imprimeValor(){
        System.out.println("O valor do ingresso está R$" + valor);
    }
}
