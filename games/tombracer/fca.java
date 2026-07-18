/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fca {
    static String field_d;
    private cka field_c;
    static int[] field_b;
    long field_a;

    final static void a(boolean param0, int param1) {
        nd.a(-1, param0);
        tc.a(param0, 0);
    }

    protected final void finalize() throws Throwable {
        ((fca) this).field_c.a((byte) -105, ((fca) this).field_a);
        super.finalize();
    }

    public static void a(int param0) {
        field_d = null;
        int var1 = 0;
        field_b = null;
    }

    fca(cka param0, long param1, int param2) {
        try {
            ((fca) this).field_c = param0;
            ((fca) this).field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fca.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_d = "Just play";
    }
}
