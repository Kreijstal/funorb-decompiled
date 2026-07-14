/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends rqa {
    static int field_q;
    static int field_p;
    static float field_o;

    final static sw a(int param0, int param1) {
        if (param1 != 300) {
            Object var3 = null;
            de.a(86, (phb) null);
            return ok.field_b[param0];
        }
        return ok.field_b[param0];
    }

    final static void a(int param0, phb param1) {
        vbb.e(3);
        dma.a(param1.field_r, param1.field_m, param1.field_n);
        if (param0 <= 22) {
            field_q = -37;
        }
    }

    de(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_q = -123;
          si.a(160, 62, param0[0].a(60));
          return new nc((Object) (Object) "void");
        } else {
          si.a(160, 62, param0[0].a(60));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 500;
        field_o = 0.0f;
        field_p = 300;
    }
}
