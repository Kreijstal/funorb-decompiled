/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends i {
    private int field_J;
    static String[][] field_G;
    static String field_F;
    private int field_H;
    static tf field_K;
    static int field_I;

    ce(sp param0) {
        super(30, (lv) (Object) param0.field_Sb);
        ((ce) this).field_H = param0.field_Fb;
        ((ce) this).field_J = param0.field_Qb;
        String var5 = param0.field_Sb.d(100);
        String var2 = var5;
        String var3 = param0.field_Nb;
        String var4 = vo.a((byte) -18, gd.field_e[30], new String[2]);
        ((ce) this).a(var4, ((ce) this).field_t, ((ce) this).field_D, -91, ((ce) this).field_u);
    }

    public static void g(int param0) {
        if (param0 != 30) {
            ce.g(9);
        }
        field_G = null;
        field_K = null;
        field_F = null;
    }

    final void a(int param0, int param1) {
        if (param0 < 60) {
            field_I = 64;
        }
        super.a(95, param1);
        if (param1 == 0) {
            ld.a((byte) -25, ((ce) this).field_H, ((ce) this).field_J);
        }
    }

    final static String a(char param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        if (param1 != 48) {
            return null;
        }
        for (var4 = 0; var4 < param2; var4++) {
            var6[var4] = param0;
        }
        return new String(var6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new String[][]{new String[57], new String[44], new String[50], new String[51]};
        field_F = "Honour";
        field_K = new tf();
    }
}
