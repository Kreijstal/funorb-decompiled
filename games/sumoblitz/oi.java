/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static qr field_a;
    static jn field_b;
    static String field_c;
    static ri field_d;

    final static boolean a(byte param0) {
        return pg.field_a;
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_b = null;
          field_c = null;
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0) {
        if (wd.field_f != null) {
            wd.field_f.e();
            if (null == iv.field_a) {
                return;
            }
            iv.field_a.e();
            return;
        }
        if (null != iv.field_a) {
            iv.field_a.e();
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new qr();
        field_b = new jn();
    }
}
