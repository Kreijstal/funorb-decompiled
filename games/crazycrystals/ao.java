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

    final static void a(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        var1 = (Object) (Object) uf.field_c;
        synchronized (var1) {
          L0: {
            td.field_d = ah.field_g;
            jf.field_a = jf.field_a + 1;
            if (param0 < -32) {
              L1: {
                if (-1 < (bo.field_n ^ -1)) {
                  var5 = 0;
                  var2 = var5;
                  L2: while (true) {
                    if ((var5 ^ -1) <= -113) {
                      bo.field_n = ud.field_Z;
                      break L1;
                    } else {
                      cp.field_k[var5] = false;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  L3: while (true) {
                    if ((bo.field_n ^ -1) == (ud.field_Z ^ -1)) {
                      break L1;
                    } else {
                      var2 = pl.field_n[ud.field_Z];
                      ud.field_Z = 127 & ud.field_Z - -1;
                      if (-1 < (var2 ^ -1)) {
                        cp.field_k[var2 ^ -1] = false;
                        continue L3;
                      } else {
                        cp.field_k[var2] = true;
                        continue L3;
                      }
                    }
                  }
                }
              }
              ah.field_g = ei.field_A;
              break L0;
            } else {
              return;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        field_a = null;
        int var1 = 5 / ((param0 - 19) / 62);
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
