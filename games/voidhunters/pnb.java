/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pnb implements Iterator {
    private ksa field_d;
    private ksa field_a;
    private nga field_b;
    private int field_c;

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2 = 0;
        var2 = VoidHunters.field_G;
        if (this.field_d == this.field_b.field_h[-1 + this.field_c]) {
          L0: while (true) {
            if (this.field_c < this.field_b.field_f) {
              fieldTemp$1 = this.field_c;
              this.field_c = this.field_c + 1;
              if (this.field_b.field_h[fieldTemp$1].field_c != this.field_b.field_h[-1 + this.field_c]) {
                this.field_d = this.field_b.field_h[this.field_c - 1].field_c;
                return true;
              } else {
                this.field_d = this.field_b.field_h[this.field_c - 1];
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

    public final Object next() {
        int fieldTemp$2 = 0;
        ksa var1 = null;
        int var2 = 0;
        var2 = VoidHunters.field_G;
        if (this.field_b.field_h[this.field_c - 1] == this.field_d) {
          L0: while (true) {
            if (this.field_c < this.field_b.field_f) {
              fieldTemp$2 = this.field_c;
              this.field_c = this.field_c + 1;
              var1 = this.field_b.field_h[fieldTemp$2].field_c;
              if (this.field_b.field_h[this.field_c + -1] != var1) {
                this.field_d = var1.field_c;
                this.field_a = var1;
                return var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = this.field_d;
          this.field_d = var1.field_c;
          this.field_a = var1;
          return var1;
        }
    }

    private final void a(int param0) {
        if (param0 != 1) {
          this.field_a = (ksa) null;
          this.field_d = this.field_b.field_h[0].field_c;
          this.field_a = null;
          this.field_c = 1;
          return;
        } else {
          this.field_d = this.field_b.field_h[0].field_c;
          this.field_a = null;
          this.field_c = 1;
          return;
        }
    }

    pnb(nga param0) {
        this.field_a = null;
        try {
            this.field_b = param0;
            this.a(1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pnb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (null == this.field_a) {
            throw new IllegalStateException();
        }
        this.field_a.b(-3846);
        this.field_a = null;
    }

    static {
    }
}
