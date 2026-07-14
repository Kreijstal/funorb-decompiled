/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends di {
    static kp field_eb;
    int field_cb;
    String field_bb;
    String field_I;
    static String field_db;
    static pj field_fb;

    public static void a(byte param0) {
        if (param0 >= -93) {
            cl.a((byte) 36);
        }
        field_fb = null;
        field_db = null;
        field_eb = null;
    }

    final static int a(int param0, byte[] param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        int var4 = -1;
        for (var5 = param0; var5 < param2; var5++) {
            var4 = var4 >>> -2039566584 ^ vg.field_e[(param1[var5] ^ var4) & 255];
        }
        var4 = var4 ^ -1;
        if (param3 != -105) {
            cl.a((byte) -28);
        }
        return var4;
    }

    cl() {
        super(0L, (di) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = "Create your own free Jagex account";
        field_eb = new kp();
    }
}
