/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    int field_d;
    static tg field_f;
    static char[] field_b;
    static java.applet.Applet field_c;
    static vf field_e;
    static int field_a;

    final static StringBuilder a(int param0, char param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var6 = Bounce.field_N;
        int var4 = param3.length();
        param3.setLength(param0);
        if (param2 != 246) {
            return null;
        }
        for (var5 = var4; var5 < param0; var5++) {
            param3.setCharAt(var5, param1);
        }
        return param3;
    }

    public static void a(int param0) {
        if (param0 != 249) {
            a.a(107);
        }
        field_c = null;
        field_b = null;
        field_e = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_e = new vf();
    }
}
