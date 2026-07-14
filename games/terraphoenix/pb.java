/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static jj field_a;
    static String field_c;
    static int field_b;

    final static ci[] a(int param0, boolean param1, int param2, fa param3) {
        if (vh.a(param0, param2, param3, true)) {
          if (param1) {
            String discarded$2 = pb.a((byte) 72);
            return dj.c(-9);
          } else {
            return dj.c(-9);
          }
        } else {
          return null;
        }
    }

    final static String a(byte param0) {
        if (qe.field_f == ua.field_d) {
          return ra.field_m;
        } else {
          if (param0 == -47) {
            if (pe.field_a != ua.field_d) {
              if (!vc.field_a.a(param0 ^ 78)) {
                return vh.field_l;
              } else {
                return ol.field_Hb;
              }
            } else {
              return vh.field_l;
            }
          } else {
            return null;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -22970) {
            String discarded$0 = pb.a((byte) -7);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new jj();
        field_c = "Please check if address is correct";
    }
}
