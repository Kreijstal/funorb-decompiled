/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TileGrid implements Renderable {
    private int firstColumn;
    private int tileSize;
    private int columnCount;
    private int rowSpan;
    private int columnSpan;
    static char field_o;
    static byte[] field_e;
    static int field_g;
    static String field_k;
    private int rowCount;
    private Room room;
    private int endColumn;
    private IntrusiveDeque field_p;
    private int firstRow;
    private TileGridCell[] tiles;
    private int endRow;

    public final int getRenderY(byte param0) {
        if (param0 < 91) {
          this.columnCount = 23;
        }
        return this.room.getHeight(38) / 2;
    }

    private final int tileIndex(byte param0, int param1, int param2) {
        int var4 = 55 / ((-30 - param0) / 56);
        return param2 + (-this.firstColumn + (-this.firstRow + param1) * this.columnSpan);
    }

    final static void a(boolean param0, byte param1) {
        int var2 = -75 / ((param1 + 12) / 44);
        ej.field_a.renderWithTooltip(-42, 0, 0);
    }

    private final void resize(int param0, Room param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          this.firstColumn = 0;
          this.firstRow = 0;
          this.rowCount = param3 / param0;
          this.columnCount = param2 / param0;
          this.endRow = this.rowCount + param4;
          this.endColumn = 0 + this.columnCount;
          this.tileSize = param0;
          this.room = param1;
          this.rowSpan = -this.firstRow + this.endRow;
          this.columnSpan = -this.firstColumn + this.endColumn;
          this.tiles = new TileGridCell[this.rowSpan * this.columnSpan];
          for (var6_int = this.firstColumn; var6_int < this.endColumn; var6_int++) {
            for (var7 = this.firstRow; var7 < this.endRow; var7++) {
              this.setTile(var6_int, new TileGridCell(), var7, 10);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("tqa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final int getRenderX(byte param0) {
        int var2 = -60 % ((param0 + 23) / 53);
        return this.room.getWidth((byte) -86) / 2;
    }

    public final void updateAnimation(int param0) {
        if (param0 != -4366) {
          this.getRenderY((byte) -59);
        }
    }

    final void decodeCells(byte param0, BitPacketBuffer param1, Room param2) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RoomRegion var6 = null;
        int var7 = 0;
        int var4_intLifetime1;
        int var5Lifetime1;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 25) {
            this.room = (Room) null;
          }
          this.field_p.clear(8);
          if (param2.formatVersion > 8) {
            if (param2.formatVersion <= 9) {
              param1.readBits((byte) 44, 8);
              param1.readBits((byte) 44, 8);
            }
            for (var4_int = 0; var4_int < this.rowCount; var4_int++) {
              for (var5 = 0; this.columnCount > var5; var5++) {
                this.getCell(param0 - 133, var5, var4_int).decode((byte) 29, param2, param1);
              }
            }
            if (10 <= param2.formatVersion) {
              var4_intLifetime1 = param1.readBits((byte) 44, 8);
              for (var5Lifetime1 = 0; var5Lifetime1 < var4_intLifetime1; var5Lifetime1++) {
                var6 = new RoomRegion(param2, param1);
                this.field_p.addLast((byte) -77, var6);
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("tqa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final int getRowCount(int param0) {
        if (param0 < 0) {
          this.firstRow = 127;
        }
        return this.rowCount;
    }

    final void mirror(byte param0) {
        int var3 = 0;
        int var4 = 0;
        TileGridCell var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        TileGridCell[] var2 = this.tiles;
        this.resizeToRoom(this.tileSize, this.room, -125);
        if (param0 != 64) {
          this.endColumn = -6;
        }
        for (var3 = this.firstColumn; this.endColumn > var3; var3++) {
          for (var4 = this.firstRow; this.endRow > var4; var4++) {
            var5 = var2[this.tileIndex((byte) 93, var4, -1 - var3 + this.columnCount)];
            this.setTile(var3, var5, var4, 10);
            var5.mirror(param0 - 64);
          }
        }
        RoomRegion var7 = (RoomRegion) (this.field_p.first(param0 ^ -16));
        while (var7 != null) {
          var7.mirror(this.room, (byte) 104);
          var7 = (RoomRegion) (this.field_p.next(107));
        }
    }

    final boolean containsCell(int param0, byte param1, int param2) {
        boolean stackIn_8_0 = false;
        if (param1 != 48) {
          return false;
        }
        stackIn_8_0 = (param2 >= 0) && (0 <= param0) && (param2 < this.columnCount) && (this.rowCount > param0);
        return stackIn_8_0;
    }

    public static void releaseStatics(byte param0) {
        if (param0 < 24) {
          return;
        }
        field_k = null;
        field_e = null;
    }

    public final boolean isRenderExpired(byte param0) {
        if (param0 != 48) {
          this.removeOccupancy(8, 65, true, 67, -80, 46, 77);
        }
        return false;
    }

    public final void render(int param0, Camera param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RoomRegion var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 <= 103) {
            return;
          }
          for (var3_int = 0; var3_int < this.columnSpan; var3_int++) {
            for (var4 = 0; this.rowSpan > var4; var4++) {
              this.getCell(-118, var3_int, var4).render((byte) 117, param1);
            }
          }
          var6 = (RoomRegion) (this.field_p.first(-80));
          while (var6 != null) {
            var6.render(119, param1);
            var6 = (RoomRegion) (this.field_p.next(107));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("tqa.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final int getRenderZ(byte param0) {
        if (param0 > -86) {
          this.endColumn = -124;
          return 0;
        }
        return 0;
    }

    private final void setTile(int param0, TileGridCell param1, int param2, int param3) {
        int var5_int = 0;
        try {
          if (param3 != 10) {
            field_g = -103;
          }
          var5_int = this.tileIndex((byte) 113, param2, param0);
          this.tiles[var5_int] = param1;
          this.tiles[var5_int].attach(param0, 125, param2, this);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "tqa.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int getColumnCount(int param0) {
        int var2 = -52 / ((-4 - param0) / 62);
        return this.columnCount;
    }

    final void removeOccupancy(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        this.adjustOccupancy(param6, param3, -123, param0, param4, param1, param5, -1);
        if (!param2) {
          this.tiles = (TileGridCell[]) null;
        }
    }

    final int getTileSize(int param0) {
        if (param0 != -30551) {
          this.toCellCoordinate(1, false);
        }
        return this.tileSize;
    }

    final boolean isBoxOccupied(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var15 = 0;
        int var16 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        TileGridCell var17;
        int var18;
        var18 = TombRacer.field_G ? 1 : 0;
        var8 = 1;
        var9 = param5 / 2;
        var10 = param0 / 2;
        if (param3 != 8597) {
          this.firstColumn = -71;
        }
        var11 = this.toCellCoordinate(param4 - var9 + var8, false);
        var12 = this.toCellCoordinate(-var10 + (param1 + var8), false);
        var13 = this.toCellCoordinate(-var8 + (param4 + var9), false);
        var14 = this.toCellCoordinate(-var8 + (param1 + var10), false);
        for (var15 = var11; var13 >= var15; var15++) {
          for (var16 = var12; var14 >= var16; var16++) {
            if (!this.containsCell(var16, (byte) 48, var15)) {
              if (param2) {
                return true;
              }
            } else {
              var17 = this.getCell(-115, var15, var16);
              if (var17.isOccupied(param6, 0)) {
                return true;
              }
            }
          }
        }
        return false;
    }

    final Room getRoom(int param0) {
        if (param0 != 0) {
          field_g = -85;
        }
        return this.room;
    }

    final int toCellCoordinate(int param0, boolean param1) {
        int var3 = 0;
        if (param1) {
          return -102;
        }
        if (param0 < 0) {
          var3 = (param0 + 1 - this.tileSize) / this.tileSize;
        } else {
          var3 = param0 / this.tileSize;
        }
        return var3;
    }

    final void addTilesToScene(RenderScene param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          for (var3_int = param1; var3_int < this.tiles.length; var3_int++) {
            this.tiles[var3_int].addToScene(param0, (byte) 84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("tqa.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void expand(int param0, int param1, int param2) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = TombRacer.field_G ? 1 : 0;
        if (param1 != 2) {
          this.columnSpan = -62;
        }
        TileGridCell[] var4 = this.tiles;
        int var5 = this.columnSpan;
        int var6 = this.rowSpan;
        this.resizeToRoom(param0, this.room, 0);
        int var7 = param2 / param0;
        int var8 = param2 / param0;
        for (var9_int = 0; this.columnSpan > var9_int; var9_int++) {
          for (var10 = 0; this.rowSpan > var10; var10++) {
            var11 = GraphicsHeap.clampValue(0, 113, var5 - 1, var9_int - var7);
            var12 = GraphicsHeap.clampValue(0, 85, -1 + var6, var10 - var8);
            this.getCell(param1 - 115, var9_int, var10).copyTileType(var4[var12 * var5 + var11], 21324);
          }
        }
        RoomRegion var9 = (RoomRegion) (this.field_p.first(-80));
        while (var9 != null) {
          var9.setX(-6492, var9.getX((byte) 124) + param2);
          var9.setY(param1 ^ 2, param2 + var9.getY((byte) -121));
          var9 = (RoomRegion) (this.field_p.next(118));
        }
    }

    private final void adjustOccupancy(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        TileGridCell var18;
        int var19;
        Room var20;
        var19 = TombRacer.field_G ? 1 : 0;
        var9 = -1 + this.tileSize;
        var10 = param6 / 2;
        var11 = param4 / 2;
        if (param1 == 1) {
          var10 = var10 + this.tileSize;
          var11 = var11 + this.tileSize;
        }
        var12 = RandomBrickOperator.max(this.firstColumn, this.toCellCoordinate(-var10 + param0 + var9, false), 2);
        var13 = RandomBrickOperator.max(this.firstRow, this.toCellCoordinate(var9 - var11 + param3, false), 2);
        var14 = MidiVoiceMixer.min(this.toCellCoordinate(-var9 + var10 + param0, false), -1 + this.endColumn, 124);
        var15 = MidiVoiceMixer.min(this.toCellCoordinate(var11 + (param3 - var9), false), this.endRow - 1, 101);
        if (param2 > -104) {
          var20 = (Room) null;
          this.decodeCells((byte) -39, (BitPacketBuffer) null, (Room) null);
        }
        for (var16 = var12; var14 >= var16; var16++) {
          for (var17 = var13; var17 <= var15; var17++) {
            if (this.containsCell(var17, (byte) 48, var16)) {
              var18 = this.getCell(127, var16, var17);
              if (param5 != -1) {
                var18.addOccupancy(param7, param5, true);
              }
              if (param1 != -1) {
                var18.addWideOccupancy((byte) 29, param7);
              }
            }
          }
        }
    }

    final void addOccupancy(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.adjustOccupancy(param3, param0, -110, param5, param1, param4, param2, 1);
        if (!param6) {
          this.field_p = (IntrusiveDeque) null;
        }
    }

    final void resizeToRoom(int param0, Room param1, int param2) {
        try {
          this.resize(param0, param1, param1.getWidth((byte) -86), param1.getHeight(-125), 0);
          int var4_int = 17 / ((-78 - param2) / 43);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "tqa.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final TileGridCell getCellAt(int param0, int param1, byte param2) {
        int var4 = this.toCellCoordinate(param1, false);
        int var5 = this.toCellCoordinate(param0, false);
        if (!this.containsCell(var5, (byte) 48, var4)) {
          return null;
        }
        if (param2 != 119) {
          return (TileGridCell) null;
        }
        return this.getCell(-116, var4, var5);
    }

    final void removeObjectsOutsideVariant(int param0, byte param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        RoomRegion var5 = (RoomRegion) (this.field_p.first(-80));
        while (var5 != null) {
          if (!var5.isInVariant(param0, false)) {
            var5.unlink(56);
          }
          var5 = (RoomRegion) (this.field_p.next(126));
        }
        if (param1 > -11) {
          this.endRow = 14;
        }
    }

    final void encodeCells(int param0, BitPacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RoomRegion var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          for (var3_int = 0; this.rowCount > var3_int; var3_int++) {
            for (var4 = 0; this.columnCount > var4; var4++) {
              this.getCell(-98, var4, var3_int).encode(param1, -78);
            }
          }
          param1.writeBits((byte) -128, this.field_p.size((byte) -16), param0);
          var6 = (RoomRegion) (this.field_p.first(-80));
          while (var6 != null) {
            var6.encode((byte) -128, param1);
            var6 = (RoomRegion) (this.field_p.next(123));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("tqa.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final TileGridCell getCell(int param0, int param1, int param2) {
        int var4 = -107 % ((param0 + 36) / 59);
        return this.tiles[this.tileIndex((byte) 31, param2, param1)];
    }

    TileGrid(Room param0, int param1) {
        this.field_p = new IntrusiveDeque();
        try {
          this.resizeToRoom(param1, param0, 107);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "tqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_o = '/';
        field_g = -1;
        field_k = "You need a rating of <%1> to play with the current options.";
    }
}
