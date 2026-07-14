/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ku extends bca {
    static boolean field_q;

    ku(lu param0) {
        super(param0);
        ((ku) this).field_k = param0.e((byte) 72);
        ((ku) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (var2 < 0) {
                break;
            }
            ((ku) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new cu(param1, (ku) this);
    }

    final static void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        int var1 = wa.field_m[0];
        if (param0 != -372) {
            field_q = false;
            for (var2 = 1; var2 < wa.field_m.length; var2++) {
                var3 = wa.field_m[var2];
                bl.a(ci.field_q, var2 << -1490432156, ci.field_q, var1, var3);
                var1 = var1 + var3;
            }
            return;
        }
        for (var2 = 1; var2 < wa.field_m.length; var2++) {
            var3 = wa.field_m[var2];
            bl.a(ci.field_q, var2 << -1490432156, ci.field_q, var1, var3);
            var1 = var1 + var3;
        }
    }

    ku(int param0, nq param1) {
        super(param0, param1);
    }

    final void a(op param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        ((ku) this).a(param0, (byte) -2);
        for (var3 = 0; param0.field_z > var3; var3++) {
            for (var4 = 0; param0.field_B > var4; var4++) {
                if (param0.field_a[var3][var4].field_i) {
                }
                param0.field_a[var3][var4].field_i = false;
            }
        }
        var3 = -50 / ((12 - param1) / 35);
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        pj.field_b[param6] = param2;
        pj.field_c[param6] = param4;
        int var7 = 77 % ((-13 - param0) / 38);
        pj.field_l[param6] = param1;
        pj.field_h[param6] = param3;
        pj.field_o[param6] = param5;
    }

    final void a(byte param0, lu param1) {
        if (param0 >= -12) {
            return;
        }
        this.a((byte) -98, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = true;
    }
}
