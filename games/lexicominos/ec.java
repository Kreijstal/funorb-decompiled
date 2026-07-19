/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ec implements Iterator {
    private bg field_d;
    private ca field_f;
    private ca field_a;
    static int field_c;
    static sh field_b;
    static ng field_e;

    public final Object next() {
        ca var1 = null;
        var1 = this.field_a;
        if (var1 != this.field_d.field_e) {
          this.field_a = var1.field_l;
          if (Lexicominos.field_L) {
            this.field_a = null;
            var1 = null;
            this.field_f = var1;
            return var1;
          } else {
            this.field_f = var1;
            return var1;
          }
        } else {
          this.field_a = null;
          var1 = null;
          this.field_f = var1;
          return var1;
        }
    }

    ec(bg param0) {
        this.field_f = null;
        try {
            this.field_d = param0;
            this.field_f = null;
            this.field_a = this.field_d.field_e.field_l;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ec.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_e = null;
        if (!param0) {
            field_b = (sh) null;
        }
    }

    public final void remove() {
        if (!(this.field_f != null)) {
            throw new IllegalStateException();
        }
        this.field_f.b(12);
        this.field_f = null;
    }

    final static int a(int param0) {
        if (param0 != -28617) {
            return -26;
        }
        return tb.field_b;
    }

    public final boolean hasNext() {
        return this.field_a != this.field_d.field_e;
    }

    static {
    }
}
