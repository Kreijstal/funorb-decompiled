/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ks extends pp {
    static int field_i;

    final void a(lu param0, byte param1) {
        try {
            er.a(this.field_h, 121, param0);
            int var3_int = 30 / ((34 - param1) / 58);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ks.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(aga param0, op param1, int param2) {
        aga var4 = null;
        if (param2 != 12) {
            return;
        }
        try {
            var4 = this.field_h.a(123, param1);
            var4.b((byte) 117, 0);
            var4.d(param2 + -123);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ks.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    ks(nq param0) {
        try {
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ks.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
