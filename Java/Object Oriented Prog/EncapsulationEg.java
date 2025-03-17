
class EncapsulationEg {

    private double bal;

    public EncapsulationEg(double initialBal) {
        if (initialBal > 0) {
            bal = initialBal;
        }
    }

    public void deps(double amt) {
        if (amt > 0) {
            bal += amt;
            System.out.println("Deposited: " + amt);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && bal >= amount) {
            bal -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return bal;
    }

    public static void main(String[] args) {
        EncapsulationEg account = new EncapsulationEg(5000);
        account.deps(2000);
        account.withdraw(1700);
        System.out.println("Final Balance: " + account.getBalance());
    }
}
