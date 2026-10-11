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
        return (Iterator) ((Object) new ee(this));
    }

    final static boolean a(int param0) {
        int var1 = 3 % ((param0 + 50) / 53);
        if (gl.field_I < 20) {
          return true;
        }
        if (!ic.a(1)) {
          return true;
        }
        if (0 >= si.field_d) {
          return false;
        }
        if (!ij.b(1)) {
          return true;
        }
        return false;
    }

    final void a(fc param0, long param1, int param2) {
        fc var5 = null;
        try {
          if (null != param0.field_e) {
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
        fc var5 = null;
        int var6 = TrackController.field_F ? 1 : 0;
        fc var4 = this.field_c[(int)((long)(-1 + this.field_a) & param0)];
        this.field_g = var4.field_h;
        while (var4 != this.field_g) {
          if (param0 == this.field_g.field_b) {
            var5 = this.field_g;
            this.field_g = this.field_g.field_h;
            return var5;
          }
          this.field_g = this.field_g.field_h;
        }
        if (param1 == 20) {
          this.field_g = null;
          return null;
        }
        field_b = (boolean[]) null;
        this.field_g = null;
        return null;
    }

    private ga() throws Throwable {
        throw new Error();
    }

    static {
        field_f = "That name is not available";
    }
}
