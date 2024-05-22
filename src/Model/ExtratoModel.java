package Model;
/**
 *
 * @author valim
 */
public class ExtratoModel {
    private String NomeMoeda;
    private double cotgeral,taxageral;

    public String getNomeMoeda() {
        return NomeMoeda;
    }

    public void setNomeMoeda(String NomeMoeda) {
        this.NomeMoeda = NomeMoeda;
    }

    public double getCotgeral() {
        return cotgeral;
    }

    public void setCotgeral(double cotgeral) {
        this.cotgeral = cotgeral;
    }

    public double getTaxageral() {
        return taxageral;
    }

    public void setTaxageral(double taxageral) {
        this.taxageral = taxageral;
    }

    public ExtratoModel() {
        
    }
    
    
}
