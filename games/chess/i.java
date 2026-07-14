/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static String field_c;
    static String field_a;
    static String field_b;

    final static String a(int param0, String param1) {
        int var4 = 0;
        int var5 = Chess.field_G;
        int var2 = param1.length();
        char[] var3 = new char[var2];
        for (var4 = param0; var4 < var2; var4++) {
            var3[-var4 + var2 + -1] = param1.charAt(var4);
        }
        return new String(var3);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            Object var2 = null;
            String discarded$0 = i.a(-53, (String) null);
        }
        field_a = null;
        field_c = null;
    }

    final static void a(boolean param0, String param1, int param2, String param3) {
        gg.field_a = param3;
        pi.field_a = param1;
        qd.a(-1845, ii.field_T, param0);
        if (param2 != -5136) {
            Object var5 = null;
            i.a(true, (String) null, 91, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "If you do nothing the game will revert to normal view in <%0> second.";
        field_b = "<%0> is already on your friend list.";
    }
}
