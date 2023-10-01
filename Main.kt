interface Transport {
    val numbOfPass: Int
    val color: String
    val price: Int

    fun drive()
}
//---------------------------------
interface Taxi : Transport {
    val engine: String
    val typeOfBody: String
}


interface Bus : Transport {
    val engine: String
    val numbOfFloors: Int
    val numbOfWheels: Int
}

interface Metro : Transport {
    val numbOfWagons: Int
}

interface Tram : Transport {
    val numbOfWagons: Int
}
//---------------------------------------
abstract class Econom : Taxi {
    override val numbOfPass: Int = 3
    override val color: String = "Yellow"
    override val price: Int = 500

    override fun drive() {

    }
}

abstract class Comfort : Taxi {
    override val numbOfPass: Int = 4
    override val color: String = "Yellow"
    override val price: Int = 1000

    override fun drive() {

    }
}

abstract class ComfortPlus : Taxi {
    override val numbOfPass: Int = 4
    override val color: String = "Yellow"
    override val price: Int = 1200

    override fun drive() {

    }
}
//--------------------------------------
class VWPolo: Econom() {
    override val engine: String = "1.6"
    override val typeOfBody: String = "Sedan"
}
fun main() {
    val car = VWPolo()
    print(car.typeOfBody)
}