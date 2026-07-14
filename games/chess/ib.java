/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    static nb field_c;
    static int field_a;
    static ln field_d;
    static String field_b;

    final static int a(boolean param0) {
        if (!param0) {
            ib.a(78);
        }
        return qf.field_a;
    }

    public static void a(int param0) {
        if (param0 != -12374) {
            return;
        }
        field_b = null;
        field_d = null;
        field_c = null;
    }

    final static sa a(String param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Chess.field_G;
        int var2 = param0.length();
        if (param1) {
            return null;
        }
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        return wh.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 80;
        field_b = "<%0> is not a member, and cannot play with the current options.";
    }
}
