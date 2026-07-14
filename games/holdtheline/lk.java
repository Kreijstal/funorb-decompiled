/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lk implements Iterable {
    static byte[][] field_e;
    static nn field_h;
    static go[] field_c;
    static int field_f;
    static qb field_d;
    ln field_i;
    static float field_b;
    static boolean[] field_g;
    static uf field_a;

    public final Iterator iterator() {
        return (Iterator) (Object) new vl((lk) this);
    }

    final ln b(byte param0) {
        ln var2 = null;
        if (param0 == 121) {
          var2 = ((lk) this).field_i.field_n;
          if (((lk) this).field_i == var2) {
            return null;
          } else {
            var2.a((byte) -42);
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_a = null;
        field_e = null;
        field_c = null;
        field_h = null;
        field_d = null;
        if (param0 <= 75) {
            field_f = 94;
        }
    }

    final void a(ln param0, int param1) {
        L0: {
          if (param0.field_l != null) {
            param0.a((byte) -42);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_n = ((lk) this).field_i;
        param0.field_l = ((lk) this).field_i.field_l;
        param0.field_l.field_n = param0;
        if (param1 != -29460) {
          return;
        } else {
          param0.field_n.field_l = param0;
          return;
        }
    }

    final static int a(float param0, int param1, int param2) {
        int var3 = param2 >> 1054317104 & 255;
        int var4 = (param2 & 65280) >> 1259048072;
        var3 = (int)((float)var3 * param0);
        int var5 = param2 & 255;
        var4 = (int)((float)var4 * param0);
        if (!(-1 >= (var3 ^ -1))) {
            var3 = 0;
        }
        var5 = (int)((float)var5 * param0);
        if (!(0 <= var4)) {
            var4 = 0;
        }
        if (!(var3 <= 255)) {
            var3 = 255;
        }
        if (255 < var4) {
            var4 = 255;
        }
        if (!((var5 ^ -1) <= param1)) {
            var5 = 0;
        }
        if (var5 > 255) {
            var5 = 255;
        }
        return var5 | (var4 << -6811640 | var3 << -1935224816);
    }

    private lk() throws Throwable {
        throw new Error();
    }

    final static float a(float[] param0, int param1, int param2, int param3, float param4) {
        if (param3 == -1) {
          if (param2 == 0) {
            return param0[param1];
          } else {
            return (1.0f - param4) * lk.a(param0, param1, -1 + param2, -1, param4) + param4 * lk.a(param0, 1 + param1, param2 + -1, -1, param4);
          }
        } else {
          field_d = null;
          if (param2 == 0) {
            return param0[param1];
          } else {
            return (1.0f - param4) * lk.a(param0, param1, -1 + param2, -1, param4) + param4 * lk.a(param0, 1 + param1, param2 + -1, -1, param4);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_g = new boolean[112];
    }
}
