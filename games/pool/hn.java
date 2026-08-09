/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hn {
    static int field_b;
    static re field_c;
    static double field_a;

    public static void b(int param0) {
        if (param0 != 11) {
            hn.a(-88);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static String a(long param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        aq.field_b.setTime(new Date(param0));
        var3 = aq.field_b.get(7);
        var4 = aq.field_b.get(5);
        var5 = aq.field_b.get(2);
        var6 = aq.field_b.get(1);
        var7 = aq.field_b.get(11);
        var8 = aq.field_b.get(12);
        var9 = aq.field_b.get(13);
        if (param1) {
          field_c = (re) null;
          return kc.field_a[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + df.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          return kc.field_a[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + df.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    final static wl a(di param0, String param1, String param2, int param3, di param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        wl stackIn_2_0 = null;
        wl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == -25154) {
              var5_int = param4.b(param1, -1);
              var6 = param4.a(var5_int, 0, param2);
              stackIn_4_0 = cn.a(param4, var6, var5_int, param0, param3 ^ -890);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (wl) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("hn.B(");

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0) {
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        di var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param0 == -3143) {
                break L1;
              } else {
                var4 = (di) null;
                hn.a((di) null, (String) null, (String) null, 35, (di) null);
                break L1;
              }
            }
            var1_int = 0;
            var2 = -7 + qh.field_l * qh.field_f;
            L2: while (true) {
              if (var1_int >= var2) {
                var2 += 7;
                L3: while (true) {
                  if (var2 <= var1_int) {
                    break L0;
                  } else {
                    incrementValue$10 = var1_int;
                    var1_int++;
                    qh.field_d[incrementValue$10] = -1;
                    continue L3;
                  }
                }
              } else {
                incrementValue$11 = var1_int;
                var1_int++;
                qh.field_d[incrementValue$11] = -1;
                incrementValue$12 = var1_int;
                var1_int++;
                qh.field_d[incrementValue$12] = -1;
                incrementValue$13 = var1_int;
                var1_int++;
                qh.field_d[incrementValue$13] = -1;
                incrementValue$14 = var1_int;
                var1_int++;
                qh.field_d[incrementValue$14] = -1;
                incrementValue$15 = var1_int;
                var1_int++;
                qh.field_d[incrementValue$15] = -1;
                incrementValue$16 = var1_int;
                var1_int++;
                qh.field_d[incrementValue$16] = -1;
                incrementValue$17 = var1_int;
                var1_int++;
                qh.field_d[incrementValue$17] = -1;
                incrementValue$18 = var1_int;
                var1_int++;
                qh.field_d[incrementValue$18] = -1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "hn.C(" + param0 + ')');
        }
    }

    static {
        field_c = null;
        field_b = 0;
        field_a = 0.0;
    }
}
