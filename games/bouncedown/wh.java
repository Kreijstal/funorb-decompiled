/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wh implements Iterable {
    ug field_a;
    static String[] field_c;
    static volatile int field_d;
    static eh field_b;

    final void a(int param0, ug param1) {
        if (param1.field_i == null) {
          param1.field_l = ((wh) this).field_a;
          param1.field_i = ((wh) this).field_a.field_i;
          param1.field_i.field_l = param1;
          param1.field_l.field_i = param1;
          if (param0 != 6753) {
            ((wh) this).field_a = null;
            return;
          } else {
            return;
          }
        } else {
          param1.a(param0 + -6875);
          param1.field_l = ((wh) this).field_a;
          param1.field_i = ((wh) this).field_a.field_i;
          param1.field_i.field_l = param1;
          param1.field_l.field_i = param1;
          if (param0 == 6753) {
            return;
          } else {
            ((wh) this).field_a = null;
            return;
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new di((wh) this);
    }

    final ug a(int param0) {
        ug var2 = null;
        if (param0 == 14) {
          var2 = ((wh) this).field_a.field_l;
          if (((wh) this).field_a == var2) {
            return null;
          } else {
            var2.a(92);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static int a(int param0, CharSequence param1, int param2) {
        if (param0 != 1) {
            return 61;
        }
        return kf.a(param2, param1, true, 48);
    }

    public static void a(byte param0) {
        if (param0 >= -46) {
            field_b = null;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    private wh() throws Throwable {
        throw new Error();
    }

    final static void a(long param0, int param1) {
        if (0L >= param0) {
          return;
        } else {
          if (param1 == 19406) {
            if ((param0 % 10L ^ -1L) != -1L) {
              ba.a((byte) -102, param0);
              return;
            } else {
              ba.a((byte) -123, -1L + param0);
              ba.a((byte) -126, 1L);
              return;
            }
          } else {
            wh.a((byte) -4);
            if ((param0 % 10L ^ -1L) != -1L) {
              ba.a((byte) -102, param0);
              return;
            } else {
              ba.a((byte) -123, -1L + param0);
              ba.a((byte) -126, 1L);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[255];
        field_d = 0;
        field_b = new eh(14, 0, 4, 1);
    }
}
