import com.mycompany.cockatiel.Blender;
import com.mycompany.cockatiel.Cocktail;
import com.mycompany.cockatiel.Cup;
import com.mycompany.cockatiel.FileLogger;
import com.mycompany.cockatiel.Fruit;
import com.mycompany.cockatiel.Ingredient;
import com.mycompany.cockatiel.Logger;
import com.mycompany.cockatiel.Milk;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

import javax.swing.JList;
import javax.swing.JOptionPane;

public class coctail extends javax.swing.JFrame {

    private final ArrayList<Ingredient> ingredients = new ArrayList<>();
    private Color color;
    private final Logger logger = new FileLogger("logger.log");
    private final Blender blender = new Blender(1000, logger);
    
    private Cup cup;
    private DefaultListModel<String> ingredientsListModel = new DefaultListModel<>();
    private DefaultListModel<String> cocktailIngredientsListModel = new DefaultListModel<>();
    private JList<String> coctailCustmar = new JList<>();
    private JList<String> ingredientsList = new JList<>();

    public coctail() {
        initComponents();
        initializeLists();
        initializeArray();
    }

    private void initializeArray() {
        ingredients.add(new Fruit("Banana", 105, 118, new Color(255, 225, 53)));
        ingredients.add(new Fruit("Orange", 62, 131, new Color(255, 165, 0)));
        ingredients.add(new Fruit("Strawberry", 4, 12, new Color(255, 0, 0)));
        ingredients.add(new Fruit("Kiwi", 42, 69, new Color(112, 173, 71)));
        ingredients.add(new Fruit("Apple", 95, 182, new Color(255, 0, 0)));
        ingredients.add(new Fruit("Mango", 99, 165, new Color(255, 165, 0)));
        ingredients.add(new Milk("Milk", 42, 240, new Color(255, 255, 255)));
    }

    private void initializeLists() {
        ingredientsList.setModel(ingredientsListModel);
        coctailCustmar.setModel(cocktailIngredientsListModel);
        for (Ingredient ingredient : ingredients) {
            ingredientsListModel.addElement(ingredient.getName());
        }
    }
   

    private Ingredient findIngredientByName(String name) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getName().equalsIgnoreCase(name)) {
                return ingredient;
            }
        }
        return null;
    }

    
private void UpdatdcoctailIngredientList() {
    DefaultListModel<String> model = (DefaultListModel<String>) coctailCustmar.getModel();
    model.clear();
    for (int i = 0; i < cocktailIngredientsListModel.getSize(); i++) {
        String ingredientName = cocktailIngredientsListModel.getElementAt(i);
        model.addElement(ingredientName);
    }

    
    
    
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new coctail().setVisible(true));
    }
  
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("coctail");
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("welcome to my simpel cocktail machine");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("3 : OBADA ALHAWAMDEH");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("1 : DAN FASFOOS");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("2 : ANAS HROUB");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Welcome", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList2.setBorder(javax.swing.BorderFactory.createTitledBorder("Fruits and ingredients"));
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Banana ", "Orange", "Strawberry", "Kiwi", "Apple", "Mango", "Milk" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 182, 195));

        jList3.setBorder(javax.swing.BorderFactory.createTitledBorder("coctail ingradint"));
        jList3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList3.setAutoscrolls(false);
        jScrollPane4.setViewportView(jList3);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 248, 192));

        jButton1.setText("add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jButton3.setText("remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        jButton4.setText("blender");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        jList5.setBorder(javax.swing.BorderFactory.createTitledBorder("cup volume"));
        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "100", "250", "300", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList5.setAutoscrolls(false);
        jList5.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList5ValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(jList5);

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 110, 195));

        jTabbedPane1.addTab("Cocktail", jPanel2);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("result ");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("color is ");

        jButton2.setText("pour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(73, 73, 73))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(373, 373, 373)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cocktail result", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList5ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList5ValueChanged
        if (!evt.getValueIsAdjusting()) {
            String selectedValue = jList5.getSelectedValue();
            if (selectedValue != null) {
                try {
                    int capacity = Integer.parseInt(selectedValue.trim());

                    Cup cup = new Cup(capacity );
                    logger.log("Cup capacity set to " + capacity + " ml.");

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Invalid cup capacity selected!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_jList5ValueChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        // Blend the ingredients
        int totalVolume = 0;
        double totalCalories = 0;
        int red = 0, green = 0, blue = 0;
        int count = 0;

        StringBuilder ingredientsList = new StringBuilder();

        for (int i = 0; i < cocktailIngredientsListModel.getSize(); i++) {
            String ingredientName = cocktailIngredientsListModel.getElementAt(i);
            Ingredient ingredient = findIngredientByName(ingredientName);
            if (ingredient != null) {
                totalVolume += ingredient.getVolume();
                totalCalories += ingredient.getCalories();
                Color color = ingredient.getColor();
                red += color.getRed();
                green += color.getGreen();
                blue += color.getBlue();
                count++;
                ingredientsList.append(ingredientName).append("\n");
            }
        }

        if (count != 0) {
            red /= count;
            green /= count;
            blue /= count;
            Color resultingColor = new Color(red, green, blue);
            String ff = "Ingredients:\n" + ingredientsList.toString() +
            "Volume: " + totalVolume + "\nCalories: " + totalCalories;
            jTextArea1.setText(ff);
            jPanel4.setBackground(resultingColor);
             Cocktail cocktail =new Cocktail(totalCalories, ingredients, resultingColor, totalVolume);
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handlin

        // Remove selected item from cocktail ingredients list
        String selectedItem = jList3.getSelectedValue();
        if (selectedItem != null) {
            cocktailIngredientsListModel.removeElement(selectedItem);
        } else {
            JOptionPane.showMessageDialog(this, "Please select an item to remove.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String selectedIngredient = jList2.getSelectedValue();
    if (selectedIngredient != null) {
        if (!cocktailIngredientsListModel.contains(selectedIngredient)) {
            cocktailIngredientsListModel.addElement(selectedIngredient);
            jList3.setModel(cocktailIngredientsListModel);
        } else {
            JOptionPane.showMessageDialog(this, "Ingredient already added.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select an ingredient to add.");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        int indx =jList2.getSelectedIndex();
        Ingredient hh=ingredients.get(indx);
        JOptionPane.showMessageDialog(this, hh.getInfo());
    }//GEN-LAST:event_jList2ValueChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

    jTextArea1.setText("");

    // Calculate total volume of ingredients
    int totalVolume = 0;
    for (int i = 0; i < cocktailIngredientsListModel.getSize(); i++) {
        String ingredientName = cocktailIngredientsListModel.getElementAt(i);
        Ingredient ingredient = findIngredientByName(ingredientName);
        if (ingredient != null) {
            totalVolume += ingredient.getVolume();
        }
    }

    // Get selected cup volume
    String selectedCupVolume = jList5.getSelectedValue();
    if (selectedCupVolume != null) {
        try {
            int cupVolume = Integer.parseInt(selectedCupVolume.trim());
            int numberOfCups = totalVolume / cupVolume;
            
            // Display the result in the text area
            jTextArea1.append("Total Volume: " + totalVolume + " ml\n");
            jTextArea1.append("Number of cups you can make: " + numberOfCups + "\n");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid cup volume selected!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a cup volume.", "Error", JOptionPane.WARNING_MESSAGE);
    }        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    
}


