package ifpr.pgua.eic.info.banco.entidades;

public class ContaCorrente extends Conta{

    public ContaCorrente(String agencia, String numero, Pessoa cliente,double limit, double taxaManutencao) {
       
        super(agencia, numero, cliente);
        this.taxaManutencao = taxaManutencao;
        this.limit = 50;
       
    }


    private double limit;
    private double taxaManutencao;


    public double getTaxaManutencao() {
        return taxaManutencao;
    }
    public double getLimit() {
        return limit;
    }
    public void setLimit(double limit) {
        this.limit = limit;
    }
    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }


    @Override
    public String gerarExtrato(){

        String texto = "";

        texto = super.gerarExtrato();

        texto = texto + "\n Taxa de manutençao: " + taxaManutencao; 
        texto = texto + "\n Limit:" + limit;

        return texto;
    }
    
}
