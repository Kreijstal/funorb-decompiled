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
        if (!(null != this.field_e)) {
            throw new IllegalStateException();
        }
        this.field_e.a((byte) -93);
        this.field_e = null;
    }

    final static void a(int param0, int param1) {
        tg.field_i = param0 * 400 / 150;
        if (param1 != -20451) {
          bc.a(96);
          tg.field_g = 100 * param0 / 150;
          tg.field_d = (param0 << -1838216400) / 150;
          return;
        } else {
          tg.field_g = 100 * param0 / 150;
          tg.field_d = (param0 << -1838216400) / 150;
          return;
        }
    }

    public final boolean hasNext() {
        return this.field_f.field_e != this.field_c;
    }

    bc(qc param0) {
        this.field_e = null;
        try {
            this.field_f = param0;
            this.field_c = this.field_f.field_e.field_t;
            this.field_e = null;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        int var1 = -31 / ((-15 - param0) / 48);
        field_b = null;
    }

    public final Object next() {
        al var1 = this.field_c;
        if (this.field_f.field_e == var1) {
            var1 = null;
            this.field_c = null;
        } else {
            this.field_c = var1.field_t;
        }
        this.field_e = var1;
        return var1;
    }

    static {
    }
}
