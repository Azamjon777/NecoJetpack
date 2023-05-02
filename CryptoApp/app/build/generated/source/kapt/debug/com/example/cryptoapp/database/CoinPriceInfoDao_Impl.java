package com.example.cryptoapp.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.cryptoapp.pojo.CoinPriceInfo;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CoinPriceInfoDao_Impl implements CoinPriceInfoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CoinPriceInfo> __insertionAdapterOfCoinPriceInfo;

  public CoinPriceInfoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCoinPriceInfo = new EntityInsertionAdapter<CoinPriceInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `full_price_list` (`type`,`market`,`fromSymbol`,`toSymbol`,`flags`,`price`,`lastUpdate`,`lastVolume`,`lastVolumeTo`,`lastTradeId`,`volumeDay`,`volumeDayTo`,`volume24Hour`,`volume24HourTo`,`openDay`,`highDay`,`lowDay`,`open24Hour`,`high24Hour`,`low24Hour`,`lastMarket`,`volumeHour`,`volumeHourTo`,`openHour`,`highHour`,`lowHour`,`topTierVolume24Hour`,`topTierVolume24HourTo`,`change24Hour`,`changePCT24Hour`,`changeDay`,`changePCTDay`,`supply`,`mktCap`,`totalVolume24Hour`,`totalVolume24HourTo`,`totalTopTierVolume24Hour`,`totalTopTierVolume24HourTo`,`imageUrl`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CoinPriceInfo value) {
        if (value.getType() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getType());
        }
        if (value.getMarket() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMarket());
        }
        if (value.getFromSymbol() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFromSymbol());
        }
        if (value.getToSymbol() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getToSymbol());
        }
        if (value.getFlags() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFlags());
        }
        if (value.getPrice() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPrice());
        }
        if (value.getLastUpdate() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getLastUpdate());
        }
        if (value.getLastVolume() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLastVolume());
        }
        if (value.getLastVolumeTo() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLastVolumeTo());
        }
        if (value.getLastTradeId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getLastTradeId());
        }
        if (value.getVolumeDay() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getVolumeDay());
        }
        if (value.getVolumeDayTo() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getVolumeDayTo());
        }
        if (value.getVolume24Hour() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getVolume24Hour());
        }
        if (value.getVolume24HourTo() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getVolume24HourTo());
        }
        if (value.getOpenDay() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getOpenDay());
        }
        if (value.getHighDay() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getHighDay());
        }
        if (value.getLowDay() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getLowDay());
        }
        if (value.getOpen24Hour() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getOpen24Hour());
        }
        if (value.getHigh24Hour() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getHigh24Hour());
        }
        if (value.getLow24Hour() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getLow24Hour());
        }
        if (value.getLastMarket() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getLastMarket());
        }
        if (value.getVolumeHour() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getVolumeHour());
        }
        if (value.getVolumeHourTo() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getVolumeHourTo());
        }
        if (value.getOpenHour() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getOpenHour());
        }
        if (value.getHighHour() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getHighHour());
        }
        if (value.getLowHour() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getLowHour());
        }
        if (value.getTopTierVolume24Hour() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getTopTierVolume24Hour());
        }
        if (value.getTopTierVolume24HourTo() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getTopTierVolume24HourTo());
        }
        if (value.getChange24Hour() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getChange24Hour());
        }
        if (value.getChangePCT24Hour() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getChangePCT24Hour());
        }
        if (value.getChangeDay() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getChangeDay());
        }
        if (value.getChangePCTDay() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getChangePCTDay());
        }
        if (value.getSupply() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getSupply());
        }
        if (value.getMktCap() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getMktCap());
        }
        if (value.getTotalVolume24Hour() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getTotalVolume24Hour());
        }
        if (value.getTotalVolume24HourTo() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getTotalVolume24HourTo());
        }
        if (value.getTotalTopTierVolume24Hour() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getTotalTopTierVolume24Hour());
        }
        if (value.getTotalTopTierVolume24HourTo() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getTotalTopTierVolume24HourTo());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getImageUrl());
        }
      }
    };
  }

  @Override
  public void insertPriceList(final List<CoinPriceInfo> priceList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCoinPriceInfo.insert(priceList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<CoinPriceInfo>> getPriceList() {
    final String _sql = "SELECT * FROM full_price_list ORDER BY lastUpdate";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"full_price_list"}, false, new Callable<List<CoinPriceInfo>>() {
      @Override
      public List<CoinPriceInfo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfMarket = CursorUtil.getColumnIndexOrThrow(_cursor, "market");
          final int _cursorIndexOfFromSymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "fromSymbol");
          final int _cursorIndexOfToSymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "toSymbol");
          final int _cursorIndexOfFlags = CursorUtil.getColumnIndexOrThrow(_cursor, "flags");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfLastUpdate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdate");
          final int _cursorIndexOfLastVolume = CursorUtil.getColumnIndexOrThrow(_cursor, "lastVolume");
          final int _cursorIndexOfLastVolumeTo = CursorUtil.getColumnIndexOrThrow(_cursor, "lastVolumeTo");
          final int _cursorIndexOfLastTradeId = CursorUtil.getColumnIndexOrThrow(_cursor, "lastTradeId");
          final int _cursorIndexOfVolumeDay = CursorUtil.getColumnIndexOrThrow(_cursor, "volumeDay");
          final int _cursorIndexOfVolumeDayTo = CursorUtil.getColumnIndexOrThrow(_cursor, "volumeDayTo");
          final int _cursorIndexOfVolume24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "volume24Hour");
          final int _cursorIndexOfVolume24HourTo = CursorUtil.getColumnIndexOrThrow(_cursor, "volume24HourTo");
          final int _cursorIndexOfOpenDay = CursorUtil.getColumnIndexOrThrow(_cursor, "openDay");
          final int _cursorIndexOfHighDay = CursorUtil.getColumnIndexOrThrow(_cursor, "highDay");
          final int _cursorIndexOfLowDay = CursorUtil.getColumnIndexOrThrow(_cursor, "lowDay");
          final int _cursorIndexOfOpen24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "open24Hour");
          final int _cursorIndexOfHigh24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "high24Hour");
          final int _cursorIndexOfLow24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "low24Hour");
          final int _cursorIndexOfLastMarket = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMarket");
          final int _cursorIndexOfVolumeHour = CursorUtil.getColumnIndexOrThrow(_cursor, "volumeHour");
          final int _cursorIndexOfVolumeHourTo = CursorUtil.getColumnIndexOrThrow(_cursor, "volumeHourTo");
          final int _cursorIndexOfOpenHour = CursorUtil.getColumnIndexOrThrow(_cursor, "openHour");
          final int _cursorIndexOfHighHour = CursorUtil.getColumnIndexOrThrow(_cursor, "highHour");
          final int _cursorIndexOfLowHour = CursorUtil.getColumnIndexOrThrow(_cursor, "lowHour");
          final int _cursorIndexOfTopTierVolume24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "topTierVolume24Hour");
          final int _cursorIndexOfTopTierVolume24HourTo = CursorUtil.getColumnIndexOrThrow(_cursor, "topTierVolume24HourTo");
          final int _cursorIndexOfChange24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "change24Hour");
          final int _cursorIndexOfChangePCT24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "changePCT24Hour");
          final int _cursorIndexOfChangeDay = CursorUtil.getColumnIndexOrThrow(_cursor, "changeDay");
          final int _cursorIndexOfChangePCTDay = CursorUtil.getColumnIndexOrThrow(_cursor, "changePCTDay");
          final int _cursorIndexOfSupply = CursorUtil.getColumnIndexOrThrow(_cursor, "supply");
          final int _cursorIndexOfMktCap = CursorUtil.getColumnIndexOrThrow(_cursor, "mktCap");
          final int _cursorIndexOfTotalVolume24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "totalVolume24Hour");
          final int _cursorIndexOfTotalVolume24HourTo = CursorUtil.getColumnIndexOrThrow(_cursor, "totalVolume24HourTo");
          final int _cursorIndexOfTotalTopTierVolume24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "totalTopTierVolume24Hour");
          final int _cursorIndexOfTotalTopTierVolume24HourTo = CursorUtil.getColumnIndexOrThrow(_cursor, "totalTopTierVolume24HourTo");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final List<CoinPriceInfo> _result = new ArrayList<CoinPriceInfo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CoinPriceInfo _item;
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final String _tmpMarket;
            if (_cursor.isNull(_cursorIndexOfMarket)) {
              _tmpMarket = null;
            } else {
              _tmpMarket = _cursor.getString(_cursorIndexOfMarket);
            }
            final String _tmpFromSymbol;
            if (_cursor.isNull(_cursorIndexOfFromSymbol)) {
              _tmpFromSymbol = null;
            } else {
              _tmpFromSymbol = _cursor.getString(_cursorIndexOfFromSymbol);
            }
            final String _tmpToSymbol;
            if (_cursor.isNull(_cursorIndexOfToSymbol)) {
              _tmpToSymbol = null;
            } else {
              _tmpToSymbol = _cursor.getString(_cursorIndexOfToSymbol);
            }
            final String _tmpFlags;
            if (_cursor.isNull(_cursorIndexOfFlags)) {
              _tmpFlags = null;
            } else {
              _tmpFlags = _cursor.getString(_cursorIndexOfFlags);
            }
            final String _tmpPrice;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmpPrice = null;
            } else {
              _tmpPrice = _cursor.getString(_cursorIndexOfPrice);
            }
            final Long _tmpLastUpdate;
            if (_cursor.isNull(_cursorIndexOfLastUpdate)) {
              _tmpLastUpdate = null;
            } else {
              _tmpLastUpdate = _cursor.getLong(_cursorIndexOfLastUpdate);
            }
            final String _tmpLastVolume;
            if (_cursor.isNull(_cursorIndexOfLastVolume)) {
              _tmpLastVolume = null;
            } else {
              _tmpLastVolume = _cursor.getString(_cursorIndexOfLastVolume);
            }
            final String _tmpLastVolumeTo;
            if (_cursor.isNull(_cursorIndexOfLastVolumeTo)) {
              _tmpLastVolumeTo = null;
            } else {
              _tmpLastVolumeTo = _cursor.getString(_cursorIndexOfLastVolumeTo);
            }
            final String _tmpLastTradeId;
            if (_cursor.isNull(_cursorIndexOfLastTradeId)) {
              _tmpLastTradeId = null;
            } else {
              _tmpLastTradeId = _cursor.getString(_cursorIndexOfLastTradeId);
            }
            final String _tmpVolumeDay;
            if (_cursor.isNull(_cursorIndexOfVolumeDay)) {
              _tmpVolumeDay = null;
            } else {
              _tmpVolumeDay = _cursor.getString(_cursorIndexOfVolumeDay);
            }
            final String _tmpVolumeDayTo;
            if (_cursor.isNull(_cursorIndexOfVolumeDayTo)) {
              _tmpVolumeDayTo = null;
            } else {
              _tmpVolumeDayTo = _cursor.getString(_cursorIndexOfVolumeDayTo);
            }
            final String _tmpVolume24Hour;
            if (_cursor.isNull(_cursorIndexOfVolume24Hour)) {
              _tmpVolume24Hour = null;
            } else {
              _tmpVolume24Hour = _cursor.getString(_cursorIndexOfVolume24Hour);
            }
            final String _tmpVolume24HourTo;
            if (_cursor.isNull(_cursorIndexOfVolume24HourTo)) {
              _tmpVolume24HourTo = null;
            } else {
              _tmpVolume24HourTo = _cursor.getString(_cursorIndexOfVolume24HourTo);
            }
            final String _tmpOpenDay;
            if (_cursor.isNull(_cursorIndexOfOpenDay)) {
              _tmpOpenDay = null;
            } else {
              _tmpOpenDay = _cursor.getString(_cursorIndexOfOpenDay);
            }
            final String _tmpHighDay;
            if (_cursor.isNull(_cursorIndexOfHighDay)) {
              _tmpHighDay = null;
            } else {
              _tmpHighDay = _cursor.getString(_cursorIndexOfHighDay);
            }
            final String _tmpLowDay;
            if (_cursor.isNull(_cursorIndexOfLowDay)) {
              _tmpLowDay = null;
            } else {
              _tmpLowDay = _cursor.getString(_cursorIndexOfLowDay);
            }
            final String _tmpOpen24Hour;
            if (_cursor.isNull(_cursorIndexOfOpen24Hour)) {
              _tmpOpen24Hour = null;
            } else {
              _tmpOpen24Hour = _cursor.getString(_cursorIndexOfOpen24Hour);
            }
            final String _tmpHigh24Hour;
            if (_cursor.isNull(_cursorIndexOfHigh24Hour)) {
              _tmpHigh24Hour = null;
            } else {
              _tmpHigh24Hour = _cursor.getString(_cursorIndexOfHigh24Hour);
            }
            final String _tmpLow24Hour;
            if (_cursor.isNull(_cursorIndexOfLow24Hour)) {
              _tmpLow24Hour = null;
            } else {
              _tmpLow24Hour = _cursor.getString(_cursorIndexOfLow24Hour);
            }
            final String _tmpLastMarket;
            if (_cursor.isNull(_cursorIndexOfLastMarket)) {
              _tmpLastMarket = null;
            } else {
              _tmpLastMarket = _cursor.getString(_cursorIndexOfLastMarket);
            }
            final String _tmpVolumeHour;
            if (_cursor.isNull(_cursorIndexOfVolumeHour)) {
              _tmpVolumeHour = null;
            } else {
              _tmpVolumeHour = _cursor.getString(_cursorIndexOfVolumeHour);
            }
            final String _tmpVolumeHourTo;
            if (_cursor.isNull(_cursorIndexOfVolumeHourTo)) {
              _tmpVolumeHourTo = null;
            } else {
              _tmpVolumeHourTo = _cursor.getString(_cursorIndexOfVolumeHourTo);
            }
            final String _tmpOpenHour;
            if (_cursor.isNull(_cursorIndexOfOpenHour)) {
              _tmpOpenHour = null;
            } else {
              _tmpOpenHour = _cursor.getString(_cursorIndexOfOpenHour);
            }
            final String _tmpHighHour;
            if (_cursor.isNull(_cursorIndexOfHighHour)) {
              _tmpHighHour = null;
            } else {
              _tmpHighHour = _cursor.getString(_cursorIndexOfHighHour);
            }
            final String _tmpLowHour;
            if (_cursor.isNull(_cursorIndexOfLowHour)) {
              _tmpLowHour = null;
            } else {
              _tmpLowHour = _cursor.getString(_cursorIndexOfLowHour);
            }
            final String _tmpTopTierVolume24Hour;
            if (_cursor.isNull(_cursorIndexOfTopTierVolume24Hour)) {
              _tmpTopTierVolume24Hour = null;
            } else {
              _tmpTopTierVolume24Hour = _cursor.getString(_cursorIndexOfTopTierVolume24Hour);
            }
            final String _tmpTopTierVolume24HourTo;
            if (_cursor.isNull(_cursorIndexOfTopTierVolume24HourTo)) {
              _tmpTopTierVolume24HourTo = null;
            } else {
              _tmpTopTierVolume24HourTo = _cursor.getString(_cursorIndexOfTopTierVolume24HourTo);
            }
            final String _tmpChange24Hour;
            if (_cursor.isNull(_cursorIndexOfChange24Hour)) {
              _tmpChange24Hour = null;
            } else {
              _tmpChange24Hour = _cursor.getString(_cursorIndexOfChange24Hour);
            }
            final String _tmpChangePCT24Hour;
            if (_cursor.isNull(_cursorIndexOfChangePCT24Hour)) {
              _tmpChangePCT24Hour = null;
            } else {
              _tmpChangePCT24Hour = _cursor.getString(_cursorIndexOfChangePCT24Hour);
            }
            final String _tmpChangeDay;
            if (_cursor.isNull(_cursorIndexOfChangeDay)) {
              _tmpChangeDay = null;
            } else {
              _tmpChangeDay = _cursor.getString(_cursorIndexOfChangeDay);
            }
            final String _tmpChangePCTDay;
            if (_cursor.isNull(_cursorIndexOfChangePCTDay)) {
              _tmpChangePCTDay = null;
            } else {
              _tmpChangePCTDay = _cursor.getString(_cursorIndexOfChangePCTDay);
            }
            final String _tmpSupply;
            if (_cursor.isNull(_cursorIndexOfSupply)) {
              _tmpSupply = null;
            } else {
              _tmpSupply = _cursor.getString(_cursorIndexOfSupply);
            }
            final String _tmpMktCap;
            if (_cursor.isNull(_cursorIndexOfMktCap)) {
              _tmpMktCap = null;
            } else {
              _tmpMktCap = _cursor.getString(_cursorIndexOfMktCap);
            }
            final String _tmpTotalVolume24Hour;
            if (_cursor.isNull(_cursorIndexOfTotalVolume24Hour)) {
              _tmpTotalVolume24Hour = null;
            } else {
              _tmpTotalVolume24Hour = _cursor.getString(_cursorIndexOfTotalVolume24Hour);
            }
            final String _tmpTotalVolume24HourTo;
            if (_cursor.isNull(_cursorIndexOfTotalVolume24HourTo)) {
              _tmpTotalVolume24HourTo = null;
            } else {
              _tmpTotalVolume24HourTo = _cursor.getString(_cursorIndexOfTotalVolume24HourTo);
            }
            final String _tmpTotalTopTierVolume24Hour;
            if (_cursor.isNull(_cursorIndexOfTotalTopTierVolume24Hour)) {
              _tmpTotalTopTierVolume24Hour = null;
            } else {
              _tmpTotalTopTierVolume24Hour = _cursor.getString(_cursorIndexOfTotalTopTierVolume24Hour);
            }
            final String _tmpTotalTopTierVolume24HourTo;
            if (_cursor.isNull(_cursorIndexOfTotalTopTierVolume24HourTo)) {
              _tmpTotalTopTierVolume24HourTo = null;
            } else {
              _tmpTotalTopTierVolume24HourTo = _cursor.getString(_cursorIndexOfTotalTopTierVolume24HourTo);
            }
            final String _tmpImageUrl;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImageUrl = null;
            } else {
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            }
            _item = new CoinPriceInfo(_tmpType,_tmpMarket,_tmpFromSymbol,_tmpToSymbol,_tmpFlags,_tmpPrice,_tmpLastUpdate,_tmpLastVolume,_tmpLastVolumeTo,_tmpLastTradeId,_tmpVolumeDay,_tmpVolumeDayTo,_tmpVolume24Hour,_tmpVolume24HourTo,_tmpOpenDay,_tmpHighDay,_tmpLowDay,_tmpOpen24Hour,_tmpHigh24Hour,_tmpLow24Hour,_tmpLastMarket,_tmpVolumeHour,_tmpVolumeHourTo,_tmpOpenHour,_tmpHighHour,_tmpLowHour,_tmpTopTierVolume24Hour,_tmpTopTierVolume24HourTo,_tmpChange24Hour,_tmpChangePCT24Hour,_tmpChangeDay,_tmpChangePCTDay,_tmpSupply,_tmpMktCap,_tmpTotalVolume24Hour,_tmpTotalVolume24HourTo,_tmpTotalTopTierVolume24Hour,_tmpTotalTopTierVolume24HourTo,_tmpImageUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<CoinPriceInfo> getPriceInfoAboutCoin(final String fSym) {
    final String _sql = "SELECT * FROM full_price_list WHERE fromSymbol == ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (fSym == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, fSym);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"full_price_list"}, false, new Callable<CoinPriceInfo>() {
      @Override
      public CoinPriceInfo call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfMarket = CursorUtil.getColumnIndexOrThrow(_cursor, "market");
          final int _cursorIndexOfFromSymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "fromSymbol");
          final int _cursorIndexOfToSymbol = CursorUtil.getColumnIndexOrThrow(_cursor, "toSymbol");
          final int _cursorIndexOfFlags = CursorUtil.getColumnIndexOrThrow(_cursor, "flags");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfLastUpdate = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdate");
          final int _cursorIndexOfLastVolume = CursorUtil.getColumnIndexOrThrow(_cursor, "lastVolume");
          final int _cursorIndexOfLastVolumeTo = CursorUtil.getColumnIndexOrThrow(_cursor, "lastVolumeTo");
          final int _cursorIndexOfLastTradeId = CursorUtil.getColumnIndexOrThrow(_cursor, "lastTradeId");
          final int _cursorIndexOfVolumeDay = CursorUtil.getColumnIndexOrThrow(_cursor, "volumeDay");
          final int _cursorIndexOfVolumeDayTo = CursorUtil.getColumnIndexOrThrow(_cursor, "volumeDayTo");
          final int _cursorIndexOfVolume24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "volume24Hour");
          final int _cursorIndexOfVolume24HourTo = CursorUtil.getColumnIndexOrThrow(_cursor, "volume24HourTo");
          final int _cursorIndexOfOpenDay = CursorUtil.getColumnIndexOrThrow(_cursor, "openDay");
          final int _cursorIndexOfHighDay = CursorUtil.getColumnIndexOrThrow(_cursor, "highDay");
          final int _cursorIndexOfLowDay = CursorUtil.getColumnIndexOrThrow(_cursor, "lowDay");
          final int _cursorIndexOfOpen24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "open24Hour");
          final int _cursorIndexOfHigh24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "high24Hour");
          final int _cursorIndexOfLow24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "low24Hour");
          final int _cursorIndexOfLastMarket = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMarket");
          final int _cursorIndexOfVolumeHour = CursorUtil.getColumnIndexOrThrow(_cursor, "volumeHour");
          final int _cursorIndexOfVolumeHourTo = CursorUtil.getColumnIndexOrThrow(_cursor, "volumeHourTo");
          final int _cursorIndexOfOpenHour = CursorUtil.getColumnIndexOrThrow(_cursor, "openHour");
          final int _cursorIndexOfHighHour = CursorUtil.getColumnIndexOrThrow(_cursor, "highHour");
          final int _cursorIndexOfLowHour = CursorUtil.getColumnIndexOrThrow(_cursor, "lowHour");
          final int _cursorIndexOfTopTierVolume24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "topTierVolume24Hour");
          final int _cursorIndexOfTopTierVolume24HourTo = CursorUtil.getColumnIndexOrThrow(_cursor, "topTierVolume24HourTo");
          final int _cursorIndexOfChange24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "change24Hour");
          final int _cursorIndexOfChangePCT24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "changePCT24Hour");
          final int _cursorIndexOfChangeDay = CursorUtil.getColumnIndexOrThrow(_cursor, "changeDay");
          final int _cursorIndexOfChangePCTDay = CursorUtil.getColumnIndexOrThrow(_cursor, "changePCTDay");
          final int _cursorIndexOfSupply = CursorUtil.getColumnIndexOrThrow(_cursor, "supply");
          final int _cursorIndexOfMktCap = CursorUtil.getColumnIndexOrThrow(_cursor, "mktCap");
          final int _cursorIndexOfTotalVolume24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "totalVolume24Hour");
          final int _cursorIndexOfTotalVolume24HourTo = CursorUtil.getColumnIndexOrThrow(_cursor, "totalVolume24HourTo");
          final int _cursorIndexOfTotalTopTierVolume24Hour = CursorUtil.getColumnIndexOrThrow(_cursor, "totalTopTierVolume24Hour");
          final int _cursorIndexOfTotalTopTierVolume24HourTo = CursorUtil.getColumnIndexOrThrow(_cursor, "totalTopTierVolume24HourTo");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final CoinPriceInfo _result;
          if(_cursor.moveToFirst()) {
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            final String _tmpMarket;
            if (_cursor.isNull(_cursorIndexOfMarket)) {
              _tmpMarket = null;
            } else {
              _tmpMarket = _cursor.getString(_cursorIndexOfMarket);
            }
            final String _tmpFromSymbol;
            if (_cursor.isNull(_cursorIndexOfFromSymbol)) {
              _tmpFromSymbol = null;
            } else {
              _tmpFromSymbol = _cursor.getString(_cursorIndexOfFromSymbol);
            }
            final String _tmpToSymbol;
            if (_cursor.isNull(_cursorIndexOfToSymbol)) {
              _tmpToSymbol = null;
            } else {
              _tmpToSymbol = _cursor.getString(_cursorIndexOfToSymbol);
            }
            final String _tmpFlags;
            if (_cursor.isNull(_cursorIndexOfFlags)) {
              _tmpFlags = null;
            } else {
              _tmpFlags = _cursor.getString(_cursorIndexOfFlags);
            }
            final String _tmpPrice;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmpPrice = null;
            } else {
              _tmpPrice = _cursor.getString(_cursorIndexOfPrice);
            }
            final Long _tmpLastUpdate;
            if (_cursor.isNull(_cursorIndexOfLastUpdate)) {
              _tmpLastUpdate = null;
            } else {
              _tmpLastUpdate = _cursor.getLong(_cursorIndexOfLastUpdate);
            }
            final String _tmpLastVolume;
            if (_cursor.isNull(_cursorIndexOfLastVolume)) {
              _tmpLastVolume = null;
            } else {
              _tmpLastVolume = _cursor.getString(_cursorIndexOfLastVolume);
            }
            final String _tmpLastVolumeTo;
            if (_cursor.isNull(_cursorIndexOfLastVolumeTo)) {
              _tmpLastVolumeTo = null;
            } else {
              _tmpLastVolumeTo = _cursor.getString(_cursorIndexOfLastVolumeTo);
            }
            final String _tmpLastTradeId;
            if (_cursor.isNull(_cursorIndexOfLastTradeId)) {
              _tmpLastTradeId = null;
            } else {
              _tmpLastTradeId = _cursor.getString(_cursorIndexOfLastTradeId);
            }
            final String _tmpVolumeDay;
            if (_cursor.isNull(_cursorIndexOfVolumeDay)) {
              _tmpVolumeDay = null;
            } else {
              _tmpVolumeDay = _cursor.getString(_cursorIndexOfVolumeDay);
            }
            final String _tmpVolumeDayTo;
            if (_cursor.isNull(_cursorIndexOfVolumeDayTo)) {
              _tmpVolumeDayTo = null;
            } else {
              _tmpVolumeDayTo = _cursor.getString(_cursorIndexOfVolumeDayTo);
            }
            final String _tmpVolume24Hour;
            if (_cursor.isNull(_cursorIndexOfVolume24Hour)) {
              _tmpVolume24Hour = null;
            } else {
              _tmpVolume24Hour = _cursor.getString(_cursorIndexOfVolume24Hour);
            }
            final String _tmpVolume24HourTo;
            if (_cursor.isNull(_cursorIndexOfVolume24HourTo)) {
              _tmpVolume24HourTo = null;
            } else {
              _tmpVolume24HourTo = _cursor.getString(_cursorIndexOfVolume24HourTo);
            }
            final String _tmpOpenDay;
            if (_cursor.isNull(_cursorIndexOfOpenDay)) {
              _tmpOpenDay = null;
            } else {
              _tmpOpenDay = _cursor.getString(_cursorIndexOfOpenDay);
            }
            final String _tmpHighDay;
            if (_cursor.isNull(_cursorIndexOfHighDay)) {
              _tmpHighDay = null;
            } else {
              _tmpHighDay = _cursor.getString(_cursorIndexOfHighDay);
            }
            final String _tmpLowDay;
            if (_cursor.isNull(_cursorIndexOfLowDay)) {
              _tmpLowDay = null;
            } else {
              _tmpLowDay = _cursor.getString(_cursorIndexOfLowDay);
            }
            final String _tmpOpen24Hour;
            if (_cursor.isNull(_cursorIndexOfOpen24Hour)) {
              _tmpOpen24Hour = null;
            } else {
              _tmpOpen24Hour = _cursor.getString(_cursorIndexOfOpen24Hour);
            }
            final String _tmpHigh24Hour;
            if (_cursor.isNull(_cursorIndexOfHigh24Hour)) {
              _tmpHigh24Hour = null;
            } else {
              _tmpHigh24Hour = _cursor.getString(_cursorIndexOfHigh24Hour);
            }
            final String _tmpLow24Hour;
            if (_cursor.isNull(_cursorIndexOfLow24Hour)) {
              _tmpLow24Hour = null;
            } else {
              _tmpLow24Hour = _cursor.getString(_cursorIndexOfLow24Hour);
            }
            final String _tmpLastMarket;
            if (_cursor.isNull(_cursorIndexOfLastMarket)) {
              _tmpLastMarket = null;
            } else {
              _tmpLastMarket = _cursor.getString(_cursorIndexOfLastMarket);
            }
            final String _tmpVolumeHour;
            if (_cursor.isNull(_cursorIndexOfVolumeHour)) {
              _tmpVolumeHour = null;
            } else {
              _tmpVolumeHour = _cursor.getString(_cursorIndexOfVolumeHour);
            }
            final String _tmpVolumeHourTo;
            if (_cursor.isNull(_cursorIndexOfVolumeHourTo)) {
              _tmpVolumeHourTo = null;
            } else {
              _tmpVolumeHourTo = _cursor.getString(_cursorIndexOfVolumeHourTo);
            }
            final String _tmpOpenHour;
            if (_cursor.isNull(_cursorIndexOfOpenHour)) {
              _tmpOpenHour = null;
            } else {
              _tmpOpenHour = _cursor.getString(_cursorIndexOfOpenHour);
            }
            final String _tmpHighHour;
            if (_cursor.isNull(_cursorIndexOfHighHour)) {
              _tmpHighHour = null;
            } else {
              _tmpHighHour = _cursor.getString(_cursorIndexOfHighHour);
            }
            final String _tmpLowHour;
            if (_cursor.isNull(_cursorIndexOfLowHour)) {
              _tmpLowHour = null;
            } else {
              _tmpLowHour = _cursor.getString(_cursorIndexOfLowHour);
            }
            final String _tmpTopTierVolume24Hour;
            if (_cursor.isNull(_cursorIndexOfTopTierVolume24Hour)) {
              _tmpTopTierVolume24Hour = null;
            } else {
              _tmpTopTierVolume24Hour = _cursor.getString(_cursorIndexOfTopTierVolume24Hour);
            }
            final String _tmpTopTierVolume24HourTo;
            if (_cursor.isNull(_cursorIndexOfTopTierVolume24HourTo)) {
              _tmpTopTierVolume24HourTo = null;
            } else {
              _tmpTopTierVolume24HourTo = _cursor.getString(_cursorIndexOfTopTierVolume24HourTo);
            }
            final String _tmpChange24Hour;
            if (_cursor.isNull(_cursorIndexOfChange24Hour)) {
              _tmpChange24Hour = null;
            } else {
              _tmpChange24Hour = _cursor.getString(_cursorIndexOfChange24Hour);
            }
            final String _tmpChangePCT24Hour;
            if (_cursor.isNull(_cursorIndexOfChangePCT24Hour)) {
              _tmpChangePCT24Hour = null;
            } else {
              _tmpChangePCT24Hour = _cursor.getString(_cursorIndexOfChangePCT24Hour);
            }
            final String _tmpChangeDay;
            if (_cursor.isNull(_cursorIndexOfChangeDay)) {
              _tmpChangeDay = null;
            } else {
              _tmpChangeDay = _cursor.getString(_cursorIndexOfChangeDay);
            }
            final String _tmpChangePCTDay;
            if (_cursor.isNull(_cursorIndexOfChangePCTDay)) {
              _tmpChangePCTDay = null;
            } else {
              _tmpChangePCTDay = _cursor.getString(_cursorIndexOfChangePCTDay);
            }
            final String _tmpSupply;
            if (_cursor.isNull(_cursorIndexOfSupply)) {
              _tmpSupply = null;
            } else {
              _tmpSupply = _cursor.getString(_cursorIndexOfSupply);
            }
            final String _tmpMktCap;
            if (_cursor.isNull(_cursorIndexOfMktCap)) {
              _tmpMktCap = null;
            } else {
              _tmpMktCap = _cursor.getString(_cursorIndexOfMktCap);
            }
            final String _tmpTotalVolume24Hour;
            if (_cursor.isNull(_cursorIndexOfTotalVolume24Hour)) {
              _tmpTotalVolume24Hour = null;
            } else {
              _tmpTotalVolume24Hour = _cursor.getString(_cursorIndexOfTotalVolume24Hour);
            }
            final String _tmpTotalVolume24HourTo;
            if (_cursor.isNull(_cursorIndexOfTotalVolume24HourTo)) {
              _tmpTotalVolume24HourTo = null;
            } else {
              _tmpTotalVolume24HourTo = _cursor.getString(_cursorIndexOfTotalVolume24HourTo);
            }
            final String _tmpTotalTopTierVolume24Hour;
            if (_cursor.isNull(_cursorIndexOfTotalTopTierVolume24Hour)) {
              _tmpTotalTopTierVolume24Hour = null;
            } else {
              _tmpTotalTopTierVolume24Hour = _cursor.getString(_cursorIndexOfTotalTopTierVolume24Hour);
            }
            final String _tmpTotalTopTierVolume24HourTo;
            if (_cursor.isNull(_cursorIndexOfTotalTopTierVolume24HourTo)) {
              _tmpTotalTopTierVolume24HourTo = null;
            } else {
              _tmpTotalTopTierVolume24HourTo = _cursor.getString(_cursorIndexOfTotalTopTierVolume24HourTo);
            }
            final String _tmpImageUrl;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImageUrl = null;
            } else {
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            }
            _result = new CoinPriceInfo(_tmpType,_tmpMarket,_tmpFromSymbol,_tmpToSymbol,_tmpFlags,_tmpPrice,_tmpLastUpdate,_tmpLastVolume,_tmpLastVolumeTo,_tmpLastTradeId,_tmpVolumeDay,_tmpVolumeDayTo,_tmpVolume24Hour,_tmpVolume24HourTo,_tmpOpenDay,_tmpHighDay,_tmpLowDay,_tmpOpen24Hour,_tmpHigh24Hour,_tmpLow24Hour,_tmpLastMarket,_tmpVolumeHour,_tmpVolumeHourTo,_tmpOpenHour,_tmpHighHour,_tmpLowHour,_tmpTopTierVolume24Hour,_tmpTopTierVolume24HourTo,_tmpChange24Hour,_tmpChangePCT24Hour,_tmpChangeDay,_tmpChangePCTDay,_tmpSupply,_tmpMktCap,_tmpTotalVolume24Hour,_tmpTotalVolume24HourTo,_tmpTotalTopTierVolume24Hour,_tmpTotalTopTierVolume24HourTo,_tmpImageUrl);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
