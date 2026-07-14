/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gba extends rqa {
    static int field_q;
    static String field_o;
    static llb field_p;
    static int field_r;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = null;
          si.a(22, 62, param0[0].a(77));
          return new nc((Object) (Object) "void");
        } else {
          si.a(22, 62, param0[0].a(77));
          return new nc((Object) (Object) "void");
        }
    }

    final static void e(int param0) {
        cs.b((byte) -29);
        jia.a(pmb.field_o[0].field_m, nna.field_w, 96, qs.field_c, jk.field_Cb, rba.field_a);
        int var1 = -31 / ((param0 - 58) / 51);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -21968) {
            gba.a(-128);
            field_p = null;
            return;
        }
        field_p = null;
    }

    gba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 0;
        field_r = 0;
        field_o = "Convoy";
    }
}
