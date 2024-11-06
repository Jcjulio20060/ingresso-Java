public class Camarote extends VIP{
    private String Localizacao;

    public Camarote(double valor, double ValorAdicional, String Localizacao){
        super(valor, ValorAdicional);
        this.Localizacao = Localizacao;
    }
    public void ImprimeLocalizacao(){
        System.out.println("Localização: " + Localizacao);
    }
}
