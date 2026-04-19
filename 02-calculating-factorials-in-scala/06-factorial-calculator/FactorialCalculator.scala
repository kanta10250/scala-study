import scala.math.BigInt

@main def factorial1000 = println(factorial(1000))

def factorial(i: BigInt): BigInt =
  if i == 0 then 1 else i * factorial(i - 1)
