/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hb implements Iterator {
    private static int[] field_d;
    static int field_h;
    static ed[][] field_b;
    private hg field_g;
    private int field_f;
    private qm field_e;
    private hg field_c;
    static String field_a;

    public final void remove() {
        if (((hb) this).field_c == null) {
            throw new IllegalStateException();
        }
        ((hb) this).field_c.c((byte) -90);
        ((hb) this).field_c = null;
    }

    private final void a(byte param0) {
        ((hb) this).field_g = ((hb) this).field_e.field_b[0].field_b;
        ((hb) this).field_c = null;
        ((hb) this).field_f = 1;
    }

    public final boolean hasNext() {
        int var2 = EscapeVector.field_A;
        if (((hb) this).field_g != ((hb) this).field_e.field_b[-1 + ((hb) this).field_f]) {
            return true;
        }
        while (((hb) this).field_e.field_g > ((hb) this).field_f) {
            int fieldTemp$0 = ((hb) this).field_f;
            ((hb) this).field_f = ((hb) this).field_f + 1;
            if (((hb) this).field_e.field_b[fieldTemp$0].field_b != ((hb) this).field_e.field_b[((hb) this).field_f - 1]) {
                ((hb) this).field_g = ((hb) this).field_e.field_b[-1 + ((hb) this).field_f].field_b;
                return true;
            }
            ((hb) this).field_g = ((hb) this).field_e.field_b[-1 + ((hb) this).field_f];
        }
        return false;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (param0) {
            hb.a(true);
        }
        field_b = null;
    }

    public final Object next() {
        hg var1 = null;
        int var2 = 0;
        var2 = EscapeVector.field_A;
        if (((hb) this).field_e.field_b[-1 + ((hb) this).field_f] != ((hb) this).field_g) {
          var1 = ((hb) this).field_g;
          ((hb) this).field_g = var1.field_b;
          ((hb) this).field_c = var1;
          return (Object) (Object) var1;
        } else {
          L0: while (true) {
            if (((hb) this).field_e.field_g > ((hb) this).field_f) {
              int fieldTemp$2 = ((hb) this).field_f;
              ((hb) this).field_f = ((hb) this).field_f + 1;
              var1 = ((hb) this).field_e.field_b[fieldTemp$2].field_b;
              if (((hb) this).field_e.field_b[((hb) this).field_f + -1] != var1) {
                ((hb) this).field_c = var1;
                ((hb) this).field_g = var1.field_b;
                return (Object) (Object) var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        }
    }

    hb(qm param0) {
        ((hb) this).field_c = null;
        try {
            ((hb) this).field_e = param0;
            this.a((byte) -59);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "hb.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_d = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var4 = (long)((var0 << 1) + -1);
            var6 = (long)((var0 << 1) + 1);
            var3 = (int)((var6 * var6 >> 18) + -32768L);
            var2 = (int)((var4 * var4 >> 18) + -32768L);
            if (!(field_d.length > var3)) {
                var3 = -1 + field_d.length;
            }
            for (var1 = var2 < 0 ? 0 : var2; var1 <= var3; var1++) {
                field_d[var1] = var0;
            }
        }
        field_a = "Five rock busters";
    }
}
