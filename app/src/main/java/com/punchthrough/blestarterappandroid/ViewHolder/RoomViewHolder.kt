import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.punchthrough.blestarterappandroid.R
import com.punchthrough.blestarterappandroid.classes.Rooms

class RoomViewHolder (private val mContacts: List<Rooms>) : RecyclerView.Adapter<RoomViewHolder.ViewHolder>()
{
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    inner class ViewHolder(listItemView: View) : RecyclerView.ViewHolder(listItemView) {
        // Your holder should contain and initialize a member variable
        // for any view that will be set as you render a row
        val nameTextView = itemView.findViewById<TextView>(R.id.room_name)
        val actualTextView = itemView.findViewById<TextView>(R.id.occupation_actual)
        val maxTextView = itemView.findViewById<TextView>(R.id.occupation_max)
        val colorLabel = itemView.findViewById<ImageView>(R.id.cor_label)
    }

    // ... constructor and member variables
    // Usually involves inflating a layout from XML and returning the holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomViewHolder.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.activity_room_item_layout, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    // Involves populating data into the item through holder
    override fun onBindViewHolder(viewHolder: RoomViewHolder.ViewHolder, position: Int) {
        // Get the data model based on position
        val contact: Rooms = mContacts.get(position)
        // Set item views based on your views and data model
        val textViewName = viewHolder.nameTextView
        textViewName.text = contact.name

        val textViewActual = viewHolder.actualTextView
        textViewActual.text = contact.actualOccupation

        val textViewMax = viewHolder.maxTextView
        textViewMax.text = contact.maxOccupation

        val imageViewLabel = viewHolder.colorLabel

        val max = contact.maxOccupation.toInt()
        val actual = contact.actualOccupation.toInt()

        when {
            actual < (max * 0.5) -> {
                imageViewLabel.setImageResource(R.drawable.background_rooms_green)
            }
            actual < (max * 0.7) -> {
                imageViewLabel.setImageResource(R.drawable.background_rooms_yellow)
            }
            else -> {
                imageViewLabel.setImageResource(R.drawable.background_rooms_red)
            }
        }

    }

    // Returns the total count of items in the list
    override fun getItemCount(): Int {
        return mContacts.size
    }
}