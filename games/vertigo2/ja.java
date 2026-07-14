/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static volatile int field_h;
    static qb field_d;
    static cr field_b;
    static int field_a;
    static String field_g;
    static String field_c;
    static cr field_e;
    static od field_f;

    final static boolean a(int param0) {
        if (!il.field_a) {
            return false;
        }
        if (param0 != (ui.field_g ^ -1)) {
            return false;
        }
        return true;
    }

    final static String a(String param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var2 = param0.length();
        char[] var3 = new char[var2];
        if (param1 != -44) {
            boolean discarded$0 = ja.a(75);
        }
        for (var4 = 0; var4 < var2; var4++) {
            var5 = param0.charAt(var4);
            if (var4 != 0) {
                var5 = Character.toLowerCase((char) var5);
            } else {
                var5 = jp.a(true, (char) var5);
            }
            var3[var4] = (char)var5;
        }
        return new String(var3);
    }

    public static void b(int param0) {
        if (param0 <= 114) {
            return;
        }
        field_f = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_g = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_h = -1;
        field_g = "Quick Chat game";
        field_c = "Play rated game";
    }
}
