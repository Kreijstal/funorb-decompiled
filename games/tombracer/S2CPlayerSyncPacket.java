/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class S2CPlayerSyncPacket implements GamePacket {
    static String field_e;
    private int[] field_a;
    private int field_c;
    static String field_f;
    private boolean[] field_g;
    private int[] field_b;
    static int[] field_d;

    public final void decode(BitPacketBuffer param0, byte param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != -19) {
            BitPacketBuffer var5 = (BitPacketBuffer) null;
            this.encode(-28, (BitPacketBuffer) null);
          }
          param0.beginBitAccess((byte) -89);
          for (var3_int = 0; var3_int < this.field_c; var3_int++) {
            this.field_g[var3_int] = param0.readBits((byte) 44, 1) == 1 ? true : false;
            if (!this.field_g[var3_int]) {
              this.field_b[var3_int] = param0.readBits((byte) 44, 3);
              this.field_a[var3_int] = param0.readBits((byte) 44, 32);
            } else {
              this.field_b[var3_int] = -1;
              this.field_a[var3_int] = 0;
            }
          }
          param0.endBitAccess((byte) 98);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void apply(MatchScreen param0, MatchProtocol param1, byte param2) {
        int stackIn_11_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var4_intLifetime1;
        int var4_intLifetime2;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          for (var4_int = 0; this.field_c > var4_int; var4_int++) {
            param0.matchState.standings.positions[var4_int] = -1;
            param0.matchState.standings.order[var4_int] = -1;
          }
          for (var4_intLifetime1 = 0; var4_intLifetime1 < this.field_c; var4_intLifetime1++) {
            if (!this.field_g[var4_intLifetime1]) {
              param0.matchState.standings.positions[var4_intLifetime1] = this.field_b[var4_intLifetime1];
              param0.matchState.standings.order[this.field_b[var4_intLifetime1]] = var4_intLifetime1;
              if (this.field_a[var4_intLifetime1] == 0) {
                param0.matchState.simulations[var4_intLifetime1].setFinished(94, false);
              } else {
                stackIn_11_0 = (param0.matchState.simulations[var4_intLifetime1].isFinished(0)) ? 0 : 1;
                var5 = stackIn_11_0;
                param0.matchState.simulations[var4_intLifetime1].setFinished(84, true);
                param0.matchState.simulations[var4_intLifetime1].tick = this.field_a[var4_intLifetime1];
                if (var5 != 0) {
                  param0.announceCourseResult(98, var4_intLifetime1);
                }
              }
            }
          }
          var4_intLifetime2 = 125 % ((57 - param2) / 55);
          if (param0.matchState.field_K == 0) {
            param0.showRewardChoice(-1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("uj.D(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_f = null;
        field_e = null;
        int var1 = -113 / ((param0 - 0) / 40);
        field_d = null;
    }

    public final void encode(int param0, BitPacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          param1.beginBitWrite(param0 ^ 192);
          for (var3_int = 0; var3_int < this.field_c; var3_int++) {
            if (this.field_g[var3_int]) {
              param1.writeBits((byte) -127, 1, 1);
            } else {
              param1.writeBits((byte) -126, 0, 1);
              param1.writeBits((byte) 92, this.field_b[var3_int], 3);
              param1.writeBits((byte) -126, this.field_a[var3_int], 32);
            }
          }
          param1.endBitWrite(-1826190686);
          if (param0 != 200) {
            this.field_a = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("uj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static IndexedSprite[] createDecodedIndexedSprites(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        IndexedSprite[] var1 = new IndexedSprite[fa.field_b];
        for (var2 = param0; fa.field_b > var2; var2++) {
          var1[var2] = new IndexedSprite(ika.field_a, OpenGlRenderbuffer.field_s, LoadLevelCommand.field_p[var2], pg.field_C[var2], mq.field_b[var2], ImageProducerCanvasImageBuffer.field_m[var2], ck.field_c[var2], mga.field_g);
        }
        MazeGenerator.a((byte) 106);
        return var1;
    }

    final static String a(byte param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 104) {
            S2CPlayerSyncPacket.createDecodedIndexedSprites(-27);
          }
          stackIn_3_0 = HorizontalGradientOperator.joinRange(125, param1, 0, param1.length);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("uj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    S2CPlayerSyncPacket(int param0) {
        this.field_g = new boolean[param0];
        this.field_b = new int[param0];
        this.field_c = param0;
        this.field_a = new int[param0];
    }

    static {
        field_e = "Revolver";
        field_f = "You've collected a skeleton key. Walk into the lock to open it, or drop the key using <img=8><img=9>";
        field_d = new int[]{0, 28};
    }
}
