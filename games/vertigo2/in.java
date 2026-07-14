/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class in {
    static Random field_b;
    static String field_a;
    static String field_e;
    static String field_d;
    static String field_f;
    static int[] field_c;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_e = null;
        field_a = null;
        field_f = null;
        field_d = null;
        if (param0 != 0) {
            field_f = null;
        }
    }

    final static String a(byte param0) {
        if (param0 != 86) {
            return null;
        }
        if (un.field_Hb == bf.field_b) {
            return af.field_H;
        }
        return fi.field_e;
    }

    final static void a(boolean param0, boolean param1, int param2, boolean param3, boolean param4, int param5, int param6, int param7, byte param8, boolean param9) {
        int var11 = 0;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          if (param9) {
            break L0;
          } else {
            L1: {
              if (qg.field_G != bi.field_e) {
                break L1;
              } else {
                if (bi.field_j == om.field_D) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (bi.field_j != ro.field_g.field_d) {
              break L0;
            } else {
              if (ro.field_g.field_i != bi.field_e) {
                break L0;
              } else {
                if (null != gd.field_j) {
                  ho.a(param8 ^ -66, false);
                  break L0;
                } else {
                  if (sj.field_d != null) {
                    ho.a(0, true);
                    break L0;
                  } else {
                    jr.a(-127);
                    break L0;
                  }
                }
              }
            }
          }
        }
        L2: {
          if (!param9) {
            ml.field_w = (qg.field_G - 640) / 2;
            break L2;
          } else {
            ml.field_w = on.field_c;
            break L2;
          }
        }
        L3: {
          mn.b(param9, -127);
          if (rk.field_y <= 0) {
            break L3;
          } else {
            dg.a(0, param5, param9, param3);
            break L3;
          }
        }
        L4: {
          if (param8 == -66) {
            break L4;
          } else {
            in.a((byte) -46, -104);
            break L4;
          }
        }
        L5: {
          kk.field_f.field_R = pn.field_N.field_R;
          kk.field_f.field_O = 1;
          if (ko.field_P >= -1) {
            break L5;
          } else {
            an.a(param9, -86, param3, param5);
            break L5;
          }
        }
        L6: {
          if (-1 < mp.field_b) {
            gj.a(param0, param5, param9, param8 ^ -66, param3);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          L8: {
            if (!im.field_g) {
              break L8;
            } else {
              if (gd.field_j.field_Qb < gd.field_j.field_uc) {
                break L8;
              } else {
                im.field_j.field_lb = false;
                ja.field_f.field_Lb.field_S = fg.field_db;
                tg.a(0, ja.field_f.field_Nb);
                break L7;
              }
            }
          }
          im.field_j.field_lb = true;
          ja.field_f.field_Lb.field_S = null;
          dg.a((byte) -86, ja.field_f, param1, param6, param5);
          break L7;
        }
        uo.a(param7, param2, param5, param1, param4, param6, 0);
        dg.a((byte) -121, vd.field_d, param1, param6, param5);
        lo.field_d = lo.field_d + 1;
    }

    final static void a(byte param0, int param1) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        ub var5 = (ub) (Object) ob.field_Q.a((byte) 100);
        while (var5 != null) {
            he.a(param1, var5, -27011);
            var5 = (ub) (Object) ob.field_Q.b(113);
        }
        int var3 = 52 % ((-5 - param0) / 37);
        be var6 = (be) (Object) mb.field_v.a((byte) 100);
        while (var6 != null) {
            ec.a(param1, (byte) 122, var6);
            var6 = (be) (Object) mb.field_v.b(45);
        }
    }

    final static void a(tn param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (param1 == 640) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= 3) {
            var2 = 0;
            L2: while (true) {
              if (no.field_d <= var2) {
                wq.field_I[param0.a((byte) 110)] = wq.field_I[param0.a((byte) 110)] + 1;
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if (no.field_d <= var3) {
                    no.field_d = var2;
                    no.field_d = no.field_d + 1;
                    eo.field_l[no.field_d] = param0;
                    return;
                  } else {
                    L4: {
                      if (eo.field_l[var3].field_s == param0.field_s) {
                        var4 = eo.field_l[var3].a((byte) 77);
                        if (wq.field_I[var4] > ll.field_b) {
                          wq.field_I[var4] = wq.field_I[var4] - 1;
                          var3++;
                          continue L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var2++;
                    eo.field_l[var2] = eo.field_l[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (param0.field_s == eo.field_l[var2].field_s) {
                  wq.field_I[eo.field_l[var2].a((byte) -128)] = wq.field_I[eo.field_l[var2].a((byte) -128)] + 1;
                  var2++;
                  continue L2;
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          } else {
            wq.field_I[var2] = 0;
            var2++;
            continue L1;
          }
        }
    }

    final static String a(int param0, byte[] param1) {
        if (param0 != 0) {
            field_d = null;
        }
        return mj.a(-106, param1, 0, param1.length);
    }

    final static void a(int param0, int param1) {
        int var3 = Vertigo2.field_L ? 1 : 0;
        qn var4 = (qn) (Object) te.field_z.a((byte) 100);
        while (var4 != null) {
            pn.a(param1, (byte) -4, var4);
            var4 = (qn) (Object) te.field_z.b(42);
        }
        if (param0 >= -97) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new Random();
        field_a = "Restart Level";
        field_d = "The '<%0>' setting needs to be changed.";
        field_f = "Allow spectators?";
        field_e = "No spectators";
    }
}
