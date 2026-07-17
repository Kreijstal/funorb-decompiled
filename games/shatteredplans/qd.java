/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qd {
    static int field_e;
    static int field_f;
    int[] field_c;
    int field_g;
    static boolean field_h;
    static int field_a;
    java.awt.Image field_b;
    int field_d;

    abstract void a(int param0, java.awt.Component param1, byte param2, int param3);

    final void a(byte param0) {
        gf.a(((qd) this).field_c, ((qd) this).field_g, ((qd) this).field_d);
        if (param0 != 109) {
            ((qd) this).field_b = null;
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, byte param4, int param5, int param6) {
        try {
            qg.field_p[param6] = param3;
            qg.field_r[param6] = param2;
            qg.field_m[param6] = param5;
            qg.field_l[param6] = 25;
            qg.field_t[param6] = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "qd.C(" + 25 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + -5 + 44 + param5 + 44 + param6 + 41);
        }
    }

    abstract void a(java.awt.Graphics param0, int param1, byte param2, int param3);

    static {
    }
}
