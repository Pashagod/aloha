class Person(name: String, age: Int) {
  def introduce(): Unit = {
    println(s"Hi, I'm $name and I'm $age years old.")
  }
}

object Main extends App {
  val person = new Person("Bob", 30)
  person.introduce()
}
