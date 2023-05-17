package ifpr.pgua.eic.info.banco.entidades;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String agencia, String numero, Pessoa cliente, double taxaRendimento) {
        
        super(agencia, numero, cliente);
        this.taxaRendimento = taxaRendimento;
        this.rendimento = 0.0;

    }

    private double taxaRendimento;
    private double rendimento;



    public double getRendimento()
    {
        return rendimento;
    }

    public double getTaxaRendimento()
    {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento)
    {
        this.taxaRendimento = taxaRendimento;
    }

    public void setRendimento(double rendimento)
    {
        this.rendimento = rendimento;
    }

    @Override
    public String gerarExtrato(){

        String texto = "";

        texto = super.gerarExtrato();

        texto = texto + "\n Taxa de rendimento: " + taxaRendimento; 
        texto = texto + "\n Rendimento:" + rendimento;

        return texto;
    }


}
