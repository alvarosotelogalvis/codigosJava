jugadas = [0, 0, 0, 0, 0 ,0 ,0 ,0 , 0]

def presentacion():
    print(" ")
    print("___________________________________")
    print("           Game: triqui")
    print("___________________________________")
    print("jugador 1: x")
    print("jugador 2: o")
    print(" ")
    print(" -----------------")
    print("|  1  |  2  |  3  |")
    print(" -----------------")
    print("|  4  |  5  |  6  |")
    print(" -----------------")
    print("|  7  |  8  |  9  |")
    print(" -----------------")
    print("___________________________________________________________")

def JugadaJ1():
    print("Ingrese la posicion donde quiere jugar del 1...9")
    jugada1 = int( input("jugador 1: ") )
    if jugada1==1:
        jugadas[0]=1
    if jugada1==2:
        jugadas[1]=1
    if jugada1==3:
        jugadas[2]=1
    if jugada1==4:
        jugadas[3]=1
    if jugada1==5:
        jugadas[4]=1
    if jugada1==6:
        jugadas[5]=1
    if jugada1==7:
        jugadas[6]=1
    if jugada1==8:
        jugadas[7]=1
    if jugada1==9:
        jugadas[8]=1
    print("___________________________________________________________")
    

def JugadaJ2():
    print("Ingrese la posicion donde quiere jugar del 1...9")
    jugada2 = int( input("jugador 2: ") )
    if jugada2==1:
        jugadas[0]=2
    if jugada2==2:
        jugadas[1]=2
    if jugada2==3:
        jugadas[2]=2
    if jugada2==4:
        jugadas[3]=2
    if jugada2==5:
        jugadas[4]=2
    if jugada2==6:
        jugadas[5]=2
    if jugada2==7:
        jugadas[6]=2
    if jugada2==8:
        jugadas[7]=2
    if jugada2==9:
        jugadas[8]=2
    print("___________________________________________________________")

def imprimirTablero():
    print(" ")
    print(" -----------------")
    print("|  1  |  2  |  3  |")
    print(" -----------------")
    print("|  4  |  5  |  6  |")
    print(" -----------------")
    print("|  7  |  8  |  9  |")
    print(" -----------------")
    print("___________________________________________________________")

presentacion()
JugadaJ1()
imprimirTablero()
JugadaJ2()
imprimirTablero()

print("___________________________________________________________")
print(" ")
