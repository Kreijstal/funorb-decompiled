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
            field_q = (gk) null;
        }
    }

    public static void d(int param0) {
        field_p = null;
        int var1 = -126 / ((-5 - param0) / 53);
        field_o = null;
        field_k = null;
        field_q = null;
        field_l = null;
    }

    q(wl param0, int param1, int param2, boolean param3, byte[][] param4, int param5) {
        super(param0, 34067, param1, 6 * param2 * param2, param3);
        int var7 = 0;
        ((q) this).field_m = -1;
        ((q) this).field_n = -1;
        ((q) this).field_j.a((rt) this, 1);
        for (var7 = 0; var7 < 6; var7++) {
            jaggl.OpenGL.glTexImage2Dub(var7 + 34069, 0, ((q) this).field_b, param2, param2, 0, param5, 5121, param4[var7], 0);
        }
        ((q) this).a(true, -128);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Discard";
    }
}
