/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fj extends ln {
    static go field_s;
    static lc field_o;
    static String field_r;
    static int[] field_q;
    static String field_p;

    final static wd a(boolean param0, float param1, wd param2) {
        if (param0) {
            field_p = null;
        }
        return wc.a(param2, 0.0f, param1, (byte) -115);
    }

    final static void a(boolean param0, boolean param1) {
        vk.a(param0, param1, -113);
    }

    final static void f(int param0) {
        ka.field_g = param0;
    }

    fj() {
    }

    final static int a(int[] param0, byte param1, int param2) {
        int var3 = 0;
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        param2 = param2 - param0[0];
        int var4 = param0.length - 1;
        if (param1 != -119) {
            field_s = null;
        }
        for (var3 = 0; var3 < var4; var3++) {
            var5 = param0[1 + var3];
            if (var5 > param2) {
                if (-16 > (param2 ^ -1)) {
                    return var3;
                }
            }
            param2 = param2 - var5;
        }
        return -1;
    }

    final static hj a(int param0, int param1, hj param2, int param3, int param4, int param5) {
        hj var6 = new hj(param5, param3);
        hj.a(param2, var6, param1, param4, 0, param0, param5, param3);
        return var6;
    }

    public static void b(byte param0) {
        field_p = null;
        field_s = null;
        field_q = null;
        int var1 = -99 / ((param0 - -1) / 60);
        field_o = null;
        field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Unpacking levels";
        field_p = "Snowcat";
    }
}
