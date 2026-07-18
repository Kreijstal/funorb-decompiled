/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bc implements Iterator {
    private al field_c;
    static int field_a;
    static int field_d;
    private qc field_f;
    private al field_e;
    static ea field_b;

    public final void remove() {
        if (!(null != ((bc) this).field_e)) {
            throw new IllegalStateException();
        }
        ((bc) this).field_e.a((byte) -93);
        ((bc) this).field_e = null;
    }

    final static void a(int param0, int param1) {
        tg.field_i = 133;
        tg.field_g = 33;
        tg.field_d = 21845;
    }

    public final boolean hasNext() {
        return ((bc) this).field_f.field_e != ((bc) this).field_c;
    }

    bc(qc param0) {
        ((bc) this).field_e = null;
        try {
            ((bc) this).field_f = param0;
            ((bc) this).field_c = ((bc) this).field_f.field_e.field_t;
            ((bc) this).field_e = null;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "bc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 31;
        field_b = null;
    }

    public final Object next() {
        al var1 = ((bc) this).field_c;
        if (((bc) this).field_f.field_e == var1) {
            var1 = null;
            ((bc) this).field_c = null;
        } else {
            ((bc) this).field_c = var1.field_t;
        }
        ((bc) this).field_e = var1;
        return (Object) (Object) var1;
    }

    static {
    }
}
