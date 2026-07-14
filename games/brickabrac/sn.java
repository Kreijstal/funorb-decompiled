/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends ki {
    static String field_s;
    static String field_u;
    static String field_r;
    static jp field_t;

    private final static void a(jp param0, int param1, int param2, int param3, int param4, jp param5, int param6, int param7, int param8, int param9, jp param10, int param11, jp param12) {
        param12.d(-((-param3 + param12.field_x) / 2) + (param6 - -(param2 * param7 >> -184083152)), param8);
        og.a(-121, 144, 128, param10, 11970969, (param2 * 9 >> 1029265040) + (-param10.field_x + param3) / 2 + param6 - 35 / param1, -(120 / param1) + -param10.field_z + (param9 + param4) + param8);
        param5.c(-(23 / param1) + (10 * param2 >> 147698704) + (param6 + (-param5.field_z + param3) / 2), -param5.field_z + param9 + (param8 + param4));
        param0.c(-(279 / param1) + (param3 - param0.field_z) / 2 + (param6 + (20 * param2 >> 500252144)), -param0.field_z + param9 + (param8 + param4));
    }

    final jp[] a(byte param0, int param1) {
        int var3 = -31 / ((param0 - 65) / 49);
        return rd.field_d[-1 + param1];
    }

    final jp a(boolean param0, int param1) {
        if (!param0) {
            ((sn) this).a((byte) 31, 89, 39, 72);
        }
        return sk.field_J[-1 + param1];
    }

    public static void f(int param0) {
        field_r = null;
        if (param0 < 82) {
            return;
        }
        field_t = null;
        field_s = null;
        field_u = null;
    }

    final jp[] a(int param0, boolean param1) {
        if (!param1) {
            return null;
        }
        return kh.field_d[param0 - 1];
    }

    sn(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
        sk.field_J = new jp[2];
        rd.field_d = new jp[2][];
        kh.field_d = new jp[2][];
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 110 % ((param0 - -28) / 43);
        if (0 > (param1 ^ -1)) {
            lb.g(param2, param3, 153, 240, 16777215);
        } else {
            lb.g(param2, param3, 153, 240, 16777215, 11184810);
        }
        if (!(param1 <= -1)) {
            la.a(param2, param3, 153, 240, nm.field_h[param1], 11970969, 152);
        }
        if (!(!((sn) this).b((byte) -112))) {
            re.field_h.c(param2, param3);
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (((sn) this).b((byte) -116)) {
            var6 = kd.a(((sn) this).field_m, param3, (byte) -47);
            if (!(var6.a((byte) -84, param3, ((sn) this).field_m))) {
                tf.a(-10, param3, var6, 2, -119, hg.field_g);
                var6.a(((sn) this).field_m, param3, (byte) 78);
            }
            sn.a(t.field_a, 2, param4, 306, -10, nm.field_d, param2, 5, param0, 480, er.field_d, param3, var6.field_p);
        } else {
            lb.g(param2, param0, 306, 480, 16777215);
        }
        if (param1 > -84) {
            field_r = null;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (!param0) {
            sn.b((byte) -60, 50);
        }
        if (!((sn) this).b((byte) -124)) {
            lb.g(param4, param2, 640, 480, 16777215);
        } else {
            var6 = ge.a(((sn) this).field_m, param3, -20777);
            if (!(var6.a((byte) -84, param3, ((sn) this).field_m))) {
                tf.a(0, param3, var6, 1, 114, sf.field_cb);
                var6.a(((sn) this).field_m, param3, (byte) 78);
            }
            sn.a(sf.field_Y, 1, param1, 640, 0, af.field_D, param4, 5, param2, 480, kq.field_o, param3, var6.field_p);
        }
    }

    final boolean a(boolean param0) {
        if (!(i.field_m.a("construct", -28138))) {
            return false;
        }
        sf.field_Y = pl.a("construct", "construction_near", (byte) 124, i.field_m);
        af.field_D = pl.a("construct", "construction_mid", (byte) 102, i.field_m);
        sf.field_cb = pl.a("construct", "construction_far", (byte) -93, i.field_m);
        kq.field_o = pl.a("construct", "construction_smoke", (byte) -128, i.field_m);
        re.field_h = pl.a("construct", "construction_small", (byte) -74, i.field_m);
        t.field_a = jh.a(0, sf.field_Y);
        nm.field_d = jh.a(0, af.field_D);
        hg.field_g = jh.a(0, sf.field_cb);
        er.field_d = jh.a(0, kq.field_o);
        rd.field_d[0] = cr.a("construct", i.field_m, "construction_caps", 2);
        kh.field_d[0] = cr.a("construct", i.field_m, "construction_segs", 2);
        sk.field_J[0] = pl.a("construct", "construction_centre", (byte) 127, i.field_m);
        rd.field_d[1] = ig.a(rd.field_d[0], false);
        kh.field_d[1] = ig.a(kh.field_d[0], param0);
        sk.field_J[1] = pl.a(-16371, sk.field_J[0]);
        pl.a(kq.field_o, 0);
        pl.a(er.field_d, 0);
        return true;
    }

    final static void b(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        rn.field_h = param1;
        if (!(hj.field_Yb == hc.field_f)) {
            var2 = hj.field_Yb * hj.field_Yb;
            var3 = var2 - hc.field_f * hc.field_f;
            param1 = param1 + var3 * (ej.field_O - param1) / var2;
        }
        gp.field_d.a(120, param1, qh.field_f, 640, (byte) 64);
        fj.a(kn.field_z, 5, ej.field_O - 24, 640, om.field_oc, 0, (byte) 94);
        if (param0 > -70) {
            Object var4 = null;
            sn.a((jp) null, 67, 35, -28, -34, (jp) null, -56, 62, -67, 118, (jp) null, -55, (jp) null);
        }
    }

    final static void a(int param0, byte[] param1, int param2) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var4 = -8 % ((33 - param0) / 48);
        int var3 = 256;
        int[] var5 = new int[256];
        for (var6 = 0; (var6 ^ -1) > -257; var6++) {
            var3++;
            var5[var6] = ik.a(255, (int) param1[var3]);
        }
        // wide iinc 3 256
        int var8 = 0;
        var6 = var8;
        while (-257 < (var8 ^ -1)) {
            param1[var3] = (byte)(param1[var3] + -param2);
            var3 = var3 + var5[var8];
            var8++;
        }
    }

    final boolean b(byte param0) {
        int stackIn_9_0 = 0;
        int stackOut_7_0;
        int stackOut_8_0;
        L0: {
          if (param0 < -91) {
            break L0;
          } else {
            jp[] discarded$2 = ((sn) this).a((byte) -78, -121);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == sf.field_Y) {
              break L2;
            } else {
              if (af.field_D == null) {
                break L2;
              } else {
                if (null == sf.field_cb) {
                  break L2;
                } else {
                  if (null == kq.field_o) {
                    break L2;
                  } else {
                    if (re.field_h == null) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_8_0 = 0;
          stackIn_9_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Email address is unavailable";
        field_r = "Start Game";
        field_u = "Please remove <%0> from your ignore list first.";
    }
}
