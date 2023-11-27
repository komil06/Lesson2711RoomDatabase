package uz.ictschool.lesson2711roomdatabase

import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ContactRepository(val contactDao: ContactDao){
    val allContacts = MutableLiveData<List<Contact>>()
    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    fun addContact(contact: Contact){
        coroutineScope.launch(Dispatchers.IO) {
            contactDao.addContact(contact)
        }
    }

    fun deleteContact(contact: Contact){
        coroutineScope.launch(Dispatchers.IO){
            contactDao.deleteContactDetails(contact)
        }
    }

    fun updateContact(contact: Contact){
        coroutineScope.launch(Dispatchers.IO){
            contactDao.updateContactDetails(contact)
        }
    }
    fun getAllContacts(){

    }

}