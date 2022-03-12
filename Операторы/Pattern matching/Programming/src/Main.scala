

case class Pet(name: String, says: String)

val pet = Pet("Tomcat", "0110")

class Cat(name: String, says: String) extends Pet(name: String, says: String)

//object cat
//object dog
//object robot

val saysPattern = ".*[01].*".r

val kind = pet match {
    case Pet(_, "meow") => "cat"
    case Pet(_, "nya") => "cat"
    case Pet("Rex", _) => "dog"
    case Pet(_, saysPattern()) => "robot"
    case _ => "unknown"
}
println(kind)