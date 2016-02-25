package jtable;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This is a custom table model for the JTable.
 * AbstractTableModel is abstract, ie, it contains abstract (empty) methods
 * which have to be implemented in DataModel.java
 * The data is stored in an ArrayList
 * @author MHayes
 */
public class StudentTableModel extends AbstractTableModel {

    private String[] columnNames = {"First", "Last"};
    private ArrayList<Student> data = new ArrayList<Student>();
    /*
    private Object[][] data = {
        {"Bob", "McAdoo"},
        {"Magic", "Johnson"}
    };
    */

    //--------------------------------------------------------------------------
    // These first three methods are abstract (empty) in AbstractDataModel
    // and have to be implemented by you.

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.size();
    }

    public Object getValueAt(int row, int col) {
        //return data[row][col];        
        //return data.get(row);
        Student student = data.get(row);
        return col == 0 ? student.getFirstName() : student.getLastName();
    }

    //--------------------------------------------------------------------------

    // These methods are optional. They are implemented in AbstractTableModel,
    // and overridden here.

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Class getColumnClass(int col) {
        //return getValueAt(0, col).getClass();
        return getValueAt(0, col).getClass();
    }

    //--------------------------------------------------------------------------
    /*
     * Don't need to override isCellEditable() unless your table is editable.
     * If you override this method to return true, then you should also
     * override the setValueAt() method to update the underlying model when
     * the user edits a cell.
     */
    @Override
    public boolean isCellEditable(int row, int col) {
        return true;
    }

    /*
     * Don't need to implement this method unless your table is editable.
     * Called by the JTable object if the user edits a cell.
     * You do NOT need to add an actionListener for this in your code.
     * This method will be called (somehow) whenever the user edits a cell.
     */
    @Override
    public void setValueAt(Object value, int row, int col) {
        //data[row][col] = value;
        //data.set(row, (Student)value);

        Student student = data.get(row);
        if (col == 0) {
            student.setFirstName((String)value);
        }
        else {
            student.setLastName((String)value);
        }
        data.set(row, student);
        fireTableCellUpdated(row, col); 
    }
    //--------------------------------------------------------------------------

    // MH added this method.
    // Called by the actionListener for the Add button.
    public void add(Student student) {

        data.add(student);
        Collections.sort(data);
        fireTableDataChanged();     // Tell table that the data has changed
    }

    // MH added this method.
    // Called by the actionListener for the Delete button.
    public void delete(int row) {

        data.remove(row);
        fireTableRowsDeleted(row, row);      // Tell table that the data has changed
    }

    // MH added this method.
    // Called at shutdown to save data from the model to the data file.
    public Student get(int row) {
        return data.get(row);
    }
}

