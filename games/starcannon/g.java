/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static ue field_a;
    static String[] field_b;

    final static void a(int param0) {
        if (null != ti.field_b) {
          ti.field_b.i(param0 - 21975);
          if (param0 != 21975) {
            g.a(99);
            if (null != ve.field_f) {
              ve.field_f.l(260);
            }
            dg.a(11199);
            return;
          }
          if (null != ve.field_f) {
            ve.field_f.l(260);
          }
          dg.a(11199);
          return;
        }
        if (param0 == 21975) {
          if (null != ve.field_f) {
            ve.field_f.l(260);
          }
          dg.a(11199);
          return;
        }
        g.a(99);
        if (null != ve.field_f) {
          ve.field_f.l(260);
        }
        dg.a(11199);
    }

    public static void b(int param0) {
        if (param0 != -12837) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
