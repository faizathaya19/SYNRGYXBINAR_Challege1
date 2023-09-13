class ChallengeOne{
    fun cetakpiramidaBintang(tinggi: Int) {
        for (i in 1..tinggi) {
            for (j in 1..(tinggi - i)) {
                print(" ")
            }

            for (k in 1..(2 * i - 1)) {
                print("*")
            }

            println()
        }
    }

    fun cetakpiramidaterbalikBintang(tinggi: Int) {
        for (i in tinggi downTo 1) {
            for (j in 1..(tinggi - i)) {
                print(" ")
            }

            for (k in 1..(2 * i - 1)) {
                print("*")
            }

            println()
        }
    }

    fun cetaklayanglayangBintang(tinggi: Int) {
        for (i in 1..tinggi) {
            for (j in 1..(tinggi - i)) {
                print(" ")
            }

            for (k in 1..(2 * i - 1)) {
                print("*")
            }

            println()
        }

        for (i in (tinggi - 1) downTo 1) {
            for (j in 1..(tinggi - i)) {
                print(" ")
            }

            for (k in 1..(2 * i - 1)) {
                print("*")
            }

            println()
        }
    }

    fun cetakXBintang(tinggi: Int) {
        for (i in 1..tinggi) {
            for (j in 1..tinggi) {
                if (j == i || j == tinggi - i + 1) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }

    fun cetakpiramidahollowBintang(tinggi: Int) {
        for (i in 1..tinggi) {
            for (j in 1..(tinggi - i)) {
                print(" ")
            }

            if (i == 1 || i == tinggi) {
                for (k in 1..(2 * i - 1)) {
                    print("*")
                }
            } else {
                print("*")
                for (k in 1..(2 * i - 3)) {
                    print(" ")
                }
                print("*")
            }

            println()
        }
    }
}


fun main() {
    val tinggi = 8
    val Challengeone = ChallengeOne()

    println("Piramida Bintang:")
    Challengeone.cetakpiramidaBintang(tinggi)

    println("\nPiramida Terbalik Bintang:")
    Challengeone.cetakpiramidaterbalikBintang(tinggi)

    println("\nLayang-Layang Bintang:")
    Challengeone.cetaklayanglayangBintang(tinggi)

    println("\nX Bintang:")
    Challengeone.cetakXBintang(tinggi)

    println("\nPiramida Hollow Bintang:")
    Challengeone.cetakpiramidahollowBintang(tinggi)
}
