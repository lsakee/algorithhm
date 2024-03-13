package stack

import java.util.Stack


private fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val stack = Stack<Int>()
    val n = br.readLine().toInt()
    val arr = IntArray(n)
    var max = 1
    val result= mutableListOf<String>()
    repeat(n){
        arr[it] = br.readLine().toInt()
    }
    br.close()
    for (i in arr){
        while (max <= i ){
            stack.push(max)
            max ++
            result.add("+")
        }
        if (stack.peek() == i){
            stack.pop()
            result.add("-")
        }
        else{
           result.add("NO")
        }
    }
    if (result.contains("NO")) bw.write("NO")
    else for (i in result) bw.write("$i \n")
    bw.close()
}

