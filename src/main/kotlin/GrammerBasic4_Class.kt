class GrammerBasic4_Class {

    // 기본 생성자 클래스
    class Stock(val ticker: String, val price: Int)

    //클래스와 데이터 클래스의 차이점 : getter, setter, equal, hashcode, tostring 등을 자동생성
    data class StockData(val ticker: String, val price: Int)

    // 해당 상수값을 가지고 있는 하나뿐인 클래스
    enum class VIPClass {
        Diamond,
        Platinum ,
        Gold,
    }
}

fun main(){
    // 인스턴스 생성하고 출력하면 해당 값이 출력된다.
    val Stock: GrammerBasic4_Class.Stock = GrammerBasic4_Class.Stock("TSLA",220)
    val Stock2: GrammerBasic4_Class.Stock = GrammerBasic4_Class.Stock("NFLX",686)
    println("Stock Ticker ${Stock.ticker}, Stock Price ${Stock.price}")
    println("Stock Ticker2 ${Stock2.ticker}, Stock Price2 ${Stock2.price}")


    val DataClass1: GrammerBasic4_Class.StockData = GrammerBasic4_Class.StockData("TSLA",220)
    val DataClass2: GrammerBasic4_Class.StockData = GrammerBasic4_Class.StockData("NFLX",686)
    println("(DataClass) Stock Ticker ${Stock.ticker}, Stock Price ${Stock.price}")
    println("(DataClass) Stock Ticker2 ${Stock2.ticker}, Stock Price2 ${Stock2.price}")
}