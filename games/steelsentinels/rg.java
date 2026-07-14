/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rg {
    static ul field_d;
    static String field_g;
    static boolean field_e;
    static boolean field_h;
    static boolean field_f;
    static String field_c;
    static ak field_b;
    static String field_a;

    final static int a(String param0, boolean param1, byte param2) {
        if (param2 > -62) {
            return 94;
        }
        if (!param1) {
            return re.field_ib.c(param0);
        }
        return a.field_a.c(param0);
    }

    final static void a(boolean param0, wk param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        var9 = SteelSentinels.field_G;
        if (-1 == (3 & (param1.field_D | (param1.field_F | param1.field_A) | param1.field_H) ^ -1)) {
          return;
        } else {
          L0: {
            var2 = param1.field_A - -(param1.field_D & 3);
            var2 = var2 - -4 + -(3 & var2);
            var3 = (param1.field_H & 3) + param1.field_F;
            var3 = 4 - ((var3 & 3) - var3);
            if (!param0) {
              break L0;
            } else {
              var10 = null;
              int discarded$1 = rg.a((String) null, false, (byte) -11);
              break L0;
            }
          }
          var4 = new int[var3 * var2];
          var5 = 0;
          var6 = (3 & param1.field_H) * var2 + (param1.field_D & 3);
          var7 = 0;
          L1: while (true) {
            if (param1.field_F <= var7) {
              param1.field_E = var4;
              param1.field_A = var2;
              param1.field_H = param1.field_H & -4;
              param1.field_F = var3;
              param1.field_D = param1.field_D & -4;
              return;
            } else {
              var8 = 0;
              L2: while (true) {
                if (var8 >= param1.field_A) {
                  var6 = var6 + (var2 - param1.field_A);
                  var7++;
                  continue L1;
                } else {
                  var6++;
                  var5++;
                  var4[var6] = param1.field_E[var5];
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    public static void c(int param0) {
        field_d = null;
        if (param0 <= 123) {
            field_e = true;
        }
        field_c = null;
        field_a = null;
        field_g = null;
        field_b = null;
    }

    final static int d(int param0) {
        if (param0 != -1900) {
            return 43;
        }
        return new Date().getYear() - -1900;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        ak var10 = null;
        int var11 = 0;
        String stackIn_8_0 = null;
        String stackIn_9_0 = null;
        String stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ak stackIn_15_0 = null;
        String stackOut_7_0 = null;
        String stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ak stackOut_14_0 = null;
        ak stackOut_13_0 = null;
        var11 = SteelSentinels.field_G;
        var1 = hb.field_b + -hl.field_q;
        hl.field_q = vg.field_f - (var1 >> 336398689);
        lk.field_W = qg.field_a + -(gh.field_hb >> 982971489);
        hb.field_b = var1 + hl.field_q;
        var3 = -104 % ((26 - param0) / 62);
        var2 = lk.field_W;
        var4 = 0;
        L0: while (true) {
          if (var4 >= an.field_g.length) {
            return;
          } else {
            L1: {
              var5 = kk.field_g[var4];
              if ((var5 ^ -1) <= -1) {
                if (var5 != se.field_c.field_e) {
                  var6 = bf.field_Fb;
                  break L1;
                } else {
                  var6 = o.field_b;
                  break L1;
                }
              } else {
                var6 = vg.field_c;
                break L1;
              }
            }
            L2: {
              var7 = an.field_g[var4];
              stackOut_7_0 = (String) var7;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var5 < 0) {
                stackOut_9_0 = (String) (Object) stackIn_9_0;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L2;
              } else {
                stackOut_8_0 = (String) (Object) stackIn_8_0;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L2;
              }
            }
            L3: {
              var8 = rg.a(stackIn_10_0, stackIn_10_1 != 0, (byte) -94);
              var9 = vg.field_f - (var8 >> -1788706655);
              if ((var5 ^ -1) <= -1) {
                L4: {
                  var2 = var2 + tf.field_c;
                  if (var5 == se.field_c.field_e) {
                    stackOut_14_0 = (ak) field_b;
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    stackOut_13_0 = qh.field_Xb;
                    stackIn_15_0 = stackOut_13_0;
                    break L4;
                  }
                }
                L5: {
                  var10 = stackIn_15_0;
                  if (var10 != null) {
                    var10.a(var8 + (h.field_U << 1259944801), -15203, var9 + -h.field_U, (id.field_ac << -1226081567) + ig.field_e, var2);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var2 = var2 + id.field_ac;
                break L3;
              } else {
                break L3;
              }
            }
            if ((var5 ^ -1) <= -1) {
              a.field_a.b(var7, var9, var2 - -rm.field_g, var6, -1);
              var2 = var2 + (ig.field_e + (tf.field_c + id.field_ac));
              var4++;
              continue L0;
            } else {
              re.field_ib.b(var7, var9, var2 - -jk.field_d, var6, -1);
              var2 = var2 + ck.field_e;
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void b(int param0) {
        int var2_int = 0;
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wk var6 = null;
        wk var7 = null;
        wk var7_ref = null;
        wk var8 = null;
        L0: {
          var4 = SteelSentinels.field_G;
          if (param0 == 30) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        pb.h(243, 197, 369, 143, 16777215);
        pb.a(244, 198, 367, 141, 0);
        if (jb.field_S == null) {
          L1: {
            if (null != wn.field_a) {
              int discarded$3 = wn.field_a.a(eb.field_q, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            var6 = jb.field_S[lh.field_r];
            var7 = var6;
            var7 = var6;
            if (var6 == null) {
              if (wn.field_a == null) {
                break L2;
              } else {
                int discarded$4 = wn.field_a.a(eb.field_q, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                break L2;
              }
            } else {
              var6.a(245, 199);
              break L2;
            }
          }
          L3: {
            if (ul.field_g < hh.field_i) {
              var7_ref = jb.field_S[oe.field_e];
              if (var7_ref == null) {
                break L3;
              } else {
                var2_int = (var7_ref.field_z - -60) * ul.field_g / hh.field_i;
                var3 = var2_int + -30;
                if (rf.field_b) {
                  nn.a(245, -256 * var3 / 30, (var7_ref.field_z - var3) * 256 / 30, 199, var7_ref, -1);
                  break L3;
                } else {
                  nn.a(245, (var7_ref.field_z + -var3) * 256 / 30, var3 * -256 / 30, 199, var7_ref, -1);
                  break L3;
                }
              }
            } else {
              break L3;
            }
          }
          L4: {
            if (null != wn.field_a) {
              var2 = null;
              var5 = 0;
              var3 = var5;
              L5: while (true) {
                if (jb.field_S.length <= var5) {
                  if (var2 == null) {
                    break L4;
                  } else {
                    int discarded$5 = wn.field_a.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                    break L4;
                  }
                } else {
                  var8 = jb.field_S[var5];
                  if (var8 != null) {
                    L6: {
                      if (365 != var8.field_z) {
                        break L6;
                      } else {
                        if (139 != var8.field_B) {
                          break L6;
                        } else {
                          var5++;
                          continue L5;
                        }
                      }
                    }
                    if (var2 == null) {
                      var2 = Integer.toString(var5);
                      var5++;
                      continue L5;
                    } else {
                      var2 = var2 + ", " + var5;
                      var5++;
                      continue L5;
                    }
                  } else {
                    var5++;
                    continue L5;
                  }
                }
              }
            } else {
              break L4;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ul();
        field_g = "Play the game without logging in just yet";
        field_f = true;
        field_a = "Connection restored.";
    }
}
