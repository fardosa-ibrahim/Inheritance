fun main(){
    var car=Car("gre","grtde","grey",23)
     car.carry(42)
     car.identity()
       car.calculatePackingFees(3)
        var bus=Bus("bus","mms","green",24)
    println(bus.maxTripFare(400.00))
    println(bus.calculatePackingFees(5))


}

 open class Car(var make:String,var model:String,var color:String, var capacity:Int){

     fun carry(people:Int) {
        var x=people-capacity
        if (people == capacity) {
            println("Carrying $people passengers")
        }else

            println("overcapacity by $x people ")
    }
    fun identity(){
        println("I am $make $model $color")
    }
    open fun calculatePackingFees(hours:Int):Int{
        var parkingfees=hours*20
        return parkingfees
    }
}
  class Bus(var make: String, var model: String, var color: String, var capacity: Int){
      fun maxTripFare(fare:Double): Double {
          var maxfare = fare * capacity
          return maxfare
      }

        fun calculatePackingFees (hours: Int): Int {
         // return super.equals(other)
          var fee=hours*capacity
          return fee
      }

  }




