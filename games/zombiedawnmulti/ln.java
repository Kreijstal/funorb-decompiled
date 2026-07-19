/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ln implements Iterator {
    static int[] field_f;
    static String field_c;
    private e field_b;
    private qa field_a;
    static char[] field_d;
    private qa field_e;

    public final Object next() {
        qa var1 = null;
        var1 = this.field_e;
        if (this.field_b.field_d != var1) {
          this.field_e = var1.field_k;
          if (ZombieDawnMulti.field_E) {
            var1 = null;
            this.field_e = null;
            this.field_a = var1;
            return var1;
          } else {
            this.field_a = var1;
            return var1;
          }
        } else {
          var1 = null;
          this.field_e = null;
          this.field_a = var1;
          return var1;
        }
    }

    public final boolean hasNext() {
        return this.field_e != this.field_b.field_d;
    }

    public final void remove() {
        if (!(this.field_a != null)) {
            throw new IllegalStateException();
        }
        this.field_a.a(-4564);
        this.field_a = null;
    }

    public static void a(int param0) {
        if (param0 != 18358) {
          ln.a(-56);
          field_d = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    ln(e param0) {
        this.field_a = null;
        try {
            this.field_b = param0;
            this.field_a = null;
            this.field_e = this.field_b.field_d.field_k;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ln.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new int[128];
        field_c = "Report abuse";
        field_d = new char[]{(char)91, (char)93, (char)35};
    }
}
