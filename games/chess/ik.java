/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ik implements Iterator {
    private IntrusiveNode field_c;
    private IntrusiveNode field_d;
    static String field_f;
    static short[] field_g;
    static String[] field_a;
    private int field_h;
    static String field_b;
    static tk field_e;
    private bl field_j;
    static ld[] field_i;

    private final void a(int param0) {
        this.field_h = 1;
        int var2 = -7 / ((12 - param0) / 54);
        this.field_c = this.field_j.field_e[0].previous;
        this.field_d = null;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        int var2;
        IntrusiveNode var3;
        IntrusiveNode var4;
        var2 = Chess.field_G;
        if (this.field_j.field_e[this.field_h - 1] != this.field_c) {
          var4 = this.field_c;
          this.field_c = var4.previous;
          this.field_d = var4;
          return var4;
        }
        do {
          if (this.field_j.field_f <= this.field_h) {
            return null;
          }
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          var3 = this.field_j.field_e[fieldTemp$0].previous;
        } while (var3 == this.field_j.field_e[-1 + this.field_h]);
        this.field_d = var3;
        this.field_c = var3.previous;
        return var3;
    }

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        if (param0 <= -64) {
          field_a = null;
          field_i = null;
          field_e = null;
          field_f = null;
          return;
        }
        field_a = (String[]) null;
        field_a = null;
        field_i = null;
        field_e = null;
        field_f = null;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = Chess.field_G;
        if (this.field_j.field_e[-1 + this.field_h] != this.field_c) {
          return true;
        }
        while (true) {
          if (this.field_j.field_f <= this.field_h) {
            return false;
          }
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          if (this.field_j.field_e[fieldTemp$0].previous == this.field_j.field_e[-1 + this.field_h]) {
            this.field_c = this.field_j.field_e[-1 + this.field_h];
            continue;
          }
          break;
        }
        this.field_c = this.field_j.field_e[-1 + this.field_h].previous;
        return true;
    }

    final static aj b(int param0) {
        if (g.field_a == ji.field_T) {
          throw new IllegalStateException();
        }
        if (kn.field_D == g.field_a) {
          g.field_a = ji.field_T;
          return lg.field_a;
        }
        if (param0 != 6792) {
          field_b = (String) null;
          return null;
        }
        return null;
    }

    ik(bl param0) {
        this.field_d = null;
        try {
          this.field_j = param0;
          this.a(90);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (null == this.field_d) {
          throw new IllegalStateException();
        }
        this.field_d.unlink(-2193);
        this.field_d = null;
    }

    static {
        field_b = "Unable to delete friend - system busy";
        field_g = new short[]{(short)16288, (short)6792};
        field_f = "3D MODE";
        field_e = new tk();
    }
}
