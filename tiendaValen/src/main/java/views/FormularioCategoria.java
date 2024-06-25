/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import model.Categoria;
import dao.CategoriaDAO;
import java.util.Scanner;
import controller.CategoriaController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import views.CategoriaView;

public class FormularioCategoria extends javax.swing.JFrame {

  
    public FormularioCategoria() {
        initComponents();
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        CategoriaCrearBtn = new javax.swing.JButton();
        txtIdCategoria = new javax.swing.JTextField();
        txtnombrecategoria = new javax.swing.JTextField();
        CategoriaLeerBtn = new javax.swing.JButton();
        CategoriaActualizarBtn = new javax.swing.JButton();
        CategoriaEliminarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTotalCategorias = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CategoriaCrearBtn1 = new javax.swing.JButton();
        txtIdCategoria1 = new javax.swing.JTextField();
        txtnombrecategoria1 = new javax.swing.JTextField();
        CategoriaLeerBtn1 = new javax.swing.JButton();
        CategoriaActualizarBtn1 = new javax.swing.JButton();
        CategoriaEliminarBtn1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbTotalCategorias1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CategoriaCrearBtn2 = new javax.swing.JButton();
        txtIdCategoria2 = new javax.swing.JTextField();
        txtnombrecategoria2 = new javax.swing.JTextField();
        CategoriaLeerBtn2 = new javax.swing.JButton();
        CategoriaActualizarBtn2 = new javax.swing.JButton();
        CategoriaEliminarBtn2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbTotalCategorias2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        CategoriaCrearBtn4 = new javax.swing.JButton();
        txtIdCategoria4 = new javax.swing.JTextField();
        txtnombrecategoria4 = new javax.swing.JTextField();
        CategoriaLeerBtn4 = new javax.swing.JButton();
        CategoriaActualizarBtn4 = new javax.swing.JButton();
        CategoriaEliminarBtn4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbTotalCategorias4 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 204));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        CategoriaCrearBtn.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaCrearBtn.setText("Crear");
        CategoriaCrearBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaCrearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaCrearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaCrearBtnActionPerformed(evt);
            }
        });

        txtIdCategoria.setBackground(new java.awt.Color(255, 255, 204));
        txtIdCategoria.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtIdCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCategoriaActionPerformed(evt);
            }
        });

        txtnombrecategoria.setBackground(new java.awt.Color(255, 255, 204));
        txtnombrecategoria.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtnombrecategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrecategoriaActionPerformed(evt);
            }
        });

        CategoriaLeerBtn.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaLeerBtn.setText("Leer");
        CategoriaLeerBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaLeerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaLeerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriaLeerBtnMouseClicked(evt);
            }
        });
        CategoriaLeerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaLeerBtnActionPerformed(evt);
            }
        });

        CategoriaActualizarBtn.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaActualizarBtn.setText("Actualizar");
        CategoriaActualizarBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaActualizarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaActualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaActualizarBtnActionPerformed(evt);
            }
        });

        CategoriaEliminarBtn.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaEliminarBtn.setText("Eliminar");
        CategoriaEliminarBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaEliminarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaEliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaEliminarBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Id.");

        jLabel2.setText("Nombre");

        tbTotalCategorias.setBackground(new java.awt.Color(255, 255, 204));
        tbTotalCategorias.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbTotalCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CategoriaId", "Nombre"
            }
        ));
        tbTotalCategorias.setSelectionBackground(new java.awt.Color(255, 153, 204));
        jScrollPane3.setViewportView(tbTotalCategorias);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("¿Qué Quieres hacer?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CategoriaCrearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombrecategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(CategoriaLeerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(CategoriaEliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(CategoriaActualizarBtn)
                        .addGap(63, 63, 63)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoriaActualizarBtn)
                    .addComponent(CategoriaLeerBtn)
                    .addComponent(CategoriaEliminarBtn)
                    .addComponent(CategoriaCrearBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtnombrecategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Categoria", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        CategoriaCrearBtn1.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaCrearBtn1.setText("Crear");
        CategoriaCrearBtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaCrearBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaCrearBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaCrearBtn1ActionPerformed(evt);
            }
        });

        txtIdCategoria1.setBackground(new java.awt.Color(255, 255, 204));
        txtIdCategoria1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtIdCategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCategoria1ActionPerformed(evt);
            }
        });

        txtnombrecategoria1.setBackground(new java.awt.Color(255, 255, 204));
        txtnombrecategoria1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtnombrecategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrecategoria1ActionPerformed(evt);
            }
        });

        CategoriaLeerBtn1.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaLeerBtn1.setText("Leer");
        CategoriaLeerBtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaLeerBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaLeerBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriaLeerBtn1MouseClicked(evt);
            }
        });
        CategoriaLeerBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaLeerBtn1ActionPerformed(evt);
            }
        });

        CategoriaActualizarBtn1.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaActualizarBtn1.setText("Actualizar");
        CategoriaActualizarBtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaActualizarBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaActualizarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaActualizarBtn1ActionPerformed(evt);
            }
        });

        CategoriaEliminarBtn1.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaEliminarBtn1.setText("Eliminar");
        CategoriaEliminarBtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaEliminarBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaEliminarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaEliminarBtn1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Id.");

        jLabel5.setText("Nombre");

        tbTotalCategorias1.setBackground(new java.awt.Color(255, 255, 204));
        tbTotalCategorias1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbTotalCategorias1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CategoriaId", "Nombre"
            }
        ));
        tbTotalCategorias1.setSelectionBackground(new java.awt.Color(255, 153, 204));
        jScrollPane4.setViewportView(tbTotalCategorias1);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("¿Qué Quieres hacer?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CategoriaCrearBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombrecategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(CategoriaLeerBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(CategoriaEliminarBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(CategoriaActualizarBtn1)
                        .addGap(63, 63, 63)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoriaActualizarBtn1)
                    .addComponent(CategoriaLeerBtn1)
                    .addComponent(CategoriaEliminarBtn1)
                    .addComponent(CategoriaCrearBtn1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtnombrecategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consumidor", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        CategoriaCrearBtn2.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaCrearBtn2.setText("Crear");
        CategoriaCrearBtn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaCrearBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaCrearBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaCrearBtn2ActionPerformed(evt);
            }
        });

        txtIdCategoria2.setBackground(new java.awt.Color(255, 255, 204));
        txtIdCategoria2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtIdCategoria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCategoria2ActionPerformed(evt);
            }
        });

        txtnombrecategoria2.setBackground(new java.awt.Color(255, 255, 204));
        txtnombrecategoria2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtnombrecategoria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrecategoria2ActionPerformed(evt);
            }
        });

        CategoriaLeerBtn2.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaLeerBtn2.setText("Leer");
        CategoriaLeerBtn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaLeerBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaLeerBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriaLeerBtn2MouseClicked(evt);
            }
        });
        CategoriaLeerBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaLeerBtn2ActionPerformed(evt);
            }
        });

        CategoriaActualizarBtn2.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaActualizarBtn2.setText("Actualizar");
        CategoriaActualizarBtn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaActualizarBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaActualizarBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaActualizarBtn2ActionPerformed(evt);
            }
        });

        CategoriaEliminarBtn2.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaEliminarBtn2.setText("Eliminar");
        CategoriaEliminarBtn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaEliminarBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaEliminarBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaEliminarBtn2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Id.");

        jLabel8.setText("Nombre");

        tbTotalCategorias2.setBackground(new java.awt.Color(255, 255, 204));
        tbTotalCategorias2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbTotalCategorias2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CategoriaId", "Nombre"
            }
        ));
        tbTotalCategorias2.setSelectionBackground(new java.awt.Color(255, 153, 204));
        jScrollPane5.setViewportView(tbTotalCategorias2);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("¿Qué Quieres hacer?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CategoriaCrearBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombrecategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(CategoriaLeerBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(CategoriaEliminarBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(CategoriaActualizarBtn2)
                        .addGap(63, 63, 63)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoriaActualizarBtn2)
                    .addComponent(CategoriaLeerBtn2)
                    .addComponent(CategoriaEliminarBtn2)
                    .addComponent(CategoriaCrearBtn2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtnombrecategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Producto", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));

        CategoriaCrearBtn4.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaCrearBtn4.setText("Crear");
        CategoriaCrearBtn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaCrearBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaCrearBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaCrearBtn4ActionPerformed(evt);
            }
        });

        txtIdCategoria4.setBackground(new java.awt.Color(255, 255, 204));
        txtIdCategoria4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtIdCategoria4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCategoria4ActionPerformed(evt);
            }
        });

        txtnombrecategoria4.setBackground(new java.awt.Color(255, 255, 204));
        txtnombrecategoria4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtnombrecategoria4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrecategoria4ActionPerformed(evt);
            }
        });

        CategoriaLeerBtn4.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaLeerBtn4.setText("Leer");
        CategoriaLeerBtn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaLeerBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaLeerBtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriaLeerBtn4MouseClicked(evt);
            }
        });
        CategoriaLeerBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaLeerBtn4ActionPerformed(evt);
            }
        });

        CategoriaActualizarBtn4.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaActualizarBtn4.setText("Actualizar");
        CategoriaActualizarBtn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaActualizarBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaActualizarBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaActualizarBtn4ActionPerformed(evt);
            }
        });

        CategoriaEliminarBtn4.setBackground(new java.awt.Color(255, 255, 204));
        CategoriaEliminarBtn4.setText("Eliminar");
        CategoriaEliminarBtn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CategoriaEliminarBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaEliminarBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaEliminarBtn4ActionPerformed(evt);
            }
        });

        jLabel13.setText("Id.");

        jLabel14.setText("Nombre");

        tbTotalCategorias4.setBackground(new java.awt.Color(255, 255, 204));
        tbTotalCategorias4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbTotalCategorias4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CategoriaId", "Nombre"
            }
        ));
        tbTotalCategorias4.setSelectionBackground(new java.awt.Color(255, 153, 204));
        jScrollPane7.setViewportView(tbTotalCategorias4);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("¿Qué Quieres hacer?");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdCategoria4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CategoriaCrearBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombrecategoria4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(CategoriaLeerBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(CategoriaEliminarBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(CategoriaActualizarBtn4)
                        .addGap(63, 63, 63)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoriaActualizarBtn4)
                    .addComponent(CategoriaLeerBtn4)
                    .addComponent(CategoriaEliminarBtn4)
                    .addComponent(CategoriaCrearBtn4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtnombrecategoria4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdCategoria4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Proveedor", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CategoriaEliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaEliminarBtnActionPerformed
       CategoriaController categoria= new CategoriaController();
       categoria.eliminarCategoriaVista(Integer.parseInt(txtIdCategoria.getText()));
    }//GEN-LAST:event_CategoriaEliminarBtnActionPerformed

    private void CategoriaActualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaActualizarBtnActionPerformed
     CategoriaController categoria= new CategoriaController();
     categoria.actualizarCategoriaVista(Integer.parseInt(txtIdCategoria.getText()), txtnombrecategoria.getText());
    }//GEN-LAST:event_CategoriaActualizarBtnActionPerformed

    private void CategoriaLeerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaLeerBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbTotalCategorias.getModel();
        model.setRowCount(0);
        ArrayList<Categoria> categorias = new ArrayList();
        CategoriaController categoria = new CategoriaController();
        List<Categoria> leer = categoria.leerCategoriasVista();
        categorias.addAll(leer);

        Object columnas[] = new Object[2];
        for(Categoria c : categorias){
            columnas[0]=c.getCategoria_id();
            columnas [1]=c.getNombre();
            model.addRow(columnas);
        }
    }//GEN-LAST:event_CategoriaLeerBtnActionPerformed

    private void CategoriaLeerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriaLeerBtnMouseClicked

    }//GEN-LAST:event_CategoriaLeerBtnMouseClicked

    private void txtnombrecategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrecategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrecategoriaActionPerformed

    private void txtIdCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCategoriaActionPerformed

    private void CategoriaCrearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaCrearBtnActionPerformed
        CategoriaController categoria= new CategoriaController();
        categoria.crearCategoriaVista(txtnombrecategoria.getText());
    }//GEN-LAST:event_CategoriaCrearBtnActionPerformed

    private void CategoriaCrearBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaCrearBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaCrearBtn1ActionPerformed

    private void txtIdCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCategoria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCategoria1ActionPerformed

    private void txtnombrecategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrecategoria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrecategoria1ActionPerformed

    private void CategoriaLeerBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriaLeerBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaLeerBtn1MouseClicked

    private void CategoriaLeerBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaLeerBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaLeerBtn1ActionPerformed

    private void CategoriaActualizarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaActualizarBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaActualizarBtn1ActionPerformed

    private void CategoriaEliminarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaEliminarBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaEliminarBtn1ActionPerformed

    private void CategoriaCrearBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaCrearBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaCrearBtn2ActionPerformed

    private void txtIdCategoria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCategoria2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCategoria2ActionPerformed

    private void txtnombrecategoria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrecategoria2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrecategoria2ActionPerformed

    private void CategoriaLeerBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriaLeerBtn2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaLeerBtn2MouseClicked

    private void CategoriaLeerBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaLeerBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaLeerBtn2ActionPerformed

    private void CategoriaActualizarBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaActualizarBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaActualizarBtn2ActionPerformed

    private void CategoriaEliminarBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaEliminarBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaEliminarBtn2ActionPerformed

    private void CategoriaCrearBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaCrearBtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaCrearBtn4ActionPerformed

    private void txtIdCategoria4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCategoria4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCategoria4ActionPerformed

    private void txtnombrecategoria4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrecategoria4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrecategoria4ActionPerformed

    private void CategoriaLeerBtn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriaLeerBtn4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaLeerBtn4MouseClicked

    private void CategoriaLeerBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaLeerBtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaLeerBtn4ActionPerformed

    private void CategoriaActualizarBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaActualizarBtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaActualizarBtn4ActionPerformed

    private void CategoriaEliminarBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaEliminarBtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaEliminarBtn4ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CategoriaActualizarBtn;
    private javax.swing.JButton CategoriaActualizarBtn1;
    private javax.swing.JButton CategoriaActualizarBtn2;
    private javax.swing.JButton CategoriaActualizarBtn4;
    private javax.swing.JButton CategoriaCrearBtn;
    private javax.swing.JButton CategoriaCrearBtn1;
    private javax.swing.JButton CategoriaCrearBtn2;
    private javax.swing.JButton CategoriaCrearBtn4;
    private javax.swing.JButton CategoriaEliminarBtn;
    private javax.swing.JButton CategoriaEliminarBtn1;
    private javax.swing.JButton CategoriaEliminarBtn2;
    private javax.swing.JButton CategoriaEliminarBtn4;
    private javax.swing.JButton CategoriaLeerBtn;
    private javax.swing.JButton CategoriaLeerBtn1;
    private javax.swing.JButton CategoriaLeerBtn2;
    private javax.swing.JButton CategoriaLeerBtn4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbTotalCategorias;
    private javax.swing.JTable tbTotalCategorias1;
    private javax.swing.JTable tbTotalCategorias2;
    private javax.swing.JTable tbTotalCategorias4;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtIdCategoria1;
    private javax.swing.JTextField txtIdCategoria2;
    private javax.swing.JTextField txtIdCategoria4;
    private javax.swing.JTextField txtnombrecategoria;
    private javax.swing.JTextField txtnombrecategoria1;
    private javax.swing.JTextField txtnombrecategoria2;
    private javax.swing.JTextField txtnombrecategoria4;
    // End of variables declaration//GEN-END:variables
}
