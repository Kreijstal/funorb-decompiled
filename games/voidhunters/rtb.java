/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rtb extends pib {
    static llb field_h;
    private int field_j;
    private int field_i;

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param1 >= -37) {
            field_h = (llb) null;
            if (!(!erb.field_p)) {
                return ada.field_b.a(-9445, pma.field_o, jl.field_r);
            }
            if (!(!uga.field_d)) {
                return ic.a(param3, -9307, param2);
            }
            if (!(!qt.a(param3, 2, param2))) {
                return true;
            }
            if (!(!hb.field_c)) {
                return false;
            }
            return tl.b(param0, param3, -85);
        }
        if (!(!erb.field_p)) {
            return ada.field_b.a(-9445, pma.field_o, jl.field_r);
        }
        if (!(!uga.field_d)) {
            return ic.a(param3, -9307, param2);
        }
        if (!(!qt.a(param3, 2, param2))) {
            return true;
        }
        if (!(!hb.field_c)) {
            return false;
        }
        return tl.b(param0, param3, -85);
    }

    public static void c(byte param0) {
        field_h = null;
        if (param0 < 40) {
            field_h = (llb) null;
        }
    }

    public final void a(int param0) {
        if (param0 != 31294) {
          return;
        } else {
          jaggl.OpenGL.glFramebufferTexture2DEXT(this.field_i, this.field_j, 3553, 0, 0);
          this.field_i = -1;
          this.field_j = -1;
          return;
        }
    }

    rtb(qfa param0, int param1, int param2, boolean param3, byte[][] param4, int param5) {
        super(param0, 34067, param1, 6 * (param2 * param2), param3);
        int var7_int = 0;
        this.field_j = -1;
        this.field_i = -1;
        try {
            this.field_g.a(80, (pib) (this));
            for (var7_int = 0; 6 > var7_int; var7_int++) {
                jaggl.OpenGL.glTexImage2Dub(34069 + var7_int, 0, this.field_d, param2, param2, 0, param5, 5121, param4[var7_int], 0);
            }
            this.a(87, true);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rtb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    static {
    }
}
