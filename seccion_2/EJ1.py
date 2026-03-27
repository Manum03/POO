class Libro:
    def __init__(self):
        self.titulo = ""
        self.autor = ""
    
    def mostrar_info(self):
        print("Título:", self.titulo)
        print("Autor:", self.autor)
libro1 = Libro()
libro1.titulo = "Cien años de soledad"
libro1.autor = "Gabriel García Márquez"
libro1.mostrar_info()

libro2 = Libro()
libro2.titulo = "Don Quijote de la Mancha"
libro2.autor = "Miguel de Cervantes"
libro2.mostrar_info()