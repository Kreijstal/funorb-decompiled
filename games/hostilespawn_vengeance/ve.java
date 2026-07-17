/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static vl field_b;
    static int field_a;
    static boolean[] field_c;
    static String field_d;

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            uf.a(rf.field_c, fc.field_z, 1512033985, true, param1, 0, i.field_f);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= fc.field_z) {
                L2: {
                  var3 = -108 % ((param0 - 73) / 39);
                  uf.a(kl.field_a, param1 + fc.field_z, 1512033985, false, param1 + param1, param1, bh.field_e);
                  if (fc.field_z > param1) {
                    fc.field_z = param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                db.field_s[var2_int - -param1] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "ve.B(" + param0 + 44 + param1 + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new vl();
        field_d = "to keep fullscreen or";
    }
}
