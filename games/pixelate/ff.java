/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static String field_f;
    static int field_i;
    static long field_d;
    static ak field_j;
    static ak field_g;
    static ak field_h;
    static String field_e;
    static String field_c;
    static String field_b;
    static ak field_a;

    final static tf[] a(fm param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        tf[] stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == -3) {
              if (rk.a(param2, false, param0, param1)) {
                return ff.b(0);
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (tf[]) null;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ff.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_2_0;
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_h = null;
        field_e = null;
        field_j = null;
        field_c = null;
        int var1 = -117 / ((param0 - 51) / 43);
        field_b = null;
        field_g = null;
    }

    final static String a(int param0, String param1, byte param2) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        im var7 = null;
        im var8 = null;
        pc var9 = null;
        CharSequence var10 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param1);
            if (!ai.a((byte) -126, var10)) {
              stackIn_4_0 = qn.field_n;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-3 != (gk.field_db ^ -1)) {
                stackIn_8_0 = qg.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var8 = re.a(param1, -1);
                if (var8 != null) {
                  vp.field_Hb.a(var8, param2 + 1504642379);
                  L1: while (true) {
                    var7 = (im) ((Object) vp.field_Hb.f(param2 ^ -1504642185));
                    if (var7 != null) {
                      var7.field_Kb = var7.field_Kb - 1;
                      continue L1;
                    } else {
                      L2: {
                        var8.c(2779);
                        var8.e(17);
                        if (param2 == -106) {
                          break L2;
                        } else {
                          field_d = -123L;
                          break L2;
                        }
                      }
                      f.field_q = f.field_q - 1;
                      var9 = aa.field_f;
                      var9.g(param0, 15514);
                      var9.field_m = var9.field_m + 1;
                      var5 = var9.field_m;
                      var9.e(160, 1);
                      var9.b((byte) -41, param1);
                      var9.f(-var5 + var9.field_m, -1);
                      stackIn_19_0 = null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } else {
                  stackIn_11_0 = sd.a(vl.field_R, 41, new String[]{param1});
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("ff.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return (String) ((Object) stackIn_19_0);
            }
          }
        }
    }

    private final static tf[] b(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Pixelate.field_H ? 1 : 0;
        tf[] var1 = new tf[im.field_Qb];
        for (var2 = param0; var2 < im.field_Qb; var2++) {
            var3 = ge.field_c[var2] * gf.field_g[var2];
            var4 = wo.field_f[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = fl.field_g[cm.a((int) var4[var6], 255)];
            }
            var1[var2] = new tf(tj.field_y, jb.field_a, fa.field_b[var2], e.field_b[var2], gf.field_g[var2], ge.field_c[var2], var5);
        }
        re.b(140);
        return var1;
    }

    final static hh[] a(fm param0, int param1, int param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        hh[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (rk.a(param1, false, param0, param2)) {
              var4_int = 101 % ((-49 - param3) / 52);
              stackIn_4_0 = gb.a((byte) -96);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ff.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    static {
        field_f = "Unpacking music";
        field_e = "Add <%0> to ignore list";
        field_b = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_c = "<%0> might change the options - wait and see.";
    }
}
