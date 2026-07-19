/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sr extends rt {
    private int field_k;
    int field_l;
    private int field_o;
    int field_m;
    int field_n;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_j.a((rt) (this), 1);
        jaggl.OpenGL.glCopyTexSubImage3D(this.field_f, 0, param7, param0, param5, param6, param1, param4, param3);
        jaggl.OpenGL.glFlush();
        if (param2 >= -94) {
            this.field_l = -86;
        }
    }

    public final void a(byte param0) {
        jaggl.OpenGL.glFramebufferTexture3DEXT(this.field_k, this.field_o, this.field_f, 0, 0, 0);
        this.field_k = -1;
        this.field_o = -1;
        if (param0 != 11) {
            this.a((byte) 22);
        }
    }

    sr(wl param0, int param1, int param2, int param3, int param4, byte[] param5, int param6) {
        super(param0, 32879, param1, param3 * param2 * param4, false);
        this.field_o = -1;
        this.field_k = -1;
        try {
            this.field_l = param2;
            this.field_n = param4;
            this.field_m = param3;
            this.field_j.a((rt) (this), 1);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glTexImage3Dub(this.field_f, 0, this.field_b, this.field_l, this.field_m, this.field_n, 0, param6, 5121, param5, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
            this.a(true, -128);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "sr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    sr(wl param0, int param1, int param2, int param3, int param4) {
        super(param0, 32879, param1, param3 * param2 * param4, false);
        this.field_o = -1;
        this.field_k = -1;
        try {
            this.field_l = param2;
            this.field_m = param3;
            this.field_n = param4;
            this.field_j.a((rt) (this), 1);
            jaggl.OpenGL.glTexImage3Dub(this.field_f, 0, this.field_b, this.field_l, this.field_m, this.field_n, 0, ia.a(this.field_b, -16445), 5121, (byte[]) null, 0);
            this.a(true, -128);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "sr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
