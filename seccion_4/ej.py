class persona:
    def __init__(self, nombre):
        self.nombre = nombre

    def saludar(self):
        print("Hola soy", self.nombre)

p=persona("Alejandro")
p.saludar()
p=persona("Maria")
p.saludar()