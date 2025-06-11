/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bansacdienthoai.dao;

import java.util.Date;
import java.util.List;
import bansacdienthoai.entity.Bill;

public interface BillDAO extends CrudDao<Bill, Long> {

    List<Bill> findByUsername(String username);

    List<Bill> findByCardId(Integer cardId);

    public List<Bill> findByTimeRange(Date begin, Date end);
    public Bill findServicingByCardId(Integer cardId);
    List<Bill> findByUserAndTimeRange(String username, Date begin, Date end);
}
