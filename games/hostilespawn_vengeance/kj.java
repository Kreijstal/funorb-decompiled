/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kj implements Iterator {
    private ui field_h;
    static boolean field_b;
    private dk field_d;
    private dk field_i;
    static String field_a;
    static cb field_g;
    static boolean field_c;
    static String field_e;
    static bd field_f;

    public final Object next() {
        Object var1 = this.field_i;
        if (this.field_h.field_a == var1) {
            this.field_i = null;
            var1 = null;
        } else {
            this.field_i = ((dk) (var1)).field_j;
        }
        this.field_d = (dk) (var1);
        return var1;
    }

    final static s b(int param0) {
        String var1;
        if (param0 > -98) {
          L0: {
            kj.a((byte) 44);
            var1 = qc.d(750938499);
            if (var1 == null) {
              break L0;
            } else {
              if (var1.indexOf('@') < 0) {
                break L0;
              } else {
                var1 = "";
                break L0;
              }
            }
          }
          return new s(qc.d(750938499), ia.b(32674));
        } else {
          L1: {
            var1 = qc.d(750938499);
            if (var1 == null) {
              break L1;
            } else {
              if (var1.indexOf('@') < 0) {
                break L1;
              } else {
                var1 = "";
                break L1;
              }
            }
          }
          return new s(qc.d(750938499), ia.b(32674));
        }
    }

    final static int a(int param0) {
        if (param0 > -90) {
            field_e = (String) null;
            return ia.field_h;
        }
        return ia.field_h;
    }

    public final void remove() {
        if (!(null != this.field_d)) {
            throw new IllegalStateException();
        }
        this.field_d.c(-1);
        this.field_d = null;
    }

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        if (param0 != -13) {
            return;
        }
        field_a = null;
        field_f = null;
    }

    public final boolean hasNext() {
        return this.field_i != this.field_h.field_a;
    }

    kj(ui param0) {
        this.field_d = null;
        try {
            this.field_h = param0;
            this.field_i = this.field_h.field_a.field_j;
            this.field_d = null;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "kj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = false;
        field_a = "Name is available";
    }
}
