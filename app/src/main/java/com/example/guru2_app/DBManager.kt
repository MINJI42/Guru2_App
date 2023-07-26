package com.example.guru2_app

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBManager(
    context: Context?,
    name: String?,
    factory: SQLiteDatabase.CursorFactory?,
    version: Int
) : SQLiteOpenHelper(context, name, factory, version) {
    override fun onCreate(db: SQLiteDatabase?) {
        // 유저 정보 db
        db!!.execSQL("CREATE TABLE user (" +
                "email text PRIMARY KEY NOT NULL," +
                "id text NOT NULL, pw text NOT NULL, " +
                "userName text DEFAULT null, ikkiName text DEFAULT null," +
                "ikkiLevel INTEGER DEFAULT 0, coin INTEGER DEFAULT 0, todoCount INTEGER DEFAULT 0);")

        // 투두리스트 정보 db
        db!!.execSQL("CREATE TABLE todo (email_fk text, date date, listIndex INTEGER, list text," +
                "FOREIGN KEY (email_fk) REFERENCES user (email) );")
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}