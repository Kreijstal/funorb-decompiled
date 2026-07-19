/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends kn implements sh {
    static int field_M;
    static ae field_Q;
    private hc field_I;
    static boolean[] field_O;
    static boolean field_S;
    static volatile int field_J;
    private hc field_N;
    static int field_P;
    static int field_R;
    private hc field_L;
    static int field_K;

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param2 != this.field_L) {
                if (param2 == this.field_I) {
                  fe.e(param1 + 26307);
                  break L1;
                } else {
                  if (param2 == this.field_N) {
                    km.a((byte) -63);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                fl.a((byte) -122);
                break L1;
              }
            }
            L2: {
              if (param1 == 6) {
                break L2;
              } else {
                field_O = (boolean[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("qd.B(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = param1 + this.field_u;
        int var6 = param2 + this.field_t;
        int discarded$0 = bn.field_d.a(kf.field_b, var5 - -20, var6 + 20, -40 + this.field_v, -50 + this.field_q, 16777215, -1, 1, 0, bn.field_d.field_I);
        super.a(param0, param1, param2, param3);
    }

    public qd() {
        super(0, 0, 476, 225, (ad) null);
        this.field_I = new hc(u.field_a, (rm) null);
        this.field_L = new hc(hk.field_c, (rm) null);
        this.field_N = new hc(hj.field_a, (rm) null);
        wi var1 = new wi();
        this.field_I.field_A = (ad) ((Object) var1);
        this.field_L.field_A = (ad) ((Object) var1);
        this.field_N.field_A = (ad) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 523070369;
        this.field_L.a(30, -115, -var3 + this.field_v >> -233422495, var4, -var2 + (-48 + this.field_q));
        this.field_N.a(30, -51, var4 + (this.field_v + -var3 >> -2063726175) + var2, var4, -var2 + -48 + this.field_q);
        this.field_I.a(30, -108, this.field_v - var3 >> -1560461119, var3, -(var2 * 2) + -78 + this.field_q);
        this.field_L.field_y = (rm) (this);
        this.field_I.field_y = (rm) (this);
        this.field_I.field_n = ha.field_f;
        this.field_N.field_y = (rm) (this);
        this.field_N.field_n = si.field_c;
        this.a(-1, this.field_L);
        this.a(-1, this.field_I);
        this.a(-1, this.field_N);
    }

    final static void a(int param0, String param1) {
        try {
            pm.field_b = param1;
            if (param0 != 5) {
                field_J = -98;
            }
            oj.a(12, 3);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "qd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param3 ^ -1)) {
                if (param3 == 99) {
                  stackOut_9_0 = this.a(param1, (byte) 12);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = this.b(param1, 0);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("qd.K(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String[] var12 = null;
        String var13 = null;
        String var14 = null;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        String[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        String[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        String[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        String stackIn_34_2 = null;
        String[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String stackIn_40_2 = null;
        String stackIn_87_0 = null;
        String stackIn_88_0 = null;
        String stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        String[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String stackOut_39_2 = null;
        String[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_38_2 = null;
        String[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        String[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        String stackOut_33_2 = null;
        String[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        String stackOut_32_2 = null;
        int stackOut_106_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        String stackOut_86_0 = null;
        String stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        String stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        var10 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              ti.field_M = param2;
              cg.field_C = true;
              if (0 == ti.field_M) {
                var3_int = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, ta.field_a);
                var4 = 3 + var3_int;
                mf.field_m = new int[var4];
                ne.field_K = new String[var4];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    wf.field_P = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var3_int) {
                        ne.field_K[-3 + var4] = "";
                        ne.field_K[var4 + -2] = ud.field_b;
                        mf.field_m[-2 + var4] = 0;
                        wf.field_P[0] = 4;
                        ne.field_K[-1 + var4] = ed.field_f;
                        mf.field_m[-1 + var4] = 1;
                        wf.field_P[1] = 5;
                        break L1;
                      } else {
                        ne.field_K[var5] = fd.field_J[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    mf.field_m[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (-2 == (ti.field_M ^ -1)) {
                  var3_int = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, ta.field_a);
                  var4 = var3_int + 2;
                  ne.field_K = new String[var4];
                  mf.field_m = new int[var4];
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= var4) {
                      wf.field_P = new int[1];
                      var5 = 0;
                      L5: while (true) {
                        if (var5 >= var3_int) {
                          ne.field_K[var4 + -2] = "";
                          ne.field_K[var4 + -1] = ed.field_f;
                          mf.field_m[var4 - 1] = 0;
                          wf.field_P[0] = 5;
                          break L1;
                        } else {
                          ne.field_K[var5] = fd.field_J[var5];
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      mf.field_m[var5] = -1;
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  if ((ti.field_M ^ -1) != -3) {
                    if ((ti.field_M ^ -1) != -4) {
                      if (ti.field_M == 4) {
                        var3_int = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, ri.field_f);
                        var4 = var3_int + 2;
                        mf.field_m = new int[var4];
                        ne.field_K = new String[var4];
                        var5 = 0;
                        L6: while (true) {
                          if (var5 >= var4) {
                            wf.field_P = new int[1];
                            var5 = 0;
                            L7: while (true) {
                              if (var5 >= var3_int) {
                                ne.field_K[-2 + var4] = "";
                                ne.field_K[var4 + -1] = ed.field_f;
                                mf.field_m[var4 - 1] = 0;
                                wf.field_P[0] = 5;
                                break L1;
                              } else {
                                ne.field_K[var5] = fd.field_J[var5];
                                var5++;
                                continue L7;
                              }
                            }
                          } else {
                            mf.field_m[var5] = -1;
                            var5++;
                            continue L6;
                          }
                        }
                      } else {
                        if ((ti.field_M ^ -1) != -6) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, cn.field_F);
                          var4 = 3 - -var3_int;
                          ne.field_K = new String[var4];
                          mf.field_m = new int[var4];
                          var5 = 0;
                          L8: while (true) {
                            if (var4 <= var5) {
                              wf.field_P = new int[2];
                              var5 = 0;
                              L9: while (true) {
                                if (var3_int <= var5) {
                                  ne.field_K[-3 + var4] = "";
                                  ne.field_K[-2 + var4] = li.field_b;
                                  mf.field_m[-2 + var4] = 0;
                                  wf.field_P[0] = 3;
                                  ne.field_K[-1 + var4] = ed.field_f;
                                  mf.field_m[var4 - 1] = 1;
                                  wf.field_P[1] = 5;
                                  break L1;
                                } else {
                                  ne.field_K[var5] = fd.field_J[var5];
                                  var5++;
                                  continue L9;
                                }
                              }
                            } else {
                              mf.field_m[var5] = -1;
                              var5++;
                              continue L8;
                            }
                          }
                        }
                      }
                    } else {
                      L10: {
                        if (qa.field_a.field_a) {
                          var3_int = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, ub.field_b);
                          break L10;
                        } else {
                          var3_int = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, pn.field_d);
                          break L10;
                        }
                      }
                      var4 = 2 - -var3_int;
                      mf.field_m = new int[var4];
                      ne.field_K = new String[var4];
                      var5 = 0;
                      L11: while (true) {
                        if (var4 <= var5) {
                          wf.field_P = new int[1];
                          var5 = 0;
                          L12: while (true) {
                            if (var3_int <= var5) {
                              ne.field_K[-2 + var4] = "";
                              ne.field_K[var4 - 1] = ed.field_f;
                              mf.field_m[-1 + var4] = 0;
                              wf.field_P[0] = 5;
                              break L1;
                            } else {
                              ne.field_K[var5] = fd.field_J[var5];
                              var5++;
                              continue L12;
                            }
                          }
                        } else {
                          mf.field_m[var5] = -1;
                          var5++;
                          continue L11;
                        }
                      }
                    }
                  } else {
                    var3_int = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, oa.a((byte) -74, fb.field_h, new String[]{"<br><%0><br>"}));
                    var4 = -1;
                    var5 = 0;
                    L13: while (true) {
                      L14: {
                        if (var5 >= var3_int) {
                          break L14;
                        } else {
                          if ("<%0>".equals(fd.field_J[var5])) {
                            var4 = var5;
                            break L14;
                          } else {
                            var5++;
                            continue L13;
                          }
                        }
                      }
                      if (-1 != var4) {
                        oe.field_g = new String[var4];
                        ai.a(fd.field_J, 0, oe.field_g, 0, var4);
                        om.field_f = new String[-1 + (-var4 + var3_int)];
                        ai.a(fd.field_J, 1 + var4, om.field_f, 0, var3_int - var4 - 1);
                        var4 = -1;
                        var3_int = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, oa.a((byte) -127, ff.field_e, new String[]{"<br><%0><br>"}));
                        var5 = 0;
                        L15: while (true) {
                          L16: {
                            if (var3_int <= var5) {
                              break L16;
                            } else {
                              if (!"<%0>".equals(fd.field_J[var5])) {
                                var5++;
                                continue L15;
                              } else {
                                var4 = var5;
                                break L16;
                              }
                            }
                          }
                          if (0 == (var4 ^ -1)) {
                            throw new IllegalStateException();
                          } else {
                            L17: {
                              ce.field_c = new String[var4];
                              ai.a(fd.field_J, 0, ce.field_c, 0, var4);
                              ik.field_N = new String[-1 + (var3_int - var4)];
                              ai.a(fd.field_J, 1 + var4, ik.field_N, 0, -1 + -var4 + var3_int);
                              if (ce.field_c.length <= oe.field_g.length) {
                                stackOut_22_0 = oe.field_g.length;
                                stackIn_23_0 = stackOut_22_0;
                                break L17;
                              } else {
                                stackOut_21_0 = ce.field_c.length;
                                stackIn_23_0 = stackOut_21_0;
                                break L17;
                              }
                            }
                            L18: {
                              var5 = stackIn_23_0;
                              if (om.field_f.length >= ik.field_N.length) {
                                stackOut_25_0 = om.field_f.length;
                                stackIn_26_0 = stackOut_25_0;
                                break L18;
                              } else {
                                stackOut_24_0 = ik.field_N.length;
                                stackIn_26_0 = stackOut_24_0;
                                break L18;
                              }
                            }
                            var6 = stackIn_26_0;
                            var7 = var6 + (var5 + 7);
                            ne.field_K = new String[var7];
                            mf.field_m = new int[var7];
                            var8 = 0;
                            L19: while (true) {
                              if (var7 <= var8) {
                                mf.field_m[1] = 0;
                                ne.field_K[0] = ca.field_f;
                                ne.field_K[1] = tb.field_b;
                                wf.field_P = new int[2];
                                mf.field_m[3] = 1;
                                wf.field_P[1] = 2;
                                ne.field_K[5] = "";
                                ne.field_K[4] = bb.field_b;
                                wf.field_P[0] = 5;
                                ne.field_K[2] = ab.field_a;
                                ne.field_K[3] = tk.field_f;
                                var8 = 0;
                                L20: while (true) {
                                  if (var5 <= var8) {
                                    ne.field_K[6 - -var5] = null;
                                    mf.field_m[var5 + 6] = -2;
                                    var8 = 0;
                                    L21: while (true) {
                                      if (var8 >= var6) {
                                        tl.field_o = sf.a((byte) -24);
                                        break L1;
                                      } else {
                                        L22: {
                                          stackOut_37_0 = ne.field_K;
                                          stackOut_37_1 = 7 + (var5 + var8);
                                          stackIn_39_0 = stackOut_37_0;
                                          stackIn_39_1 = stackOut_37_1;
                                          stackIn_38_0 = stackOut_37_0;
                                          stackIn_38_1 = stackOut_37_1;
                                          if (var8 >= ik.field_N.length) {
                                            stackOut_39_0 = (String[]) ((Object) stackIn_39_0);
                                            stackOut_39_1 = stackIn_39_1;
                                            stackOut_39_2 = "";
                                            stackIn_40_0 = stackOut_39_0;
                                            stackIn_40_1 = stackOut_39_1;
                                            stackIn_40_2 = stackOut_39_2;
                                            break L22;
                                          } else {
                                            stackOut_38_0 = (String[]) ((Object) stackIn_38_0);
                                            stackOut_38_1 = stackIn_38_1;
                                            stackOut_38_2 = ik.field_N[var8];
                                            stackIn_40_0 = stackOut_38_0;
                                            stackIn_40_1 = stackOut_38_1;
                                            stackIn_40_2 = stackOut_38_2;
                                            break L22;
                                          }
                                        }
                                        stackIn_40_0[stackIn_40_1] = stackIn_40_2;
                                        var8++;
                                        continue L21;
                                      }
                                    }
                                  } else {
                                    L23: {
                                      stackOut_31_0 = ne.field_K;
                                      stackOut_31_1 = 6 + var8;
                                      stackIn_33_0 = stackOut_31_0;
                                      stackIn_33_1 = stackOut_31_1;
                                      stackIn_32_0 = stackOut_31_0;
                                      stackIn_32_1 = stackOut_31_1;
                                      if (-1 >= (var8 - -ce.field_c.length + -var5 ^ -1)) {
                                        stackOut_33_0 = (String[]) ((Object) stackIn_33_0);
                                        stackOut_33_1 = stackIn_33_1;
                                        stackOut_33_2 = ce.field_c[-var5 + ce.field_c.length + var8];
                                        stackIn_34_0 = stackOut_33_0;
                                        stackIn_34_1 = stackOut_33_1;
                                        stackIn_34_2 = stackOut_33_2;
                                        break L23;
                                      } else {
                                        stackOut_32_0 = (String[]) ((Object) stackIn_32_0);
                                        stackOut_32_1 = stackIn_32_1;
                                        stackOut_32_2 = "";
                                        stackIn_34_0 = stackOut_32_0;
                                        stackIn_34_1 = stackOut_32_1;
                                        stackIn_34_2 = stackOut_32_2;
                                        break L23;
                                      }
                                    }
                                    stackIn_34_0[stackIn_34_1] = stackIn_34_2;
                                    var8++;
                                    continue L20;
                                  }
                                }
                              } else {
                                mf.field_m[var8] = -1;
                                var8++;
                                continue L19;
                              }
                            }
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  }
                }
              }
            }
            pn.field_a.field_i = wf.field_P.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (ne.field_K.length <= var4) {
                L25: {
                  if ((ti.field_M ^ -1) == -3) {
                    var11 = oe.field_g;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var11.length) {
                        var12 = om.field_f;
                        var5 = 0;
                        L27: while (true) {
                          if (var12.length <= var5) {
                            break L25;
                          } else {
                            var14 = var12[var5];
                            var7 = hl.a(var14, false, -15388);
                            if (var7 > var3_int) {
                              var3_int = var7;
                              var5++;
                              continue L27;
                            } else {
                              var5++;
                              continue L27;
                            }
                          }
                        }
                      } else {
                        var13 = var11[var5];
                        var7 = hl.a(var13, false, -15388);
                        if (var7 > var3_int) {
                          var3_int = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                si.field_d = -(var3_int >> -1619714175) + (rj.field_e + var3_int);
                hn.field_b = pn.field_a.field_i * (sn.field_d - -hi.field_z << 340041025);
                cg.field_o = -(var3_int >> -1669044063) + rj.field_e;
                var4 = 0;
                L28: while (true) {
                  if (var4 >= ne.field_K.length) {
                    var4 = 86 % ((72 - param0) / 52);
                    lj.field_p = aa.field_d + -(hn.field_b >> 1855427745);
                    ed.field_a = new int[ne.field_K.length][];
                    var5 = 0;
                    var6 = lj.field_p;
                    L29: while (true) {
                      if (ne.field_K.length <= var5) {
                        L30: {
                          if ((ti.field_M ^ -1) == -3) {
                            pn.field_a.a(0, -1, -1, param1);
                            break L30;
                          } else {
                            pn.field_a.a(0, 0, sj.a(nk.field_w, (byte) 126, gb.field_e), param1);
                            break L30;
                          }
                        }
                        break L0;
                      } else {
                        L31: {
                          var7 = mf.field_m[var5];
                          if (0 > var7) {
                            var6 = var6 + vd.field_z;
                            break L31;
                          } else {
                            var8 = hl.a(ne.field_K[var5], true, -15388);
                            var9 = -(var8 >> -1102621311) + rj.field_e;
                            var6 = var6 + hi.field_z;
                            ed.field_a[var5] = new int[4];
                            ed.field_a[var5][0] = -ka.field_a + var9;
                            ed.field_a[var5][1] = var6;
                            ed.field_a[var5][2] = (ka.field_a << -1376077567) + var8;
                            var6 = var6 + (nk.field_u + hi.field_z + (sn.field_d << 1943270273));
                            ed.field_a[var5][3] = (sn.field_d << -21649503) + nk.field_u;
                            break L31;
                          }
                        }
                        var5++;
                        continue L29;
                      }
                    }
                  } else {
                    L32: {
                      stackOut_106_0 = hn.field_b;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_107_0 = stackOut_106_0;
                      if (0 <= mf.field_m[var4]) {
                        stackOut_108_0 = stackIn_108_0;
                        stackOut_108_1 = nk.field_u;
                        stackIn_109_0 = stackOut_108_0;
                        stackIn_109_1 = stackOut_108_1;
                        break L32;
                      } else {
                        stackOut_107_0 = stackIn_107_0;
                        stackOut_107_1 = vd.field_z;
                        stackIn_109_0 = stackOut_107_0;
                        stackIn_109_1 = stackOut_107_1;
                        break L32;
                      }
                    }
                    hn.field_b = stackIn_109_0 + stackIn_109_1;
                    var4++;
                    continue L28;
                  }
                }
              } else {
                L33: {
                  stackOut_86_0 = ne.field_K[var4];
                  stackIn_88_0 = stackOut_86_0;
                  stackIn_87_0 = stackOut_86_0;
                  if (mf.field_m[var4] < 0) {
                    stackOut_88_0 = (String) ((Object) stackIn_88_0);
                    stackOut_88_1 = 0;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    break L33;
                  } else {
                    stackOut_87_0 = (String) ((Object) stackIn_87_0);
                    stackOut_87_1 = 1;
                    stackIn_89_0 = stackOut_87_0;
                    stackIn_89_1 = stackOut_87_1;
                    break L33;
                  }
                }
                var5 = hl.a(stackIn_89_0, stackIn_89_1 != 0, -15388);
                if (var5 > var3_int) {
                  var3_int = var5;
                  var4++;
                  continue L24;
                } else {
                  var4++;
                  continue L24;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "qd.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, byte param1, sl param2) {
        try {
            tc.field_v.a((byte) -87, param2);
            if (param1 >= -18) {
                field_J = -12;
            }
            fg.a((byte) 5, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "qd.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1) {
        pi var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        sl var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            var4 = (sl) ((Object) tc.field_v.b(112));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1 < -81) {
                    break L2;
                  } else {
                    qd.a(false);
                    break L2;
                  }
                }
                var2 = on.field_v.b(99);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    tc.a(1, param0);
                    var2 = on.field_v.b((byte) 56);
                    continue L3;
                  }
                }
              } else {
                fg.a((byte) 5, var4, param0);
                var4 = (sl) ((Object) tc.field_v.b((byte) 56));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2_ref), "qd.G(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_Q = null;
        field_O = null;
    }

    final static void n(int param0) {
        ff.field_e = oa.a((byte) -81, ff.field_e, new String[]{"<br><shad=000001><%0></shad><br>"});
        fb.field_h = oa.a((byte) -72, fb.field_h, new String[]{"<br><shad=000001><%0></shad><br>"});
        m.field_g[0] = mn.field_v;
        m.field_g[3] = em.field_u;
        m.field_g[1] = vc.field_w;
        m.field_g[6] = cc.field_M;
        m.field_g[2] = ka.field_c;
        m.field_g[4] = qe.field_e;
        m.field_g[5] = ng.field_i;
        m.field_g[21] = md.field_a;
        m.field_g[19] = gd.field_t;
        m.field_g[18] = ee.field_H;
        m.field_g[20] = ri.field_b;
        m.field_g[16] = dn.field_n;
        m.field_g[13] = te.field_a;
        m.field_g[17] = de.field_c;
        m.field_g[10] = jh.field_b;
        m.field_g[8] = ck.field_c[1];
        m.field_g[23] = pm.field_d;
        m.field_g[14] = sd.field_e;
        m.field_g[15] = ee.field_E;
        m.field_g[22] = jc.field_D;
        m.field_g[24] = sd.field_e;
        e.field_i = new String[35][][];
        m.field_g[7] = ck.field_c[0];
        m.field_g[9] = ck.field_c[2];
        m.field_g[11] = jf.field_e;
        m.field_g[12] = tl.field_p + ":";
        e.field_i[11] = ci.field_h;
        e.field_i[10] = pb.field_R;
        e.field_i[0] = nk.field_v;
        e.field_i[14] = ec.field_g;
        e.field_i[15] = dh.field_b;
        e.field_i[28] = pf.field_g;
        e.field_i[27] = wf.field_Y;
        e.field_i[23] = nd.field_c;
        e.field_i[6] = kd.field_b;
        e.field_i[22] = wf.field_Q;
        e.field_i[16] = ek.field_a;
        e.field_i[9] = wi.field_x;
        e.field_i[13] = oj.field_M;
        e.field_i[12] = qm.field_g;
        e.field_i[20] = jh.field_c;
        e.field_i[25] = pc.field_e;
        e.field_i[29] = ok.field_d;
        e.field_i[4] = pf.field_d;
        e.field_i[2] = wi.field_u;
        e.field_i[8] = kn.field_D;
        e.field_i[17] = tl.field_n;
        e.field_i[5] = lf.field_i;
        e.field_i[1] = ed.field_b;
        e.field_i[3] = vi.field_c;
        e.field_i[param0] = cg.field_K;
        e.field_i[19] = af.field_n;
        e.field_i[18] = lj.field_u;
        e.field_i[7] = il.field_t;
        e.field_i[26] = jh.field_d;
        e.field_i[24] = jn.field_t;
        e.field_i[34] = nj.field_b;
        e.field_i[28] = pf.field_g;
        e.field_i[33] = i.field_b;
        e.field_i[32] = ob.field_n;
        e.field_i[30] = vh.field_b;
        e.field_i[31] = sb.field_s;
    }

    static {
        field_O = new boolean[112];
        field_P = -1;
        field_J = 0;
        field_R = 0;
    }
}
