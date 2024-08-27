fun main(){
    /**
     * var : 읽기,쓰기 가능한 변수에 사용
     */
    var a = 1
    a = 2 // a=2 입력시 result가 2로 바뀜
    println("-------a result------")
    println(a)

    /**
     * val : 읽기만 가능한 변수에 사용, val 로 정의된 값은 변경 불가
     */
    val b = 2
//    b = 23 에러 발생!
    println("-------b result------")
    println(b)

//  이런 방식의 문법 사용도 가능!
    val c: Int
    c = 3
    println("-------c result------")
    println(c)

//  코틀린은 타입추론을 자동으로 감지함. 그러나 여러명 작업시 혼란을 방지하기위해서 타입을 적어주는것을 추천
    val d: Int
    d = 3
    println("-------d result------")
    println(d::class) // result : d 클래스의 타입은 int 임을 코틀린이 자동 감지함


    println("hello world")
}
