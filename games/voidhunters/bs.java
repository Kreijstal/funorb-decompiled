/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs {
    static gj field_d;
    ooa field_a;
    static int[] field_b;
    static int field_c;

    bs(String param0, llb param1) {
        String[] var3 = null;
        llb[] var4 = null;
        try {
            var3 = new String[]{param0, pp.field_q, dpa.field_o};
            var4 = new llb[]{param1, ci.field_c, (llb) (Object) vra.field_b};
            ((bs) this).field_a = new ooa(0L, vhb.field_c, var3, gfb.field_a, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "bs.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 < 41) {
            bs.a((byte) 78);
            field_d = null;
            field_b = null;
            return;
        }
        field_d = null;
        field_b = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var6 = 24;
        var7 = 5;
        if (param1 > -71) {
          return;
        } else {
          ((bs) this).field_a.a(param3, param4, var6, var7, 60, param2, param0);
          rtb.field_h.a(0, 120, ci.field_c.field_hb, 0, nna.field_w);
          aha.field_o.a(0, -25, ci.field_c.field_hb + -rba.field_a + -84, 2 + nna.field_w, 18);
          rrb.field_b.a(-2 + (ci.field_c.field_hb + -rba.field_a) + -80, 120, rba.field_a + 82, nna.field_w + 2, 18);
          re.field_n.a(0, nna.field_w + 22, 20, rba.field_a, -2 + ci.field_c.field_G - (nna.field_w + 20), ci.field_c.field_hb, 0, 2);
          vra.field_b.a(2, 20, rba.field_a, (byte) 63);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[1024];
        field_c = 0;
        field_d = new gj();
    }
}
