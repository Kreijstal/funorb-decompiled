/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dda extends vg {
    static int[] field_f;
    private bs field_g;

    final bs a(byte param0) {
        if (param0 != -125) {
            dda.a(112);
        }
        return ((dda) this).field_g;
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 30967) {
            field_f = null;
        }
    }

    dda(hca param0, bs param1) {
        try {
            ((dda) this).field_g = param1;
            dt discarded$0 = param0.C(-1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "dda.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(boolean param0, String param1) {
        return wp.a(119, param1) != null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_f = new int[98];
        for (var0 = 0; var0 < 98; var0++) {
            field_f[var0] = 3;
        }
        field_f[5] = 2;
        field_f[33] = 2;
        field_f[31] = 2;
        field_f[43] = 2;
        field_f[30] = 2;
        field_f[39] = 2;
        field_f[32] = 2;
        field_f[29] = 2;
        field_f[41] = 2;
        field_f[40] = 2;
        field_f[42] = 2;
    }
}
