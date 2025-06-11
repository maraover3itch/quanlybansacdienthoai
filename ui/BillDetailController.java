/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.cafe.ui;

import poly.cafe.entity.Bill;

/**
 *
 * @author admin
 */
public interface BillDetailController {
    void setBill(Bill bill);
    void open();
    void close();
    void showDrinkJDialog();
    void removeDrinks();
    void updateQuantity();
    void checkout();
    void cancel();
}
