class celular:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo

    def mostrar_informacion(self):
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")

celular1 = celular("Apple", "iPhone 13")
celular1.mostrar_informacion()