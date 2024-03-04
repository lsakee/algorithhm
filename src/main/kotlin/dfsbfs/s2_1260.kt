package dfsbfs

private lateinit var visited: Array<Boolean>
private lateinit var graph: Array<MutableList<Int>>
private var result = ""
private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (n, m, v) = br.readLine().split(" ").map { it.toInt() }
    graph = Array(n + 1) { mutableListOf() }
    repeat(m) {
        val (n1, n2) = br.readLine().split(" ").map { it.toInt() }
        graph[n1].add(n2)
        graph[n2].add(n1)
    }
    repeat(n + 1) { idx ->
        graph[idx].sort()
    }
    br.close()

    visited = Array(n + 1) { false }
    dfs(v)
    bw.write(result)

    visited = Array(n + 1) { false }
    result = ""
    bfs(v)
    bw.write("\n${result}")
    bw.close()
}

private fun bfs(idx: Int) {
    val queue = ArrayDeque<Int>()
    queue.add(idx)
    visited[idx] = true
    while (queue.isNotEmpty()) {
        val next = queue.removeFirst()
        result += "$next "
        for (nextIdx in graph[next]) {
            if (visited[nextIdx]) continue
            visited[nextIdx] = true
            queue.add(nextIdx)
        }
    }
}

private fun dfs(idx: Int) {
    if (visited[idx]) return
    visited[idx] = true
    result += "$idx "
    for (next in graph[idx]) {
        dfs(next)
    }
}
