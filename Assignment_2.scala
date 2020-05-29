object Assignment_2 extends App{

//Question 1

	def paymentForRegHours(hrs: Int) = hrs*150
	def paymentForOT(otHrs: Int) = otHrs*75
	def total(hrs: Int, otHrs: Int) = paymentForRegHours(hrs) + paymentForOT(otHrs)
	def tax(t:Int)=t*0.1
	def netSalary(hrs: Int, otHrs: Int) = total(hrs,otHrs) - tax(total(hrs,otHrs))

	println(netSalary(40,20))

//Question 2


}
