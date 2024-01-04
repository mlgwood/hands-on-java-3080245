package bank;

public class Account {

private int accountId;
private String type;
private double balance;

public Account(int accountId, String type, double balance) {
  setAccountId(accountId);
  setType(type);
  setBalance(balance);
}

  public int getAccountId() {
    return this.accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }


}
