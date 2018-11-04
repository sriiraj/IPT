import java.util.Calendar; 
import java.util.GregorianCalendar; 
public class AccountDetail_Bean { 
private String Date; 
private long Acct_no; 
private String Name; 
private final double Balance_amt = 100000; 
private double Withdraw_amount; 
public double getWithdraw_amount() { 
return Withdraw_amount; 
} 
public void setWithdraw_amount(double Withdraw_amount) { 
this.Withdraw_amount = Withdraw_amount; 
} 
public double getBalance_amt() { 
return Balance_amt; 
} 
public String getName() { 
return Name; 
} 
public void setName(String Name) { 
this.Name = Name; 
} 
public long getAcct_no() { 
return Acct_no; 
} 
public void setAcct_no(long Acct_no) { 
this.Acct_no = Acct_no; 
} 
public String getDate() { 
return Date; 
} 
public void setDate(String Date) { 
this.Date = Date; 
} 
public void generate_SystemDate() 
{ 
Calendar cal = new GregorianCalendar(); 
int month = cal.get(Calendar.MONTH); 
int year = cal.get(Calendar.YEAR); 
int day = cal.get(Calendar.DAY_OF_MONTH); 
setDate("Date is : " + day + "/" + (month + 1) + "/" + year); 
} 
public double current_Balance()
{ 
double balance = Balance_amt-Withdraw_amount; 
if(Withdraw_amount>Balance_amt) 
{ 
return Balance_amt; 
} 
else 
{ 
return balance; 
} 
} 
} 
