/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends je {
    private int field_l;
    private je field_k;

    final void a(int param0) {
        if (!(((jg) this).field_l <= param0)) {
            ((jg) this).field_l = ((jg) this).field_l - param0;
            return;
        }
        param0 = param0 - ((jg) this).field_l;
        ((jg) this).field_k.field_d = ((jg) this).field_d;
        ((jg) this).field_k.field_a = ((jg) this).field_a;
        ((jg) this).field_l = 0;
        ((jg) this).field_a.field_d = (qb) (Object) ((jg) this).field_k;
        ((jg) this).field_d.field_a = (qb) (Object) ((jg) this).field_k;
        ((jg) this).field_a = null;
        ((jg) this).field_d = null;
        if (!(0 >= param0)) {
            ((jg) this).field_k.a(param0);
        }
    }

    final je a() {
        return null;
    }

    final int d() {
        return ((jg) this).field_k.d();
    }

    final int c() {
        return 0;
    }

    final je b() {
        return null;
    }

    final void a(int[] param0, int param1, int param2) {
        if (!(((jg) this).field_l <= param2)) {
            ((jg) this).field_l = ((jg) this).field_l - param2;
            return;
        }
        param1 = param1 + ((jg) this).field_l;
        param2 = param2 - ((jg) this).field_l;
        ((jg) this).field_k.field_a = ((jg) this).field_a;
        ((jg) this).field_k.field_d = ((jg) this).field_d;
        ((jg) this).field_l = 0;
        ((jg) this).field_a.field_d = (qb) (Object) ((jg) this).field_k;
        ((jg) this).field_d.field_a = (qb) (Object) ((jg) this).field_k;
        ((jg) this).field_a = null;
        ((jg) this).field_d = null;
        if (!(param2 <= 0)) {
            ((jg) this).field_k.a(param0, param1, param2);
        }
    }

    jg(je param0, int param1) {
        ((jg) this).field_k = param0;
        ((jg) this).field_i = ((jg) this).field_k.field_i;
        ((jg) this).field_l = param1;
    }

    static {
    }
}
