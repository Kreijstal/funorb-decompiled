/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          if (rk.a(param2, false, param0, param1)) {
            int discarded$2 = 0;
            return ff.b();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ff.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L0;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L0;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + -3 + 41);
        }
    }

    public static void a() {
        field_f = null;
        field_a = null;
        field_h = null;
        field_e = null;
        field_j = null;
        field_c = null;
        int var1 = 58;
        field_b = null;
        field_g = null;
    }

    final static String a(int param0, String param1) {
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        im var7 = null;
        im var8 = null;
        pc var9 = null;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_16_0 = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) (Object) param1;
            if (!ai.a((byte) -126, var10)) {
              stackOut_3_0 = qn.field_n;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (gk.field_db != 2) {
                stackOut_7_0 = qg.field_c;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                int discarded$2 = -1;
                var8 = re.a(param1);
                if (var8 != null) {
                  fa discarded$3 = vp.field_Hb.a((fa) (Object) var8, 1504642273);
                  L1: while (true) {
                    var7 = (im) (Object) vp.field_Hb.f(1504642273);
                    if (var7 != null) {
                      var7.field_Kb = var7.field_Kb - 1;
                      continue L1;
                    } else {
                      var8.c(2779);
                      var8.e(17);
                      f.field_q = f.field_q - 1;
                      var9 = aa.field_f;
                      var9.g(param0, 15514);
                      var9.field_m = var9.field_m + 1;
                      var5 = var9.field_m;
                      var9.e(160, 1);
                      var9.b((byte) -41, param1);
                      var9.f(-var5 + var9.field_m, -1);
                      stackOut_16_0 = null;
                      stackIn_17_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                } else {
                  stackOut_10_0 = sd.a(vl.field_R, 41, new String[1]);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("ff.E(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + -106 + 41);
        }
        return (String) (Object) stackIn_17_0;
    }

    private final static tf[] b() {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Pixelate.field_H ? 1 : 0;
        tf[] var1 = new tf[im.field_Qb];
        for (var2 = 0; var2 < im.field_Qb; var2++) {
            var3 = ge.field_c[var2] * gf.field_g[var2];
            var4 = wo.field_f[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = fl.field_g[cm.a((int) var4[var6], 255)];
            }
            var1[var2] = new tf(tj.field_y, jb.field_a, fa.field_b[var2], e.field_b[var2], gf.field_g[var2], ge.field_c[var2], var5);
        }
        int discarded$0 = 140;
        re.b();
        return var1;
    }

    final static hh[] a(fm param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        hh[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        hh[] stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (rk.a(param1, false, param0, param2)) {
              var4_int = 0;
              int discarded$2 = -96;
              stackOut_3_0 = gb.a();
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ff.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + 18 + 41);
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Unpacking music";
        field_e = "Add <%0> to ignore list";
        field_b = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_c = "<%0> might change the options - wait and see.";
    }
}
