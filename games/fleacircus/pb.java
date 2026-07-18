/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static vc field_f;
    static String field_b;
    static String field_h;
    static fa field_e;
    static rh field_a;
    static int field_i;
    static int field_d;
    static dd field_g;
    static dd field_c;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        bh var4 = null;
        ll var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (bh) (Object) wi.field_j.c((byte) 47);
            L1: while (true) {
              if (var4 == null) {
                var5 = (ll) (Object) jj.field_S.c((byte) 47);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    int discarded$4 = 3;
                    ak.a(-14722, var5);
                    var5 = (ll) (Object) jj.field_S.b((byte) -105);
                    continue L2;
                  }
                }
              } else {
                s.a(-4471, 3, var4);
                var4 = (bh) (Object) wi.field_j.b((byte) -105);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "pb.A(" + 3 + ',' + 0 + ')');
        }
    }

    final static void b() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var1_int = ed.field_c[0];
            var2 = 1;
            L1: while (true) {
              if (ed.field_c.length <= var2) {
                break L0;
              } else {
                var3 = ed.field_c[var2];
                dm.a(pk.field_J, var2 << 4, pk.field_J, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "pb.B(" + 124 + ')');
        }
    }

    public static void a() {
        field_f = null;
        field_a = null;
        field_b = null;
        field_h = null;
        field_g = null;
        field_e = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Creating your account";
        field_d = 0;
        field_h = "Tiles you can place";
        field_i = 100;
        field_f = new vc();
    }
}
