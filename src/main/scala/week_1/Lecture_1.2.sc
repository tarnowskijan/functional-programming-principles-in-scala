34 + 65
def radius = 10
def pi = 3.14159
(pi * 2) * radius
def square(x: Double) = x * x
square(2)
square(5 + 4)
square(square(4))
def sumOfSquares(x: Double, y: Double) = square(x) + square(y)
sumOfSquares(3, 2 + 2)
// def loop: Int = loop - example of infinite substitution
//
// Call-by-value vs. Call-by-name
// Both gives same result only if:
// 1. reduced exp. consists of pure functions
// 2. both evaluation terminate
def test(x: Int, y: Int) = x * x
test(2, 3) // CBV 1 CBN 1
test(3 + 4, 8) // CBV 2 CBN 3
test(7, 2 * 4) // CBV 2 CBN 1
test(3 + 4, 2 * 4) // CBV 3 CBN 3