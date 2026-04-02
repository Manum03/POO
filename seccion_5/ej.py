class Contador:
    total = 0
    
    def __init__(self):
        Contador.total += 1
    
    @staticmethod
    def mostrar_total():
        print("Total de objetos:", Contador.total)
c1 = Contador()
c2 = Contador()
c3 = Contador()
c4 = Contador()
c5 = Contador()
Contador.mostrar_total()