import java.util.Scanner;

public class valida_pessoa {
        public static boolean isCPF(String CPF) {
            // Verifica se o CPF tem 11 dígitos
            if (CPF == null || CPF.length() != 11 || !CPF.matches("\\d{11}")) {
                return false;
            }
    
            // Verifica se todos os dígitos são iguais
            if (CPF.matches("(\\d)\\1{10}")) {
                return false;
            }
    
            try {
                int[] digitos = new int[11];
                for (int i = 0; i < 11; i++) {
                    digitos[i] = Integer.parseInt(CPF.substring(i, i + 1));
                }
    
                // Calcula o primeiro dígito verificador
                int soma1 = 0;
                for (int i = 0; i < 9; i++) {
                    soma1 += digitos[i] * (10 - i);
                }
                int primeiroDigitoVerificador = 11 - (soma1 % 11);
                if (primeiroDigitoVerificador == 10 || primeiroDigitoVerificador == 11) {
                    primeiroDigitoVerificador = 0;
                }
    
                // Calcula o segundo dígito verificador
                int soma2 = 0;
                for (int i = 0; i < 10; i++) {
                    soma2 += digitos[i] * (11 - i);
                }
                int segundoDigitoVerificador = 11 - (soma2 % 11);
                if (segundoDigitoVerificador == 10 || segundoDigitoVerificador == 11) {
                    segundoDigitoVerificador = 0;
                }
    
                // Verifica os dígitos verificadores
                return (primeiroDigitoVerificador == digitos[9]) && (segundoDigitoVerificador == digitos[10]);
            } catch (NumberFormatException e) {
                return false;
            }
       
        }
   
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("digite seu cpf:");
            String cpf = scan.nextLine();
            if (isCPF(cpf)) {
                System.out.println("CPF válido");
            } else {
                System.out.println("CPF inválido");
            }
        }
     }  