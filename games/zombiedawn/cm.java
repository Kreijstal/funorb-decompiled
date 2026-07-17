/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static kd field_c;
    static km[] field_b;
    static String field_a;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 0) {
            cm.a(61);
        }
    }

    final static ji a() {
        String var1 = we.p((byte) 115);
        if (var1 != null) {
            if (var1.indexOf('@') >= 0) {
                var1 = "";
            }
        }
        return new ji(we.p((byte) -21), nb.c(0));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_b = new km[255];
        for (var0 = 0; var0 < field_b.length; var0++) {
            field_b[var0] = new km();
        }
        field_a = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
