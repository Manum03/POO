from transaction import Transaction

class BankAccount:
    total_cuentas = 0

    def __init__(self, numero_cuenta, saldo_inicial):
        self.numero_cuenta = numero_cuenta
        self.saldo = saldo_inicial
        self.transactions = []
        BankAccount.total_cuentas += 1

    def add_transaction(self, t):
        self.transactions.append(t)
        self.saldo += t.monto

    def display(self):
        print(f"Cuenta: {self.numero_cuenta}, Saldo: {self.saldo}")
        print("Transacciones:")
        for t in self.transactions:
            t.display()