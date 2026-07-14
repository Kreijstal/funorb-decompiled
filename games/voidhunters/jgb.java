/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jgb extends rqa {
    static String field_o;

    public static void e(int param0) {
        field_o = null;
        if (param0 != 0) {
            jgb.e((byte) -59);
        }
    }

    final nc a(nc[] param0, int param1) {
        si.a(36, 62, param0[0].a(33));
        if (param1 >= -119) {
            field_o = null;
        }
        return new nc((Object) (Object) "void");
    }

    final static void e(byte param0) {
        if (param0 > -53) {
            field_o = null;
        }
        dc.a(htb.field_w, -20149, lo.field_b, fh.field_g, qc.field_q);
    }

    jgb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static phb a(int param0) {
        int var4_int = 0;
        int var5 = VoidHunters.field_G;
        int var1 = hla.field_a[0] * nhb.field_o[0];
        byte[] var2 = sh.field_a[0];
        if (param0 >= -65) {
            jgb.e((byte) 85);
        }
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = rlb.field_d[dla.a((int) var2[var4_int], 255)];
        }
        phb var4 = new phb(fbb.field_i, sg.field_H, iib.field_e[0], so.field_f[0], nhb.field_o[0], hla.field_a[0], var3);
        qqb.a(58);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Machine gun";
    }
}
