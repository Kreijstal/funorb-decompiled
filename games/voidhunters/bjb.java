/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bjb extends rqa {
    static int field_o;
    static String field_q;
    static qsa[] field_p;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          si.a(7, 62, param0[0].a(103));
          return new nc((Object) (Object) "void");
        }
    }

    final static void a(int param0) {
        L0: {
          if (ssa.b(2)) {
            vc.a(kt.field_r, 2182, 0);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!vrb.a(-116)) {
            vc.a(ega.field_o, 2182, 1);
            vc.a(jmb.field_r, 2182, 2);
            vc.a(jab.field_o, 2182, 3);
            vc.a(fe.field_o, 2182, 4);
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 != 15334) {
          bjb.b(true);
          return;
        } else {
          return;
        }
    }

    bjb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        field_q = null;
        if (param0) {
            bjb.b(false);
            field_p = null;
            return;
        }
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = -2;
        field_q = "Asking for or providing contact information";
    }
}
