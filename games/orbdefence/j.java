/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static ki field_b;
    int field_a;
    int field_d;
    static int field_e;
    static String field_c;

    final static void a(byte param0) {
        int var3 = 0;
        int stackIn_21_0 = 0;
        String stackIn_27_0 = null;
        int stackIn_31_0 = 0;
        String stackIn_36_0 = null;
        pf stackIn_46_0 = null;
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
        pf var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          var1_int = sd.field_h;
          if (param0 >= -8) {
            field_b = (ki) null;
          }
          var2 = 0;
          if (kg.field_m == 2) {
            var3_long = ji.b(-90) - am.field_a;
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (0 > var2) {
              var2 = 0;
            }
          }
          for (var3 = 0; ea.field_d.length > var3; var3++) {
            var4 = dd.field_B[var3];
            if (0 > var4) {
              var5 = he.field_C;
            } else {
              if (ab.field_j.field_h == var4) {
                var5 = lf.field_e;
              } else {
                var5 = mf.field_c;
              }
            }
            var6 = ea.field_d[var3];
            if (kg.field_m == 2 &&
              1 == var2) {
              if (pj.field_o.length < fd.field_e.length) {
                stackIn_21_0 = fd.field_e.length;
              } else {
                stackIn_21_0 = pj.field_o.length;
              }
              var7 = stackIn_21_0;
              if (var3 >= 6 &&
                var3 < 6 + var7) {
                if (pj.field_o.length + (-6 + var3 - var7) < 0) {
                  stackIn_27_0 = "";
                } else {
                  stackIn_27_0 = pj.field_o[-var7 + pj.field_o.length - 6 + var3];
                }
                var6 = stackIn_27_0;
              }
              if (bc.field_t.length < sj.field_u.length) {
                stackIn_31_0 = sj.field_u.length;
              } else {
                stackIn_31_0 = bc.field_t.length;
              }
              var8 = stackIn_31_0;
              if (var7 + 7 <= var3 &&
                var3 < var8 + 7 + var7) {
                if (bc.field_t.length > -7 + var3 - var7) {
                  stackIn_36_0 = bc.field_t[-var7 + (var3 - 7)];
                } else {
                  stackIn_36_0 = "";
                }
                var6 = stackIn_36_0;
              }
            }
            if (-2 == var4) {
              var6 = Integer.toString(var2);
            }
            var7Lifetime1 = hg.a(!(var4 < 0), var6, 0);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + fd.field_c;
            if (0 <= var4) {
              if (var4 == ab.field_j.field_h) {
                stackIn_46_0 = lc.field_v;
              } else {
                stackIn_46_0 = gj.field_g;
              }
              var9 = stackIn_46_0;
              var1_int = var1_int + gg.field_N;
              if (var9 != null) {
                var9.a(-123, -mj.field_f + var8Lifetime1, el.field_D + (ol.field_b << 1), var1_int, var7Lifetime1 + (mj.field_f << 1));
              }
              var1_int = var1_int + ol.field_b;
            }
            if (var4 >= 0) {
              ck.field_g.b(var6, var8Lifetime1, vl.field_f + var1_int, var5, -1);
              var1_int = var1_int + (ol.field_b - (-gg.field_N - el.field_D));
            } else {
              jd.field_a.b(var6, var8Lifetime1, var1_int + fe.field_c, var5, -1);
              var1_int = var1_int + d.field_j;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "j.C(" + param0 + ')');
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void a(int param0) {
        if (param0 > -97) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(float param0, String param1, byte param2) {
        try {
          q.field_b = param0;
          tl.field_e = param1;
          if (param2 < 104) {
            j.a((byte) 124);
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "j.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    j(int param0, int param1, int[] param2) {
        try {
          this.field_a = param0;
          this.field_d = param1;
          param2[this.field_a] = param1;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "j.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "That name is not available";
    }
}
