import java.text.DecimalFormat;

class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        // Classe Normal (criada para que funcione como Ingresso normal)
        Ingresso ingressoNormal = new Normal(50.0);
        ingressoNormal.imprimeValor();
        ((Normal) ingressoNormal).imprimeTipo();

        // Classe VIP (ingresso com valor adicional)
        VIP ingressoVIP = new VIP(50.0, 30.0);
        System.out.println("Valor do ingresso VIP R$" + df.format(ingressoVIP.retornaValor()));

        // Classe Camarote (com localização adicional)
        Camarote ingressoCamarote = new Camarote(50.0, 30.0, "Perto do Palco");
        ingressoCamarote.imprimeValor();
        ingressoCamarote.ImprimeLocalizacao();

        // Classe Camarote Superior (extensão do Camarote com valor adicional)
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(50.0, 30.0);
        System.out.println("Valor do Ingresso Camarote Superior R$" + df.format(camaroteSuperior.retornaValor()));
    }
}