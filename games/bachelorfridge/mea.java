/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mea extends ana {
    private rb field_w;
    static kv[] field_v;
    private taa field_x;

    final boolean c(byte param0) {
        ad var3 = null;
        ffa var4 = null;
        int var2 = 56 / ((71 - param0) / 47);
        if (this.field_m.a((byte) -106)) {
            return false;
        }
        if (this.field_x.a((byte) -106)) {
            return false;
        }
        if (!(-101 != (this.field_l ^ -1))) {
            var3 = this.field_w.field_q.a(-27449, this.field_q);
            var4 = new ffa(this.field_q, this.field_w, var3.field_s.field_x, var3.field_s.field_J);
            ((kj) ((Object) var4)).a(0);
        }
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (!(0 > fieldTemp$0)) {
            return false;
        }
        this.d(-66);
        return true;
    }

    private final void d(int param0) {
        if (param0 > -43) {
            field_v = (kv[]) null;
        }
    }

    mea(gj param0, rb param1) {
        super(param0, param1);
        try {
            this.field_w = param1;
            this.field_x = new taa(this.field_q, this.field_w.field_q.a(-27449, this.field_q));
            this.a(27799, this.field_x);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "mea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(byte param0) {
        cq discarded$6 = ol.a(bi.field_i[1], true);
        if (param0 < 86) {
            field_v = (kv[]) null;
        }
    }

    final static void e(int param0) {
        kk.e((byte) 113);
        if (param0 != 0) {
            field_v = (kv[]) null;
            gha.b(16);
            og.a(12);
            return;
        }
        gha.b(16);
        og.a(12);
    }

    public static void f(int param0) {
        if (param0 <= 78) {
            mea.e((byte) -99);
            field_v = null;
            return;
        }
        field_v = null;
    }

    static {
    }
}
