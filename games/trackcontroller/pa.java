/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static ja field_c;
    static long field_b;
    static volatile int field_a;

    public static void a(byte param0) {
        if (param0 > -120) {
            return;
        }
        field_c = null;
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        dh var4 = null;
        nk var5 = null;
        var3 = TrackController.field_F ? 1 : 0;
        var4 = (dh) (Object) field_c.b(param1 + -38);
        L0: while (true) {
          if (var4 == null) {
            if (param1 == 40) {
              var5 = (nk) (Object) qh.field_e.b(param1 ^ 42);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  gj.a(2, var5, param0);
                  var5 = (nk) (Object) qh.field_e.a(10);
                  continue L1;
                }
              }
            } else {
              boolean discarded$3 = pa.b((byte) 41);
              var5 = (nk) (Object) qh.field_e.b(param1 ^ 42);
              L2: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  gj.a(2, var5, param0);
                  var5 = (nk) (Object) qh.field_e.a(10);
                  continue L2;
                }
              }
            }
          } else {
            me.a(var4, 0, param0);
            var4 = (dh) (Object) field_c.a(param1 + -30);
            continue L0;
          }
        }
    }

    final static boolean b(byte param0) {
        if (param0 != 91) {
            return true;
        }
        return af.a(9819, gd.b((byte) 77));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ja();
        field_a = 0;
    }
}
