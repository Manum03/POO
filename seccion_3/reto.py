class curso:
    def __init__(self, nombre, creditos):
        self.nombre = nombre
        self.creditos = creditos

    def mostrar(self):
        print("Curso:", self.nombre, "Créditos:", self.creditos)

c1 = curso ("Programación", 4)
c1.mostrar()
