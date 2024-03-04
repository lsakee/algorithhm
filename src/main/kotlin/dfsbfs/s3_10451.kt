package dfsbfs

private lateinit var graph: Array<Int>
private lateinit var visited: Array<Boolean>
private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        graph = Array(1001) { 0 }
        visited = Array(1001) { false }
        val input = br.readLine().split(" ").map { it.toInt() }
        for (i in 1..n) {
            graph[i] = input[i - 1]
        }
        var count = 0
        for (i in 1..n) {
            if (!visited[i]) {
                bfs(i)
                count++
            }
        }
        bw.write("$count\n")
    }
    bw.flush()
    bw.close()
    br.close()
}

private fun bfs(start: Int) {
    val queue = ArrayDeque<Int>()
    visited[start] = true
    queue.add(start)
    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        val next = graph[current]
        if (!visited[next]) {
            visited[next] = true
            queue.add(next)
        }
    }
}