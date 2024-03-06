package binarysearch

private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (k, n) = br.readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<Long>()
    var min: Long = 1
    var mid: Long

    repeat(k) {
        list.add(br.readLine().toLong())
    }
    br.close()
    list.sort()
    var max: Long = list.last()

    while (min <= max) {
        mid = (min + max) / 2
        var result: Long = 0
        for (i in list.indices) result += list[i]/mid

        /**
         * 계산 시간 초과 뜨는 부분
         *  if (result >= n) min += 1
         *  else max -= 1
         * **/
        if (result >= n) min = mid + 1
        else max = mid -1
    }

    bw.write("$max")
    bw.close()
}