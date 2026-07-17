/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jv {
    static boolean field_a;
    static int field_c;
    static int[][] field_d;
    static wk[] field_b;
    static String field_e;

    final static int a(boolean param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= wp.field_H.length) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  var3 = 0;
                  L2: while (true) {
                    if (var3 >= wp.field_H[var2_int].length) {
                      var2_int++;
                      continue L1;
                    } else {
                      if (wp.field_H[var2_int][var3] == param1) {
                        stackOut_10_0 = var2_int;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0;
                      } else {
                        var3++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = -40;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "jv.A(" + param0 + 44 + param1 + 41);
        }
        return stackIn_15_0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_e = null;
    }

    final static te a(sn param0, int param1, int param2, byte param3) {
        RuntimeException var4 = null;
        te stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        te stackOut_2_0 = null;
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
            L1: {
              if (param3 > 26) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            stackOut_2_0 = ne.a(-92, aa.a(param0, 100, param2, param1));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("jv.C(");
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_e = "The cannon cannot be built on a structure";
    }
}
