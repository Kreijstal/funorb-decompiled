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
        nc stackIn_5_0 = null;
        nc stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new nc(param0, j.field_e, iq.field_g, qm.field_K, c.field_e, qv.field_j, vj.field_j);
              if (param1 == 0) {
                rj.d((byte) 117);
                stackIn_7_0 = (nc) (var2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (nc) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("lq.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if ((param1 ^ -1) >= -2) {
                L2: {
                  if (param2 == 21) {
                    break L2;
                  } else {
                    lq.a(-54, -42, (byte) -105);
                    break L2;
                  }
                }
                if ((param1 ^ -1) == -2) {
                  stackIn_13_0 = var3_int * param0;
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
          throw ig.a((Throwable) ((Object) var3), "lq.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_13_0;
    }

    public static void a(int param0) {
        if (param0 != -31320) {
            return;
        }
        field_a = null;
        field_f = null;
        field_c = null;
    }

    static {
        field_d = false;
        field_e = -1;
        field_b = 0;
        field_c = new gu();
        field_f = "Build cannon - The troop of engineers will build a single, powerful cannon on the tile they're on.";
        field_a = "SPEED";
    }
}
