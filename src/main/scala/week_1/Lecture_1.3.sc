def loop: Int = loop
def first(x: Int, y: Int) = x
//first(1, loop); // CBN terminates, CBV does not
def constOne(x: Int, y: => Int) = 1 // y is CBN
constOne(1 + 2, loop)
// constOne(loop, 1 + 2) // does not terminate