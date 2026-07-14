/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    int field_d;
    static nh field_e;
    static String field_g;
    static nh field_c;
    static int field_f;
    static String field_b;
    int field_a;

    final static og a(byte param0, String[] param1) {
        og var2 = null;
        Object var3 = null;
        if (param0 != 3) {
          var3 = null;
          og discarded$2 = sa.a((byte) -13, (String[]) null);
          var2 = new og(false);
          var2.field_h = param1;
          return var2;
        } else {
          var2 = new og(false);
          var2.field_h = param1;
          return var2;
        }
    }

    final static void b(int param0) {
        if (vb.field_n != param0 + -wk.field_i) {
          if (vb.field_n == -wk.field_i + 250) {
            vb.field_n = vb.field_n + 1;
            return;
          } else {
            vb.field_n = vb.field_n + 1;
            return;
          }
        } else {
          vb.field_n = vb.field_n + 1;
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 250) {
          field_g = null;
          field_b = null;
          field_e = null;
          field_g = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          field_g = null;
          return;
        }
    }

    sa(int param0, int param1, int param2, int param3) {
        ((sa) this).field_d = param0;
        ((sa) this).field_a = param3;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Total score: ";
        field_b = "Loading graphics";
    }
}
