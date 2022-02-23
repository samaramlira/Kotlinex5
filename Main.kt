fun main() {
    //Faça um programa que o usuário digite um número e o programa retorne o mês referente ao valor.

    print("Digite o número do mês: ")
    val mes = readLine()!!.toInt()

    when(mes) {

        1 -> println("Mês de Janeiro")
        2 -> println("Mês de Fevereiro")
        3 -> println("Mês de Março")
        4 -> println("Mês de Abril")
        5 -> println("Mês de Maio")
        6 -> println("Mês de Junho")
        7 -> println("Mês de Julho")
        8 -> println("Mês de Agosto")
        9 -> println("Mês de Setembro")
        10 -> println("Mês de Outrubro")
        11 -> println("Mês de Novembro")
        12 -> println("Mês de Dezembro")

    }
}