package lesson9;

import lesson9.Account;
import lesson9.implementation.CompanyAccount;
import lesson9.implementation.PersonalAccount;

public class AccountLauncher {
    public static void main(String[] args) {
        Account myAccaunt = new Account("Ivanov Vitaly");
        myAccaunt.activated();
        myAccaunt.deposit(10_000);
        myAccaunt.withdraw(1_000);
        myAccaunt.deposit(5_000);
        System.out.println("Состояние счета: " + myAccaunt.getBallance());

        PersonalAccount clientAccount = new PersonalAccount("Арнольд Шварцнеггер");
        clientAccount.activated();
        clientAccount.deposit(1_000_000);

        CompanyAccount companyAccount = new CompanyAccount("IT Park");
        companyAccount.activated();
        companyAccount.deposit(10_000_000);

        CompanyAccount anotherCompanyAccount = new CompanyAccount("Рога и копыта");
        anotherCompanyAccount.activated();
        anotherCompanyAccount.deposit(10_000);

        CompanyAccount vtbCompanyAccount = new CompanyAccount("ВТБ");
        vtbCompanyAccount.activated();
        vtbCompanyAccount.deposit(100_000_000);

        System.out.println("Количество открытых расчетных счетов: " + companyAccount.COUNT);

        System.out.println("БИК: " + PersonalAccount.getBic());

        System.out.println("Состояние счета в долларах: " + vtbCompanyAccount.getBallanceInDollars());

    }
}
