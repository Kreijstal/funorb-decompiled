/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ia implements Iterator {
    private um field_e;
    static String[] field_c;
    private ms field_b;
    static int field_d;
    private int field_f;
    static String field_a;
    private ms field_g;

    public final Object next() {
        int fieldTemp$1 = 0;
        int var2 = 0;
        ms var3 = null;
        ms var4 = null;
        var2 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_b == this.field_e.field_c[this.field_f + -1]) {
          L0: while (true) {
            if (this.field_f < this.field_e.field_d) {
              fieldTemp$1 = this.field_f;
              this.field_f = this.field_f + 1;
              var3 = this.field_e.field_c[fieldTemp$1].field_b;
              if (var3 == this.field_e.field_c[this.field_f - 1]) {
                if (var2 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              } else {
                this.field_g = var3;
                this.field_b = var3.field_b;
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = this.field_b;
          this.field_b = var4.field_b;
          this.field_g = var4;
          return var4;
        }
    }

    public final void remove() {
        if (null == this.field_g) {
            throw new IllegalStateException();
        }
        this.field_g.b(false);
        this.field_g = null;
    }

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2 = 0;
        var2 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_e.field_c[-1 + this.field_f] == this.field_b) {
          L0: while (true) {
            if (this.field_e.field_d > this.field_f) {
              fieldTemp$1 = this.field_f;
              this.field_f = this.field_f + 1;
              if (this.field_e.field_c[fieldTemp$1].field_b == this.field_e.field_c[-1 + this.field_f]) {
                this.field_b = this.field_e.field_c[-1 + this.field_f];
                if (var2 == 0) {
                  continue L0;
                } else {
                  this.field_b = this.field_e.field_c[this.field_f - 1].field_b;
                  return true;
                }
              } else {
                this.field_b = this.field_e.field_c[this.field_f - 1].field_b;
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

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 == 1) {
            return;
        }
        field_d = -74;
    }

    private final void b(int param0) {
        this.field_f = 1;
        this.field_b = this.field_e.field_c[0].field_b;
        if (param0 <= 4) {
          this.b(34);
          this.field_g = null;
          return;
        } else {
          this.field_g = null;
          return;
        }
    }

    ia(um param0) {
        this.field_g = null;
        try {
            this.field_e = param0;
            this.b(8);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ia.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1) {
        int var2 = ps.field_e[param0];
        if (param1 != -82) {
            field_a = (String) null;
            so.a(var2, (byte) -127);
            return;
        }
        so.a(var2, (byte) -127);
    }

    static {
        field_a = "Suggested names: ";
        field_c = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
