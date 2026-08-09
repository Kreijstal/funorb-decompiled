/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ef extends IOException {
    static String field_f;
    static jp[] field_b;
    static oe[] field_a;
    static jp[] field_e;
    static int[] field_d;
    static String field_c;

    final static void a(int param0, int param1) {
        pi var2;
        if (param0 != -22809) {
          return;
        } else {
          var2 = k.field_h;
          var2.e(-13413, param1);
          var2.a(-5, 1);
          var2.a(param0 ^ 22903, 1);
          return;
        }
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 != 10) {
            return;
        }
        field_d = null;
        field_e = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    ef(String param0) {
        super(param0);
    }

    final static void a(jp param0, jp param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int param8, int param9, jp param10) {
        param0.d((-param0.field_x + param9) / 2 + (param2 + (param4 * 5 >> -1722248016)), param5);
        param1.c((10 * param4 >> 1918877328) + (param2 - (-((-param1.field_x + param9) / 2) + -(10 / param8))), -(22 / param8) + param5 + (param6 + 480 - param1.field_z));
        if (param3) {
            return;
        }
        try {
            param10.c((-param10.field_x + param9) / 2 + param2 + ((20 * param4 >> -1999231120) + 10 / param8), 480 + (param5 - -param6 + -param10.field_z));
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ef.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var1;
        int var2;
        int var3;
        var1 = hj.field_Yb * hj.field_Yb;
        var2 = -(hc.field_f * hc.field_f) + var1;
        if (param0 >= -27) {
          field_d = (int[]) null;
          var3 = (-rn.field_h + ej.field_O) * var2 / var1 + rn.field_h;
          gp.field_d.a(120, var3, qh.field_f, 640, (byte) 64);
          fj.a(kn.field_z, 5, ej.field_O + -24, 640, om.field_oc, 0, (byte) 94);
          return;
        } else {
          var3 = (-rn.field_h + ej.field_O) * var2 / var1 + rn.field_h;
          gp.field_d.a(120, var3, qh.field_f, 640, (byte) 64);
          fj.a(kn.field_z, 5, ej.field_O + -24, 640, om.field_oc, 0, (byte) 94);
          return;
        }
    }

    final static void a(String param0, int param1, int param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -106) {
                break L1;
              } else {
                var6 = (String[]) null;
                ef.a((String) null, 72, 40, (String[]) null);
                break L1;
              }
            }
            ka.field_l = up.field_v;
            if (param2 != 255) {
              if (param2 < 100) {
                he.field_H = i.a(param2, -60, param0);
                return;
              } else {
                if (-106 <= (param2 ^ -1)) {
                  var8 = param3;
                  md.a(var8, true);
                  he.field_H = lm.a(param1 ^ 2167, param3);
                  break L0;
                } else {
                  he.field_H = i.a(param2, -60, param0);
                  return;
                }
              }
            } else {
              L2: {
                stackIn_6_0 = 1;

                if (-14 >= (vo.field_x ^ -1)) {
                  stackIn_7_0 = stackIn_6_0;
                  stackIn_7_1 = 0;
                  break L2;
                } else {
                  stackIn_7_0 = stackIn_6_0;
                  stackIn_7_1 = 1;
                  break L2;
                }
              }
              he.field_H = cd.a(stackIn_7_0 != 0, stackIn_7_1 != 0);
              var7 = (String[]) null;
              md.a((String[]) null, true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ef.C(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_a = new oe[29];
        field_d = new int[128];
        field_c = "1-UP: an extra life.";
        field_f = "No players";
    }
}
