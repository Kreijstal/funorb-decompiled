/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends rg {
    static int field_bb;
    private boolean field_U;
    private hd field_Z;
    static int[] field_W;
    static int field_Y;
    private String field_X;
    private String field_cb;
    private boolean field_ab;

    final void b(int param0, int param1, int param2) {
        int discarded$0 = 0;
        super.b(param0, -1, param2);
        va.field_i.b(this.field_X, (this.field_r >> 608644865) + param0, 103 + param2, 16777215, param1);
        if (!(null == this.field_cb)) {
            ed.f(20 + param0, -7 + param2 + 120, 260, 8421504);
            discarded$0 = va.field_i.a(this.field_cb, 20 + param0, param2 + 128, 260, 100, 16777215, -1, 1, 0, va.field_i.field_M);
        }
    }

    final void k(int param0) {
        this.field_ab = true;
        this.field_Z.field_I = false;
        if (param0 < 11) {
            hk.e(false);
        }
    }

    final void a(String param0, float param1, int param2, boolean param3) {
        if ((!param3 ? 1 : 0) == (this.field_U ? 1 : 0)) {
            this.field_U = param3 ? true : false;
            if (this.field_U) {
                this.field_Z.a(8405024, -1028717695, 4210752);
                this.field_Z.field_I = true;
            } else {
                this.field_Z.a(2113632, -1028717695, 4210752);
                if (!(!this.field_ab)) {
                    this.field_Z.field_I = false;
                }
            }
        }
        if (param2 != 2113632) {
            return;
        }
        try {
            this.field_Z.field_z = (int)(65536.0f * (param1 / 100.0f));
            this.field_X = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "hk.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void e(boolean param0) {
        field_W = null;
        if (param0) {
            field_bb = -76;
        }
    }

    hk(wi param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_cb = param1;
            if (null != this.field_cb) {
                var3_int = va.field_i.a(this.field_cb, 260, va.field_i.field_M);
                this.a(6154, 150 - -var3_int, 300);
            }
            this.field_Z = new hd(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_Z.field_I = true;
            this.field_ab = false;
            this.field_U = false;
            this.a((ub) (this.field_Z), (byte) 27);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "hk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
