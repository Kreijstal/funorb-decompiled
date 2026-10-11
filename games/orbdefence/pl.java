/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pl implements Iterator {
    static String field_a;
    static String field_i;
    static String field_h;
    private ca field_c;
    static int field_d;
    private ca field_g;
    private ek field_e;
    private int field_b;
    static String field_f;

    public final boolean hasNext() {
        ca[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        var2 = OrbDefence.field_D ? 1 : 0;
        if (this.field_c != this.field_e.field_b[-1 + this.field_b]) {
          return true;
        }
        while (this.field_e.field_d > this.field_b) {
          fieldTemp$0 = this.field_e.field_b;
          fieldTemp$1 = this.field_b;
          this.field_b = this.field_b + 1;
          if (fieldTemp$0[fieldTemp$1].field_e != this.field_e.field_b[-1 + this.field_b]) {
            this.field_c = this.field_e.field_b[this.field_b - 1].field_e;
            return true;
          }
          this.field_c = this.field_e.field_b[-1 + this.field_b];
        }
        return false;
    }

    public final Object next() {
        ca[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        ca var3;
        ca var4;
        var2 = OrbDefence.field_D ? 1 : 0;
        if (this.field_e.field_b[this.field_b - 1] != this.field_c) {
          var4 = this.field_c;
          this.field_c = var4.field_e;
          this.field_g = var4;
          return var4;
        }
        do {
          if (this.field_b >= this.field_e.field_d) {
            return null;
          }
          fieldTemp$0 = this.field_e.field_b;
          fieldTemp$1 = this.field_b;
          this.field_b = this.field_b + 1;
          var3 = fieldTemp$0[fieldTemp$1].field_e;
        } while (this.field_e.field_b[-1 + this.field_b] == var3);
        this.field_c = var3.field_e;
        this.field_g = var3;
        return var3;
    }

    private final void a(byte param0) {
        this.field_b = 1;
        this.field_c = this.field_e.field_b[0].field_e;
        this.field_g = null;
        if (param0 != 103) {
          this.field_e = (ek) null;
          return;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_i = null;
        if (param0 == -1) {
          field_a = null;
          field_h = null;
          return;
        }
        pl.a(-5);
        field_a = null;
        field_h = null;
    }

    pl(ek param0) {
        this.field_g = null;
        try {
          this.field_e = param0;
          this.a((byte) 103);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "pl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (this.field_g == null) {
          throw new IllegalStateException();
        }
        this.field_g.b(57);
        this.field_g = null;
    }

    static {
        field_h = "Unable to connect to the data server. Please check any firewall you are using.";
        field_i = "Names can only contain letters, numbers, spaces and underscores";
        field_f = "This password contains your email address, and would be easy to guess";
    }
}
