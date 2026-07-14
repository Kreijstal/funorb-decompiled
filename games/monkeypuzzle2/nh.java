/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends ug {
    static le[][][] field_f;
    int field_g;
    byte[] field_h;
    long field_e;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = -((param2 - param3) * (param5 - param0)) + (param1 + -param8) * (-param6 + param7);
        if (!(0 != var9)) {
            return false;
        }
        int var10 = -(param6 * param2) + param7 * param3;
        int var11 = -param6 + param7;
        int var12 = param2 - param3;
        int var13 = param8 * param5 - param0 * param1;
        int var14 = -param0 + param5;
        int var15 = -param8 + param1;
        if (param4 != -5425) {
            field_f = null;
        }
        ll.field_a = (var10 * var14 + -(var11 * var13)) / var9;
        ok.field_b = (-(var12 * var13) + var10 * var15) / var9;
        return true;
    }

    public static void a(int param0) {
        if (param0 != -19931) {
            field_f = null;
        }
        field_f = null;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        for (var1 = 0; -18 < (var1 ^ -1); var1++) {
            pe.field_d[var1] = new wg(320.0f, (float)(-(var1 * 2) + 0));
        }
        var1 = -117 % ((-69 - param0) / 44);
        for (var2 = 1; var2 < 17; var2++) {
            hh.field_n[var2 + -1] = new gb(pe.field_d[-1 + var2], pe.field_d[var2], 30.0f);
        }
        var2 = 16;
        int var3 = 1;
        while (-33 < (var2 ^ -1)) {
            hh.field_n[var2] = new gb(pe.field_d[var3], 240.0f, (float)(var3 * 30), 2.0f);
            var3++;
            var2++;
        }
    }

    final static void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var1 = 37 % ((45 - param0) / 61);
        for (var2 = 1; var2 < 17; var2++) {
            pe.field_d[var2].field_f[0] = 0.0f;
            pe.field_d[var2].field_f[1] = pe.field_d[var2].field_f[1] + 8.0f;
            pe.field_d[var2].e(-85);
        }
        for (var1 = 0; 3 > var1; var1++) {
            var2 = (1 & var1) != 0 ? 0 : 15;
            var3 = (1 & var1) == 0 ? -1 : 16;
            var4 = (1 & var1) != 0 ? 1 : -1;
            var5 = var2;
            while (var3 != var5) {
                hh.field_n[var5].c((byte) 122);
                var5 = var5 + var4;
            }
        }
        pe.field_d[0].field_e[1] = 0.0f;
        pe.field_d[0].field_e[0] = 240.0f;
        pe.field_d[0].field_i[0] = 240.0f;
        pe.field_d[0].field_i[1] = 0.0f;
    }

    nh(long param0, int param1, byte[] param2) {
        ((nh) this).field_e = param0;
        ((nh) this).field_g = param1;
        ((nh) this).field_h = param2;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        oa.field_I = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        if (param0 <= 30) {
            field_f = null;
        }
        long var4 = -1L;
        wg.a(var2, param1, var3, -26372, var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new le[2][5][];
    }
}
