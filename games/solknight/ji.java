/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static aj field_b;
    static int field_a;
    static String field_c;

    final static String a(int param0, String param1) {
        int var4 = 0;
        int var5 = SolKnight.field_L ? 1 : 0;
        int var2 = param1.length();
        char[] var3 = new char[var2];
        for (var4 = 0; var4 < var2; var4++) {
            var3[-var4 + (-1 + var2)] = param1.charAt(var4);
        }
        if (param0 != 21762) {
            field_b = null;
        }
        return new String(var3);
    }

    final static boolean a(int param0) {
        if (param0 != -19688) {
            field_c = null;
        }
        return k.field_b;
    }

    public static void a(byte param0) {
        if (param0 != -102) {
            Object var2 = null;
            String discarded$0 = ji.a(-97, (String) null);
        }
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This password contains your email address, and would be easy to guess";
    }
}
