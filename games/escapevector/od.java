/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class od {
    static boolean field_k;
    static boolean field_s;
    static String field_d;
    static sb field_j;
    static int field_q;
    static boolean field_n;
    static ed field_b;
    private cn field_o;
    private int field_a;
    private int field_m;
    private ce field_e;
    private int field_g;
    private int field_r;
    private ed field_l;
    private int field_h;
    private oe field_f;
    private Random field_i;
    private int field_c;
    private int field_p;

    private final void a(boolean param0, int param1, int param2) {
        oc var5 = null;
        int var6 = EscapeVector.field_A;
        if (((od) this).field_o.a(-98)) {
            return;
        }
        hg var4 = ((od) this).field_o.a(false);
        while (var4 != null) {
            var5 = (oc) (Object) var4;
            var5.a(99, param2, param1);
            var4 = ((od) this).field_o.b((byte) 70);
        }
        if (!param0) {
            Object var7 = null;
            od.a((java.awt.Component) null, (byte) -120);
        }
    }

    final static void f(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var5 = EscapeVector.field_A;
        int var1 = al.field_f[0];
        int var3 = -128 % ((param0 - -36) / 48);
        for (var2 = 1; al.field_f.length > var2; var2++) {
            var4 = al.field_f[var2];
            qg.a(bc.field_f, var2 << -384220700, bc.field_f, var1, var4);
            var1 = var1 + var4;
        }
    }

    private final void a(byte param0) {
        ((od) this).field_l = new ed(((od) this).field_m, ((od) this).field_m);
        int[] var8 = new int[4];
        int[] var2 = var8;
        em.a(var8);
        ((od) this).field_l.g();
        int var3 = ((od) this).field_m / 2;
        int var4 = ((od) this).field_m / 2;
        int var5 = ((od) this).field_m / 2;
        int var6 = 1;
        em.d(var3, var4, var5, var6);
        if (!(md.field_D == null)) {
            md.field_D.a(125);
        }
        int var7 = -25 / ((param0 - -25) / 58);
        em.b(var8);
    }

    final static void b(int param0) {
        if (param0 != 2) {
            Object var2 = null;
            od.a((java.awt.Component) null, (byte) -63);
        }
        dj.a(0, -14, 0);
    }

    private final int a(boolean param0, int param1) {
        int var4 = EscapeVector.field_A;
        int var3 = ((od) this).field_f.field_n;
        while ((param1 ^ -1) > -1) {
            param1 = param1 + var3;
        }
        while (var3 <= param1) {
            param1 = param1 - var3;
        }
        if (param0) {
            this.a(-66);
        }
        return param1;
    }

    private final void a(int param0) {
        int var2 = 640;
        int var3 = 480;
        if (param0 > -99) {
            ((od) this).field_i = null;
        }
        int var4 = (((od) this).field_f.field_H >> 919080592) + -(var2 / 2);
        int var5 = (((od) this).field_f.field_p >> 1866474192) - var3 / 2;
        int var6 = this.a(var2, 1) + var4;
        var6 = this.a(false, var6);
        int var7 = this.a(var3, 1) + var5;
        if (!((var7 ^ -1) <= -1)) {
            var7 = 0;
        }
        int var8 = ((od) this).field_f.field_Fb;
        if (var7 >= var8) {
            var7 = -((od) this).field_l.field_z + (-1 + var8);
        }
        hh var9 = sf.field_e[0];
        oc var10 = new oc(((od) this).field_l, var6, var7, var9);
        ((od) this).field_o.a(-12328, (hg) (Object) var10);
    }

    final static int a(byte param0, boolean param1, String param2, sn param3, sn param4, int param5, int param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        n stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        n stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        n stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_11_2 = null;
        n stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        n stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        n stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_14_2 = null;
        n stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        n stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        n stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_9_2 = null;
        n stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        n stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        n stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        L0: {
          var13 = EscapeVector.field_A;
          var14 = param4.a(-106);
          var8 = param3.a(-78);
          if (param0 == -32) {
            break L0;
          } else {
            field_s = false;
            break L0;
          }
        }
        L1: {
          if (null != pg.field_c) {
            break L1;
          } else {
            if (sl.a(false, (byte) 0)) {
              break L1;
            } else {
              return -1;
            }
          }
        }
        L2: {
          if (al.field_d == sf.field_d) {
            L3: {
              sc.field_g = null;
              om.field_c.field_m = 0;
              if (param2 != null) {
                L4: {
                  var9 = 0;
                  qj.field_a.field_m = 0;
                  if (!param1) {
                    break L4;
                  } else {
                    var9 = var9 | 1;
                    break L4;
                  }
                }
                L5: {
                  qj.field_a.a((byte) 123, gk.field_a.nextInt());
                  qj.field_a.a((byte) 124, gk.field_a.nextInt());
                  qj.field_a.a((byte) 100, var14);
                  qj.field_a.a((byte) 100, var8);
                  var15 = (CharSequence) (Object) param2;
                  qj.field_a.a((byte) 100, mm.a(0, var15));
                  qj.field_a.h(-116, param5);
                  qj.field_a.f(param6, -123);
                  qj.field_a.f(var9, -123);
                  om.field_c.f(18, param0 ^ 101);
                  om.field_c.field_m = om.field_c.field_m + 2;
                  var10 = om.field_c.field_m;
                  var11_ref = tf.a(-1, oc.d((byte) -110));
                  if (var11_ref == null) {
                    var11_ref = "";
                    break L5;
                  } else {
                    break L5;
                  }
                }
                om.field_c.a(var11_ref, 105);
                bn.a(param0 ^ -32, (n) (Object) om.field_c, qj.field_a, q.field_O, cf.field_c);
                om.field_c.i(om.field_c.field_m + -var10, 32614);
                break L3;
              } else {
                L6: {
                  qj.field_a.field_m = 0;
                  qj.field_a.a((byte) 124, gk.field_a.nextInt());
                  qj.field_a.a((byte) 127, gk.field_a.nextInt());
                  stackOut_8_0 = qj.field_a;
                  stackOut_8_1 = 100;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  if (!param4.b(114)) {
                    stackOut_10_0 = (n) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = "";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    break L6;
                  } else {
                    stackOut_9_0 = (n) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = (String) var14;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    break L6;
                  }
                }
                L7: {
                  ((n) (Object) stackIn_11_0).a((byte) stackIn_11_1, stackIn_11_2);
                  stackOut_11_0 = qj.field_a;
                  stackOut_11_1 = 100;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (param3.b(88)) {
                    stackOut_13_0 = (n) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = (String) var8;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    break L7;
                  } else {
                    stackOut_12_0 = (n) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = "";
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    break L7;
                  }
                }
                ((n) (Object) stackIn_14_0).a((byte) stackIn_14_1, stackIn_14_2);
                om.field_c.f(16, -123);
                om.field_c.field_m = om.field_c.field_m + 1;
                var9 = om.field_c.field_m;
                bn.a(0, (n) (Object) om.field_c, qj.field_a, q.field_O, cf.field_c);
                om.field_c.e(-38, -var9 + om.field_c.field_m);
                break L3;
              }
            }
            rn.a(-1, 30785);
            al.field_d = cn.field_a;
            break L2;
          } else {
            break L2;
          }
        }
        L8: {
          if (cn.field_a != al.field_d) {
            break L8;
          } else {
            if (!bo.a(30000, 1)) {
              break L8;
            } else {
              L9: {
                var9 = om.field_g.e(0);
                om.field_g.field_m = 0;
                if (100 > var9) {
                  break L9;
                } else {
                  if (-106 > (var9 ^ -1)) {
                    break L9;
                  } else {
                    jf.field_I = new String[-100 + var9];
                    al.field_d = mf.field_k;
                    break L8;
                  }
                }
              }
              if (var9 == 248) {
                se.a((byte) 81, oc.d((byte) -108));
                ca.field_a = w.field_fb;
                nm.a(param0 ^ -16);
                e.field_c = false;
                return var9;
              } else {
                if ((var9 ^ -1) == -100) {
                  boolean discarded$1 = bo.a(30000, uc.b(92));
                  sc.field_g = new Boolean(va.a((n) (Object) om.field_g, true));
                  om.field_g.field_m = 0;
                  break L8;
                } else {
                  hi.field_r = -1;
                  cd.field_v = var9;
                  al.field_d = mh.field_h;
                  break L8;
                }
              }
            }
          }
        }
        L10: {
          if (al.field_d != mf.field_k) {
            break L10;
          } else {
            var9 = 2;
            if (bo.a(param0 + 30032, var9)) {
              var10 = om.field_g.f(param0 + 1984);
              om.field_g.field_m = 0;
              if (bo.a(param0 + 30032, var10)) {
                var11 = jf.field_I.length;
                var12 = 0;
                L11: while (true) {
                  if (var12 >= var11) {
                    nm.a(16);
                    e.field_c = false;
                    return var11 + 100;
                  } else {
                    jf.field_I[var12] = om.field_g.f((byte) 125);
                    var12++;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          if (al.field_d != mh.field_h) {
            break L12;
          } else {
            if (!ll.d(param0 ^ -10538)) {
              break L12;
            } else {
              L13: {
                if (cd.field_v != 255) {
                  ca.field_a = om.field_g.c(false);
                  break L13;
                } else {
                  var9_ref = om.field_g.d(param0 + -15176);
                  if (var9_ref != null) {
                    ag.a(var9_ref, (byte) 30, oc.d((byte) -83));
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              nm.a(16);
              e.field_c = false;
              return cd.field_v;
            }
          }
        }
        L14: {
          if (pg.field_c == null) {
            if (!e.field_c) {
              var9 = ej.field_b;
              ej.field_b = sj.field_i;
              sj.field_i = var9;
              e.field_c = true;
              break L14;
            } else {
              L15: {
                if (30000L < un.e(64655)) {
                  ca.field_a = fl.field_l;
                  break L15;
                } else {
                  ca.field_a = wk.field_a;
                  break L15;
                }
              }
              e.field_c = false;
              return 249;
            }
          } else {
            break L14;
          }
        }
        return -1;
    }

    final void c(int param0) {
        hj var3 = null;
        hh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        this.a(true);
        if (!(((od) this).field_f.field_a)) {
            return;
        }
        int var2 = ((od) this).field_f.field_X;
        if (!(((od) this).field_g < var2)) {
            ((od) this).field_e = wc.field_d;
            ((od) this).field_r = 64;
        }
        if (!(((od) this).field_p >= var2)) {
            return;
        }
        var2 = -var2 + ((od) this).field_p;
        if (param0 == (var2 % ((od) this).field_h ^ -1)) {
            this.a(-110);
        }
        this.e(50);
        var2 = ((od) this).field_f.field_X;
        if (!(((od) this).field_c < var2)) {
            ((od) this).field_a = ((od) this).field_a + 1;
        }
        if (!(((od) this).field_c >= ((od) this).field_a)) {
            ((od) this).field_a = ((od) this).field_c;
        }
        if (1 == ((od) this).field_a) {
            var3 = pl.field_n;
            var4 = vn.field_c;
            var5 = 100;
            var6 = qm.field_c * 6144 / 64;
            var7 = 8192;
            var3.a(var4, var5, var6, var7);
        }
    }

    private final void e(int param0) {
        oc var3_ref = null;
        Object var3 = null;
        int var4 = EscapeVector.field_A;
        if (!(!((od) this).field_o.a(-120))) {
            return;
        }
        hg var2 = ((od) this).field_o.a(false);
        if (param0 != 50) {
            ((od) this).field_m = 75;
        }
        while (var2 != null) {
            var3_ref = (oc) (Object) var2;
            var3_ref.a();
            var2 = ((od) this).field_o.b((byte) 70);
        }
        var2 = ((od) this).field_o.a(false);
        while (var2 != null) {
            var3_ref = (oc) (Object) var2;
            if (!(!var3_ref.field_B)) {
                var3_ref.c((byte) -119);
                break;
            }
            var2 = ((od) this).field_o.b((byte) 70);
        }
    }

    private final int a(int param0, int param1) {
        long var3 = (long)((od) this).field_i.nextInt();
        if (-1L < (var3 ^ -1L)) {
            var3 = -var3;
        }
        var3 = (long)(param0 - param1) * var3 / 2147483647L;
        return (int)var3;
    }

    final void a(byte param0, int param1, int param2) {
        this.a(true, param2, param1);
        if (param0 != -87) {
            ce discarded$0 = ((od) this).b(true);
        }
        if ((((od) this).field_a ^ -1) >= -1) {
            return;
        }
        int var4 = 256;
        int var5 = ((od) this).field_a * var4 / ((od) this).field_c;
        int var6 = 640;
        int var7 = 480;
        int var8 = 16777215;
        em.a(0, 0, var6, var7, var8, var5);
    }

    final ce b(boolean param0) {
        if (!param0) {
            field_d = null;
        }
        return ((od) this).field_e;
    }

    private final void a(boolean param0) {
        int var2 = ((od) this).field_f.field_a ? 1 : 0;
        int var3 = ((od) this).field_f.field_X;
        var2 = (var3 > ((od) this).field_g ? 1 : 0) & var2;
        if (!param0) {
            int discarded$0 = this.a(false, 28);
        }
        int var4 = qm.field_c * 6144 / 64;
        int var5 = 8192;
        if (var2 == 0) {
            var4 = 0;
            var5 = 0;
        }
        hl var6 = ((od) this).field_f.field_lc;
        if (!(var6 != null)) {
            return;
        }
        var6.f(var4, var5);
    }

    final int c(boolean param0) {
        if (!param0) {
            ((od) this).field_m = -125;
        }
        return ((od) this).field_r;
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.removeMouseListener((java.awt.event.MouseListener) (Object) om.field_b);
        param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) om.field_b);
        int var2 = 100 % ((-57 - param1) / 62);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) om.field_b);
        vj.field_b = 0;
    }

    public static void d(int param0) {
        field_d = null;
        field_j = null;
        field_b = null;
        if (param0 != -12548) {
            field_d = null;
        }
    }

    od(oe param0) {
        ((od) this).field_o = new cn();
        ((od) this).field_g = 1500;
        ((od) this).field_r = -1;
        ((od) this).field_m = 32;
        ((od) this).field_p = 500;
        ((od) this).field_h = 50;
        ((od) this).field_e = null;
        ((od) this).field_c = 50;
        ((od) this).field_f = param0;
        this.a((byte) 110);
        int var2 = (int)td.b(128);
        ((od) this).field_i = new Random((long)var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_n = false;
        field_q = -1;
    }
}
