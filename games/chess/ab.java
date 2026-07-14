/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ab extends l {
    boolean field_u;
    static String field_t;
    static int[] field_r;
    volatile boolean field_s;
    boolean field_q;

    final static void a(int param0, int param1, int param2, int param3, int param4, km[] param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        var11 = Chess.field_G;
        if (param5 != null) {
          if (param1 > 0) {
            var6 = param5[0].field_v;
            var7 = param5[2].field_v;
            if (param4 >= -82) {
              var12 = null;
              String discarded$1 = ab.a(13, -74, (String) null);
              var8 = param5[1].field_v;
              param5[0].e(param2, param3, param0);
              param5[2].e(param1 + (param2 + -var7), param3, param0);
              wb.b(o.field_d);
              wb.e(param2 + var6, param3, -var7 + (param1 + param2), param3 - -param5[1].field_u);
              var9 = param2 + var6;
              var10 = -var7 + (param1 + param2);
              param2 = var9;
              L0: while (true) {
                if (var10 <= param2) {
                  wb.a(o.field_d);
                  return;
                } else {
                  param5[1].e(param2, param3, param0);
                  param2 = param2 + var8;
                  continue L0;
                }
              }
            } else {
              var8 = param5[1].field_v;
              param5[0].e(param2, param3, param0);
              param5[2].e(param1 + (param2 + -var7), param3, param0);
              wb.b(o.field_d);
              wb.e(param2 + var6, param3, -var7 + (param1 + param2), param3 - -param5[1].field_u);
              var9 = param2 + var6;
              var10 = -var7 + (param1 + param2);
              param2 = var9;
              L1: while (true) {
                if (var10 <= param2) {
                  wb.a(o.field_d);
                  return;
                } else {
                  param5[1].e(param2, param3, param0);
                  param2 = param2 + var8;
                  continue L1;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    abstract int f(int param0);

    public static void g(int param0) {
        field_r = null;
        int var1 = -110 / ((param0 - -27) / 41);
        field_t = null;
    }

    abstract byte[] a(boolean param0);

    final static String a(int param0, int param1, String param2) {
        int var5 = 0;
        int var6 = 0;
        ve var8 = null;
        ve var10 = null;
        nk var11 = null;
        ve var12 = null;
        nk var13 = null;
        CharSequence var14 = null;
        var6 = Chess.field_G;
        var14 = (CharSequence) (Object) param2;
        if (ed.a(var14, 21257)) {
          if (-3 == (ld.field_g ^ -1)) {
            var8 = mn.a(-1, param2);
            if (param1 == 21250) {
              if (var8 == null) {
                return oc.a(kj.field_f, new String[1], (byte) -114);
              } else {
                o discarded$2 = me.field_e.b((o) (Object) var8, (byte) 123);
                L0: while (true) {
                  var12 = (ve) (Object) me.field_e.a((byte) -110);
                  if (var12 == null) {
                    var8.c(-2193);
                    var8.d(-1);
                    wg.field_w = wg.field_w - 1;
                    var13 = qn.field_U;
                    var13.f(param0, -104);
                    var13.field_l = var13.field_l + 1;
                    var5 = var13.field_l;
                    var13.c(1, (byte) 66);
                    var13.a(param1 + -21360, param2);
                    var13.a(var13.field_l - var5, -1);
                    return null;
                  } else {
                    var12.field_Ib = var12.field_Ib - 1;
                    continue L0;
                  }
                }
              }
            } else {
              ab.h(3);
              if (var8 == null) {
                return oc.a(kj.field_f, new String[1], (byte) -114);
              } else {
                o discarded$3 = me.field_e.b((o) (Object) var8, (byte) 123);
                L1: while (true) {
                  var10 = (ve) (Object) me.field_e.a((byte) -110);
                  if (var10 == null) {
                    var8.c(-2193);
                    var8.d(-1);
                    wg.field_w = wg.field_w - 1;
                    var11 = qn.field_U;
                    var11.f(param0, -104);
                    var11.field_l = var11.field_l + 1;
                    var5 = var11.field_l;
                    var11.c(1, (byte) 66);
                    var11.a(param1 + -21360, param2);
                    var11.a(var11.field_l - var5, -1);
                    return null;
                  } else {
                    var10.field_Ib = var10.field_Ib - 1;
                    continue L1;
                  }
                }
              }
            }
          } else {
            return ik.field_b;
          }
        } else {
          return qj.field_a;
        }
    }

    final static void d(byte param0) {
        l var1 = null;
        int var2 = 0;
        var2 = Chess.field_G;
        f.field_a = null;
        wc.field_v = 0;
        wg.field_w = 0;
        me.field_e.e(-31023);
        cl.field_e.e(-31023);
        var1 = bf.field_M.a(false);
        L0: while (true) {
          if (var1 == null) {
            var1 = r.field_Ib.a(false);
            L1: while (true) {
              if (var1 == null) {
                ld.field_g = 0;
                if (param0 < -40) {
                  return;
                } else {
                  field_t = null;
                  return;
                }
              } else {
                var1.d(-1);
                var1 = r.field_Ib.a(0);
                continue L1;
              }
            }
          } else {
            var1.d(-1);
            var1 = bf.field_M.a(0);
            continue L0;
          }
        }
    }

    final static void h(int param0) {
        fm.field_R = new String[38];
        fm.field_R[16] = cn.field_a;
        fm.field_R[17] = aa.field_a;
        fm.field_R[7] = jg.field_L;
        fm.field_R[27] = ec.field_g;
        fm.field_R[15] = qa.field_b;
        fm.field_R[20] = sh.field_c;
        fm.field_R[28] = se.field_Z;
        fm.field_R[6] = jg.field_L;
        fm.field_R[34] = ca.field_e;
        fm.field_R[33] = qm.field_a;
        fm.field_R[13] = rc.field_b;
        fm.field_R[21] = ec.field_g;
        fm.field_R[30] = ma.field_H;
        fm.field_R[32] = hj.field_k;
        fm.field_R[3] = vm.field_g;
        fm.field_R[18] = dh.field_h;
        fm.field_R[29] = wf.field_P;
        fm.field_R[22] = se.field_Z;
        fm.field_R[8] = hm.field_f;
        fm.field_R[24] = ma.field_H;
        fm.field_R[14] = ao.field_c;
        fm.field_R[0] = jf.field_e;
        fm.field_R[11] = kl.field_f;
        fm.field_R[23] = wf.field_P;
        fm.field_R[31] = ue.field_b;
        fm.field_R[19] = ti.field_a;
        fm.field_R[26] = fc.field_c;
        fm.field_R[37] = r.field_Zb;
        fm.field_R[2] = tc.field_y;
        fm.field_R[9] = gl.field_a;
        fm.field_R[param0] = ij.field_d;
        fm.field_R[10] = oh.field_d;
        fm.field_R[5] = vc.field_c;
        fm.field_R[25] = ac.field_p;
        fm.field_R[1] = qa.field_a;
        ec.field_d = new eb(0, 0, 120, 24, fm.field_R[9]);
        qh.field_b = new eb(0, 0, 120, 24, ef.field_l);
    }

    ab() {
        ((ab) this).field_s = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new int[8192];
        field_t = "This password contains your Player Name, and would be easy to guess";
    }
}
