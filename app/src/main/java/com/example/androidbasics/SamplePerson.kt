package com.example.androidbasics

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

data class SamplePerson(val name: String, val age: Int, val country: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readString().toString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(age)
        parcel.writeString(country)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SamplePerson> {
        override fun createFromParcel(parcel: Parcel): SamplePerson {
            return SamplePerson(parcel)
        }

        override fun newArray(size: Int): Array<SamplePerson?> {
            return arrayOfNulls(size)
        }
    }
}