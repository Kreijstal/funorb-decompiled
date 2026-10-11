/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sh implements Iterator {
    private fa field_a;
    static String field_c;
    private kl field_g;
    private int field_b;
    private fa field_d;
    static mo field_e;
    static int field_f;

    public final Object next() {
        int fieldTemp$0 = 0;
        fa var1;
        int var2;
        var2 = Pixelate.field_H ? 1 : 0;
        if (this.field_g.field_e[-1 + this.field_b] != this.field_a) {
          var1 = this.field_a;
          this.field_a = var1.field_a;
          this.field_d = var1;
          return var1;
        }
        do {
          if (this.field_b >= this.field_g.field_a) {
            return null;
          }
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          var1 = this.field_g.field_e[fieldTemp$0].field_a;
        } while (this.field_g.field_e[this.field_b - 1] == var1);
        this.field_a = var1.field_a;
        this.field_d = var1;
        return var1;
    }

    public final void remove() {
        if (this.field_d == null) {
          throw new IllegalStateException();
        }
        this.field_d.c(2779);
        this.field_d = null;
    }

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
          field_c = (String) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = Pixelate.field_H ? 1 : 0;
        if (this.field_a != this.field_g.field_e[this.field_b - 1]) {
          return true;
        }
        while (this.field_b < this.field_g.field_a) {
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          if (this.field_g.field_e[fieldTemp$0].field_a != this.field_g.field_e[this.field_b - 1]) {
            this.field_a = this.field_g.field_e[-1 + this.field_b].field_a;
            return true;
          }
          this.field_a = this.field_g.field_e[this.field_b - 1];
        }
        return false;
    }

    final static boolean a(boolean param0, int param1) {
        if (param1 < 0) {
          return 0 == (1 + param1) % 4 ? true : false;
        }
        if (param0) {
          return true;
        }
        if (param1 < 1582) {
          return 0 == param1 % 4 ? true : false;
        }
        if (param1 % 4 != 0) {
          return false;
        }
        if (param1 % 100 != 0) {
          return true;
        }
        if (0 != param1 % 400) {
          return false;
        }
        return true;
    }

    private final void a(byte param0) {
        this.field_b = 1;
        this.field_d = null;
        this.field_a = this.field_g.field_e[0].field_a;
        if (param0 >= -11) {
          this.field_a = (fa) null;
          return;
        }
    }

    sh(kl param0) {
        this.field_d = null;
        try {
          this.field_g = param0;
          this.a((byte) -39);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "sh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Real-life threats";
        field_f = 1000;
    }
}
