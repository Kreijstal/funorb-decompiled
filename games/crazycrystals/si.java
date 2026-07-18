/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    static String field_c;
    static am field_e;
    int field_g;
    String field_h;
    boolean field_f;
    String[] field_d;
    static String field_a;
    boolean field_b;

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_c = null;
        if (param0 == 14403) {
            return;
        }
        si.a(-109, true);
    }

    final static void a(int param0, boolean param1) {
        jb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ca var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = CrazyCrystals.field_B;
        try {
          L0: {
            var4 = (ca) (Object) gn.field_Q.g(32073);
            L1: while (true) {
              if (var4 == null) {
                var2 = pm.field_c.g(32073);
                L2: while (true) {
                  if (var2 == null) {
                    if (!param1) {
                      break L0;
                    } else {
                      si.a(98, true);
                      return;
                    }
                  } else {
                    eq.b(2, param0);
                    var2 = pm.field_c.a(param1);
                    continue L2;
                  }
                }
              } else {
                nh.a(param0, (byte) -99, var4);
                var4 = (ca) (Object) gn.field_Q.a(false);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2_ref, "si.A(" + param0 + ',' + param1 + ')');
        }
    }

    si(boolean param0) {
        ((si) this).field_b = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Confirm Password: ";
        field_a = "Log in / Create account";
    }
}
