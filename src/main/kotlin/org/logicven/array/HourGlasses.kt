package org.logicven.array

class HourGlasses {


    fun extract(array: Array<Array<Int>>) : Int {

        var max : Int = Int.MIN_VALUE
        for(i in 0 until 6){
            for(j in 0 until 6){
                if(i-1>=0 && i+1 < 6 && j-1>=0 && j+1 < 6 ){
                     sumHourGlass(i,j,array).takeIf { max < it }?.apply { max = sumHourGlass(i,j,array) }
                }
            }
        }
        return max
    }

    private fun sumHourGlass( x : Int,  y : Int, array : Array<Array<Int>>) : Int {

        var sum: Int = 0
        for (i in x - 1 until x + 2) {
            for (j in y -1  until y + 2) {
                sum += array[i][j]
            }
        }
        sum -= array[x][y-1]
        sum -= array[x][y+1]

        return sum
    }

}
