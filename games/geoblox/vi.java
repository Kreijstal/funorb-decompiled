/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends hk {
    static String field_F;
    static long field_H;
    static String field_G;
    static int field_E;

    public static void f(int param0) {
        if (param0 >= -65) {
            Object var2 = null;
            rj[] discarded$0 = vi.a(98, (d) null);
        }
        field_F = null;
        field_G = null;
    }

    private vi(String param0, bb param1) {
        this(param0, hb.field_j.field_j, param1);
        ((vi) this).field_q = hb.field_j.field_c;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((vi) this).field_y = !((vi) this).field_y ? true : false;
        super.a(param0, param1, param2, param3);
    }

    private vi(String param0, dh param1, bb param2) {
        super(param0, param1, param2);
        ((vi) this).field_q = hb.field_j.field_c;
    }

    final static rj[] a(int param0, d param1) {
        int var5 = 0;
        rj var6 = null;
        int var7 = Geoblox.field_C;
        if (!param1.b(-26098)) {
            return new rj[]{};
        }
        cb var8 = param1.a(34);
        while (-1 == (var8.field_a ^ -1)) {
            bc.a(0, 10L);
        }
        if ((var8.field_a ^ -1) == -3) {
            return new rj[]{};
        }
        int[] var12 = (int[]) var8.field_b;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        rj[] var4 = new rj[var12.length >> 1614960386];
        if (param0 <= 61) {
            field_H = 120L;
        }
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new rj();
            var4[var5] = var6;
            var6.field_d = var3[var5 << -876051902];
            var6.field_f = var3[1 + (var5 << 2035283458)];
            var6.field_h = var3[2 + (var5 << -585328574)];
            var6.field_a = var3[(var5 << -32412094) + 3];
        }
        return var4;
    }

    vi(String param0, bb param1, boolean param2) {
        this(param0, param1);
        ((vi) this).field_y = param2 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Play the game without logging in just yet";
        field_G = "Updates will sent to the email address you've given";
        field_E = 12;
    }
}
