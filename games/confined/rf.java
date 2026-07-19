/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static ej field_c;
    static double[] field_a;
    static String field_b;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 < 11) {
            double[] var2 = (double[]) null;
            rf.a((mn) null, -0.7974835177805552, (oi) null, (dj) null, (double[]) null, false);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(mn param0, double param1, oi param2, dj param3, double[] param4, boolean param5) {
        double var7_double = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        try {
            var7_double = param3.field_E + param4[9] * param3.field_C;
            if (param5) {
                double[] var15 = (double[]) null;
                rf.a((mn) null, 0.5304627650530377, (oi) null, (dj) null, (double[]) null, false);
            }
            var9 = param3.field_C * param4[10] + param3.field_t;
            var11 = param3.field_C * param4[11] + param3.field_D;
            param2.field_o = var9;
            var13 = param1 * 1.0;
            param2.field_t = var7_double;
            param2.field_p = var11;
            param2.field_u = var13 * 20.0;
            param0.a((rk) (param2), (byte) 97);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "rf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    static {
        field_c = new ej();
        field_a = new double[]{0.5, 0.5, 0.4, 0.3};
        field_b = "<col=FFFFFF>Charge cannon:</col> hold <col=FFFFFF><%0></col> to charge, and you will fire a devastating bolt of energy as soon as your ready energy runs out. You can let go of <col=FFFFFF><%0></col> earlier if you need less power. Avoid the explosion!";
    }
}
