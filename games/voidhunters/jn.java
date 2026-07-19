/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jn implements Iterator {
    private vh field_e;
    static llb field_a;
    private fh field_b;
    static String field_c;
    private fh field_d;

    final static void a(int param0) {
        L0: {
          spb.a((byte) -95);
          if (null != igb.field_a) {
            kl.a(igb.field_a, param0 ^ 92);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 1) {
          nmb.d(-87);
          nf.b(14194);
          oga.a(16928);
          if (ap.e(215)) {
            dpa.field_p.h(24335, 1);
            lnb.b(0, 127);
            ifb.l(-125);
            return;
          } else {
            ifb.l(-125);
            return;
          }
        } else {
          jn.a(121);
          nmb.d(-87);
          nf.b(14194);
          oga.a(16928);
          if (!ap.e(215)) {
            ifb.l(-125);
            return;
          } else {
            dpa.field_p.h(24335, 1);
            lnb.b(0, 127);
            ifb.l(-125);
            return;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 >= -76) {
            field_c = (String) null;
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    public final boolean hasNext() {
        return this.field_e.field_a != this.field_d;
    }

    public final void remove() {
        if (!(null != this.field_b)) {
            throw new IllegalStateException();
        }
        this.field_b.d((byte) -35);
        this.field_b = null;
    }

    public final Object next() {
        fh var1 = this.field_d;
        if (var1 == this.field_e.field_a) {
            this.field_d = null;
            var1 = null;
        } else {
            this.field_d = var1.field_e;
        }
        this.field_b = var1;
        return var1;
    }

    jn(vh param0) {
        this.field_b = null;
        try {
            this.field_e = param0;
            this.field_d = this.field_e.field_a.field_e;
            this.field_b = null;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Disarm self destruct";
    }
}
