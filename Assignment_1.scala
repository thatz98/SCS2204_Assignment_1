object Assignment_12 extends App {

  //Question 1

  def F(t: Double) = t*1.8 + 32

  println("35 Celcius = " + F(35) + " Farenheit")

  //Question 2

  def volume(r: Double) = math.Pi*r*r*r*4/3

  println("Volume of a sphere with radius 5 = " + volume(5))

  //Question 3

  def bookPrice(c: Int) = c*24.95

  def discount(amount: Double) = amount*0.4

  def shippingPrice(c: Int) = if(c<=50) 3 else 3 + (c-50)*0.75

  def totalPrice(c: Int) = bookPrice(c) + shippingPrice(c) - discount(bookPrice(c))

  println("Total price = " + "%.2f".format(totalPrice(60)).toDouble)

}
