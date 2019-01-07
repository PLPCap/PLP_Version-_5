package com.cg.plp.dao;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import com.cg.plp.bean.AccountCreationBean;
import com.cg.plp.bean.PolicyCreationBean;
import com.cg.plp.bean.PolicyQuestions;
import com.cg.plp.bean.UserLoginBean;
import com.cg.plp.exception.InsuranceException;

public interface IQuoteDAO {

	public int checkValidLogin(UserLoginBean userLoginBean) throws InsuranceException, SQLException, ClassNotFoundException, FileNotFoundException;
	public void profileCreation(UserLoginBean userLoginBean) throws  InsuranceException,ClassNotFoundException, FileNotFoundException, SQLException;
	public void accountCreation(AccountCreationBean accountCreationBean) throws InsuranceException,ClassNotFoundException, FileNotFoundException, SQLException;
	public void policyCreation(PolicyCreationBean policyCreationBean) throws InsuranceException;
	public List<PolicyQuestions> retrieveAll() throws InsuranceException, ClassNotFoundException, FileNotFoundException, SQLException;
}
