def abs(x: Double) = if (x >= 0) x else -x

//def isGoodEnough(guess: Double, x: Double): Boolean =
//  abs(guess * guess - x) < 0.001

def isGoodEnough(guess: Double, x: Double): Boolean =
  abs(guess * guess - x) / x < 0.001

def improve(guess: Double, x: Double) =
  (guess + x / guess) / 2

// for recursive functions return type is required
def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)

def sqrt(x: Double): Double = sqrtIter(1.0, x)

sqrt(2)
sqrt(4)
sqrt(1e-6)
sqrt(1e60)

sqrt(0.001)
sqrt(0.1e-20)
sqrt(1.0e20)
sqrt(1.0e50)