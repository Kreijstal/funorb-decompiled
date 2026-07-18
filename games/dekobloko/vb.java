/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vb extends kf implements jl {
    private qf field_W;
    static ji field_S;
    static boolean field_Z;
    static int[] field_X;
    static String[] field_U;
    static int field_V;
    static String field_Y;
    static String field_T;

    abstract int i(int param0);

    public static void j(int param0) {
        field_X = null;
        field_U = null;
        field_S = null;
        if (param0 > -17) {
            vb.j(-12);
        }
        field_Y = null;
        field_T = null;
    }

    abstract boolean k(int param0);

    final static void g(byte param0) {
        Object var2 = null;
        qf.a("", -99, (String) null);
    }

    public final nb a(int param0) {
        if (param0 > -86) {
            vb.j(-30);
        }
        return (nb) (Object) ((vb) this).field_W;
    }

    abstract int f(byte param0);

    void a(byte param0, qf param1) {
        try {
            ((vb) this).field_W = param1;
            ((vb) this).field_W.field_g = (vb) this;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "vb.H(" + 88 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        w var8_ref_w = null;
        int var9 = 0;
        qd var9_ref_qd = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        w var14 = null;
        w var15 = null;
        int stackIn_4_0 = 0;
        w stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        w stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        w stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        w stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        w stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        w stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        var13 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              wj.field_Lb = hk.field_j;
              vk.field_f = hk.field_i;
              if (!param0) {
                stackOut_3_0 = tg.field_e;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = bf.field_r;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              qf.a(stackIn_4_0, 97);
              je.field_f.a(-42 + ee.field_i.field_N, ee.field_i.field_mb, 0, 115, 0);
              he.field_jb.a(in.field_o.field_mb, 0, 0, kf.field_O, 0);
              stackOut_4_0 = kl.field_r;
              stackOut_4_1 = in.field_o.field_mb;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if (!pd.field_a) {
                stackOut_6_0 = (w) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                break L2;
              } else {
                stackOut_5_0 = (w) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = 2 + (40 + vh.field_e - -2);
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                break L2;
              }
            }
            L3: {
              ((w) (Object) stackIn_7_0).a(stackIn_7_1 - stackIn_7_2, 0, 2 + kf.field_O, 18, 0);
              ea.field_A.a(42 - -vh.field_e, 0, kf.field_O - -2, 18, -40 + (-2 + in.field_o.field_mb - vh.field_e));
              tb.field_b.a(6, kf.field_O + 22, vh.field_e, 0, -2 + (-kf.field_O + in.field_o.field_N) - 20, in.field_o.field_mb, 2);
              ma.field_G.a(ee.field_i.field_mb, 0, -40 + ee.field_i.field_N, 40, 0);
              fl.field_b.a(oh.field_d.field_mb, 0, 0, 30, 0);
              qm.field_a.a(oh.field_d.field_mb, 0, 30, -2 + oh.field_d.field_N + -70, 0);
              var2_int = j.field_b - -3;
              if (b.field_P.length >= 2) {
                break L3;
              } else {
                var2_int--;
                break L3;
              }
            }
            L4: {
              if (!param0) {
                break L4;
              } else {
                var2_int--;
                break L4;
              }
            }
            L5: {
              var3 = (-10 + (-5 + (qm.field_a.field_N - 5) - -2 + (var2_int - -1) / 2)) / (1 + var2_int) - 2;
              if (var3 > 30) {
                var3 = 30;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var4 = -((2 + var3) * var2_int) + -5 + qm.field_a.field_N - 5;
              if (var4 <= 40) {
                break L6;
              } else {
                var4 = 40;
                break L6;
              }
            }
            li.field_d.a(-5 + qm.field_a.field_mb - 5, 0, 5, var4, 5);
            var5 = var4 + 7;
            var6 = 0;
            L7: while (true) {
              if (var6 >= 4 + j.field_b) {
                mn.field_e.a(360, 0, 10, -10 + (-120 + hk.field_i + -14), hk.field_j + -360 >> 1);
                ie.field_a.a(mn.field_e.field_mb, 0, 0, 24, 0);
                cl.field_C.a(mn.field_e.field_mb, 0, 24, mn.field_e.field_N - 24, 0);
                cl.field_C.field_lb = ea.a(1, -20982, 3, cl.field_C.field_N, 8421504, 11579568);
                gg.field_y.a(-10 + cl.field_C.field_mb, 0, 5, -10 + cl.field_C.field_N - 26, 5);
                qc.field_q.a(80, 0, -29 + cl.field_C.field_N, 24, (-80 + cl.field_C.field_mb) / 2);
                bf.c((byte) -81);
                break L0;
              } else {
                L8: {
                  L9: {
                    if (1 != var6) {
                      break L9;
                    } else {
                      if (b.field_P.length >= 2) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    if (3 != var6) {
                      break L10;
                    } else {
                      if (mg.field_Vb <= 1) {
                        break L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (param0) {
                      break L11;
                    } else {
                      if (var6 == 3) {
                        var15 = um.field_c[var6];
                        um.field_c[var6].field_N = 0;
                        var15.field_mb = 0;
                        var8 = 0;
                        L12: while (true) {
                          if (qa.field_v[var6].length <= var8) {
                            break L8;
                          } else {
                            L13: {
                              if (qa.field_v[var6][var8] == null) {
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            var8++;
                            continue L12;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  L14: {
                    if (!param0) {
                      break L14;
                    } else {
                      if (var6 != 0) {
                        break L14;
                      } else {
                        var14 = um.field_c[var6];
                        um.field_c[var6].field_N = 0;
                        var14.field_mb = 0;
                        var8 = 0;
                        L15: while (true) {
                          if (qa.field_v[var6].length <= var8) {
                            break L8;
                          } else {
                            L16: {
                              if (qa.field_v[var6][var8] == null) {
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            var8++;
                            continue L15;
                          }
                        }
                      }
                    }
                  }
                  L17: {
                    if (param0) {
                      if (var6 >= 4) {
                        if (null != bn.field_f) {
                          if (bn.field_f[-4 + var6]) {
                            stackOut_42_0 = 1;
                            stackIn_44_0 = stackOut_42_0;
                            break L17;
                          } else {
                            stackOut_41_0 = 0;
                            stackIn_44_0 = stackOut_41_0;
                            break L17;
                          }
                        } else {
                          stackOut_39_0 = 0;
                          stackIn_44_0 = stackOut_39_0;
                          break L17;
                        }
                      } else {
                        stackOut_37_0 = 0;
                        stackIn_44_0 = stackOut_37_0;
                        break L17;
                      }
                    } else {
                      stackOut_35_0 = 0;
                      stackIn_44_0 = stackOut_35_0;
                      break L17;
                    }
                  }
                  var7 = stackIn_44_0;
                  if (var7 == 0) {
                    L18: {
                      um.field_c[var6].a(103, 0, var5, var3, 5);
                      var8 = 110;
                      if (!param0) {
                        if (qa.field_v[var6][0] == null) {
                          break L18;
                        } else {
                          var9_ref_qd = qa.field_v[var6][0];
                          qa.field_v[var6][0].field_N = 0;
                          var9_ref_qd.field_mb = 0;
                          break L18;
                        }
                      } else {
                        qa.field_v[var6][0].a(var3, 2, var8, var5, 38, j.field_c, 500);
                        var8 += 40;
                        break L18;
                      }
                    }
                    var9 = 2 + (-var8 + -5) + oh.field_d.field_mb;
                    var10 = qa.field_v[var6].length - 1;
                    var11 = 0;
                    L19: while (true) {
                      if (var10 <= var11) {
                        var5 = var5 + (2 + var3);
                        break L8;
                      } else {
                        var12 = var9 * var11 / var10;
                        qa.field_v[var6][var11 - -1].a(var3, 2, var8 + var12, var5, -var12 + ((1 + var11) * var9 / var10 + -2), j.field_c, 500);
                        var11++;
                        continue L19;
                      }
                    }
                  } else {
                    var8_ref_w = um.field_c[var6];
                    um.field_c[var6].field_N = 0;
                    var8_ref_w.field_mb = 0;
                    var9 = 0;
                    L20: while (true) {
                      if (qa.field_v[var6].length <= var9) {
                        break L8;
                      } else {
                        L21: {
                          if (qa.field_v[var6][var9] == null) {
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        var9++;
                        continue L20;
                      }
                    }
                  }
                }
                var6++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "vb.G(" + param0 + ',' + -2 + ')');
        }
    }

    vb(int param0, int param1, int param2, int param3, gl param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param1 <= 1) {
                if (param1 != 1) {
                  stackOut_9_0 = var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = param0 * var3_int;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                L2: {
                  if ((1 & param1) == 0) {
                    break L2;
                  } else {
                    var3_int = var3_int * param0;
                    break L2;
                  }
                }
                param0 = param0 * param0;
                param1 = param1 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var3, "vb.E(" + param0 + ',' + param1 + ',' + false + ')');
        }
        return stackIn_10_0;
    }

    final static String a(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = client.field_A ? 1 : 0;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = 0; var4 < param1; var4++) {
            var6[var4] = '*';
        }
        return new String(var6);
    }

    abstract int b(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "Show tutorial again";
        field_Y = "To Customer Support";
        field_X = new int[]{2, 1, 2, 3, 2, 10, 2, 10, 3, 5, 5, 1, 1, 2, 5, 2, 3, 10, 1, 2, 5, 3, 5, 5, 1, 1, 1, 1, 2, 2, 3};
    }
}
