package dfsbfs


private lateinit var map: Array<Array<Int>>
private fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val dx = listOf(0, 1, 0, -1)
    val dy = listOf(1, 0, -1, 0)
    map = Array(n) { Array(m) { 0 } }
    repeat(n) { i ->
        val input = br.readLine()
        for (j in 0 until m) {
            map[i][j] = input[j].toString().toInt()
        }
    }

    fun bfs(x: Int, y: Int) {
        val queue = ArrayDeque<Node>()
        queue.add(Node(x, y))
        while (queue.isNotEmpty()) {
            val next = queue.removeFirst()
            val tmpX = next.x
            val tmpY = next.y
            for (i in 0 until 4) {
                val nx = tmpX + dx[i]
                val ny = tmpY + dy[i]
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
                if (map[nx][ny] == 1) {
                    map[nx][ny] == map[tmpX][tmpY] + 1
                    queue.add(Node(nx, ny))
                }
            }
        }
    }
    bfs(0, 0)
    bw.write("${map[n - 1][m - 1]}")
    bw.flush()
    bw.close()
    br.close()
}

data class Node(
    val x: Int,
    val y: Int
)


