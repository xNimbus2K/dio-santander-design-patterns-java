package application;

import models.Bank;
import models.BankAccount;
import models.Customer;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        // Cria uma instância do banco (Singleton)
        Bank bank = Bank.getInstance();

        // Cria clientes e contas bancárias
        Customer customer1 = new Customer("Alice");
        BankAccount account1 = new BankAccount(1, 1000.0);
        customer1.addAccount(account1);

        Customer customer2 = new Customer("Bob");
        BankAccount account2 = new BankAccount(2, 1500.0);
        customer2.addAccount(account2);

        // Adiciona clientes ao banco
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Realiza operações bancárias
        account1.deposit(500.0);
        account2.withdraw(200.0);

        // Imprime informações sobre os clientes e suas contas
        List<Customer> customers = bank.getCustomers();
        for (Customer customer : customers) {
            System.out.println("Cliente: " + customer.getName());
            List<BankAccount> accounts = customer.getAccounts();
            for (BankAccount account : accounts) {
                System.out.println("Conta " + account.getAccountNumber() + ": Saldo " + account.getBalance());
            }
        }
    }
}
