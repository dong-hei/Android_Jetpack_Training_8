fun main(){

    /**
     * ? : String옆에 ?를 사용하지 않을경우 런타임 오류가 발생하는데
     * 이때 형옆에 ?를 명시하면 null을 허용하면서 오류가 없어진다.
     */
    var str: String? = null
    println("=====str=====")
    println(str)

    //?이 붙은 문자열의 길이를 출력하고싶다면
    val a: String? = "ABC"
    println("=====a=====")
    println(a?.length) // i 옆에도 ?를 붙여서 null safety operator를 사용한다 (null이 아니라면 length 명령어를 실행하라라는 의미)

    val b: String? = null
    println("=====b=====")
    println(b?.length) // i 옆에도 ?를 붙여서 null safety operator를 사용한다 (null 이면 그냥 null을 출력한다.)

    /**
     * !! : null이 아님을 보장한다.
     */
    val c: String? = "DEF"
    println("=====c=====")
    println(c!!.length)

    //null임에 변수를 출력했기때문에 NPE 에러 발생!
//    val d: String? = null
//    println("=====d=====")
//    println(d!!.length)

    /**
     * ?: : 엘비스프레슬리 머리모양 같다고 해서 지어진 문법으로 null 경우에 어떻게 할것인가를 보장해준다.
     */
    val e: String? = "HIJ"
    println("=====e====")
    e ?: println("e is null!!")

    val f: String? = null
    println("=====f=====")
    f ?: println("f is null!!")

}