// Salvar como Programa01.java

class Programa01 {
    public static void main(String entrada[]) {
        if (entrada.length < 3) {
            System.out.println("Por favor, passe 3 argumentos: <inteiro> <real> <caractere>");
            System.exit(1);
        }

        // Declaração de variáveis
        int NumInt;
        double NumReal, soma;
        char Caracter;

        // Entrada de dados
        NumInt = Integer.parseInt(entrada[0]);
        NumReal = Double.parseDouble(entrada[1]);
        Caracter = entrada[2].charAt(0);

        // Processamento
        soma = (double) NumInt + NumReal;

        // Saída de resultados
        System.out.println(NumInt + " + " + NumReal + " = " + soma + " sinal " + Caracter);

        System.exit(0);
    }
}

