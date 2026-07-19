/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static int field_a;
    static volatile int field_e;
    static rh field_c;
    static int field_d;
    static String field_b;

    public static void a(int param0) {
        field_c = null;
        int var1 = -79 % ((param0 - -15) / 50);
        field_b = null;
    }

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = Geoblox.field_C;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = param0; var4 < param2; var4++) {
            var6[var4] = param1;
        }
        return new String(var6);
    }

    final static ff a(byte param0) {
        if (ac.field_t == null) {
            ac.field_t = new ff(hh.field_d, 20, 0, 0, 0, 11579568, -1, 0, 0, hh.field_d.field_o, -1, 2147483647, true);
        }
        if (param0 >= -39) {
            ah.a(-8);
        }
        return ac.field_t;
    }

    static {
        field_e = 0;
        field_d = 0;
        field_b = "Connection lost - attempting to reconnect";
    }
}
