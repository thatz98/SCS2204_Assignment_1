object Assignment_5 extends App{

  //Question 1 & 2

  class Rational(n: Int, d: Int){

    require(d>0, "Denominator should be positive!")

    private def gcd(x: Int, y: Int): Int = if(y==0) x else if(x<0) gcd(y,(-x)%y) else gcd(y,x%y)

    val numer: Int = n/gcd(n,d)
    val denom: Int = d/gcd(n,d)

    override def toString: String = this.numer + "/" + this.denom

    def neg = new Rational(-this.numer,this.denom)

    def add(r: Rational) = new Rational(this.numer*r.denom+r.numer*this.denom,this.denom*r.denom)

    def sub(r: Rational): Rational = this.add(r.neg)

  }

  println("Question 1...")
  val r = new Rational(2,4)
  println("Negetive of " + r.toString + " is " + r.neg.toString);
  println()

  println("Question 2...")
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)
  println(x.toString + " - " + y.toString + " - " + z.toString + " = " + x.sub(y).sub(z).toString);
  println()

  //Question 3

  class Account(id:String, n: Int, b: Double){

    val nic:String = id
    val accNumber: Int = n
    var balance: Double = b

    override def toString: String = "[" + nic + ":" + accNumber + ":" + balance + "]"

    def withdraw(a: Double): Unit = this.balance -= a   //assuming an account can have negative balances
    def deposit(a: Double): Unit = this.balance += a
    def transfer(acc: Account, b: Double) = {
      this.withdraw(b)
      acc.deposit(b)
    }
  }

  println("Question 3...")
  val b = new Account("981910800", 18001866, 25000)
  println("Account created -> "+ b.toString)
  b.deposit(5000)
  println("Credited 5000 to " + b.accNumber + " -> " + b.toString)
  b.withdraw(2000)
  println("Debited 2000 from " + b.accNumber + " -> " + b.toString)

  val c = new Account("588331432", 18001456, 10000)
  println("Account created -> " + c.toString)
  b.transfer(c,5000)
  println("Transferring 5000 from " + b.accNumber + " to " + c.accNumber + "...")
  println("Debited 5000 from " + b.accNumber + " -> " + b.toString)
  println("Credited 5000 to " + c.accNumber + " -> " + c.toString)
  println()

  //Question 4

  var bank: List[Account] = List()

  bank = b +: bank
  bank = c +: bank

  val find = (n: String, b: List[Account]) => b.filter(x=>x.nic.equals(n))

  //Question 4.1

  val overdraft = (b: List[Account]) => b.filter(x=>x.balance.<(0))

  println("List of accounts with negative balances -> " + overdraft(bank))
  println()

  //Question 4.2

  val bal = (b: List[Account]) => b.reduce((x, y)=>new Account(x.nic,x.accNumber,x.balance+y.balance))

  println("Total balance of all accounts -> " + bal(bank).balance)
  println()

  //Question 4.3

  val depInterest=(b: List[Account]) => b.filter(x=>x.balance.>(0)).map(x=>x.balance*1005/1000)
  val overInterest=(b: List[Account]) => b.filter(x=>x.balance.<(0)).map(x=>x.balance*1010/1000)

  println("After applying deposit interests -> " + depInterest(bank))
  println("After applying overdraft interests -> " + overInterest(bank))

}
