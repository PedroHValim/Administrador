
package Controller;

import DAO.Conexao;
import Model.Administrador;
import Model.ExtratoModel;
import View.LoginADMS;
import DAO.AdmDAO;
import View.Menu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */

public class ControleLogin {

    private LoginADMS login;
        
    /**
     *
     * @param login
     */
    public ControleLogin(LoginADMS login){
        this.login = login;
    }
    
    /**
     *
     */
    public void LoginADM(){
        int linhas = 0;
        Conexao conexao = new Conexao();
        String cpf = login.getTxtCpf().getText();
        String senha = login.getTxtSenha().getText();
        cpf = cpf.replaceAll("[.-]", "");
        if (cpf.length() != 11 || !Pattern.matches("\\d{6}", senha)) {
            JOptionPane.showMessageDialog(login, "CPF ou senha inválidos. O CPF deve ter 11 dígitos e a senha deve ter 6 dígitos.");
            return;
        }
        
        Administrador pessoa = new Administrador(null, cpf, senha);
        
        try{
            Connection conn = conexao.getConnection();
            AdmDAO dao = new AdmDAO(conn);
            linhas = dao.countRow();     
            if(linhas == 3){
                try{
                    ResultSet res = dao.consultar(pessoa);
                    ResultSet res2 = dao.consultarCot("M1");
                    ResultSet res3 = dao.consultarCot("M2");
                    ResultSet res4 = dao.consultarCot("M3");
                    if(res.next()){
                        JOptionPane.showMessageDialog(login, "Login feito!");
                        String nome = res.getString("nome");
                        double cotbtc = res2.getDouble("cotacao");
                        double cotethe = res3.getDouble("cotacao");
                        double cotrip = res4.getDouble("cotacao");
                        ExtratoModel extrato = new ExtratoModel();
                        Administrador pessoafinal = new Administrador(cotbtc,cotethe,cotrip,extrato,nome,login.getTxtCpf().getText(),login.getTxtSenha().getText());
                        login.setVisible(false);
                        Menu menu = new Menu(pessoafinal);
                        menu.setVisible(true);
                    } else{
                        JOptionPane.showMessageDialog(login, "Login falhou!");
                    }
                }catch(SQLException e){
                    System.out.println(e);
                    JOptionPane.showMessageDialog(login, "Erro de conexao!");
        }
            }else if(linhas == 4){
                System.out.println(dao.idMoeda());
                if(dao.idMoeda().equals("M4")){           
                    try{
                        ResultSet res = dao.consultar(pessoa);
                        ResultSet res2 = dao.consultarCot("M1");
                        ResultSet res3 = dao.consultarCot("M2");
                        ResultSet res4 = dao.consultarCot("M3");
                        ResultSet res5 = dao.consultarCot("M4");
                        if(res.next()){
                            JOptionPane.showMessageDialog(login, "Login feito!");
                            String nome = res.getString("nome");
                            double cotbtc = res2.getDouble("cotacao");
                            double cotethe = res3.getDouble("cotacao");
                            double cotrip = res4.getDouble("cotacao");
                            double cotmoeda1 = res5.getDouble("cotacao");
                            ExtratoModel extrato = new ExtratoModel();
                            Administrador pessoafinal = new Administrador(cotbtc,cotethe,cotrip,cotmoeda1,extrato,nome,login.getTxtCpf().getText(),login.getTxtSenha().getText());
                            login.setVisible(false);
                            System.out.println(dao.countRow());
                            Menu menu = new Menu(pessoafinal);
                            menu.setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(login, "Login falhou!");
                        }
                    }catch(SQLException e){
                        System.out.println(e);
                        JOptionPane.showMessageDialog(login, "Erro de conexao!");
                    }
                }else if(dao.idMoeda().equals("M5")){
                    try{
                        ResultSet res = dao.consultar(pessoa);
                        ResultSet res2 = dao.consultarCot("M1");
                        ResultSet res3 = dao.consultarCot("M2");
                        ResultSet res4 = dao.consultarCot("M3");
                        ResultSet res6 = dao.consultarCot("M5");
                        if(res.next()){
                            JOptionPane.showMessageDialog(login, "Login feito!");
                            String nome = res.getString("nome");
                            double cotbtc = res2.getDouble("cotacao");
                            double cotethe = res3.getDouble("cotacao");
                            double cotrip = res4.getDouble("cotacao");
                            double cotmoeda2 = res6.getDouble("cotacao");
                            ExtratoModel extrato = new ExtratoModel();
                            Administrador pessoafinal = new Administrador(cotbtc,cotethe,cotrip,cotmoeda2,extrato,nome,login.getTxtCpf().getText(),login.getTxtSenha().getText());
                            login.setVisible(false);
                            System.out.println(dao.countRow());
                            Menu menu = new Menu(pessoafinal);
                            menu.setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(login, "Login falhou!");
                        }
                    }catch(SQLException e){
                        System.out.println(e);
                        JOptionPane.showMessageDialog(login, "Erro de conexao!");
                    }
                }
                
            }else if(linhas == 5){
                try{
                    ResultSet res = dao.consultar(pessoa);
                    ResultSet res2 = dao.consultarCot("M1");
                    ResultSet res3 = dao.consultarCot("M2");
                    ResultSet res4 = dao.consultarCot("M3");
                    ResultSet res5 = dao.consultarCot("M4");
                    ResultSet res6 = dao.consultarCot("M5");
                    if(res.next()){
                        JOptionPane.showMessageDialog(login, "Login feito!");
                        String nome = res.getString("nome");
                        double cotbtc = res2.getDouble("cotacao");
                        double cotethe = res3.getDouble("cotacao");
                        double cotrip = res4.getDouble("cotacao");
                        double cotmoeda1 = res5.getDouble("cotacao");
                        double cotmoeda2 = res6.getDouble("cotacao");
                        ExtratoModel extrato = new ExtratoModel();
                        Administrador pessoafinal = new Administrador(cotbtc,cotethe,cotrip,cotmoeda1,cotmoeda2,extrato,nome,login.getTxtCpf().getText(),login.getTxtSenha().getText());
                        login.setVisible(false);
                        System.out.println(dao.countRow());
                        Menu menu = new Menu(pessoafinal);
                        menu.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(login, "Login falhou!");
                    }
                }catch(SQLException e){
                    System.out.println(e);
                    JOptionPane.showMessageDialog(login, "Erro de conexao!");
                }
            }
            
        }catch(SQLException e){
            System.out.println(e);
        } 
    }
    
}
