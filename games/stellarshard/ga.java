/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ga implements Iterator {
    private gg field_b;
    private int field_d;
    static String field_a;
    private ai field_e;
    private gg field_c;

    public final void remove() {
        if (!(((ga) this).field_b != null)) {
            throw new IllegalStateException();
        }
        ((ga) this).field_b.c(20);
        ((ga) this).field_b = null;
    }

    final static void a(int param0, pb param1) {
        try {
            eh.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ga.B(" + -8039 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = stellarshard.field_B;
        if (((ga) this).field_e.field_e[-1 + ((ga) this).field_d] == ((ga) this).field_c) {
          L0: while (true) {
            if (((ga) this).field_d < ((ga) this).field_e.field_b) {
              int fieldTemp$1 = ((ga) this).field_d;
              ((ga) this).field_d = ((ga) this).field_d + 1;
              if (((ga) this).field_e.field_e[fieldTemp$1].field_g == ((ga) this).field_e.field_e[-1 + ((ga) this).field_d]) {
                ((ga) this).field_c = ((ga) this).field_e.field_e[-1 + ((ga) this).field_d];
                continue L0;
              } else {
                ((ga) this).field_c = ((ga) this).field_e.field_e[((ga) this).field_d - 1].field_g;
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

    public static void a() {
        field_a = null;
    }

    public final Object next() {
        int var2 = 0;
        Object var3 = null;
        gg var3_ref = null;
        gg var4 = null;
        var2 = stellarshard.field_B;
        if (((ga) this).field_e.field_e[-1 + ((ga) this).field_d] == ((ga) this).field_c) {
          L0: while (true) {
            if (((ga) this).field_d < ((ga) this).field_e.field_b) {
              int fieldTemp$2 = ((ga) this).field_d;
              ((ga) this).field_d = ((ga) this).field_d + 1;
              var3_ref = ((ga) this).field_e.field_e[fieldTemp$2].field_g;
              if (((ga) this).field_e.field_e[((ga) this).field_d + -1] == var3_ref) {
                continue L0;
              } else {
                ((ga) this).field_b = var3_ref;
                ((ga) this).field_c = var3_ref.field_g;
                return (Object) (Object) var3_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((ga) this).field_c;
          ((ga) this).field_c = var4.field_g;
          ((ga) this).field_b = var4;
          return (Object) (Object) var4;
        }
    }

    private final void a(int param0) {
        ((ga) this).field_c = ((ga) this).field_e.field_e[0].field_g;
        ((ga) this).field_b = null;
        ((ga) this).field_d = 1;
    }

    ga(ai param0) {
        ((ga) this).field_b = null;
        try {
            ((ga) this).field_e = param0;
            this.a(1);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ga.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
