/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    int field_c;
    int field_C;
    pf field_y;
    pf field_x;
    pf field_g;
    pf field_r;
    int field_p;
    int field_s;
    dj field_q;
    static boolean field_n;
    pf field_u;
    static ql field_f;
    int field_k;
    pf field_l;
    static int field_t;
    int field_d;
    private int field_v;
    int field_z;
    pf field_b;
    private boolean field_i;
    int field_e;
    static String field_A;
    static String field_o;
    static String field_h;
    int field_w;
    int field_j;
    static String field_m;
    static vn field_a;

    final static String a(int param0, int param1, CharSequence[] param2, boolean param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 == 0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (param0 == 1) {
            var10 = param2[param1];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_10_0 = "null";
            return stackIn_10_0;
          }
          var4_int = param1 + param0;
          var5 = 0;
          if (!param3) {
            field_o = (String) null;
          }
          for (var6_int = param1; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param2[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param1; var4_int > var7; var7++) {
            var8 = param2[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_26_0 = var6.toString();
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("vh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(String param0, byte param1, int param2, int param3) {
        try {
          if (this.field_i) {
            this.b(param2, 106, param0, param3);
          } else {
            this.a(-1, param3, param0, param2);
          }
          int var5_int = 115 % ((8 - param1) / 44);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vh.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        da.a(param1, param0, 126, param4, param3);
        if (param2 != 3) {
          this.a(35, 119, -25, 90, 75, 85, 23);
        }
    }

    private final void a(int param0, int param1, String param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = this.field_q.b(param2);
          var6 = this.field_q.field_o + this.field_q.field_m;
          var7 = param1;
          if (de.field_e < var5_int + (var7 + 6)) {
            var7 = -6 + (de.field_e - var5_int);
          }
          var8 = -this.field_q.field_o + (param3 + 32);
          if (!(de.field_j >= var6 + (var8 + 6))) {
            var8 = -6 + (-var6 + de.field_j);
          }
          de.a(var7, var8, var5_int + 6, var6 + 6, this.field_v);
          de.d(var7 + 1, var8 + 1, var5_int + 4, 4 + var6, this.field_c);
          this.field_q.a(param2, var7 + 3, 3 + (var8 + this.field_q.field_o), this.field_v, param0);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vh.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void b(int param0, int param1, String param2, int param3) {
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
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = this.field_s + this.field_w;
          var6 = this.field_k + this.field_e;
          var7 = this.field_d;
          if (param1 < 81) {
            return;
          }
          if (var7 == -1) {
            var7 = this.field_q.field_C + this.field_q.field_m;
          }
          var8 = de.field_e >> 2;
          var9 = this.field_q.b(param2);
          var10 = this.field_q.field_m + this.field_q.field_C;
          var11 = 1;
          if (var9 > var8 ||
            param2.indexOf("<br>") != -1) {
            if (var8 >= var9) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = var8 + (-1 + (var13 + var9 % var8)) / var13 * 2;
            }
            if (oj.field_f == null) {
              oj.field_f = new String[16];
            }
            var11Lifetime1 = this.field_q.a(param2, new int[]{var12}, oj.field_f);
            var9 = 0;
            var10 = var10 + (var11Lifetime1 - 1) * var7;
            for (var13Lifetime2 = 0; var13Lifetime2 < var11Lifetime1; var13Lifetime2++) {
              var14 = this.field_q.b(oj.field_f[var13Lifetime2]);
              if (var14 > var9) {
                var9 = var14;
              }
            }
          }
          var12 = param3;
          if (de.field_e < var5_int + (var9 + var12)) {
            var12 = -var9 + (de.field_e - var5_int);
          }
          var13Lifetime1 = 32 + (param0 - this.field_q.field_o);
          if (de.field_j < var10 + var13Lifetime1 + var6) {
            var13Lifetime1 = -var6 + (-var10 + param0);
          }
          de.a(var12, var13Lifetime1, var9 + var5_int, var6 + var10, this.field_C);
          de.d(var12 + 1, 1 + var13Lifetime1, var9 + (var5_int - 2), -2 + var10 + var6, this.field_c);
          this.field_q.a(param2, this.field_w + var12, this.field_e + var13Lifetime1, var9, var10, this.field_v, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("vh.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        de.b(param1, param4, param0, param2, param3);
        if (param5 <= 48) {
          vh.b(127);
        }
    }

    final void a(byte param0, dj param1) {
        int var7_int = 0;
        mj var14 = null;
        mj var19 = null;
        int var15 = ArcanistsMulti.field_G ? 1 : 0;
        jm var17 = new jm(param1, 2, 2, 2236962, 1, 1, 1, 2 + (param1.field_m + param1.field_C));
        mj var14Lifetime1;
        mj var14Lifetime2;
        this.field_r = (pf) ((Object) var17);
        var17.field_k = 16777215;
        mj var4 = new mj();
        var17.a(var4, 1881);
        this.field_s = 3;
        this.field_w = 3;
        this.field_k = 3;
        var4.field_o = 15658734;
        this.field_c = 5592405;
        this.field_q = param1;
        this.field_v = 15658734;
        this.field_e = 3;
        this.field_d = -1;
        var4.field_e = 11711154;
        this.field_C = 15658734;
        var4.a((byte) -37, 0).b(0, 15658734).a((byte) -71, ff.a((byte) 109, 7829367, 10066329, 8947848));
        var4.a((byte) -121, 1).a((byte) -71, ff.a((byte) 35, 13421772, 10066329, 11184810));
        var4.a((byte) -68, 3).a((byte) -71, ff.a((byte) 53, 10066329, 7829367, 8947848)).c(-1, 1).a(1, (byte) 120);
        qb[] var5 = new qb[9];
        od var16 = new od(32, 32);
        od var18 = var16;
        for (var7_int = 0; var7_int < var18.field_A.length; var7_int++) {
          var16.field_A[var7_int] = 1077952576;
        }
        var5[4] = (qb) ((Object) var18);
        var4.a((byte) -62, 4).a(true, -5859).a((byte) -71, var5);
        var4.a((byte) -113, 5).a((byte) -71, le.a(0, 0, 1, 0, 65793)).a(true, -5859).b(0, -1);
        this.field_u = (pf) ((Object) var4);
        mj var6 = new mj(var4, true);
        var6.field_i = 0;
        mj var7 = new mj(var4, true);
        var7.field_i = 0;
        var7.a(q.a(8947848, 0), -23165);
        var7.a((byte) -28, 1).a((byte) -71, q.a(11184810, 0)).b(0, 2236962);
        this.field_b = (pf) ((Object) new si(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
        of discarded$0 = new of(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        lh discarded$1 = new lh(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        mj var8 = new mj();
        var17.a(var8, 1881);
        var8.a((byte) -25, 0).a((byte) -71, ff.a((byte) 104, 10066329, 7829367, 15658734)).b(0, 1118481).a(125, -1);
        var8.a((byte) -100, 4).a(true, -5859).a((byte) -71, var5);
        this.field_l = (pf) ((Object) var8);
        qb[] var9 = new qb[9];
        qb[] var10 = new qb[9];
        var9[4] = new qb(2, 1);
        var10[4] = new qb(1, 2);
        qb dupTemp$2 = var9[4];
        dupTemp$2.field_A = new int[]{6710886, 7829367};
        var10[4].field_A = new int[]{6710886, 7829367};
        mj var11 = new mj();
        mj var12 = new mj();
        var11.a((byte) -122, 0, var9);
        var12.a((byte) 123, 0, var10);
        this.field_x = (pf) ((Object) var12);
        this.field_g = (pf) ((Object) var4);
        qb var13 = new qb(7, 4);
        var13.field_A = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        this.field_p = 10;
        if (param0 > -62) {
          return;
        }
        try {
          var14 = new mj(var4, true);
          var14.a(0, var13.g());
          var13.c();
          var14Lifetime1 = new mj(var4, true);
          var14Lifetime1.a(0, var13.g());
          var13.c();
          var14Lifetime2 = new mj(var4, true);
          var14Lifetime2.a(0, var13.g());
          var13.c();
          var19 = new mj(var4, true);
          var19.a(0, var13);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_o = null;
        field_f = null;
        field_A = null;
        field_h = null;
        int var1 = -118 % ((44 - param0) / 63);
        field_a = null;
    }

    final static int a(boolean param0, byte param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 1) {
            stackIn_2_0 = 72;
            return stackIn_2_0;
          }
          if (!param0) {
            stackIn_7_0 = mg.field_C.b(param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = ko.field_j.b(param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("vh.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static java.awt.Frame a(int param0, dl param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_38_0 = null;
        java.awt.Frame stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        uj[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        uj[] var10 = null;
        og var11 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param4 != 10) {
            field_m = (String) null;
          }
          if (!param1.a((byte) 46)) {
            stackIn_5_0 = null;
            return (java.awt.Frame) (stackIn_5_0);
          }
          if (0 == param5) {
            var10 = aa.a(param1, (byte) 109);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (param2 == var10[var8].field_g &&
                var10[var8].field_e == param3 && ((param0 == 0 ||
                param0 == var10[var8].field_d) &&
                (var7_int == 0 ||
                !(param5 >= var10[var8].field_a)))) {
                param5 = var10[var8].field_a;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              stackIn_29_0 = null;
              return (java.awt.Frame) (stackIn_29_0);
            }
          }
          var11 = param1.a(param2, param5, param4 ^ 122, param3, param0);
          while (var11.field_e == 0) {
            ao.a(10L, param4 ^ 11);
          }
          var7 = (java.awt.Frame) (var11.field_g);
          if (var7 == null) {
            return null;
          }
          if (2 != var11.field_e) {
            stackIn_40_0 = var7;
            return stackIn_40_0;
          }
          fh.a(100, param1, var7);
          stackIn_38_0 = null;
          return (java.awt.Frame) (stackIn_38_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_43_0 = var6_ref;
          stackIn_43_1 = new StringBuilder().append("vh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0) {
        oo.c(-15405);
        if (param0 <= 86) {
          String var3 = (String) null;
          this.a((String) null, (byte) -95, 123, -107);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param5 != 1) {
          return;
        }
        de.e(param6, param1, param3, param0, param2, param4);
    }

    public vh() {
        this.field_i = true;
    }

    static {
        field_n = false;
        field_f = new ql("");
        field_h = "Purchasing a prestige hat will cause you to lose ALL the current wands and spells that you have purchased. Are you sure you wish to do this? If you are certain, hold '<col=ffffff>CTRL</col>' and click the mouse.";
        field_m = "This is your RuneScape clan if you have one.";
    }
}
