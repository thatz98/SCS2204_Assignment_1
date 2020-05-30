object Assignment_2 extends App{

  //Question 1

  def paymentForRegHours(hrs: Int) = hrs*150
  def paymentForOT(otHrs: Int) = otHrs*75
  def total(hrs: Int, otHrs: Int) = paymentForRegHours(hrs) + paymentForOT(otHrs)
  def tax(t:Int)=t*0.1
  def netSalary(hrs: Int, otHrs: Int) = total(hrs,otHrs) - tax(total(hrs,otHrs))

  println(netSalary(40,20))

  //Question 2

  def attendees(n:Int)=120+(15-n)/5*20
  def revenue(p:Int)=p*attendees(p)
  def cost(p:Int)=500+3*attendees(p)
  def profit(p:Int)=revenue(p) - cost(p)

  println("Profit for 15 attendees : " + profit(15) + " - Profit for 20 attendees : " + profit(20))

}
