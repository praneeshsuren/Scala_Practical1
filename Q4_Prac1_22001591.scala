val coverP = 24.95;

def shippingCost(copyNum: Int): Double = {
    if (copyNum <= 50) return 3;
    else return (3 + 0.75*(copyNum-50));
}

def totalCost(copyNum: Int): Double = {
    return (copyNum*coverP*0.6 + shippingCost(copyNum));
}

@main def main4(): Unit = {
    println(f"Wholesale Cost for 60 copies: ${totalCost(60)}%1.3f");
}