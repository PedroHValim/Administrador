/**
 * Este projeto consiste em uma Exchange de Criptomoedas controlado por
 * um administrador , o qual tem as seguintes funções:
▪ Efetuar login
▪ Cadastrar novos investidores
▪ Excluir investidores
▪ Cadastrar novas criptomoedas
▪ Excluir criptomoedas
▪ Consultar saldo de um investidor
▪ Consultar extrato de um investidor
▪ Atualizar cotação das criptomoedas
 *Exchange_Criptomoedas
• O projeto consiste na criação da sua propria Exchange de Criptomoedas. 
* • Exchanges de Criptomoedas são plataformas onde é possível comprar e vender criptomoedas 
* • Uma criptomoeda é um tipo de dinheiro – como outras moedas com as quais 
* convivemos cotidianamente – com a diferença de ser totalmente digital. 
* Além disso, ela não emitida por nenhum governo (como é o caso do real ou do dólar, por exemplo)
A Exchange de Criptomoedas contém essas tres moedas com essas tres taxas: 
* ❑ Bitcoin: ○ Cobra uma taxa de 2% na compra de bitcoin ○ Cobra uma taxa de 3% 
* na venda de bitcoin ❑ Ethereum: ○ Cobra uma taxa de 1% na compra de ethereum 
* ○ Cobra uma taxa de 2% na venda de ethereum ❑ Ripple: ○ Cobra uma taxa de 1% 
* na compra de ripple ○ Cobra uma taxa de 1% na venda de ripple 
 * 
 * 
 * 
 */


package administradorrr;

import View.LoginADMS;

/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */

public class Administradorrr {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        LoginADMS login = new LoginADMS();
        login.setVisible(true);
    }
    
}
