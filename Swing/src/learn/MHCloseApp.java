package learn;
import javax.swing.JOptionPane;

/**
 * Shows how to end the application if user clicks on the red X button.
 * @author Mark Hayes
 */
public class MHCloseApp extends javax.swing.JFrame {

    /** Creates new form MHCloseApp */
    public MHCloseApp() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quitButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitOption = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        exitOption.setText("Exit");
        exitOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitOptionActionPerformed(evt);
            }
        });
        fileMenu.add(exitOption);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");
        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quitButton)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(quitButton)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* User clicked on the X close-window button.
     * This method is the actionListener for the "windowClosing" event for the
     * JFrame.
     * To set this up:
     *   Design view > Inspector panel
     *   Right-click on the JFrame, select Properties
     *   Click on Events, and scroll down to the windowClosing event.
     *   Click on <none> in the right column. Click Close.
     *   The actionListener method will be inserted into your code.
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        shutdownApplication();
    }//GEN-LAST:event_formWindowClosing

    // User clicked on File > Exit
    private void exitOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitOptionActionPerformed
        shutdownApplication();
    }//GEN-LAST:event_exitOptionActionPerformed

    // User pressed the Quit button.
    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        shutdownApplication();
    }//GEN-LAST:event_quitButtonActionPerformed

    /* Called when user selects File > Exit, or presses the X indow-close
     * button, or when they press the Quit button.
     */
    private void shutdownApplication()
    {
        //Custom button text
        Object[] options = {"Exit", "Cancel"};

        int response = JOptionPane.showOptionDialog(this,
            "Are you sure you want to exit?",
            "Exit",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);

        if (response == 0)
        {
            // User wants to exit. Do shutdown stuff.
            System.exit(0);
        }
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MHCloseApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitOption;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton quitButton;
    // End of variables declaration//GEN-END:variables

}
