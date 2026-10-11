/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class na implements Iterator {
    static Random field_c;
    private int field_d;
    private li field_g;
    static String field_b;
    static long field_f;
    private lh field_e;
    private lh field_a;

    public final Object next() {
        int fieldTemp$0 = 0;
        int var2;
        lh var3;
        lh var4;
        var2 = fleas.field_A ? 1 : 0;
        if (this.field_g.field_f[-1 + this.field_d] != this.field_a) {
          var4 = this.field_a;
          this.field_e = var4;
          this.field_a = var4.field_h;
          return var4;
        }
        do {
          if (this.field_g.field_g <= this.field_d) {
            return null;
          }
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          var3 = this.field_g.field_f[fieldTemp$0].field_h;
        } while (var3 == this.field_g.field_f[this.field_d - 1]);
        this.field_e = var3;
        this.field_a = var3.field_h;
        return var3;
    }

    public final void remove() {
        if (null == this.field_e) {
          throw new IllegalStateException();
        }
        this.field_e.c(-1);
        this.field_e = null;
    }

    final static void a(byte param0) {
        if (param0 >= -40) {
          return;
        }
        String var2 = (String) null;
        ij.a(-1, "", (String) null);
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 <= 93) {
          return;
        }
        field_c = null;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = fleas.field_A ? 1 : 0;
        if (this.field_a != this.field_g.field_f[this.field_d - 1]) {
          return true;
        }
        while (true) {
          if (this.field_d >= this.field_g.field_g) {
            return false;
          }
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          if (this.field_g.field_f[fieldTemp$0].field_h == this.field_g.field_f[-1 + this.field_d]) {
            this.field_a = this.field_g.field_f[this.field_d - 1];
            continue;
          }
          break;
        }
        this.field_a = this.field_g.field_f[-1 + this.field_d].field_h;
        return true;
    }

    private final void a(int param0) {
        if (param0 == -1) {
          this.field_d = 1;
          this.field_e = null;
          this.field_a = this.field_g.field_f[0].field_h;
          return;
        }
        this.a(52);
        this.field_d = 1;
        this.field_e = null;
        this.field_a = this.field_g.field_f[0].field_h;
    }

    na(li param0) {
        this.field_e = null;
        try {
          this.field_g = param0;
          this.a(-1);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Tiles in the level (3/3)";
        field_f = 20000000L;
    }
}
