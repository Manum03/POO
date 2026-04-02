class facultad:
    def fundar(self):
        print("La facultad de Informatica fue fundada en el año 2000")

class universidad:
    def __init__(self):
        self.facultad = facultad()

    def fundar(self):
        self.facultad.fundar()
        print("La universidad fue fundada en el año 1990")

u = universidad()
u.fundar()