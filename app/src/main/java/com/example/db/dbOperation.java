package com.example.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
public class dbOperation extends SQLiteOpenHelper {

        public static final int database_version = 1;
        public String CREATE_QUERY = "CREATE TABLE "+ TableData.TableInfo.TABLE_NAME+ " ("+ TableData.TableInfo.USER_NAME+ " TEXT,"+ TableData.TableInfo.USER_PASS+ " TEXT);";
        public dbOperation(Context context) {
                super(context, TableData.TableInfo.DATABASE_NAME, null, database_version);
                Log.d("db operations ", " DB Created ");
        }

        @Override
        public void onCreate(SQLiteDatabase sdb) {
                sdb.execSQL(CREATE_QUERY);
                Log.d("db operation", "Table Created");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }

        public void putInformation(dbOperation dop, String name, String pass){
                SQLiteDatabase SQ = dop.getWritableDatabase();
                ContentValues cv = new ContentValues();
                cv.put(TableData.TableInfo.USER_NAME, name);
                cv.put(TableData.TableInfo.USER_PASS, pass);
                long k = SQ.insert(TableData.TableInfo.TABLE_NAME, null, cv);
                Log.d("db operations", "One row Inserted");
        }


}