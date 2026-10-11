/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static boolean field_b;
    static java.awt.Font field_a;

    public static void b(int param0) {
        if (param0 <= 26) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        if (null == ff.field_b) {
          return;
        }
        if (param0 >= -50) {
          field_b = false;
          jd.a(ff.field_b, 160);
          ff.field_b.a(false, jh.field_a);
          ff.field_b = null;
          if (null != da.field_a) {
            da.field_a.a((byte) -110);
            ug.field_y.requestFocus();
            return;
          }
          ug.field_y.requestFocus();
          return;
        }
        jd.a(ff.field_b, 160);
        ff.field_b.a(false, jh.field_a);
        ff.field_b = null;
        if (null == da.field_a) {
          ug.field_y.requestFocus();
          return;
        }
        da.field_a.a((byte) -110);
        ug.field_y.requestFocus();
    }

    static {
        field_b = false;
    }
}
