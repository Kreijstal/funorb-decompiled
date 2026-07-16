/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class di implements Iterator {
    private ug field_c;
    static int[] field_b;
    static String field_a;
    private ug field_d;
    private wh field_e;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, oh param3) {
        cf.field_g = param3;
        gh.field_H = param0;
        if (param1 != 0) {
            return;
        }
        td.field_a = param2;
    }

    public final Object next() {
        ug var1 = ((di) this).field_d;
        if (((di) this).field_e.field_a == var1) {
            var1 = null;
            ((di) this).field_d = null;
        } else {
            ((di) this).field_d = var1.field_l;
        }
        ((di) this).field_c = var1;
        return (Object) (Object) var1;
    }

    public final boolean hasNext() {
        return ((di) this).field_d != ((di) this).field_e.field_a;
    }

    di(wh param0) {
        ((di) this).field_c = null;
        ((di) this).field_e = param0;
        ((di) this).field_d = ((di) this).field_e.field_a.field_l;
        ((di) this).field_c = null;
    }

    final static String[] a(int param0, char param1, String param2) {
        int var3 = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Bounce.field_N;
        var10 = (CharSequence) (Object) param2;
        var3 = pj.a(false, param1, var10);
        var4 = new String[var3 - -1];
        var5 = 0;
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (var3 <= var7) {
            if (param0 >= -107) {
              field_a = null;
              var4[var3] = param2.substring(var6);
              return var4;
            } else {
              var4[var3] = param2.substring(var6);
              return var4;
            }
          } else {
            var8 = var6;
            L1: while (true) {
              if (param1 == param2.charAt(var8)) {
                int incrementValue$2 = var5;
                var5++;
                var4[incrementValue$2] = param2.substring(var6, var8);
                var6 = 1 + var8;
                var7++;
                continue L0;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    public final void remove() {
        if (!(((di) this).field_c != null)) {
            throw new IllegalStateException();
        }
        ((di) this).field_c.a(10);
        ((di) this).field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[128];
        field_a = "Unpacking sound effects";
    }
}
