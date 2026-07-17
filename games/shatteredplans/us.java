/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class us {
    static boolean field_c;
    static bi field_a;
    static qf field_d;
    static String field_e;
    static int field_b;

    final static void a(boolean param0, boolean param1) {
        fa.field_X.b(param1, 97);
    }

    final static void a(int param0, int param1) {
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = ~ui.field_m;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (p.field_n) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 2;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 3;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        if (stackIn_3_0 != ~stackIn_3_1) {
          if (p.field_n) {
            if (kc.field_i == -1) {
              i.a(640, 480, 0, -(5 * param1) + 255, -123, 0);
              us.a(false, true);
              return;
            } else {
              ne.a(0, gf.field_b, (byte) 24, 0, 256, 5 * param1, gf.field_k);
              us.a(false, true);
              return;
            }
          } else {
            ne.a(0, gf.field_b, (byte) 24, 0, 256, 5 * param1, gf.field_k);
            us.a(false, true);
            return;
          }
        } else {
          i.a(640, 480, 0, -(5 * param1) + 255, -123, 0);
          us.a(false, true);
          return;
        }
    }

    final static fs a(ob param0, fs[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        fs stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var3_int = param0.j(-85);
            if (param1.length > var3_int) {
              if (0 <= var3_int) {
                stackOut_4_0 = param1[var3_int];
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("us.C(");
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
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + 2 + 41);
        }
        return stackIn_5_0;
    }

    final static va b() {
        va var1 = new va();
        var1.field_k = true;
        var1.field_h = 2;
        var1.field_a = 2;
        var1.field_f = true;
        var1.field_c = 2;
        return var1;
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        if (param0 != 0) {
            us.a(-56);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> is not on your friend list.";
    }
}
