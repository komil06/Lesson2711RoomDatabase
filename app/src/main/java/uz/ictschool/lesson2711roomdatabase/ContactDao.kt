package uz.ictschool.lesson2711roomdatabase

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface ContactDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addContact(contact: Contact)

    @Query("SELECT * FROM contacts")
    fun getAllContacts(): List<Contact>

    @Update
    suspend fun updateContactDetails(contact: Contact)

    @Delete
    suspend fun deleteContactDetails(contact: Contact)

}