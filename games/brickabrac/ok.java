/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static String field_a;
    static int field_c;
    static String[] field_b;
    static jp field_g;
    static String field_e;
    static int field_f;
    static mh field_d;

    final static void a(int param0) {
        if (!(ol.field_s)) {
            throw new IllegalStateException();
        }
        ci.field_t = true;
        lf.a((byte) -78, false);
        i.field_j = 0;
    }

    public static void b(int param0) {
        field_d = null;
        field_g = null;
        field_a = null;
        field_e = null;
        field_b = null;
    }

    final static boolean a(boolean param0) {
        if (param0) {
          if (null != jj.field_a) {
            if (!jj.field_a.a((byte) -32)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$5 = ok.a(true);
          if (null != jj.field_a) {
            if (!jj.field_a.a((byte) -32)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Log in";
        field_b = new String[24];
        field_e = "Updates will sent to the email address you've given";
        field_c = 0;
    }
}
