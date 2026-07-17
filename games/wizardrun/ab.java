/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static jh field_h;
    private int field_g;
    private wl field_e;
    static String field_b;
    private int field_a;
    private wl[] field_d;
    private wl field_f;
    static o field_c;

    final wl b(int param0) {
        int var3 = 0;
        wl var4 = null;
        wl var5 = null;
        wl var8 = null;
        wl var9 = null;
        var3 = wizardrun.field_H;
        if (0 >= ((ab) this).field_g) {
          if (param0 == 1) {
            L0: while (true) {
              if (((ab) this).field_g < ((ab) this).field_a) {
                int fieldTemp$2 = ((ab) this).field_g;
                ((ab) this).field_g = ((ab) this).field_g + 1;
                var4 = ((ab) this).field_d[fieldTemp$2].field_b;
                var9 = var4;
                if (var4 == ((ab) this).field_d[-1 + ((ab) this).field_g]) {
                  continue L0;
                } else {
                  ((ab) this).field_e = var9.field_b;
                  return var9;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          if (((ab) this).field_e == ((ab) this).field_d[((ab) this).field_g - 1]) {
            if (param0 == 1) {
              L1: while (true) {
                if (((ab) this).field_g < ((ab) this).field_a) {
                  int fieldTemp$3 = ((ab) this).field_g;
                  ((ab) this).field_g = ((ab) this).field_g + 1;
                  var4 = ((ab) this).field_d[fieldTemp$3].field_b;
                  var5 = var4;
                  if (var4 == ((ab) this).field_d[-1 + ((ab) this).field_g]) {
                    continue L1;
                  } else {
                    ((ab) this).field_e = var5.field_b;
                    return var5;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            var8 = ((ab) this).field_e;
            ((ab) this).field_e = var8.field_b;
            return var8;
          }
        }
    }

    final wl a(int param0, long param1) {
        wl var4 = null;
        wl var5 = null;
        int var6 = 0;
        var6 = wizardrun.field_H;
        var4 = ((ab) this).field_d[(int)((long)(((ab) this).field_a - param0) & param1)];
        ((ab) this).field_f = var4.field_b;
        L0: while (true) {
          if (((ab) this).field_f != var4) {
            if (((ab) this).field_f.field_e == param1) {
              var5 = ((ab) this).field_f;
              ((ab) this).field_f = ((ab) this).field_f.field_b;
              return var5;
            } else {
              ((ab) this).field_f = ((ab) this).field_f.field_b;
              continue L0;
            }
          } else {
            ((ab) this).field_f = null;
            return null;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        if (param0 != 1) {
            ab.a((byte) -30);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static int c() {
        wi.field_L.a((byte) -84);
        if (ii.field_f.b((byte) 0)) {
            return 0;
        }
        int discarded$0 = -18067;
        return cd.a();
    }

    final static void a(kl param0) {
        o var2 = null;
        int var4 = 0;
        int var5 = 0;
        try {
            int var3 = 0;
            var2 = new o(param0.a(104, "", "final_frame.jpg"), (java.awt.Component) (Object) wizardrun.field_G);
            var4 = var2.field_z;
            var5 = var2.field_p;
            int discarded$0 = -31782;
            ph.d();
            af.field_a = new o(var4, var5 * 3 / 4);
            af.field_a.b();
            var2.c(0, 0);
            ee.field_q = new o(var4, -af.field_a.field_p + var5);
            ee.field_q.b();
            var2.c(0, -af.field_a.field_p);
            ee.field_q.field_v = af.field_a.field_p;
            int discarded$1 = 4;
            bb.b();
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "ab.B(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    final static boolean d(int param0) {
        if (param0 >= -13) {
            ab.a(-73);
            return wi.field_L.b((byte) -17);
        }
        return wi.field_L.b((byte) -17);
    }

    final wl b(byte param0) {
        ((ab) this).field_g = 0;
        int var2 = -80 / ((-5 - param0) / 33);
        return ((ab) this).b(1);
    }

    ab(int param0) {
        int var2 = 0;
        wl var3 = null;
        ((ab) this).field_g = 0;
        ((ab) this).field_a = param0;
        ((ab) this).field_d = new wl[param0];
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            wl dupTemp$2 = new wl();
            var3 = dupTemp$2;
            ((ab) this).field_d[var2] = dupTemp$2;
            var3.field_c = var3;
            var3.field_b = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final void a(wl param0, int param1, long param2) {
        if (null != param0.field_c) {
            param0.a(false);
        }
        wl var5 = ((ab) this).field_d[(int)((long)(((ab) this).field_a + -1) & param2)];
        if (param1 >= -1) {
            return;
        }
        try {
            param0.field_c = var5.field_c;
            param0.field_b = var5;
            param0.field_c.field_b = param0;
            param0.field_b.field_c = param0;
            param0.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "ab.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(byte param0) {
        if (param0 != -69) {
          field_h = null;
          og.field_R = new String[8];
          og.field_R[7] = lj.field_e;
          og.field_R[1] = vk.field_o;
          og.field_R[3] = jd.field_a;
          og.field_R[4] = mh.field_lb;
          og.field_R[2] = ae.field_b;
          og.field_R[0] = sc.field_l;
          og.field_R[6] = qf.field_k;
          og.field_R[5] = cf.field_m;
          return;
        } else {
          og.field_R = new String[8];
          og.field_R[7] = lj.field_e;
          og.field_R[1] = vk.field_o;
          og.field_R[3] = jd.field_a;
          og.field_R[4] = mh.field_lb;
          og.field_R[2] = ae.field_b;
          og.field_R[0] = sc.field_l;
          og.field_R[6] = qf.field_k;
          og.field_R[5] = cf.field_m;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This is the last level before the first boss.";
    }
}
