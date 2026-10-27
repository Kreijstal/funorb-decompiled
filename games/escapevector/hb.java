/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hb implements Iterator {
    private static int[] field_d;
    static int field_h;
    static Sprite[][] field_b;
    private IntrusiveNode field_g;
    private int field_f;
    private qm field_e;
    private IntrusiveNode field_c;
    static String field_a;

    public final void remove() {
        if (this.field_c == null) {
          throw new IllegalStateException();
        }
        this.field_c.unlink((byte) -90);
        this.field_c = null;
    }

    private final void a(byte param0) {
        this.field_g = this.field_e.field_b[0].next;
        this.field_c = null;
        if (param0 != -59) {
          this.hasNext();
        }
        this.field_f = 1;
    }

    public final boolean hasNext() {
        int var2 = EscapeVector.obfuscationControl;
        if (this.field_g != this.field_e.field_b[-1 + this.field_f]) {
          return true;
        }
        while (true) {
          if (this.field_e.field_g <= this.field_f) {
            return false;
          }
          int fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          if (this.field_e.field_b[fieldTemp$0].next == this.field_e.field_b[this.field_f - 1]) {
            this.field_g = this.field_e.field_b[-1 + this.field_f];
            continue;
          }
          break;
        }
        this.field_g = this.field_e.field_b[-1 + this.field_f].next;
        return true;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (param0) {
          hb.a(true);
        }
        field_b = (Sprite[][]) null;
    }

    public final Object next() {
        IntrusiveNode var1;
        int var2 = EscapeVector.obfuscationControl;
        if (this.field_e.field_b[-1 + this.field_f] != this.field_g) {
          var1 = this.field_g;
          this.field_g = var1.next;
          this.field_c = var1;
          return var1;
        }
        do {
          if (this.field_e.field_g <= this.field_f) {
            return null;
          }
          int fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          var1 = this.field_e.field_b[fieldTemp$0].next;
        } while (this.field_e.field_b[this.field_f - 1] == var1);
        this.field_c = var1;
        this.field_g = var1.next;
        return var1;
    }

    hb(qm param0) {
        this.field_c = null;
        try {
          this.field_e = param0;
          this.a((byte) -59);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new int[98304];
        for (int var0 = 92682; var0 >= 46341; var0--) {
          long var4 = (long)((var0 << 1) - 1);
          long var6 = (long)((var0 << 1) + 1);
          int var3 = (int)((var6 * var6 >> 18) - 32768L);
          int var2 = (int)((var4 * var4 >> 18) - 32768L);
          if (!(field_d.length > var3)) {
            var3 = -1 + field_d.length;
          }
          for (int var1 = var2 < 0 ? 0 : var2; var1 <= var3; var1++) {
            field_d[var1] = var0;
          }
        }
        field_a = "Five rock busters";
    }
}
