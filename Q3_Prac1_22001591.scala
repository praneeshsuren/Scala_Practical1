def volOfSphere(radius: Double): Double = {
  val vol = (4*Math.PI*radius*radius*radius)/3;
  return vol;
}

@main def main3(): Unit = {
  println(s"Volume of a sphere with radius 5 units: ${volOfSphere(5.00)}");
}