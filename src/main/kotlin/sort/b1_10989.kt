package sort

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val arr = IntArray(10001)
    repeat(n) {
        arr[br.readLine().toInt()]++
    }
    br.close()
    repeat(arr.size) {
        bw.write("${it}\n".repeat(arr[it]))
    }
    bw.close()
}