/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends ai {
    static String field_g;
    int field_h;

    public static void b(byte param0) {
        if (param0 >= -40) {
            return;
        }
        field_g = null;
    }

    ab(int param0) {
        ((ab) this).field_h = param0;
    }

    final static boolean a(String param0, byte param1) {
        int var3 = 0;
        int var4 = Bounce.field_N;
        if (param1 != -12) {
            return true;
        }
        int var2 = param0.charAt(0);
        for (var3 = 1; var3 < param0.length(); var3++) {
            if (param0.charAt(var3) != var2) {
                return false;
            }
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Cancel";
    }
}
