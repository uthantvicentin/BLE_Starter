package com.punchthrough.blestarterappandroid.classes

class Rooms(val name: String, val actualOccupation: String, val maxOccupation: String) {

    companion object {
        private var lastContactId = 0
        fun createRoomsList(numRooms: Int, roomsNames: Array<String>, actual: Array<String>, max: Array<String>) : ArrayList<Rooms> {

            lastContactId = 0

            val contacts = ArrayList<Rooms>()

            for(i in 0 until (numRooms - 1)) {
                println(roomsNames[i])
                contacts.add(Rooms(roomsNames[i], actual[i], max[i]))
            }
            return contacts
        }
    }
}
