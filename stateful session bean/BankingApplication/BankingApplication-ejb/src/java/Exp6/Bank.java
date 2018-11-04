/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp6;

import javax.ejb.Stateful;

@Stateful
public class Bank implements BankRemote {
private int balance=100000;
    @Override
    public void withdraw(int a) {
        if(balance >a )
        {
            balance -= a;
        }
        else
        {
            balance =0;
        }
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void deposit(int a) {
        balance += a;
    }

    @Override
    public int getBalance() {
        return balance;
    }
    
}
