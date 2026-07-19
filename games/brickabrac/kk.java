/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static int[] field_g;
    static String field_a;
    static mh field_b;
    static int[] field_e;
    static String field_c;
    static String field_d;
    static String field_f;

    final static tp[] a(byte param0) {
        tp[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        var1 = new tp[nl.field_c];
        var2 = 0;
        L0: while (true) {
          if (nl.field_c <= var2) {
            if (param0 != -2) {
              kk.a(-77);
              ee.d((byte) 96);
              return var1;
            } else {
              ee.d((byte) 96);
              return var1;
            }
          } else {
            var1[var2] = new tp(cf.field_d, ek.field_db, ag.field_K[var2], dl.field_d[var2], jh.field_b[var2], gg.field_t[var2], cn.field_a[var2], qp.field_c);
            var2++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 != 0) {
            return;
        }
        field_e = null;
        field_g = null;
    }

    final static void a(boolean param0, String param1) {
        try {
            if (!param0) {
                field_a = (String) null;
            }
            qn.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "kk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int[] a(boolean param0, int param1, fo param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_7_0 = null;
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        int[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var6 = new int[param1];
            var3 = var6;
            var4 = 0;
            L1: while (true) {
              if (param1 <= var4) {
                if (param2 == null) {
                  stackOut_6_0 = (int[]) (var3);
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L2: {
                    if (!param0) {
                      break L2;
                    } else {
                      field_e = (int[]) null;
                      break L2;
                    }
                  }
                  ke.a(var3, (byte) 39, param2);
                  stackOut_10_0 = (int[]) (var3);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var6[var4] = var4;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("kk.C(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_11_0;
        }
    }

    static {
        field_g = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_e = new int[12];
        field_d = "Accept invitation to <%0>'s game";
        field_c = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_a = "Rematch";
        field_f = "Year";
    }
}
