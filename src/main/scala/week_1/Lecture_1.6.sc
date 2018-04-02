// Block
// Definitions inside are only visible inside
// Definitions inside shadows definitions outside
def sqrt(x: Double): Double = {
  def abs(x: Double) = if (x >= 0) x else -x

  def isGoodEnough(guess: Double): Boolean =
    abs(guess * guess - x) / x < 0.001

  def improve(guess: Double) =
    (guess + x / guess) / 2

  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  sqrtIter(1.0)
}
sqrt(4)

val x = 0
def f(y: Int) = y + 1
val result = {
  val x = f(3)
  x * x
} + x

val y = x + 1; y * y

val someLongExp = 1
val someOtherExp = 3
(someLongExp
  + someOtherExp)
someLongExp +
  someOtherExp