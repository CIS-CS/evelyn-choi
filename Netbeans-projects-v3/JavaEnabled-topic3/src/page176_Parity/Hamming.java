package page176_Parity;

/**
 * The class shows how single-bit errors can not only be detected, but
 * corrected. Multi-bit errors can be detected, but not corrected.
 * Note that this works only on square arrays.
 *
 * @author MHayes (based on exam question: Topic 2, Hamming, 05MayP2-Q1)
 */
public class Hamming {

    public static void main(String[] args) {

        // 7 rows of 7-bit data. Last row and last col are parity bits.
        int[][] data = {{1,0,0,1,0,1,0,1},
                        {0,1,0,1,0,1,0,1},
                        {0,1,0,1,0,1,0,1},
                        {0,1,0,1,0,1,0,1},
                        {0,1,0,1,0,1,0,1},
                        {0,1,1,1,0,1,0,1},
                        {0,1,0,1,0,1,0,1},
                        {0,1,0,1,0,1,0,1}
        };

        check(data);
        display(data);
    }

    //--------------------------------------------------------------------------
    /**
     *  Performs an even-parity check on the data.
     *  @param data the 2D array to check
     *  @return code 0 = ok, row# = single-bit error, -1 = multi-bit error
     */
    private static int hamming(int[][] data) {

        int result  = 0;    // assume the data is ok
        int ones    = 0;    // number of 1's in a row
        int badRow  = 0;    // current bad row
        int badRows = 0;    // total bad rows

        // Do the parity check on each data row (not the parity row)
        for (int row = 0; row < data.length - 1; row++) {
            for (int col = 0; col <= data[row].length - 1; col++) {
                if (data[row][col] == 1) {
                    ones++;         // count the 1's in this row
                }
            }
            if (ones % 2 == 1) {    // check for even-parity
                badRow = row;
                badRows++;
            }
            ones = 0;               // reset after each row
        }

        // Return the result
        if (badRows == 1) {
            result = badRow;        // one bad row, return row# 0-6
        }
        else if (badRows > 1) {     // multi-bit error
            result = -1;
        }
        else {
            result = 0;               // data ok
        }
        return result;
    }

    //--------------------------------------------------------------------------
    /**
     * Swaps the rows and cols of the array.
     * Note on the inner loop, col is set to row + 1
     * This creates a zoom-in effect.
     * Each time thru the outer loop, the array shrinks by a row and col.
     * The array keeps shrinkig until
     *
     * @param data the 2D array to swap
     */
    private static void swap(int[][] data) {

        int temp = 0;

        for (int row = 0; row < data.length - 1; row++) {
            for (int col = row + 1; col < data[row].length; col++) {
                temp = data[row][col];
                data[row][col] = data[col][row];
                data[col][row] = temp;
            }
        }
    }

    //--------------------------------------------------------------------------
    /**
     * Performs a parity check on data in a 2D array.
     * Single-bit errors can be detected and corrected.
     * Multi-bit errors can be detected, but not corrected.
     * 
     * @param data the 2D array of data to check
     */
    private static void check(int[][] data) {

        int row = hamming(data);
        switch (row) {
            case 0:
                // check the columns also in case of transpose error!!!!
                //System.out.println("Data is ok.");
                break;
            case -1:
                System.out.println("Multi-bit error detected. Resend data.");
                break;
            default:
                swap(data);
                int col = hamming(data);
                swap(data);
                data[row][col] = data[row][col] == 0 ? 1 : 0;
                /*
                if (data[row][col] == 0) {
                   data[row][col] = 1;
                }
                else {
                   data[row][col] = 0;
                }
                */
                System.out.println("bit at " + row + "," + col + " fixed.");
                break;
        }
    }

    //--------------------------------------------------------------------------
    /**
     * Displays the contents of a 2D array.
     * @param data the 2D array to be displayed
     */
    private static void display(int[][] data) {

        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                System.out.print(data[row][col] + " ");
            }
            System.out.println();
        }
    }
}




















