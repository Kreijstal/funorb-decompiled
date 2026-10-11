/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td implements j {
    static String field_i;
    static int field_l;
    private int field_m;
    private int field_p;
    private int field_f;
    private int field_j;
    static String field_n;
    private int field_q;
    static ce field_h;
    private int field_o;
    private int field_a;
    private int field_c;
    private int field_d;
    private mg field_g;
    private int field_k;
    static o[] field_e;
    private int field_b;

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        dj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        da var13 = null;
        jd var14 = null;
        int var15 = 0;
        jd var16 = null;
        int[][] var20 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          var14 = te.field_N;
          var16 = var14;
          var2 = var16.j(255);
          var3 = (dj) (sa.field_n.a((byte) 51));
          while (var3 != null) {
            if (var3.field_i != var2) {
              var3 = (dj) (sa.field_n.b(-44));
              continue;
            }
            break;
          }
          if (var3 == null) {
            je.a(false);
            return;
          }
          var4 = var16.j(255);
          if (0 != var4) {
            var5 = var3.field_h;
            cg.field_a[0] = ne.field_g;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              cg.field_a[var6_int] = var14.h(20);
            }
            ld.c(var5, var4, 42);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              eh.a((byte) 68, var16);
              if (var6_intLifetime1 != 0) {
                sf.a(fh.field_a, false, var6_intLifetime1, vg.field_P, nf.field_S, dk.field_i);
              } else {
                sf.a(fh.field_a, false, var6_intLifetime1, vg.field_P, nf.field_S, dk.field_i);
              }
            }
            ta.b((byte) 105, var5);
            var6 = new String[2][var5];
            var20 = new int[2][var5 * 4];
            var8 = kg.field_c;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = pd.field_e[var9];
              var6[0][var10] = cg.field_a[var11];
              var20[0][var10 * 4] = qg.field_c[var11];
              var20[0][var10 * 4 + 1] = eh.field_a[var11];
              var20[0][2 + 4 * var10] = ld.field_M[var11];
              var20[0][4 * var10 + 3] = ma.field_n[var11];
              if (kj.a(cg.field_a[var11], (byte) -66) &&
                ld.field_M[var11] + eh.field_a[var11] + ma.field_n[var11] == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var15 = 0;
            var10Lifetime1 = var15;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = pd.field_e[var9Lifetime1 + var5];
              var6[1][var15] = cg.field_a[var11Lifetime1];
              var20[1][4 * var15] = qg.field_c[var11Lifetime1];
              var20[1][1 + 4 * var15] = eh.field_a[var11Lifetime1];
              var20[1][2 + 4 * var15] = ld.field_M[var11Lifetime1];
              var20[1][3 + var15 * 4] = ma.field_n[var11Lifetime1];
              if (kj.a(cg.field_a[var11Lifetime1], (byte) -75) &&
                ld.field_M[var11Lifetime1] + eh.field_a[var11Lifetime1] + ma.field_n[var11Lifetime1] == 0) {
                var6[1][var15] = null;
                var15--;
              }
              var15++;
              var9Lifetime1++;
            }
          }
          if (param0 > -125) {
            var13 = (da) null;
            td.a(25, (da) null);
            var3.c(10);
          } else {
            var3.c(10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "td.D(" + param0 + ')');
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        rc stackIn_3_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        tg var11 = null;
        try {
          if (param4 instanceof tg) {
            stackIn_3_0 = (rc) (param4);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (tg) (stackIn_3_0);
          if (var11 != null) {
            param2 = param2 & var11.field_B;
          }
          var7 = 5592405;
          mi.b(param4.field_m + param3, param4.field_j + param1, param4.field_t, param4.field_x, this.field_f);
          if (param2) {
            var7 = 16777215;
          }
          var8 = this.field_c + (param3 + param4.field_m);
          var9 = param1 - (-param4.field_j - this.field_o);
          mi.d(var8, var9, this.field_k, this.field_j, 5592405);
          mi.b(var8, var9, this.field_k, this.field_j, var7);
          if (param0 <= 113) {
            field_e = (o[]) null;
          }
          if (var11.field_F) {
            mi.e(var8, var9, this.field_k + var8, var9 + this.field_j, 1);
            mi.e(this.field_k + var8, var9, var8, this.field_j + var9, 1);
          }
          if (null != this.field_g) {
            var10 = this.field_k + this.field_c + this.field_p;
            this.field_g.a(param4.field_i, param4.field_m + (param3 + var10), param1 + param4.field_j + this.field_m, param4.field_t - this.field_p - var10, param4.field_x - (this.field_p << 1), this.field_q, this.field_a, this.field_b, this.field_d, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("td.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static boolean a(int param0, da param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -3) {
            td.a(-37);
          }
          stackIn_3_0 = param1.b(true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("td.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (param0) {
          field_h = (ce) null;
        }
        field_h = null;
        field_n = null;
        field_e = null;
    }

    td(mg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_d = 1;
        this.field_b = 1;
        try {
          this.field_c = param5;
          this.field_j = param7;
          this.field_a = param4;
          this.field_f = param9;
          this.field_k = param8;
          this.field_m = param2;
          this.field_o = param6;
          this.field_q = param3;
          this.field_p = param1;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_l = 256;
        field_n = "Names cannot contain consecutive spaces";
    }
}
