package Controller;

import DAO.AdmDAO;
import DAO.Conexao;
import Model.Administrador;
import View.AtualizarCotaçoes;
import View.CadastrarNovaCripto;
import View.CadastrarUsuario;
import View.CadastrarUsuario2;
import View.CadastrarUsuario2b;
import View.CadastrarUsuario3;
import View.ConsultarExtrato;
import View.ExcluirInvestidor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author thelm
 */
public class Controle {
    
     Administrador pessoa;
    
    public Controle(Administrador pessoa){
        this.pessoa = pessoa;
        
    }
    
    public String data(){
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm");
        return  sdf.format(data);
    }
    
    public void Cotacoes() throws SQLException{              
        if(this.Contador() == 3){      
            DecimalFormat df = new DecimalFormat("0.000");
            double cotbit = pessoa.getCotbit(),
                    cotethe = pessoa.getCotethe(),
                    cotripple = pessoa.getCotrip();
            Random AleBitcoin = new Random();
            Random AleEthe = new Random();
            Random AleRipple = new Random();
            int valorbit = AleBitcoin.nextInt(2),valorethe = AleEthe.nextInt(2),valorripple = AleRipple.nextInt(2);
            if(valorbit == 1){cotbit = cotbit + cotbit*(0.05);}else{cotbit = cotbit - cotbit*(0.05);}
            if(valorethe == 1){cotethe = cotethe + cotethe*(0.05);}else{cotethe = cotethe - cotethe*(0.05);}
            if(valorripple == 1){cotripple = cotripple + cotripple*(0.05);}else{cotripple = cotripple - cotripple*(0.05);}
            pessoa.setCotbit(cotbit);
            pessoa.setCotethe(cotethe);
            pessoa.setCotrip(cotripple);
            AtualizarCotaçoes cotacoes = new AtualizarCotaçoes(pessoa);
            cotacoes.setVisible(true);
            this.SalvarCot("M1", cotbit);
            this.SalvarCot("M2", cotethe);
            this.SalvarCot("M3", cotripple);
            String cotbittxt = df.format(pessoa.getCotbit()).replace(',', '.');
            String cotethetxt = df.format(pessoa.getCotethe()).replace(',', '.');
            String cotriptxt = df.format(pessoa.getCotrip()).replace(',', '.');
            cotacoes.TxtPaneCotacoes.setText("\n\nNova cotação BITCOIN: " + cotbittxt + "\n\nNova cotação ETHEREUM: " + cotethetxt + 
                                     "\n\nNova cotação RIPPLE: " + cotriptxt);
            
        }if(this.Contador() == 4){
            if(this.idMoeda().equals("M4")){               
                DecimalFormat df = new DecimalFormat("0.000");        
                double cotbit = pessoa.getCotbit(),
                    cotethe = pessoa.getCotethe(),
                    cotripple = pessoa.getCotrip(),
                    cotmoeda1 = pessoa.getCotmoeda1();
                Random AleBitcoin = new Random();
                Random AleEthe = new Random();
                Random AleRipple = new Random();
                Random AleMoeda1 = new Random();
                int valorbit = AleBitcoin.nextInt(2),valorethe = AleEthe.nextInt(2),valorripple = AleRipple.nextInt(2),valormoeda1 = AleMoeda1.nextInt(2);
                if(valorbit == 1){cotbit = cotbit + cotbit*(0.05);}else{cotbit = cotbit - cotbit*(0.05);}
                if(valorethe == 1){cotethe = cotethe + cotethe*(0.05);}else{cotethe = cotethe - cotethe*(0.05);}
                if(valorripple == 1){cotripple = cotripple + cotripple*(0.05);}else{cotripple = cotripple - cotripple*(0.05);}
                if(valormoeda1 == 1){cotmoeda1 = cotmoeda1 + cotmoeda1*(0.05);}else{cotmoeda1 = cotmoeda1 - cotmoeda1*(0.05);}
                pessoa.setCotbit(cotbit);
                pessoa.setCotethe(cotethe);
                pessoa.setCotrip(cotripple);
                pessoa.setCotmoeda1(cotmoeda1);
                AtualizarCotaçoes cotacoes = new AtualizarCotaçoes(pessoa);
                cotacoes.setVisible(true);
                this.SalvarCot("M1", cotbit);
                this.SalvarCot("M2", cotethe);
                this.SalvarCot("M3", cotripple);
                this.SalvarCot("M4", cotmoeda1);
                String cotbittxt = df.format(pessoa.getCotbit()).replace(',', '.');
                String cotethetxt = df.format(pessoa.getCotethe()).replace(',', '.');
                String cotriptxt = df.format(pessoa.getCotrip()).replace(',', '.');
                String cotmoeda1txt = df.format(pessoa.getCotmoeda1()).replace(',', '.');
                
                cotacoes.TxtPaneCotacoes.setText("\n\nNova cotação BITCOIN: " + cotbittxt + "\n\nNova cotação ETHEREUM: " + cotethetxt + 
                                     "\n\nNova cotação RIPPLE: " + cotriptxt + "\n\nNova cotação " + this.NomeCripto("M4") + ": " + cotmoeda1txt);
                
                
            }if(this.idMoeda().equals("M5")){                
                    DecimalFormat df = new DecimalFormat("0.000");        
                    double cotbit = pessoa.getCotbit(),
                            cotethe = pessoa.getCotethe(),
                            cotripple = pessoa.getCotrip(),
                            cotmoeda2 = pessoa.getCotmoeda2();
                    Random AleBitcoin = new Random();
                    Random AleEthe = new Random();
                    Random AleRipple = new Random();
                    Random AleMoeda2 = new Random();
                    int valorbit = AleBitcoin.nextInt(2),valorethe = AleEthe.nextInt(2),valorripple = AleRipple.nextInt(2),valormoeda2 = AleMoeda2.nextInt(2);
                    if(valorbit == 1){cotbit = cotbit + cotbit*(0.05);}else{cotbit = cotbit - cotbit*(0.05);}
                    if(valorethe == 1){cotethe = cotethe + cotethe*(0.05);}else{cotethe = cotethe - cotethe*(0.05);}
                    if(valorripple == 1){cotripple = cotripple + cotripple*(0.05);}else{cotripple = cotripple - cotripple*(0.05);}
                    if(valormoeda2 == 1){cotmoeda2 = cotmoeda2 + cotmoeda2*(0.05);}else{cotmoeda2 = cotmoeda2 - cotmoeda2*(0.05);}
                    pessoa.setCotbit(cotbit);
                    pessoa.setCotethe(cotethe);
                    pessoa.setCotrip(cotripple);
                    pessoa.setCotmoeda2(cotmoeda2);
                    AtualizarCotaçoes cotacoes = new AtualizarCotaçoes(pessoa);
                    cotacoes.setVisible(true);
                    this.SalvarCot("M1", cotbit);
                    this.SalvarCot("M2", cotethe);
                    this.SalvarCot("M3", cotripple);
                    this.SalvarCot("M5", cotmoeda2);
                    String cotbittxt = df.format(pessoa.getCotbit()).replace(',', '.');
                    String cotethetxt = df.format(pessoa.getCotethe()).replace(',', '.');
                    String cotriptxt = df.format(pessoa.getCotrip()).replace(',', '.');
                    String cotmoeda2txt = df.format(pessoa.getCotmoeda2()).replace(',', '.');
                    
                    cotacoes.TxtPaneCotacoes.setText("\n\nNova cotação BITCOIN: " + cotbittxt + "\n\nNova cotação ETHEREUM: " + cotethetxt + 
                                         "\n\nNova cotação RIPPLE: " + cotriptxt + "\n\nNova cotação " + this.NomeCripto("M5") + ": " + cotmoeda2txt);
            }
        }if(this.Contador() == 5){
            
                    DecimalFormat df = new DecimalFormat("0.000");        
                    double cotbit = pessoa.getCotbit(),
                            cotethe = pessoa.getCotethe(),
                            cotripple = pessoa.getCotrip(),
                            cotmoeda1 = pessoa.getCotmoeda1(),
                            cotmoeda2 = pessoa.getCotmoeda2();
                    
                    Random AleBitcoin = new Random();
                    Random AleEthe = new Random();
                    Random AleRipple = new Random();
                    Random AleMoeda1 = new Random();
                    Random AleMoeda2 = new Random();
                    int valorbit = AleBitcoin.nextInt(2),valorethe = AleEthe.nextInt(2),
                            valorripple = AleRipple.nextInt(2),valormoeda1 = AleMoeda1.nextInt(2),valormoeda2 = AleMoeda2.nextInt(2);
                    if(valorbit == 1){cotbit = cotbit + cotbit*(0.05);}else{cotbit = cotbit - cotbit*(0.05);}
                    if(valorethe == 1){cotethe = cotethe + cotethe*(0.05);}else{cotethe = cotethe - cotethe*(0.05);}
                    if(valorripple == 1){cotripple = cotripple + cotripple*(0.05);}else{cotripple = cotripple - cotripple*(0.05);}
                    if(valormoeda1 == 1){cotmoeda1 = cotmoeda1 + cotmoeda1*(0.05);}else{cotmoeda1 = cotmoeda1 - cotmoeda1*(0.05);}
                    if(valormoeda2 == 1){cotmoeda2 = cotmoeda2 + cotmoeda2*(0.05);}else{cotmoeda2 = cotmoeda2 - cotmoeda2*(0.05);}
                    
                    pessoa.setCotbit(cotbit);
                    pessoa.setCotethe(cotethe);
                    pessoa.setCotrip(cotripple);
                    pessoa.setCotmoeda1(cotmoeda1);
                    pessoa.setCotmoeda2(cotmoeda2);
                    AtualizarCotaçoes cotacoes = new AtualizarCotaçoes(pessoa);
                    cotacoes.setVisible(true);
                    this.SalvarCot("M1", cotbit);
                    this.SalvarCot("M2", cotethe);
                    this.SalvarCot("M3", cotripple);
                    this.SalvarCot("M4", cotmoeda1);
                    this.SalvarCot("M5", cotmoeda2);
                    String cotbittxt = df.format(pessoa.getCotbit()).replace(',', '.');
                    String cotethetxt = df.format(pessoa.getCotethe()).replace(',', '.');
                    String cotriptxt = df.format(pessoa.getCotrip()).replace(',', '.');
                    String cotmoeda1txt = df.format(pessoa.getCotmoeda1()).replace(',','.');
                    String cotmoeda2txt = df.format(pessoa.getCotmoeda2()).replace(',', '.');
                    cotacoes.TxtPaneCotacoes.setText("\n\nNova cotação BITCOIN: " + cotbittxt + "\n\nNova cotação ETHEREUM: " + cotethetxt + 
                                         "\n\nNova cotação RIPPLE: " + cotriptxt + "\n\nNova cotação " + this.NomeCripto("M4") + ": " + cotmoeda1txt +
                                         "\n\nNova cotação " + this.NomeCripto("M5") + ": " + cotmoeda2txt);
            
        }
    }
    
    public void SalvarCot(String id,double cot){
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            AdmDAO dao = new AdmDAO(conn);
            dao.atualizarCot(pessoa, id, cot);
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Erro de conexão!","Connection",ERROR_MESSAGE);
        }
    }
    
    public String ConsultarSaldo(String cpf){
         Conexao conexao = new Conexao();
         String resultado = "";
        try{
            Connection conn = conexao.getConnection();
            AdmDAO dao = new AdmDAO(conn);
            resultado = dao.consultarsaldo(cpf);
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Erro de conexão!","Connection",ERROR_MESSAGE);
        }
        return resultado;
    }
    
        public String ConsultarExtrato(String cpf) throws SQLException{  
        ConsultarExtrato extrato = new ConsultarExtrato(this,pessoa);
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConnection();
        AdmDAO dao = new AdmDAO(conn);
        String Results = "";  
        try{
            ResultSet res = dao.consultarcpf(cpf);
            if(res.next()){
                Results = dao.consultarExtrato(cpf);
                JOptionPane.showMessageDialog(extrato, "Usuario Encontrado!");
            } else{
                JOptionPane.showMessageDialog(extrato, "Usuario não Encontrado!");
                extrato.TxtCPFExtrato.setText("");
                extrato.TxtAreaExtrato.setText("");
            }
        } catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(extrato, "Erro de conexao!");
        }
        return Results;
    }
        
    public void InserirUsuario(String nome, String cpf, String senha,double reais, 
        double bitcoin, double ethe, double ripple,double moeda1,double moeda2) throws SQLException{
        CadastrarUsuario addusu = new CadastrarUsuario(pessoa,this);
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConnection();
        AdmDAO dao = new AdmDAO(conn);
        if(dao.countRow() == 3){
            CadastrarUsuario cadastro = new CadastrarUsuario(pessoa,this);
            try{
                String cpfcomp = cpf;
                String senhacomp = senha;
                cpfcomp = cpf.replaceAll("[.-]", "");
                if (cpfcomp.length() != 11 || !Pattern.matches("\\d{6}", senhacomp)) {
                    JOptionPane.showMessageDialog(cadastro, "CPF ou senha inválidos. O CPF deve ter 11 dígitos e a senha deve ter 6 dígitos.");
                    return;
                }
                dao.inserir(nome, cpf, senha, reais, bitcoin, ethe, ripple,0,0);
                JOptionPane.showMessageDialog(addusu, "Usuario Cadastrado!");
            }catch(SQLException e){
                System.out.println(e);
                JOptionPane.showMessageDialog(addusu, "Erro de conexão!");
            }
        }else if(dao.countRow() == 4 || dao.countRow() == 5){
                if(dao.idMoeda().equals("M4")){
                    CadastrarUsuario2 cadastro = new CadastrarUsuario2(pessoa,this);
                    String cpfcomp = cpf;
                    String senhacomp = senha;
                    cpfcomp = cpf.replaceAll("[.-]", "");
                    if (cpfcomp.length() != 11 || !Pattern.matches("\\d{6}", senhacomp)) {
                        JOptionPane.showMessageDialog(cadastro, "CPF ou senha inválidos. O CPF deve ter 11 dígitos e a senha deve ter 6 dígitos.");
                        return;
                    }
                    try{
                    dao.inserir(nome, cpf, senha, reais, bitcoin, ethe, ripple,moeda1,moeda2);
                    JOptionPane.showMessageDialog(addusu, "Usuario Cadastrado!");
                    }catch(SQLException e){
                        System.out.println(e);
                        JOptionPane.showMessageDialog(addusu, "Erro de conexão!");
                    }
                }else if(dao.idMoeda().equals("M5")){
                    CadastrarUsuario2b cadastro = new CadastrarUsuario2b(pessoa,this);
                    String cpfcomp = cpf;
                    String senhacomp = senha;
                    cpfcomp = cpf.replaceAll("[.-]", "");
                    if (cpfcomp.length() != 11 || !Pattern.matches("\\d{6}", senhacomp)) {
                        JOptionPane.showMessageDialog(cadastro, "CPF ou senha inválidos. O CPF deve ter 11 dígitos e a senha deve ter 6 dígitos.");
                        return;
                    }
                    try{
                        dao.inserir(nome, cpf, senha, reais, bitcoin, ethe, ripple,moeda1,moeda2);
                        JOptionPane.showMessageDialog(addusu, "Usuario Cadastrado!");
                    }catch(SQLException e){
                        System.out.println(e);
                        JOptionPane.showMessageDialog(addusu, "Erro de conexão!");
            }
                }               
        }
    }
    
    public void ExluirUsuario(String Cpf){
        ExcluirInvestidor excluirusu = new ExcluirInvestidor(this,pessoa);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            AdmDAO dao = new AdmDAO(conn);
            dao.excluir(Cpf);
            JOptionPane.showMessageDialog(excluirusu, "Usuario Excluido!");
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(excluirusu, "Erro de conexão!");
        }
    }
    
    public void InserirCripto(String id,String nome, double cotacao, double taxacompra, double taxavenda){
        CadastrarNovaCripto nova = new CadastrarNovaCripto(this);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            AdmDAO dao = new AdmDAO(conn);
            dao.inserirCripto(id, nome, cotacao, taxacompra, taxavenda);
            JOptionPane.showMessageDialog(nova, "Criptomoeda adicionada!");
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(nova, "Erro de conexão!");
        }
    }
    
    public void ExcluirCripto(String id){
        CadastrarNovaCripto nova = new CadastrarNovaCripto(this);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            AdmDAO dao = new AdmDAO(conn);
            dao.excluirCripto(id);
            JOptionPane.showMessageDialog(nova, "Criptomoeda excluida!");
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(nova, "Erro de conexão!");
        }
    }
    
    public int Contador() throws SQLException{
        int linhas = 0;
        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            AdmDAO dao = new AdmDAO(conn);
            linhas = dao.countRow();
        }catch(SQLException e){
        System.out.println(e);
        }
        return linhas;
    }
    
    public String idMoeda() throws SQLException{
        String resultado = "";
        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            AdmDAO dao = new AdmDAO(conn);
            resultado = dao.idMoeda();
        }catch(SQLException e){
        System.out.println(e);
        }
        return resultado;
    }
    
    public String NomeCripto(String id) throws SQLException{
        String resultado = "";
        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            AdmDAO dao = new AdmDAO(conn);
            resultado = dao.Nomecripto(id);
        }catch(SQLException e){
        System.out.println(e);
        }
        return resultado;
    }
    
    public void MenuCadastrarUsu() throws SQLException{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            AdmDAO dao = new AdmDAO(conn);
            if(dao.countRow() == 3){
                CadastrarUsuario cadastro = new CadastrarUsuario(pessoa,this);
                cadastro.setVisible(true);
            }else if(dao.countRow() == 4){
                if(dao.idMoeda().equals("M4")){
                    CadastrarUsuario2 cadastro = new CadastrarUsuario2(pessoa,this);
                    cadastro.setVisible(true);
                }else if(dao.idMoeda().equals("M5")){
                    CadastrarUsuario2b cadastro = new CadastrarUsuario2b(pessoa,this);
                    cadastro.setVisible(true);
                }
            }else if(dao.countRow() == 5){
                CadastrarUsuario3 cadastro = new CadastrarUsuario3(pessoa,this);
                cadastro.setVisible(true);
            }
    }
    
}
