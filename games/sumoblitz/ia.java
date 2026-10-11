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
        int fieldTemp$0 = 0;
        int var2;
        ms var3;
        ms var4;
        var2 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_b != this.field_e.field_c[this.field_f - 1]) {
          var4 = this.field_b;
          this.field_b = var4.field_b;
          this.field_g = var4;
          return var4;
        }
        do {
          if (this.field_f >= this.field_e.field_d) {
            return null;
          }
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          var3 = this.field_e.field_c[fieldTemp$0].field_b;
        } while (var3 == this.field_e.field_c[this.field_f - 1]);
        this.field_g = var3;
        this.field_b = var3.field_b;
        return var3;
    }

    public final void remove() {
        if (null == this.field_g) {
          throw new IllegalStateException();
        }
        this.field_g.b(false);
        this.field_g = null;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_e.field_c[-1 + this.field_f] != this.field_b) {
          return true;
        }
        while (this.field_e.field_d > this.field_f) {
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          if (this.field_e.field_c[fieldTemp$0].field_b != this.field_e.field_c[-1 + this.field_f]) {
            this.field_b = this.field_e.field_c[this.field_f - 1].field_b;
            return true;
          }
          this.field_b = this.field_e.field_c[-1 + this.field_f];
        }
        return false;
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
        if (param0 > 4) {
          this.field_g = null;
          return;
        }
        this.b(34);
        this.field_g = null;
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
