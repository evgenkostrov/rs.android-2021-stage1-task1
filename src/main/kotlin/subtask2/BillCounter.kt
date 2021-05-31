package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")

        fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
            var counter = 0
            for (i in 0 until bill.size) {
                if(i != k)
                    counter += bill[i]
            }
            val b_actual = counter/2
            val b_charged = b
            val divergent = b_charged-b_actual
            println(b_actual)
            return if (b == b_actual) "bon appetit" else divergent.toString()







        }

}
