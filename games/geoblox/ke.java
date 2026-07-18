/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static dm[][][] field_a;

    final static void a(int param0, boolean param1, int param2, int param3, qc param4) {
        try {
            param4.d((byte) 126, 12);
            param4.e(17, 28695);
            param4.e(param2, 28695);
            param4.e(param3, 28695);
            param4.d((byte) 124, param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ke.B(" + param0 + ',' + true + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 > -72) {
            ke.a((byte) 94);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void b() {
        int var1 = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new dm[7][7][7];
    }
}
