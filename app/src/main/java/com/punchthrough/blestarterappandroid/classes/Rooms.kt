package com.punchthrough.blestarterappandroid.classes

class Rooms(val name: String, val isOnline: Boolean) {

    companion object {
        private var lastContactId = 0
        fun createContactsList(numContacts: Int) : ArrayList<Rooms> {
            lastContactId = 0

            val contacts = ArrayList<Rooms>()
            for (i in 1..numContacts) {
                contacts.add(Rooms("Sala " + ++lastContactId, i <= numContacts / 2))
            }
            return contacts
        }
    }
}
