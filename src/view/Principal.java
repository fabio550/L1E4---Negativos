package view;
import controller.ContaNegativosController;
public class Principal {
    public static void main(String[] args) {
        ContaNegativosController cnc = new ContaNegativosController();

        int res = cnc.CalcContaNegativos(new int[]{-5, 1, -6, 4, -5, -7, -3},7);

        System.out.println(res);
    }
}
