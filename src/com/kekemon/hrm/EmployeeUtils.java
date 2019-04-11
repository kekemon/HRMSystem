package com.kekemon.hrm;

import java.util.List; 
import java.util.Iterator; 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kekemon.hrm.model.Credential;
import com.kekemon.hrm.model.Employee;

public class EmployeeUtils {
	private static SessionFactory factory; 
	
	static{
		factory = new Configuration().configure().buildSessionFactory();
	}

	public static Employee getEmployeeBy(String userName, String passsWord){
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List<Employee> employees = session.createQuery("FROM Employee").list(); 
			for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext();){
				Employee employee = (Employee) iterator.next(); 
				Credential ceCredential = employee.getCredential();
				if(ceCredential.getPassWord().equals(passsWord) && ceCredential.getUserName().equals(userName) ){
					tx.commit();
					return employee;
				}
			}
			tx.commit();
		} catch (HibernateException e) {
		} finally {
			session.close();
		}
		return null;
	}
}