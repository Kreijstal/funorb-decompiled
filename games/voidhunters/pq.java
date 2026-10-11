/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq {
    private static int field_b;
    private static ij field_a;
    private static boolean field_c;

    final synchronized static void a(int param0, e param1) {
        naa var2 = null;
        if (!field_c) {
          if (field_b > param0) {
            var2 = new naa();
            var2.field_d = param1;
            field_a.b(param0 - 10258, var2);
          } else {
            param1.w(false);
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
        if (!param0) {
          field_c = false;
          field_b = field_b - 1;
          if (0 == field_b) {
            pq.a((byte) -128);
            return;
          }
          return;
        }
        field_b = field_b - 1;
        if (0 == field_b) {
          pq.a((byte) -128);
          return;
        }
    }

    final synchronized static void a(byte param0) {
        naa var1;
        if (param0 != -128) {
          field_c = true;
        }
        while (true) {
          var1 = (naa) (field_a.a(true));
          if (var1 == null) {
            return;
          }
          var1.field_d.w(true);
          var1.b(-3846);
        }
    }

    static {
        field_b = 0;
        field_c = false;
        field_a = new ij();
    }
}
