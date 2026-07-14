/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pba extends rqa {
    static int field_p;
    static int field_o;
    static int field_r;
    static float field_q;

    pba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static vpa b(boolean param0) {
        if (null != saa.field_o) {
          if (param0) {
            vpa discarded$4 = pba.b(false);
            return saa.field_o;
          } else {
            return saa.field_o;
          }
        } else {
          saa.field_o = new vpa();
          if (!param0) {
            return saa.field_o;
          } else {
            vpa discarded$5 = pba.b(false);
            return saa.field_o;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          si.a(9, 62, param0[0].a(95));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_o = 0;
        field_q = 0.25f;
    }
}
