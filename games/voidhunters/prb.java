/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class prb extends rqa {
    prb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static ri[] e(byte param0) {
        if (param0 >= -40) {
          return null;
        } else {
          return new ri[]{vp.field_e, gha.field_r, go.field_o, efb.field_c, dh.field_r, dmb.field_b, dh.field_o, eaa.field_p, tpa.field_a, ppb.field_c, ae.field_g, qw.field_g, erb.field_o, qc.field_g};
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
          if (null == flb.field_o) {
            if (aaa.field_b != null) {
              aaa.field_b.e();
              return;
            } else {
              return;
            }
          } else {
            flb.field_o.e();
            if (aaa.field_b == null) {
              return;
            } else {
              aaa.field_b.e();
              return;
            }
          }
        } else {
          return;
        }
    }

    final static phb[] a(boolean param0, int param1) {
        phb[] var2 = null;
        phb[] var3 = null;
        var3 = new phb[9];
        var2 = var3;
        if (!param0) {
          return null;
        } else {
          var3[4] = mra.a(param1, (byte) -113, 64);
          return var2;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(44, 111));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        kf discarded$0 = new kf();
    }
}
