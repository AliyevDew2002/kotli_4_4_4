package com.example.kotli_4_4_4.model


import java.io.Serializable

class Member(public var id:Int, public var name: String?):Serializable {
    public override fun toString():String{
        return "Member{id="+id+" name="+name+'}'
      }
    }


