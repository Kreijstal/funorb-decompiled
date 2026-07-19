/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ga implements Iterable {
    static int field_e;
    fc[] field_c;
    static String field_f;
    int field_a;
    static ce field_d;
    private fc field_g;
    static boolean[] field_b;

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        field_d = null;
        if (param0 != 72) {
            field_d = (ce) null;
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ee((ga) (this)));
    }

    final static boolean a(int param0) {
        int var1 = 0;
        var1 = 3 % ((param0 - -50) / 53);
        if (gl.field_I >= 20) {
          if (ic.a(1)) {
            if (0 < si.field_d) {
              if (ij.b(1)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final void a(fc param0, long param1, int param2) {
        fc var5 = null;
        try {
            if (!(null == param0.field_e)) {
                param0.a(param2 ^ 64);
            }
            var5 = this.field_c[(int)((long)(param2 + this.field_a) & param1)];
            param0.field_h = var5;
            param0.field_e = var5.field_e;
            param0.field_e.field_h = param0;
            param0.field_b = param1;
            param0.field_h.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ga.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final fc a(long param0, int param1) {
        fc var4 = null;
        fc var5 = null;
        int var6 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        var4 = this.field_c[(int)((long)(-1 + this.field_a) & param0)];
        this.field_g = var4.field_h;
        L0: while (true) {
          if (var4 == this.field_g) {
            if (param1 != 20) {
              field_b = (boolean[]) null;
              this.field_g = null;
              return null;
            } else {
              this.field_g = null;
              return null;
            }
          } else {
            if (param0 != this.field_g.field_b) {
              this.field_g = this.field_g.field_h;
              continue L0;
            } else {
              var5 = this.field_g;
              this.field_g = this.field_g.field_h;
              return var5;
            }
          }
        }
    }

    private ga() throws Throwable {
        throw new Error();
    }

    static {
        field_f = "That name is not available";
    }
}
