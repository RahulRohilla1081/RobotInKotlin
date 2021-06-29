class JarvisRobot {


    fun ringTheAlarm(time:Int){
        println("Good morning Master , It's $time A.M get up fast")


    }
    fun makeCoffee(){
        println("Master, Your coffee is ready, Start your day with a cup of coffee")
    }

    fun waterHeater(temp:Int){
        println("Water has been heated to $temp oC,Have a bath Master")
    }
    fun bagPack(day:String){
        when(day)
        {
            "monday" -> println("Master, Books for monday are packed in your bag")
            "tuesday" -> println("Master, Books for tuesday are packed in your bag")
            "wednesday" -> println("Master, Books for wednesday are packed in your bag")
            "thursday" -> println("Master, Books for thursday are packed in your bag")
            "friday" -> println("Master, Books for friday are packed in your bag")
            "saturday" -> println("Master, Books for saturday are packed in your bag")
            "sunday" ->println("Master,I think you forgot it's Sunday today ")
            else ->println("uhh, I don't get this")


        }




    }

    fun cookFood(time:Int) {

        if(time<12)
        {
            println("Master, Your morning brakfast ..toast with 1 glass of  milk is ready!! Have a Good day!!")
        }
        else{
            println("Master, Your chicken is ready, Enjoy your treat")
        }
    }

    fun ironCloths(day: String) {
        when(day) {
            "monday"->   println("I iron your favourite Black shirt with gray pent!! uhh, You look damn hot in this outfit!!")
            "tuesday"-> println("I iron your favourite Red shirt with black pent!! uhh, You look damn hot in this outfit!!")
            "wednesday"-> println("I iron your favourite White shirt with black jeans!! uhh, You look damn hot in this outfit!!")
            "thursday"-> println("I iron your favourite Brown shirt with black pent!! uhh, You look damn hot in this outfit!!")
            "friday"-> println("I iron your favourite  black T-shirt with blue jeans!! uhh, You look damn hot in this outfit!!")
            "saturday"-> println("I iron your favourite yellow navy blue with black pent!! uhh, You look damn hot in this outfit!!")
            "sunday"->println("Master, It's Sunday so wear anything you want")
            else ->println("uhh, I think you should go for shopping")



        }
    }


}
fun main(){
    val jarvish=JarvisRobot()
   jarvish.bagPack("monday")
    jarvish.makeCoffee()
    jarvish.ringTheAlarm(6)
    jarvish.waterHeater(90)
    jarvish.cookFood(6)
    jarvish.ironCloths("monday")







}




