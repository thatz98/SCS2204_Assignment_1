import math.hypot

object Assignment_6 extends App{

  var p1 = Point(2, 3)
  println(p1 + " created!")

  val p2 = Point(4,9)
  println(p2 + " created!")

  val p3 = p1+p2;
  println(p3 + " created by adding " + p1 + " and " + p2 + " !")

  print(p1 + " moved by (3,4)")
  p1 = p1.move(3,4)
  println(" became " + p1)

  println("Distance between " + p1 + " and " + p2 + " is " + p1.distance(p2))

  println("Inverse of " + p1 + " is " + p1.invert)

}

case class Point(a: Int, b: Int){
  def x: Int = a;
  def y: Int = b;

  //Question 1

  def +(that: Point) = Point(this.x+that.x,this.y+that.y)
  
  //Question 2

  def move(dx: Int, dy:Int) = Point(this.x+dx,this.y+dy)

  //Question 3

  def distance(that: Point) = math.hypot(this.x - that.x, this.y - that.y)

  //Question 4

  def invert = Point(this.y,this.x)
}
