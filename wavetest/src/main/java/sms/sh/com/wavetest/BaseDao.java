package sms.sh.com.wavetest;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Administrator on 2018\3\8 0008.
 */

public class BaseDao<T> implements IBaseDao<T> {
    @Override
    public Long insert(Object entriy) {
        return null;
    }



    private Class<T> entriyClass;
    private boolean isInit = false;
    private String tableName;
    private SQLiteDatabase database;


    public synchronized boolean init(Class<T> entriy, SQLiteDatabase sqLiteDatabase){
        if (!isInit){
            entriyClass = entriy;
            database=sqLiteDatabase;
            tableName = entriy.getAnnotation(DbTable.class).value();
        }

        return true;
    }
}
