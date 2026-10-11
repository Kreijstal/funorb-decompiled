/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends jj {
    static String field_r;
    static String field_t;
    static boolean field_o;
    static String field_n;
    private lp[] field_p;
    private int field_s;
    static String field_m;
    static boolean field_q;
    static tf field_u;

    private final void a(int param0, int param1) {
        param0 = (16711935 - (param0 & 16711935) & 133695482) >> 3 | (65280 - (65280 & param0) & 522245) >> 3;
        int var3 = (16711680 & param0) >> 16;
        int var4 = (param0 & 65280) >> 8;
        if (0 == var4) {
          var4 = 1;
        }
        if (var3 == param1) {
          var3 = 1;
        }
        int var5 = param0 & 255;
        if (0 == var5) {
          var5 = 1;
        }
        uj.field_Ob = -param0;
        int var6 = this.a(255 / var4, 255 / var3, 255 / var5, param1 + 3);
        od.field_Gb = var6 * uj.field_Ob + 16777215;
        pl.field_O = 3 * uj.field_Ob + 16777215;
    }

    final void a(boolean param0) {
        int incrementValue$2 = 0;
        int var4 = 0;
        int var3 = 0;
        int discarded$1 = 0;
        int var2;
        lp[] var3_ref_lp__;
        lp var5;
        int var6;
        var6 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        while (var2 < 307200) {
          incrementValue$2 = var2;
          var2++;
          t.field_k[incrementValue$2] = 16777215;
        }
        var3_ref_lp__ = this.field_p;
        for (var4 = 0; var4 < var3_ref_lp__.length; var4++) {
          var5 = var3_ref_lp__[var4];
          var5.a();
        }
        for (var3 = 0; var3 < t.field_k.length; var3++) {
          if (pl.field_O < t.field_k[var3]) {
            t.field_k[var3] = 16777215;
          } else {
            if (od.field_Gb > t.field_k[var3]) {
              t.field_k[var3] = od.field_Gb;
            }
          }
        }
        if (param0) {
          discarded$1 = this.a(-32, -63, -42, -97);
        }
    }

    final static short[] a(short[] param0, byte param1, pc param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_10_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          var4_int = param2.c(param3, (byte) -34);
          if (0 == var4_int) {
            return null;
          }
          if (param0 == null ||
            param0.length != var4_int) {
            param0 = new short[var4_int];
          }
          if (param1 > -127) {
            stackIn_10_0 = (short[]) null;
            return stackIn_10_0;
          }
          var5 = param2.c(4, (byte) -34);
          var6 = (short)param2.c(16, (byte) -34);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (short)(param2.c(var5, (byte) -34) + var6);
            }
          }
          stackIn_19_0 = (short[]) (param0);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("bm.B(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2, int param3) {
        if (param1 < param0 &&
          param1 < param2) {
          return param1;
        }
        if (param3 != 3) {
          return 32;
        }
        return param0 < param2 ? param0 : param2;
    }

    public static void d(int param0) {
        field_u = null;
        field_r = null;
        if (param0 != 0) {
          field_t = (String) null;
        }
        field_t = null;
        field_n = null;
        field_m = null;
    }

    bm(String param0, tf[] param1) {
        super(param0, param1);
        int var3_int = 0;
        this.field_s = 0;
        try {
          this.field_p = new lp[500];
          for (var3_int = 0; this.field_p.length > var3_int; var3_int++) {
            this.field_p[var3_int] = new lp();
          }
          this.a(this.field_s, 0);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        int var3 = 0;
        lp var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        super.c(param0);
        lp[] var6 = this.field_p;
        lp[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.b(-126);
        }
        int fieldTemp$0 = this.field_s + 1;
        this.field_s = this.field_s + 1;
        if (fieldTemp$0 >= am.field_i.length) {
          this.field_s = 0;
        }
        this.a(am.field_i[this.field_s], 0);
    }

    static {
        field_r = "Please remove <%0> from your ignore list first.";
        field_t = "Set up new game";
        field_n = "Loading sound effects";
        field_m = "Show all game chat";
    }
}
