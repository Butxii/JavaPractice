public class MasiviFunction {

    public static int MasiviSashualo(int[] array) {

        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 150) {
                sum += array[i];
                count++;
            }

        }
        System.out.println("არითმეტიკული საშუალო არის " + sum / count);
        return 0;
    }


    public static int MasivikentiSashualo(int[] array) {

        int sum = 1;
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                sum *= array[i];
                count++;
            }

        }

        double power = Math.pow(sum, 1.0 / count);

        System.out.println("გეომეტრიული საშუალო არის " + power);
        return 0;
    }
}

