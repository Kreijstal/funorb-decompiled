/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends rt {
    private int field_m;
    static dl field_p;
    static String field_l;
    static boolean[] field_k;
    static gk field_q;
    static vd[] field_o;
    private int field_n;

    public final void a(byte param0) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(((q) this).field_m, ((q) this).field_n, 3553, 0, 0);
        ((q) this).field_n = -1;
        ((q) this).field_m = -1;
        if (param0 != 11) {
            field_q = null;
        }
    }

    public static void d(int param0) {
        field_p = null;
        int var1 = -126;
        field_o = null;
        field_k = null;
        field_q = null;
        field_l = null;
    }

    q(wl param0, int param1, int param2, boolean param3, byte[][] param4, int param5) {
        super(param0, 34067, param1, 6 * param2 * param2, param3);
        int var7_int = 0;
        ((q) this).field_m = -1;
        ((q) this).field_n = -1;
        try {
            ((q) this).field_j.a((rt) this, 1);
            for (var7_int = 0; var7_int < 6; var7_int++) {
                jaggl.OpenGL.glTexImage2Dub(var7_int + 34069, 0, ((q) this).field_b, param2, param2, 0, param5, 5121, param4[var7_int], 0);
            }
            ((q) this).a(true, -128);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "q.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Discard";
    }
}
