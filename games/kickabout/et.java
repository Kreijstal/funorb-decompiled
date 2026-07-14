/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class et {
    static int field_c;
    static boolean field_b;
    static String field_e;
    static String field_a;
    static nu field_d;

    final static ut[] a(int param0, String param1, ut param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = Kickabout.field_G;
        param2 = wm.a((byte) -86, param2, param3);
        ut[] var9 = new ut[2];
        ut[] var4 = var9;
        for (var5 = param0; (var5 ^ -1) > -3; var5++) {
            var4[var5] = new ut(param2.field_o, param2.field_v);
            var6 = 1 == var5 ? 1 : 0;
            iw.a(param0 ^ 55, var9[var5]);
            param2.d(0, 0);
            if (!(var6 != 0)) {
                on.g(0, 0, on.field_g, on.field_f);
            }
            var7 = var6 == 0 ? 0 : 2;
            un.field_d.d(param1.toLowerCase(), var7 + (on.field_g >> 1859216161), -13 + (on.field_f + var7), 0, -1);
            ta.e(123);
            sd.a(var9[var5], (byte) -51);
        }
        return var4;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 < 116) {
            Object var2 = null;
            ut[] discarded$0 = et.a(49, (String) null, (ut) null, 57);
        }
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = "Chat view has been scrolled up. Scroll down to chat.";
        field_e = "type";
    }
}
