/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static int[] field_c;
    int field_e;
    static int field_b;
    int field_d;
    int field_f;
    int field_a;
    static wi field_g;

    final static void a(tj param0, int param1, int param2, tj param3) {
        try {
            gk.field_a = param1;
            jc.field_h = param0;
            ba.field_E = param3;
            l.a(na.field_k / 2, (byte) 127, na.field_e / 2);
            int var4_int = -4 % ((param2 - -34) / 39);
            hh.b(param0.field_x + param0.field_F, param3.field_F, param0.field_F, param3.field_F + param3.field_x, 0);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "lb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -3) {
            field_b = -113;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static a[] a(int param0, ii param1) {
        int discarded$30 = 0;
        int discarded$31 = 0;
        int discarded$32 = 0;
        int discarded$33 = 0;
        int discarded$34 = 0;
        int discarded$35 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        a[] var4 = null;
        int var5 = 0;
        a var6_ref_a = null;
        int var6 = 0;
        int var7 = 0;
        a[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        a[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var2_int = param1.f(7, 8);
              if (param0 >= 42) {
                break L1;
              } else {
                lb.a((byte) 78);
                break L1;
              }
            }
            if (0 >= var2_int) {
              var3 = param1.f(7, 12);
              var4 = new a[var3];
              var5 = 0;
              L2: while (true) {
                if (var3 <= var5) {
                  stackOut_13_0 = (a[]) (var4);
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L3: {
                    if (!re.a(101, param1)) {
                      var6 = param1.f(7, wd.a(var5 + -1, -95));
                      var4[var5] = var4[var6];
                      break L3;
                    } else {
                      var6_ref_a = new a();
                      discarded$30 = param1.f(7, 24);
                      discarded$31 = param1.f(7, 24);
                      var6_ref_a.field_d = param1.f(7, 24);
                      discarded$32 = param1.f(7, 9);
                      discarded$33 = param1.f(7, 12);
                      discarded$34 = param1.f(7, 12);
                      discarded$35 = param1.f(7, 12);
                      var4[var5] = var6_ref_a;
                      break L3;
                    }
                  }
                  var5++;
                  continue L2;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("lb.A(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    static {
        field_b = 0;
        field_c = new int[16384];
        field_g = new wi(256);
    }
}
