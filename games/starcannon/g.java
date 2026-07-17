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
            int discarded$4 = 11199;
            dg.a();
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
            int discarded$5 = 11199;
            dg.a();
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
            int discarded$6 = 11199;
            dg.a();
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
            int discarded$7 = 11199;
            dg.a();
            return;
          }
        }
    }

    public static void b() {
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
