package dp

private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val list = br.readLine().split(" ").map { it.toInt() }
    br.close()
    var dp = IntArray(n)
    for (i in list.indices) {
        dp[i] = list[i]
        for (j in 0 until i) {
            if (list[i] > list[j] && dp[i] < list[i] + dp[j])
                dp[i] = dp[j] + list[i]
        }
    }
    bw.write("${dp.max()}")
    bw.close()
}

/**
 * f1 +f2
 *
 * [1, 101, 3, 53, 113, 6, 11, 17, 24, 32]
 * **/