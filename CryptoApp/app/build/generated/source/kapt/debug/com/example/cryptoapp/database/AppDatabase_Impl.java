package com.example.cryptoapp.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CoinPriceInfoDao _coinPriceInfoDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `full_price_list` (`type` TEXT, `market` TEXT, `fromSymbol` TEXT NOT NULL, `toSymbol` TEXT, `flags` TEXT, `price` TEXT, `lastUpdate` INTEGER, `lastVolume` TEXT, `lastVolumeTo` TEXT, `lastTradeId` TEXT, `volumeDay` TEXT, `volumeDayTo` TEXT, `volume24Hour` TEXT, `volume24HourTo` TEXT, `openDay` TEXT, `highDay` TEXT, `lowDay` TEXT, `open24Hour` TEXT, `high24Hour` TEXT, `low24Hour` TEXT, `lastMarket` TEXT, `volumeHour` TEXT, `volumeHourTo` TEXT, `openHour` TEXT, `highHour` TEXT, `lowHour` TEXT, `topTierVolume24Hour` TEXT, `topTierVolume24HourTo` TEXT, `change24Hour` TEXT, `changePCT24Hour` TEXT, `changeDay` TEXT, `changePCTDay` TEXT, `supply` TEXT, `mktCap` TEXT, `totalVolume24Hour` TEXT, `totalVolume24HourTo` TEXT, `totalTopTierVolume24Hour` TEXT, `totalTopTierVolume24HourTo` TEXT, `imageUrl` TEXT, PRIMARY KEY(`fromSymbol`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a2746a5844d34dc1e8e62b2c205bd619')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `full_price_list`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFullPriceList = new HashMap<String, TableInfo.Column>(39);
        _columnsFullPriceList.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("market", new TableInfo.Column("market", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("fromSymbol", new TableInfo.Column("fromSymbol", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("toSymbol", new TableInfo.Column("toSymbol", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("flags", new TableInfo.Column("flags", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("price", new TableInfo.Column("price", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("lastUpdate", new TableInfo.Column("lastUpdate", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("lastVolume", new TableInfo.Column("lastVolume", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("lastVolumeTo", new TableInfo.Column("lastVolumeTo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("lastTradeId", new TableInfo.Column("lastTradeId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("volumeDay", new TableInfo.Column("volumeDay", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("volumeDayTo", new TableInfo.Column("volumeDayTo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("volume24Hour", new TableInfo.Column("volume24Hour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("volume24HourTo", new TableInfo.Column("volume24HourTo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("openDay", new TableInfo.Column("openDay", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("highDay", new TableInfo.Column("highDay", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("lowDay", new TableInfo.Column("lowDay", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("open24Hour", new TableInfo.Column("open24Hour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("high24Hour", new TableInfo.Column("high24Hour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("low24Hour", new TableInfo.Column("low24Hour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("lastMarket", new TableInfo.Column("lastMarket", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("volumeHour", new TableInfo.Column("volumeHour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("volumeHourTo", new TableInfo.Column("volumeHourTo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("openHour", new TableInfo.Column("openHour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("highHour", new TableInfo.Column("highHour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("lowHour", new TableInfo.Column("lowHour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("topTierVolume24Hour", new TableInfo.Column("topTierVolume24Hour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("topTierVolume24HourTo", new TableInfo.Column("topTierVolume24HourTo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("change24Hour", new TableInfo.Column("change24Hour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("changePCT24Hour", new TableInfo.Column("changePCT24Hour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("changeDay", new TableInfo.Column("changeDay", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("changePCTDay", new TableInfo.Column("changePCTDay", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("supply", new TableInfo.Column("supply", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("mktCap", new TableInfo.Column("mktCap", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("totalVolume24Hour", new TableInfo.Column("totalVolume24Hour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("totalVolume24HourTo", new TableInfo.Column("totalVolume24HourTo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("totalTopTierVolume24Hour", new TableInfo.Column("totalTopTierVolume24Hour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("totalTopTierVolume24HourTo", new TableInfo.Column("totalTopTierVolume24HourTo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFullPriceList.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFullPriceList = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFullPriceList = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFullPriceList = new TableInfo("full_price_list", _columnsFullPriceList, _foreignKeysFullPriceList, _indicesFullPriceList);
        final TableInfo _existingFullPriceList = TableInfo.read(_db, "full_price_list");
        if (! _infoFullPriceList.equals(_existingFullPriceList)) {
          return new RoomOpenHelper.ValidationResult(false, "full_price_list(com.example.cryptoapp.pojo.CoinPriceInfo).\n"
                  + " Expected:\n" + _infoFullPriceList + "\n"
                  + " Found:\n" + _existingFullPriceList);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "a2746a5844d34dc1e8e62b2c205bd619", "6de7beff6ecae1feb4dfcd934e805b42");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "full_price_list");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `full_price_list`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CoinPriceInfoDao.class, CoinPriceInfoDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public CoinPriceInfoDao coinPriceInfoDao() {
    if (_coinPriceInfoDao != null) {
      return _coinPriceInfoDao;
    } else {
      synchronized(this) {
        if(_coinPriceInfoDao == null) {
          _coinPriceInfoDao = new CoinPriceInfoDao_Impl(this);
        }
        return _coinPriceInfoDao;
      }
    }
  }
}
