/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static int field_c;
    static boolean field_d;
    static int field_a;
    static String field_b;
    private static String field_z;

    final static String a(String param0, String param1, String param2, byte param3) {
        int var5 = fleas.field_A ? 1 : 0;
        int var4 = param1.indexOf(param0);
        while (var4 != -1) {
            param1 = param1.substring(0, var4) + param2 + param1.substring(var4 + param0.length());
            var4 = param1.indexOf(param0, var4 - -param2.length());
        }
        return param1;
    }

    public static void a(boolean param0) {
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "tj.A(";
        field_d = false;
        field_b = "Waiting for music";
    }
}
