/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp {
    static int[][] field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 32) {
            float discarded$0 = hp.a(-1.4429486989974976f, -0.21872800588607788f, (byte) 122, 0.9918611645698547f, 90);
        }
    }

    final static float a(float param0, float param1, byte param2, float param3, int param4) {
        float[] var5 = null;
        float[] var6 = null;
        var6 = bs.field_f[param4];
        var5 = var6;
        if (param2 != 26) {
          return -1.8763647079467773f;
        } else {
          return var6[0] * param3 + var6[1] * param1 + var6[2] * param0;
        }
    }

    final static void a(int param0, int param1, int param2, ka param3, int param4, int param5, int param6) {
        gda var7 = null;
        if (param4 != -1918106173) {
            field_a = null;
            if (!(param3 != null)) {
                param3 = qi.field_O;
            }
            if (!(param3 != null)) {
                return;
            }
            tga.field_a.ya();
            tga.field_a.DA(param6, param5, 32, 32);
            var7 = tga.field_a.e();
            var7.a();
            var7.d(param1 << -1918106173);
            var7.c(-param2 << -499629181);
            param3.a(var7, (el) null, param0 * 128 / 2048, 0);
            return;
        }
        if (!(param3 != null)) {
            param3 = qi.field_O;
        }
        if (!(param3 != null)) {
            return;
        }
        tga.field_a.ya();
        tga.field_a.DA(param6, param5, 32, 32);
        var7 = tga.field_a.e();
        var7.a();
        var7.d(param1 << -1918106173);
        var7.c(-param2 << -499629181);
        param3.a(var7, (el) null, param0 * 128 / 2048, 0);
    }

    static {
    }
}
