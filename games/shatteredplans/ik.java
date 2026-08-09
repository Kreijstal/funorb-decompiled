/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends oh {
    int field_k;
    static int field_j;
    int field_i;
    static boolean field_h;

    final static int[] a(int[] param0, int param1, byte param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new int[param1];
              if (param2 == 49) {
                break L1;
              } else {
                field_j = 50;
                break L1;
              }
            }
            var4 = 1;
            L2: while (true) {
              if (var4 >= param1) {
                stackIn_11_0 = (int[]) (var3);
                break L0;
              } else {
                var5 = var4;
                L3: while (true) {
                  L4: {
                    var5--;
                    if (-1 < (var5 ^ -1)) {
                      break L4;
                    } else {
                      if (param0[var4] >= param0[var3[var5]]) {
                        break L4;
                      } else {
                        var3[var5 + 1] = var3[var5];
                        continue L3;
                      }
                    }
                  }
                  var3[1 + var5] = var4;
                  var4++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("ik.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    final void a(int param0, byte param1, int param2) {
        this.field_i = param0;
        this.field_k = param2;
        if (param1 < 7) {
            this.field_i = -64;
        }
    }

    ik() {
    }

    final static mj a(int param0, long param1) {
        if (param0 > -87) {
            return (mj) null;
        }
        return (mj) ((Object) qp.field_w.a(65280, param1));
    }

    final static int a(int param0) {
        if (param0 != -26918) {
            return 113;
        }
        return of.field_e;
    }

    static {
        field_j = 0;
    }
}
