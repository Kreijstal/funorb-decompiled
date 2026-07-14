/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    boolean field_d;
    static String field_a;
    String field_e;
    static String field_g;
    String[] field_c;
    int field_b;
    boolean field_f;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -28342) {
            return;
        }
        field_g = null;
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        vg var4 = null;
        gj var5 = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        var4 = (vg) (Object) kk.field_X.b((byte) -45);
        L0: while (true) {
          if (var4 == null) {
            var5 = (gj) (Object) cb.field_b.b((byte) 123);
            L1: while (true) {
              if (var5 == null) {
                if (param1 != 7287) {
                  field_a = null;
                  return;
                } else {
                  return;
                }
              } else {
                se.a(var5, param0, -49);
                var5 = (gj) (Object) cb.field_b.d(param1 ^ 7970);
                continue L1;
              }
            }
          } else {
            bk.a(true, param0, var4);
            var4 = (vg) (Object) kk.field_X.d(param1 ^ 7970);
            continue L0;
          }
        }
    }

    qj(boolean param0) {
        ((qj) this).field_f = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "FULL ACCESS";
        field_g = "Next";
    }
}
