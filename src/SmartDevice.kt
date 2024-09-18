open class SmartDevice(
    val name: String,
    val category: String,
    val deviceType: String
) {
    var deviceStatus: String = "off"
    var deviceTurnOnCount: Int = 0

    open fun printDeviceInfo() {
        println("Device name: $name, category: $category, type: $deviceType")
    }

    fun turnOn() {
        if (deviceStatus == "off") {
            deviceStatus = "on"
            deviceTurnOnCount++
        }
    }

    fun turnOff() {
        if (deviceStatus == "on") {
            deviceStatus = "off"
        }
    }
}