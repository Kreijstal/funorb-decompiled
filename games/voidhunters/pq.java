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
            if (field_b <= param0) {
              param1.w(false);
              break L0;
            } else {
              var2 = new naa();
              var2.field_d = param1;
              field_a.b(param0 + -10258, (ksa) (Object) var2);
              break L0;
            }
          }
          return;
        }
    }

    final synchronized static void b(byte param0) {
        field_b = field_b + 1;
        if (param0 == -76) {
            return;
        }
        field_b = -71;
    }

    final synchronized static void a(boolean param0) {
        if (param0) {
          field_b = field_b - 1;
          if (0 != field_b) {
            return;
          } else {
            pq.a((byte) -128);
            return;
          }
        } else {
          field_c = false;
          field_b = field_b - 1;
          if (0 != field_b) {
            return;
          } else {
            pq.a((byte) -128);
            return;
          }
        }
    }

    final synchronized static void a(byte param0) {
        naa var2 = null;
        naa var3 = null;
        if (param0 == -128) {
          L0: while (true) {
            var2 = (naa) (Object) field_a.a(true);
            if (var2 != null) {
              var2.field_d.w(true);
              var2.b(-3846);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          field_c = true;
          L1: while (true) {
            var3 = (naa) (Object) field_a.a(true);
            if (var3 != null) {
              var3.field_d.w(true);
              var3.b(-3846);
              continue L1;
            } else {
              return;
            }
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
