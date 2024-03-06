package greedy


private lateinit var all: Array<Time>
private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    all = Array(n) { Time(0, 0) }
    repeat(n) {
        val (start, end) = br.readLine().split(" ").map { it.toInt() }
        all[it] = Time(start,end)
    }
    br.close()
    all.sortBy { it.start }
    all.sortBy { it.end }
    var result = 0
    var recent = 0
    all.forEach {
        if (it.start >= recent){
            recent=it.end
            result++
        }
    }
    bw.write("$result")
    bw.close()
}
data class Time(
    val start: Int,
    val end: Int
)