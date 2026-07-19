/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_a;
    private static String field_z;

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4 = -64 % ((param2 - -8) / 50);
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((param1 ^ -1) >= -1) {
                    break L3;
                  } else {
                    var3_int = 1 & param0 | var3_int << -191611743;
                    param1--;
                    stackOut_3_0 = param0 >>> 1;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      param0 = stackIn_4_0;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = var3_int;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var3), field_z + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    static {
        field_z = "bc.A(";
        field_a = 0;
    }
}
