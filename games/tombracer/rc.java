/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static ei[] field_a;
    static jpa[] field_b;

    final static void a(int param0, int param1, pha param2, byte param3, int param4, int param5, iv param6) {
        lja var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
            paa.a(param6, -1, param2.field_vb, param2.field_yb, -11635, (int[]) null, (jea) (Object) param2, -1, param2.field_wb);
            hka.field_b.a((byte) -22, true);
            hka.field_b.a((int[]) null, 0, 19);
            hka.field_b.c(0);
            var7 = hka.field_b;
            var8 = param0;
            var9 = param1;
            var10 = 0;
            var11 = 0;
            var7.field_f.b(var9, var11, -80, var10, var8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rc.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + -93 + ',' + 0 + ',' + 0 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    static {
    }
}
