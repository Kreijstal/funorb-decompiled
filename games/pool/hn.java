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
        aq.field_b.setTime(new Date(param0));
        int var3 = aq.field_b.get(7);
        int var4 = aq.field_b.get(5);
        int var5 = aq.field_b.get(2);
        int var6 = aq.field_b.get(1);
        int var7 = aq.field_b.get(11);
        int var8 = aq.field_b.get(12);
        int var9 = aq.field_b.get(13);
        if (!param1) {
          return kc.field_a[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + df.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        field_c = (re) null;
        return kc.field_a[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + df.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final static wl a(di param0, String param1, String param2, int param3, di param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        wl stackIn_2_0 = null;
        wl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -25154) {
            stackIn_2_0 = (wl) null;
            return stackIn_2_0;
          }
          var5_int = param4.b(param1, -1);
          var6 = param4.a(var5_int, 0, param2);
          stackIn_4_0 = cn.a(param4, var6, var5_int, param0, param3 ^ -890);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("hn.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$10 = 0;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        di var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Pool.field_O;
        try {
          if (param0 != -3143) {
            var4 = (di) null;
            hn.a((di) null, (String) null, (String) null, 35, (di) null);
          }
          var1_int = 0;
          var2 = -7 + qh.field_l * qh.field_f;
          while (var1_int < var2) {
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
          }
          var2 += 7;
          while (var2 > var1_int) {
            incrementValue$10 = var1_int;
            var1_int++;
            qh.field_d[incrementValue$10] = -1;
          }
          return;
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
