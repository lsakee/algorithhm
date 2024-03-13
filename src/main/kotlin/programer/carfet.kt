package programer


fun main(){
    Solution().solution(10,2)
    Solution().solution(8,1)
    Solution().solution(24,24)
}

class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val max = brown + yellow
        var answer = intArrayOf()
        for (i in 1..max) {
            val y = max / i
            if ((i - 2) * (y - 2) == yellow) {
                answer = intArrayOf(i, y)
            }
        }
        return answer
    }
}