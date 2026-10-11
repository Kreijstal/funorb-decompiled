/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class np implements Iterator {
    private int field_c;
    private bw field_b;
    private bw field_d;
    private wha field_a;

    public final Object next() {
        bw[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        bw var3;
        bw var4;
        var2 = BachelorFridge.field_y;
        if (this.field_b != this.field_a.field_c[this.field_c - 1]) {
          var4 = this.field_b;
          this.field_b = var4.field_b;
          this.field_d = var4;
          return var4;
        }
        do {
          if (this.field_a.field_f <= this.field_c) {
            return null;
          }
          fieldTemp$0 = this.field_a.field_c;
          fieldTemp$1 = this.field_c;
          this.field_c = this.field_c + 1;
          var3 = fieldTemp$0[fieldTemp$1].field_b;
        } while (this.field_a.field_c[this.field_c - 1] == var3);
        this.field_d = var3;
        this.field_b = var3.field_b;
        return var3;
    }

    private final void a(int param0) {
        this.field_b = this.field_a.field_c[0].field_b;
        this.field_c = 1;
        if (param0 <= -34) {
          this.field_d = null;
          return;
        }
        this.field_c = -99;
        this.field_d = null;
    }

    public final void remove() {
        if (this.field_d == null) {
          throw new IllegalStateException();
        }
        this.field_d.a(false);
        this.field_d = null;
    }

    public final boolean hasNext() {
        bw[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        var2 = BachelorFridge.field_y;
        if (this.field_a.field_c[this.field_c - 1] != this.field_b) {
          return true;
        }
        while (this.field_c < this.field_a.field_f) {
          fieldTemp$0 = this.field_a.field_c;
          fieldTemp$1 = this.field_c;
          this.field_c = this.field_c + 1;
          if (fieldTemp$0[fieldTemp$1].field_b != this.field_a.field_c[this.field_c - 1]) {
            this.field_b = this.field_a.field_c[this.field_c - 1].field_b;
            return true;
          }
          this.field_b = this.field_a.field_c[-1 + this.field_c];
        }
        return false;
    }

    np(wha param0) {
        this.field_d = null;
        try {
          this.field_a = param0;
          this.a(-87);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "np.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
