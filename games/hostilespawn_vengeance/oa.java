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

    public static void a(int param0) {
        field_d = null;
        if (param0 != 32) {
          return;
        } else {
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
          return;
        }
    }

    final static void a(int param0, int param1, p param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        int var4_int = 0;
        int var8 = 0;
        int var10 = 0;
        int var5 = 0;
        int var11 = 0;
        int var9 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        try {
            var6 = param3 << 2146270914;
            var7 = param1 << -1619765406;
            var12 = param2.field_c;
            var14 = 25.0;
            var16 = var12 * 3.141592653589793 / 128.0;
            var18 = Math.sin(var16) * -var14;
            var20 = Math.cos(var16) * -var14;
            var4_int = (int)(-var18 + (double)var6);
            var8 = 8;
            if (param0 != -17652) {
                field_i = (bd) null;
            }
            var10 = 1;
            var5 = (int)(-var20 + (double)var7);
            var11 = 1;
            var9 = 16;
            var22 = 200 * (-param2.field_e + 32) / 32;
            km.a((byte) var10, var7, var5, ni.field_c, var9, var6, (byte) var11, param0 + 17752, var4_int, var22, var8);
            var23 = (int)((double)var8 / 1.3);
            var24 = (int)((double)var9 / 1.3);
            bh.a((byte) var10, HostileSpawn.field_E, (byte) var11, var23, var4_int, var5, var7, var24, var22, var6, 9233);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "oa.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static jd a(int[] param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int param8) {
        jd var9 = null;
        RuntimeException var9_ref = null;
        jd stackIn_2_0 = null;
        jd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param5) {
              var9 = new jd(param2, param6, param4, param3, param7, param8, param0);
              ib.field_a.a(var9, 117);
              ea.a(var9, param1, 62);
              stackIn_4_0 = (jd) (var9);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (jd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var9_ref);

            stackIn_7_1 = new StringBuilder().append("oa.A(");

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
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static vb a(byte param0, String param1) {
        String var2 = null;
        int var3 = 0;
        vb var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        vb stackIn_15_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (null != n.field_t) {
              L1: {
                var3 = -23 / ((34 - param0) / 41);
                var7 = (CharSequence) ((Object) param1);
                var2 = mf.a(false, var7);
                if (var2 == null) {
                  var2 = param1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var4 = (vb) ((Object) n.field_t.a((long)var2.hashCode(), -30828));
              L2: while (true) {
                if (var4 != null) {
                  L3: {
                    var8 = (CharSequence) ((Object) var4.field_Ib);
                    var5 = mf.a(false, var8);
                    if (var5 != null) {
                      break L3;
                    } else {
                      var5 = var4.field_Ib;
                      break L3;
                    }
                  }
                  if (var5.equals(var2)) {
                    stackIn_15_0 = (vb) (var4);
                    break L0;
                  } else {
                    var4 = (vb) ((Object) n.field_t.a(83));
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2_ref);

            stackIn_20_1 = new StringBuilder().append("oa.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        return stackIn_15_0;
    }

    static {
        field_j = "Total time: <col=ffffff>";
        field_c = new int[8192];
        field_h = "More suggestions";
        field_g = new nd(14, 0, 4, 1);
        field_k = new je();
        field_d = new p();
        field_a = 0;
    }
}
