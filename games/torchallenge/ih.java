/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends kj implements sg {
    static int[] field_O;
    private ng field_M;
    private ng field_P;
    static int field_K;
    private ng field_L;
    static int[] field_N;
    static int field_J;

    public ih() {
        super(0, 0, 476, 225, (j) null);
        ((ih) this).field_M = new ng(nd.field_a, (gg) null);
        ((ih) this).field_P = new ng(uk.field_Q, (gg) null);
        ((ih) this).field_L = new ng(cj.field_k, (gg) null);
        cl var1 = new cl();
        ((ih) this).field_M.field_q = (j) (Object) var1;
        ((ih) this).field_P.field_q = (j) (Object) var1;
        ((ih) this).field_L.field_q = (j) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        ((ih) this).field_P.a((byte) 111, -var3 + ((ih) this).field_p >> 1, 30, var4, -var2 + (((ih) this).field_l - 48));
        ((ih) this).field_L.a((byte) 116, var4 + (-var3 + ((ih) this).field_p >> 1) - -var2, 30, var4, -var2 + -48 + ((ih) this).field_l);
        ((ih) this).field_M.a((byte) 123, ((ih) this).field_p + -var3 >> 1, 30, var3, -(2 * var2) + (((ih) this).field_l - 78));
        ((ih) this).field_P.field_k = (gg) this;
        ((ih) this).field_M.field_k = (gg) this;
        ((ih) this).field_L.field_k = (gg) this;
        ((ih) this).field_M.field_r = am.field_c;
        ((ih) this).field_L.field_r = vk.field_c;
        ((ih) this).a(0, (ee) (Object) ((ih) this).field_P);
        ((ih) this).a(0, (ee) (Object) ((ih) this).field_M);
        ((ih) this).a(0, (ee) (Object) ((ih) this).field_L);
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != ((ih) this).field_P) {
                if (param0 == ((ih) this).field_M) {
                  int discarded$5 = -14956;
                  k.a();
                  break L1;
                } else {
                  if (param0 != ((ih) this).field_L) {
                    break L1;
                  } else {
                    hf.a((byte) -111);
                    break L1;
                  }
                }
              } else {
                int discarded$6 = 116;
                nd.b();
                break L1;
              }
            }
            L2: {
              if (!param4) {
                break L2;
              } else {
                field_K = -44;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("ih.A(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean f(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -77) {
            break L0;
          } else {
            ih.h(-21);
            break L0;
          }
        }
        L1: {
          L2: {
            if (gj.field_c < 10) {
              break L2;
            } else {
              if (li.field_K < 13) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a() {
        oa.field_g = 0;
        ha.field_d = 0;
        jj.field_d = false;
        cl.field_z = false;
        s.field_m = false;
        db.field_B = 0;
        ra.field_q = false;
        dk.field_a = 0;
        ah.field_i = false;
        ng.field_I = 0;
        ni.field_b = false;
        lc.field_r = false;
        me.field_g = 0;
        ii.field_k = null;
        we.field_j = 0;
        lj.field_b = 0;
        ec.field_b = -1;
        ed.field_c = 0;
        gh.field_m = false;
        fa.field_t = -1;
        sd.field_d = 0;
        kc.field_w = null;
        fh.field_d = 0;
        vi.field_a = 0;
        n.field_jb = 0;
        fc.field_o = 0;
        rk.field_e = true;
        o.field_l = 0;
        ad.field_a = true;
        tk.field_P = false;
        bd.field_l = false;
        i.field_r = 0;
        qk.field_lb = 0;
        rj.field_d = null;
        uf.field_k = false;
        hf.field_c = 0;
        gl.field_f = false;
        pi.field_c = null;
        id.field_d = null;
        wj.field_a = 0;
        eb.field_n = false;
        wk.field_F = 0;
        ii.field_e = false;
        kl.field_a = false;
        ql.field_j = false;
        td.field_e = 0;
        bk.field_w = false;
        hb.field_f = 0;
        ti.field_d = 0;
        vd.field_b = true;
        kf.field_d = 0;
        ea.field_h = null;
        sf.field_c = 0;
        ql.field_n = 0;
        mj.field_b = false;
        wh.field_b = false;
        int discarded$0 = 1;
        qh.d();
        sd.a(123);
        sd.b(116);
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_12_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, (byte) 98, param3)) {
              if (98 == param0) {
                stackOut_5_0 = ((ih) this).a(param3, (byte) -16);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (param0 != 99) {
                  if (param2 > 9) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    var6 = null;
                    boolean discarded$2 = ((ih) this).a(20, 'Q', (byte) 83, (ee) null);
                    return false;
                  }
                } else {
                  stackOut_8_0 = ((ih) this).b(113, param3);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("ih.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ka param5, int param6) {
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ka var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var19 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (qg.field_a <= param1) {
                break L1;
              } else {
                param0 = param0 - (qg.field_a - param1);
                param1 = qg.field_a;
                break L1;
              }
            }
            L2: {
              if (qg.field_k <= param6) {
                break L2;
              } else {
                param3 = param3 - (-param6 + qg.field_k);
                param6 = qg.field_k;
                break L2;
              }
            }
            L3: {
              if (qg.field_c >= param0 + param1) {
                break L3;
              } else {
                param0 = -param1 + qg.field_c;
                break L3;
              }
            }
            L4: {
              if (qg.field_l >= param6 - -param3) {
                break L4;
              } else {
                param3 = qg.field_l - param6;
                break L4;
              }
            }
            L5: {
              if (param0 <= 0) {
                break L5;
              } else {
                if (param3 <= 0) {
                  break L5;
                } else {
                  var21 = param5.c();
                  var32 = qg.field_i;
                  var10 = qg.field_g;
                  var11 = qg.field_f;
                  var30 = new int[4];
                  qg.a(var30);
                  param5.d();
                  qg.a(var30[0], var30[1], var30[2], var30[3]);
                  var13 = param6 * param5.field_u + param1;
                  var14 = -param0 + param5.field_u;
                  var31 = var21.field_y;
                  var28 = var31;
                  var25 = var28;
                  var22 = var25;
                  var15 = var22;
                  var16 = param6;
                  L6: while (true) {
                    if (var16 >= param6 + param3) {
                      var21.g(-param5.field_s, -param5.field_p);
                      qg.a(var32, var10, var11);
                      qg.b(var30);
                      break L0;
                    } else {
                      var17 = param1;
                      L7: while (true) {
                        if (param1 - -param0 <= var17) {
                          var13 = var13 + var14;
                          var16++;
                          continue L6;
                        } else {
                          L8: {
                            var18 = var31[var13];
                            if (var18 != 0) {
                              L9: {
                                if (var17 <= 0) {
                                  break L9;
                                } else {
                                  if (0 == var15[-1 + var13]) {
                                    qg.e(var17, var16, param4, 1);
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (var16 <= 0) {
                                  break L10;
                                } else {
                                  if (var15[var13 - param5.field_u] == 0) {
                                    qg.e(var17, var16, param4, 1);
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (var17 >= param5.field_u - 1) {
                                  break L11;
                                } else {
                                  if (var15[var13 - -1] == 0) {
                                    qg.e(var17, var16, param4, 1);
                                    break L8;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (var16 >= -1 + param5.field_x) {
                                break L8;
                              } else {
                                if (var15[param5.field_u + var13] != 0) {
                                  break L8;
                                } else {
                                  qg.e(var17, var16, param4, 1);
                                  break L8;
                                }
                              }
                            } else {
                              break L8;
                            }
                          }
                          var13++;
                          var17++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var8 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var8;
            stackOut_40_1 = new StringBuilder().append("ih.B(").append(param0).append(',').append(param1).append(',').append(4).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param5 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L12;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L12;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ',' + param6 + ',' + 1 + ')');
        }
    }

    public static void h(int param0) {
        field_O = null;
        if (param0 != 99) {
            field_K = -128;
        }
        field_N = null;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = ((ih) this).field_m - -param1;
        int var6 = ((ih) this).field_i + param0;
        int discarded$0 = oe.field_g.a(dk.field_g, 20 + var5, var6 + 20, -40 + ((ih) this).field_p, ((ih) this).field_l + -50, 16777215, -1, 1, 0, oe.field_g.field_x);
        super.a(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new int[8192];
        field_N = new int[]{16773632, 12095488, 12424960, 16773632};
        field_J = 0;
    }
}
