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
        int var2 = 0;
        Object var3 = null;
        lh var3_ref = null;
        lh var4 = null;
        var2 = fleas.field_A ? 1 : 0;
        if (((na) this).field_g.field_f[-1 + ((na) this).field_d] == ((na) this).field_a) {
          L0: while (true) {
            if (((na) this).field_g.field_g > ((na) this).field_d) {
              int fieldTemp$2 = ((na) this).field_d;
              ((na) this).field_d = ((na) this).field_d + 1;
              var3_ref = ((na) this).field_g.field_f[fieldTemp$2].field_h;
              if (var3_ref == ((na) this).field_g.field_f[((na) this).field_d + -1]) {
                continue L0;
              } else {
                ((na) this).field_e = var3_ref;
                ((na) this).field_a = var3_ref.field_h;
                return (Object) (Object) var3_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((na) this).field_a;
          ((na) this).field_e = var4;
          ((na) this).field_a = var4.field_h;
          return (Object) (Object) var4;
        }
    }

    public final void remove() {
        if (!(null != ((na) this).field_e)) {
            throw new IllegalStateException();
        }
        ((na) this).field_e.c(-1);
        ((na) this).field_e = null;
    }

    final static void a(byte param0) {
        if (param0 >= -40) {
            return;
        }
        Object var2 = null;
        ij.a(-1, "", (String) null);
    }

    public static void b() {
        field_b = null;
        field_c = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = fleas.field_A ? 1 : 0;
        if (((na) this).field_a == ((na) this).field_g.field_f[((na) this).field_d - 1]) {
          L0: while (true) {
            if (((na) this).field_d < ((na) this).field_g.field_g) {
              int fieldTemp$1 = ((na) this).field_d;
              ((na) this).field_d = ((na) this).field_d + 1;
              if (((na) this).field_g.field_f[fieldTemp$1].field_h == ((na) this).field_g.field_f[-1 + ((na) this).field_d]) {
                ((na) this).field_a = ((na) this).field_g.field_f[((na) this).field_d - 1];
                continue L0;
              } else {
                ((na) this).field_a = ((na) this).field_g.field_f[-1 + ((na) this).field_d].field_h;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final void a(int param0) {
        if (param0 != -1) {
          this.a(52);
          ((na) this).field_d = 1;
          ((na) this).field_e = null;
          ((na) this).field_a = ((na) this).field_g.field_f[0].field_h;
          return;
        } else {
          ((na) this).field_d = 1;
          ((na) this).field_e = null;
          ((na) this).field_a = ((na) this).field_g.field_f[0].field_h;
          return;
        }
    }

    na(li param0) {
        ((na) this).field_e = null;
        try {
            ((na) this).field_g = param0;
            this.a(-1);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "na.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Tiles in the level (3/3)";
        field_f = 20000000L;
    }
}
