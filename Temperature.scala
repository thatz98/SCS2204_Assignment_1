  //Question 1
  
  def F(t: Double): Unit = t*1.8 + 32

  F(35)

  //Question 2
  
  def volume(r: Double) = math.Pi*r*r*r*4/3

  volume(5)

  //Question 3
  
  def bookPrice(c: Int) = c*24.95
  
  def discount(amount: Double) = amount*0.4
  
  def shippingPrice(c: Int) = if(c<=50) 3 else 3 + (x-50)*0.75
  
  def totalPrice(c: Int) = bookPrice(c) + shippingPrice(c) + discount(bookPrice(c))

  totalPrice(60)
