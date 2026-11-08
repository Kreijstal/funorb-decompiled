/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends SceneWidget {
    static co field_Gb;
    static String field_Bb;
    SceneWidget field_Eb;
    static String field_Ib;
    static String field_Hb;
    SceneScrollPane field_Db;
    SceneWidget field_Jb;
    SceneWidget field_Lb;
    static ResourceArchive field_Fb;
    static double field_Cb;
    static int field_Kb;

    hb(long param0, SceneWidget param1, SceneWidget param2, SceneScrollbar param3, SceneWidget param4, String param5, String param6) {
        super(param0, param1);
        try {
          this.field_Eb = new SceneWidget(0L, (SceneWidget) null);
          this.field_Db = new SceneScrollPane(0L, this.field_Eb, param2, param3);
          this.field_Jb = new SceneWidget(0L, param4);
          this.field_Lb = new SceneWidget(0L, param4);
          this.field_Jb.field_rb = param5;
          this.field_Lb.field_rb = param6;
          this.addChild(this.field_Db, 84);
          this.addChild(this.field_Jb, 38);
          this.addChild(this.field_Lb, 31);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "hb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] decompressContainer(boolean param0, byte[] param1) {
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        PacketBuffer var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new PacketBuffer(param1);
          var3 = var9.readUnsignedByte((byte) 73);
          if (param0) {
            hb.releaseStatics(127);
          }
          var4 = var9.readInt(-10674);
          if (var4 >= 0 && (ub.field_a == 0 ||
            !(ub.field_a < var4))) {
            if (var3 == 0) {
              var12 = new byte[var4];
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.readBytes((byte) 114, 0, var12, var4);
              stackIn_9_0 = var5_ref_byte__;
              return stackIn_9_0;
            }
            var5 = var9.readInt(-10674);
            if (var5 >= 0 && (ub.field_a == 0 ||
              !(var5 > ub.field_a))) {
              var13 = new byte[var5];
              var11 = var13;
              var6 = var11;
              if (var3 != 1) {
                var7 = wj.field_a;
                synchronized (var7) {
                  wj.field_a.decompress(122, var13, var9);
                }
              } else {
                Bzip2Decoder.decompress(var13, var5, param1, var4, 9);
              }
              stackIn_23_0 = var6;
              return stackIn_23_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("hb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void layoutColumns(int param0, int param1, int param2, boolean param3) {
        int var5 = (param0 + this.field_x) / 2;
        int var6 = this.field_I - param1;
        this.field_Db.setBoundsAndLayout(0, param2, this.field_x, param3, 0, -param0 + var6, param0);
        this.field_Jb.field_T = 0;
        this.field_Jb.field_db = var6;
        this.field_Jb.field_x = -param0 + var5;
        this.field_Jb.field_I = param1;
        this.field_Lb.field_T = var5;
        this.field_Lb.field_db = var6;
        this.field_Lb.field_I = param1;
        this.field_Lb.field_x = -var5 + this.field_x;
    }

    final static void sendStatsReport(cm param0, int param1, byte param2) {
        CipherPacketBuffer var6 = null;
        int var4 = 0;
        try {
          var6 = he.field_e;
          var6.writeOpcode((byte) -123, param1);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte(1, (byte) -21);
          var6.writeByte(param0.field_g, (byte) -80);
          var6.writeByte(param0.field_i, (byte) -7);
          int var5 = 1 / ((22 - param2) / 57);
          var6.writeInt(param0.field_m, (byte) -101);
          var6.writeInt(param0.field_n, (byte) -101);
          var6.writeInt(param0.field_o, (byte) -101);
          var6.writeInt(param0.field_k, (byte) -101);
          var6.appendCrc32(true, var4);
          var6.writeByteLengthAtMark(-var4 + var6.position, (byte) 43);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "hb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void resetLobbyState(byte param0) {
        IntrusiveNodeHashTable.field_p = -1;
        cb.field_c = null;
        ReflectionCheckRequest.field_i = false;
        int var1 = 57 / ((param0 + 19) / 41);
        DelegatingCanvas.field_f = 0;
        ProxySocketConnector.field_p = -1;
    }

    final void setBoundsAndLayout(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_T = param5;
        this.field_db = param4;
        this.field_I = param2;
        this.field_x = param3;
        if (param6 == -16624) {
          this.layoutColumns(param1, param0, param7, false);
          return;
        }
        cm var10 = (cm) null;
        hb.sendStatsReport((cm) null, -57, (byte) -106);
        this.layoutColumns(param1, param0, param7, false);
    }

    hb(long param0, hb param1, String param2, String param3) {
        this(param0, param1, param1.field_Db.field_Hb, param1.field_Db.field_Eb, param1.field_Jb, param2, param3);
    }

    public static void releaseStatics(int param0) {
        field_Ib = null;
        field_Gb = null;
        if (param0 != 0) {
          return;
        }
        field_Hb = null;
        field_Fb = null;
        field_Bb = null;
    }

    static {
        field_Bb = "Name";
        field_Hb = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_Cb = 0.0;
        field_Ib = "All games";
        field_Kb = 2;
    }
}
