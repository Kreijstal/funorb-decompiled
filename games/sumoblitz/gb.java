/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends nt {
    private boolean field_u;
    static il field_t;
    static long field_s;

    gb(int param0, int param1, int param2) {
        super(30, param0, param1, param2);
        this.field_u = false;
    }

    public static void e(int param0) {
        if (param0 != 0) {
            return;
        }
        field_t = null;
    }

    final void a(ha param0, int param1) {
        int var3_int = (int)(255.0 * ((double)this.field_p / 30.0));
        int var4 = 0;
        if (param1 > -121) {
            return;
        }
        try {
            if (this.field_u) {
                var4 = (int)((double)(30 - this.field_p) / 30.0 * 8192.0);
            } else {
                var4 = (int)(8192.0 * ((double)this.field_p / 30.0));
            }
            var4 = var4 * 2;
            am.field_j[4].a((float)(this.field_k >> 167752904), (float)(this.field_o >> 1969306952), var4, 0, 1, var3_int << -694286696, 1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "gb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_t = new il();
    }
}
