package controller;

public class ContaNegativosController {
    public ContaNegativosController() {
        super();
    }

    public int CalcContaNegativos(int[] vetor, int tamanho) {
        if (tamanho == 0) { // condição de parada: todos os valores do vetor forem já percorridos
            return 0;
        } else { // a função é chamada reduzida em 1 e soma 1 se o valor for menor que zero
            if (vetor[tamanho - 1] < 0) {
                return 1 + CalcContaNegativos(vetor, tamanho - 1);
            } else {
                return CalcContaNegativos(vetor, tamanho - 1);
            }
        }
    }
}
