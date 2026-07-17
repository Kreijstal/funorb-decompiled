/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rab extends kva implements gf {
    static int field_n;
    private int field_j;
    static wsb field_m;
    private int field_l;
    private int field_k;

    public final void b(int param0) {
        super.b(param0);
    }

    public final void a(tu param0, int param1) {
        if (param1 != -28798) {
            return;
        }
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rab.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != 148) {
            rab.a(-7);
            field_m = null;
            return;
        }
        field_m = null;
    }

    rab(jp param0, kb param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, 32879, param1, mj.field_f, param4 * (param2 * param3), false);
        try {
            ((rab) this).field_l = param3;
            ((rab) this).field_k = param4;
            ((rab) this).field_j = param2;
            ((rab) this).field_h.a((ura) this, -116);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glTexImage3Dub(((rab) this).field_e, 0, ((rab) this).e((byte) -31), ((rab) this).field_j, ((rab) this).field_l, ((rab) this).field_k, 0, una.a(-29328, ((rab) this).field_f), 5121, param5, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rab.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
    }
}
