/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bansacdienthoai.dao;

import java.util.List;
import bansacdienthoai.entity.BillDetail;

public interface BillDetailDAO extends CrudDao<BillDetail, Long> {

    List<BillDetail> findByBillId(Long billId);

    List<BillDetail> findByDrinkId(String drinkId);
}
