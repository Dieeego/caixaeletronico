package javaapplication3;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
// by: Diego Magalhães 
// Facebook: facebook.com/Diego.M.Souzaa
public class JavaApplication3 {
	public static void main(String[] args) {
            
        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
        
	String op = null;
        String conta = null;
        String agencia = null;                
        String valor = null;  
        String bancoEsco = null;
        String sacarCP;             
     	String sacarCC;
        String msgJuros = null;
        float totalCC = 0;        // Contador de valores para o total de saques realizados em R$ na Conta Corrente
        float totalCP = 0;       // Contador de valores para o total de saques realizados em R$ na Conta Poupança
        
        float totalContaCC = 0;  //total de contas pagas na conta corrente
        float totalContaCP = 0;  //total de contas pagas na conta poupanca
        
        float totalDpCC = 0;     //total de depositos na conta corrente
        float totalTrCC = 0;    //total de transferencias na conta corrente
        float totalDpCP = 0;    //total de depositos na conta poupanca
        float totalTrCP = 0;    //total de transferencias na conta poupanca
        float juros = 0;
        
        float contaNum = 0;    //Numero da conta a ser paga.
        float valorConta = 0;  //Valor da conta a ser paga
        int qtdCC = 0;         //Contador da quantidade de Saques Cconta Corrente
        int qtdCP = 0;         //Contador da quantidade de Saques Conta Pòupança
        
        int qtdContaCC = 0;   //Contador de contas pagas em cohnta corrente
        int qtdContaCP = 0;   //Contador de contas pagas em conta poupança
        
        int qtdDpCC = 0;      //quantidade de depositos conta corrente
        int qtdTrCC = 0;      //Quantidade transferencia conta corrrente
        int qtdDpCP = 0;      //Quantidade deposito conta poupanca
        int qtdTrCP = 0;      //Quantidade transferencia conta poupanca
        
        float sacarIntCC;     //valor convertido de String para Float
     	float sacarIntCP;     //valor convertido de String para Float
        float valorInt = 0;   //valor do deposito convertido de String para Float
        
        float novoSaldoCCInt = 0;
        float novoSaldoCPInt = 0;
        
        float saldoCC = 6400;
        float saldoCP = 11560;
       
        
        List bancoTRCC = new ArrayList ();
        List contasTRCC = new ArrayList ();
        List valorrTRCC = new ArrayList ();
        List contTRCC = new ArrayList();
        
        List bancoTRCP = new ArrayList ();
        List contasTRCP = new ArrayList ();
        List valorrTRCP = new ArrayList ();
        List contTRCP = new ArrayList();
        List agTRCP = new ArrayList();
        List agTRCC = new ArrayList();
     	       
do{
    if(saldoCC<1000){
        JOptionPane.showMessageDialog(null, "SALDO DA CONTA CORRENTE ABAIXO DE R$1.000.00\n");
    }
    
    if(saldoCP<1000){
        JOptionPane.showMessageDialog(null, "SALDO DA CONTA CORRENTE ABAIXO DE R$1.000.00\n");
    }
    
    String [] valores = {"OPERAÇÃO COM CARTÃO", "OPERAÇÃO SEM CARTÃO"};
    String operacao = (String) JOptionPane.showInputDialog (null,
    "ESCOLHA A OPERAÇÃO ", "CAIXA ELETRONICO", JOptionPane.INFORMATION_MESSAGE, null,
    valores, valores [0]);
    
    switch(operacao){
        case "OPERAÇÃO SEM CARTÃO":
            String [] possibleValues1 = {"Depósito", "Transferência"};
            String selectedValue1 = (String) JOptionPane.showInputDialog (null,
            "ESCOLHA A OPERAÇÃO ", "CAIXA ELETRONICO - SEM CARTÃO", JOptionPane.INFORMATION_MESSAGE, null,
            possibleValues1, possibleValues1 [0]);
            switch(selectedValue1){
                case "Depósito":
                    
                    JOptionPane.showMessageDialog(null, "VOCE ESCOLHEU A OPERACAO DEPOSITO");
                    
                    char erro='s';
                    while(erro=='s'){
                        conta = JOptionPane.showInputDialog("Digite o numero da conta");
                        if(conta.equals("")){
                            JOptionPane.showMessageDialog(null, "Preencha o campo CONTA");
                            }else{
                            erro='n';
                        }
                    }

                    char erro1='s';
                    while(erro1=='s'){
                        agencia = JOptionPane.showInputDialog("Digite o numero da AGENCIA ");
                        if(agencia.equals("")){
                            JOptionPane.showMessageDialog(null, "Preencha o campo AGENCIA");
                            }else{
                            erro1='n';
                        }
                    }

                    char erro2='s';
                    while(erro2=='s'){
                        valor = JOptionPane.showInputDialog("Digite o valor do deposito");
                        if(valor.equals("")){                       
                            JOptionPane.showMessageDialog(null, "Preencha o campo VALOR");
                        }else{
                            valorInt = Float.valueOf(valor);
                            if(valorInt<0){
                                JOptionPane.showMessageDialog(null, "Não serão aceitos valores negativos!");
                            }else{
                                erro2='n';
                            }              
                        }
                    }

                    String texto1 = "DEPÓSITO EFETUADO! \n\n";
                    texto1 += "Conta: "+conta+ "\n";
                    texto1 += "Agência: "+agencia+ "\n Valor: R$"+valorInt+"\n";    
                    JOptionPane.showMessageDialog(null, texto1);
                break;
                
                
                case "Transferência":
                    JOptionPane.showMessageDialog(null, "VOCE ESCOLHEU A OPERACAO TRANSFERÊNCIA");
                    
                    char erro3='s';
                    while(erro3=='s'){
                        conta = JOptionPane.showInputDialog("Digite o número da conta");
                        if(conta.equals("")){
                            JOptionPane.showMessageDialog(null, "Preencha o campo CONTA");
                        }else{
                            erro3='n';     
                        }
                    }
                    char erro4='s';
                    while(erro4=='s'){
                        agencia = JOptionPane.showInputDialog("Digite o número da AGÊNCIA ");
                        if(agencia.equals("")){
                            JOptionPane.showMessageDialog(null, "Preencha o campo AGÊNCIA");
                        }else{                           
                            erro4='n';
                        }
                    }
                    
                    char erro5='s';
                    while(erro5=='s'){
                        valor = JOptionPane.showInputDialog("Digite o valor do depÓsito");
                        if(valor.equals("")){
                            JOptionPane.showMessageDialog(null, "Preencha o campo VALOR");
                        }else{
                            valorInt = Float.valueOf(valor);
                            if(valorInt<0){
                                JOptionPane.showMessageDialog(null, "Não serão aceitos valores negativos!");
                            }else{
                                erro5='n';
                            }  
                        }
                    }
                    
                    String texto2 = "TRANSFERÊNCIA EFETUADA! \n\n";
                    texto2 += "Conta: "+conta+ "\n";
                    texto2 += "Agência: "+agencia+ "\n Valor: R$"+valorInt+"\n";    
                    JOptionPane.showMessageDialog(null, texto2);
                    
                break;                       
            }
        break;
        
        
        case "OPERAÇÃO COM CARTÃO":
            String [] valores1 = {"Depósito", "Transferência", "Saque", "Extrato", "Pagar Conta", "Setar Saldo - ADM"};
            String operacao1 = (String) JOptionPane.showInputDialog (null,
            "ESCOLHA A OPERAÇÃO ", "CAIXA ELETRONICO - COM CARTÃO", JOptionPane.INFORMATION_MESSAGE, null,
            valores1, valores1 [0]);

            switch(operacao1){
  
                case "Depósito":
                    
                    JOptionPane.showMessageDialog(null, "VOCE ESCOLHEU A OPERACAO DEPOSITO");
                    
                    String [] opcao = {"Com a Conta Corrente", "Com a Conta Poupança"};
                    String opcaoEsco = (String) JOptionPane.showInputDialog (null,
                    "ESCOLHA A CONTA A SER DEBITADA O DEPÓSITO ", "CAIXA ELETRONICO - DEPÓSITO", JOptionPane.INFORMATION_MESSAGE, null,
                    opcao, opcao [0]);

                    switch(opcaoEsco){
                        case "Com a Conta Corrente":
                            JOptionPane.showMessageDialog(null, "VOCE ESCOLHEU COM A CONTA CORRENTE - DEPÓSITO");                           
                            
                            char erro='s';
                            while(erro=='s'){
                                conta = JOptionPane.showInputDialog("Digite o número da conta");
                                if(conta.equals("")){
                                    JOptionPane.showMessageDialog(null, "Preencha o campo CONTA");
                                    }else{
                                    erro='n';
                                }
                            }

                            char erro1='s';
                            while(erro1=='s'){
                                agencia = JOptionPane.showInputDialog("Digite o número da AGÊNCIA ");
                                if(agencia.equals("")){
                                    JOptionPane.showMessageDialog(null, "Preencha o campo AGÊNCIA");
                                    }else{
                                    erro1='n';
                                }
                            }

                            char erro2='s';
                            while(erro2=='s'){
                                valor = JOptionPane.showInputDialog("Digite o valor do depósito\n\nSaldo na Conta: R$"+saldoCC+"\n");
                                if(valor.equals("")){                       
                                    JOptionPane.showMessageDialog(null, "Preencha o campo VALOR");
                                }else{                   
                                    valorInt = Float.valueOf(valor);
                                }
                                
                                if(valorInt<=0){
                                    JOptionPane.showMessageDialog(null, "VALORES NEGATIVOS NÃO SERÃO ACEITOS!\nValor Digitado: R$"+valorInt+"\nDIGITE UM NOVO VALOR!");
                                }else{
                                    float resto1 = saldoCC - valorInt;
                                    if(resto1<0){
                                        String texto3 = "SALDO DA CONTA INSUFICIENTE! \n\n";
                                        texto3 += "VALOR SOLICITADO: "+valorInt+ "\n";
                                        texto3 += "VALOR DISPONÍVEL NA CONTA CORRENTE : "+saldoCC+ "\n "
                                                + "Digite um novo valor!";    
                                        }else{
                                        totalDpCC = totalDpCC + valorInt;
                                        qtdDpCC = qtdDpCC + 1;
                                        saldoCC=saldoCC-valorInt;
                                        String texto1 = "DEPÓSITO EFETUADO! \n\n";
                                        texto1 += "Conta: "+conta+ "\n";
                                        texto1 += "Agência: "+agencia+ "\n  Valor: R$"+valorInt+"\n";    
                                        JOptionPane.showMessageDialog(null, texto1);
                                        erro2='n';
                                    }
                                }
                            }
                            
                        break;
                    
                        case "Com a Conta Poupança":
                            JOptionPane.showMessageDialog(null, "VOCE ESCOLHEU COM A CONTA POUPANÇA - DEPÓSITO");
                            
                            char erro3='s';
                            while(erro3=='s'){
                                conta = JOptionPane.showInputDialog("Digite o número da conta");
                                if(conta.equals("")){
                                    JOptionPane.showMessageDialog(null, "Preencha o campo CONTA");
                                    }else{
                                    erro3='n';
                                }
                            }

                            char erro4='s';
                            while(erro4=='s'){
                                agencia = JOptionPane.showInputDialog("Digite o número da AGÊNCIA ");
                                if(agencia.equals("")){
                                    JOptionPane.showMessageDialog(null, "Preencha o campo AGÊNCIA");
                                    }else{
                                    erro4='n';
                                }
                            }

                            char erro5='s';
                            while(erro5=='s'){
                                valor = JOptionPane.showInputDialog("Digite o valor do depósito\n\nSaldo na Conta: R$"+saldoCP+"\n");
                                if(valor.equals("")){                       
                                    JOptionPane.showMessageDialog(null, "Preencha o campo VALOR");
                                }else{
                                    valorInt = Float.valueOf(valor);
                                    
                                }
                                if(valorInt<=0){
                                    JOptionPane.showMessageDialog(null, "VALORES NEGATIVOS NÃO SERÃO ACEITOS!\nValor Digitado: R$"+valorInt+"\nDIGITE UM NOVO VALOR!");
                                }else{
                                    float resto = saldoCP - valorInt;
                                    if(resto<0){
                                        String texto3 = "SALDO DA CONTA INSUFICIENTE! \n\n";
                                        texto3 += "VALOR SOLICITADO: "+valorInt+ "\n";
                                        texto3 += "VALOR DISPONÍVEL NA CONTA POUPANÇA : "+saldoCP+ "\n "
                                                + "Digite um novo valor!";    
                                        }else{
                                        totalDpCP = totalDpCP + valorInt;
                                        qtdDpCP = qtdDpCP + 1;
                                        saldoCP=saldoCP-valorInt;
                                        String texto2 = "DEPÓSITO EFETUADO! \n\n";
                                        texto2 += "Conta: "+conta+ "\n";
                                        texto2 += "Agência: "+agencia+ "\n Valor: R$"+valorInt+"\n";    
                                        JOptionPane.showMessageDialog(null, texto2);
                                        erro5='n';
                                    }
                                }
                            }
                        break;    
                    
                    
                    }
                    
                break;
                
                case "Transferência":
                    JOptionPane.showMessageDialog(null, "VOCE ESCOLHEU A OPERACAO TRANSFERENCIA");
                    
                    String [] opcao1 = {"Com a Conta Corrente", "Com a Conta Poupança"};
                    String opcaoEsco1 = (String) JOptionPane.showInputDialog (null,
                    "ESCOLHA A CONTA A SER DEBITADA A TRANSFERÊNCIA ", "CAIXA ELETRONICO - TRANSFERÊNCIA", JOptionPane.INFORMATION_MESSAGE, null,
                    opcao1, opcao1 [0]);

                    switch(opcaoEsco1){
                        case "Com a Conta Corrente":
                            JOptionPane.showMessageDialog(null, "VOCE ESCOLHEU A OPCÃO CONTA CORRENTE - TRANSFERÊNCIA");
                            
                            
                                String [] bancos = {"Itaú", "Bradesco", "Caixa", "Banco do Brasil", "HSBC", "Santander"};
                                String bancosesco = (String) JOptionPane.showInputDialog (null,
                                "ESCOLHA O BANCO A SER TRANSFERIDO ", "CAIXA ELETRONICO - TRANSFERÊNCIA", JOptionPane.INFORMATION_MESSAGE, null,
                                bancos, bancos [0]);

                                switch(bancosesco){
                                    case "Itaú":
                                        bancoEsco="Itau";
                                    break;
                                    case "Bradesco":
                                        bancoEsco="Bradesco";
                                    break;
                                    case "Caixa":
                                        bancoEsco="Caixa";
                                    break;
                                    case "Banco do Brasil":
                                        bancoEsco="Banco do Brasil";
                                    break;
                                    case "HSBC":
                                        bancoEsco="HSBC";
                                    break;
                                    case "Santander":
                                        bancoEsco="Santander";
                                    break;
                                }
                            
                            char erro='s';
                            while(erro=='s'){
                                conta = JOptionPane.showInputDialog("Digite o número da conta");
                                if(conta.equals("")){
                                    JOptionPane.showMessageDialog(null, "Preencha o campo CONTA");
                                    }else{
                                    erro='n';
                                }
                            }

                            char erro1='s';
                            while(erro1=='s'){
                                agencia = JOptionPane.showInputDialog("Digite o número da AGÊNCIA ");
                                if(agencia.equals("")){
                                    JOptionPane.showMessageDialog(null, "Preencha o campo AGÊNCIA");
                                    }else{
                                    erro1='n';
                                }
                            }

                            char erro3='s';
                            while(erro3=='s'){
                                valor = JOptionPane.showInputDialog("Digite o valor do depósito\n\nSaldo na Conta: R$"+saldoCC+"\n");
                                if(valor.equals("")){                       
                                    JOptionPane.showMessageDialog(null, "Preencha o campo VALOR");
                                }else{
                                    valorInt = Float.valueOf(valor);  
                                }
                                
                                if(valorInt<0){
                                    JOptionPane.showMessageDialog(null, "VALORES NEGATIVOS NÃO SERÃO ACEITOS!\nValor Digitado: R$"+valorInt+"\nDIGITE UM NOVO VALOR!");
                                }else{
                                    float resto = saldoCC - valorInt;
                                    if(resto<0){
                                        String texto3 = "SALDO DA CONTA INSUFICIENTE! \n\n";
                                        texto3 += "VALOR SOLICITADO: "+valorInt+ "\n";
                                        texto3 += "VALOR DISPONÍVEL NA CONTA POUPANÇA : "+saldoCC+ "\n "
                                                + "Digite um novo valor!";    
                                        }else{

                                        totalTrCC = totalTrCC + valorInt;
                                        qtdTrCC = qtdTrCC + 1;
                                        saldoCC=saldoCC-valorInt;
                                        bancoTRCC.add(bancoEsco);
                                        contasTRCC.add(conta);
                                        valorrTRCC.add(valorInt);
                                        agTRCC.add(agencia);
                                        contTRCC.add("Conta Corrente");

                                        String texto1 = "TRANSFERÊNCIA REALIZADA! \n\n";
                                        texto1 += "Conta: "+conta+ "\n";
                                        texto1 += "Agência: "+agencia+ "\n"
                                                + "Valor: R$"+valorInt+"\n"
                                                + "Banco: "+bancoEsco+"\n"; 

                                        JOptionPane.showMessageDialog(null, texto1);
                                        erro3='n';
                                    }
                                }
                            }
                        break;
                    
                        case "Com a Conta Poupança":
                            
                            String [] bancos1 = {"Itaú", "Bradesco", "Caixa", "Banco do Brasil", "HSBC", "Santander"};
                                String bancosesco1 = (String) JOptionPane.showInputDialog (null,
                                "ESCOLHA O BANCO A SER TRANSFERIDO ", "CAIXA ELETRONICO - TRANSFERÊNCIA", JOptionPane.INFORMATION_MESSAGE, null,
                                bancos1, bancos1 [0]);

                                switch(bancosesco1){
                                    case "Itaú":
                                        bancoEsco="Itau";
                                    break;
                                    case "Bradesco":
                                        bancoEsco="Bradesco";
                                    break;
                                    case "Caixa":
                                        bancoEsco="Caixa";
                                    break;
                                    case "Banco do Brasil":
                                        bancoEsco="Banco do Brasil";
                                    break;
                                    case "HSBC":
                                        bancoEsco="HSBC";
                                    break;
                                    case "Santander":
                                        bancoEsco="Santander";
                                    break;
                                }
                            
                            char erro2='s';
                            while(erro2=='s'){
                                conta = JOptionPane.showInputDialog("Digite o número da conta");
                                if(conta.equals("")){
                                    JOptionPane.showMessageDialog(null, "Preencha o campo CONTA");
                                    }else{
                                    erro2='n';
                                }
                            }

                            char erro4='s';
                            while(erro4=='s'){
                                agencia = JOptionPane.showInputDialog("Digite o número da AGÊNCIA ");
                                if(agencia.equals("")){
                                    JOptionPane.showMessageDialog(null, "Preencha o campo AGÊNCIA");
                                    }else{
                                    erro4='n';
                                }
                            }

                            char erro5='s';
                            while(erro5=='s'){
                                valor = JOptionPane.showInputDialog("Digite o valor do depósito\n\nSaldo na Conta: R$"+saldoCP+"\n");
                                if(valor.equals("")){                       
                                    JOptionPane.showMessageDialog(null, "Preencha o campo VALOR");
                                }else{
                                    valorInt = Float.valueOf(valor);
                                }
                                
                                if(valorInt<0){
                                    JOptionPane.showMessageDialog(null, "VALORES NEGATIVOS NÃO SERÃO ACEITOS!\nValor Digitado: R$"+valorInt+"\nDIGITE UM NOVO VALOR!");
                                }else{
                                    float resto2 = saldoCP - valorInt;
                                    if(resto2<0){
                                        String texto3 = "SALDO DA CONTA INSUFICIENTE! \n\n";
                                        texto3 += "VALOR SOLICITADO: "+valorInt+ "\n";
                                        texto3 += "VALOR DISPONÍVEL NA CONTA POUPANÇA : "+saldoCC+ "\n "
                                                + "Digite um novo valor!";    
                                        }else{
                                        totalTrCP = totalTrCP + valorInt;
                                        qtdTrCP = qtdTrCP + 1;
                                        saldoCP=saldoCP-valorInt;
                                        bancoTRCP.add(bancoEsco);
                                        contasTRCP.add(conta);
                                        valorrTRCP.add(valorInt);
                                        agTRCP.add(agencia);
                                        contTRCP.add("Conta Poupança");
                                        String texto2 = "TRANSFERÊNCIA REALIZADA! \n\n";
                                        texto2 += "Conta: "+conta+ "\n";
                                        texto2 += "Agência: "+agencia+ "\n"
                                                + "Valor: R$"+valorInt+"\n"
                                                + "Banco: "+bancoEsco+"\n"
                                                + "Valor Restante: R$"+saldoCP+"\n"; 

                                        JOptionPane.showMessageDialog(null, texto2); 
                                        erro5='n';
                                    }
                                }
                            }                        
                        break;    
                    
                    
                    }
       
                break;
                
                case "Saque":
                    JOptionPane.showMessageDialog(null, "VOCE ESCOLHEU A OPERACAO SAQUE");
                    
                    String texto2 = "SALDO DA SUA CONTA \n\n";
                        texto2 += "CONTA CORRENTE: R$"+saldoCC+ "\n";
                        texto2 += "CONTA POUPANCA: R$"+saldoCP+ "\n\n";
                        JOptionPane.showMessageDialog(null, texto2);
                        
                    String [] valores2 = {"Saque Conta Corrente", "Saque Conta Poupança"};
                    String operacao2 = (String) JOptionPane.showInputDialog (null,
                    "ESCOLHA A CONTA PARA O SAQUE ", "CAIXA ELETRONICO - SAQUE", JOptionPane.INFORMATION_MESSAGE, null,
                    valores2, valores2 [0]);

                    switch(operacao2){                      
                        case "Saque Conta Poupança":
                            JOptionPane.showMessageDialog(null, "VOCE ESCOLHEU SAQUE EM CONTA POUPANÇA");
                                
                            char erro='s';
                            while(erro=='s'){
                                sacarCP = JOptionPane.showInputDialog(null, "Digite o valor a ser sacado\n\nSaldo na Coonta: R$"+saldoCP+"\n");
                                sacarIntCP = Float.valueOf(sacarCP);  //Transforma String em Float
                                float resto  = saldoCP - sacarIntCP;
                                
                                if(sacarIntCP<=0){
                                    JOptionPane.showMessageDialog(null, "VALORES NEGATIVOS NÃO SERÃO ACEITOS!\nValor Digitado: R$"+sacarIntCP+"\nDIGITE UM NOVO VALOR!");
                                }else{
                                   if(resto<0){
                                    String texto3 = "Você não tem dispónivel o valor solicitado! \n\n";
                                    texto3 += "Saldo da Conta: R$"+saldoCP+ "\n";
                                    texto3 += "Valor Solicitado: R$"+sacarIntCP+ "\n";
                                    texto3 += "Digite um novo valor.\n\n";
                                    JOptionPane.showMessageDialog(null, texto3);                                   
                                    }else{
                                        qtdCP = qtdCP+1;
                                        totalCP = totalCP+sacarIntCP; 
                                        saldoCP = saldoCP - sacarIntCP;                                       
                                        String texto4 = "Saque Efetuado! \n\n";
                                        texto4 += "Valor solicitado: R$"+sacarIntCP+ "\n";
                                        texto4 += "Valor restante em CONTA POUPANÇA: R$"+saldoCP+ "\n";
                                        JOptionPane.showMessageDialog(null, texto4); 
                                        erro='n';
                                   }
                                }                         
                                
                            }
                        break;
                            
                        case "Saque Conta Corrente":
                            JOptionPane.showMessageDialog(null, "VOCE ESCOLHEU SAQUE EM CONTA CORRENTE");
                                
                            char erro1='s';
                            while(erro1=='s'){
                                sacarCC = JOptionPane.showInputDialog(null, "Digite o valor a ser sacado\n\nSaldo na Coonta: R$"+saldoCC+"\n");
                                sacarIntCC = Float.valueOf(sacarCC);    //Transforma String em Float
                                float resto  = saldoCC - sacarIntCC;
                                if(sacarIntCC<=0){
                                    JOptionPane.showMessageDialog(null, "VALORES NEGATIVOS NÃO SERÃO ACEITOS!\nValor Digitado: R$"+sacarIntCC+"\nDIGITE UM NOVO VALOR!");
                                }else{
                                   if(resto<0){
                                    String texto3 = "Você não tem dispónivel o valor solicitado! \n\n";
                                    texto3 += "Saldo da Conta: R$"+saldoCC+ "\n";
                                    texto3 += "Valor Solicitado: R$"+sacarIntCC+ "\n";
                                    texto3 += "Digite um novo valor.\n\n";
                                    JOptionPane.showMessageDialog(null, texto3);                                   
                                    }else{
                                        qtdCC = qtdCC+1;
                                        totalCC = totalCC+sacarIntCC; 
                                        saldoCC = saldoCC - sacarIntCC;                                       
                                        String texto4 = "Saque Efetuado! \n\n";
                                        texto4 += "Valor solicitado: R$"+sacarIntCC+ "\n";
                                        texto4 += "Valor restante em CONTA CORRENTE: R$"+saldoCC+ "\n";
                                        JOptionPane.showMessageDialog(null, texto4); 
                                        erro1='n';
                                   }
                                }   
                                
                                }           
                        break;
                        }                   
                break;
                
                case "Extrato":
                    JOptionPane.showMessageDialog(null, "VOCE ESCOLHEU A OPERACAO EXTRATO");
                    
              		
              		String texto5 = "";
                        texto5 += "EXTRATO BANCÁRIO\n\n";
                        texto5 += "\nData    "+data+ "\n";
                        texto5 += "Hora    "+hora+ "\n\n";
                        texto5 += "\nMovimentação da CONTA CORRENTE  \n";
                        texto5 += "Saldo                                                       R$"+saldoCC+ "\n";
                        texto5 += "Total                    SAQUES                    R$"+totalCC+"\n";               
                        texto5 += "Total                    CONTAS PAGAS      R$"+totalContaCC+"\n";
                        texto5 += "Total                    DEPÓSITOS              R$"+totalDpCC+"\n";
                        texto5 += "Total                    TRANSFERÊNCIAS  R$"+totalTrCC+"\n";
                        texto5 += "Quantidade        SAQUES                            "+qtdCC+"\n";
                        texto5 += "Quantidade        CONTAS PAGAS              "+qtdContaCC+"\n";
                        texto5 += "Quantidade        DEPÓSITOS                      "+qtdDpCC+"\n";
                        texto5 += "Quantidade        TRANSFERÊNCIAS          "+qtdTrCC+"\n\n";
                        
                               
              			
                        texto5 += "\nMovimentação da CONTA POUPANÇA    \n";
                        texto5 += "Saldo                                                       R$"+saldoCP+"\n";
                        texto5 += "Total                    SAQUES                    R$"+totalCP+"\n";               
                        texto5 += "Total                    CONTAS PAGAS      R$"+totalContaCP+"\n";
                        texto5 += "Total                    DEPÓSITOS              R$"+totalDpCP+"\n";
                        texto5 += "Total                    TRANSFERÊNCIAS  R$"+totalTrCP+"\n";
                        texto5 += "Quantidade        SAQUES                            "+qtdCP+"\n";
                        texto5 += "Quantidade        CONTAS PAGAS              "+qtdContaCP+"\n";
                        texto5 += "Quantidade        DEPÓSITOS                      "+qtdDpCP+"\n";
                        texto5 += "Quantidade        TRANSFERÊNCIAS          "+qtdTrCP+"\n\n";
                        JOptionPane.showMessageDialog(null, texto5);
                        
                        String texto9 = "";
                        texto9 += "EXTRATO BANCÁRIO\n\n";
                        texto9 += "\nData    "+data+ "\n";
                        texto9 += "Hora    "+hora+ "\n\n";
                        texto9 += "HISTÓRICO DE TRANSAÇÕES DA CONTA CORRENTE\n";
                        for(int i=0 ; i<bancoTRCC.size() && i<contasTRCC.size() && i<valorrTRCC.size() && i<agTRCC.size(); i++){
                        texto9 += "Banco: "+bancoTRCC.get(i)+"\n";
                        texto9 += "Conta: "+contasTRCC.get(i)+" Agência: "+agTRCC.get(i)+"\n";
                        texto9 += "Valor: R$"+valorrTRCC.get(i)+"\n\n";
                        };
                        texto9 += "HISTÓRICO DE TRANSAÇÕES DA CONTA POUPANÇA\n";
                        for(int a=0 ; a<bancoTRCP.size() && a<contasTRCP.size() && a<valorrTRCP.size() && a<agTRCP.size(); a++){
                        texto9 += "Banco: "+bancoTRCP.get(a)+"\n";
                        texto9 += "Conta: "+contasTRCP.get(a)+" Agência: "+agTRCP.get(a)+"\n";
                        texto9 += "Valor: R$"+valorrTRCP.get(a)+"\n\n"; 
                        };
                        JOptionPane.showMessageDialog(null, texto9);
              
              		
                break;
                
                case "Pagar Conta":
                    
                    String texto6 = "Você escolheu Pagar Conta!\n";
                    texto6 += "Saldo da Conta Corrente: R$"+saldoCC+"\n";
                    texto6 += "Saldo da Conta Poupança: R$"+saldoCP+"\n";                  
                    JOptionPane.showMessageDialog(null,texto6);
                    
                    String [] valores3   = {"Conta Corrente", "Conta Poupança"};
                    String operacao3 = (String) JOptionPane.showInputDialog (null,
                    "ESCOLHA A CONTA PARA SER PAGAR A CONTA ", "CAIXA ELETRONICO - PAGAR CONTA", JOptionPane.INFORMATION_MESSAGE, null,
                    valores3, valores3 [0]);

                    switch(operacao3){   
                        case "Conta Corrente":
                            JOptionPane.showMessageDialog(null, "Você escolheu PAGAR CONTA com a Conta Corrente");
                            
                            char erro1='s';
                            while(erro1=='s'){
                            valor = JOptionPane.showInputDialog("Digite o valor da conta a ser paga      Saldo Conta Corrente: R$"+saldoCC+"\n");       
                            if(valor.equals("")){
                                    JOptionPane.showMessageDialog(null, "Preencha o valor da conta  a ser paga\n");
                                }else{
                                    valorConta=Float.valueOf(valor);                                  
                                }
                                if(valorConta<=0){
                                    JOptionPane.showMessageDialog(null, "VALORES NEGATIVOS NÃO SERÃO ACEITOS!\nValor Digitado: R$"+valorConta+"\nDIGITE UM NOVO VALOR!");
                                }else{
                                    float resto = saldoCC - valorConta;
                                    if(resto<0){
                                          JOptionPane.showMessageDialog(null, "Você não tem este valor na conta!\n Digite um novo!");
                                    }else{
                                        erro1='n';
                                    }  
                                }
                            }
                            
                            
                            char erro10='s';
                            while(erro10=='s'){
                              String meses = JOptionPane.showInputDialog(null, "Digite quantos meses a conta está em atraso\n\nCaso a conta estiver em atraso, será cobrado uma taxa de acordo com os meses\n\nCada mês equivale a 5% de juros");
                              Float mesesS = Float.valueOf(meses);
                              if(meses.equals("")){
                                JOptionPane.showMessageDialog(null, "Preencha o Campo de Meses!");
                              }else{
                                  if(mesesS<=0 ||mesesS>12){
                                  JOptionPane.showMessageDialog(null, "MÊS INVÁLIDO!\n SÓ SERÃO ACEITOS MESES ENTRE 1 - 12 \n\nDigite novamente");
                                   }else{
                                      switch(meses){
                                          
                                      case "0":
                                          msgJuros = "Não há juros!";
                                      break;
                                      
                                      case "1":
                                          juros=(float) (valorConta*0.05);
                                          msgJuros = "O Juros é de 5%\n 1 Mês de atraso\n\n Juros: R$"+juros;
                                      break;
                                      case "2":
                                          juros=(float) (valorConta*0.10);
                                          msgJuros = "O Juros é de 10%\n 2 Meses de atraso\n\n Juros: R$"+juros;
                                      break;
                                      case "3":
                                          juros=(float) (valorConta*0.15);
                                          msgJuros = "O Juros é de 15%\n 3 Meses de atraso\n\n Juros: R$"+juros;
                                      break;
                                      case "4":
                                          juros=(float) (valorConta*0.20);
                                          msgJuros = "O Juros é de 20%\n 4 Meses de atraso\n\n Juros: R$"+juros;
                                      break; 
                                      case "5":
                                          juros=(float) (valorConta*0.25);
                                          msgJuros = "O Juros é de 25%\n 5 Meses de atraso\n\n Juros: R$"+juros;
                                      break; 
                                      case "6":
                                          juros=(float) (valorConta*0.30);
                                          msgJuros = "O Juros é de 30%\n 6 Meses de atraso\n\n Juros: R$"+juros;
                                      break; 
                                      case "7":
                                          juros=(float) (valorConta*0.35);
                                          msgJuros = "O Juros é de 10%\n 7 Meses de atraso\n\n Juros: R$"+juros;
                                      break; 
                                      case "8":
                                          juros=(float) (valorConta*0.40);
                                          msgJuros = "O Juros é de 10%\n 8 Meses de atraso\n\n Juros: R$"+juros;
                                      break;
                                      case "9":
                                          juros=(float) (valorConta*0.45);
                                          msgJuros = "O Juros é de 10%\n 9 Meses de atraso\n\n Juros: R$"+juros;
                                      break;
                                      case "10":
                                          juros=(float) (valorConta*0.50);
                                          msgJuros = "O Juros é de 10%\n 10 Meses de atraso\n\n Juros: R$"+juros;
                                      break;
                                      case "11":
                                          juros=(float) (valorConta*0.55);
                                          msgJuros = "O Juros é de 10%\n 11 Meses de atraso\n\n Juros: R$"+juros;
                                      break;
                                      case "12":
                                          juros=(float) (valorConta*0.60);
                                          msgJuros = "O Juros é de 10%\n 12 Meses de atraso\n\n Juros: R$"+juros;
                                      break;   
                                  }
                                erro10='n';    
                                }
                                
                              } 
                            }
                                 
                            char erro2='s';
                            while(erro2=='s'){
                                String contanum = JOptionPane.showInputDialog("Digite o numero da conta");
                                if(contanum.equals("")){
                                    JOptionPane.showMessageDialog(null, "Preencha o campo NUMERO DA CONTA");
                                }else{
                                    contaNum = Float.valueOf(contanum);                                   
                                    float resto= saldoCC - valorConta;
                                    if(resto<0){
                                        String texto3 = "SALDO DA CONTA INSUFICIENTE! \n\n";
                                        texto3 += "VALOR DA CONTA: "+valorInt+ "\n";
                                        texto3 += "VALOR DISPONÍVEL NA CONTA CORRENTE : "+saldoCC+ "\n "
                                                + "Digite um novo valor!";    
                                        }else{
                                        qtdContaCC = qtdContaCC+1;
                                        totalContaCC = totalContaCC + valorConta;
                                        saldoCC = saldoCC -(juros + valorConta);
                                        String texto7 = "CONTA PAGA!\n";
                                        texto7  += "Valor da Conta: R$"+valorConta+"\n";
                                        texto7  += "Numero da Conta: "+contaNum+"\n";
                                        texto7  += msgJuros+"\n";
                                        texto7  += "Valor Restante na Conta Corrente: R$"+saldoCC+"\n";

                                        JOptionPane.showMessageDialog(null, texto7);
                                        erro2='n'; 

                                    }
                                }
                            }

                        break;
                            
                        case "Conta Poupança":
                            JOptionPane.showMessageDialog(null, "Você escolheu PAGAR CONTA com a Conta Poupança");
                            
                            char erro3='s';
                            while(erro3=='s'){
                            valor = JOptionPane.showInputDialog("Digite o valor da conta a ser paga      Saldo da Conta: R$"+saldoCP+"\n");       
                            if(valor.equals("")){
                                    JOptionPane.showMessageDialog(null, "Preencha o valor da conta  a ser paga");
                                }else{
                                    valorConta=Float.valueOf(valor);                                
                                }
                                if(valorConta<=0){
                                    JOptionPane.showMessageDialog(null, "VALORES NEGATIVOS NÃO SERÃO ACEITOS!\nValor Digitado: R$"+valorConta+"\nDIGITE UM NOVO VALOR!");
                                }else{
                                    float resto = saldoCC - valorConta;
                                    if(resto<0){
                                          JOptionPane.showMessageDialog(null, "Você não tem este valor na conta!\n Digite um novo!");
                                    }else{
                                        erro3='n';
                                    }  
                                }
                            }                           
                            
                            char erro14='s';
                            while(erro14=='s'){
                              String meses = JOptionPane.showInputDialog(null, "Digite quantos meses a conta está em atraso\n\nCaso a conta estiver em atraso, será cobrado uma taxa de acordo com os meses\n\nCada mês equivale a 5% de juros");
                              Float mesesS = Float.valueOf(meses);
                              if(meses.equals("")){
                                JOptionPane.showMessageDialog(null, "Preencha o Campo de Meses!");
                              }else{
                                  if(mesesS<=0 ||mesesS>12){
                                  JOptionPane.showMessageDialog(null, "MÊS INVÁLIDO!\n SÓ SERÃO ACEITOS MESES ENTRE 1 - 12 \n\nDigite novamente");
                                   }else{
                                      switch(meses){
                                      case "0":
                                          msgJuros = "Não há juros!";
                                      break;
                                      
                                      case "1":
                                          juros=(float) (valorConta*0.05);
                                          msgJuros = "O Juros é de 5%\n 1 Mês de atraso\n\n Juros: R$"+juros;
                                      break;
                                      case "2":
                                          juros=(float) (valorConta*0.10);
                                          msgJuros = "O Juros é de 10%\n 2 Meses de atraso\n\n Juros: R$"+juros;
                                      break;
                                      case "3":
                                          juros=(float) (valorConta*0.15);
                                          msgJuros = "O Juros é de 15%\n 3 Meses de atraso\n\n Juros: R$"+juros;
                                      break;
                                      case "4":
                                          juros=(float) (valorConta*0.20);
                                          msgJuros = "O Juros é de 20%\n 4 Meses de atraso\n\n Juros: R$"+juros;
                                      break; 
                                      case "5":
                                          juros=(float) (valorConta*0.25);
                                          msgJuros = "O Juros é de 25%\n 5 Meses de atraso\n\n Juros: R$"+juros;
                                      break; 
                                      case "6":
                                          juros=(float) (valorConta*0.30);
                                          msgJuros = "O Juros é de 30%\n 6 Meses de atraso\n\n Juros: R$"+juros;
                                      break; 
                                      case "7":
                                          juros=(float) (valorConta*0.35);
                                          msgJuros = "O Juros é de 10%\n 7 Meses de atraso\n\n Juros: R$"+juros;
                                      break; 
                                      case "8":
                                          juros=(float) (valorConta*0.40);
                                          msgJuros = "O Juros é de 10%\n 8 Meses de atraso\n\n Juros: R$"+juros;
                                      break;
                                      case "9":
                                          juros=(float) (valorConta*0.45);
                                          msgJuros = "O Juros é de 10%\n 9 Meses de atraso\n\n Juros: R$"+juros;
                                      break;
                                      case "10":
                                          juros=(float) (valorConta*0.50);
                                          msgJuros = "O Juros é de 10%\n 10 Meses de atraso\n\n Juros: R$"+juros;
                                      break;
                                      case "11":
                                          juros=(float) (valorConta*0.55);
                                          msgJuros = "O Juros é de 10%\n 11 Meses de atraso\n\n Juros: R$"+juros;
                                      break;
                                      case "12":
                                          juros=(float) (valorConta*0.60);
                                          msgJuros = "O Juros é de 10%\n 12 Meses de atraso\n\n Juros: R$"+juros;
                                      break;   
                                  }
                                erro14='n';    
                                }
                                
                              } 
                            }
                                                        
                            char erro4='s';
                            while(erro4=='s'){
                                String contanum = JOptionPane.showInputDialog("Digite o numero da conta");
                                if(contanum.equals("")){
                                    JOptionPane.showMessageDialog(null, "Preencha o campo NUMERO DA CONTA");
                                }else{
                                    contaNum = Float.valueOf(contanum);                     
                                    float resto1= saldoCP - valorConta;
                                    if(resto1<0){
                                        String texto3 = "SALDO DA CONTA INSUFICIENTE! \n\n";
                                        texto3 += "VALOR DA CONTA: "+valorInt+ "\n";
                                        texto3 += "VALOR DISPONÍVEL NA CONTA CORRENTE : "+saldoCP+ "\n "
                                                + "Digite um novo valor!";    
                                        }else{
                                        qtdContaCP = qtdContaCP+1;
                                        totalContaCP = totalContaCP + valorConta;
                                        saldoCP = saldoCP -(valorConta + juros);
                                        String texto8 = "CONTA PAGA!\n";
                                        texto8  += "Valor da Conta: R$"+valorConta+"\n";
                                        texto8  += "Numero da Conta: "+contaNum+"\n";
                                        texto8  += msgJuros+"\n";
                                        texto8  += "Valor Restante na Conta Corrente: R$"+saldoCP+"\n";

                                        JOptionPane.showMessageDialog(null, texto8);
                                        erro4='n';

                                    }
                                }
                            }
                            
                        break; 

                    }
                break;
                case "Setar Saldo - ADM do Banco":
                    JOptionPane.showMessageDialog(null, "Você escolheu Setar Saldo da conta !");
                    
                    
                    String senha = JOptionPane.showInputDialog("Digite sua senha");
                    Float senhaADM = Float.valueOf(senha);
                    if(senhaADM!=171){
                    JOptionPane.showMessageDialog(null, "Você digitou a senha ERRADA!\n TENTE NOVAMENTE! ");
                    }else{
                        String [] contass   = {"Conta Corrente", "Conta Poupança"};
                        String escolconta = (String) JOptionPane.showInputDialog (null,
                        "ESCOLHA A CONTA PAGA SETAR O SALDO", "CAIXA ELETRONICO - SETAR SALDO", JOptionPane.INFORMATION_MESSAGE, null,
                        contass, contass [0]);

                        switch(escolconta){ 
                            case "Conta Corrente":
                                char erro='s';
                                while(erro=='s'){
                                    String novoSaldoCC = JOptionPane.showInputDialog(null, "DIGITE UM VALOR PARA ADICIONAR SALDO A CONTA CORRENTE\nA quantia atual da conta corrente será somada com o novo valor\n\n Saldo da Conta Corrente: R$"+saldoCC+"\n");
                                    if(novoSaldoCC.equals("")){
                                        JOptionPane.showMessageDialog(null, "Preencha o campo setar saldo!");
                                    }else{
                                        novoSaldoCCInt = Float.valueOf(novoSaldoCC);
                                        if(novoSaldoCCInt<0){
                                            JOptionPane.showMessageDialog(null, "Não será aceito números negativos\n Digite outro valor");
                                        }else{
                                            float saldoAntigoCC = saldoCC;
                                            saldoCC = saldoCC + novoSaldoCCInt;
                                            JOptionPane.showMessageDialog(null, "Saldo Antigo: R$"+saldoAntigoCC+"\nSaldo Novo: R$"+saldoCC+"\n");
                                            erro='n';
                                        }
                                    } 
                                }   
                            break;
                            
                            
                            case "Conta Poupança":
                                char erro1='s';
                                while(erro1=='s'){
                                    String novoSaldoCP = JOptionPane.showInputDialog(null, "DIGITE UM VALOR PARA ADICIONAR SALDO A CONTA CORRENTE\nA quantia atual da conta corrente será somada com o novo valor\n\n Saldo da Conta Corrente: R$"+saldoCC+"\n");
                                    if(novoSaldoCP.equals("")){
                                        JOptionPane.showMessageDialog(null, "Preencha o campo setar saldo!");
                                    }else{
                                        novoSaldoCPInt = Float.valueOf(novoSaldoCP);
                                        if(novoSaldoCPInt<0){
                                            JOptionPane.showMessageDialog(null, "Não será aceito números negativos\n Digite outro valor");
                                        }else{
                                            float saldoAntigoCP = saldoCC;
                                            saldoCC = saldoCP + novoSaldoCPInt;
                                            JOptionPane.showMessageDialog(null, "Saldo Antigo: R$"+saldoAntigoCP+"\nSaldo Novo: R$"+saldoCP+"\n");
                                            erro1='n';
                                        }
                                    } 
                                }         
                            break;    
                        }
                    }         
                break;          
            }
                       
    break;
    }  

}while(op==op);   
   
}
}