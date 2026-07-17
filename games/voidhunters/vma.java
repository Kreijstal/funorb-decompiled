/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vma {
    private static String field_z;

    final static int a(int param0, int param1) {
        if (param1 < 0) {
            param1 = -param1;
        }
        int var2 = 0;
        if (!(65535 >= param1)) {
            var2 = var2 | 16;
            param1 = param1 >>> 16;
        }
        if (param1 > 255) {
            var2 = var2 | 8;
            param1 = param1 >>> 8;
        }
        if (param0 <= 110) {
            return 86;
        }
        if (!(param1 <= 15)) {
            param1 = param1 >>> 4;
            var2 = var2 | 4;
        }
        if (param1 > 3) {
            param1 = param1 >>> 2;
            var2 = var2 | 2;
        }
        if (param1 > 1) {
            param1 = param1 >>> 1;
            var2 = var2 | 1;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "vma.A(";
    }
}
