/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp {
    static int[][] field_a;

    public static void a() {
        field_a = null;
    }

    final static float a(float param0, float param1, byte param2, float param3, int param4) {
        float[] var6 = bs.field_f[param4];
        float[] var5 = var6;
        return var6[0] * param3 + var6[1] * param1 + var6[2] * param0;
    }

    final static void a(int param0, int param1, int param2, ka param3, int param4, int param5, int param6) {
        gda var7 = null;
        if (param4 != -1918106173) {
            field_a = null;
        }
        if (!(param3 != null)) {
            param3 = qi.field_O;
        }
        if (!(param3 != null)) {
            return;
        }
        try {
            tga.field_a.ya();
            tga.field_a.DA(param6, param5, 32, 32);
            var7 = tga.field_a.e();
            var7.a();
            var7.d(param1 << 3);
            var7.c(-param2 << 3);
            param3.a(var7, (el) null, param0 * 128 / 2048, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "hp.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
