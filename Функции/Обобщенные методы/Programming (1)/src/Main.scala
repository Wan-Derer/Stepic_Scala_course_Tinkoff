def middle[T](data: Iterable[T]): T = {

    data.splitAt(data.size/2)._2.head

}

require(middle("Scala") == 'a')
require(middle(Seq(1, 7, 5, 9)) == 5)