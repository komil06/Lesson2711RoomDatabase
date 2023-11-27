package uz.ictschool.lesson2711roomdatabase

import androidx.compose.runtime.Composable
import androidx.lifecycle.MutableLiveData

@Composable
fun ContactScreen(contactDao: ContactDao){
      val getAllContacts = MutableLiveData<List<Contact>>()
}