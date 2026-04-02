class profesor:
    def __init__(self, nombre):
        self.nombre = nombre

    def saludar(self):
        print(f"Hola, soy el profesor {self.nombre}.")
p = profesor("Alejandro")
p.saludar()

