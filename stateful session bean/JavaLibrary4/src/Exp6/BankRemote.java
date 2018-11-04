/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp6;

import javax.ejb.Remote;

/**
 *
 * @author sriir
 */
@Remote
public interface BankRemote {

    void withdraw(int a);

    void deposit(int a);

    int getBalance();
    
}
