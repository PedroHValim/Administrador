package Model;
/**
 *
 * @author unifpvalim
 */
public class Administrador extends Pessoa{
    private double cotbit, cotethe, cotrip,cotmoeda1,cotmoeda2;
    private ExtratoModel extrato;

    public ExtratoModel getExtrato() {
        return extrato;
    }

    public void setExtrato(ExtratoModel extrato) {
        this.extrato = extrato;
    }

    public double getCotmoeda1() {
        return cotmoeda1;
    }

    public void setCotmoeda1(double cotmoeda1) {
        this.cotmoeda1 = cotmoeda1;
    }

    public double getCotmoeda2() {
        return cotmoeda2;
    }

    public void setCotmoeda2(double cotmoeda2) {
        this.cotmoeda2 = cotmoeda2;
    }



    public double getCotbit() {
        return cotbit;
    }

    public void setCotbit(double cotbit) {
        this.cotbit = cotbit;
    }

    public double getCotethe() {
        return cotethe;
    }

    public void setCotethe(double cotethe) {
        this.cotethe = cotethe;
    }

    public double getCotrip() {
        return cotrip;
    }

    public void setCotrip(double cotrip) {
        this.cotrip = cotrip;
    }

    public Administrador(double cotbit, double cotethe, double cotrip, double getcotmoeda1, ExtratoModel extrato, String nome, String cpf, String senha) {
        super(nome, cpf, senha);
        this.cotbit = cotbit;
        this.cotethe = cotethe;
        this.cotrip = cotrip;
        this.cotmoeda1 = getcotmoeda1;
        this.cotmoeda2 = getcotmoeda1;
        this.extrato = extrato;
    }
    
    

    public Administrador(double cotbit, double cotethe, double cotrip, double getrcotmoeda1, double getcotmoeda2, ExtratoModel extrato, String nome, String cpf, String senha) {
        super(nome, cpf, senha);
        this.cotbit = cotbit;
        this.cotethe = cotethe;
        this.cotrip = cotrip;
        this.cotmoeda1 = getrcotmoeda1;
        this.cotmoeda2 = getcotmoeda2;
        this.extrato = extrato;
    }
    
    

    public Administrador(double cotbit, double cotethe, double cotrip, ExtratoModel extrato, String nome, String cpf, String senha) {
        super(nome, cpf, senha);
        this.cotbit = cotbit;
        this.cotethe = cotethe;
        this.cotrip = cotrip;
        this.extrato = extrato;
    }


    public Administrador(String nome, String cpf, String senha) {
        super(nome, cpf, senha);
    }
    
    

}
