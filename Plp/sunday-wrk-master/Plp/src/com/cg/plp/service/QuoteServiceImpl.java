package com.cg.plp.service;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.plp.bean.AccountCreationBean;
import com.cg.plp.bean.PolicyCreationBean;
import com.cg.plp.bean.PolicyQuestions;
import com.cg.plp.bean.UserLoginBean;
import com.cg.plp.dao.IQuoteDAO;
import com.cg.plp.dao.QuoteDAOImpl;
import com.cg.plp.exception.InsuranceException;

public class QuoteServiceImpl implements IQuoteService {

	IQuoteDAO iQuoteDAO=new QuoteDAOImpl();
	
	@Override
	public int checkValidLogin(UserLoginBean userLoginBean) throws InsuranceException, ClassNotFoundException, FileNotFoundException, SQLException {
		
		
		
		//System.out.println("id"+userLoginBean.getLoginId());
		
		return iQuoteDAO.checkValidLogin(userLoginBean);
	}

	@Override
	public void profileCreation(UserLoginBean userLoginBean) throws ClassNotFoundException, FileNotFoundException, SQLException,InsuranceException {
		// TODO Auto-generated method stub
		
		//System.out.println(userLoginBean.getPassword()+" "+userLoginBean.getLoginId());
		
		iQuoteDAO.profileCreation(userLoginBean);
		
		
	}

	@Override
	public void accountCreation(AccountCreationBean accountCreationBean) throws  InsuranceException,ClassNotFoundException, FileNotFoundException, SQLException {
		// TODO Auto-generated method stub
		iQuoteDAO.accountCreation(accountCreationBean);
	}

	@Override
	public void policyCreation(PolicyCreationBean policyCreationBean) throws InsuranceException {
		// TODO Auto-generated method stub
		//iQuoteDAO.policyCreation(policyCreationBean);
		
	}

	@Override
	public List<PolicyQuestions> retrieveAll() throws  InsuranceException,ClassNotFoundException, FileNotFoundException, SQLException {
	
		//List<PolicyQuestions> policyList=null;
		List<PolicyQuestions> policy= new ArrayList<PolicyQuestions>();
				policy=iQuoteDAO.retrieveAll();
		
		return policy;
		
		

	}

	
	
}
