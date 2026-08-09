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
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
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
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("qd.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = param1 + this.field_u;
        int var6 = param2 + this.field_t;
        bn.field_d.a(kf.field_b, var5 - -20, var6 + 20, -40 + this.field_v, -50 + this.field_q, 16777215, -1, 1, 0, bn.field_d.field_I);
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param3 ^ -1)) {
                if (param3 == 99) {
                  stackIn_10_0 = this.a(param1, (byte) 12);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.b(param1, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("qd.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
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
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        String[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        String[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        String stackIn_34_2 = null;
        String[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        String stackIn_41_2 = null;
        String stackIn_89_0 = null;
        String stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
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
                                stackIn_23_0 = oe.field_g.length;
                                break L17;
                              } else {
                                stackIn_23_0 = ce.field_c.length;
                                break L17;
                              }
                            }
                            L18: {
                              var5 = stackIn_23_0;
                              if (om.field_f.length >= ik.field_N.length) {
                                stackIn_26_0 = om.field_f.length;
                                break L18;
                              } else {
                                stackIn_26_0 = ik.field_N.length;
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
                                        stackIn_38_0 = ne.field_K;
                                        stackIn_38_1 = 7 + (var5 + var8);
                                        stackIn_38_2 = var8;
                                        stackIn_38_3 = ik.field_N.length;
                                        L22: {




                                          if (stackIn_38_2 >= stackIn_38_3) {
                                            stackIn_38_0 = (String[]) ((Object) stackIn_38_0);

                                            stackIn_41_2 = "";
                                            break L22;
                                          } else {
                                            stackIn_38_0 = (String[]) ((Object) stackIn_38_0);

                                            stackIn_41_2 = ik.field_N[var8];
                                            break L22;
                                          }
                                        }
                                        stackIn_38_0[stackIn_38_1] = stackIn_41_2;
                                        var8++;
                                        continue L21;
                                      }
                                    }
                                  } else {
                                    L23: {
                                      stackIn_33_0 = ne.field_K;

                                      stackIn_33_1 = 6 + var8;

                                      if (-1 >= (var8 - -ce.field_c.length + -var5 ^ -1)) {
                                        stackIn_34_0 = (String[]) ((Object) stackIn_33_0);
                                        stackIn_34_1 = stackIn_33_1;
                                        stackIn_34_2 = ce.field_c[-var5 + ce.field_c.length + var8];
                                        break L23;
                                      } else {
                                        stackIn_34_0 = (String[]) ((Object) stackIn_33_0);
                                        stackIn_34_1 = stackIn_33_1;
                                        stackIn_34_2 = "";
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
                    var4_ref_String__ = var11;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var11.length) {
                        var4_ref_String__ = om.field_f;
                        var5 = 0;
                        L27: while (true) {
                          if (var4_ref_String__.length <= var5) {
                            break L25;
                          } else {
                            var13 = var4_ref_String__[var5];
                            var7 = hl.a(var13, false, -15388);
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
                        var12 = var11[var5];
                        var7 = hl.a(var12, false, -15388);
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
                      stackIn_109_0 = hn.field_b;

                      if (0 <= mf.field_m[var4]) {
                        stackIn_110_0 = stackIn_109_0;
                        stackIn_110_1 = nk.field_u;
                        break L32;
                      } else {
                        stackIn_110_0 = stackIn_109_0;
                        stackIn_110_1 = vd.field_z;
                        break L32;
                      }
                    }
                    hn.field_b = stackIn_110_0 + stackIn_110_1;
                    var4++;
                    continue L28;
                  }
                }
              } else {
                L33: {
                  stackIn_89_0 = ne.field_K[var4];

                  if (mf.field_m[var4] < 0) {
                    stackIn_90_0 = (String) ((Object) stackIn_89_0);
                    stackIn_90_1 = 0;
                    break L33;
                  } else {
                    stackIn_90_0 = (String) ((Object) stackIn_89_0);
                    stackIn_90_1 = 1;
                    break L33;
                  }
                }
                var5 = hl.a(stackIn_90_0, stackIn_90_1 != 0, -15388);
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
        int var3 = 0;
        sl var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
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
