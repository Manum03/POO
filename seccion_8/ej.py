class Prueba:
    def __init__(self, nombre):
        self.nombre = nombre
        print("Objeto creado:", self.nombre)

p1 = Prueba("Objeto1")
p2 = Prueba("Objeto2")
p3 = Prueba("Objeto3")
p2 = None
p3 = None
print("Fin del programa")
