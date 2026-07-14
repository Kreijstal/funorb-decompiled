/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static int[] field_b;
    static char[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -78) {
            field_b = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, ka[] param8, int param9, int param10, int param11, int param12, int param13) {
        int var14 = ef.field_j[0];
        int var15 = ef.field_j[1];
        int var16 = var14 - param0 >> 849703361;
        if (!(null != de.field_a)) {
            de.field_a = new ka(var14, var15);
        }
        int var17 = -param4 + var15 >> -877073887;
        de.field_a.d();
        qg.b();
        hd.a(param8, param4, param0, (byte) -96, var17, var16);
        qg.a(param7 + var16, param6 + var17, param5, param12, param1, 9186335, 240);
        if (!(gf.field_n != null)) {
            gf.field_n = new ka(var14, var15);
        }
        gf.field_n.d();
        qg.b();
        qg.b(param3 + var16, param2 + var17, param9, param10, param11, 16777215);
        de.field_a.d();
        od.b(gf.field_n, 0, 0, 0, param13);
        la.field_f.a(-97);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new char[]{(char)91, (char)93, (char)35};
        field_b = new int[16];
    }
}
