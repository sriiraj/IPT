/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.util.*; 
import java.io.* ; 
public class AccountDetail_Bean implements Serializable { 
    private String date;
    private long accountNo;
    private String name;
    private double withdrawAmount;
    private final double balanceAmt = 100000;

    public void generateSystemDate() {
        Date date = new java.util.Date();
        setDate(date.toString());
    }

    public double currentBalance() {
        if(balanceAmt < withdrawAmount) return balanceAmt;
        return balanceAmt - withdrawAmount;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public double getBalanceAmt() {
        return balanceAmt;
    }
}