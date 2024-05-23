package Model;
/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class Administrador extends Pessoa{
    private double cotbit, cotethe, cotrip,cotmoeda1,cotmoeda2;
    private ExtratoModel extrato;

    /**
     *
     * @return
     */
    public ExtratoModel getExtrato() {
        return extrato;
    }

    /**
     *
     * @param extrato
     */
    public void setExtrato(ExtratoModel extrato) {
        this.extrato = extrato;
    }

    /**
     *
     * @return
     */
    public double getCotmoeda1() {
        return cotmoeda1;
    }

    /**
     *
     * @param cotmoeda1
     */
    public void setCotmoeda1(double cotmoeda1) {
        this.cotmoeda1 = cotmoeda1;
    }

    /**
     *
     * @return
     */
    public double getCotmoeda2() {
        return cotmoeda2;
    }

    /**
     *
     * @param cotmoeda2
     */
    public void setCotmoeda2(double cotmoeda2) {
        this.cotmoeda2 = cotmoeda2;
    }

    /**
     *
     * @return
     */
    public double getCotbit() {
        return cotbit;
    }

    /**
     *
     * @param cotbit
     */
    public void setCotbit(double cotbit) {
        this.cotbit = cotbit;
    }

    /**
     *
     * @return
     */
    public double getCotethe() {
        return cotethe;
    }

    /**
     *
     * @param cotethe
     */
    public void setCotethe(double cotethe) {
        this.cotethe = cotethe;
    }

    /**
     *
     * @return
     */
    public double getCotrip() {
        return cotrip;
    }

    /**
     *
     * @param cotrip
     */
    public void setCotrip(double cotrip) {
        this.cotrip = cotrip;
    }

    /**
     *
     * @param cotbit
     * @param cotethe
     * @param cotrip
     * @param getcotmoeda1
     * @param extrato
     * @param nome
     * @param cpf
     * @param senha
     */
    public Administrador(double cotbit, double cotethe, double cotrip, double getcotmoeda1, ExtratoModel extrato, String nome, String cpf, String senha) {
        super(nome, cpf, senha);
        this.cotbit = cotbit;
        this.cotethe = cotethe;
        this.cotrip = cotrip;
        this.cotmoeda1 = getcotmoeda1;
        this.cotmoeda2 = getcotmoeda1;
        this.extrato = extrato;
    }
    
    /**
     *
     * @param cotbit
     * @param cotethe
     * @param cotrip
     * @param getrcotmoeda1
     * @param getcotmoeda2
     * @param extrato
     * @param nome
     * @param cpf
     * @param senha
     */
    public Administrador(double cotbit, double cotethe, double cotrip, double getrcotmoeda1, double getcotmoeda2, ExtratoModel extrato, String nome, String cpf, String senha) {
        super(nome, cpf, senha);
        this.cotbit = cotbit;
        this.cotethe = cotethe;
        this.cotrip = cotrip;
        this.cotmoeda1 = getrcotmoeda1;
        this.cotmoeda2 = getcotmoeda2;
        this.extrato = extrato;
    }
    
    /**
     *
     * @param cotbit
     * @param cotethe
     * @param cotrip
     * @param extrato
     * @param nome
     * @param cpf
     * @param senha
     */
    public Administrador(double cotbit, double cotethe, double cotrip, ExtratoModel extrato, String nome, String cpf, String senha) {
        super(nome, cpf, senha);
        this.cotbit = cotbit;
        this.cotethe = cotethe;
        this.cotrip = cotrip;
        this.extrato = extrato;
    }

    /**
     *
     * @param nome
     * @param cpf
     * @param senha
     */
    public Administrador(String nome, String cpf, String senha) {
        super(nome, cpf, senha);
    }
    
    

}
