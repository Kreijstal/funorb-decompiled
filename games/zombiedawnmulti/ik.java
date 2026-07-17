/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static String field_e;
    static int field_c;
    static String field_b;
    static cj field_d;
    static String[] field_a;

    final static void a(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var1_int = 0;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1 = (Object) (Object) um.field_c;
            synchronized (var1) {
              L1: {
                L2: {
                  lp.field_j = kj.field_j;
                  em.field_cb = em.field_cb + 1;
                  if (0 <= qf.field_f) {
                    L3: while (true) {
                      if (fh.field_j == qf.field_f) {
                        break L2;
                      } else {
                        var2 = ln.field_f[fh.field_j];
                        fh.field_j = fh.field_j + 1 & 127;
                        if (var2 < 0) {
                          lc.field_m[~var2] = false;
                          continue L3;
                        } else {
                          lc.field_m[var2] = true;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 112) {
                        qf.field_f = fh.field_j;
                        break L2;
                      } else {
                        lc.field_m[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                kj.field_j = f.field_c;
                break L1;
              }
            }
            var1_int = -88 % ((param0 - -17) / 55);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1_ref, "ik.B(" + param0 + 41);
        }
    }

    public static void b() {
        field_a = null;
        field_b = null;
        field_e = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This research item is only available to FunOrb members. See the 'Account' section of the website for details.";
        field_e = "<%0> cannot join; the game is full.";
    }
}
