/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static String field_c;
    static int field_a;
    static int field_b;

    final static boolean a(CharSequence param0, byte param1, boolean param2) {
        int var3 = 0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 59) {
            field_a = -65;
        }
        if (!qc.a(640, param2, param0)) {
            return false;
        }
        for (var3 = 0; var3 < param0.length(); var3++) {
            if (!(pm.a(param0.charAt(var3), 45))) {
                return false;
            }
        }
        return true;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 101) {
            field_c = null;
        }
    }

    final static boolean a(ab param0, byte param1) {
        if (param1 <= 108) {
            Object var3 = null;
            boolean discarded$0 = hd.a((ab) null, (byte) -121);
        }
        return -2 == (param0.d(28089, 1) ^ -1) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "The game options are not all set.";
        field_b = 2;
    }
}
