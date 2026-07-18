/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static hl field_a;
    static boolean field_b;
    static int[] field_c;

    final static void a(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var1_int = 0;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            var1 = (Object) (Object) hj.field_c;
            synchronized (var1) {
              L1: {
                L2: {
                  ie.field_D = ie.field_D + 1;
                  wg.field_b = hc.field_b;
                  if (ah.field_c >= 0) {
                    L3: while (true) {
                      if (ec.field_a == ah.field_c) {
                        break L2;
                      } else {
                        var2 = ab.field_A[ec.field_a];
                        ec.field_a = 127 & 1 + ec.field_a;
                        if (var2 < 0) {
                          wc.field_c[~var2] = false;
                          continue L3;
                        } else {
                          wc.field_c[var2] = true;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 112) {
                        ah.field_c = ec.field_a;
                        break L2;
                      } else {
                        wc.field_c[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                hc.field_b = pd.field_b;
                var1_int = 0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1_ref, "bi.A(" + 119 + ')');
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new hl(640, 480);
        field_c = new int[8];
    }
}
