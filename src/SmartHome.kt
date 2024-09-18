class SmartHome {
    private val smartTv = SmartTvDevice("TV Samsung", "Entertainment", "Television")
    private val smartLight = SmartLightDevice("Philips Hue", "Lighting", "Light")

    fun decreaseTvVolume() {
        smartTv.turnOn()
        smartTv.decreaseVolume()
    }

    fun changeTvChannelToPrevious() {
        smartTv.turnOn()
        smartTv.previousChannel()
    }

    fun printSmartTvInfo() {
        smartTv.printDeviceInfo()
    }

    fun printSmartLightInfo() {
        smartLight.printDeviceInfo()
    }

    fun decreaseLightBrightness() {
        smartLight.turnOn()
        smartLight.decreaseBrightness()
    }
}