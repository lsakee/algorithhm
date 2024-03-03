package sort

import java.io.BufferedReader
import java.io.InputStreamReader

private val br = BufferedReader(InputStreamReader(System.`in`))
private val graph = mutableListOf<Int>()
private fun main(){
    val n = br.readLine().toInt()
    repeat(n){
        val m =br.readLine().toInt()
        graph.add(m)
    }
    graph.sort()
    print(graph.toString())
}