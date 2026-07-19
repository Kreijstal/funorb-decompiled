/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uga extends kl {
    static Object field_m;
    private int field_l;
    static fta field_n;

    final void a(int param0, boolean param1) {
        this.field_h.a(true, (kl) (this));
        int var3 = -71 / ((17 - param0) / 38);
        jaggl.OpenGL.glTexParameteri(this.field_e, 10242, !param1 ? 33071 : 10497);
    }

    uga(cka param0, int param1, int param2, byte[] param3, int param4) {
        super(param0, 3552, param1, param2, false);
        try {
            this.field_l = param2;
            this.field_h.a(true, (kl) (this));
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glTexImage1Dub(this.field_e, 0, this.field_c, this.field_l, 0, param4, 5121, param3, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
            this.b(true, 3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final void a(int param0) {
        int var2 = -106 % ((14 - param0) / 56);
    }

    public static void g(int param0) {
        field_n = null;
        if (param0 != -12242) {
            return;
        }
        field_m = null;
    }

    static {
        field_n = new fta();
    }
}
