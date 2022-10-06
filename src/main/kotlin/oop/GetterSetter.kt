package oop

class GetterSetter {

    var kota: String = "Honda"
        get() = field
        set(value) {
            field = "Ubah merk $value"
        }
}