/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bansacdienthoai.dao;

import java.util.List;
import poly.cafe.entity.Drink;

/**
 *
 * @author SMOGGY
 */
public interface productdao extends CrudDao<Drink, String>{
    List<Drink> findByCategoryId(String Categoryid);
}
