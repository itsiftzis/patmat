import patmat.Huffman._
val sampleTree = makeCodeTree(
  makeCodeTree(Leaf('x', 1), Leaf('e', 1)),
  Leaf('t', 2)
)
val t2 = List('j','a', 'c', 'h', 'a', 'x')
val t1 = List(1,5,7,8,3,6,2,2,6,8,2,6,1,3)

t1 partition (x=> x == 2)
t2.sorted
def pack[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: xs1 =>
    val (first, rest) = xs span (y => y ==x)
    first :: pack(rest)
}

pack(t2.sorted) map (ys => (ys.head, ys.length) )

makeOrderedLeafList(List(('a', 3), ('z', 5), ('s', 1)))