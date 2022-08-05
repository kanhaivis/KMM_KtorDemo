package kk.kmm_ktor_demo

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}