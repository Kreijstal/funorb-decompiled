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

    final static void b() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        pd var9 = null;
        int var10 = 0;
        int stackIn_11_0 = 0;
        pd stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        pd stackOut_15_0 = null;
        pd stackOut_14_0 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1_int = mc.field_e - ch.field_i;
            ch.field_i = aq.field_x - (var1_int >> 1);
            mc.field_e = ch.field_i - -var1_int;
            eb.field_M = pm.field_Q + -(pl.field_F >> 1);
            var2 = eb.field_M;
            var3 = 0;
            L1: while (true) {
              if (var3 >= eo.field_e.length) {
                var4 = 17;
                break L0;
              } else {
                L2: {
                  var4 = dn.field_a[var3];
                  if (var4 < 0) {
                    var5 = kk.field_x;
                    break L2;
                  } else {
                    if (var4 == mo.field_Jb.field_d) {
                      var5 = ua.field_N;
                      break L2;
                    } else {
                      var5 = sb.field_c;
                      break L2;
                    }
                  }
                }
                L3: {
                  var6 = eo.field_e[var3];
                  if (var4 < 0) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L3;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = vh.a(stackIn_11_0 != 0, -76, var6);
                  var8 = -(var7 >> 1) + aq.field_x;
                  if (var4 >= 0) {
                    L5: {
                      var2 = var2 + pb.field_b;
                      if (var4 == mo.field_Jb.field_d) {
                        stackOut_15_0 = vk.field_I;
                        stackIn_16_0 = stackOut_15_0;
                        break L5;
                      } else {
                        stackOut_14_0 = li.field_E;
                        stackIn_16_0 = stackOut_14_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_16_0;
                      if (var9 != null) {
                        var9.a(var2, -wb.field_db + var8, (wb.field_db << 1) + var7, (ne.field_tb << 1) + po.field_n, 12018);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2 = var2 + ne.field_tb;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (var4 < 0) {
                    e.field_c.c(var6, var8, mg.field_H + var2, var5, -1);
                    var2 = var2 + dq.field_l;
                    break L7;
                  } else {
                    wn.field_u.c(var6, var8, var2 - -tk.field_n, var5, -1);
                    var2 = var2 + (po.field_n + (pb.field_b + ne.field_tb));
                    break L7;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "up.C(" + -125 + ')');
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
            br[] fieldTemp$0 = ((up) this).field_h.field_a;
            int fieldTemp$1 = ((up) this).field_a;
            ((up) this).field_a = ((up) this).field_a + 1;
            var1 = fieldTemp$0[fieldTemp$1].field_d;
        } while (((up) this).field_h.field_a[((up) this).field_a - 1] == var1);
        ((up) this).field_e = var1.field_d;
        ((up) this).field_b = var1;
        return (Object) (Object) var1;
    }

    final static void a(boolean param0) {
        dm.field_ac.a(18, 0, -(tb.field_u ? 40 + (2 + (qa.field_o - -2)) : 0) + pd.field_b.field_zb, 0, -3344);
        mo.field_Hb.a(18, 0, 42 + qa.field_o, -2 + (pd.field_b.field_zb + (-qa.field_o - 40)), -3344);
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
              br[] fieldTemp$16 = ((up) this).field_h.field_a;
              int fieldTemp$17 = ((up) this).field_a;
              ((up) this).field_a = ((up) this).field_a + 1;
              if (fieldTemp$16[fieldTemp$17].field_d != ((up) this).field_h.field_a[-1 + ((up) this).field_a]) {
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
        int var1 = 0;
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

    private final void c() {
        ((up) this).field_e = ((up) this).field_h.field_a[0].field_d;
        ((up) this).field_a = 1;
        ((up) this).field_b = null;
    }

    public static void a() {
        field_g = null;
        field_f = null;
        field_c = null;
    }

    up(wh param0) {
        ((up) this).field_b = null;
        try {
            ((up) this).field_h = param0;
            int discarded$0 = 1;
            this.c();
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "up.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Go!";
    }
}
