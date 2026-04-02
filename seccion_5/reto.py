class contador:
    total = 0

    def __init__(self):
        contador.total += 1

    @staticmethod
    def mostrar_total():
        print(f"Total de visitantes creados: {contador.total}")

v1 = contador()
v2 = contador()
v3 = contador()
v4 = contador()
contador.mostrar_total()