/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static vd field_b;
    static Boolean field_c;
    static String[] field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -681844375) {
            field_a = null;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(byte param0) {
        kj.field_d = new oi();
        if (param0 <= 93) {
            Object var2 = null;
            int discarded$0 = gh.a((byte[]) null, 57, -42, 25);
        }
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = wizardrun.field_H;
        int var4 = -1;
        if (param1 <= 84) {
            gh.a(47);
        }
        for (var5 = param2; var5 < param3; var5++) {
            var4 = var4 >>> -179253400 ^ wd.field_f[255 & (param0[var5] ^ var4)];
        }
        var4 = var4 ^ -1;
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
