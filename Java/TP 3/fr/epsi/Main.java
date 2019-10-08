package fr.epsi;
import fr.epsi.bank.*;

/*
 * Creer une classe modelisant un compte bancaire:
 * - Un pourcentage de retenue est applique a chaque depot, celui-ci est fixe a la creation du compte
 *   et ne peut pas evoluer par la suite
 * - Une methode permet d'ajouter de l'argent, une autre d'en retirer, chacune mettant a jour le solde
 * - Le solde peut etre consultable mais pas modifiable par l'utilisateur 
 */
public class Main
{
    public static void main(String[] args)
    {
        Account account;
        try {
            account = new Account(1.5);
        }
        catch(AccountException e) {
            System.err.println(e.getMessage());
            return;
        }
        System.out.printf("Solde: %.2f\n", account.balance());

        try {
            account.deposit(300);
        }
        catch(AccountException e) {
            System.err.println(e.getMessage());
            return;
        }
        System.out.printf("Solde: %.2f\n", account.balance());

        try {
            account.withdraw(595.50);
        }
        catch(AccountException e) {
            System.err.println(e.getMessage());
            return;
        }
        System.out.printf("Solde: %.2f\n", account.balance());
    }
}
