/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dh implements Iterator {
    private m field_c;
    private int field_f;
    static java.math.BigInteger field_b;
    private ai field_h;
    private ai field_g;
    static String field_d;
    static pc field_a;
    static String field_e;

    public final void remove() {
        if (!(((dh) this).field_g != null)) {
            throw new IllegalStateException();
        }
        ((dh) this).field_g.c(2);
        ((dh) this).field_g = null;
    }

    private final void a(int param0) {
        ((dh) this).field_h = ((dh) this).field_c.field_b[0].field_c;
        ((dh) this).field_f = 1;
        if (param0 != -1) {
            return;
        }
        ((dh) this).field_g = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Bounce.field_N;
          na.a(param3, param0, param2 - -1, 10000536);
          na.a(param3, param0 - -param4, param2 - -1, 12105912);
          var5 = 1;
          var6 = param4;
          if (var5 + param0 < na.field_i) {
            var5 = na.field_i - param0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 + var6 > na.field_f) {
            var6 = -param0 + na.field_f;
            break L1;
          } else {
            break L1;
          }
        }
        if (param1 == 1232050056) {
          var7 = var5;
          L2: while (true) {
            if (var7 < var6) {
              var8 = 48 * var7 / param4 + 152;
              var9 = var8 | (var8 << -608757616 | var8 << 1232050056);
              na.field_d[param3 + na.field_e * (var7 + param0)] = var9;
              na.field_d[param3 + (param0 + var7) * na.field_e - -param2] = var9;
              var7++;
              continue L2;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public final Object next() {
        ai var1 = null;
        int var2 = 0;
        var2 = Bounce.field_N;
        if (((dh) this).field_h != ((dh) this).field_c.field_b[-1 + ((dh) this).field_f]) {
          var1 = ((dh) this).field_h;
          ((dh) this).field_g = var1;
          ((dh) this).field_h = var1.field_c;
          return (Object) (Object) var1;
        } else {
          L0: while (true) {
            if (((dh) this).field_c.field_d > ((dh) this).field_f) {
              ((dh) this).field_f = ((dh) this).field_f + 1;
              var1 = ((dh) this).field_c.field_b[((dh) this).field_f].field_c;
              if (((dh) this).field_c.field_b[((dh) this).field_f - 1] != var1) {
                ((dh) this).field_g = var1;
                ((dh) this).field_h = var1.field_c;
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

    public final boolean hasNext() {
        int var2 = Bounce.field_N;
        if (!(((dh) this).field_c.field_b[-1 + ((dh) this).field_f] == ((dh) this).field_h)) {
            return true;
        }
        while (((dh) this).field_c.field_d > ((dh) this).field_f) {
            ((dh) this).field_f = ((dh) this).field_f + 1;
            if (((dh) this).field_c.field_b[((dh) this).field_f].field_c != ((dh) this).field_c.field_b[((dh) this).field_f + -1]) {
                ((dh) this).field_h = ((dh) this).field_c.field_b[-1 + ((dh) this).field_f].field_c;
                return true;
            }
            ((dh) this).field_h = ((dh) this).field_c.field_b[-1 + ((dh) this).field_f];
        }
        return false;
    }

    final static void a(boolean param0, String param1, float param2, int param3) {
        if (param3 != -608757616) {
            field_a = null;
            if (!(q.field_A != null)) {
                q.field_A = new db(q.field_N, ej.field_c);
                q.field_N.b((lk) (Object) q.field_A, false);
            }
            q.field_A.a(param0, param2, param1, 65536);
            na.a();
            pj.a(true, 1);
            return;
        }
        if (!(q.field_A != null)) {
            q.field_A = new db(q.field_N, ej.field_c);
            q.field_N.b((lk) (Object) q.field_A, false);
        }
        q.field_A.a(param0, param2, param1, 65536);
        na.a();
        pj.a(true, 1);
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 8832) {
            return;
        }
        field_e = null;
        field_a = null;
    }

    dh(m param0) {
        ((dh) this).field_g = null;
        ((dh) this).field_c = param0;
        this.a(-1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new java.math.BigInteger("65537");
        field_d = "Loading...";
        field_e = "Connection restored.";
    }
}
