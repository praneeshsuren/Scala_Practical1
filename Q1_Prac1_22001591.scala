def diskArea(radius: Double): Double = {
  val pi = Math.PI
  val area = pi * radius * radius
  return area
}

@main def main1(): Unit = {
  println(s"Area of a disk with radius 5: ${diskArea(5)}")
}
