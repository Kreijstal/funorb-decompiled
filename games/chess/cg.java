/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    static int field_a;
    static byte[][] field_b;
    static sn field_c;

    final static int a(vg param0, vg param1, boolean param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                field_b = (byte[][]) null;
                break L1;
              }
            }
            var4 = (String) null;
            stackOut_2_0 = da.a(0, param1, (String) null, param0, 0, (byte) -70, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("cg.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, lh param2, lh param3) {
        try {
            mk.field_a = param1;
            ce.field_a = param3;
            vj.field_d = param2;
            if (param0 != 0) {
                lh var5 = (lh) null;
                cg.a(-72, -128, (lh) null, (lh) null);
            }
            di.a(wb.field_h / 2, -104, wb.field_c / 2);
            g.a((byte) -116, param3.field_H, param2.field_t + param2.field_H, param3.field_t + param3.field_H, param2.field_H);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "cg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == 2) {
            break L0;
          } else {
            field_c = (sn) null;
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
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_4_0 = null;
        String stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        String stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        String stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_2_0 = null;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        String stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        String stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        String stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var10 = Chess.field_G;
        try {
          L0: {
            L1: {
              in.field_a = true;
              fj.field_g = param2;
              var11 = param1;
              if (!param3) {
                stackOut_3_0 = ph.field_m;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = aa.field_a;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (fj.field_g == 0) {
                var7 = vm.a(var11, -9224, sj.field_d, da.field_A, 480);
                var8 = 3 - -var7;
                bd.field_e = new String[var8];
                ec.field_l = new int[var8];
                var9 = 0;
                L3: while (true) {
                  if (var9 >= var8) {
                    eh.field_L = new int[2];
                    var9 = 0;
                    L4: while (true) {
                      if (var7 <= var9) {
                        bd.field_e[-3 + var8] = "";
                        bd.field_e[var8 + -2] = var6;
                        ec.field_l[-2 + var8] = 0;
                        eh.field_L[0] = 1;
                        bd.field_e[-1 + var8] = sj.field_m;
                        ec.field_l[-1 + var8] = 1;
                        eh.field_L[1] = 2;
                        break L2;
                      } else {
                        bd.field_e[var9] = da.field_A[var9];
                        var9++;
                        continue L4;
                      }
                    }
                  } else {
                    ec.field_l[var9] = -1;
                    var9++;
                    continue L3;
                  }
                }
              } else {
                if (fj.field_g == 1) {
                  var7 = vm.a(var11, -9224, sj.field_d, da.field_A, 480);
                  var8 = var7 + 2;
                  bd.field_e = new String[var8];
                  ec.field_l = new int[var8];
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= var8) {
                      eh.field_L = new int[1];
                      var9 = 0;
                      L6: while (true) {
                        if (var9 >= var7) {
                          bd.field_e[-2 + var8] = "";
                          bd.field_e[var8 - 1] = sj.field_m;
                          ec.field_l[-1 + var8] = 0;
                          eh.field_L[0] = 2;
                          break L2;
                        } else {
                          bd.field_e[var9] = da.field_A[var9];
                          var9++;
                          continue L6;
                        }
                      }
                    } else {
                      ec.field_l[var9] = -1;
                      var9++;
                      continue L5;
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
            L7: while (true) {
              if (bd.field_e.length <= var8) {
                L8: {
                  bd.field_d = nj.field_u.field_f * (mf.field_z + fh.field_e << -1186528543);
                  vh.field_g = -(var7 >> 1040073729) + of.field_k;
                  tf.field_o = -(var7 >> -123961407) + var7 + of.field_k;
                  if (param0 == -25) {
                    break L8;
                  } else {
                    field_b = (byte[][]) null;
                    break L8;
                  }
                }
                var8 = 0;
                L9: while (true) {
                  if (var8 >= bd.field_e.length) {
                    id.field_c = pd.field_Fb + -(bd.field_d >> -850784671);
                    nj.field_u.a(0, qn.a((byte) 107, hn.field_k, rf.field_b), param4, 0);
                    break L0;
                  } else {
                    L10: {
                      stackOut_36_0 = bd.field_d;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_37_0 = stackOut_36_0;
                      if ((ec.field_l[var8] ^ -1) <= -1) {
                        stackOut_38_0 = stackIn_38_0;
                        stackOut_38_1 = ug.field_a;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        break L10;
                      } else {
                        stackOut_37_0 = stackIn_37_0;
                        stackOut_37_1 = qd.field_r;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        break L10;
                      }
                    }
                    bd.field_d = stackIn_39_0 + stackIn_39_1;
                    var8++;
                    continue L9;
                  }
                }
              } else {
                L11: {
                  stackOut_23_0 = bd.field_e[var8];
                  stackOut_23_1 = param0 ^ -70;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  if ((ec.field_l[var8] ^ -1) > -1) {
                    stackOut_25_0 = (String) ((Object) stackIn_25_0);
                    stackOut_25_1 = stackIn_25_1;
                    stackOut_25_2 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    break L11;
                  } else {
                    stackOut_24_0 = (String) ((Object) stackIn_24_0);
                    stackOut_24_1 = stackIn_24_1;
                    stackOut_24_2 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_26_2 = stackOut_24_2;
                    break L11;
                  }
                }
                L12: {
                  var9 = in.a(stackIn_26_0, stackIn_26_1, stackIn_26_2 != 0);
                  if (-1 == ec.field_l[var8]) {
                    break L12;
                  } else {
                    var9 = var9 + 2 * gm.field_e;
                    break L12;
                  }
                }
                L13: {
                  if (var7 < var9) {
                    var7 = var9;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var8++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var5);
            stackOut_42_1 = new StringBuilder().append("cg.D(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L14;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L14;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        try {
            if (!((rm.field_Q ^ -1) != param0)) {
                ia.b((byte) -72);
            }
            ag.a(param0 + 11831, gg.field_n, ka.field_o, ih.field_T);
            kf.a(0, (byte) 98, param1, 0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "cg.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = (byte[][]) null;
        field_c = null;
        if (param0 != 1) {
            String var2 = (String) null;
            cg.a((byte) 53, (String) null, 88, true, false);
        }
    }

    static {
        field_b = new byte[50][];
    }
}
