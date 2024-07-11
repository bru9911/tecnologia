class ProjetoIA:
    def __init__(self, nome, objetivo, tecnicas, linguagem, status):
        self.nome = nome
        self.objetivo = objetivo
        self.tecnicas = tecnicas
        self.linguagem = linguagem
        self.status = status

    def descricao(self):
        return (f"Nome do Projeto: {self.nome}\n"
                f"Objetivo: {self.objetivo}\n"
                f"Técnicas Utilizadas: {self.tecnicas}\n"
                f"Linguagem de Programação: {self.linguagem}\n"
                f"Status do Projeto: {self.status}\n")


def main():
    projetos = []
    while True:
        print("Informe os dados do Projeto de IA (ou digite 'sair' para finalizar):")
        nome = input("Nome do Projeto: ")
        if nome.lower() == 'sair':
            break
        objetivo = input("Objetivo: ")
        tecnicas = input("Técnicas Utilizadas: ")
        linguagem = input("Linguagem de Programação: ")
        status = input("Status do Projeto: ")

        projeto = ProjetoIA(nome, objetivo, tecnicas, linguagem, status)
        projetos.append(projeto)

    print("\nDescrições dos Projetos de IA cadastrados:")
    for projeto in projetos:
        print(projeto.descricao())


if __name__ == "__main__":
    main()
