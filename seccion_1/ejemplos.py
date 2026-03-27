class Estudiante:
    def __init__(self):
        self.nombre = ""
        self.edad = 0

    def mostrar(self):
        print("Nombre:", self.nombre, "Edad:", self.edad)
e1 = Estudiante()
e1.nombre = "Alejandro"
e1.edad = 20
e1.mostrar()
e2 = Estudiante()
e2.nombre = "Valentina"
e2.edad = 24
e2.mostrar()