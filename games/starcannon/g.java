/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static ue field_a;
    static String[] field_b;

    final static void a(int param0) {
        if (null == ti.field_b) {
          if (param0 != 21975) {
            L0: {
              g.a(99);
              if (null != ve.field_f) {
                ve.field_f.l(260);
                break L0;
              } else {
                break L0;
              }
            }
            dg.a(11199);
            return;
          } else {
            L1: {
              if (null != ve.field_f) {
                ve.field_f.l(260);
                break L1;
              } else {
                break L1;
              }
            }
            dg.a(11199);
            return;
          }
        } else {
          ti.field_b.i(param0 + -21975);
          if (param0 == 21975) {
            L2: {
              if (null != ve.field_f) {
                ve.field_f.l(260);
                break L2;
              } else {
                break L2;
              }
            }
            dg.a(11199);
            return;
          } else {
            L3: {
              g.a(99);
              if (null != ve.field_f) {
                ve.field_f.l(260);
                break L3;
              } else {
                break L3;
              }
            }
            dg.a(11199);
            return;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != -12837) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
