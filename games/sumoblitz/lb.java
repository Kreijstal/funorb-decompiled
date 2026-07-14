/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static String[] field_c;
    static int field_b;
    static long field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
            field_c = null;
        }
    }

    final static StringBuilder a(StringBuilder param0, int param1, char param2, int param3) {
        int var5 = 0;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        int var4 = param0.length();
        param0.setLength(param3);
        for (var5 = var4; var5 < param3; var5++) {
            param0.setCharAt(var5, param2);
        }
        if (param1 != 60) {
            field_b = 53;
        }
        return param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = new String[]{"Yes", "No"};
    }
}
