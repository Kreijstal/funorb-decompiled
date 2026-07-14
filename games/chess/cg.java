/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    static int field_a;
    static byte[][] field_b;
    static sn field_c;

    final static int a(vg param0, vg param1, boolean param2) {
        if (!param2) {
            field_b = null;
        }
        Object var4 = null;
        return da.a(0, param1, (String) null, param0, 0, (byte) -70, false);
    }

    final static void a(int param0, int param1, lh param2, lh param3) {
        mk.field_a = param1;
        ce.field_a = param3;
        vj.field_d = param2;
        if (param0 != 0) {
            Object var5 = null;
            cg.a(-72, -128, (lh) null, (lh) null);
        }
        di.a(wb.field_h / 2, -104, wb.field_c / 2);
        g.a((byte) -116, param3.field_H, param2.field_t + param2.field_H, param3.field_t + param3.field_H, param2.field_H);
    }

    final static boolean a(int param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == 2) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == 160) {
              break L2;
            } else {
              if (param1 == 32) {
                break L2;
              } else {
                if (param1 == 95) {
                  break L2;
                } else {
                  if (45 != param1) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static void a(byte param0, String param1, int param2, boolean param3, boolean param4) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_3_0 = null;
        String stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        String stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        String stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        String stackOut_2_0 = null;
        String stackOut_1_0 = null;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        String stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        String stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        String stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        L0: {
          var10 = Chess.field_G;
          in.field_a = true;
          fj.field_g = param2;
          var11 = param1;
          if (!param3) {
            stackOut_2_0 = ph.field_m;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = aa.field_a;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = (String) (Object) stackIn_3_0;
          if (fj.field_g == 0) {
            var7 = vm.a(var11, -9224, sj.field_d, da.field_A, 480);
            var8 = 3 - -var7;
            bd.field_e = new String[var8];
            ec.field_l = new int[var8];
            var9 = 0;
            L2: while (true) {
              if (var9 >= var8) {
                eh.field_L = new int[2];
                var9 = 0;
                L3: while (true) {
                  if (var7 <= var9) {
                    bd.field_e[-3 + var8] = "";
                    bd.field_e[var8 + -2] = var6;
                    ec.field_l[-2 + var8] = 0;
                    eh.field_L[0] = 1;
                    bd.field_e[-1 + var8] = sj.field_m;
                    ec.field_l[-1 + var8] = 1;
                    eh.field_L[1] = 2;
                    break L1;
                  } else {
                    bd.field_e[var9] = da.field_A[var9];
                    var9++;
                    continue L3;
                  }
                }
              } else {
                ec.field_l[var9] = -1;
                var9++;
                continue L2;
              }
            }
          } else {
            if (fj.field_g == 1) {
              var7 = vm.a(var11, -9224, sj.field_d, da.field_A, 480);
              var8 = var7 + 2;
              bd.field_e = new String[var8];
              ec.field_l = new int[var8];
              var9 = 0;
              L4: while (true) {
                if (var9 >= var8) {
                  eh.field_L = new int[1];
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= var7) {
                      bd.field_e[-2 + var8] = "";
                      bd.field_e[var8 - 1] = sj.field_m;
                      ec.field_l[-1 + var8] = 0;
                      eh.field_L[0] = 2;
                      break L1;
                    } else {
                      bd.field_e[var9] = da.field_A[var9];
                      var9++;
                      continue L5;
                    }
                  }
                } else {
                  ec.field_l[var9] = -1;
                  var9++;
                  continue L4;
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        }
        nj.field_u.field_f = eh.field_L.length;
        var7 = 0;
        var8 = 0;
        L6: while (true) {
          if (bd.field_e.length <= var8) {
            L7: {
              bd.field_d = nj.field_u.field_f * (mf.field_z + fh.field_e << -1186528543);
              vh.field_g = -(var7 >> 1040073729) + of.field_k;
              tf.field_o = -(var7 >> -123961407) + var7 + of.field_k;
              if (param0 == -25) {
                break L7;
              } else {
                field_b = null;
                break L7;
              }
            }
            var8 = 0;
            L8: while (true) {
              if (var8 >= bd.field_e.length) {
                id.field_c = pd.field_Fb + -(bd.field_d >> -850784671);
                nj.field_u.a(0, qn.a((byte) 107, hn.field_k, rf.field_b), param4, 0);
                return;
              } else {
                L9: {
                  stackOut_34_0 = bd.field_d;
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_35_0 = stackOut_34_0;
                  if ((ec.field_l[var8] ^ -1) <= -1) {
                    stackOut_36_0 = stackIn_36_0;
                    stackOut_36_1 = ug.field_a;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    break L9;
                  } else {
                    stackOut_35_0 = stackIn_35_0;
                    stackOut_35_1 = qd.field_r;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    break L9;
                  }
                }
                bd.field_d = stackIn_37_0 + stackIn_37_1;
                var8++;
                continue L8;
              }
            }
          } else {
            L10: {
              stackOut_22_0 = bd.field_e[var8];
              stackOut_22_1 = param0 ^ -70;
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              if ((ec.field_l[var8] ^ -1) > -1) {
                stackOut_24_0 = (String) (Object) stackIn_24_0;
                stackOut_24_1 = stackIn_24_1;
                stackOut_24_2 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                break L10;
              } else {
                stackOut_23_0 = (String) (Object) stackIn_23_0;
                stackOut_23_1 = stackIn_23_1;
                stackOut_23_2 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_25_2 = stackOut_23_2;
                break L10;
              }
            }
            L11: {
              var9 = in.a((String) (Object) stackIn_25_0, stackIn_25_1, stackIn_25_2 != 0);
              if (-1 == ec.field_l[var8]) {
                break L11;
              } else {
                var9 = var9 + 2 * gm.field_e;
                break L11;
              }
            }
            if (var7 < var9) {
              var7 = var9;
              var8++;
              continue L6;
            } else {
              var8++;
              continue L6;
            }
          }
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (!((rm.field_Q ^ -1) != param0)) {
            ia.b((byte) -72);
        }
        ag.a(param0 + 11831, gg.field_n, ka.field_o, ih.field_T);
        kf.a(0, (byte) 98, param1, 0);
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 1) {
            Object var2 = null;
            cg.a((byte) 53, (String) null, 88, true, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new byte[50][];
    }
}
