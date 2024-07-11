class TV:
    def __init__(self, marca, modelo, tamanho, resolucao, preco):
        self.marca = marca
        self.modelo = modelo
        self.tamanho = tamanho
        self.resolucao = resolucao
        self.preco = preco

    def descricao(self):
        return (f"TV Marca: {self.marca}\n"
                f"Modelo: {self.modelo}\n"
                f"Tamanho da Tela: {self.tamanho} polegadas\n"
                f"Resolução: {self.resolucao}\n"
                f"Preço: R${self.preco:.2f}\n")


def main():
    tvs = []
    while True:
        print("Informe os dados da TV (ou digite 'sair' para finalizar):")
        marca = input("Marca: ")
        if marca.lower() == 'sair':
            break
        modelo = input("Modelo: ")
        tamanho = input("Tamanho da Tela (em polegadas): ")
        resolucao = input("Resolução: ")
        preco = float(input("Preço: "))

        tv = TV(marca, modelo, tamanho, resolucao, preco)
        tvs.append(tv)

    print("\nDescrições das TVs cadastradas:")
    for tv in tvs:
        print(tv.descricao())


if __name__ == "__main__":
    main()
