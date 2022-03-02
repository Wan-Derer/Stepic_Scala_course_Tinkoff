object LessonData{
    def searchInArray(cond: Int => Boolean, array: List[Int]): List[Int] = {
        array.filter(cond)

    }
}

val searchOdd = LessonData.searchInArray(_ % 2 == 1, _ : List[Int])