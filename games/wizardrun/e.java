/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static vd field_b;
    static int field_d;
    static boolean field_a;
    static String field_c;
    static String field_e;

    final static boolean a(int param0) {
        if (param0 >= -71) {
            Object var2 = null;
            e.a((o[]) null, 123, 6, (byte) 67, 68, 39);
            return qb.field_p;
        }
        return qb.field_p;
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_b = null;
    }

    final static void a(o[] param0, int param1, int param2, byte param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var11 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param5 > 0) {
                  L2: {
                    if (param3 > 27) {
                      break L2;
                    } else {
                      boolean discarded$1 = e.a(59);
                      break L2;
                    }
                  }
                  var6_int = param0[0].field_x;
                  var7 = param0[2].field_x;
                  var8 = param0[1].field_x;
                  param0[0].d(param4, param1, param2);
                  param0[2].d(param4 - -param5 + -var7, param1, param2);
                  ed.b(ac.field_q);
                  ed.b(var6_int + param4, param1, param4 - -param5 + -var7, param1 + param0[1].field_s);
                  var9 = param4 + var6_int;
                  var10 = -var7 + param5 + param4;
                  param4 = var9;
                  L3: while (true) {
                    if (param4 >= var10) {
                      ed.a(ac.field_q);
                      break L0;
                    } else {
                      param0[1].d(param4, param1, param2);
                      param4 = param4 + var8;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("e.B(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Continue";
        field_c = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
