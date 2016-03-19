package rru.kao.taweevat.k666restaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 19/3/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    //explicit

    public static final String database_name = "Restaurant.db";
    public static final int database_version = 1;
    private static final String create_user_table = "create table userTABLE (" +
            "_id integer paimary key, " +
            "User text, " +
            "Password text, " +
            "Name text);";
    private static final String create_food_table = "create table foodTABLE (" +
            "_id integer paimary key, " +
            "Food text, " +
            "Price text, " +
            "Source text);";



    public MyOpenHelper(Context context) {
        super(context, database_name, null, database_version);


    } //Constructer


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_user_table);
        sqLiteDatabase.execSQL(create_food_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
} // main class
