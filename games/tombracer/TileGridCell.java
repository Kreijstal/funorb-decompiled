/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class TileGridCell {
    private int centerY;
    private int row;
    static String field_a;
    private int column;
    private int centerX;
    private TileRenderable renderable;
    private int wideOccupancy;
    private TileGrid grid;
    int tileType;
    static Sprite[] field_k;
    private int[] layerOccupancy;

    final TileGrid getGrid(int param0) {
        if (param0 != 18641) {
          return (TileGrid) null;
        }
        return this.grid;
    }

    final void render(byte param0, iq param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 <= 104) {
            this.layerOccupancy = (int[]) null;
          }
          if (this.renderable != null) {
            this.renderable.render(113, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pca.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final int getColumn(byte param0) {
        if (param0 <= 48) {
          this.column = -59;
        }
        return this.column;
    }

    final int getCenterX(byte param0) {
        if (param0 != -104) {
          return 95;
        }
        return this.centerX;
    }

    final static boolean hasFlag16(int param0, int param1, int param2) {
        if (param1 < 5) {
          field_k = (Sprite[]) null;
        }
        return 0 != (param2 & 16) ? true : false;
    }

    final void setRenderable(int param0, TileRenderable param1) {
        try {
          this.renderable = param1;
          param1.setCell(30711, this);
          if (param0 != 3) {
            this.getGrid(-124);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pca.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isOccupiedByAny(int param0, int[] param1) {
        int var4 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var7 = param1;
          var3 = var7;
          if (param0 > -110) {
            this.getCenterX((byte) 5);
          }
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (this.isOccupied(var5, 0)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("pca.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 8) {
          field_k = (Sprite[]) null;
        }
        field_a = null;
        field_k = null;
    }

    final boolean isOccupied(int param0, int param1) {
        if (param1 != 0) {
          this.getGrid(21);
        }
        return 0 < this.layerOccupancy[param0] ? true : false;
    }

    final boolean hasWideOccupancy(boolean param0) {
        if (param0) {
          this.getGrid(106);
        }
        return this.wideOccupancy > 0 ? true : false;
    }

    final void encode(BitPacketBuffer param0, int param1) {
        if (param1 > -75) {
          return;
        }
        try {
          param0.writeBits((byte) 92, this.tileType, 8);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pca.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void attach(int param0, int param1, int param2, TileGrid param3) {
        try {
          this.grid = param3;
          this.row = param2;
          this.column = param0;
          this.centerX = param3.getTileSize(-30551) * param0 + param3.getTileSize(-30551) / 2;
          this.centerY = param3.getTileSize(-30551) * param2 + param3.getTileSize(-30551) / 2;
          if (param1 <= 124) {
            this.addOccupancy(-52, 68, true);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pca.T(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void addOccupancy(int param0, int param1, boolean param2) {
        this.layerOccupancy[param1] = this.layerOccupancy[param1] + param0;
        if (!param2) {
          field_a = (String) null;
        }
    }

    final boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          TileGridCell.a(89, (byte) 98);
        }
        stackIn_6_0 = (null != this.renderable) && (this.renderable.c(param0 - 2));
        return stackIn_6_0;
    }

    final Room getRoom(int param0) {
        if (param0 != 0) {
          return (Room) null;
        }
        return this.grid.getRoom(0);
    }

    final void addToScene(RenderScene param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null != this.renderable) {
            param0.addToLayer((byte) -88, 4, this.renderable);
          }
          if (param1 != 84) {
            this.tileType = -37;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pca.U(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void addWideOccupancy(byte param0, int param1) {
        this.wideOccupancy = this.wideOccupancy + param1;
        if (param0 <= 5) {
          this.grid = (TileGrid) null;
        }
    }

    final void e(int param0) {
        if (null != this.renderable) {
          this.renderable.a(true);
        }
        if (param0 != 0) {
          this.tileType = 1;
        }
    }

    final void copyTileType(TileGridCell param0, int param1) {
        try {
          this.tileType = param0.tileType;
          if (param1 != 21324) {
            this.column = -39;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pca.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] a(int param0, byte param1) {
        woa var2;
        byte[] var3;
        Random var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        byte[] var10;
        byte[] var11;
        int var5Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        var2 = (woa) (is.field_xb.a(0, (long)param0));
        if (param1 < 37) {
          return (byte[]) null;
        }
        if (var2 == null) {
          var11 = new byte[512];
          var10 = var11;
          var3 = var10;
          var4 = new Random((long)param0);
          for (var5 = 0; 255 > var5; var5++) {
            var3[var5] = (byte)var5;
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < 255; var5Lifetime1++) {
            var6 = -var5Lifetime1 + 255;
            var7 = BufferedSocket.a(var6, var4, -110);
            var8 = var11[var7];
            var3[var7] = var11[var6];
            var3[-var5Lifetime1 + 511] = (byte) var8;
            var3[var6] = (byte) var8;
          }
          var2 = new woa(var11);
          is.field_xb.a(var2, (byte) 52, (long)param0);
        }
        return var2.field_k;
    }

    final void decode(byte param0, Room param1, BitPacketBuffer param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != 29) {
            return;
          }
          this.tileType = param2.readBits((byte) 44, 8);
          if (param1.formatVersion >= 10 &&
            param1.formatVersion <= 17) {
            param2.readBits((byte) 44, 1);
            param2.readBits((byte) 44, 1);
            if (this.tileType > 5) {
              this.tileType = 1;
            } else {
              this.tileType = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("pca.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final TileRenderable getRenderable(byte param0) {
        if (param0 >= -79) {
          this.getCenterY(true);
        }
        return this.renderable;
    }

    TileGridCell() {
        this.layerOccupancy = new int[3];
    }

    final int getCenterY(boolean param0) {
        if (!param0) {
          return -58;
        }
        return this.centerY;
    }

    final static void a(int param0, int param1, int param2) {
        lu.a(param0, (double)param2, param1 + 26108, param0, (double)param2);
        if (param1 != -26109) {
          TileGridCell.releaseStatics(99);
        }
    }

    final int getRow(int param0) {
        int var2 = -8 / ((param0 - 44) / 50);
        return this.row;
    }

    static {
    }
}
