fun main(){
    val a:Int = 100
    val b:Int = 200
    var c:Int

    if( a >= b){
        //참일 경우
        println("big")
    }else{
        //참이 아닐 경우
        println("small")
    }

    //코틀린같은 경우는 이런식으로도 사용이 가능하다.
    c = if( a >= b){
        a
    }else{
        b
    }

    println("=====c=====")
    println(c) // 결과값 200

    val d: Int? = null
    if (d == null){
        // 참일때 println안에 문자열 출력
        println("null check ok")
    } else {
        // 거짓일때는 d값 출력
        println("d = $d")
    }

    val e:Int = 300

    if (e in arrayOf(100, 200)){
        // 해당 어레이에 100이 있다면 println 출력
        println("array check ok")
    } else {
        println("nope")
    }

    // 이런 케이스는 가독성이 좋은 when을 사용한다.
    val score:Int = 77

//    if (score == 100){
//        println("A+")
//    }
//    else if (score == 90) {
//        println("A")
//    }
//    else if (score == 80) {
//        println("B")
//    }
//    else {
//        println("C")
//    }

    when (score) {
        //뿐만아니라 in과 함께 100..199 이런식으로 범위도 지정 가능
        in 95..100 -> println("A+")
        in 90..94 -> println("A")
        in 80..89 -> println("B+")
        in 70..79 -> println("C")
        else -> println("fail")
    }


    }