/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_e;
    static int field_a;
    int field_c;
    static int field_d;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 55) {
            return;
        }
        field_e = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    qg(int param0) {
        ((qg) this).field_c = param0;
    }

    final static void b(int param0) {
        if (param0 == 9313) {
          if (!fh.c(-114)) {
            if (vk.field_b != null) {
              return;
            } else {
              vk.field_b = cf.a(4, 94);
              return;
            }
          } else {
            return;
          }
        } else {
          qg.a(116);
          if (!fh.c(-114)) {
            if (vk.field_b != null) {
              return;
            } else {
              vk.field_b = cf.a(4, 94);
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Level: <%0>";
        field_d = 4;
        field_b = "Password: ";
    }
}
