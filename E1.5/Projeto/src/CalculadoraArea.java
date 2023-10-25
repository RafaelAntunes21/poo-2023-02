public class CalculadoraArea {

    public static double calcularAreaTotal(FormaGeometrica[] formas) {

        double areaTotal = 0;

        for (int i = 0; i < formas.length; i++) {
            FormaGeometrica figura = formas[i];
            double areaForma = figura.calcularArea();
            areaTotal += areaForma;
            System.out.println("Área da forma " + (i + 1) + ": " + areaForma);
        }

        return areaTotal;
    }

    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[3];
        formas[0] = new Circulo(10.0);
        formas[1] = new Retangulo(12.5, 8.0);
        formas[2] = new Triangulo(20.0, 30.0);

        double areaTotal = calcularAreaTotal(formas);
        System.out.println("Área total das formas: " + areaTotal);
    }
}
