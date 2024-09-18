class SmartTvDevice(name: String, category: String, deviceType: String) : SmartDevice(name, category, deviceType) {
    var volume: Int = 10
    var currentChannel: Int = 1

    fun decreaseVolume() {
        if (deviceStatus == "on" && volume > 0) {
            volume--
            println("Volumen reducido a $volume")
        }
    }

    fun previousChannel() {
        if (deviceStatus == "on" && currentChannel > 1) {
            currentChannel--
            println("Cambiado al canal anterior: Canal $currentChannel")
        }
    }
}
