/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static String field_g;
    static String field_f;
    static String field_e;
    static vj field_a;
    static String field_b;
    static boolean field_c;
    static vj field_h;
    static String field_d;

    public static void a(int param0) {
        if (param0 != -27513) {
            return;
        }
        field_d = null;
        field_f = null;
        field_g = null;
        field_b = null;
        field_e = null;
        field_h = null;
        field_a = null;
    }

    final static pi[] b(int param0) {
        int var2 = 0;
        int var3 = client.field_A ? 1 : 0;
        pi[] var1 = new pi[ec.field_g];
        if (param0 > -110) {
            return null;
        }
        for (var2 = 0; var2 < ec.field_g; var2++) {
            var1[var2] = new pi(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], tc.field_Nb[var2], mb.field_d);
        }
        oa.a(126);
        return var1;
    }

    final static void a(byte param0) {
        int var5 = client.field_A ? 1 : 0;
        int[] var6 = nm.field_Nb;
        int[] var1 = var6;
        int var2 = -61 % ((60 - param0) / 38);
        int var3 = 0;
        int var4 = var6.length;
        while (var3 < var4) {
            var3++;
            var6[var3] = 0;
            var3++;
            var6[var3] = 0;
            var3++;
            var6[var3] = 0;
            var3++;
            var6[var3] = 0;
            var3++;
            var6[var3] = 0;
            var3++;
            var6[var3] = 0;
            var3++;
            var6[var3] = 0;
            var3++;
            var6[var3] = 0;
        }
    }

    final static void a(cc param0, int param1, int param2, byte param3, int param4, cc param5) {
        if (param3 >= -62) {
            field_d = null;
        }
        nf.field_g = param0;
        da.field_c = param5;
        mb.field_c = param1;
        qk.field_m = param4;
        pa.field_Y = param2;
    }

    final static boolean a(char param0, byte param1) {
        if (param1 < 66) {
            ci.a((byte) -16);
        }
        if (!(!Character.isISOControl(param0))) {
            return false;
        }
        if (j.a(-8241, param0)) {
            return true;
        }
        if (45 != param0) {
            if (160 != param0) {
                if (32 != param0) {
                    if (param0 != 95) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<%0> has not yet unlocked this option for use.";
        field_g = "Hide private chat and appear offline to friends";
        field_e = "Please select an option in the '<%0>' row.";
        field_a = new vj();
        field_b = "Try changing the '<%0>' setting.";
        field_d = "Click or press F10 to open Quick Chat";
    }
}
