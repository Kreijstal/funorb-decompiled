/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static String field_b;
    static tg field_a;
    static int field_d;
    static String field_c;
    static String field_e;

    final static void a(int param0, String param1) {
        System.out.println("Error: " + ak.a(param0 ^ 123, "%0a", "\n", param1));
        if (param0 != 100) {
            field_d = -84;
        }
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            vc.field_F = he.field_p;
            if (param0 == 255) {
              L1: {
                stackOut_7_0 = 5579;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (13 <= cg.field_a) {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L1;
                } else {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L1;
                }
              }
              oa.field_c = r.a(stackIn_10_0, stackIn_10_1 != 0);
              var6 = null;
              oh.a((byte) -29, (String[]) null);
              break L0;
            } else {
              if (100 > param0) {
                oa.field_c = wb.a(param0, 1, param2);
                return;
              } else {
                if (param0 > 105) {
                  oa.field_c = wb.a(param0, 1, param2);
                  return;
                } else {
                  var4 = param1;
                  oh.a((byte) -29, var4);
                  oa.field_c = qj.a(false, param1);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("ej.A(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + 255 + 41);
        }
    }

    public static void a(int param0) {
        int var1 = 0;
        field_b = null;
        field_a = null;
        field_e = null;
        field_c = null;
    }

    final static boolean b(int param0) {
        if (param0 < 0) {
          if (dh.field_a != null) {
            if (pj.field_a != b.field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = null;
          if (dh.field_a != null) {
            if (pj.field_a != b.field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_c = null;
    }
}
