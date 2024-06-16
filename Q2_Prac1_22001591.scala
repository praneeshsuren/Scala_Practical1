def convertToFahrenheit(celsius: Double) : Double = {
    val fahrenheit = celsius * 1.8000 + 32.000;
    return fahrenheit;
}

@main def main2(): Unit = {
    println(s"35°c is ${convertToFahrenheit(35)}°F");
}