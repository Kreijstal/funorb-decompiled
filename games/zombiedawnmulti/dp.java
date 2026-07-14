/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp {
    static cj field_b;
    static String field_a;
    static cj field_c;

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!(vd.a(param1, param2, (byte) 109))) {
            return false;
        }
        for (var3 = param0; var3 < param2.length(); var3++) {
            if (!(fl.a(-122, param2.charAt(var3)))) {
                return false;
            }
        }
        return true;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_c = null;
        field_b = null;
    }

    final static void a(byte param0, int param1) {
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 80) {
            return;
        }
        vl var4 = (vl) (Object) lf.field_e.c(param0 + -18);
        while (var4 != null) {
            uk.a((byte) 127, var4, param1);
            var4 = (vl) (Object) lf.field_e.b(param0 ^ 86);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "On";
    }
}
