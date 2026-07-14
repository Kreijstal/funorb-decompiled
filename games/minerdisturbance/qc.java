/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qc implements Iterable {
    static ea field_d;
    static int field_f;
    static bg field_a;
    al field_e;
    static boolean field_b;
    static int field_c;

    final static ea c(int param0) {
        int var1 = 0;
        og var3 = null;
        int[] var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var17 = null;
        byte[] var18 = null;
        int[] var19 = null;
        byte[] var20 = null;
        int[] var21 = null;
        L0: {
          var7 = MinerDisturbance.field_ab;
          var1 = qk.field_b[0] * ng.field_e[0];
          var18 = db.field_b[0];
          if (param0 == 255) {
            break L0;
          } else {
            field_c = 101;
            break L0;
          }
        }
        L1: {
          if (jk.field_gb[0]) {
            var20 = ci.field_a[0];
            var21 = new int[var1];
            var17 = var21;
            var13 = var17;
            var11 = var13;
            var5 = var11;
            var6 = 0;
            L2: while (true) {
              if (var6 >= var1) {
                var3 = new og(pf.field_c, wd.field_a, bg.field_d[0], oc.field_e[0], qk.field_b[0], ng.field_e[0], var21);
                break L1;
              } else {
                var5[var6] = hi.a(c.a(255, (int) var20[var6]) << -1930255720, af.field_p[c.a((int) var18[var6], 255)]);
                var6++;
                continue L2;
              }
            }
          } else {
            var19 = new int[var1];
            var15 = var19;
            var8 = var15;
            var5_int = 0;
            L3: while (true) {
              if (var1 <= var5_int) {
                var3 = (og) (Object) new ea(pf.field_c, wd.field_a, bg.field_d[0], oc.field_e[0], qk.field_b[0], ng.field_e[0], var19);
                break L1;
              } else {
                var8[var5_int] = af.field_p[c.a(255, (int) var18[var5_int])];
                var5_int++;
                continue L3;
              }
            }
          }
        }
        ec.a((byte) 40);
        return (ea) (Object) var3;
    }

    final al a(int param0) {
        if (param0 != 609) {
            return null;
        }
        al var2 = ((qc) this).field_e.field_t;
        if (var2 == ((qc) this).field_e) {
            return null;
        }
        var2.a((byte) -99);
        return var2;
    }

    final void a(byte param0, al param1) {
        if (!(null == param1.field_q)) {
            param1.a((byte) -120);
        }
        param1.field_q = ((qc) this).field_e.field_q;
        param1.field_t = ((qc) this).field_e;
        param1.field_q.field_t = param1;
        if (param0 != -37) {
            al discarded$0 = ((qc) this).a(113);
        }
        param1.field_t.field_q = param1;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new bc((qc) this);
    }

    public static void b(int param0) {
        if (param0 != 2207) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    private qc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_a = new bg(8, 0, 4, 1);
        field_b = true;
        field_c = 65;
    }
}
