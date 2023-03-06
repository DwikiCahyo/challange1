package oop

open class Person(
    val name:String,
    val age:String
) {
    fun introduction(){
        println("hi my name is $name and i am $age years old !")
    }
}

class Rectangle(
    val width:Int,
    val height:Int
){
    fun getArea(){
        val luas = width * height
        println(luas)
    }
}

class Animal(
    val name:String,
    val sound:String
){
    fun makeSound(){
        println("$name says $sound")
    }
}
//kurang 4


//5
open class Vehicle(
    val brand:String,
    val color:String
){
    open fun drive(){
        println("Driving $brand")
    }
}

class Car(brand: String,color: String) :Vehicle(brand,color){
    override fun drive() {
//        super.drive()
        println("Driving $brand")
    }
}

fun main(){

}


