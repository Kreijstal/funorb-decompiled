/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    static String field_a;

    final static void a(int param0) {
        ff.field_a = false;
        if (param0 <= 28) {
          field_a = null;
          aq.field_c = false;
          od.b(128, -1);
          kh.field_o = tp.field_h;
          bh.field_a = tp.field_h;
          return;
        } else {
          aq.field_c = false;
          od.b(128, -1);
          kh.field_o = tp.field_h;
          bh.field_a = tp.field_h;
          return;
        }
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        qk var5 = null;
        h var6 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            var5 = (qk) (Object) kc.field_z.b(0);
            L1: while (true) {
              if (var5 == null) {
                var3 = 0;
                var6 = (h) (Object) to.field_s.b(0);
                L2: while (true) {
                  if (var6 == null) {
                    break L0;
                  } else {
                    va.a(var6, (byte) 125, 5);
                    var6 = (h) (Object) to.field_s.f(-24059);
                    continue L2;
                  }
                }
              } else {
                ii.a(32, 5, var5);
                var5 = (qk) (Object) kc.field_z.f(-24059);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "km.A(" + -128 + 44 + 5 + 41);
        }
    }

    final synchronized static long b(int param0) {
        long var1 = 0L;
        var1 = System.currentTimeMillis();
        if (~var1 <= ~j.field_p) {
          if (param0 != -1) {
            return -53L;
          } else {
            j.field_p = var1;
            return var1 - -la.field_g;
          }
        } else {
          la.field_g = la.field_g + (-var1 + j.field_p);
          if (param0 != -1) {
            return -53L;
          } else {
            j.field_p = var1;
            return var1 - -la.field_g;
          }
        }
    }

    public static void a() {
        int var1 = 0;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
