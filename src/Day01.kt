fun main() {
    fun part1(input: List<String>): Int {
        var start=50;
        return input.count{
            start=if(it[0]=='L'){
                (start-it.drop(1).toInt()).mod(100);
            }
            else{
                (start+it.drop(1).toInt()).mod(100);
            }
            start==0;
        }
    }

    fun part2(input: List<String>): Int {
        var start=50;
        var count=0;
        input.forEach{
            val no=it.drop(1).toInt()
            for(i in 1..no){
                start=if(it[0]=='L') (start-1)%100 else (start+1)%100
                if(start==0)count++;
            }
        };
        return count;
    }

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
