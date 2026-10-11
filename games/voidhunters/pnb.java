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
        int fieldTemp$0 = 0;
        int var2;
        var2 = VoidHunters.field_G;
        if (this.field_d != this.field_b.field_h[-1 + this.field_c]) {
          return true;
        }
        while (this.field_c < this.field_b.field_f) {
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          if (this.field_b.field_h[fieldTemp$0].field_c != this.field_b.field_h[-1 + this.field_c]) {
            this.field_d = this.field_b.field_h[this.field_c - 1].field_c;
            return true;
          }
          this.field_d = this.field_b.field_h[this.field_c - 1];
        }
        return false;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        ksa var1;
        int var2;
        var2 = VoidHunters.field_G;
        if (this.field_b.field_h[this.field_c - 1] != this.field_d) {
          var1 = this.field_d;
          this.field_d = var1.field_c;
          this.field_a = var1;
          return var1;
        }
        do {
          if (this.field_c >= this.field_b.field_f) {
            return null;
          }
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          var1 = this.field_b.field_h[fieldTemp$0].field_c;
        } while (this.field_b.field_h[this.field_c - 1] == var1);
        this.field_d = var1.field_c;
        this.field_a = var1;
        return var1;
    }

    private final void a(int param0) {
        if (param0 == 1) {
          this.field_d = this.field_b.field_h[0].field_c;
          this.field_a = null;
          this.field_c = 1;
          return;
        }
        this.field_a = (ksa) null;
        this.field_d = this.field_b.field_h[0].field_c;
        this.field_a = null;
        this.field_c = 1;
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
