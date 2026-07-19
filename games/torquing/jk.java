/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static int field_a;
    static String field_b;

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        mh var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Torquing.field_u;
        try {
          L0: {
            L1: {
              hj.field_c.a(0, 0);
              if (fh.field_r >= 35) {
                if ((fh.field_r ^ -1) > -71) {
                  fq.field_F.a(false, hb.field_s, ra.field_e);
                  of.field_l.d(hb.field_s, ra.field_e);
                  var1_int = la.field_j.field_s * vc.field_d / 100;
                  var2 = la.field_j.field_t * vc.field_d / 100;
                  la.field_j.b(-(var1_int / 2) + je.field_a, -(var2 / 2) + kc.field_v, var1_int, var2);
                  break L1;
                } else {
                  jh.field_B.a(false, 0, 0);
                  la.field_j.d(je.field_a - la.field_j.field_s / 2, -(la.field_j.field_t / 2) + kc.field_v);
                  jb.field_b.a((byte) 81, 0, nn.field_e);
                  nh.field_l.a(0, nn.field_e);
                  var5 = vo.field_f[0];
                  var2 = 0;
                  L2: while (true) {
                    if (var2 >= var5.field_a.field_i) {
                      fq.field_F.a(false, hb.field_s, ra.field_e);
                      of.field_l.d(hb.field_s, ra.field_e);
                      cq.field_w.d(0, nn.field_e);
                      break L1;
                    } else {
                      L3: {
                        if (!var5.c(4, var2)) {
                          break L3;
                        } else {
                          var5.a(false, var5.a(23, var2) - -nn.field_e, var2, 0);
                          break L3;
                        }
                      }
                      var2++;
                      continue L2;
                    }
                  }
                }
              } else {
                fq.field_F.a(false, ub.field_E, ra.field_e);
                of.field_l.b(4096, 1326547364, tj.field_l, ra.field_e - -(of.field_l.field_t / 2), of.field_l.field_s / 2 + ub.field_E);
                break L1;
              }
            }
            L4: {
              ph.c(0, 0, 640, 480, 16777215);
              if (param0 < -32) {
                break L4;
              } else {
                var4 = (String) null;
                jk.a((String) null, (byte) -13, true);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "jk.B(" + param0 + ')');
        }
    }

    final static void a(String param0, byte param1, boolean param2) {
        try {
            if (param1 != -79) {
                jk.a(81);
            }
            nk.field_t = param2;
            aq.field_c = true;
            gn.field_m = new mn(dc.field_a, pe.field_E, param0, ff.field_a, nk.field_t);
            dc.field_a.a(gn.field_m, (byte) 112);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "jk.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_a = -53;
        }
    }

    static {
        field_a = 500;
        field_b = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
