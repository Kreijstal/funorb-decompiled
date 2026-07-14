/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends ck {
    static String[] field_J;
    static String field_M;
    static int field_N;
    static en field_O;
    static int field_L;
    static String field_K;
    static String field_I;

    rb(String param0, pg param1, boolean param2) {
        this(param0, param1);
        ((rb) this).field_E = param2 ? true : false;
    }

    final static int[] b(int param0, int param1, int param2) {
        int var4 = 0;
        int[] var5 = new int[param2];
        int[] var3 = var5;
        for (var4 = 0; var4 < 64; var4++) {
            var5[var4] = hj.a((byte) 101, param0, var4 << 1995500002, param1);
        }
        return var5;
    }

    final static cn a(int param0, cn param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        cn var7 = new cn(param1.field_y + param0 * 2, param1.field_v - -(param0 * 2));
        jh.a(var7);
        for (var5 = 0; var5 < param0; var5++) {
            param1.e(-param1.field_w + param0, param0 - param1.field_A, param2);
            gf.d(1, 1, 0, 0, var7.field_y, var7.field_v);
        }
        param1.e(param0 - param1.field_w, -param1.field_A + param0, 0);
        jh.b();
        var7.field_A = param1.field_A - param0;
        var7.field_w = param1.field_w - param0;
        var5 = 64 / ((34 - param3) / 42);
        return var7;
    }

    public static void a(int param0) {
        field_O = null;
        if (param0 != 4935) {
            rb.a(39);
        }
        field_I = null;
        field_J = null;
        field_M = null;
        field_K = null;
    }

    final static int a(byte param0, boolean param1, String param2) {
        if (param0 <= 91) {
            Object var4 = null;
            int discarded$0 = rb.a((byte) -6, true, (String) null);
        }
        if (!param1) {
            return hc.field_e.b(param2);
        }
        return mp.field_a.b(param2);
    }

    private rb(String param0, pg param1) {
        this(param0, hl.field_a.field_o, param1);
        ((rb) this).field_o = hl.field_a.field_q;
    }

    private rb(String param0, ca param1, pg param2) {
        super(param0, param1, param2);
        ((rb) this).field_o = hl.field_a.field_q;
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((rb) this).field_E = !((rb) this).field_E ? true : false;
        super.b(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new String[]{"Rank", "Name", "Renown", "Last Raided"};
        field_N = -1;
        field_K = "The attack of this monster is lethal.";
        field_L = 0;
        field_I = "<col=8B1717>Disarm</col>";
        field_M = "Defences: ";
    }
}
