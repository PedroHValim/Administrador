package Model;
/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class Pessoa {
    private String nome,cpf,senha;

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public String getCpf() {
        return cpf;
    }

    /**
     *
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     *
     * @return
     */
    public String getSenha() {
        return senha;
    }

    /**
     *
     * @param senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    /**
     *
     */
    public Pessoa(){
        
    }

    /**
     *
     * @param nome
     * @param cpf
     * @param senha
     */
    public Pessoa(String nome , String cpf,String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    
}
