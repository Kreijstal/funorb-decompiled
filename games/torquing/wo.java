/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wo implements Iterator {
    private lj field_a;
    static tm field_d;
    private ta field_c;
    private ta field_b;

    final static void a(byte param0, int param1, int[] param2) {
        int var3 = 0;
        var3 = fo.a(param2[param1], (byte) -18, param2[param1 - -1]);
        var3 = fo.a(param2[param1 + 2], (byte) -128, var3);
        param2[param1] = param2[param1] / var3;
        param2[1 + param1] = param2[1 + param1] / var3;
        if (param0 != 49) {
          wo.a(-112, 3, 4, -83, true, -82);
          param2[2 + param1] = param2[2 + param1] / var3;
          return;
        } else {
          param2[2 + param1] = param2[2 + param1] / var3;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param4 != param2) {
          L0: {
            if (param0 >= 110) {
              break L0;
            } else {
              wo.a(-31);
              break L0;
            }
          }
          if (param1 - param4 >= kn.field_e) {
            if (qg.field_z >= param1 - -param4) {
              if (j.field_q <= -param2 + param3) {
                if (qk.field_p >= param3 + param2) {
                  wh.a(param5, -1817, param4, param1, param2, param3);
                  return;
                } else {
                  a.a(param5, param1, param4, (byte) 123, param3, param2);
                  return;
                }
              } else {
                a.a(param5, param1, param4, (byte) 123, param3, param2);
                return;
              }
            } else {
              a.a(param5, param1, param4, (byte) 123, param3, param2);
              return;
            }
          } else {
            a.a(param5, param1, param4, (byte) 123, param3, param2);
            return;
          }
        } else {
          qo.a(param5, param4, param3, (byte) -95, param1);
          return;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            wo.a(-30, 57, -96, -102, false, -105);
        }
    }

    public final void remove() {
        if (null == ((wo) this).field_b) {
            throw new IllegalStateException();
        }
        ((wo) this).field_b.h(0);
        ((wo) this).field_b = null;
    }

    public final boolean hasNext() {
        return ((wo) this).field_a.field_a != ((wo) this).field_c;
    }

    final static void a(int param0) {
        String var1 = null;
        if (!ff.field_a) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (null != gn.field_m) {
              gn.field_m.b(true);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = kf.a(17241);
          un.field_k = new pe(var1, (String) null, true, false, false);
          dc.field_a.a((gm) (Object) hb.field_x, (byte) 82);
          hb.field_x.c((gm) (Object) un.field_k, 33);
          if (param0 <= 22) {
            field_d = null;
            hb.field_x.j(0);
            return;
          } else {
            hb.field_x.j(0);
            return;
          }
        }
    }

    public final Object next() {
        ta var1 = ((wo) this).field_c;
        if (var1 == ((wo) this).field_a.field_a) {
            var1 = null;
            ((wo) this).field_c = null;
        } else {
            ((wo) this).field_c = var1.field_p;
        }
        ((wo) this).field_b = var1;
        return (Object) (Object) var1;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        var8 = Torquing.field_u;
        int incrementValue$4 = param5;
        param5++;
        di.a(param0, (byte) -118, param1, qd.field_a[incrementValue$4], param3);
        if (!param4) {
          return;
        } else {
          int incrementValue$5 = param2;
          param2--;
          di.a(param0, (byte) -122, param1, qd.field_a[incrementValue$5], param3);
          var6 = param5;
          L0: while (true) {
            if (param2 < var6) {
              return;
            } else {
              var7 = qd.field_a[var6];
              var7[param3] = param1;
              var7[param0] = param1;
              var6++;
              continue L0;
            }
          }
        }
    }

    wo(lj param0) {
        ((wo) this).field_b = null;
        ((wo) this).field_a = param0;
        ((wo) this).field_c = ((wo) this).field_a.field_a.field_p;
        ((wo) this).field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new tm();
    }
}
