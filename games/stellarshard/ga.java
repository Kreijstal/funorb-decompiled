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
        if (param0 != -8039) {
            field_a = null;
            eh.field_f = param1;
            return;
        }
        eh.field_f = param1;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = stellarshard.field_B;
        if (((ga) this).field_e.field_e[-1 + ((ga) this).field_d] == ((ga) this).field_c) {
          L0: while (true) {
            if (((ga) this).field_d < ((ga) this).field_e.field_b) {
              ((ga) this).field_d = ((ga) this).field_d + 1;
              if (((ga) this).field_e.field_e[((ga) this).field_d].field_g == ((ga) this).field_e.field_e[-1 + ((ga) this).field_d]) {
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

    public static void a(byte param0) {
        if (param0 != 3) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final Object next() {
        int var2 = 0;
        gg var3 = null;
        gg var4 = null;
        var2 = stellarshard.field_B;
        if (((ga) this).field_e.field_e[-1 + ((ga) this).field_d] == ((ga) this).field_c) {
          L0: while (true) {
            if (((ga) this).field_d < ((ga) this).field_e.field_b) {
              ((ga) this).field_d = ((ga) this).field_d + 1;
              var3 = ((ga) this).field_e.field_e[((ga) this).field_d].field_g;
              if (((ga) this).field_e.field_e[((ga) this).field_d + -1] == var3) {
                continue L0;
              } else {
                ((ga) this).field_b = var3;
                ((ga) this).field_c = var3.field_g;
                return (Object) (Object) var3;
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
        ((ga) this).field_d = param0;
    }

    ga(ai param0) {
        ((ga) this).field_b = null;
        ((ga) this).field_e = param0;
        this.a(1);
    }

    static {
    }
}
