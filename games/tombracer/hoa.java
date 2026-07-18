/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hoa extends kl {
    static String field_n;
    private int field_q;
    static boolean field_p;
    static String field_m;
    static jpa field_l;
    private int field_o;

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(((hoa) this).field_o, ((hoa) this).field_q, 3553, 0, 0);
        ((hoa) this).field_q = -1;
        int var2 = 81 % ((14 - param0) / 56);
        ((hoa) this).field_o = -1;
    }

    hoa(cka param0, int param1, int param2, boolean param3, byte[][] param4, int param5) {
        super(param0, 34067, param1, 6 * param2 * param2, param3);
        int var7_int = 0;
        ((hoa) this).field_q = -1;
        ((hoa) this).field_o = -1;
        try {
            ((hoa) this).field_h.a(true, (kl) this);
            for (var7_int = 0; var7_int < 6; var7_int++) {
                jaggl.OpenGL.glTexImage2Dub(var7_int + 34069, 0, ((hoa) this).field_c, param2, param2, 0, param5, 5121, param4[var7_int], 0);
            }
            ((hoa) this).b(true, 3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "hoa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void g(int param0) {
        field_n = null;
        field_l = null;
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Cauldrons of green soup";
        field_m = "<%0> is not on your friend list.";
    }
}
