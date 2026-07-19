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

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = -127 % ((-59 - param0) / 44);
        field_a = null;
    }

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2 = 0;
        var2 = SolKnight.field_L ? 1 : 0;
        if (this.field_f == this.field_e.field_b[-1 + this.field_g]) {
          L0: while (true) {
            if (this.field_g < this.field_e.field_e) {
              fieldTemp$1 = this.field_g;
              this.field_g = this.field_g + 1;
              if (this.field_e.field_b[fieldTemp$1].field_d == this.field_e.field_b[this.field_g - 1]) {
                this.field_f = this.field_e.field_b[this.field_g - 1];
                if (var2 == 0) {
                  continue L0;
                } else {
                  return false;
                }
              } else {
                this.field_f = this.field_e.field_b[this.field_g + -1].field_d;
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
        if (null == this.field_d) {
            throw new IllegalStateException();
        }
        this.field_d.c(10);
        this.field_d = null;
    }

    private final void b(int param0) {
        boolean discarded$2 = false;
        this.field_f = this.field_e.field_b[0].field_d;
        this.field_d = null;
        if (param0 > -23) {
          discarded$2 = this.hasNext();
          this.field_g = 1;
          return;
        } else {
          this.field_g = 1;
          return;
        }
    }

    public final Object next() {
        int fieldTemp$1 = 0;
        gg var1 = null;
        int var2 = 0;
        var2 = SolKnight.field_L ? 1 : 0;
        if (this.field_f == this.field_e.field_b[this.field_g - 1]) {
          L0: while (true) {
            if (this.field_e.field_e > this.field_g) {
              fieldTemp$1 = this.field_g;
              this.field_g = this.field_g + 1;
              var1 = this.field_e.field_b[fieldTemp$1].field_d;
              if (this.field_e.field_b[this.field_g + -1] == var1) {
                if (var2 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              } else {
                this.field_f = var1.field_d;
                this.field_d = var1;
                return var1;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = this.field_f;
          this.field_f = var1.field_d;
          this.field_d = var1;
          return var1;
        }
    }

    n(ii param0) {
        this.field_d = null;
        try {
            this.field_e = param0;
            this.b(-59);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
