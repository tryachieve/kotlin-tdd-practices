package org.logicven.hashmap_dictionary

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RansomNoteTest {


    @Test
    fun ransomNoteFalseTest(){
      var ransomNote = RansomNote()
        val magazine = "two times three is not four".trimEnd().split(" ").toTypedArray()
        val note = "two times two is four".trimEnd().split(" ").toTypedArray()

        var resp = ransomNote.checkMagazine(magazine,note)
        assertEquals(resp,false)
    }

    @Test
    fun ransomNoteTrueTest(){
        var ransomNote = RansomNote()
        val magazine = "give me one grand today night".trimEnd().split(" ").toTypedArray()
        val note = "give one grand today".trimEnd().split(" ").toTypedArray()

        var resp = ransomNote.checkMagazine(magazine,note)
        assertEquals(resp,true)
    }

}