/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mca {
    short[] field_a;
    byte[] field_b;
    static String field_d;
    short[] field_e;
    short[] field_c;

    final static boolean a(byte param0, int param1) {
        if (0 == param1 || pl.a((byte) 64) == param1) {
            return true;
        }
        if (param0 != 6) {
            mca.a((byte) 65, -116);
        }
        if (vpa.a(114)) {
            return false;
        }
        if (mq.field_e != null) {
            return !mq.field_e.a((byte) -102, param1) ? false : true;
        }
        return false;
    }

    final static void a(kb param0, int param1, int param2) {
        kh var7 = null;
        kh var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        try {
            var7 = ql.field_k;
            var8 = var7;
            var8.k(param2, -2988);
            var8.field_h = var8.field_h + 1;
            var4 = var8.field_h;
            var8.i(1, 0);
            var8.f(-1477662136, param0.field_l);
            var8.f(-1477662136, param0.field_f);
            var8.f(param1 ^ -1477662136, param0.field_n);
            var8.a(param0.field_i, (byte) -36);
            var8.a(param0.field_g, (byte) -75);
            var8.a(param0.field_k, (byte) -63);
            var8.a(param0.field_j, (byte) 124);
            var8.i(param0.field_o.length, 0);
            for (var5 = param1; var5 < param0.field_o.length; var5++) {
                var7.a(param0.field_o[var5], (byte) 96);
            }
            var8.g(var4, 64);
            var8.d(-var4 + var8.field_h, (byte) 72);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mca.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 0) {
            field_d = (String) null;
        }
    }

    static {
        field_d = "Please enter your date of birth to enable chat:";
    }
}
