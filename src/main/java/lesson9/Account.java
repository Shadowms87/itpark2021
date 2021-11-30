package lesson9;

public class Account {

    private final String owner;
    private double ballance;
    private boolean blocked;

    public Account (String name) {
        this.owner = name;
        this.ballance = 0.0;
        this.blocked = true;
    }

    public Account() {
        this("Unknown");
    }

    public boolean deposit (double amount) {
        if (isBlocked()) {
            return false;
        }
        ballance += amount;
        return true;
    }

    protected boolean isBlocked() {
        return this.blocked;
    }

    public boolean withdraw (double amount) {
        if (blocked) {
            return false;
        }
        if (this.ballance >= amount) {
            ballance -= amount;
            return true;
        }
        return false;
    }

     public void activated() {
        this.blocked = false;
    }

    public final double getBallance() {
        return ballance;
    }
}
