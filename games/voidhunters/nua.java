/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nua extends rqa {
    static int field_p;
    static int field_o;

    nua(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = 76;
          si.a(25, 62, param0[0].a(44));
          return new nc((Object) (Object) "void");
        } else {
          si.a(25, 62, param0[0].a(44));
          return new nc((Object) (Object) "void");
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, String param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12 = 0;
        var12 = -16 / ((param8 - 32) / 48);
        if (li.field_i) {
          return nma.field_b[param11].a(param1, param3, param4, 0, param9, param2, (int[]) null, false, 0, param7, param5, param10, param0, (aja[]) null, -16777216 | param6, (aa) null);
        } else {
          return ita.a(param11, 7988).a(param5, param2, param9, param7, param1, param6, param0, param10, param4, param3);
        }
    }

    final static boolean b(boolean param0) {
        if (!param0) {
            field_o = -106;
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 1;
        field_p = 3;
    }
}
