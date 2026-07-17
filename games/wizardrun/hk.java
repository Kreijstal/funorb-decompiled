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
        super.b(param0, -1, param2);
        va.field_i.b(((hk) this).field_X, (((hk) this).field_r >> 1) + param0, 103 + param2, 16777215, param1);
        if (!(null == ((hk) this).field_cb)) {
            ed.f(20 + param0, -7 + param2 + 120, 260, 8421504);
            int discarded$0 = va.field_i.a(((hk) this).field_cb, 20 + param0, param2 + 128, 260, 100, 16777215, -1, 1, 0, va.field_i.field_M);
        }
    }

    final void k(int param0) {
        ((hk) this).field_ab = true;
        ((hk) this).field_Z.field_I = false;
        if (param0 < 11) {
            int discarded$0 = 0;
            hk.e();
        }
    }

    final void a(String param0, float param1, int param2, boolean param3) {
        if ((!param3 ? 1 : 0) == (((hk) this).field_U ? 1 : 0)) {
            ((hk) this).field_U = param3 ? true : false;
            if (((hk) this).field_U) {
                ((hk) this).field_Z.a(8405024, -1028717695, 4210752);
                ((hk) this).field_Z.field_I = true;
            } else {
                ((hk) this).field_Z.a(2113632, -1028717695, 4210752);
                if (!(!((hk) this).field_ab)) {
                    ((hk) this).field_Z.field_I = false;
                }
            }
        }
        if (param2 != 2113632) {
            return;
        }
        try {
            ((hk) this).field_Z.field_z = (int)(65536.0f * (param1 / 100.0f));
            ((hk) this).field_X = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "hk.EA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void e() {
        field_W = null;
    }

    hk(wi param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((hk) this).field_cb = param1;
            if (null != ((hk) this).field_cb) {
                var3_int = va.field_i.a(((hk) this).field_cb, 260, va.field_i.field_M);
                ((hk) this).a(6154, 150 - -var3_int, 300);
            }
            ((hk) this).field_Z = new hd(13, 50, 274, 30, 15, 2113632, 4210752);
            ((hk) this).field_Z.field_I = true;
            ((hk) this).field_ab = false;
            ((hk) this).field_U = false;
            ((hk) this).a((ub) (Object) ((hk) this).field_Z, (byte) 27);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "hk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
