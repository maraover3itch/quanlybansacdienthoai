/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bansacdienthoai.dao;

import java.util.Date;
import java.util.List;
import poly.cafe.entity.Revenue;

/**
 *
 * @author Admin
 */
public interface RevenueDAO {

    List<Revenue.ByCategory> getByCategory(Date begin, Date end);

    List<Revenue.ByUser> getByUser(Date begin, Date end);
}
