package sorting;

public class BubbleSort {
    public static void main(String args[]) {
        Integer[] numbers  = new Integer[] {1,7,2,4,73,40};
        int len = numbers.length;

        for(int i=0;i < len - 1;i++) {
            Boolean changed = false;
            for(int j=0; j < len - 1 - i;j++) {
                if(numbers[i] > numbers[i+1]) {
                    int temp = numbers[i+1];
                    numbers[i+1] = numbers[i];
                    numbers[i] = temp;
                    changed = true;
                }
            }

            if(!changed) {
                break;
            }
        }

        for(int z=0; z<= len-1; z++) {
            System.out.println(numbers[z]);
        }
    }
}
