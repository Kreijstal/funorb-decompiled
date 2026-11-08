/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NanoTickClock extends TickClock {
    private int field_m;
    private long field_u;
    private long[] field_w;
    static PlayArea[] field_t;
    private int field_r;
    private long field_v;
    private long field_p;
    static int[] field_q;
    static String field_o;
    static boolean field_n;
    static int field_s;

    final static boolean c(int param0) {
        if (param0 != 2915) {
          NanoTickClock.c((byte) 16);
        }
        return IntrusiveDeque.field_f;
    }

    final static TriangleMesh a(byte param0, CipherPacketBuffer param1) {
        int var7 = 0;
        TriangleMesh stackIn_26_0 = null;
        TriangleMesh stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        TriangleMesh var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = Kickabout.field_G;
        try {
          var2_int = param1.readBits(8, 59);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = ContentTransitionDialog.readBooleanBit(param1, (byte) -39) ? 1 : 0;
          var4 = ContentTransitionDialog.readBooleanBit(param1, (byte) -39) ? 1 : 0;
          var5 = new TriangleMesh();
          var5.field_b = (short)param1.readBits(16, 59);
          var5.field_f = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_f, param1, 16, -72);
          var5.field_r = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_r, param1, 16, -61);
          var5.field_P = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_P, param1, 16, -92);
          var5.field_g = (short)param1.readBits(16, 59);
          var5.field_n = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_n, param1, 16, 105);
          var5.field_z = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_z, param1, 16, 48);
          var5.field_T = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_T, param1, 16, 109);
          if (var3 != 0) {
            var5.field_k = (short)param1.readBits(16, 59);
            var5.field_F = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_F, param1, 16, -66);
            var5.field_I = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_I, param1, 16, 109);
            var5.field_v = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_v, param1, 16, -79);
            var5.field_M = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_M, param1, 16, 116);
            var5.field_U = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_U, param1, 16, -73);
            var5.field_l = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_l, param1, 16, -106);
          }
          if (var4 != 0) {
            param1.readBits(16, 59);
            var5.field_p = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_p, param1, 16, 116);
            var5.field_E = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_E, param1, 16, -104);
            var5.field_N = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_N, param1, 16, -76);
            var5.field_i = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_i, param1, 16, -65);
            var5.field_K = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_K, param1, 16, -87);
          }
          if (ContentTransitionDialog.readBooleanBit(param1, (byte) -39)) {
            var5.field_o = TournamentChampionDialog.readBaseOffsetShortArray(var5.field_o, param1, 16, 106);
          }
          if (ContentTransitionDialog.readBooleanBit(param1, (byte) -39)) {
            var5.field_G = ColumnTableWidget.readPackedByteArray(2280703, param1, var5.field_G, 16);
            var6 = 0;
            for (var7 = 0; var5.field_G.length > var7; var7++) {
              if (var6 < (var5.field_G[var7] & 255)) {
                var6 = 255 & var5.field_G[var7];
              }
            }
            if (var6 != 0) {
              var5.field_u = (byte)(1 + var6);
            } else {
              var5.field_G = null;
            }
          }
          if (param0 > 54) {
            stackIn_28_0 = var5;
            return stackIn_28_0;
          }
          stackIn_26_0 = (TriangleMesh) null;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("vi.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static boolean matchesConfigurationRule(int param0, int param1, int[][] param2, byte[] param3) {
        int var4_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = Kickabout.field_G;
        try {
          if (param1 < 123) {
            NanoTickClock.c((byte) 59);
          }
          if (param2 == null) {
            return false;
          }
          var4_int = 0;
          scanLoop1: while (true) {
            if (var4_int >= param2.length) {
              return false;
            }
            var5 = param2[var4_int];
            var6 = 0;
            while (var6 < var5.length) {
              boolean decompiledFrameRemainder0 = true;
              var7 = var5[var6];
              var8 = var5[1 + var6];
              if (var7 == -1) {
                decompiledFrameRemainder0 = (var8 != param0);
              } else {
                decompiledFrameRemainder0 = (var8 != (255 & param3[var7]));
              }
              if (decompiledFrameRemainder0) {
                var4_int++;
                continue scanLoop1;
              }
              var6 += 2;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("vi.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void c(byte param0) {
        int var1;
        var1 = -1;
        if (param0 != -59) {
          field_t = (PlayArea[]) null;
        }
        if (null != MachineTokenStorageSupport.field_e &&
          MachineTokenStorageSupport.field_e.isTournamentMatch) {
          var1 = MachineTokenStorageSupport.field_e.field_B;
        } else {
          if (null != SortCriterion.field_l) {
            var1 = SortCriterion.field_l.getRoundIndex(123);
          }
        }
        if (-1 == var1) {
          return;
        }
        FootballerAiOverlaySupport.field_d.writeIsaacByte(88, (byte) -46);
        FootballerAiOverlaySupport.field_d.writeByte(127, var1);
        QuickChatPhraseCache.field_d = true;
    }

    final long delayMillis(byte param0) {
        this.field_p = this.field_p + this.averageFrameNanos(false);
        if (param0 != -36) {
          field_n = true;
        }
        if (this.field_p < this.field_v) {
          return (-this.field_p + this.field_v) / 1000000L;
        }
        return 0L;
    }

    final void resetTiming(int param0) {
        this.field_u = 0L;
        if (param0 != -1) {
          field_s = -62;
        }
        if (this.field_v > this.field_p) {
          this.field_p = this.field_p + (-this.field_p + this.field_v);
        }
    }

    private final long averageFrameNanos(boolean param0) {
        int var8 = 0;
        int var9 = Kickabout.field_G;
        long var2 = System.nanoTime();
        long var4 = -this.field_u + var2;
        this.field_u = var2;
        if (var4 > -5000000000L &&
          5000000000L > var4) {
          this.field_w[this.field_m] = var4;
          this.field_m = (this.field_m + 1) % 10;
          if (this.field_r < 1) {
            this.field_r = this.field_r + 1;
          }
        }
        long var6 = 0L;
        if (param0) {
          return -97L;
        }
        for (var8 = 1; this.field_r >= var8; var8++) {
          var6 = var6 + this.field_w[(10 + this.field_m - var8) % 10];
        }
        return var6 / (long)this.field_r;
    }

    public static void releaseStatics(int param0) {
        if (param0 < 4) {
          return;
        }
        field_t = null;
        field_q = null;
        field_o = null;
    }

    final int advanceTicks(int param0, long param1) {
        int var4;
        int var5;
        int var6;
        var6 = Kickabout.field_G;
        var4 = 78 % ((param0 - 45) / 63);
        if (this.field_p < this.field_v) {
          this.field_u = this.field_u + (this.field_v - this.field_p);
          this.field_p = this.field_p + (-this.field_p + this.field_v);
          this.field_v = this.field_v + param1;
          return 1;
        }
        var5 = 0;
        do {
          this.field_v = this.field_v + param1;
          var5++;
        } while (var5 < 10 &&
          this.field_v < this.field_p);
        if (this.field_p > this.field_v) {
          this.field_v = this.field_p;
        }
        return var5;
    }

    NanoTickClock() {
        this.field_u = 0L;
        this.field_m = 0;
        this.field_r = 1;
        this.field_p = 0L;
        this.field_v = 0L;
        this.field_w = new long[10];
        this.field_p = System.nanoTime();
        this.field_v = System.nanoTime();
    }

    static {
        field_q = new int[4];
        field_t = new PlayArea[]{new PlayArea(0, 0, 896, 1344), new PlayArea(370, -45, 525, 1389, 0, 45)};
        field_n = false;
        field_o = "<%0>: Unread Chat";
    }
}
