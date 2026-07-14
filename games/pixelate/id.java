/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class id {
    boolean field_e;
    boolean field_g;
    String[] field_f;
    static bb field_d;
    String field_c;
    int field_a;
    static int field_b;

    public static void c(int param0) {
        int var1 = 64 / ((-80 - param0) / 37);
        field_d = null;
    }

    final static void a(byte param0, hf param1, int param2) {
        pc var5 = aa.field_f;
        var5.g(param2, 15514);
        var5.field_m = var5.field_m + 1;
        int var4 = var5.field_m;
        var5.e(160, 1);
        var5.e(160, param1.field_u);
        if (param0 > -96) {
            return;
        }
        var5.e(160, param1.field_v);
        var5.d(param1.field_s, -116);
        var5.d(param1.field_r, -102);
        var5.d(param1.field_l, -112);
        var5.d(param1.field_p, -120);
        int discarded$0 = var5.b(var4, (byte) 84);
        var5.f(var5.field_m - var4, -1);
    }

    final static void a(int param0) {
        if (param0 < 40) {
            field_d = null;
        }
        fm.field_b = new pl();
        ph.field_l.c((ng) (Object) fm.field_b, -121);
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        im.field_Hb = new tf[param0];
        var1 = 0;
        L0: while (true) {
          if ((var1 ^ -1) <= -3) {
            eg.a((byte) 99);
            qa.field_f.a(19692);
            ii.field_p = new hh[10];
            var1 = 0;
            L1: while (true) {
              if (var1 >= ii.field_p.length) {
                var1 = 0;
                L2: while (true) {
                  if (gg.field_z.length <= var1) {
                    return;
                  } else {
                    gg.field_z[var1] = var1 * 526344;
                    var1++;
                    continue L2;
                  }
                }
              } else {
                ii.field_p[var1] = new hh(64, 64, 2);
                var2 = 0;
                L3: while (true) {
                  if (ii.field_p[var1].field_n.length <= var2) {
                    var1++;
                    continue L1;
                  } else {
                    if (ok.a(ea.field_b, param0 ^ -124, 9) > var1) {
                      ii.field_p[var1].field_n[var2] = (byte) 1;
                      var2++;
                      continue L3;
                    } else {
                      var2++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            im.field_Hb[var1] = new tf(64, 64);
            var1++;
            continue L0;
          }
        }
    }

    final static void a(boolean param0, byte param1) {
        qk.field_e = 0;
        ae.field_b = 0;
        if (param1 <= 104) {
            return;
        }
        oe.field_Sb = 0;
        jn.field_q = ui.field_k;
        a.field_I = new pf(2);
        a.field_I.a(param0, el.a(bg.field_k, (byte) -106, uf.field_d), 17068, -1);
    }

    id(boolean param0) {
        ((id) this).field_g = param0 ? true : false;
    }

    static {
    }
}
