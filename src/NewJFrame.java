
import java.util.ArrayList;
import java.util.List;

public class NewJFrame extends javax.swing.JFrame {
    
    //Обхявляем поле в классе с типом Лист Персон
    private final List<Person> personList;
    //Обхявляем поле в классе с типом инт
    private int currentInd;

    public NewJFrame() {
        //В конструторе инициализируем компоненты JFrame
        initComponents();
        //Назначаем переменную персонЛист пустым новым списокм объектом класса АррейЛист
        personList = new ArrayList<>();
        //Назначаем перпменную куррентИнд
        currentInd = 0;
    }
    
   
    private void refreshInterface() {
        //Первая проверка на то что индекс 0 и список пустой
        //Если проверка прошла, значит персонов ещё нет и можно обноулить поля
        //Нужно при удалении
        if (0 == currentInd && personList.isEmpty()) {
            jTextFieldDay.setText("");
            jTextFieldMonth.setText("");
            jTextFieldYear.setText("");
            jTextFieldName.setText("");
            return;
        }
        
        //Берем персона из списка по текущему индексу
        var person = personList.get(currentInd);
        //Заполняем поля интерфеса значением объекта персон, который достали по индексу
        //Приводим значения инт к стринг через статический метод String.valueOf 
        jTextFieldDay.setText(String.valueOf(person.day));
        jTextFieldMonth.setText(String.valueOf(person.month));
        jTextFieldYear.setText(String.valueOf(person.year));
        jTextFieldName.setText(person.name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDay = new javax.swing.JTextField();
        jTextFieldMonth = new javax.swing.JTextField();
        jTextFieldYear = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSpinner1 = new javax.swing.JSpinner(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jTextFieldCount = new javax.swing.JTextField();
        jButtonNewPers = new javax.swing.JButton();
        jButtonDelPers = new javax.swing.JButton();
        jButtonPlusYear = new javax.swing.JButton();
        jButtonMinus2Days = new javax.swing.JButton();
        jButtonStage = new javax.swing.JButton();
        jTextFieldWorkingDays = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Задание 11 30");

        jLabel1.setText("День");

        jLabel2.setText("Месяц");

        jLabel3.setText("Год");

        jLabelName.setText("ФИО");

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jTextFieldCount.setEnabled(false);

        jButtonNewPers.setText("Новый");
        jButtonNewPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewPersActionPerformed(evt);
            }
        });

        jButtonDelPers.setText("Удалить");
        jButtonDelPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelPersActionPerformed(evt);
            }
        });

        jButtonPlusYear.setText("Добавить год");
        jButtonPlusYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusYearActionPerformed(evt);
            }
        });

        jButtonMinus2Days.setText("Убавить 2 дня");
        jButtonMinus2Days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinus2DaysActionPerformed(evt);
            }
        });

        jButtonStage.setText("Стаж работы");
        jButtonStage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStageActionPerformed(evt);
            }
        });

        jTextFieldWorkingDays.setEditable(false);
        jTextFieldWorkingDays.setEnabled(false);
        jTextFieldWorkingDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldWorkingDaysActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jButtonStage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 225, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jTextFieldWorkingDays)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jLabel2)
                            .add(jLabel3)
                            .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(jLabelName)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jSeparator2)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jTextFieldName)
                                .addContainerGap())
                            .add(layout.createSequentialGroup()
                                .add(jTextFieldCount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jButtonPlusYear, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .add(jButtonNewPers, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .add(29, 29, 29)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jButtonMinus2Days, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .add(jButtonDelPers, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldMonth)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldYear)
                                    .add(jTextFieldDay))
                                .add(6, 6, 6))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jTextFieldDay, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jTextFieldMonth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jTextFieldYear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldCount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonNewPers)
                    .add(jButtonDelPers))
                .add(1, 1, 1)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonPlusYear)
                    .add(jButtonMinus2Days))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(9, 9, 9)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabelName)
                            .add(jTextFieldName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonStage)
                    .add(jTextFieldWorkingDays, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Кнопка новый
    private void jButtonNewPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewPersActionPerformed
        
        //Создаем объект персон и добовляем в список персонЛитс
        personList.add(
                //создаем объект передаем в констрктор поля интерфейса
                //приводим к числам те значения которые нужны как числа
                new Person(
                        Integer.valueOf(jTextFieldYear.getText()), 
                        Integer.valueOf(jTextFieldMonth.getText()), 
                        Integer.valueOf(jTextFieldDay.getText()), 
                        jTextFieldName.getText() 
                )
        );
        //Обновляем индекс размер списка - 1
        currentInd = personList.size() - 1;
        //Обновляем количество людей размером коллекции персонЛист и спиннер на интерфейсе индекс + 1
        jTextFieldCount.setText(String.valueOf(personList.size()));
        jSpinner1.setValue(currentInd + 1);
    }//GEN-LAST:event_jButtonNewPersActionPerformed

    //Удаление персона из списка
    private void jButtonDelPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelPersActionPerformed
        
        //Забираем значение из спирннера, приводим к типу инт
        var spinnerValue = (int) jSpinner1.getValue();
        
        //Если значение 0 то мы в уже всех удалили, список пустой 
        if (0 == spinnerValue) {
            return;
        }
        
        //Вычисляем индекс удаляемого элемента из списка значение спиннера - 1
        var value = spinnerValue - 1;
        
        //Убираем текущее значение из списка
        personList.remove(value);
        
        //Обновляем список 
        currentInd = value;
        
        //Обновляем значение спиннера
        jSpinner1.setValue(value);

        //Обновляем значение количества персон
        jTextFieldCount.setText(String.valueOf(personList.size()));

        //Вызываем метод для вставки значений в интерфейс
        refreshInterface();
        
    }//GEN-LAST:event_jButtonDelPersActionPerformed
    
    //Меняем значение спинера
    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        
        //Если индекс 0 и список пустой, то выходим
        if(0 == currentInd && personList.isEmpty()) {
            return;
        }
        
        //Достаем текущее значение спиннера, приводим к типу инт
        var spinnerValue = (int) jSpinner1.getValue();
        //Если текущий значение спиннера 0, то инекс 0 или значение спиннера - 1
        currentInd = 0 == spinnerValue ? 0 : (spinnerValue - 1);
        //Если индекс больше или равен размеру списка
        if (currentInd >= personList.size()) {
            //приравнивем текущий индекс с размеру списка - 1
            currentInd = personList.size() - 1;
        } 
        //Обновляем спиннер 
        jSpinner1.setValue(currentInd + 1);
        //Обновляем поля интерфейса
        refreshInterface();
    }//GEN-LAST:event_jSpinner1StateChanged
    //Плюс год
    private void jButtonPlusYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusYearActionPerformed
        personList.get(currentInd).plusYear();
        refreshInterface();

    }//GEN-LAST:event_jButtonPlusYearActionPerformed
    //Минус 2 дня
    private void jButtonMinus2DaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinus2DaysActionPerformed
        personList.get(currentInd).minus2Days();
        refreshInterface();
    }//GEN-LAST:event_jButtonMinus2DaysActionPerformed
    //Расчитать стаж
    private void jButtonStageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStageActionPerformed
        var workingDays = personList.get(currentInd).getWorkingDays();
        jTextFieldWorkingDays.setText(String.valueOf(workingDays));
    }//GEN-LAST:event_jButtonStageActionPerformed

    private void jTextFieldWorkingDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldWorkingDaysActionPerformed
             // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldWorkingDaysActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame()
                        .setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelPers;
    private javax.swing.JButton jButtonMinus2Days;
    private javax.swing.JButton jButtonNewPers;
    private javax.swing.JButton jButtonPlusYear;
    private javax.swing.JButton jButtonStage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextFieldCount;
    private javax.swing.JTextField jTextFieldDay;
    private javax.swing.JTextField jTextFieldMonth;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldWorkingDays;
    private javax.swing.JTextField jTextFieldYear;
    // End of variables declaration//GEN-END:variables
}
