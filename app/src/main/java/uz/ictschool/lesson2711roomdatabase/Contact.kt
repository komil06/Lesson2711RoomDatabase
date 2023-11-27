package uz.ictschool.lesson2711roomdatabase

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "contacts")
data class Contact(@PrimaryKey(autoGenerate = false)
                   @NonNull
                   @ColumnInfo(name = "id")val id:Int,
                   val full_name:String,
                   val logo:Int,
                   val phone_number:String): Parcelable
