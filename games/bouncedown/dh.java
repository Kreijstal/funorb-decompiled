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
        if (!(this.field_g != null)) {
            throw new IllegalStateException();
        }
        this.field_g.c(2);
        this.field_g = null;
    }

    private final void a(int param0) {
        this.field_h = this.field_c.field_b[0].field_c;
        this.field_f = 1;
        if (param0 != -1) {
            return;
        }
        this.field_g = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Bounce.field_N;
        try {
          L0: {
            L1: {
              na.a(param3, param0, param2 - -1, 10000536);
              na.a(param3, param0 - -param4, param2 - -1, 12105912);
              var5_int = 1;
              var6 = param4;
              if (var5_int + param0 < na.field_i) {
                var5_int = na.field_i - param0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 + var6 > na.field_f) {
                var6 = -param0 + na.field_f;
                break L2;
              } else {
                break L2;
              }
            }
            if (param1 == 1232050056) {
              var7 = var5_int;
              L3: while (true) {
                if (var7 >= var6) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = 48 * var7 / param4 + 152;
                  var9 = var8 | (var8 << -608757616 | var8 << 1232050056);
                  na.field_d[param3 + na.field_e * (var7 + param0)] = var9;
                  na.field_d[param3 + (param0 + var7) * na.field_e - -param2] = var9;
                  var7++;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var5), "dh.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final Object next() {
        int fieldTemp$2 = 0;
        ai var1 = null;
        int var2 = 0;
        var2 = Bounce.field_N;
        if (this.field_h != this.field_c.field_b[-1 + this.field_f]) {
          var1 = this.field_h;
          this.field_g = var1;
          this.field_h = var1.field_c;
          return var1;
        } else {
          L0: while (true) {
            if (this.field_c.field_d > this.field_f) {
              fieldTemp$2 = this.field_f;
              this.field_f = this.field_f + 1;
              var1 = this.field_c.field_b[fieldTemp$2].field_c;
              if (this.field_c.field_b[this.field_f - 1] != var1) {
                this.field_g = var1;
                this.field_h = var1.field_c;
                return var1;
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
        int fieldTemp$0 = 0;
        int var2 = Bounce.field_N;
        if (!(this.field_c.field_b[-1 + this.field_f] == this.field_h)) {
            return true;
        }
        while (this.field_c.field_d > this.field_f) {
            fieldTemp$0 = this.field_f;
            this.field_f = this.field_f + 1;
            if (this.field_c.field_b[fieldTemp$0].field_c != this.field_c.field_b[this.field_f + -1]) {
                this.field_h = this.field_c.field_b[-1 + this.field_f].field_c;
                return true;
            }
            this.field_h = this.field_c.field_b[-1 + this.field_f];
        }
        return false;
    }

    final static void a(boolean param0, String param1, float param2, int param3) {
        try {
            if (param3 != -608757616) {
                field_a = (pc) null;
            }
            if (!(q.field_A != null)) {
                q.field_A = new db(q.field_N, ej.field_c);
                q.field_N.b(q.field_A, false);
            }
            q.field_A.a(param0, param2, param1, 65536);
            na.a();
            pj.a(true, 1);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "dh.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
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
        this.field_g = null;
        try {
            this.field_c = param0;
            this.a(-1);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new java.math.BigInteger("65537");
        field_d = "Loading...";
        field_e = "Connection restored.";
    }
}
