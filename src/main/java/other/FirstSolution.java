package other;

/*
* http://ccm.net/forum/affich-605237-c-program-question-count-the-clothes-visib
* Count the Clothes Visib
 */
class FirstSolution {

    public static void main(String args[]){
        int input1 = 10;
        int input2 = 5;
        int[][] input3 = { { 0, 4 }, { 6, 3 }, { 1, 5 }, { 6, 4 }, { 7, 2 } };
        GetVisibleCount(input1, input2, input3);
    }



    public static int GetVisibleCount(int input1,int input2,int[][] input3){
        // Read only region end
        int clothesLine = input1;
        int clothes = input2;

        int[][] positions = input3;

        //input validation
        validateInput(clothesLine, clothes, positions);

        for (int i = 0; i < clothes; i++)
            positions[i][1] = positions[i][0] + positions[i][1];


        int count = 0;
        int[][] array = prepareMatrix(clothesLine, clothes, positions);

        for(int index = 0; index < clothes ; index ++){
            boolean isVisible = false;

            for(int j = positions[index][0] ; j < positions[index][1]; j++ ){
                int counter = 0;

                for(int inner = index+1; inner < clothes ; inner++){
                    counter += array[inner][j];
                    if(counter>0)
                        break;
                }

                if(counter == 0)
                    isVisible = true;

            }
            if(isVisible)
                count++;

        }

        return count;

    }

    public static int[][] prepareMatrix(int clothesLine,int clothes,int[][] positions) {
        int[][] array = new int[clothes][clothesLine];

        for(int index = clothes-1; index >= 0 ; index --){
            for(int j = 0 ; j < clothesLine; j++ ){
                if(j >= positions[index][0] && j<= positions[index][1]){
                    array[index][j] = 1;
                }else{
                    array[index][j] = 0;
                }
            }
        }

        return array;
    }

    public static void validateInput(int clothesLine,int clothes,int[][] positions){
        int MIN_CLOTHES = 1;
        int MAX_CLOTHES = 10000;
        int MIN_ROPE_LENGTH = 1;
        int MAX_ROPE_LENGTH = 10000;

        //validate the input
        if(!(clothes >= MIN_CLOTHES && clothes <= MAX_CLOTHES))
            throw new UnsupportedOperationException("input Clothes value is not valid. Please enter a valid value");

        if(!(clothesLine >= MIN_ROPE_LENGTH && clothesLine <= MAX_ROPE_LENGTH))
            throw new UnsupportedOperationException("input clothesLine value is not valid. Please enter a valid value");

        if(positions.length != clothes)
            throw new UnsupportedOperationException("Count mismatch between clothes and no of positions");

        for(int i=0;i<positions.length;i++) {
            int[] pos = positions[0];

            if(!(pos[0] >= MIN_CLOTHES - 1 && pos[0] <= MAX_CLOTHES -1))
                throw new UnsupportedOperationException("position is not valid");

            if(!(pos[1] >= MIN_ROPE_LENGTH && pos[1] <= MAX_ROPE_LENGTH))
                throw new UnsupportedOperationException("position is not valid");
        }
    }



}

