object Assignment_1 extends App{

  def q1(t: Double): Unit ={
    var tmp: Double = t*1.8 + 32
    println(t + " Celcius = " + tmp + " Farenheit")
  }

  def q2(r: Double): Unit ={
    var vol: Double = math.Pi*r*r*r*4/3
    println("Volume of a sphere with radius " + r + " = " + vol)
  }

  def q3(c: Int): Unit = {
    var price: Double = 24.95
    var discount: Double = 0.4
    var total: Double = 0
    if (c <= 50) {
      total = 3 + price*c*(1 - discount)
    } else {
      total = ((1 - discount)*price*c) + 3 + 0.75*(c - 50)
    }
    println("Total price = " + "%.2f".format(total).toDouble)
  }

  q1(35)
  q2(5)
  q3(60)
}

