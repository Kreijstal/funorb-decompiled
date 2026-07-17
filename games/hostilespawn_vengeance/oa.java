/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static String field_j;
    static bd[] field_m;
    static wm field_b;
    static int[] field_c;
    static nd field_g;
    static String field_h;
    static je field_k;
    static int field_f;
    static bd field_i;
    static p field_d;
    static int field_a;
    static kk field_l;
    static bd field_e;

    public static void a() {
        field_d = null;
        field_i = null;
        field_c = null;
        field_j = null;
        field_m = null;
        field_e = null;
        field_b = null;
        field_l = null;
        field_g = null;
        field_k = null;
        field_h = null;
    }

    final static void a(int param0, int param1, p param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var6 = param3 << 2;
            var7 = param1 << 2;
            var12 = param2.field_c;
            var14 = 25.0;
            var16 = var12 * 3.141592653589793 / 128.0;
            var18 = Math.sin(var16) * -var14;
            var20 = Math.cos(var16) * -var14;
            var4_int = (int)(-var18 + (double)var6);
            var8 = 8;
            var10 = 1;
            var5 = (int)(-var20 + (double)var7);
            var11 = 1;
            var9 = 16;
            var22 = 200 * (-param2.field_e + 32) / 32;
            km.a((byte) var10, var7, var5, ni.field_c, var9, var6, (byte) var11, 100, var4_int, var22, var8);
            var23 = (int)((double)var8 / 1.3);
            var24 = (int)((double)var9 / 1.3);
            int discarded$1 = 9233;
            bh.a((byte) var10, HostileSpawn.field_E, (byte) var11, var23, var4_int, var5, var7, var24, var22, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("oa.C(").append(-17652).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param3 + 41);
        }
    }

    final static jd a(int[] param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int param8) {
        jd var9 = null;
        RuntimeException var9_ref = null;
        jd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        jd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var9 = new jd(param2, param6, param4, param3, param7, param8, param0);
            ib.field_a.a((am) (Object) var9, 117);
            ea.a(var9, 3, 62);
            stackOut_2_0 = (jd) var9;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var9_ref;
            stackOut_4_1 = new StringBuilder().append("oa.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 3 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + 0 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
        return stackIn_3_0;
    }

    final static vb a(byte param0, String param1) {
        Object var2 = null;
        int var3 = 0;
        vb var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        vb stackIn_15_0 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        vb stackOut_14_0 = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (null != n.field_t) {
            L0: {
              var3 = -23 / ((34 - param0) / 41);
              var7 = (CharSequence) (Object) param1;
              var2 = (Object) (Object) mf.a(false, var7);
              if (var2 == null) {
                var2 = (Object) (Object) var7;
                break L0;
              } else {
                break L0;
              }
            }
            var4 = (vb) (Object) n.field_t.a((long)((String) var2).hashCode(), -30828);
            L1: while (true) {
              if (var4 != null) {
                L2: {
                  var8 = (CharSequence) (Object) var4.field_Ib;
                  var5 = mf.a(false, var8);
                  if (var5 != null) {
                    break L2;
                  } else {
                    var5 = var4.field_Ib;
                    break L2;
                  }
                }
                if (var5.equals(var2)) {
                  stackOut_14_0 = (vb) var4;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  var4 = (vb) (Object) n.field_t.a(83);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_18_0 = var2;
            stackOut_18_1 = new StringBuilder().append("oa.D(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Total time: <col=ffffff>";
        field_c = new int[8192];
        field_h = "More suggestions";
        field_g = new nd(14, 0, 4, 1);
        field_k = new je();
        field_d = new p();
        field_a = 0;
    }
}
