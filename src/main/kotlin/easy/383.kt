package easy

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 *
 * Constraints:
 *
 * 1 <= ransomNote.length, magazine.length <= 105
 * ransomNote and magazine consist of lowercase English letters.
 */
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    if (magazine.length < ransomNote.length) return false

    val map = mutableMapOf<Char, Int>()

    for (i in ransomNote) {
        map[i] = (map[i] ?: 0) + 1
    }

    for (i in magazine) {
        map[i] = (map[i] ?: 0) - 1
    }

    for(i in map.keys){
        if((map[i] ?: 10) > 0)  {
            return false
        }
    }

    return true
}