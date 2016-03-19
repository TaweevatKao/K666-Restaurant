package rru.kao.taweevat.k666restaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by User on 19/3/2559.
 */
public class MyManage {
    //Eplicit

    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public MyManage(Context context) {

        //Create and connected SQLite
        myOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = myOpenHelper.getWritableDatabase();
        readSqLiteDatabase = myOpenHelper.getReadableDatabase();

    }//Constructer

} //main class
