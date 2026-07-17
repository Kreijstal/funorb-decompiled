/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go extends bp implements nh {
    private int field_i;
    private int field_k;
    private int field_l;
    static ts field_n;
    static int[] field_j;
    static jj field_m;
    static String field_o;
    static hr[] field_p;

    public final void a(ji param0, int param1) {
        try {
            if (param1 != 15149) {
                field_j = null;
            }
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "go.J(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_m = null;
        field_j = null;
        field_o = null;
        field_n = null;
        if (param0 != -17) {
            go.a((byte) 112);
        }
    }

    go(on param0, iw param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, 32879, param1, io.field_g, param2 * (param3 * param4), false);
        try {
            ((go) this).field_i = param2;
            ((go) this).field_k = param3;
            ((go) this).field_l = param4;
            ((go) this).field_e.a((ed) this, 104);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glTexImage3Dub(((go) this).field_h, 0, ((go) this).e(-11), ((go) this).field_i, ((go) this).field_k, ((go) this).field_l, 0, te.a(-21339, ((go) this).field_c), 5121, param5, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "go.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(int param0) {
        super.a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new ts(0, 2, 2, 1);
        field_j = new int[25];
        field_o = "Log in / Create account";
        field_m = new jj("email");
    }
}
