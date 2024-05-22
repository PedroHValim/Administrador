package DAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import Model.Administrador;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author valim
 * @author uniflduarte
 */
public class AdmDAO {
    private Connection conn;
    
    public AdmDAO(Connection conn){
        this.conn = conn;
    }
    
    public String data(){
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return  sdf.format(data);
    }
    
    public ResultSet consultar(Administrador pessoa) throws SQLException{
        String sql = "select * from administrador.informacoes where cpf = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, pessoa.getCpf());
        statement.setString(2, pessoa.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }  
    
    public ResultSet consultarcpf(String cpf) throws SQLException{
        String sql = "select * from usuario.informacoes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1,cpf);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }  
    
    public String consultarsaldo(String cpf) throws SQLException{
        StringBuilder resultado = new StringBuilder();
        String sql = "select reais,bitcoin,ethe,ripple,moedaadd1,moedaadd2 from usuario.informacoes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cpf);
        statement.execute();
        try(ResultSet result = statement.executeQuery()){
            DecimalFormat df = new DecimalFormat("#0.00");
            while(result.next()){
                    String reais = df.format(result.getDouble("reais"));
                    String bitcoin = df.format(result.getDouble("bitcoin"));
                    String ethe = df.format(result.getDouble("ethe"));
                    String ripple = df.format(result.getDouble("ripple"));
                if(this.countRow() == 3){
                    resultado.append("Reais: ").append(reais).append("\n").append("Bitcoin: ").append(bitcoin)
                    .append("\n").append("Ethereum: ").append(ethe).append("\n").append("Ripple: ").append(ripple); 
                }if(this.countRow() == 4 && this.idMoeda().equals("M4")){
                    String moeda1 = df.format(result.getDouble("moedaadd1"));
                    resultado.append("Reais: ").append(reais).append("\n").append("Bitcoin: ").append(bitcoin)
                    .append("\n").append("Ethereum: ").append(ethe).append("\n").append("Ripple: ").append(ripple)
                    .append("\n").append(this.Nomecripto("M4")).append(": ").append(moeda1);    
                }if(this.countRow() == 4 && this.idMoeda().equals("M5")){
                    String moeda2 = df.format(result.getDouble("moedaadd2"));
                    resultado.append("Reais: ").append(reais).append("\n").append("Bitcoin: ").append(bitcoin)
                    .append("\n").append("Ethereum: ").append(ethe).append("\n").append("Ripple: ").append(ripple)
                    .append("\n").append(this.Nomecripto("M5")).append(": ").append(moeda2);
                }if(this.countRow() == 5){
                    String moeda1 = df.format(result.getDouble("moedaadd1"));
                    String moeda2 = df.format(result.getDouble("moedaadd2"));
                    resultado.append("Reais: ").append(reais).append("\n").append("Bitcoin: ").append(bitcoin)
                    .append("\n").append("Ethereum: ").append(ethe).append("\n").append("Ripple: ").append(ripple)
                    .append("\n").append(this.Nomecripto("M4")).append(": ").append(moeda1)
                    .append("\n").append(this.Nomecripto("M5")).append(": ").append(moeda2);
                }         
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return resultado.toString();
    }
    
    public ResultSet consultarCot(String id) throws SQLException{
        String sql = "select * from administrador.criptomoedas where id = ?";
        PreparedStatement statement = null;
        ResultSet resultado = null;
        try{
            statement = conn.prepareStatement(sql);
            statement.setString(1, id);
            statement.execute();
            resultado = statement.getResultSet();
            if (resultado.next()) {
            return resultado;
        } else {
            return null;
        }
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
    
    public void inserir(String nome, String cpf, String senha,double reais, 
            double bitcoin, double ethe, double ripple, double moeda1, double moeda2) throws SQLException{
        if(this.countRow() == 3){
            String sql = "insert into usuario.informacoes(nome, cpf, senha,reais,bitcoin,ethe,ripple) values ('" +
                        nome + "', '" +
                        cpf + "', '" +
                        senha + "', '" +
                        reais + "', '" +
                        bitcoin + "', '" +
                        ethe + "', '" +
                        ripple + "')";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            conn.close();
        }else if(this.countRow() == 4){
            if(this.idMoeda().equals("M4")){
                String sql = "insert into usuario.informacoes(nome, cpf, senha,reais,bitcoin,ethe,ripple,moedaadd1) values ('" +
                        nome + "', '" +
                        cpf + "', '" +
                        senha + "', '" +
                        reais + "', '" +
                        bitcoin + "', '" +
                        ethe + "', '" +
                        ripple + "', '" +
                        moeda1 + "')";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            conn.close();
            }else if(this.idMoeda().equals("M5")){
                String sql = "insert into usuario.informacoes(nome, cpf, senha,reais,bitcoin,ethe,ripple,moedaadd2) values ('" +
                        nome + "', '" +
                        cpf + "', '" +
                        senha + "', '" +
                        reais + "', '" +
                        bitcoin + "', '" +
                        ethe + "', '" +
                        ripple + "', '" +
                        moeda2 + "')";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            conn.close();
            }
        }else if(this.countRow() == 5){
            String sql = "insert into usuario.informacoes(nome, cpf, senha,reais,bitcoin,ethe,ripple,moedaadd1,moedaadd2) values ('" +
                        nome + "', '" +
                        cpf + "', '" +
                        senha + "', '" +
                        reais + "', '" +
                        bitcoin + "', '" +
                        ethe + "', '" +
                        ripple + "', '" +
                        moeda1 + "', '" +
                        moeda2 + "')";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            conn.close();
        }
        
            String sql = "insert into usuario.informacoes(nome, cpf, senha,reais,bitcoin,ethe,ripple,moedaadd1,moedaadd2) values ('" +
                        nome + "', '" +
                        cpf + "', '" +
                        senha + "', '" +
                        reais + "', '" +
                        bitcoin + "', '" +
                        ethe + "', '" +
                        moeda1 + "', '" +
                        moeda2 + "', '" +
                        ripple + "')";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            conn.close();
    }
    
    public void excluir(String cpf) throws SQLException{
        String sql = "delete from usuario.informacoes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cpf);
        statement.execute();
        conn.close();
    }
    
    public void inserirCripto(String id, String nome, double cotacao, double taxacompra, double taxavenda) throws SQLException{
        String sql = "insert into administrador.criptomoedas(id,moeda, cotacao, taxacompra,taxavenda) values('" +
                id + "' , '" +
                nome + "', '" +
                cotacao + "', '" +
                taxacompra + "', '" +
                taxavenda + "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public void excluirCripto(String id) throws SQLException{
        String sql = "delete from administrador.criptomoedas where id = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, id);
        statement.execute();
        if(id.equals("M4")){
            this.zeroaoexcluir1(id);
        }if(id.equals("M5")){
            this.zeroaoexcluir2(id);
        }else{
            System.out.println("");
        }
    }
    
    public void zeroaoexcluir1(String id) throws SQLException{
        String sql = "update usuario.informacoes set moedaadd1 = 0";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
    }
    public void zeroaoexcluir2(String id) throws SQLException{
        String sql = "update usuario.informacoes set moedaadd2 = 0";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
    }
        
    public void atualizarCot(Administrador pessoa,String id,double cot) throws SQLException{
        String sql = "update administrador.criptomoedas set cotacao = ? where id = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, cot);
        statement.setString(2,id);
        statement.execute();
        conn.close();
    }
    
    public String consultarExtrato(String cpf) throws SQLException{

        StringBuilder resultado = new StringBuilder();
        
        String sql1 = "select nome,cpf FROM usuario.informacoes WHERE cpf ?";
        PreparedStatement statement = conn.prepareStatement(sql1);
        statement.setString(1,cpf);
        try(ResultSet result = statement.executeQuery()){
            while(result.next()){
                String nome = result.getString("nome");
                String cpf2 = result.getString("cpf");
                resultado.append("Nome: ").append(nome).append("\nCPF: ").append(cpf2).append("\n\n");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        String sql = "select data,tipo,valor,moeda,cotacao,taxa,real,btc,ethe,rip,moedanova1,moedanova2 FROM usuario.extrato WHERE cpf = ?";
        PreparedStatement statement1 = conn.prepareStatement(sql);
        statement1.setString(1,cpf);
        try(ResultSet result = statement1.executeQuery()){
            DecimalFormat df = new DecimalFormat("#0.00");
            while(result.next()){
                    Double moeda1 = null;
                    Double moeda2 = null;
                    String nomemn1 = result.getString("nomemn1");
                    String nomemn2 = result.getString("nomemn2");
                    String data = result.getString("data");
                    String tipo = result.getString("tipo");
                    double valor = result.getDouble("valor");
                    String moeda = result.getString("moeda");
                    double cotacao = result.getDouble("cotacao");
                    double taxa = result.getDouble("taxa");
                    double real = result.getDouble("real");
                    double btc = result.getDouble("btc");
                    double ethe = result.getDouble("ethe");
                    double rip = result.getDouble("rip");
                    moeda1 = result.getDouble("moedanova1");
                    if(result.wasNull()){
                        moeda1 = null;
                    }
                    moeda2 = result.getDouble("moedanova2");
                    if(result.wasNull()){
                        moeda2 = null;
                    }

                    /*------------------------------------------------*/

                    String valorF = df.format(valor).replace(',', '.');
                    String cotacaoF = df.format(cotacao).replace(',', '.');
                    String taxaF = df.format(taxa).replace(',', '.');
                    String realF = df.format(real).replace(',', '.');
                    String btcF = df.format(btc).replace(',', '.');
                    String etheF = df.format(ethe).replace(',', '.');
                    String ripF = df.format(rip).replace(',', '.');

                    if(moeda1 == null && moeda2 == null){
                                resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
                                .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
                                .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
                                .append("\n");
                            }if(moeda1 != null && moeda2 == null){
                                resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
                                .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
                                .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
                                .append(" ").append(" ").append(nomemn1).append(" ").append(moeda1).append("\n");
                            }if(moeda1 == null && moeda2 != null){
                                String moeda2F = df.format(moeda2).replace(',','.');
                                resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
                                .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
                                .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
                                .append(" ").append(" ").append(nomemn2).append(" ").append(moeda2F).append("\n");
                            }if(moeda1 != null && moeda2!= null){
                                String moeda1F = df.format(moeda1).replace(',','.');
                                String moeda2F = df.format(moeda2).replace(',','.');
                                resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
                                    .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
                                    .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
                                    .append(" ").append(" ").append(nomemn1).append(": ").append(moeda1F).append("  ").append(nomemn2)
                                    .append(": ").append(moeda2F).append("\n");
                            }
            
            
            
//            while(result.next()){
//                if(this.countRow() == 3){
//                    String data = result.getString("data");
//                    String tipo = result.getString("tipo");
//                    double valor = result.getDouble("valor");
//                    String moeda = result.getString("moeda");
//                    double cotacao = result.getDouble("cotacao");
//                    double taxa = result.getDouble("taxa");
//                    double real = result.getDouble("real");
//                    double btc = result.getDouble("btc");
//                    double ethe = result.getDouble("ethe");
//                    double rip = result.getDouble("rip");
//
//                    /*------------------------------------------------*/
//
//                    String valorF = df.format(valor).replace(',', '.');
//                    String cotacaoF = df.format(cotacao).replace(',', '.');
//                    String taxaF = df.format(taxa).replace(',', '.');
//                    String realF = df.format(real).replace(',', '.');
//                    String btcF = df.format(btc).replace(',', '.');
//                    String etheF = df.format(ethe).replace(',', '.');
//                    String ripF = df.format(rip).replace(',', '.');
//
//                    resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
//                            .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
//                            .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
//                            .append("\n");
//                }if(this.countRow() == 4){
//                    if(this.idMoeda().equals("M4")){
//                            String data = result.getString("data");
//                            String tipo = result.getString("tipo");
//                            double valor = result.getDouble("valor");
//                            String moeda = result.getString("moeda");
//                            double cotacao = result.getDouble("cotacao");
//                            double taxa = result.getDouble("taxa");
//                            double real = result.getDouble("real");
//                            double btc = result.getDouble("btc");
//                            double ethe = result.getDouble("ethe");
//                            double rip = result.getDouble("rip");
//                            double moeda1 = result.getDouble("moedanova1");
//
//                            /*------------------------------------------------*/
//
//                            String valorF = df.format(valor).replace(',', '.');
//                            String cotacaoF = df.format(cotacao).replace(',', '.');
//                            String taxaF = df.format(taxa).replace(',', '.');
//                            String realF = df.format(real).replace(',', '.');
//                            String btcF = df.format(btc).replace(',', '.');
//                            String etheF = df.format(ethe).replace(',', '.');
//                            String ripF = df.format(rip).replace(',', '.');
//                            String moeda1F = df.format(moeda1).replace(',','.');
//
//                            resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
//                                    .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
//                                    .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
//                                    .append(" ").append(" ").append(this.Nomecripto("M4")).append(" ").append(moeda1F).append("\n");
//                    }if(this.idMoeda().equals("M5")){
//                            String data = result.getString("data");
//                            String tipo = result.getString("tipo");
//                            double valor = result.getDouble("valor");
//                            String moeda = result.getString("moeda");
//                            double cotacao = result.getDouble("cotacao");
//                            double taxa = result.getDouble("taxa");
//                            double real = result.getDouble("real");
//                            double btc = result.getDouble("btc");
//                            double ethe = result.getDouble("ethe");
//                            double rip = result.getDouble("rip");
//                            double moeda2 = result.getDouble("moedanova2");
//
//                            /*------------------------------------------------*/
//
//                            String valorF = df.format(valor).replace(',', '.');
//                            String cotacaoF = df.format(cotacao).replace(',', '.');
//                            String taxaF = df.format(taxa).replace(',', '.');
//                            String realF = df.format(real).replace(',', '.');
//                            String btcF = df.format(btc).replace(',', '.');
//                            String etheF = df.format(ethe).replace(',', '.');
//                            String ripF = df.format(rip).replace(',', '.');
//                            String moeda2F = df.format(moeda2).replace(',','.');
//
//                            resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
//                                    .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
//                                    .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
//                                    .append(" ").append(" ").append(this.Nomecripto("M5")).append(" ").append(moeda2F).append("\n");
//                    }
//                           
//                }if(this.countRow() == 5){
//                    String data = result.getString("data");
//                            Double moeda1 = null;
//                            Double moeda2 = null;
//                            String tipo = result.getString("tipo");
//                            double valor = result.getDouble("valor");
//                            String moeda = result.getString("moeda");
//                            double cotacao = result.getDouble("cotacao");
//                            double taxa = result.getDouble("taxa");
//                            double real = result.getDouble("real");
//                            double btc = result.getDouble("btc");
//                            double ethe = result.getDouble("ethe");
//                            double rip = result.getDouble("rip");
//                            moeda1 = result.getDouble("moedanova1");
//                            if(result.wasNull()){
//                                moeda1 = null;
//                            }
//                            moeda2 = result.getDouble("moedanova2");
//                            if(result.wasNull()){
//                                moeda2 = null;
//                            }
//                            
//                            /*------------------------------------------------*/
//
//                            String valorF = df.format(valor).replace(',', '.');
//                            String cotacaoF = df.format(cotacao).replace(',', '.');
//                            String taxaF = df.format(taxa).replace(',', '.');
//                            String realF = df.format(real).replace(',', '.');
//                            String btcF = df.format(btc).replace(',', '.');
//                            String etheF = df.format(ethe).replace(',', '.');
//                            String ripF = df.format(rip).replace(',', '.');
//                            
//                            if(moeda1 == null && moeda2 == null){
//                                resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
//                                .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
//                                .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
//                                .append("\n");
//                            }if(moeda1 != null && moeda2 == null){
//                                resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
//                                .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
//                                .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
//                                .append(" ").append(" ").append(this.Nomecripto("M4")).append(" ").append(moeda1).append("\n");
//                            }if(moeda1 == null && moeda2 != null){
//                                String moeda2F = df.format(moeda2).replace(',','.');
//                                resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
//                                .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
//                                .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
//                                .append(" ").append(" ").append(this.Nomecripto("M5")).append(" ").append(moeda2F).append("\n");
//                            }if(moeda1 != null && moeda2!= null){
//                                String moeda1F = df.format(moeda1).replace(',','.');
//                                String moeda2F = df.format(moeda2).replace(',','.');
//                                resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
//                                    .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
//                                    .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
//                                    .append(" ").append(" ").append(this.Nomecripto("M4")).append(": ").append(moeda1F).append("  ").append(this.Nomecripto("M5"))
//                                    .append(": ").append(moeda2F).append("\n");
//                            }
//                    }
//                
//                }
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return resultado.toString();
    }
    
    
    public int countRow() throws SQLException{
        int linhas = 0;
        
        String sql = "SELECT COUNT(*) FROM administrador.criptomoedas";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet result = statement.executeQuery();
        if(result.next()){
            linhas = result.getInt(1);
        }else{
            
        }
        
        return linhas;
    }
    
    public String Nomecripto(String id) throws SQLException{
        String moeda = "";
        String sql = "select moeda from administrador.criptomoedas where id = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1,id);
        try(ResultSet result = statement.executeQuery()){
            if(result.next()){
                moeda = result.getString("moeda");
            }else{
                return null;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return moeda;
    }
    
    public String idMoeda() throws SQLException{
        String resultado = "";
        
        String sql = "SELECT id from administrador.criptomoedas WHERE id = ? or id = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1,"M4");
        statement.setString(2,"M5");
        ResultSet result = statement.executeQuery();
        if(result.next()){
            resultado = result.getString(1);
        }else{
            
        }
        return resultado;
    }
    
}
