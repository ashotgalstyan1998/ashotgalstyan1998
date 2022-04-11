public class helloWorld {
    public static void main(String[] args) {
        int[] array= new int[] {1,4,5,7,18,2,5};
        int max = array[0];
        for (int i=0; i< array.length; i++)
        {
            if (array[i]>max)
            {
                max= array[i];
            }
        }

        System.out.println("max=" + max);

    }
}
