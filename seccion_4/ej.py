class persona:
    def __init__(self, nombre):
        self.nombre = nombre

    def saludar(self):
        print("Hola soy", self.nombre)

p=persona("Carlos")
p.saludar()