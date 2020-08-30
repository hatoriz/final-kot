fun main() {
    var myAnimal = Animal()
    myAnimal.makeNoise()
    myAnimal.eat()
    myAnimal.roam()
    myAnimal.sleep()

    var myHippo = Hippo()
    myHippo.makeNoise()
    myHippo.eat()

    var myFeline = Feline()
    myFeline.roam()

    var myLion = Lion()
    myLion.makeNoise()
    myLion.eat()

    var myCheetah = Cheetah()
    myCheetah.makeNoise()
    myCheetah.eat()

    var myLynx = Lynx()
    myLynx.makeNoise()
    myLynx.eat()

    var myCanine = Canine()
    myCanine.roam()

    var myWolf = Wolf()
    myWolf.makeNoise()
    myWolf.eat()

    var myFox = Fox()
    myFox.makeNoise()
    myFox.eat()

    //--------- ฉีดยา --------
    println("สัตวแพทย์ฉีดยาสัตว์ทุกตัว")
    var myVet = Vet()
    myVet.giveShot(myHippo)
    myVet.giveShot(myLion)
    myVet.giveShot(myCheetah)
    myVet.giveShot(myLynx)
    myVet.giveShot(myWolf)
    myVet.giveShot(myFox)

}

open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = ""
    open val hunger = 10

    open fun makeNoise(){
        println("คลาส Animal กำลังส่งเสียงร้อง")
    }

    open fun eat(){
        println("คลาส Animal กำลังกิน")
    }

    open fun roam(){
        println("คลาส Animal กำลังเดิน")
    }

    open fun sleep(){
        println("คลาส Animal กำลังนอน")
    }
}

class Hippo : Animal(){
    override val food = "หญ้า"
    override val habitat = "น้ำ"
    override val image = "hippo.jpg"

    override fun makeNoise() {
        println("ฮิปโปร้อง ฮิป ฮิป")
    }

    override fun eat() {
        println("ฮิปโปกิน $food")
    }
}

open class Feline : Animal(){

    override fun roam() {
        println("คลาส Feline กำลังเดินและปีนต้นไม้ได้")
    }

}

class Lion : Feline(){
    override val food = "เนื้อสัตว์อื่น เช่น กวาง"
    override val habitat = "ต้นไม้"
    override val image = "lion.jpg"

    override fun makeNoise() {
        println("ร้องคำรามแบบสิงโต")
    }

    override fun eat() {
        println("สิงโตกิน $food")
    }
}

class Cheetah : Feline(){
    override val food = "เนื้อสัตว์อื่น เช่น ไก่"
    override val habitat = "พุ่มไม้"
    override val image = "cheetah.jpg"

    override fun makeNoise() {
        println("ร้องคำรามแบบเสือชีต้า")
    }

    override fun eat() {
        println("ชีต้ากิน $food")
    }
}

class Lynx : Feline(){
    override val food = "เนื้อสัตว์อื่น เช่น แมว"
    override val habitat = "ถ้ำ"
    override val image = "lynx.jpg"

    override fun makeNoise() {
        println("ร้องคำรามแบบเสือแมวป่า")
    }

    override fun eat() {
        println("แมวป่ากิน $food")
    }
}

open class Canine : Animal(){
    override fun roam() {
        println("คลาส Canine เดินบนพื้้นได้เท่านั้น")
    }
}

class Wolf : Canine(){
    override val food = "เพดดีกรี"
    override val habitat = "ถ้ำ"
    override val image = "wolf.jpg"

    override fun makeNoise() {
        println("ร้องคำรามแบบหมาป่า")
    }

    override fun eat() {
        println("หมาป่ากิน $food")
    }
}

class Fox : Canine(){
    override val food = "เนื้อกวาง"
    override val habitat = "ป่า"
    override val image = "Fox.jpg"

    override fun makeNoise() {
        println("ร้องคำรามแบบ fox ")
    }

    override fun eat() {
        println("Fox กิน $food")
    }
}

class Vet {

    //ฉีดยาแล้วสัตว์จะส่งเสียงร้อง
    fun giveShot(myAnimal: Animal){
        myAnimal.makeNoise()
    }

}
