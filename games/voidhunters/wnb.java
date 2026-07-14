/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wnb extends rqa {
    static phb[] field_o;
    static String field_p;
    static int field_q;
    static String field_r;

    final static void a(ml param0, byte param1) {
        int[] var2 = null;
        int var3 = 0;
        ml var4 = null;
        ml var5 = null;
        int var6 = 0;
        int[] var7 = null;
        var6 = VoidHunters.field_G;
        if (param1 != -10) {
          return;
        } else {
          var7 = new int[]{27, 43, 27, 43};
          var2 = var7;
          var3 = 0;
          L0: while (true) {
            if (4 <= var3) {
              return;
            } else {
              var4 = new ml(29);
              var5 = new ml(32);
              var5.a(param1 ^ -9, 2, new ml(var7[var3]));
              var5.a(1, 3, new ml(var7[var3]));
              var5.a(1, 4, new ml(var7[var3]));
              var4.a(1, 0, var5);
              param0.a(1, var3, var4);
              var3++;
              continue L0;
            }
          }
        }
    }

    public static void e(int param0) {
        Object var2 = null;
        if (param0 != 0) {
          var2 = null;
          wnb.a((ml) null, (byte) 45);
          field_o = null;
          field_r = null;
          field_p = null;
          return;
        } else {
          field_o = null;
          field_r = null;
          field_p = null;
          return;
        }
    }

    final static String a(int param0) {
        if (!(dw.field_c != dn.field_r)) {
            return tca.field_o;
        }
        if (!(lrb.field_b != dw.field_c)) {
            return vsa.field_q;
        }
        if (param0 < 54) {
            field_o = null;
            if (!(wba.field_p.a(4))) {
                return vsa.field_q;
            }
            return qsb.field_d;
        }
        if (!(wba.field_p.a(4))) {
            return vsa.field_q;
        }
        return qsb.field_d;
    }

    final nc a(nc[] param0, int param1) {
        rma.a(param0[0].a(25), (byte) 47);
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    wnb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Destroy the base with blueprint ships. No respawns.";
        field_q = 0;
        field_r = "Loading sound effects";
    }
}
