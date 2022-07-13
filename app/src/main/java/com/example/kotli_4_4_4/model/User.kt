package com.example.kotli_4_4_4.model

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

class User(public var id:Int, public var name: String?):Serializable {

    public override fun toString():String{
        return "User{id="+id+" name="+name+'}';
    }
}