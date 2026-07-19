/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static om field_d;
    static cn field_c;
    static ed field_b;
    static ed field_e;
    static String field_a;

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
          field_b = (ed) null;
          field_a = null;
          field_d = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static void a(int param0, int param1) {
        if (null != ni.field_N) {
          L0: {
            if (kn.field_b > param0) {
              kn.field_b = param0;
              ni.field_N.d(kc.field_b * kn.field_b / 64);
              break L0;
            } else {
              break L0;
            }
          }
          if (param1 != 32471) {
            wa.a(false);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_d = new om(15, 0, 1, 0);
        field_a = "Email address is unavailable";
    }
}
