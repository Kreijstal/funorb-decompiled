/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    static int field_a;
    static byte[][] field_b;
    static sn field_c;

    final static int a(vg param0, vg param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = null;
            stackOut_0_0 = da.a(0, param1, (String) null, param0, 0, (byte) -70, false);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("cg.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + true + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, lh param2, lh param3) {
        try {
            mk.field_a = param1;
            ce.field_a = param3;
            vj.field_d = param2;
            if (param0 != 0) {
                Object var5 = null;
                cg.a(-72, -128, (lh) null, (lh) null);
            }
            di.a(wb.field_h / 2, -104, wb.field_c / 2);
            g.a((byte) -116, param3.field_H, param2.field_t + param2.field_H, param3.field_t + param3.field_H, param2.field_H);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "cg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (param1 == 160) {
              break L1;
            } else {
              if (param1 == 32) {
                break L1;
              } else {
                if (param1 == 95) {
                  break L1;
                } else {
                  if (45 != param1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final static void a(byte param0, String param1, int param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        String stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        String stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        String stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        String stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        String stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var10 = Chess.field_G;
        try {
          L0: {
            L1: {
              in.field_a = true;
              fj.field_g = 0;
              var11 = param1;
              var6 = aa.field_a;
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
                bd.field_d = nj.field_u.field_f * (mf.field_z + fh.field_e << 1);
                vh.field_g = -(var7 >> 1) + of.field_k;
                tf.field_o = -(var7 >> 1) + var7 + of.field_k;
                var8 = 0;
                L7: while (true) {
                  if (var8 >= bd.field_e.length) {
                    id.field_c = pd.field_Fb + -(bd.field_d >> 1);
                    nj.field_u.a(0, qn.a((byte) 107, hn.field_k, rf.field_b), param4, 0);
                    break L0;
                  } else {
                    L8: {
                      stackOut_31_0 = bd.field_d;
                      stackIn_33_0 = stackOut_31_0;
                      stackIn_32_0 = stackOut_31_0;
                      if (ec.field_l[var8] >= 0) {
                        stackOut_33_0 = stackIn_33_0;
                        stackOut_33_1 = ug.field_a;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        break L8;
                      } else {
                        stackOut_32_0 = stackIn_32_0;
                        stackOut_32_1 = qd.field_r;
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_34_1 = stackOut_32_1;
                        break L8;
                      }
                    }
                    bd.field_d = stackIn_34_0 + stackIn_34_1;
                    var8++;
                    continue L7;
                  }
                }
              } else {
                L9: {
                  stackOut_20_0 = bd.field_e[var8];
                  stackOut_20_1 = 93;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  if (ec.field_l[var8] < 0) {
                    stackOut_22_0 = (String) (Object) stackIn_22_0;
                    stackOut_22_1 = stackIn_22_1;
                    stackOut_22_2 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    break L9;
                  } else {
                    stackOut_21_0 = (String) (Object) stackIn_21_0;
                    stackOut_21_1 = stackIn_21_1;
                    stackOut_21_2 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_23_2 = stackOut_21_2;
                    break L9;
                  }
                }
                L10: {
                  var9 = in.a(stackIn_23_0, stackIn_23_1, stackIn_23_2 != 0);
                  if (-1 == ec.field_l[var8]) {
                    break L10;
                  } else {
                    var9 = var9 + 2 * gm.field_e;
                    break L10;
                  }
                }
                L11: {
                  if (var7 < var9) {
                    var7 = var9;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var8++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var5;
            stackOut_37_1 = new StringBuilder().append("cg.D(").append(-25).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L12;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L12;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + 0 + ',' + true + ',' + param4 + ')');
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        try {
            if (!(rm.field_Q != 11)) {
                ia.b((byte) -72);
            }
            ag.a(11819, gg.field_n, ka.field_o, ih.field_T);
            kf.a(0, (byte) 98, param1, 0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "cg.E(" + -12 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new byte[50][];
    }
}
