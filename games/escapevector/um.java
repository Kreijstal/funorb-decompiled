/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static byte[] field_b;
    static fc field_d;
    static String field_a;
    static String field_c;

    final static boolean a(int param0) {
        if (param0 != 17830) {
          field_c = (String) null;
          if (ff.field_e < 10) {
            return false;
          }
          if (!nf.field_u) {
            return !rb.a(true) ? true : false;
          }
          return false;
        }
        if (ff.field_e < 10) {
          return false;
        }
        if (!nf.field_u) {
          return !rb.a(true) ? true : false;
        }
        return false;
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_b = new byte[65536];
        qg.a(field_b, 0, 65536, (byte) -128);
        field_a = "Loading...";
        field_d = new fc();
        field_c = "LEFT ARROW";
    }
}
