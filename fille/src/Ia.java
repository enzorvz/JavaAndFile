import java.sql.Array;
import java.util.Arrays;

public class Ia {


        public static void main(String[] args) {
            // Dados de treino: [Tamanho em m²] e [Preço em milhares de R$]

           //dados de entrada
            double[] X = {10.0, 20.0, 30.0, 40.0, 50.0};
            //resultado final oque e esperado
            double[] Y = {100.0, 200.0, 300.0, 400.0, 500.0};

            // 1. Chutes iniciais para os parâmetros da reta (y = m*x + b)
            double m = 0.0; // Peso / Inclinação
            double b = 0.0; // Viés (Bias)

            // Hiperparâmetros
            double taxaAprendizado = 0.0001; // Tamanho do passo de ajuste
            int epocas = 1000000;              // Quantas vezes o modelo vai treinar
            int n = X.length;

            // 2 e 3. Loop de Treinamento (Gradient Descent)
            for (int i = 0; i < epocas; i++) {
                double somaErroM = 0.0;
                double somaErroB = 0.0;

                for (int j = 0; j < n; j++) {
                    // Previsão atual com os pesos do momento
                    double previsao = m * X[j] + b;

                    // Calcula a diferença entre a previsão e o valor real
                    double erro = previsao - Y[j];

                    // Acumula as derivadas parciais do erro em relação a m e b
                    somaErroM += erro * X[j];
                    somaErroB += erro;
                }

                // Atualiza os pesos 'm' e 'b' na direção que reduz o erro
                m = m - (taxaAprendizado * (2.0 / n) * somaErroM);
                b = b - (taxaAprendizado * (2.0 / n) * somaErroB);

            }

            // Exibe o resultado do aprendizado
            System.out.println("--- Treinamento Concluído ---");
            System.out.printf("Fórmula descoberta: Preço = %.2f * Tamanho + %.2f%n", m, b);

            // Testando o modelo para uma casa nova de 60m²:
            double novoTamanho = 60.0;
            double precoPrevisto = m * novoTamanho + b;

            System.out.printf("Previsão: Uma casa de %.0fm² deve custar R$ %.2f mil%n", novoTamanho, precoPrevisto);
        }

}
