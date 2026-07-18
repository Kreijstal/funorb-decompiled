/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho {
    private static boolean field_b;
    private static int field_c;
    private static vna field_a;

    final synchronized static void a(int param0) {
        field_c = field_c - 1;
        if (!(field_c != 0)) {
            ho.a(true);
        }
    }

    final synchronized static void b(boolean param0) {
        field_c = field_c + 1;
    }

    final synchronized static void a(int param0, e param1) {
        rw var2 = null;
        if (field_b) {
          return;
        } else {
          L0: {
            if (field_c > 0) {
              var2 = new rw();
              var2.field_f = param1;
              field_a.b((byte) -118, (vg) (Object) var2);
              break L0;
            } else {
              param1.w(false);
              break L0;
            }
          }
          return;
        }
    }

    final synchronized static void a(boolean param0) {
        rw var1 = null;
        L0: while (true) {
          var1 = (rw) (Object) field_a.c(-113);
          if (var1 == null) {
            return;
          } else {
            var1.field_f.w(true);
            var1.p(120);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = false;
        field_a = new vna();
    }
}
