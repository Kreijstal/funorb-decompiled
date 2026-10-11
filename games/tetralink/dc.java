/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc implements kg {
    private int field_h;
    static float field_d;
    private int field_g;
    private int field_a;
    private int field_j;
    private jb field_c;
    static hl field_e;
    static ah field_k;
    private int field_b;
    private int field_f;
    static String field_i;
    static hl field_l;

    public static void b(int param0) {
        field_i = null;
        int var1 = -95 / ((param0 + 9) / 60);
        field_e = null;
        field_l = null;
        field_k = null;
    }

    final static void a(int param0) {
        int var3 = 0;
        int stackIn_20_0 = 0;
        String stackIn_26_0 = null;
        int stackIn_30_0 = 0;
        String stackIn_36_0 = null;
        ve stackIn_47_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ve var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = TetraLink.field_J;
        try {
          if (param0 != 1000) {
            return;
          }
          var1_int = pj.field_e;
          var2 = 0;
          if (f.field_z == 2) {
            var3_long = -tg.field_a + k.a(0);
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; pj.field_h.length > var3; var3++) {
            var4 = ml.field_mb[var3];
            if (0 <= var4) {
              if (gm.field_h.field_b == var4) {
                var5 = mc.field_b;
              } else {
                var5 = lk.field_wb;
              }
            } else {
              var5 = ve.field_b;
            }
            var6 = pj.field_h[var3];
            if (f.field_z == 2 &&
              var2 == 1) {
              if (jl.field_b.length <= fi.field_Ab.length) {
                stackIn_20_0 = fi.field_Ab.length;
              } else {
                stackIn_20_0 = jl.field_b.length;
              }
              var7 = stackIn_20_0;
              if (var3 >= 6 &&
                var3 < 6 + var7) {
                if (-6 + var3 + fi.field_Ab.length - var7 < 0) {
                  stackIn_26_0 = "";
                } else {
                  stackIn_26_0 = fi.field_Ab[-var7 + var3 + (-6 + fi.field_Ab.length)];
                }
                var6 = stackIn_26_0;
              }
              if (qc.field_db.length < ah.field_j.length) {
                stackIn_30_0 = ah.field_j.length;
              } else {
                stackIn_30_0 = qc.field_db.length;
              }
              var8 = stackIn_30_0;
              if (var7 + 7 <= var3 &&
                var3 < var7 + (7 + var8)) {
                if (qc.field_db.length > var3 - (7 + var7)) {
                  stackIn_36_0 = qc.field_db[-var7 - 7 + var3];
                } else {
                  stackIn_36_0 = "";
                }
                var6 = stackIn_36_0;
              }
            }
            if (-2 == var4) {
              var6 = Integer.toString(var2);
            }
            var7Lifetime1 = fi.a(!(var4 < 0), var6, (byte) -75);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + vg.field_Lb;
            if (var4 >= 0) {
              var1_int = var1_int + mn.field_c;
              if (gm.field_h.field_b != var4) {
                stackIn_47_0 = hj.field_e;
              } else {
                stackIn_47_0 = hd.field_t;
              }
              var9 = stackIn_47_0;
              if (var9 != null) {
                var9.a(var1_int, var8Lifetime1 - io.field_a, (byte) -125, (io.field_a << 1) + var7Lifetime1, bj.field_d + (da.field_e << 1));
              }
              var1_int = var1_int + da.field_e;
            }
            if (0 > var4) {
              dk.field_d.b(var6, var8Lifetime1, jj.field_b + var1_int, var5, -1);
              var1_int = var1_int + la.field_e;
            } else {
              cf.field_o.b(var6, var8Lifetime1, rn.field_b + var1_int, var5, -1);
              var1_int = var1_int + (mn.field_c + da.field_e + bj.field_d);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "dc.A(" + param0 + ')');
        }
    }

    dc(jb param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_c = param0;
          this.field_a = param6;
          this.field_f = param2;
          this.field_g = param3;
          this.field_j = param1;
          this.field_h = param5;
          this.field_b = param4;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "dc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static int a(byte param0) {
        if (param0 <= 74) {
          return 13;
        }
        return -lb.field_V + ia.field_K;
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        int var10 = 0;
        na stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        kk var12 = null;
        var11 = TetraLink.field_J;
        try {
          if (param0 instanceof kk) {
            stackIn_4_0 = (na) (param0);
          } else {
            stackIn_4_0 = null;
          }
          var12 = (kk) (stackIn_4_0);
          if (!param3) {
            field_d = -0.23190410435199738f;
          }
          if (var12 != null) {
          }
          ra.c(param1 + param0.field_t, param0.field_w + param2, param0.field_F, param0.field_u, this.field_b);
          var7 = -(var12.field_W * 2) + param0.field_F;
          var8 = param1 - (-param0.field_t - var12.field_W);
          var9 = param2 + param0.field_w + var12.field_V;
          ra.d(var8, var9, var8 + var7, var9, this.field_g);
          for (var10 = var12.e((byte) -116) - 1; 0 <= var10; var10--) {
            ra.f(var7 * var12.a(var10, (byte) 119) / var12.a(23329) + var8, var9, this.field_h, this.field_a);
          }
          if (null == this.field_c) {
            return;
          }
          this.field_c.a(var12.field_A, var7 / 2 + var8, var9 - (-this.field_c.field_H - var12.field_V), this.field_j, this.field_f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("dc.L(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_d = 481.0f;
        field_i = "Drawn";
    }
}
