
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Đỗ Nam
 */
public class ProductData {
   static List<Product> productList = new ArrayList(); 
   public static Vector getProductList() throws Exception{
       Vector<Vector<String>> proList = new Vector<Vector<String>>();
   
   try{
       
    for(Product p: productList){
        float sub= p.getUnitPrice()*p.getQuantity();
        Vector<String> productDetail = new Vector<String>();
        productDetail.add(String.valueOf(p.getProductID()));
        productDetail.add(p.getProductName());
        productDetail.add(String.valueOf(p.getUnitPrice()));
        productDetail.add(String.valueOf(p.getQuantity()));
        productDetail.add(String.valueOf(sub));
        proList.add(productDetail);
    }
    return proList;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
   
   public static void insertProduct(Product NewProduct) throws Exception{
       try{
           productList.add(NewProduct);
           
       }catch(Exception e){
           throw new Exception(e.getMessage());
       }
   }
   public static void updateProduct(Product NewProduct) throws Exception{
       try {
         
       } catch (Exception e) {
           throw new Exception(e.getMessage());
       }
   }
   public static void deleteProduct(int ProductID) throws Exception{
       
   }
  
}
