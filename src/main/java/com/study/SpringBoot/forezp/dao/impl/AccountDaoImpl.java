package com.study.SpringBoot.forezp.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.study.SpringBoot.forezp.dao.IAccountDAO;
import com.study.pojo.Account;

@Repository
public class AccountDaoImpl implements IAccountDAO {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;
    @Override
    public int add(Account account) {
//        return jdbcTemplate.update("insert into account(name, money) values(?, ?)",
//              account.getName(),account.getMoney());
    	return 0;

    }

    @Override
    public int update(Account account) {
//        return jdbcTemplate.update("UPDATE  account SET NAME=? ,money=? WHERE id=?",
//                account.getName(),account.getMoney(),account.getId());
    	return 0;
    }

    @Override
    public int delete(int id) {
//        return jdbcTemplate.update("DELETE from TABLE account where id=?",id);
        return 0;
    }

    @Override
    public Account findAccountById(int id) {
//        List<Account> list = jdbcTemplate.query("select * from account where id = ?", new Object[]{id}, new BeanPropertyRowMapper(Account.class));
//        if(list!=null && list.size()>0){
//            Account account = list.get(0);
//            return account;
//        }else{
//            return null;
//        }
    	return null;
    }

    @Override
    public List<Account> findAccountList() {
//        List<Account> list = jdbcTemplate.query("select * from account", new Object[]{}, new BeanPropertyRowMapper(Account.class));
//        if(list!=null && list.size()>0){
//            return list;
//        }else{
//            return null;
//        }
    	return null;
    }
}
