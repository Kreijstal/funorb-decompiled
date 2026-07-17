/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class o implements Iterator {
    private rk field_c;
    static mi field_f;
    static String field_d;
    private rk field_e;
    private int field_b;
    private gh field_a;

    final static void b(byte param0) {
        ti.a(ua.a(true));
        if (param0 >= -104) {
            o.a((byte) -125);
            da.field_h = 512;
            return;
        }
        da.field_h = 512;
    }

    public static void a(byte param0) {
        field_d = null;
        int var1 = -23 % ((-24 - param0) / 53);
        field_f = null;
    }

    public final void remove() {
        if (null == ((o) this).field_c) {
            throw new IllegalStateException();
        }
        ((o) this).field_c.a(true);
        ((o) this).field_c = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Confined.field_J ? 1 : 0;
        if (((o) this).field_e == ((o) this).field_a.field_j[-1 + ((o) this).field_b]) {
          L0: while (true) {
            if (((o) this).field_a.field_i > ((o) this).field_b) {
              int fieldTemp$1 = ((o) this).field_b;
              ((o) this).field_b = ((o) this).field_b + 1;
              if (((o) this).field_a.field_j[fieldTemp$1].field_h != ((o) this).field_a.field_j[-1 + ((o) this).field_b]) {
                ((o) this).field_e = ((o) this).field_a.field_j[((o) this).field_b + -1].field_h;
                return true;
              } else {
                ((o) this).field_e = ((o) this).field_a.field_j[-1 + ((o) this).field_b];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final void a(int param0) {
        ((o) this).field_c = null;
        ((o) this).field_e = ((o) this).field_a.field_j[0].field_h;
        ((o) this).field_b = 1;
    }

    o(gh param0) {
        ((o) this).field_c = null;
        try {
            ((o) this).field_a = param0;
            this.a(1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "o.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final Object next() {
        rk var1 = null;
        int var2 = 0;
        var2 = Confined.field_J ? 1 : 0;
        if (((o) this).field_a.field_j[-1 + ((o) this).field_b] == ((o) this).field_e) {
          L0: while (true) {
            if (((o) this).field_a.field_i > ((o) this).field_b) {
              int fieldTemp$2 = ((o) this).field_b;
              ((o) this).field_b = ((o) this).field_b + 1;
              var1 = ((o) this).field_a.field_j[fieldTemp$2].field_h;
              if (((o) this).field_a.field_j[((o) this).field_b + -1] != var1) {
                ((o) this).field_e = var1.field_h;
                ((o) this).field_c = var1;
                return (Object) (Object) var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((o) this).field_e;
          ((o) this).field_c = var1;
          ((o) this).field_e = var1.field_h;
          return (Object) (Object) var1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Log in";
    }
}
