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
        if (((mea) this).field_m.a((byte) -106)) {
            return false;
        }
        if (((mea) this).field_x.a((byte) -106)) {
            return false;
        }
        if (!(-101 != (((mea) this).field_l ^ -1))) {
            var3 = ((mea) this).field_w.field_q.a(-27449, ((mea) this).field_q);
            var4 = new ffa(((mea) this).field_q, ((mea) this).field_w, var3.field_s.field_x, var3.field_s.field_J);
            ((kj) (Object) var4).a(0);
        }
        ((mea) this).field_l = ((mea) this).field_l - 1;
        if (!(0 > ((mea) this).field_l - 1)) {
            return false;
        }
        this.d(-66);
        return true;
    }

    private final void d(int param0) {
        if (param0 > -43) {
            field_v = null;
        }
    }

    mea(gj param0, rb param1) {
        super(param0, (bca) (Object) param1);
        ((mea) this).field_w = param1;
        ((mea) this).field_x = new taa(((mea) this).field_q, ((mea) this).field_w.field_q.a(-27449, ((mea) this).field_q));
        ((mea) this).a(27799, (at) (Object) ((mea) this).field_x);
    }

    final static void e(byte param0) {
        cq discarded$6 = ol.a(bi.field_i[1], true);
        if (param0 < 86) {
            field_v = null;
        }
    }

    final static void e(int param0) {
        kk.e((byte) 113);
        if (param0 != 0) {
            field_v = null;
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
