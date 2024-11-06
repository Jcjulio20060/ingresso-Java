import java.text.DecimalFormat;

class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Ingresso ingressoNormal = new Ingresso(50.0);
        ingressoNormal.imprimeValor();
        ((Normal) ingressoNormal).imprimeTipo();

        VIP ingressoVIP = new VIP(50.0,30.0);
        System.out.println("Valor do ingresso VIP R$" + df.format(ingressoVIP.retornaValor()));

        Camarote ingressoCamarote = new Camarote(50.0, 30.0, "Perto do Palco");
        ingressoCamarote.imprimeValor();
        ingressoCamarote.ImprimeLocalizacao();

        CamaroteSuperior CamaroteSuperior = new CamaroteSuperior(50.0, 30.0);
        System.out.println("Valor do Ingresso Camarote Superior R$" + df.format(ingressoCamarote.retornaValor()));
    }
}