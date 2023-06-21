//Cума + середнє значення
public class SumaSeredne {
    public static void main(String[] args) {
        int [] array1 = new int[4];
        array1[0]=2;
        array1[1]=6;
        array1[2]=10;
        array1[3]=10;
        int sum = 0;
        for( int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        for( int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
        System.out.println("Сумма - "+ sum);
        float s;
        s= sum/4;
        System.out.println("Середнє значення "+ s);

    }
}

