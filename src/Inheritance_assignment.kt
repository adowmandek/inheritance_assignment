import kotlin.time.measureTimedValue

open class Car(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        if(people<=capacity){
        println(" You are Carrying $people passengers")
    }
    else{
        var x= people-capacity
        println("over capacity")
    }}
   open fun identity(){
        println("I am $make,$model, $color")
    }
        fun calculateParkingFees(hours: Int):Int{
        return hours*20
    }
    }
class Bus(make:String,model:String,color:String,capacity:Int,):Car(make,model,color,capacity){
    fun maxTripleFare(fare:Double):Double{
        return fare*21
    }
    fun parkingFees(hours:Int):Int{
        return hours*55
    }

}

fun main() {
    var myBus= Car("Toyota","v8","brown",230)
    println(myBus.capacity)
   println( myBus.color)
    println(myBus.make)
    myBus.carry(23)
    myBus.carry(300)
    myBus.carry(33)
    myBus.identity()
    myBus.calculateParkingFees(12)

    var bus=Car("tuktuk","2c","blue",2300)
    bus.carry(4)
   println( bus.capacity)
    bus.identity()






}