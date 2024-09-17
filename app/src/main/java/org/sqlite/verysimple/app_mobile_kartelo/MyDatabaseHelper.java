package org.sqlite.verysimple.app_mobile_kartelo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.jetbrains.annotations.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    private Context context;
    public static final String DATABASE_NAME = "Kartelo.db";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "marques";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOM = "nom";
    public static final String COLUMN_PAYS = "pays d_origine";
    public static final String COLUMN_CREATION= "date_creation";




    public MyDatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = " CREATE TABLE " + TABLE_NAME +
                        " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        COLUMN_NOM + " TEXT, " +
                        COLUMN_PAYS + " TEXT, " +
                        COLUMN_CREATION + " INTEGER);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
