
    fun main(args: Array<String>) {

        // Create mutable dictionary of country and capital
        val countriesAndCapitals = mutableMapOf<String, String>()

        //Create for loop to ask user enter country and capital

        for (time in 0..2) {

            print("Enter the country : ")
            val country = readLine()!!.toString()
            print("Enter the capital : ")
            val capital = readLine()!!.toString()

            //After that put instead mutable dictionary
            countriesAndCapitals.put(country, capital)

        }
        //finally, will create for loop to print the arrayList
        for (key in countriesAndCapitals.keys) {

            println("The country is ${key} and the capital is ${countriesAndCapitals[key]}")

        }

    }



