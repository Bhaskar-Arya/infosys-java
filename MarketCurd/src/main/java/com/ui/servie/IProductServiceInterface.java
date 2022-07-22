package com.ui.servie;
import com.ui.dto.Product;
import java.util.Iterator;

public interface IProductServiceInterface {
	public boolean addProduct(Product pt);  // this is for to add the record in the entity class (Produc )
	public boolean delete();      //this is for the delete the record from the entity
	public Iterable<Product> showRecodProduct();
	public void showProduct(int key);
	//public String showallRecord();
	//saveallrecord()
	//ftechrecord on the basis of every field column present;
	//fetch record on the groupby and where clause; 
	

}
