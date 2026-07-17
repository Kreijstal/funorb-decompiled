/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static int field_e;
    static boolean field_d;
    static int field_b;
    static gu field_c;
    static String field_a;
    static String field_f;

    final static nc a(byte[] param0, int param1) {
        nc var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          if (param0 != null) {
            var2 = new nc(param0, j.field_e, iq.field_g, qm.field_K, c.field_e, qv.field_j, vj.field_j);
            rj.d((byte) 117);
            return var2;
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("lq.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 0 + 41);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param1 <= 1) {
                L2: {
                  if (param2 == 21) {
                    break L2;
                  } else {
                    int discarded$2 = lq.a(-54, -42, (byte) -105);
                    break L2;
                  }
                }
                if (param1 == 1) {
                  stackOut_10_0 = var3_int * param0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                L3: {
                  if (0 == (1 & param1)) {
                    break L3;
                  } else {
                    var3_int = var3_int * param0;
                    break L3;
                  }
                }
                param0 = param0 * param0;
                param1 = param1 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "lq.B(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_11_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_e = -1;
        field_b = 0;
        field_c = new gu();
        field_f = "Build cannon - The troop of engineers will build a single, powerful cannon on the tile they're on.";
        field_a = "SPEED";
    }
}
