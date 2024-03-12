package dp

import kotlin.math.max


private fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val list = br.readLine().split(" ").map { it.toInt() }
    br.close()
    val arr = IntArray(n){1}
    for (i in 0 until n){
        for (j in 0 until i){
            if (list[i]>list[j]){
                arr[i] = max(arr[i],arr[j]+1)
            }
        }
    }
    bw.write("${arr.max()}")
    bw.close()
}
/**
 *  1 2 3 4
 *  arr 1 2 3 4
 *
 * **/