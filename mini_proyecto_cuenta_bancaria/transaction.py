class Transaction:
    def __init__(self, fecha, monto):
        self.fecha = fecha
        self.monto = monto

    def display(self):
        print(f"Fecha: {self.fecha}, Monto: {self.monto}")