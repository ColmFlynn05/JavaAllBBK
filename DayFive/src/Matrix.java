class Matrix {
    int[][] matrix;

    Matrix(int row, int col) {
        matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = 1;
            }
        }
    }

    public void setElement(int row, int col, int num){
        if(matrix.length>=row || matrix[0].length>=col){
            matrix[row][col] = num;
        }
    }

    public void setRow(int row, String values){
        int colCount = 0;
        for(int i = 0; i < values.length(); i++) {
            if(values.charAt(i) != ',' || values.charAt(i) != ' ' ){
                matrix[row][colCount] = Character.getNumericValue(values.charAt(i));
                colCount++;
            }
        }
    }

    public void setCol(int col, String values){
        int rowCount = 0;
        for(int i = 0; i < values.length(); i++) {
            if(values.charAt(i) != ',' || values.charAt(i) != ' ' ){
                matrix[rowCount][col] = Character.getNumericValue(values.charAt(i));
                rowCount++;
            }
        }
    }


}
