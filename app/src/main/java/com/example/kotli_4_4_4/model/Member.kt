package com.example.kotli_4_4_4.model

import android.os.Parcel
import android.os.Parcelable

class Member(public var id:Int, public var name: String?):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    public override fun toString():String{
        return "Member{id="+id+" name="+name+'}'
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Member> {
        override fun createFromParcel(parcel: Parcel): Member {
            return Member(parcel)
        }

        override fun newArray(size: Int): Array<Member?> {
            return arrayOfNulls(size)
        }
    }
}