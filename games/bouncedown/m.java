/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class m implements Iterable {
    int field_d;
    private ai field_f;
    ai[] field_b;
    static bc field_e;
    static bc field_c;
    static int field_g;
    static int[] field_a;

    public static void a(int param0) {
        int discarded$0 = 0;
        field_c = null;
        field_a = null;
        field_e = null;
        if (param0 != -1) {
            discarded$0 = m.a((byte) -27);
        }
    }

    final ai a(byte param0, long param1) {
        ai var4 = null;
        int var5 = 0;
        ai var6 = null;
        int var7 = 0;
        var7 = Bounce.field_N;
        var5 = -117 / ((param0 - 20) / 36);
        var4 = this.field_b[(int)(param1 & (long)(-1 + this.field_d))];
        this.field_f = var4.field_c;
        L0: while (true) {
          if (var4 != this.field_f) {
            if ((this.field_f.field_d ^ -1L) == (param1 ^ -1L)) {
              var6 = this.field_f;
              this.field_f = this.field_f.field_c;
              return var6;
            } else {
              this.field_f = this.field_f.field_c;
              continue L0;
            }
          } else {
            this.field_f = null;
            return null;
          }
        }
    }

    final void a(int param0, long param1, ai param2) {
        Iterator discarded$0 = null;
        ai var5 = null;
        try {
            if (param0 > -95) {
                discarded$0 = this.iterator();
            }
            if (!(null == param2.field_f)) {
                param2.c(2);
            }
            var5 = this.field_b[(int)((long)(-1 + this.field_d) & param1)];
            param2.field_f = var5.field_f;
            param2.field_c = var5;
            param2.field_f.field_c = param2;
            param2.field_d = param1;
            param2.field_c.field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "m.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new dh((m) (this)));
    }

    private m() throws Throwable {
        throw new Error();
    }

    final static int a(byte param0) {
        if (param0 <= 1) {
            field_e = (bc) null;
            return wh.field_d;
        }
        return wh.field_d;
    }

    static {
        field_e = new bc();
        field_c = new bc();
        field_g = -1;
    }
}
