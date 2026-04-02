class procesador:
    def instalar(self):
        print("procesador instalado")


class computador:
    def __init__(self):
        self.procesador = procesador()

    def instalar(self):
        self.procesador.instalar()
        print("Computador listo para usar")


c = computador()
c.instalar()