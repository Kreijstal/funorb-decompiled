/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo {
    static String field_b;
    static byte[] field_a;
    static String field_d;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 != 4666) {
            lo.a(83);
        }
    }

    final static StringBuilder a(int param0, StringBuilder param1, int param2, char param3) {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        int var4 = param1.length();
        if (param0 != -26750) {
            field_a = null;
        }
        param1.setLength(param2);
        for (var5 = var4; var5 < param2; var5++) {
            param1.setCharAt(var5, param3);
        }
        return param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Hide chat";
        field_d = "To report a player, right-click on their name and select the option to report abuse.";
        field_c = "No players";
    }
}
