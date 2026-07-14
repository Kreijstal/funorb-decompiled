/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ce implements Iterable {
    static String field_d;
    static boolean field_e;
    private uf field_b;
    int field_c;
    uf[] field_a;

    public final Iterator iterator() {
        return (Iterator) (Object) new c((ce) this);
    }

    final static ci[] a(String param0, byte param1, String param2, fa param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        if (param1 > -70) {
          var6 = null;
          ci[] discarded$2 = ce.a((String) null, (byte) 73, (String) null, (fa) null);
          var4 = param3.c(-1, param2);
          var5 = param3.a(-103, var4, param0);
          return mj.a(param3, var4, var5, true);
        } else {
          var4 = param3.c(-1, param2);
          var5 = param3.a(-103, var4, param0);
          return mj.a(param3, var4, var5, true);
        }
    }

    final static long b(int param0) {
        if (param0 != 1) {
            field_d = null;
            return ll.a(1000) - dm.field_c;
        }
        return ll.a(1000) - dm.field_c;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(uf param0, byte param1, long param2) {
        uf var5 = null;
        if (param0.field_a == null) {
          var5 = ((ce) this).field_a[(int)(param2 & (long)(((ce) this).field_c - 1))];
          param0.field_a = var5.field_a;
          param0.field_d = var5;
          param0.field_a.field_d = param0;
          param0.field_d.field_a = param0;
          param0.field_g = param2;
          if (param1 > -49) {
            ce.a(-9);
            return;
          } else {
            return;
          }
        } else {
          param0.b((byte) 12);
          var5 = ((ce) this).field_a[(int)(param2 & (long)(((ce) this).field_c - 1))];
          param0.field_a = var5.field_a;
          param0.field_d = var5;
          param0.field_a.field_d = param0;
          param0.field_d.field_a = param0;
          param0.field_g = param2;
          if (param1 <= -49) {
            return;
          } else {
            ce.a(-9);
            return;
          }
        }
    }

    final uf a(long param0, byte param1) {
        uf var4 = null;
        uf var5 = null;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        var4 = ((ce) this).field_a[(int)((long)(-1 + ((ce) this).field_c) & param0)];
        ((ce) this).field_b = var4.field_d;
        L0: while (true) {
          if (var4 == ((ce) this).field_b) {
            ((ce) this).field_b = null;
            if (param1 == -21) {
              return null;
            } else {
              return null;
            }
          } else {
            if (param0 != ((ce) this).field_b.field_g) {
              ((ce) this).field_b = ((ce) this).field_b.field_d;
              continue L0;
            } else {
              var5 = ((ce) this).field_b;
              ((ce) this).field_b = ((ce) this).field_b.field_d;
              return var5;
            }
          }
        }
    }

    private ce() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_d = "ACT IV: ";
    }
}
