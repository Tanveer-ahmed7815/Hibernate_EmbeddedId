package com.testyantra.HibernateEmbeddedId;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.testyantra.dtos.AccountId;
import com.testyantra.dtos.AccountInformation;

public class App 
{
	//add hibernate dialect in persistence.xml in case of any sql grammar mistakes
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentDB");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        AccountId id = new AccountId();
        id.setAccountId(101);
        id.setAccountType("Savings");
        
        AccountInformation info = new AccountInformation();
        
        info.setAccountHolderName("Syed");
        info.setAccountId(id);
        
        em.persist(info);
        
        em.getTransaction().commit();
        
        em.close();
        
        emf.close();
    }
}
