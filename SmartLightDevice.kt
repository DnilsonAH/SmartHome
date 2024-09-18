class SmartLightDevice(name: String, category: String, deviceType: String) : SmartDevice(name, category, deviceType) {
    var brightness: Int = 100

    fun decreaseBrightness() {
        if (deviceStatus == "on" && brightness > 0) {
            brightness -= 10
            println("Brillo reducido a $brightness%")
        }
    }
}