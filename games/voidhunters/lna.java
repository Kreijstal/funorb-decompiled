/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lna extends rqa {
    static String field_p;
    static boolean[] field_o;

    final static phb[] a(boolean param0, phb param1) {
        phb[] var2 = null;
        phb[] var3 = null;
        var3 = new phb[9];
        var2 = var3;
        if (param0) {
          lna.e((byte) -84);
          var3[4] = param1;
          return var2;
        } else {
          var3[4] = param1;
          return var2;
        }
    }

    public static void e(byte param0) {
        field_p = null;
        if (param0 >= -113) {
            Object var2 = null;
            lna.a((qfa) null, 103);
            field_o = null;
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        si.a(92, 62, param0[0].a(112));
        if (param1 > -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    lna(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(qfa param0, int param1) {
        rjb var7 = null;
        krb var9 = null;
        nk var11 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        L0: {
          if (pra.field_p == null) {
            var7 = new rjb();
            var13 = var7.b(128, (byte) -66, 128, 16);
            pra.field_p = gfb.a(false, var13, -12445);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (pjb.field_vb != null) {
            break L1;
          } else {
            var9 = new krb();
            var14 = var9.b(128, (byte) -29, 128, 16);
            pjb.field_vb = gfb.a(false, var14, -12445);
            break L1;
          }
        }
        L2: {
          var11 = param0.field_yb;
          if (!var11.a(param1 + 77)) {
            break L2;
          } else {
            if (null == lda.field_o) {
              var15 = dbb.a(4.0f, 0.6000000238418579f, (byte) 80, 8, (vjb) (Object) new ko(419684), 16, 128, 128, 0.5f, 4.0f, 16.0f);
              lda.field_o = gfb.a(false, var15, param1 + -12461);
              break L2;
            } else {
              if (param1 == 16) {
                return;
              } else {
                lna.e((byte) -27);
                return;
              }
            }
          }
        }
        if (param1 != 16) {
          lna.e((byte) -27);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "This password is part of your Player Name, and would be easy to guess";
        field_o = new boolean[64];
    }
}
