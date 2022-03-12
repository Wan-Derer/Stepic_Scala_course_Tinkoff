val input: List[String]

val nameReg = "[a-zA-Z]+"
val emailReg = "\\w+@\\w+\\.\\w+"


val result = input match {

//    case List(n,e, rest@_*) =>
//        println(n)
//        println(e)
//        ">>>>"

    case List(name, email, rest@_*) if name.matches(nameReg) && email.matches(emailReg) =>
        s"$name " + email.split("@")(1)

    case List(nameEmail, rest@_*) if nameEmail.matches(s"$nameReg $emailReg") =>
        nameEmail.split(" ")(0) + " " + nameEmail.split("@")(1)

    case _ => "invalid"
}
println(result)

