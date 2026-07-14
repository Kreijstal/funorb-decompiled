/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class up implements Iterator {
    private int field_a;
    static cj field_g;
    private br field_b;
    static ja field_f;
    static int field_d;
    private wh field_h;
    static String field_c;
    private br field_e;

    public final void remove() {
        if (null == ((up) this).field_b) {
            throw new IllegalStateException();
        }
        ((up) this).field_b.a(true);
        ((up) this).field_b = null;
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        pd var9 = null;
        int var10 = 0;
        int stackIn_10_0 = 0;
        pd stackIn_15_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        pd stackOut_14_0 = null;
        pd stackOut_13_0 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        var1 = mc.field_e - ch.field_i;
        ch.field_i = aq.field_x - (var1 >> -1147096319);
        mc.field_e = ch.field_i - -var1;
        eb.field_M = pm.field_Q + -(pl.field_F >> -1997436479);
        var2 = eb.field_M;
        var3 = 0;
        L0: while (true) {
          if (var3 >= eo.field_e.length) {
            var4 = -17 / ((param0 - -59) / 46);
            return;
          } else {
            L1: {
              var4 = dn.field_a[var3];
              if (-1 < (var4 ^ -1)) {
                var5 = kk.field_x;
                break L1;
              } else {
                if (var4 == mo.field_Jb.field_d) {
                  var5 = ua.field_N;
                  break L1;
                } else {
                  var5 = sb.field_c;
                  break L1;
                }
              }
            }
            L2: {
              var6 = eo.field_e[var3];
              if ((var4 ^ -1) > -1) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
            L3: {
              var7 = vh.a(stackIn_10_0 != 0, -76, var6);
              var8 = -(var7 >> 518455937) + aq.field_x;
              if (-1 >= (var4 ^ -1)) {
                L4: {
                  var2 = var2 + pb.field_b;
                  if (var4 == mo.field_Jb.field_d) {
                    stackOut_14_0 = vk.field_I;
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    stackOut_13_0 = li.field_E;
                    stackIn_15_0 = stackOut_13_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_15_0;
                  if (var9 != null) {
                    var9.a(var2, -wb.field_db + var8, (wb.field_db << -1309194655) + var7, (ne.field_tb << 1954103137) + po.field_n, 12018);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var2 = var2 + ne.field_tb;
                break L3;
              } else {
                break L3;
              }
            }
            if (-1 < (var4 ^ -1)) {
              e.field_c.c(var6, var8, mg.field_H + var2, var5, -1);
              var2 = var2 + dq.field_l;
              var3++;
              continue L0;
            } else {
              wn.field_u.c(var6, var8, var2 - -tk.field_n, var5, -1);
              var2 = var2 + (po.field_n + (pb.field_b + ne.field_tb));
              var3++;
              continue L0;
            }
          }
        }
    }

    public final Object next() {
        br var1 = null;
        int var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((up) this).field_h.field_a[-1 + ((up) this).field_a] != ((up) this).field_e) {
            var1 = ((up) this).field_e;
            ((up) this).field_e = var1.field_d;
            ((up) this).field_b = var1;
            return (Object) (Object) var1;
        }
        do {
            if (((up) this).field_a >= ((up) this).field_h.field_d) {
                return null;
            }
            ((up) this).field_a = ((up) this).field_a + 1;
            var1 = ((up) this).field_h.field_a[((up) this).field_a].field_d;
        } while (((up) this).field_h.field_a[((up) this).field_a - 1] == var1);
        ((up) this).field_e = var1.field_d;
        ((up) this).field_b = var1;
        return (Object) (Object) var1;
    }

    final static void a(boolean param0) {
        dm.field_ac.a(18, 0, -(tb.field_u ? 40 + (2 + (qa.field_o - -2)) : 0) + pd.field_b.field_zb, 0, -3344);
        mo.field_Hb.a(18, 0, 42 + qa.field_o, -2 + (pd.field_b.field_zb + (-qa.field_o - 40)), -3344);
        if (param0) {
            field_g = null;
        }
        hf.field_e.a(qa.field_o, 2, pd.field_b.field_zb, 0, pd.field_b.field_z + -20, -31465, 20);
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((up) this).field_h.field_a[-1 + ((up) this).field_a] != ((up) this).field_e) {
          return true;
        } else {
          L0: while (true) {
            if (((up) this).field_a >= ((up) this).field_h.field_d) {
              return false;
            } else {
              ((up) this).field_a = ((up) this).field_a + 1;
              if (((up) this).field_h.field_a[((up) this).field_a].field_d != ((up) this).field_h.field_a[-1 + ((up) this).field_a]) {
                ((up) this).field_e = ((up) this).field_h.field_a[((up) this).field_a - 1].field_d;
                return true;
              } else {
                ((up) this).field_e = ((up) this).field_h.field_a[-1 + ((up) this).field_a];
                continue L0;
              }
            }
          }
        }
    }

    final static String a(int param0) {
        int var1 = 57 % ((param0 - 77) / 49);
        if (cb.field_l) {
            return null;
        }
        if (l.field_a < um.field_h) {
            return null;
        }
        if (!(br.field_a + um.field_h <= l.field_a)) {
            return kg.field_k;
        }
        return null;
    }

    private final void c(int param0) {
        ((up) this).field_e = ((up) this).field_h.field_a[0].field_d;
        ((up) this).field_a = param0;
        ((up) this).field_b = null;
    }

    public static void a(byte param0) {
        field_g = null;
        field_f = null;
        field_c = null;
        if (param0 >= -8) {
            field_d = -60;
        }
    }

    up(wh param0) {
        ((up) this).field_b = null;
        ((up) this).field_h = param0;
        this.c(1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Go!";
    }
}
