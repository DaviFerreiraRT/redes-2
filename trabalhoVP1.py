<<<<<<< HEAD
=======
import csv
ip=[]
mask = []
interface=[]
def saida(ipCliente,arquivo):
    with open(arquivo, 'r') as file:
        reader = csv.reader(file)
        for row in reader:
            ip.append(row[0])
            mask.append(row[1])
            interface.append(row[2])

            ipFormatado = ip[1:]
            maskFormatada = mask[1:]
            interfaceFormatada = interface[1:]

        if (ipCliente in (ip)):
            print("O IP",ipCliente,"está na tabela de rotas")
        else:
            print("O IP",ipCliente,"não está alocado na tabela")

saida("125.102.32.108","tabelaRota.csv")
    

>>>>>>> 646e17ad491f7238fc68715c15f4d8a614742f00
