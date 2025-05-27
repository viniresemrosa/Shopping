import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Loja loja=null;
        Produto produto=null;

        System.out.println("Menu:");
        System.out.println("(1) Criar uma Loja.");
        System.out.println("(2) Criar um Produto.");
        System.out.println("(3) Sair");
        System.out.println("Escolha uma opção:");
        int opcao= scanner.nextInt();

        switch(opcao){
            case 1: {
                System.out.print("Nome da loja: ");
                String nomeLoja = scanner.nextLine();
                System.out.print("Quantidade de funcionários: ");
                int qtdFunc = scanner.nextInt();
                System.out.print("Salário base dos funcionários: ");
                double salario = scanner.nextDouble();
                
                // Endereço
                System.out.print("Rua: ");
                String rua = scanner.nextLine();
                System.out.print("Cidade: ");
                String cidade = scanner.nextLine();
                System.out.print("Estado: ");
                String estado = scanner.nextLine();
                System.out.print("País: ");
                String pais = scanner.nextLine();
                System.out.print("CEP: ");
                String cep = scanner.nextLine();
                System.out.print("Número: ");
                String numero = scanner.nextLine();
                System.out.print("Complemento: ");
                String complemento = scanner.nextLine();
                
                Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);
                
                // Data fundação
                System.out.print("Dia da fundação: ");
                int diaFund = scanner.nextInt();
                System.out.print("Mês da fundação: ");
                int mesFund = scanner.nextInt();
                System.out.print("Ano da fundação: ");
                int anoFund = scanner.nextInt();
                
                Data dataFundacao = new Data(diaFund, mesFund, anoFund);
                 System.out.print("Quantidade máxima de produtos da loja: ");
                    int qtdMaxProdutos = scanner.nextInt();
                loja = new Loja(nomeLoja, qtdFunc, salario, endereco, dataFundacao, qtdMaxProdutos);
                System.out.println("Loja criada com sucesso!\n");
            }

            case 2: {
                System.out.print("Nome do produto: ");
                String nomeProduto = scanner.nextLine();
                System.out.print("Preço: ");
                double preco = scanner.nextDouble();
                
                System.out.print("Dia da validade: ");
                int diaVal = scanner.nextInt();
                System.out.print("Mês da validade: ");
                int mesVal = scanner.nextInt();
                System.out.print("Ano da validade: ");
                int anoVal = scanner.nextInt();
                scanner.nextLine(); // limpar buffer
                Data validade = new Data(diaVal, mesVal, anoVal);
                
                produto = new Produto(nomeProduto, preco, validade);
                System.out.println("Produto criado com sucesso!\n");
            }

            case 3: {
                System.out.println("Encerrando...");
                scanner.close();
                return;
            }

            default: System.out.println("Opção inválida.\n");
            }
            if (loja != null && produto != null) {
                Data dataReferencia = new Data(20, 10, 2023);
                System.out.println(produto.estaVencido(dataReferencia) ? "PRODUTO VENCIDO" : "PRODUTO NÃO VENCIDO");
                System.out.println("\n--- Informações da Loja ---");
                System.out.println(loja);
                loja = null; // para não imprimir novamente sem criar nova loja
                produto = null; // idem
            }

        }
    }
