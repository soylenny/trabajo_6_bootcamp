public class funcion {

    public static void main(String[] args) {

      celular(1025);
    }
    static void celular(double celular){

        double iva = celular * 0.18;
        double ivaIncluido = celular + iva;

        System.out.println("Precio celular con Iva " + ivaIncluido);
    }
}