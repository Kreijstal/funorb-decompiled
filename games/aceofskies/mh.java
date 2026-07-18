/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends cq implements bp {
    static int[] field_l;
    static String field_n;
    static String field_j;
    private int field_m;
    private int field_i;
    private int field_k;
    static al field_o;

    public final void a(byte param0) {
        super.a(param0);
    }

    mh(jc param0, hd param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, 32879, param1, la.field_h, param3 * param2 * param4, false);
        try {
            ((mh) this).field_m = param4;
            ((mh) this).field_i = param3;
            ((mh) this).field_k = param2;
            ((mh) this).field_g.a((jj) this, -9135);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glTexImage3Dub(((mh) this).field_e, 0, ((mh) this).a(false), ((mh) this).field_k, ((mh) this).field_i, ((mh) this).field_m, 0, gq.a(((mh) this).field_h, -29824), 5121, param5, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(ke param0, int param1) {
        try {
            if (param1 != -31662) {
                ((mh) this).field_m = -6;
            }
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "mh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_l = null;
        field_n = null;
        field_j = null;
        int var1 = 99;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Play free version";
        field_j = "This password contains repeated characters, and would be easy to guess";
        field_l = new int[2];
    }
}
