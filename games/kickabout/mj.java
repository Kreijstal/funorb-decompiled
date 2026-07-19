/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static vd field_a;
    static int field_b;

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        double[] var2_array = null;
        ot var3 = null;
        int var4 = 0;
        double[] var5 = null;
        double[] var6 = null;
        double[] var7 = null;
        ut[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ut[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ut[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ot stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ut[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ut[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ot stackOut_7_2 = null;
        ut[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ot stackOut_6_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            hl.field_e = ng.a(0, param1, param0 + -7, 11, true, 30);
            hq.field_e = ng.a(30, param1, param0 ^ 111, 11, false, 60);
            am.field_h = sr.a(60, param1, true, (byte) -67, 80, 11);
            ub.field_G = sr.a(80, param1, false, (byte) -120, 95, 11);
            c.field_f = (ut[]) ((Object) new ot[4]);
            if (param0 == -39) {
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= 4) {
                  var7 = al.field_Bb[ih.field_c];
                  var6 = var7;
                  var5 = var6;
                  var2_array = var5;
                  bf.field_x = fn.field_f.h();
                  ch.field_o = kn.field_J.b();
                  od.field_p = vl.field_g.b();
                  nh.a(bf.field_x.field_y, var7[0], var7[1], var7[2]);
                  nh.a(ch.field_o.field_y, var7[0], var7[1], var7[2]);
                  nh.a(od.field_p.field_y, var7[0], var7[1], var7[2]);
                  wh.field_p = eo.b(bf.field_x);
                  tm.field_z = eo.a(wh.field_p);
                  pf.field_b = eo.b(tm.field_z);
                  mt.field_d = new ut(tm.field_z.field_o, ch.field_o.field_v);
                  qj.field_a = new ut(od.field_p.field_o, bf.field_x.field_v);
                  iw.a(-70, mt.field_d);
                  ch.field_o.d(on.field_g - ch.field_o.field_o, 0);
                  ta.e(param0 + 158);
                  iw.a(-42, qj.field_a);
                  od.field_p.d(0, -od.field_p.field_v + on.field_f);
                  ta.e(118);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var3 = eb.field_i[var2_int];
                    stackOut_5_0 = c.field_f;
                    stackOut_5_1 = var2_int;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (ih.field_c != 0) {
                      stackOut_7_0 = (ut[]) ((Object) stackIn_7_0);
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = var3.h();
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      break L2;
                    } else {
                      stackOut_6_0 = (ut[]) ((Object) stackIn_6_0);
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = (ot) (var3);
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      break L2;
                    }
                  }
                  stackIn_8_0[stackIn_8_1] = (ut) ((Object) stackIn_8_2);
                  pd.a(c.field_f[var2_int], 20684);
                  jm.a(100, 9863, var2_int + 96);
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "mj.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_b = 80;
        }
    }

    final static void a(boolean param0, vm param1) {
        try {
            if (!param0) {
                mj.a(-0.3391155972284911, 69, -1.3430351906994813, -0.23628554021572995);
            }
            pi.field_b.b(param1);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "mj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(double param0, int param1, double param2, double param3) {
        wm.field_C = param2;
        cq.field_f = param3;
        if (param1 != 60) {
            mj.a(49);
        }
        la.field_d = param0 * 8.0;
        if (!(!ia.field_c)) {
            wm.field_C = 896.0 - wm.field_C;
            cq.field_f = 1344.0 - cq.field_f;
        }
    }

    static {
    }
}
