/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io extends td {
    static sna field_q;
    static int field_p;
    static String field_r;

    final static void a(gb param0, boolean param1, int param2) {
        pf var3 = sja.field_fb;
        var3.c(param2, (byte) 127);
        var3.d(param0.field_g, 0);
        var3.b(param0.field_h, -127);
        if (!param1) {
            field_p = -86;
        }
    }

    final static boolean a(boolean param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        if (!(!Character.isISOControl(param1))) {
            return false;
        }
        if (hm.a((byte) 110, param1)) {
            return true;
        }
        char[] var10 = uj.field_s;
        char[] var8 = var10;
        char[] var6 = var8;
        char[] var2 = var6;
        for (var3 = 0; var10.length > var3; var3++) {
            var4 = var10[var3];
            if (!(param1 != var4)) {
                return true;
            }
        }
        char[] var11 = ra.field_r;
        if (!param0) {
            boolean discarded$0 = io.a(false, '5');
        }
        int var7 = 0;
        var3 = var7;
        while (var7 < var11.length) {
            var4 = var11[var7];
            if (!(var4 != param1)) {
                return true;
            }
            var7++;
        }
        return false;
    }

    public static void b(int param0) {
        if (param0 >= -114) {
            boolean discarded$0 = io.a(false, 'Z');
        }
        field_q = null;
        field_r = null;
    }

    io(int param0, aga param1, nq param2) {
        super(param0, param1);
        ((io) this).field_j = param2;
    }

    final ii a(op param0, int param1) {
        hla var5 = null;
        if (param1 != 3) {
            io.b(87);
        }
        aga var6 = ((io) this).field_h.a(71, param0);
        aga var4 = ((io) this).field_j.a(67, param0);
        if (var4 != null) {
            if (null == param0.field_a[var4.field_x][var4.field_J].field_l) {
                if (var4.field_A) {
                    var5 = new hla(((io) this).field_g, new nq(var6), ((io) this).field_j);
                    var5.field_o.a((bw) (Object) new iv(new nq(var4), false, 1, -(var4.field_t >> -1309717375), 0), true);
                    var5.field_o.a((bw) (Object) new cn(new nq(var4), var4.field_x, var4.field_J), true);
                    return (ii) (Object) var5;
                }
            }
        }
        return (ii) (Object) new ew(new nq(var6));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Advertising websites";
    }
}
