/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class itb extends rqa {
    static long field_p;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        si.a(187, 62, param0[0].a(39));
        if (param1 > -119) {
            ri discarded$0 = itb.a(-47, -122);
        }
        return new nc((Object) (Object) "void");
    }

    final static ri a(int param0, int param1) {
        ri[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ri[] var5 = null;
        var4 = VoidHunters.field_G;
        var5 = prb.e((byte) -66);
        var2 = var5;
        var3 = param0;
        L0: while (true) {
          if (var3 < var5.length) {
            if (param1 != var5[var3].field_a) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    itb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
