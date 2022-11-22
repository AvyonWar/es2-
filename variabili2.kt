fun main(){ 
    val num1/*: Float */ = 5.5f  
    val num2/*: Double */ = 6.002
    val num3/*: Long */ = 500000009993 
    val num4 = "7777"
    
    val result = ((num1 + num2) / num3) * num4.toInt()
    println("Result is $result")
    
    //Result is 1.789021044244625E-7  ------>  senza specificare i valori
    //Result is 1.789021044244625E-7  ------>  specificando i valori
}
