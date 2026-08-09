/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vo {
    private boolean field_a;
    private int field_g;
    static boolean field_b;
    int field_e;
    cka field_h;
    private int field_d;
    private boolean field_c;
    static int field_f;

    final static jea e(int param0) {
        if (param0 != 35040) {
            return (jea) null;
        }
        return nsa.field_i.field_tb;
    }

    final void a(int param0, byte[] param1, int param2) {
        try {
            this.d(34963);
            if (param2 > this.field_g) {
                jaggl.OpenGL.glBufferDataARBub(this.field_d, param2, param1, 0, !this.field_a ? 35044 : 35040);
                this.field_h.field_mb = this.field_h.field_mb + (-this.field_g + param2);
                this.field_g = param2;
            } else {
                jaggl.OpenGL.glBufferSubDataARBub(this.field_d, 0, param2, param1, 0);
            }
            int var4_int = -114 / ((param0 - -27) / 51);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vo.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (!(this.field_c)) {
            this.field_h.d(-31014, this.field_e, this.field_g);
            this.field_c = true;
        }
        super.finalize();
    }

    abstract void d(int param0);

    vo(cka param0, int param1, byte[] param2, int param3, boolean param4) {
        this.field_c = false;
        try {
            this.field_h = param0;
            this.field_a = param4 ? true : false;
            this.field_d = param1;
            this.field_g = param3;
            jaggl.OpenGL.glGenBuffersARB(1, lc.field_N, 0);
            this.field_e = lc.field_N[0];
            this.d(34963);
            jaggl.OpenGL.glBufferDataARBub(param1, this.field_g, param2, 0, this.field_a ? 35040 : 35044);
            this.field_h.field_mb = this.field_h.field_mb + this.field_g;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_b = false;
    }
}
