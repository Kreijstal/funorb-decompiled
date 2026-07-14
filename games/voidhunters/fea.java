/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fea extends rqa {
    fea(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        uga.field_d = false;
        if (null == fkb.field_m) {
          if ((ow.field_b ^ -1) != param0) {
            dr.a(26718);
            ejb.field_p = 0;
            return;
          } else {
            ejb.field_p = 0;
            return;
          }
        } else {
          fkb.field_m.j(16384);
          if ((ow.field_b ^ -1) == param0) {
            ejb.field_p = 0;
            return;
          } else {
            dr.a(26718);
            ejb.field_p = 0;
            return;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc(jnb.field_o);
    }

    static {
    }
}
