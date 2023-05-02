package ContaBancaria;

import java.util.Scanner;

public class TestaConta {

	public static void menu() {

		System.out.println("AfroTech Bank.");
		System.out.println("Onde seu dinheiro é convertido em vale aprendizado!!!");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("\n1-Conta Poupança");
		System.out.println("2-Conta Corrente");
		System.out.println("3-Conta Especial");
		System.out.println("4-Conta Empresa");
		System.out.println("5-Conta Estudantil");
		System.out.println("6-Sair");
		System.out.print("\nDigite a opção desejada: ");
	}

	public static void menuDois(float conta, String banco) {
		System.out.println("Onde seu dinheiro é convertido em vale aprendizado!!!");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("\nConta" + "[" + banco + "]");
		System.out.println("\nSaldo Atual: R$ " + conta);
		System.out.println("Conta" + "[" + banco + "]");
		System.out.println("Qual a Operação deseja realizar: - D- Débito ou C-Crédito: ");
	}

	public static void menuContaEmprestimo(float valorEmprestimo) {
		System.out
				.println("Você tem R$ " + valorEmprestimo + " liberado para empréstimo!! Aceitar: S - Sim ou N - Não: ");
	}

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			ContaPoupanca contaP = new ContaPoupanca(1236, "359.594.278-581", 1200, true, 13);
			ContaCorrente contaC = new ContaCorrente(2365, "256.597.365-55", 5600, true);
			ContaEspecial contaE = new ContaEspecial(6593, "954.654.859-25", 50.00f, true);
			ContaEmpresa contaEmpresa = new ContaEmpresa(9820, "365.849.315-59", 20000.36f, true);
			ContaEstudantil contaEstudante = new ContaEstudantil(0023, "259.548.954-25", 1000.00f, true);
			int opcao, dia, movimentoLoop = 10, qtdCheque;
			char movimento, continuar = 'S', solicitarCheque, pegarEmprestimo = 'S';
			float valor, auxLimite, valorEmprestimo;

			menu();
			opcao = input.nextInt();

			switch (opcao) {
			case 1:
				if (contaP.ativo) {
					while (continuar == 'S' || continuar == 's') {
						if (movimentoLoop != 0) {
							if (contaP.saldo > -1) {
								System.out.println("\nDigite o Aniversário da poupança: ");
								dia = input.nextInt();
								contaP.correcao(dia);
								menuDois(contaP.saldo, "Poupança");
								movimento = input.next().charAt(0);
								System.out.println("Valor do Movimento: R$: ");
								valor = input.nextFloat();
								if (movimento == 'D' || movimento == 'd') {
									contaP.debito(valor);
								}
								if (movimento == 'C' || movimento == 'c') {
									contaP.credito(valor);
								}
								movimentoLoop -= 1;
								System.out.println("Continuar: S/N: ");
								continuar = input.next().charAt(0);
							} else {
								System.out.println("Sua conta está negativa!");
								break;
							}
						} else {
							System.out.println("Você atingiu as 10 movimentações disponíveis");
							break;
						}
					}
				} else {
					System.out.println("Sua conta esta inativa!!!");
				}
				break;
			case 2:
				if (contaC.ativo) {
					while (continuar == 'S' || continuar == 's') {
						if (movimentoLoop != 0) {
							if (contaC.saldo > -1) {
								menuDois(contaC.saldo, "Corrente");
								movimento = input.next().charAt(0);
								System.out.println("Valor da movimentação: R$: ");
								valor = input.nextFloat();
								if (movimento == 'D' || movimento == 'd') {
									contaC.debito(valor);
								}
								if (movimento == 'C' || movimento == 'c') {
									contaC.credito(valor);
								}
								movimentoLoop -= 1;
								System.out.println("Continuar S/N: ");
								continuar = input.next().charAt(0);
							} else {
								System.out.println("Conta negativa!!!");
								break;
							}
						} else {
							System.out.println("Você atingiu as 10 movimentações disponíveis");
							break;
						}
					}
					System.out.println("Deseja solicitar cheque especial: S/N ? ");
					solicitarCheque = input.next().charAt(0);
					if (contaC.saldo > 0) {
						if (solicitarCheque == 's' || solicitarCheque == 's') {
							System.out.println("Qual a quantidade de talões que deseja receber:  ");
							qtdCheque = input.nextInt();
							if (qtdCheque <= 3) {
								contaC.pedirTalao(qtdCheque);
								contaC.debito((qtdCheque * 30));
								menuDois(contaC.saldo, "Corrente");
							} else {
								System.out.println("Quantidade de talão limitado a 3 unidades por pedido!");
							}
						}
					} else {
						System.out.println("Conta negativada!!!");
						break;
					}

				} else {
					System.out.println("Conta inativa!!");
				}
				break;
			case 3:
				if (contaE.ativo) {
					contaE.setLimite(1000.00f);
					while (continuar == 's' || continuar == 's') {
						if (movimentoLoop != 0) {
							menuDois(contaE.saldo, "Especial");
							movimento = input.next().charAt(0);
							System.out.println("Valor movimentação: R$: ");
							valor = input.nextFloat();
							if (contaE.getLimite() != 0) {
								if (movimento == 'd' || movimento == 'd') {
									if (contaE.saldo == 0) {
										contaE.usarLimite(valor);
										contaE.saldo = 0;
									}
									if (contaE.saldo < valor && contaE.saldo != 0) {
										valor = valor - contaE.saldo;
										contaE.saldo = 0;
										contaE.usarLimite(valor);
									}
									if (contaE.saldo >= valor) {
										contaE.debito(valor);
									}
									System.out.println("Limite disponivél: " + contaE.getLimite());
									System.out.println("Saldo da Conta Especial: " + contaE.saldo);
								}
								if (movimento == 'c' || movimento == 'c') {

									if (contaE.getLimite() < 1000) {
										auxLimite = 1000 - contaE.getLimite();
										valor = valor - auxLimite;
										contaE.saldo = valor;
										contaE.setLimite(1000.00f);
									}
									if (contaE.getLimite() == 1000) {
										contaE.credito(valor);
									}
									System.out.println("Limite disponível: " + contaE.getLimite());
									System.out.println("Saldo Conta Especial: " + contaE.saldo);
									menuDois(contaE.saldo, "Especial");
								}
							} else {
								System.out.println("Não há mais limite disponível");
								break;
							}
							movimentoLoop -= 1;
							System.out.println("Continuar S/N: ");
							continuar = input.next().charAt(0);
						} else {
							System.out.println("Você atingiu as 10 movimentações disponíveis");
							break;
						}
					}

				} else {
					System.out.println("Conta Inativa");
				}
				break;
			case 4:

				if (contaEmpresa.ativo) {
					contaEmpresa.setEmprestimoEmpresa(10000);
					while (continuar == 's' || continuar == 's') {
						if (movimentoLoop != 0) {
							if (contaEmpresa.saldo > -1) {
								menuDois(contaEmpresa.saldo, "Empresa");
								movimento = input.next().charAt(0);
								System.out.println("Valor movimento: R$: ");
								valor = input.nextFloat();
								if (movimento == 'd' || movimento == 'd') {
									contaEmpresa.debito(valor);
								}
								if (movimento == 'c' || movimento == 'c') {
									contaEmpresa.credito(valor);
								}
								menuContaEmprestimo(contaEmpresa.getEmprestimoEmpresa());
								pegarEmprestimo = input.next().charAt(0);
								if (pegarEmprestimo == 's' || pegarEmprestimo == 's') {
									if (contaEmpresa.getEmprestimoEmpresa() > 0) {
										System.out.println("Valor Empréstimo: ");
										valorEmprestimo = input.nextFloat();
										contaEmpresa.pedriEmprestimo(valorEmprestimo);
										contaEmpresa.saldo += valorEmprestimo;
										System.out.println("Saldo Atual: R$ " + contaEmpresa.saldo);
										System.out.println("Limite disponível: R$ "
												+ contaEmpresa.getEmprestimoEmpresa());
									} else {
										System.out.println("Não há mais limite disponível para empréstimo.");
									}
								}
								movimentoLoop -= 1;
								System.out.println("Continuar S/N: ");
								continuar = input.next().charAt(0);
							} else {
								System.out.println("Conta negativada!");
								break;
							}
						} else {
							if (movimentoLoop == 10) {
								System.out.println("Valor Empréstimo: ");
								valorEmprestimo = input.nextFloat();
								contaEmpresa.pedriEmprestimo(valorEmprestimo);
								System.out.println("Saldo Atual: R$ " + contaEmpresa.saldo);
								System.out.println(
										"Você ainda possui um limite de: R$ " + contaEmpresa.getEmprestimoEmpresa());
							}
							System.out.println("Você atingiu as 10 movimentações disponíveis");
							break;
						}
					}

				} else {
					System.out.println("Conta Inativa!");
				}
				break;
			case 5:
				if (contaEstudante.ativo) {
					contaEstudante.setLimiteEstudantil(5000.00f);
					while (continuar == 's' || continuar == 's') {
						if (movimentoLoop != 0) {
							if (contaEstudante.saldo > -1) {
								menuDois(contaEstudante.saldo, "Estudantil");
								movimento = input.next().charAt(0);
								System.out.println("Valor movimento: R$: ");
								valor = input.nextFloat();
								if (movimento == 'd' || movimento == 'd') {
									contaEstudante.debito(valor);
								}
								if (movimento == 'c' || movimento == 'c') {
									contaEstudante.credito(valor);
								}
								menuContaEmprestimo(contaEstudante.getLimiteEstudantil());
								pegarEmprestimo = input.next().charAt(0);
								if (pegarEmprestimo == 's' || pegarEmprestimo == 's') {
									if (contaEstudante.getLimiteEstudantil() > 0) {
										System.out.println("Valor Empréstimo: ");
										valorEmprestimo = input.nextFloat();
										contaEstudante.usarEstudantil(valorEmprestimo);
										contaEstudante.saldo += valorEmprestimo;
										System.out.println("Saldo Atual: R$ " + contaEstudante.saldo);
										System.out.println("Limite disponível: R$ "
												+ contaEstudante.getLimiteEstudantil());
									} else {
										System.out.println("Não há limite disponível para empréstimo.");
									}
								}
								movimentoLoop -= 1;
								System.out.println("Continuar: S/N: ");
								continuar = input.next().charAt(0);
							} else {
								System.out.println("Conta negativada!");
								break;
							}
						} else {
							if (movimentoLoop == 10) {
								System.out.println("Valor Empréstimo: ");
								valorEmprestimo = input.nextFloat();
								contaEstudante.usarEstudantil(valorEmprestimo);
								System.out.println("Saldo Atual: R$ " + contaEstudante.saldo);
								System.out.println(
										"Limite disponível: R$ " + contaEstudante.getLimiteEstudantil());
							}
							System.out.println("Você atingiu as 10 movimentações disponíveis");
							break;
						}
					}

				} else {
					System.out.println("Conta Inativa.");
				}
				break;
			case 6:
				break;
			}
		}
	}

}
