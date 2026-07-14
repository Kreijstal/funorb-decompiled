/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static qj field_a;
    static int[] field_c;
    static volatile boolean field_b;

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 59 / ((param3 - 71) / 37);
        int var5 = 0;
        if (!(!param0)) {
            var5 += 4;
        }
        if (!(!param1)) {
            var5 += 2;
        }
        if (!(!param2)) {
            var5++;
        }
        return dk.field_b[var5];
    }

    public static void a(int param0) {
        if (param0 != 18775) {
            field_b = false;
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_b = true;
    }
}
