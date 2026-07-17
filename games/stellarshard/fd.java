/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends si {
    static int[] field_qb;
    static int field_nb;
    static boolean field_mb;
    int field_ob;
    String field_rb;
    String field_pb;

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var4 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param0 >= 75) {
                break L1;
              } else {
                field_mb = false;
                break L1;
              }
            }
            var3_int = 1;
            L2: while (true) {
              if (param1 <= 1) {
                if (1 != param1) {
                  stackOut_12_0 = var3_int;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = var3_int * param2;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                L3: {
                  if ((1 & param1) != 0) {
                    var3_int = var3_int * param2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param1 = param1 >> 1;
                param2 = param2 * param2;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "fd.E(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_13_0;
    }

    fd() {
        super(0L, (si) null);
    }

    public static void g(int param0) {
        field_qb = null;
    }

    final static boolean d(byte param0) {
        return qh.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_qb = new int[25];
    }
}
