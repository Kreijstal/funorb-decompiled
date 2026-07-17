/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fu {
    int field_f;
    private int field_e;
    private boolean field_a;
    wl field_b;
    private boolean field_c;
    static ng field_d;

    protected final void finalize() throws Throwable {
        if (!((fu) this).field_c) {
            ((fu) this).field_b.c(((fu) this).field_f, ((fu) this).field_e, 107);
            ((fu) this).field_c = true;
        }
        super.finalize();
    }

    abstract void a(byte param0);

    final static int[] a(boolean param0) {
        if (!param0) {
            return null;
        }
        return new int[8];
    }

    final static ll b(int param0) {
        int var4_int = 0;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        int var1 = ee.field_e[0] * ji.field_b[0];
        byte[] var2 = fk.field_a[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = ud.field_e[pg.a((int) var2[var4_int], 255)];
        }
        ll var4 = new ll(pu.field_a, cc.field_i, lh.field_a[0], lg.field_j[0], ji.field_b[0], ee.field_e[0], var3);
        kf.f(1);
        return var4;
    }

    fu(wl param0, int param1, byte[] param2, int param3, boolean param4) {
        ((fu) this).field_c = false;
        try {
            ((fu) this).field_a = param4 ? true : false;
            ((fu) this).field_b = param0;
            ((fu) this).field_e = param3;
            jaggl.OpenGL.glGenBuffersARB(1, rs.field_w, 0);
            ((fu) this).field_f = rs.field_w[0];
            ((fu) this).a((byte) 52);
            jaggl.OpenGL.glBufferDataARBub(param1, ((fu) this).field_e, param2, 0, !((fu) this).field_a ? 35044 : 35040);
            ((fu) this).field_b.field_ib = ((fu) this).field_b.field_ib + ((fu) this).field_e;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "fu.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void b(byte param0) {
        field_d = null;
    }

    static {
    }
}
