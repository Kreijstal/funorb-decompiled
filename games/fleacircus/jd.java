/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static int[] field_o;
    ch field_d;
    static String[] field_g;
    int field_f;
    ch field_l;
    int field_c;
    ch field_i;
    static long field_n;
    ch field_h;
    private int field_m;
    fa field_a;
    int field_e;
    private boolean field_s;
    int field_j;
    int field_k;
    static sf field_q;
    int field_r;
    static int field_t;
    int field_b;
    ch field_p;

    final static int a(boolean param0, int param1) {
        if (param0) {
          field_o = (int[]) null;
        }
        return bl.field_g[param1 & 2047];
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        gb.g(param6, param5, param1, param4, param3, param0);
        if (param2) {
          String var9 = (String) null;
          this.a((byte) 19, -104, (String) null, -15);
        }
    }

    private final void a(byte param0, int param1, String param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = this.field_a.b(param2);
          var6 = this.field_a.field_y + this.field_a.field_K;
          if (param0 <= 116) {
            jd.a(true, 96);
          }
          var7 = param1;
          if (gb.field_d < var5_int + var7 + 6) {
            var7 = gb.field_d - var5_int - 6;
          }
          var8 = 32 + param3 - this.field_a.field_y;
          if (gb.field_k < 6 + var6 + var8) {
            var8 = -6 + gb.field_k - var6;
          }
          gb.b(var7, var8, var5_int + 6, var6 + 6, this.field_m);
          gb.e(1 + var7, 1 + var8, 4 + var5_int, var6 + 4, this.field_f);
          this.field_a.c(param2, 3 + var7, this.field_a.field_y + (3 + var8), this.field_m, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("jd.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, String param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != 13421772) {
            return;
          }
          if (this.field_s) {
            this.a(true, param1, param2, param3);
          } else {
            this.a((byte) 120, param1, param2, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("jd.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, String param2, int param3) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        var15 = fleas.field_A ? 1 : 0;
        try {
          var5_int = this.field_r + this.field_c;
          var6 = this.field_e + this.field_j;
          var7 = this.field_k;
          if (var7 == -1) {
            var7 = this.field_a.field_H + this.field_a.field_K;
          }
          var8 = gb.field_d >> 2;
          var9 = this.field_a.b(param2);
          var10 = this.field_a.field_K + this.field_a.field_H;
          var11 = 1;
          if (var8 < var9 ||
            -1 != param2.indexOf("<br>")) {
            if (var8 >= var9) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = var8 + 2 * ((var13 + var9 % var8 - 1) / var13);
            }
            if (null == pc.field_f) {
              pc.field_f = new String[16];
            }
            var11Lifetime1 = this.field_a.a(param2, new int[]{var12}, pc.field_f);
            var9 = 0;
            var10 = var10 + (var11Lifetime1 - 1) * var7;
            for (var13Lifetime2 = 0; var11Lifetime1 > var13Lifetime2; var13Lifetime2++) {
              var14 = this.field_a.b(pc.field_f[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = param1;
          if (var5_int + (var12 + var9) > gb.field_d) {
            var12 = -var5_int + gb.field_d - var9;
          }
          var13Lifetime1 = 32 - this.field_a.field_y + param3;
          if (gb.field_k < var6 + (var13Lifetime1 + var10)) {
            var13Lifetime1 = param3 + (-var10 - var6);
          }
          gb.b(var12, var13Lifetime1, var9 + var5_int, var10 + var6, this.field_b);
          gb.e(1 + var12, var13Lifetime1 + 1, -2 + var9 + var5_int, var10 + var6 - 2, this.field_f);
          this.field_a.a(param2, var12 + this.field_c, this.field_e + var13Lifetime1, var9, var10, this.field_m, -1, 0, 0, var7);
          if (!param0) {
            this.field_i = (ch) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("jd.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_q = null;
        field_g = null;
        field_o = null;
        if (param0 <= 25) {
          jd.a(true, 122);
        }
    }

    final void a(fa param0, boolean param1) {
        e var17 = null;
        hb var4 = null;
        dd[] var5 = null;
        sj var16 = null;
        sj var18 = null;
        int var7_int = 0;
        hb var6 = null;
        hb var7 = null;
        ee discarded$0 = null;
        ib discarded$1 = null;
        hb var8 = null;
        dd[] var9 = null;
        dd[] var10 = null;
        dd dupTemp$2 = null;
        hb var11 = null;
        hb var12 = null;
        dd var13 = null;
        hb var14 = null;
        hb var19 = null;
        int var15 = fleas.field_A ? 1 : 0;
        hb var14Lifetime1;
        hb var14Lifetime2;
        try {
          var17 = new e(param0, 2, 2, 2236962, 1, 1, 1, param0.field_K + param0.field_H + 2);
          var17.field_f = 16777215;
          this.field_i = (ch) ((Object) var17);
          var4 = new hb();
          var17.a(2, var4);
          this.field_r = 3;
          this.field_k = -1;
          this.field_c = 3;
          this.field_j = 3;
          this.field_f = 5592405;
          var4.field_p = 11711154;
          this.field_a = param0;
          this.field_e = 3;
          this.field_b = 15658734;
          var4.field_c = 15658734;
          this.field_m = 15658734;
          var4.a(0, -17562).a(15658734, (byte) -75).a(true, lh.a(7829367, 8947848, (byte) -90, 10066329));
          var4.a(1, -17562).a(true, lh.a(13421772, 11184810, (byte) 66, 10066329));
          var4.a(3, -17562).a(param1, lh.a(10066329, 8947848, (byte) -99, 7829367)).a(param1, 1).c(124, 1);
          var5 = new dd[9];
          var16 = new sj(32, 32);
          var18 = var16;
          for (var7_int = 0; var7_int < var18.field_B.length; var7_int++) {
            var16.field_B[var7_int] = 1077952576;
          }
          var5[4] = (dd) ((Object) var18);
          var4.a(4, -17562).a(true, (byte) -121).a(true, var5);
          var4.a(5, -17562).a(true, ta.a(0, 65793, -2843, 0, 0)).a(true, (byte) -107).a(-1, (byte) -75);
          this.field_p = (ch) ((Object) var4);
          var6 = new hb(var4, true);
          var6.field_i = 0;
          var7 = new hb(var4, true);
          var7.field_i = 0;
          var7.a((byte) 61, bf.a(2885, 8947848));
          var7.a(1, -17562).a(true, bf.a(2885, 11184810)).a(2236962, (byte) -75);
          this.field_d = (ch) ((Object) new lb(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new ee(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new ib(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new hb();
          var17.a(2, var8);
          var8.a(0, -17562).a(param1, lh.a(10066329, 15658734, (byte) -107, 7829367)).a(1118481, (byte) -75).a(-1, 127);
          var8.a(4, -17562).a(true, (byte) -115).a(true, var5);
          this.field_l = (ch) ((Object) var8);
          var9 = new dd[9];
          var10 = new dd[9];
          var9[4] = new dd(2, 1);
          var10[4] = new dd(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.field_B = new int[]{6710886, 7829367};
          var10[4].field_B = new int[]{6710886, 7829367};
          var11 = new hb();
          var12 = new hb();
          var11.a(var9, -44, 0);
          var12.a(var10, -82, 0);
          var13 = new dd(7, 4);
          var13.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new hb(var4, param1);
          var14.a(var13.c(), 0);
          var13.e();
          var14Lifetime1 = new hb(var4, true);
          var14Lifetime1.a(var13.c(), 0);
          var13.e();
          var14Lifetime2 = new hb(var4, true);
          var14Lifetime2.a(var13.c(), 0);
          var13.e();
          var19 = new hb(var4, true);
          var19.a(var13, 0);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "jd.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, int param1, byte param2, wk param3, int param4) {
        try {
          hh.field_b.a(param3, 1000000, -524289, !param0 ? true : false, param1, param4);
          int var5_int = -72 % ((param2 - 58) / 33);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "jd.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 != 4) {
          field_g = (String[]) null;
        }
        gb.d(param5, param2, param1, param3, param4);
    }

    final static mk a(String param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        Object stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        mk stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ui.field_kb == wi.field_f) {
            stackIn_2_0 = null;
            return (mk) (stackIn_2_0);
          }
          if (param1 != 8947848) {
            var3 = (String) null;
            jd.a((String) null, -64);
          }
          if (ui.field_kb == ui.field_ob &&
            param0.equals(li.field_d)) {
            ui.field_kb = ql.field_l;
            stackIn_11_0 = kh.field_a;
            return stackIn_11_0;
          }
          ui.field_kb = wi.field_f;
          li.field_d = param0;
          kh.field_a = null;
          stackIn_9_0 = null;
          return (mk) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("jd.J(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public jd() {
        this.field_s = true;
    }

    static {
        field_g = new String[]{"Many more levels", "Extra achievements", "Fullscreen Mode", "No adverts"};
        field_o = new int[40];
    }
}
