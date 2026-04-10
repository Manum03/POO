from bank_account import BankAccount
from transaction import Transaction

cuenta1 = BankAccount("12345", 1000.0)
cuenta1.add_transaction(Transaction("2023-01-01", 500.0))
cuenta1.add_transaction(Transaction("2023-01-02", -200.0))

cuenta2 = BankAccount("67890", 2000.0)
cuenta2.add_transaction(Transaction("2023-01-01", 1000.0))

cuenta1.display()
cuenta2.display()
print(f"Total cuentas: {BankAccount.total_cuentas}")