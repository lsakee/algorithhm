package sort

private fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val arr = ArrayList<Int>()
    repeat(n){
        arr.add(br.readLine().toInt())
    }
    br.close()
    arr.sort()
    repeat(arr.size){
        bw.write("${arr[it]}\n")
    }
    bw.close()
}