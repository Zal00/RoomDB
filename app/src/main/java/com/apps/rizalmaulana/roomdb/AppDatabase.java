package com.apps.rizalmaulana.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract InterfaceDAO interfaceDAO();
}
