/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends cq implements qi {
    private int field_j;
    private int field_i;
    static int field_k;
    static int[] field_m;
    static int field_l;

    public final boolean c(byte param0) {
        if (param0 > -104) {
            this.field_i = 47;
            return false;
        }
        return false;
    }

    ik(jc param0, hd param1, la param2, int param3, int param4) {
        super(param0, 34037, param1, param2, param4 * param3, false);
        try {
            this.field_j = param3;
            this.field_i = param4;
            this.field_g.a((jj) (this), -9135);
            jaggl.OpenGL.glTexImage2Dub(this.field_e, 0, this.a(false), param3, param4, 0, gq.a(this.field_h, -29824), kk.a(this.field_c, (byte) -117), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    ik(jc param0, hd param1, int param2, int param3, float[] param4, int param5, int param6) {
        super(param0, 34037, param1, la.field_i, param3 * param2, false);
        try {
            this.field_j = param2;
            this.field_i = param3;
            this.field_g.a((jj) (this), -9135);
            jaggl.OpenGL.glPixelStorei(3314, param6);
            jaggl.OpenGL.glTexImage2Df(this.field_e, 0, this.a(false), param2, param3, 0, gq.a(this.field_h, -29824), 5126, param4, param5 * 4);
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    ik(jc param0, int param1, int param2, int[] param3, int param4, int param5) {
        super(param0, 34037, lc.field_g, la.field_h, param1 * param2, false);
        try {
            this.field_j = param1;
            this.field_i = param2;
            this.field_g.a((jj) (this), -9135);
            jaggl.OpenGL.glPixelStorei(3314, param5);
            jaggl.OpenGL.glTexImage2Di(this.field_e, 0, 6408, this.field_j, this.field_i, 0, 32993, this.field_g.field_Bc, param3, param4 * 4);
            jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    ik(jc param0, hd param1, int param2, int param3, byte[] param4, int param5, int param6) {
        super(param0, 34037, param1, la.field_h, param3 * param2, false);
        try {
            this.field_i = param3;
            this.field_j = param2;
            this.field_g.a((jj) (this), -9135);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glPixelStorei(3314, param6);
            jaggl.OpenGL.glTexImage2Dub(this.field_e, 0, this.a(false), param2, param3, 0, gq.a(this.field_h, -29824), 5121, param4, param5);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void b(boolean param0) {
        field_m = null;
        if (!param0) {
            field_l = -80;
        }
    }

    public final float a(float param0, byte param1) {
        if (param1 != -32) {
            ke var4 = (ke) null;
            this.a((ke) null, 7);
            return param0;
        }
        return param0;
    }

    public final void a(boolean param0, boolean param1, byte param2) {
        int discarded$0 = 0;
        if (param2 != -127) {
            discarded$0 = this.b((byte) 16);
        }
    }

    public final void a(ke param0, int param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ik.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int b(byte param0) {
        if (param0 <= 2) {
            this.a(true, false, (byte) -89);
            return this.field_i;
        }
        return this.field_i;
    }

    public final void a(byte param0) {
        super.a(param0);
    }

    public final int a(int param0) {
        if (param0 <= 56) {
            return -78;
        }
        return this.field_j;
    }

    public final float a(int param0, float param1) {
        if (param0 < 65) {
            this.a(true, true, (byte) -30);
            return param1;
        }
        return param1;
    }

    static {
        field_k = -1;
        field_m = new int[1];
    }
}
