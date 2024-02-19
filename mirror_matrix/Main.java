public class Main {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        String n, y, valor;
        int s, matriz[][], mTPuesta[][];

        n = l.next();
        y = l.next();
        s = Integer.parseInt(y);

        matriz = new int[Integer.parseInt(n)][Integer.parseInt(y)];
        mTPuesta = new int[Integer.parseInt(y)][Integer.parseInt(n)];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                boolean bandera = true;
                while (bandera) {
                    valor = l.next();
                    int newValor = Integer.parseInt(valor);
                    if ((newValor >= 1) && (newValor <= 50)) {
                        matriz[i][j] = newValor;
                        bandera = false;
                    } else {
                        System.out.println("Valores incorrectos, los valores deben ser mayores o igual a 1, y menores o igual a 50.");
                    }

                }

            }
        }

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                int vME = matriz[i][j];
                mTPuesta[j][i] = vME;
            }
        }

        System.out.println("\n\nMATRIZ TRANSPUESTA:");
        for (int i = 0; i < mTPuesta.length; i++) {
            for (int j = 0; j < mTPuesta[i].length; j++) {
                System.out.print(mTPuesta[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
