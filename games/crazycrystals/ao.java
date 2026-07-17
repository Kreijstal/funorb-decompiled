/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static String field_c;
    static String field_d;
    static int field_e;
    static dl[] field_b;
    static String field_a;

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a() {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            var1 = (Object) (Object) uf.field_c;
            synchronized (var1) {
              L1: {
                td.field_d = ah.field_g;
                jf.field_a = jf.field_a + 1;
                L2: {
                  if (bo.field_n < 0) {
                    var5 = 0;
                    var2 = var5;
                    L3: while (true) {
                      if (var5 >= 112) {
                        bo.field_n = ud.field_Z;
                        break L2;
                      } else {
                        cp.field_k[var5] = false;
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: while (true) {
                      if (~bo.field_n == ~ud.field_Z) {
                        break L2;
                      } else {
                        var2 = pl.field_n[ud.field_Z];
                        ud.field_Z = 127 & ud.field_Z - -1;
                        if (var2 < 0) {
                          cp.field_k[~var2] = false;
                          continue L4;
                        } else {
                          cp.field_k[var2] = true;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                ah.field_g = ei.field_A;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1_ref, "ao.C(" + -124 + 41);
        }
    }

    public static void b() {
        field_c = null;
        field_b = null;
        field_d = null;
        field_a = null;
        int var1 = -5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "The object of this game is to collect all the crystals. Use the arrow keys to move.";
        field_c = "Name is available";
        field_a = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
