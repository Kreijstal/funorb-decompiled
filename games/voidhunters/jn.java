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
          int discarded$81 = -95;
          spb.a();
          if (null != igb.field_a) {
            kl.a(igb.field_a, param0 ^ 92);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 1) {
          nmb.d(-87);
          int discarded$82 = 14194;
          nf.b();
          int discarded$83 = 16928;
          oga.a();
          int discarded$84 = 215;
          if (ap.e()) {
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
          int discarded$85 = 14194;
          nf.b();
          int discarded$86 = 16928;
          oga.a();
          int discarded$87 = 215;
          if (!ap.e()) {
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

    public static void a() {
        field_c = null;
        field_a = null;
    }

    public final boolean hasNext() {
        return ((jn) this).field_e.field_a != ((jn) this).field_d;
    }

    public final void remove() {
        if (!(null != ((jn) this).field_b)) {
            throw new IllegalStateException();
        }
        ((jn) this).field_b.d((byte) -35);
        ((jn) this).field_b = null;
    }

    public final Object next() {
        fh var1 = ((jn) this).field_d;
        if (var1 == ((jn) this).field_e.field_a) {
            ((jn) this).field_d = null;
            var1 = null;
        } else {
            ((jn) this).field_d = var1.field_e;
        }
        ((jn) this).field_b = var1;
        return (Object) (Object) var1;
    }

    jn(vh param0) {
        ((jn) this).field_b = null;
        try {
            ((jn) this).field_e = param0;
            ((jn) this).field_d = ((jn) this).field_e.field_a.field_e;
            ((jn) this).field_b = null;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "jn.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Disarm self destruct";
    }
}
