/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq {
    private static int field_b;
    private static ij field_a;
    private static boolean field_c;

    final synchronized static void a(int param0, e param1) {
        naa var2 = null;
        if (field_c) {
          return;
        } else {
          L0: {
            if (field_b <= 0) {
              param1.w(false);
              break L0;
            } else {
              var2 = new naa();
              var2.field_d = param1;
              field_a.b(-10258, (ksa) (Object) var2);
              break L0;
            }
          }
          return;
        }
    }

    final synchronized static void b(byte param0) {
        field_b = field_b + 1;
    }

    final synchronized static void a(boolean param0) {
        field_b = field_b - 1;
        if (0 != field_b) {
            return;
        }
        pq.a((byte) -128);
    }

    final synchronized static void a(byte param0) {
        naa var1 = null;
        L0: while (true) {
          var1 = (naa) (Object) field_a.a(true);
          if (var1 != null) {
            var1.field_d.w(true);
            var1.b(-3846);
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = false;
        field_a = new ij();
    }
}
