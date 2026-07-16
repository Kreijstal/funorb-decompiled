/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static boolean field_e;
    static ae field_d;
    static String field_b;
    static vi field_a;
    static qj field_c;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 >= -47) {
            tl.a((byte) -113);
        }
    }

    final static boolean a(aa param0, aa param1, int param2) {
        int var4 = wizardrun.field_H;
        if (param2 != -1) {
            Object var5 = null;
            boolean discarded$0 = tl.a((aa) null, (aa) null, 6);
        }
        int var3 = param0.field_ob - param1.field_ob;
        if (me.field_d == param0.field_jb) {
            var3 -= 200;
        } else {
            if (!(null != param0.field_jb)) {
                var3 += 200;
            }
        }
        if (me.field_d == param1.field_jb) {
            var3 += 200;
            return -1 > (var3 ^ -1) ? true : false;
        }
        if (param1.field_jb != null) {
            return -1 > (var3 ^ -1) ? true : false;
        }
        var3 -= 200;
        return -1 > (var3 ^ -1) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = true;
        field_d = new ae();
        field_b = "Username: ";
    }
}
