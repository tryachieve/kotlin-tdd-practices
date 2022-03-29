package org.logicven.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class HourGlassesTest{


    companion object {
        @JvmStatic
        @BeforeAll
        fun setup() {

            // url https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

            /*
            I first thought if i extract array of array outside of hourglass and create new array from it
                    -- like array of hourglass or array of array of array  and then do the necessary calculations

                    then during coding, i find more obvious and easy way which is just omit creating new hourglass array, create hourglass array and send it to sum hourglass function then calculate the maximum number
        */

            /*
            6 6
            EXTRACT HOURGLASSES
                    3 3
            SUM HOURGLASSES

                central point
                        discard 2 nearby points from central
        */

        }
    }


    @DisplayName("Extraction of Hourglasses in the array")
    @Test
    fun hourGlassesExtractTest(){

        var hourGlasses = HourGlasses()


        val array: Array<Array<Int>> = arrayOf(
            arrayOf(1, 1, 1, 0, 0, 0),
            arrayOf(0, 1, 0, 0, 0, 0),
            arrayOf(1, 1, 1, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0),
            arrayOf(0, 0, 0, 0, 0, 0)
        )

/*        val resultArray: Array<Array<Array<Int>>> =
         arrayOf(
                arrayOf(
                    arrayOf(1, 1, 1),
                    arrayOf(0, 1, 0),
                    arrayOf(1, 1, 1)
                ),
                arrayOf(
                    arrayOf(1, 1, 1),
                    arrayOf(0, 1, 0),
                    arrayOf(1, 1, 1)
                )
         )*/


       var maxSum = hourGlasses.extract(array)
        assertEquals(7,maxSum)

    }


    @DisplayName("Array example from hackerrank")
    @Test
    fun hourGlassesExtractHackerrank(){

        var hourGlasses = HourGlasses()

        val array: Array<Array<Int>> = arrayOf(
            arrayOf(1, 1, 1, 0, 0, 0),
            arrayOf(0, 1, 0, 0, 0, 0),
            arrayOf(1, 1, 1, 0, 0, 0),
            arrayOf(0, 9, 2, -4, -4, 0),
            arrayOf(0, 0, 0, -2, 0, 0),
            arrayOf(0, 0, -1, -2, -4, 0)
        )


        var maxSum = hourGlasses.extract(array)
        assertEquals(13,maxSum)

    }

}