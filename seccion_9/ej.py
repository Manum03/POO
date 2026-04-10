class Cuenta:
    def __init__(self):
        self.__saldo = 1000
c = Cuenta()
mostrar_saldo = getattr(c, "_Cuenta__saldo")
print(mostrar_saldo)
