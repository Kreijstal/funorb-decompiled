/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends oh {
    int field_k;
    static int field_j;
    int field_i;
    static boolean field_h;

    final static int[] a(int[] param0, int param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = new int[param1];
            var4 = 1;
            L1: while (true) {
              if (var4 >= param1) {
                stackOut_8_0 = (int[]) var3;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var5 = var4;
                L2: while (true) {
                  L3: {
                    var5--;
                    if (var5 < 0) {
                      break L3;
                    } else {
                      if (param0[var4] >= param0[var3[var5]]) {
                        break L3;
                      } else {
                        var3[var5 + 1] = var3[var5];
                        continue L2;
                      }
                    }
                  }
                  var3[1 + var5] = var4;
                  var4++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("ik.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + 49 + ')');
        }
        return stackIn_9_0;
    }

    final void a(int param0, byte param1, int param2) {
        ((ik) this).field_i = param0;
        ((ik) this).field_k = param2;
        if (param1 < 7) {
            ((ik) this).field_i = -64;
        }
    }

    ik() {
    }

    final static mj a(int param0, long param1) {
        if (param0 > -87) {
            return null;
        }
        return (mj) (Object) qp.field_w.a(65280, param1);
    }

    final static int a() {
        return of.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
    }
}
