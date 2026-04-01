class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio
    
    def mostrar(self):
        print("Producto:", self.nombre, "Precio:", self.precio)
p1 = Producto("Cuaderno", 8500)
p2 = Producto("Lapicero", 1500)
p3 = Producto("Borrador", 500)
p1.mostrar()
p2.mostrar()
p3.mostrar()