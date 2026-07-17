/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class il implements Iterator {
    private int field_b;
    private ed field_g;
    private qb field_d;
    static sg field_e;
    private qb field_c;
    static mg[] field_a;
    static char[] field_f;

    final static nk a(int param0, boolean param1) {
        nk var2 = new nk(true);
        var2.field_e = param1 ? true : false;
        return var2;
    }

    private final void a() {
        ((il) this).field_b = 1;
        ((il) this).field_c = ((il) this).field_g.field_b[0].field_d;
        ((il) this).field_d = null;
    }

    final static uh a(int param0, int param1, int param2, int param3) {
        uh var5 = null;
        int var6 = 0;
        uh var7 = null;
        var6 = Main.field_T;
        var5 = (uh) (Object) tl.field_a.a((byte) 74);
        L0: while (true) {
          if (var5 == null) {
            var7 = new uh();
            var5 = var7;
            var7.field_g = param3;
            var7.field_h = 1;
            var7.field_k = 8;
            tl.field_a.a((qb) (Object) var5, 27362);
            ei.a(-91, var5, 3);
            return var5;
          } else {
            if (var5.field_g == param3) {
              return var5;
            } else {
              var5 = (uh) (Object) tl.field_a.b((byte) -123);
              continue L0;
            }
          }
        }
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Main.field_T;
        if (((il) this).field_g.field_b[((il) this).field_b - 1] == ((il) this).field_c) {
          L0: while (true) {
            if (((il) this).field_b < ((il) this).field_g.field_a) {
              qb[] fieldTemp$2 = ((il) this).field_g.field_b;
              int fieldTemp$3 = ((il) this).field_b;
              ((il) this).field_b = ((il) this).field_b + 1;
              if (fieldTemp$2[fieldTemp$3].field_d == ((il) this).field_g.field_b[((il) this).field_b - 1]) {
                ((il) this).field_c = ((il) this).field_g.field_b[-1 + ((il) this).field_b];
                continue L0;
              } else {
                ((il) this).field_c = ((il) this).field_g.field_b[-1 + ((il) this).field_b].field_d;
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

    public final Object next() {
        int var2 = 0;
        Object var3 = null;
        qb var3_ref = null;
        qb var4 = null;
        var2 = Main.field_T;
        if (((il) this).field_g.field_b[-1 + ((il) this).field_b] == ((il) this).field_c) {
          L0: while (true) {
            if (((il) this).field_g.field_a > ((il) this).field_b) {
              qb[] fieldTemp$4 = ((il) this).field_g.field_b;
              int fieldTemp$5 = ((il) this).field_b;
              ((il) this).field_b = ((il) this).field_b + 1;
              var3_ref = fieldTemp$4[fieldTemp$5].field_d;
              if (((il) this).field_g.field_b[((il) this).field_b + -1] == var3_ref) {
                continue L0;
              } else {
                ((il) this).field_d = var3_ref;
                ((il) this).field_c = var3_ref.field_d;
                return (Object) (Object) var3_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((il) this).field_c;
          ((il) this).field_d = var4;
          ((il) this).field_c = var4.field_d;
          return (Object) (Object) var4;
        }
    }

    public static void b() {
        field_a = null;
        field_e = null;
        field_f = null;
    }

    public final void remove() {
        if (((il) this).field_d == null) {
            throw new IllegalStateException();
        }
        ((il) this).field_d.c(121);
        ((il) this).field_d = null;
    }

    il(ed param0) {
        ((il) this).field_d = null;
        try {
            ((il) this).field_g = param0;
            int discarded$0 = 64;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "il.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new sg();
        field_f = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
