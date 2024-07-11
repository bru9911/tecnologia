class PCGamer:
    def __init__(self, marca, processador, memoria_ram, placa_video, armazenamento, preco):
        self.marca = marca
        self.processador = processador
        self.memoria_ram = memoria_ram
        self.placa_video = placa_video
        self.armazenamento = armazenamento
        self.preco = preco

    def descricao(self):
        return (f"PC Gamer Marca: {self.marca}\n"
                f"Processador: {self.processador}\n"
                f"Memória RAM: {self.memoria_ram} GB\n"
                f"Placa de Vídeo: {self.placa_video}\n"
                f"Armazenamento: {self.armazenamento} GB\n"
                f"Preço: R${self.preco:.2f}\n")


def main():
    pcs = []
    while True:
        print("Informe os dados do PC Gamer (ou digite 'sair' para finalizar):")
        marca = input("Marca: ")
        if marca.lower() == 'sair':
            break
        processador = input("Processador: ")
        memoria_ram = input("Memória RAM (em GB): ")
        placa_video = input("Placa de Vídeo: ")
        armazenamento = input("Armazenamento (em GB): ")
        preco = float(input("Preço: "))

        pc = PCGamer(marca, processador, memoria_ram, placa_video, armazenamento, preco)
        pcs.append(pc)

    print("\nDescrições dos PCs Gamers cadastrados:")
    for pc in pcs:
        print(pc.descricao())


if __name__ == "__main__":
    main()
