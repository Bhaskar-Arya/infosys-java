package com.ui.repo;
import com.ui.*;

import org.springframework.stereotype.*;
import org.hibernate.hql.internal.ast.tree.BooleanLiteralNode;
import org.springframework.*;
import javax.transaction.*;
import javax.persistence.*;
@Repository

public class ProducRepo {
    @PersistenceContext 
    EntityManager em;
	public boolean addProduct (Product pt) {
		em.persist(pt);
		return true;	
	}
	public Product show(int key){
		return em.find(Product.class, key);
	}
	public boolean update(Product p) {
	     em.merge(p);
		return true; 
	}

}
