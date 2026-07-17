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
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var4 = stellarshard.field_B;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param1 <= 1) {
                if (1 != param1) {
                  stackOut_10_0 = var3_int;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = var3_int * param2;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                L2: {
                  if ((1 & param1) != 0) {
                    var3_int = var3_int * param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param1 = param1 >> 1;
                param2 = param2 * param2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "fd.E(" + 123 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_11_0;
    }

    fd() {
        super(0L, (si) null);
    }

    public static void g() {
        field_qb = null;
    }

    final static boolean d(byte param0) {
        if (param0 != -21) {
            field_mb = false;
            return qh.field_g;
        }
        return qh.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_qb = new int[25];
    }
}
