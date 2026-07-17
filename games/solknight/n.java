/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class n implements Iterator {
    private int field_g;
    static String field_c;
    static Boolean field_b;
    private gg field_f;
    static dl field_a;
    private gg field_d;
    private ii field_e;

    public static void a() {
        field_b = null;
        field_c = null;
        int var1 = 0;
        field_a = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = SolKnight.field_L ? 1 : 0;
        if (((n) this).field_f == ((n) this).field_e.field_b[-1 + ((n) this).field_g]) {
          L0: while (true) {
            if (((n) this).field_g < ((n) this).field_e.field_e) {
              int fieldTemp$1 = ((n) this).field_g;
              ((n) this).field_g = ((n) this).field_g + 1;
              if (((n) this).field_e.field_b[fieldTemp$1].field_d == ((n) this).field_e.field_b[((n) this).field_g - 1]) {
                ((n) this).field_f = ((n) this).field_e.field_b[((n) this).field_g - 1];
                continue L0;
              } else {
                ((n) this).field_f = ((n) this).field_e.field_b[((n) this).field_g + -1].field_d;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final void remove() {
        if (null == ((n) this).field_d) {
            throw new IllegalStateException();
        }
        ((n) this).field_d.c(10);
        ((n) this).field_d = null;
    }

    private final void b() {
        ((n) this).field_f = ((n) this).field_e.field_b[0].field_d;
        ((n) this).field_d = null;
        ((n) this).field_g = 1;
    }

    public final Object next() {
        gg var1 = null;
        int var2 = 0;
        var2 = SolKnight.field_L ? 1 : 0;
        if (((n) this).field_f == ((n) this).field_e.field_b[((n) this).field_g - 1]) {
          L0: while (true) {
            if (((n) this).field_e.field_e > ((n) this).field_g) {
              int fieldTemp$2 = ((n) this).field_g;
              ((n) this).field_g = ((n) this).field_g + 1;
              var1 = ((n) this).field_e.field_b[fieldTemp$2].field_d;
              if (((n) this).field_e.field_b[((n) this).field_g + -1] == var1) {
                continue L0;
              } else {
                ((n) this).field_f = var1.field_d;
                ((n) this).field_d = var1;
                return (Object) (Object) var1;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((n) this).field_f;
          ((n) this).field_f = var1.field_d;
          ((n) this).field_d = var1;
          return (Object) (Object) var1;
        }
    }

    n(ii param0) {
        ((n) this).field_d = null;
        try {
            ((n) this).field_e = param0;
            int discarded$0 = -59;
            this.b();
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "n.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
