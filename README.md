# Caixa Eletronico
Simulador de Caixa Eletrônico Simples em Java - Projeto Faculdade

O projeto desenvolvido em java simula um caixa eletrônico simples. Com as funções de operações com cartao ou sem cartão e junto a operação de "com cartão", as opções de realizar a operação com a conta corrente ou conta poupança.

Operações do caixa:
  Sem cartão: Depósito e Transferência.
  Com cartão: Depósito, Transferência, Saque, Extrato, Pagar Conta, e Setar saldo.
Na operação "sem cartão" há uma verificação que nao aceita valor negativo e não aceita o campo nulo.
Na operação "com cartão", há algumas funções, tais como:
  - Não aceita valores negativos;
  - Não aceita campo nulo;
  - Avisa quando o saldo da conta corrente ou conta poupança estiver abaixo de R$ 1.000,00;
  - Não permite o saque, transferência, depósito e pegar conta caso o usuario nao tenha o valor na conta;
  - Para o pagamento de contas, voce terá que colocar quantos meses a conta está em atraso, caso estiver em atraso, será cobrado uma taxa de acordo com os meses que esta em atraso, caso contrario, nao será cobrado nenhuma taxa;
  - Na opção "Extrato":
    - Mostra hora e data;
    - Mostra a quantidade o total de saques/depósitos/transferências realizadas na conta poupança e na conta corrente;
    - Mostra o histórico de transações realizadas na conta corrente e na conta poupança, mostrando o numero da conta/agencia, valor da transferência e o banco escolhido.
  - Na operação "Setar Saldo" você pode setar o saldo da conta corrente ou da conta poupança, mas somente se possuir a senha de administrador, caso contrario, nao será possivel setar o saldo. Senha para setar o saldo: 171.
