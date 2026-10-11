/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static boolean field_b;
    static String field_a;

    public static void b(byte param0) {
        if (param0 < 10) {
          return;
        }
        field_a = null;
    }

    final static boolean a(byte param0) {
        wb.field_b = true;
        if (param0 == -75) {
          nj.field_n = fa.a(110) + 15000L;
          return mh.field_U == 11 ? true : false;
        }
        return false;
    }

    static {
        field_a = "Username: ";
    }
}
