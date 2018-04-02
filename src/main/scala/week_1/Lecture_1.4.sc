def abs(x: Int) = if (x >= 0) x else -x
abs(-5)
abs(5)
def e = false
false && e // short-circuit evaluation
def b = true
def e1 = 1
val e2 = 3
if (b) e1 else e2
// def form is evaluated 'by-name'
// val form is evaluated 'by-value'
def loop: Boolean = loop
def x = loop
// val y = loop

def and(x: Boolean, y: => Boolean) = if (x) y else false
and(true, true)
and(false, loop)

def or(x: Boolean, y: Boolean) = if (x) true else y
or(true, false)
or(false, true);
