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
        if (!(this.field_b != null)) {
            throw new IllegalStateException();
        }
        this.field_b.c(20);
        this.field_b = null;
    }

    final static void a(int param0, pb param1) {
        try {
            if (param0 != -8039) {
                field_a = (String) null;
            }
            eh.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ga.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2 = 0;
        var2 = stellarshard.field_B;
        if (this.field_e.field_e[-1 + this.field_d] == this.field_c) {
          L0: while (true) {
            if (this.field_d < this.field_e.field_b) {
              fieldTemp$1 = this.field_d;
              this.field_d = this.field_d + 1;
              if (this.field_e.field_e[fieldTemp$1].field_g == this.field_e.field_e[-1 + this.field_d]) {
                this.field_c = this.field_e.field_e[-1 + this.field_d];
                continue L0;
              } else {
                this.field_c = this.field_e.field_e[this.field_d - 1].field_g;
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
            field_a = (String) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final Object next() {
        int fieldTemp$2 = 0;
        int var2 = 0;
        Object var3 = null;
        gg var3_ref = null;
        gg var4 = null;
        var2 = stellarshard.field_B;
        if (this.field_e.field_e[-1 + this.field_d] == this.field_c) {
          L0: while (true) {
            if (this.field_d < this.field_e.field_b) {
              fieldTemp$2 = this.field_d;
              this.field_d = this.field_d + 1;
              var3_ref = this.field_e.field_e[fieldTemp$2].field_g;
              if (this.field_e.field_e[this.field_d + -1] == var3_ref) {
                continue L0;
              } else {
                this.field_b = var3_ref;
                this.field_c = var3_ref.field_g;
                return var3_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = this.field_c;
          this.field_c = var4.field_g;
          this.field_b = var4;
          return var4;
        }
    }

    private final void a(int param0) {
        this.field_c = this.field_e.field_e[0].field_g;
        this.field_b = null;
        this.field_d = param0;
    }

    ga(ai param0) {
        this.field_b = null;
        try {
            this.field_e = param0;
            this.a(1);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
