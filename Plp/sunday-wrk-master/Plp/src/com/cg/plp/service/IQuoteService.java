package com.cg.plp.service;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import com.cg.plp.bean.AccountCreationBean;
import com.cg.plp.bean.PolicyCreationBean;
import com.cg.plp.bean.PolicyQuestions;
import com.cg.plp.bean.UserLoginBean;
import com.cg.plp.exception.InsuranceException;

public interface IQuoteService {

	public int checkValidLogin(UserLoginBean userLoginBean) throws SQLException, ClassNotFoundException, FileNotFoundException,InsuranceException;
	public void profileCreation(UserLoginBean userLoginBean) throws ClassNotFoundException, FileNotFoundException, SQLException,InsuranceException;
	public void accountCreation(AccountCreationBean accountCreationBean) throws ClassNotFoundException, FileNotFoundException, SQLException,InsuranceException;
	public void policyCreation(PolicyCreationBean policyCreationBean)throws InsuranceException;
	public List<PolicyQuestions> retrieveAll() throws ClassNotFoundException, FileNotFoundException, SQLException,InsuranceException;

}
