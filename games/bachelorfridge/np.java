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
        bw[] fieldTemp$4 = null;
        int fieldTemp$5 = 0;
        int var2 = 0;
        bw var3 = null;
        bw var4 = null;
        var2 = BachelorFridge.field_y;
        if (this.field_b == this.field_a.field_c[this.field_c + -1]) {
          L0: while (true) {
            if (this.field_a.field_f > this.field_c) {
              fieldTemp$4 = this.field_a.field_c;
              fieldTemp$5 = this.field_c;
              this.field_c = this.field_c + 1;
              var3 = fieldTemp$4[fieldTemp$5].field_b;
              if (this.field_a.field_c[this.field_c + -1] != var3) {
                this.field_d = var3;
                this.field_b = var3.field_b;
                return var3;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = this.field_b;
          this.field_b = var4.field_b;
          this.field_d = var4;
          return var4;
        }
    }

    private final void a(int param0) {
        this.field_b = this.field_a.field_c[0].field_b;
        this.field_c = 1;
        if (param0 > -34) {
          this.field_c = -99;
          this.field_d = null;
          return;
        } else {
          this.field_d = null;
          return;
        }
    }

    public final void remove() {
        if (!(this.field_d != null)) {
            throw new IllegalStateException();
        }
        this.field_d.a(false);
        this.field_d = null;
    }

    public final boolean hasNext() {
        bw[] fieldTemp$2 = null;
        int fieldTemp$3 = 0;
        int var2 = 0;
        var2 = BachelorFridge.field_y;
        if (this.field_a.field_c[this.field_c + -1] == this.field_b) {
          L0: while (true) {
            if (this.field_c < this.field_a.field_f) {
              fieldTemp$2 = this.field_a.field_c;
              fieldTemp$3 = this.field_c;
              this.field_c = this.field_c + 1;
              if (fieldTemp$2[fieldTemp$3].field_b != this.field_a.field_c[this.field_c - 1]) {
                this.field_b = this.field_a.field_c[this.field_c + -1].field_b;
                return true;
              } else {
                this.field_b = this.field_a.field_c[-1 + this.field_c];
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
