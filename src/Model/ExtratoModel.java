package Model;
/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class ExtratoModel {
    private String NomeMoeda;
    private double cotgeral,taxageral;

    /**
     *
     * @return
     */
    public String getNomeMoeda() {
        return NomeMoeda;
    }

    /**
     *
     * @param NomeMoeda
     */
    public void setNomeMoeda(String NomeMoeda) {
        this.NomeMoeda = NomeMoeda;
    }

    /**
     *
     * @return
     */
    public double getCotgeral() {
        return cotgeral;
    }

    /**
     *
     * @param cotgeral
     */
    public void setCotgeral(double cotgeral) {
        this.cotgeral = cotgeral;
    }

    /**
     *
     * @return
     */
    public double getTaxageral() {
        return taxageral;
    }

    /**
     *
     * @param taxageral
     */
    public void setTaxageral(double taxageral) {
        this.taxageral = taxageral;
    }

    /**
     *
     */
    public ExtratoModel() {
        
    }
    
    
}
