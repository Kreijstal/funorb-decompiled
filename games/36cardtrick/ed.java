/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ed implements Iterable {
    private qb field_d;
    static int[] field_e;
    static int field_c;
    int field_a;
    qb[] field_b;

    final void a(int param0, long param1, qb param2) {
        qb var5 = null;
        qb var6 = null;
        qb var7 = null;
        if (null == param2.field_a) {
          var7 = ((ed) this).field_b[(int)(param1 & (long)(-1 + ((ed) this).field_a))];
          var5 = var7;
          param2.field_d = var5;
          param2.field_a = var7.field_a;
          if (param0 >= -94) {
            ((ed) this).field_d = null;
            param2.field_a.field_d = param2;
            param2.field_d.field_a = param2;
            param2.field_e = param1;
            return;
          } else {
            param2.field_a.field_d = param2;
            param2.field_d.field_a = param2;
            param2.field_e = param1;
            return;
          }
        } else {
          param2.c(83);
          var6 = ((ed) this).field_b[(int)(param1 & (long)(-1 + ((ed) this).field_a))];
          var5 = var6;
          param2.field_d = var5;
          param2.field_a = var6.field_a;
          if (param0 < -94) {
            param2.field_a.field_d = param2;
            param2.field_d.field_a = param2;
            param2.field_e = param1;
            return;
          } else {
            ((ed) this).field_d = null;
            param2.field_a.field_d = param2;
            param2.field_d.field_a = param2;
            param2.field_e = param1;
            return;
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new il((ed) this);
    }

    final qb a(byte param0, long param1) {
        int var4 = 0;
        qb var5 = null;
        qb var6 = null;
        int var7 = 0;
        var7 = Main.field_T;
        var4 = -24 / ((21 - param0) / 48);
        var5 = ((ed) this).field_b[(int)((long)(-1 + ((ed) this).field_a) & param1)];
        ((ed) this).field_d = var5.field_d;
        L0: while (true) {
          if (var5 != ((ed) this).field_d) {
            if (((ed) this).field_d.field_e == param1) {
              var6 = ((ed) this).field_d;
              ((ed) this).field_d = ((ed) this).field_d.field_d;
              return var6;
            } else {
              ((ed) this).field_d = ((ed) this).field_d.field_d;
              continue L0;
            }
          } else {
            ((ed) this).field_d = null;
            return null;
          }
        }
    }

    private ed() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 3663) {
            field_c = -42;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[8192];
    }
}
