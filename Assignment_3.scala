object Assignment_3 extends App{

	//Question 1

	def prime(n: Int,d: Int=2): Boolean = n match{
		case n if(n<2) => false
		case n if(n==2) => true
		case n if(n%d==0) => false
		case n if(d*d>n) => true
		case _ => prime(n,d+1)
	}

	println(prime(25))

	//Question 2

	def primeSeq(n: Int,d: Int=2): Int = n match{
		case n if(n==2) => x
		case n if(n%q==0) => prime(n-1)
		case n if(d*d>n) => {
			println(n)
			prime(n-1)
		}
		case _ => prime(n,d+1)
	}

	println(prime(10))

	//Question 3

	def sum(n: Int): Int = n match{
		case 1 => n
	case _ => n + sum(n-1)
	}

	println(sum(4))

	//Question 4

	def isEven(n: Int): Boolean = n match{
		case 0 => true
		case _ => isOdd(n-1)
	}

	def isOdd(n: Int): Boolean = !(isEven(n))

	println(isEven(5))

	//Question 5

	def sumOfEven(n: Int): Int = n match{
		case n if (n<1) => n
		case n if (n%2==0) => (n-2) + sumOfEven(n-2)
		case n if (n%2==1) => (n-1) + sumOfEven(n-1)
	}

	println(sumOfEven(13))

	//Question 6

	def fibonacci(n: Int): Int = n match{
		case 0 => 0
		case n if (n==1) =>  1
		case n => fibonacci(n-1) + fibonacci(n-2)
	}

	def fibonacciSeq(n: Int): Unit ={
		if(n>=0){
			fibonacciSeq(n-1)
			println(fibonacci(n))
		}
	}

	fibonacciSeq(5)
}
