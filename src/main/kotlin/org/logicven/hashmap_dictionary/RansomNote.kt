package org.logicven.hashmap_dictionary

class RansomNote {
    fun checkMagazine(magazine: Array<String>, note: Array<String>) : Boolean{
        var ransomComplete =HashMap<String, Int>()
        note.forEach {
            ransomComplete.put(it, ransomComplete.getOrDefault(it,0)+1)
        }
        magazine.forEach {
            if(ransomComplete.get(it)!= null){

                var k = ransomComplete.getOrDefault(it,-1)

                if(k>1){
                    k--
                    ransomComplete.put(it,k)
                }else {
                    ransomComplete.remove(it)
                }

                /*
                var p = ransomComplete.get(it)!! - 1
                if(p!=0){
                    ransomComplete.put(it,p)
                }else{
                    ransomComplete.remove(it)
                }*/
            }
        }
        if(ransomComplete.size==0){
            return true
        }
        return false
    }

}
