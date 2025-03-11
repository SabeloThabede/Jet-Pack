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
