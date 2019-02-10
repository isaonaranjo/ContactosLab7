package com.contactos.movil.computacion.uss.contactos.Modelo

/**
 * Maria Isabel Ortiz Naranjo
 * 18176
 */
class Contacto {
    var id: Int = 0
    lateinit var nombre: String
    lateinit var telefono: String
    lateinit var email: String

    constructor() {

    }

    constructor(email: String, telefono: String, nombre: String, id: Int) {
        this.email = email
        this.telefono = telefono
        this.nombre = nombre
        this.id = id
    }

    constructor(nombre: String, telefono: String, email: String) : super() {
        this.nombre = nombre
        this.telefono = telefono
        this.email = email
    }

    override fun toString(): String {
        return this.nombre
    }
}
