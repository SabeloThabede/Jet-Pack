fun main() {
    val jetpack = Jetpack()
    jetpack.burn(5)  // Should elevate by 5 meters
    jetpack.stop(2)  // Should descend by 6 meters but not below 0
    jetpack.burn(3)  // Should elevate by 3 meters
    jetpack.stop(1)  // Should descend by 3 meters
}
class Jetpack {
    var userHeight: Int = 0

    fun burn(seconds: Int) {
        userHeight += seconds
        println("Burning for $seconds seconds. Current height: $userHeight meters.")
    }

    fun stop(seconds: Int) {
        userHeight -= seconds * 3
        if (userHeight < 0) {
            userHeight = 0
        }
        println("Stopping for $seconds seconds. Current height: $userHeight meters.")
    }
}
//A "whole number" only includes zero and positive numbers, while an "integer" includes both positive and negative numbers, along with zero;
// essentially, an integer is a set that encompasses all whole numbers and their negative counterparts.
//Key points:
//Whole numbers: 0, 1, 2, 3, 4, ...
//Integers: -3, -2, -1, 0, 1, 2, 3, ...
