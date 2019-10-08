package fr.epsi.bank;

public class Account
{
    /**
     * @param taxe: en pourcent
     */
    public Account(double taxe) throws AccountException
    {
        if (taxe < 0)
            throw new AccountException("Impossible de creer un compte avec un taux negatif");
        this.taxe = taxe / 100;
        funds = 0;
    }

    public void deposit(double value) throws AccountException
    {
        if (value <= 0)
            throw new AccountException("Impossible de deposer un montant negatif ou nul");
        System.out.printf("- Vous deposez %.2f euros, la maison vole %.2f euros\n", value, taxe*value);
        funds += value - (taxe*value);
    }

    public void withdraw(double value) throws AccountException
    {
        if (value <= 0)
            throw new AccountException("Impossible de retirer un montant negatif ou nul");
        funds -= value;
    }

    // Consultation du solde
    public double balance()
    {
        return funds;
    }

    private double funds;        // Solde non modifiable
    private final double taxe;
}
