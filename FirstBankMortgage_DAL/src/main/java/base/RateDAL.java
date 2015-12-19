package base;

import org.apache.poi.ss.formula.functions.FinanceLib;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.RateDomainModel;
import util.HibernateUtil;

public class RateDAL {


	public static double getRate(int GivenCreditScore) {
		//FinalExam - please implement		
		// Figure out which row makes sense- return back the 
		// right interest rate from the table based on the given credit score
		
		//FinalExam - obviously change the return value
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		double interestRate = 0;
		
		try{
			tx = session.beginTransaction();
			Query query = session.createSQLQuery("from RateDomainModel where minCreditScore <= GivenCreditScore");
			query.setParameter("minCreditScore", GivenCreditScore);
			List<Double> interestRates = query.list();
			interestRates = (List<Double>) query.list();
			
			tx.commit();
			
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
				e.printStackTrace();
		
		} finally {
			session.close();
		}
		return interestRate;
	}

}