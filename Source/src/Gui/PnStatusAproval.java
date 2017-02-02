/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;


import data.Request;
import data.RequestList;
import java.awt.Color;

import javax.swing.JPanel;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author tndkh_000
 */
public class PnStatusAproval extends javax.swing.JPanel {

    /**
     * Creates new form PnStatusAproval
     */
    public PnStatusAproval() {
        initComponents();
        initData();
    }
    JPanel PnShow;

    public PnStatusAproval(JPanel PnShow) {
        this.PnShow = PnShow;
        initComponents();
        initData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbStatus = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        tbStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Indentify Card", "Name", "Grade", "Loan Amount", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbStatus);
        tbStatus.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbStatus.getColumnModel().getColumn(2).setPreferredWidth(250);
        tbStatus.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbStatus.getColumnModel().getColumn(4).setPreferredWidth(250);
        tbStatus.getColumnModel().getColumn(6).setPreferredWidth(200);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbStatus;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel model;
    TableRowSorter<TableModel> sorter;

    private void initData() {
        model = (DefaultTableModel) tbStatus.getModel();
        sorter = (TableRowSorter<TableModel>) tbStatus.getRowSorter();

        RequestList bl = new RequestList();
        for (Request item : bl.getList()) {
            model.addRow(item.toVector());
        }
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tbStatus.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tbStatus.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tbStatus.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tbStatus.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tbStatus.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        tbStatus.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);

        tbStatus.setShowGrid(true);
        tbStatus.getTableHeader().setOpaque(false);
        tbStatus.getTableHeader().setBackground(Color.blue);
        tbStatus.getTableHeader().setForeground(Color.blue);

    }

   
}
