/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class di {
    private int field_e;
    static String field_b;
    static int[] field_n;
    private int field_k;
    static am field_i;
    private pg[] field_f;
    static boolean field_h;
    static int[] field_l;
    static qb field_d;
    private pg field_g;
    private pg field_a;
    static String field_c;
    static boolean field_j;
    static int field_m;

    final pg c(int param0) {
        int var3 = 0;
        pg var4 = null;
        pg var5 = null;
        pg var6 = null;
        pg var9 = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < -51) {
          if (((di) this).field_e > 0) {
            if (((di) this).field_f[((di) this).field_e - 1] != ((di) this).field_a) {
              var9 = ((di) this).field_a;
              ((di) this).field_a = var9.field_b;
              return var9;
            } else {
              L0: while (true) {
                if (((di) this).field_e < ((di) this).field_k) {
                  int fieldTemp$2 = ((di) this).field_e;
                  ((di) this).field_e = ((di) this).field_e + 1;
                  var4 = ((di) this).field_f[fieldTemp$2].field_b;
                  var6 = var4;
                  if (var4 != ((di) this).field_f[((di) this).field_e - 1]) {
                    ((di) this).field_a = var6.field_b;
                    return var6;
                  } else {
                    continue L0;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L1: while (true) {
              if (((di) this).field_e < ((di) this).field_k) {
                int fieldTemp$3 = ((di) this).field_e;
                ((di) this).field_e = ((di) this).field_e + 1;
                var4 = ((di) this).field_f[fieldTemp$3].field_b;
                var5 = var4;
                if (var4 != ((di) this).field_f[((di) this).field_e - 1]) {
                  ((di) this).field_a = var5.field_b;
                  return var5;
                } else {
                  continue L1;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final pg a(int param0) {
        ((di) this).field_e = 0;
        if (param0 != 10) {
            return null;
        }
        return ((di) this).c(-107);
    }

    public static void b(int param0) {
        field_n = null;
        field_c = null;
        field_l = null;
        field_i = null;
        field_b = null;
        field_d = null;
    }

    final pg a(long param0, int param1) {
        pg var5 = null;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 > -30) {
            return null;
        }
        pg var4 = ((di) this).field_f[(int)(param0 & (long)(-1 + ((di) this).field_k))];
        ((di) this).field_g = var4.field_b;
        while (var4 != ((di) this).field_g) {
            if (~param0 == ~((di) this).field_g.field_e) {
                var5 = ((di) this).field_g;
                ((di) this).field_g = ((di) this).field_g.field_b;
                return var5;
            }
            ((di) this).field_g = ((di) this).field_g.field_b;
        }
        ((di) this).field_g = null;
        return null;
    }

    final static String a(int param0, long param1) {
        nf.field_Bb.setTime(new Date(param1));
        int var3 = nf.field_Bb.get(7);
        int var4 = nf.field_Bb.get(5);
        int var5 = nf.field_Bb.get(2);
        int var6 = nf.field_Bb.get(1);
        int var7 = nf.field_Bb.get(11);
        int var8 = nf.field_Bb.get(12);
        if (param0 > -42) {
            return null;
        }
        int var9 = nf.field_Bb.get(13);
        return rm.field_m[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + no.field_ub[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final void a(pg param0, boolean param1, long param2) {
        if (!(param0.field_a == null)) {
            param0.a(true);
        }
        pg var5 = ((di) this).field_f[(int)(param2 & (long)(((di) this).field_k + -1))];
        param0.field_a = var5.field_a;
        param0.field_b = var5;
        param0.field_a.field_b = param0;
        if (!param1) {
            return;
        }
        try {
            param0.field_b.field_a = param0;
            param0.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "di.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    di(int param0) {
        int var2 = 0;
        pg var3 = null;
        ((di) this).field_e = 0;
        ((di) this).field_k = param0;
        ((di) this).field_f = new pg[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            pg dupTemp$2 = new pg();
            var3 = dupTemp$2;
            ((di) this).field_f[var2] = dupTemp$2;
            var3.field_b = var3;
            var3.field_a = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<shad><col=<%0>>UNDERDARK</col></shad>";
        field_c = "Waiting for extra data";
        field_n = new int[256];
        field_h = false;
        field_i = new am();
        field_j = true;
    }
}
