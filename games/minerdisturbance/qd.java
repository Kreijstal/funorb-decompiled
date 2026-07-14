/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        L0: {
          var7 = MinerDisturbance.field_ab;
          if (param2 != ((qd) this).field_L) {
            if (param2 == ((qd) this).field_I) {
              fe.e(param1 + 26307);
              break L0;
            } else {
              if (param2 == ((qd) this).field_N) {
                km.a((byte) -63);
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            fl.a((byte) -122);
            break L0;
          }
        }
        L1: {
          if (param1 == 6) {
            break L1;
          } else {
            field_O = null;
            break L1;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = param1 + ((qd) this).field_u;
        int var6 = param2 + ((qd) this).field_t;
        int discarded$0 = bn.field_d.a(kf.field_b, var5 - -20, var6 + 20, -40 + ((qd) this).field_v, -50 + ((qd) this).field_q, 16777215, -1, 1, 0, bn.field_d.field_I);
        super.a(param0, param1, param2, param3);
    }

    public qd() {
        super(0, 0, 476, 225, (ad) null);
        ((qd) this).field_I = new hc(u.field_a, (rm) null);
        ((qd) this).field_L = new hc(hk.field_c, (rm) null);
        ((qd) this).field_N = new hc(hj.field_a, (rm) null);
        wi var1 = new wi();
        ((qd) this).field_I.field_A = (ad) (Object) var1;
        ((qd) this).field_L.field_A = (ad) (Object) var1;
        ((qd) this).field_N.field_A = (ad) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 523070369;
        ((qd) this).field_L.a(30, -115, -var3 + ((qd) this).field_v >> -233422495, var4, -var2 + (-48 + ((qd) this).field_q));
        ((qd) this).field_N.a(30, -51, var4 + (((qd) this).field_v + -var3 >> -2063726175) + var2, var4, -var2 + -48 + ((qd) this).field_q);
        ((qd) this).field_I.a(30, -108, ((qd) this).field_v - var3 >> -1560461119, var3, -(var2 * 2) + -78 + ((qd) this).field_q);
        ((qd) this).field_L.field_y = (rm) this;
        ((qd) this).field_I.field_y = (rm) this;
        ((qd) this).field_I.field_n = ha.field_f;
        ((qd) this).field_N.field_y = (rm) this;
        ((qd) this).field_N.field_n = si.field_c;
        ((qd) this).a(-1, (fe) (Object) ((qd) this).field_L);
        ((qd) this).a(-1, (fe) (Object) ((qd) this).field_I);
        ((qd) this).a(-1, (fe) (Object) ((qd) this).field_N);
    }

    final static void a(int param0, String param1) {
        pm.field_b = param1;
        if (param0 != 5) {
            field_J = -98;
        }
        oj.a(12, 3);
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (-99 == (param3 ^ -1)) {
            return ((qd) this).b(param1, 0);
        }
        if (param3 != 99) {
            return false;
        }
        return ((qd) this).a(param1, (byte) 12);
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
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
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        String[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        String[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        String[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        String stackIn_33_2 = null;
        String[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String stackIn_39_2 = null;
        String stackIn_86_0 = null;
        String stackIn_87_0 = null;
        String stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        String[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        String[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_38_2 = null;
        String[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String stackOut_37_2 = null;
        String[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        String[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        String stackOut_32_2 = null;
        String[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        String stackOut_31_2 = null;
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        String stackOut_85_0 = null;
        String stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        String stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        L0: {
          var10 = MinerDisturbance.field_ab;
          ti.field_M = param2;
          cg.field_C = true;
          if (0 == ti.field_M) {
            var3 = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, ta.field_a);
            var4 = 3 + var3;
            mf.field_m = new int[var4];
            ne.field_K = new String[var4];
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                wf.field_P = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    ne.field_K[-3 + var4] = "";
                    ne.field_K[var4 + -2] = ud.field_b;
                    mf.field_m[-2 + var4] = 0;
                    wf.field_P[0] = 4;
                    ne.field_K[-1 + var4] = ed.field_f;
                    mf.field_m[-1 + var4] = 1;
                    wf.field_P[1] = 5;
                    break L0;
                  } else {
                    ne.field_K[var5] = fd.field_J[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                mf.field_m[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (-2 == (ti.field_M ^ -1)) {
              var3 = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, ta.field_a);
              var4 = var3 + 2;
              ne.field_K = new String[var4];
              mf.field_m = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var5 >= var4) {
                  wf.field_P = new int[1];
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= var3) {
                      ne.field_K[var4 + -2] = "";
                      ne.field_K[var4 + -1] = ed.field_f;
                      mf.field_m[var4 - 1] = 0;
                      wf.field_P[0] = 5;
                      break L0;
                    } else {
                      ne.field_K[var5] = fd.field_J[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  mf.field_m[var5] = -1;
                  var5++;
                  continue L3;
                }
              }
            } else {
              if ((ti.field_M ^ -1) != -3) {
                if ((ti.field_M ^ -1) != -4) {
                  if (ti.field_M == 4) {
                    var3 = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, ri.field_f);
                    var4 = var3 + 2;
                    mf.field_m = new int[var4];
                    ne.field_K = new String[var4];
                    var5 = 0;
                    L5: while (true) {
                      if (var5 >= var4) {
                        wf.field_P = new int[1];
                        var5 = 0;
                        L6: while (true) {
                          if (var5 >= var3) {
                            ne.field_K[-2 + var4] = "";
                            ne.field_K[var4 + -1] = ed.field_f;
                            mf.field_m[var4 - 1] = 0;
                            wf.field_P[0] = 5;
                            break L0;
                          } else {
                            ne.field_K[var5] = fd.field_J[var5];
                            var5++;
                            continue L6;
                          }
                        }
                      } else {
                        mf.field_m[var5] = -1;
                        var5++;
                        continue L5;
                      }
                    }
                  } else {
                    if ((ti.field_M ^ -1) != -6) {
                      throw new IllegalArgumentException();
                    } else {
                      var3 = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, cn.field_F);
                      var4 = 3 - -var3;
                      ne.field_K = new String[var4];
                      mf.field_m = new int[var4];
                      var5 = 0;
                      L7: while (true) {
                        if (var4 <= var5) {
                          wf.field_P = new int[2];
                          var5 = 0;
                          L8: while (true) {
                            if (var3 <= var5) {
                              ne.field_K[-3 + var4] = "";
                              ne.field_K[-2 + var4] = li.field_b;
                              mf.field_m[-2 + var4] = 0;
                              wf.field_P[0] = 3;
                              ne.field_K[-1 + var4] = ed.field_f;
                              mf.field_m[var4 - 1] = 1;
                              wf.field_P[1] = 5;
                              break L0;
                            } else {
                              ne.field_K[var5] = fd.field_J[var5];
                              var5++;
                              continue L8;
                            }
                          }
                        } else {
                          mf.field_m[var5] = -1;
                          var5++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  L9: {
                    if (qa.field_a.field_a) {
                      var3 = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, ub.field_b);
                      break L9;
                    } else {
                      var3 = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, pn.field_d);
                      break L9;
                    }
                  }
                  var4 = 2 - -var3;
                  mf.field_m = new int[var4];
                  ne.field_K = new String[var4];
                  var5 = 0;
                  L10: while (true) {
                    if (var4 <= var5) {
                      wf.field_P = new int[1];
                      var5 = 0;
                      L11: while (true) {
                        if (var3 <= var5) {
                          ne.field_K[-2 + var4] = "";
                          ne.field_K[var4 - 1] = ed.field_f;
                          mf.field_m[-1 + var4] = 0;
                          wf.field_P[0] = 5;
                          break L0;
                        } else {
                          ne.field_K[var5] = fd.field_J[var5];
                          var5++;
                          continue L11;
                        }
                      }
                    } else {
                      mf.field_m[var5] = -1;
                      var5++;
                      continue L10;
                    }
                  }
                }
              } else {
                var3 = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, oa.a((byte) -74, fb.field_h, new String[1]));
                var4 = -1;
                var5 = 0;
                L12: while (true) {
                  L13: {
                    if (var5 >= var3) {
                      break L13;
                    } else {
                      if ("<%0>".equals((Object) (Object) fd.field_J[var5])) {
                        var4 = var5;
                        break L13;
                      } else {
                        var5++;
                        continue L12;
                      }
                    }
                  }
                  if (-1 != var4) {
                    oe.field_g = new String[var4];
                    ai.a((Object[]) (Object) fd.field_J, 0, (Object[]) (Object) oe.field_g, 0, var4);
                    om.field_f = new String[-1 + (-var4 + var3)];
                    ai.a((Object[]) (Object) fd.field_J, 1 + var4, (Object[]) (Object) om.field_f, 0, var3 - var4 - 1);
                    var4 = -1;
                    var3 = jc.a((byte) 106, gh.field_b, fd.field_J, w.field_S, oa.a((byte) -127, ff.field_e, new String[1]));
                    var5 = 0;
                    L14: while (true) {
                      L15: {
                        if (var3 <= var5) {
                          break L15;
                        } else {
                          if (!"<%0>".equals((Object) (Object) fd.field_J[var5])) {
                            var5++;
                            continue L14;
                          } else {
                            var4 = var5;
                            break L15;
                          }
                        }
                      }
                      if (0 == (var4 ^ -1)) {
                        throw new IllegalStateException();
                      } else {
                        L16: {
                          ce.field_c = new String[var4];
                          ai.a((Object[]) (Object) fd.field_J, 0, (Object[]) (Object) ce.field_c, 0, var4);
                          ik.field_N = new String[-1 + (var3 - var4)];
                          ai.a((Object[]) (Object) fd.field_J, 1 + var4, (Object[]) (Object) ik.field_N, 0, -1 + -var4 + var3);
                          if (ce.field_c.length <= oe.field_g.length) {
                            stackOut_21_0 = oe.field_g.length;
                            stackIn_22_0 = stackOut_21_0;
                            break L16;
                          } else {
                            stackOut_20_0 = ce.field_c.length;
                            stackIn_22_0 = stackOut_20_0;
                            break L16;
                          }
                        }
                        L17: {
                          var5 = stackIn_22_0;
                          if (om.field_f.length >= ik.field_N.length) {
                            stackOut_24_0 = om.field_f.length;
                            stackIn_25_0 = stackOut_24_0;
                            break L17;
                          } else {
                            stackOut_23_0 = ik.field_N.length;
                            stackIn_25_0 = stackOut_23_0;
                            break L17;
                          }
                        }
                        var6 = stackIn_25_0;
                        var7 = var6 + (var5 + 7);
                        ne.field_K = new String[var7];
                        mf.field_m = new int[var7];
                        var8 = 0;
                        L18: while (true) {
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
                            L19: while (true) {
                              if (var5 <= var8) {
                                ne.field_K[6 - -var5] = null;
                                mf.field_m[var5 + 6] = -2;
                                var8 = 0;
                                L20: while (true) {
                                  if (var8 >= var6) {
                                    tl.field_o = sf.a((byte) -24);
                                    break L0;
                                  } else {
                                    L21: {
                                      stackOut_36_0 = ne.field_K;
                                      stackOut_36_1 = 7 + (var5 + var8);
                                      stackIn_38_0 = stackOut_36_0;
                                      stackIn_38_1 = stackOut_36_1;
                                      stackIn_37_0 = stackOut_36_0;
                                      stackIn_37_1 = stackOut_36_1;
                                      if (var8 >= ik.field_N.length) {
                                        stackOut_38_0 = (String[]) (Object) stackIn_38_0;
                                        stackOut_38_1 = stackIn_38_1;
                                        stackOut_38_2 = "";
                                        stackIn_39_0 = stackOut_38_0;
                                        stackIn_39_1 = stackOut_38_1;
                                        stackIn_39_2 = stackOut_38_2;
                                        break L21;
                                      } else {
                                        stackOut_37_0 = (String[]) (Object) stackIn_37_0;
                                        stackOut_37_1 = stackIn_37_1;
                                        stackOut_37_2 = ik.field_N[var8];
                                        stackIn_39_0 = stackOut_37_0;
                                        stackIn_39_1 = stackOut_37_1;
                                        stackIn_39_2 = stackOut_37_2;
                                        break L21;
                                      }
                                    }
                                    stackIn_39_0[stackIn_39_1] = stackIn_39_2;
                                    var8++;
                                    continue L20;
                                  }
                                }
                              } else {
                                L22: {
                                  stackOut_30_0 = ne.field_K;
                                  stackOut_30_1 = 6 + var8;
                                  stackIn_32_0 = stackOut_30_0;
                                  stackIn_32_1 = stackOut_30_1;
                                  stackIn_31_0 = stackOut_30_0;
                                  stackIn_31_1 = stackOut_30_1;
                                  if (-1 >= (var8 - -ce.field_c.length + -var5 ^ -1)) {
                                    stackOut_32_0 = (String[]) (Object) stackIn_32_0;
                                    stackOut_32_1 = stackIn_32_1;
                                    stackOut_32_2 = ce.field_c[-var5 + ce.field_c.length + var8];
                                    stackIn_33_0 = stackOut_32_0;
                                    stackIn_33_1 = stackOut_32_1;
                                    stackIn_33_2 = stackOut_32_2;
                                    break L22;
                                  } else {
                                    stackOut_31_0 = (String[]) (Object) stackIn_31_0;
                                    stackOut_31_1 = stackIn_31_1;
                                    stackOut_31_2 = "";
                                    stackIn_33_0 = stackOut_31_0;
                                    stackIn_33_1 = stackOut_31_1;
                                    stackIn_33_2 = stackOut_31_2;
                                    break L22;
                                  }
                                }
                                stackIn_33_0[stackIn_33_1] = stackIn_33_2;
                                var8++;
                                continue L19;
                              }
                            }
                          } else {
                            mf.field_m[var8] = -1;
                            var8++;
                            continue L18;
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
        var3 = 0;
        var4 = 0;
        L23: while (true) {
          if (ne.field_K.length <= var4) {
            L24: {
              if ((ti.field_M ^ -1) == -3) {
                var11 = oe.field_g;
                var5 = 0;
                L25: while (true) {
                  if (var5 >= var11.length) {
                    var12 = om.field_f;
                    var5 = 0;
                    L26: while (true) {
                      if (var12.length <= var5) {
                        break L24;
                      } else {
                        var14 = var12[var5];
                        var7 = hl.a(var14, false, -15388);
                        if (var7 > var3) {
                          var3 = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    var13 = var11[var5];
                    var7 = hl.a(var13, false, -15388);
                    if (var7 > var3) {
                      var3 = var7;
                      var5++;
                      continue L25;
                    } else {
                      var5++;
                      continue L25;
                    }
                  }
                }
              } else {
                break L24;
              }
            }
            si.field_d = -(var3 >> -1619714175) + (rj.field_e + var3);
            hn.field_b = pn.field_a.field_i * (sn.field_d - -hi.field_z << 340041025);
            cg.field_o = -(var3 >> -1669044063) + rj.field_e;
            var4 = 0;
            L27: while (true) {
              if (var4 >= ne.field_K.length) {
                var4 = 86 % ((72 - param0) / 52);
                lj.field_p = aa.field_d + -(hn.field_b >> 1855427745);
                ed.field_a = new int[ne.field_K.length][];
                var5 = 0;
                var6 = lj.field_p;
                L28: while (true) {
                  if (ne.field_K.length <= var5) {
                    L29: {
                      if ((ti.field_M ^ -1) == -3) {
                        pn.field_a.a(0, -1, -1, param1);
                        break L29;
                      } else {
                        pn.field_a.a(0, 0, sj.a(nk.field_w, (byte) 126, gb.field_e), param1);
                        break L29;
                      }
                    }
                    return;
                  } else {
                    var7 = mf.field_m[var5];
                    if (0 > var7) {
                      var6 = var6 + vd.field_z;
                      var5++;
                      continue L28;
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
                      var5++;
                      continue L28;
                    }
                  }
                }
              } else {
                L30: {
                  stackOut_105_0 = hn.field_b;
                  stackIn_107_0 = stackOut_105_0;
                  stackIn_106_0 = stackOut_105_0;
                  if (0 <= mf.field_m[var4]) {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = nk.field_u;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    break L30;
                  } else {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = vd.field_z;
                    stackIn_108_0 = stackOut_106_0;
                    stackIn_108_1 = stackOut_106_1;
                    break L30;
                  }
                }
                hn.field_b = stackIn_108_0 + stackIn_108_1;
                var4++;
                continue L27;
              }
            }
          } else {
            L31: {
              stackOut_85_0 = ne.field_K[var4];
              stackIn_87_0 = stackOut_85_0;
              stackIn_86_0 = stackOut_85_0;
              if (mf.field_m[var4] < 0) {
                stackOut_87_0 = (String) (Object) stackIn_87_0;
                stackOut_87_1 = 0;
                stackIn_88_0 = stackOut_87_0;
                stackIn_88_1 = stackOut_87_1;
                break L31;
              } else {
                stackOut_86_0 = (String) (Object) stackIn_86_0;
                stackOut_86_1 = 1;
                stackIn_88_0 = stackOut_86_0;
                stackIn_88_1 = stackOut_86_1;
                break L31;
              }
            }
            var5 = hl.a(stackIn_88_0, stackIn_88_1 != 0, -15388);
            if (var5 > var3) {
              var3 = var5;
              var4++;
              continue L23;
            } else {
              var4++;
              continue L23;
            }
          }
        }
    }

    final static void a(int param0, byte param1, sl param2) {
        tc.field_v.a((byte) -87, (pi) (Object) param2);
        if (param1 >= -18) {
            field_J = -12;
        }
        fg.a((byte) 5, param2, param0);
    }

    final static void a(int param0, byte param1) {
        int var3 = MinerDisturbance.field_ab;
        sl var4 = (sl) (Object) tc.field_v.b(112);
        while (var4 != null) {
            fg.a((byte) 5, var4, param0);
            var4 = (sl) (Object) tc.field_v.b((byte) 56);
        }
        if (param1 >= -81) {
            qd.a(false);
        }
        pi var2 = on.field_v.b(99);
        while (var2 != null) {
            tc.a(1, param0);
            var2 = on.field_v.b((byte) 56);
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
        ff.field_e = oa.a((byte) -81, ff.field_e, new String[1]);
        fb.field_h = oa.a((byte) -72, fb.field_h, new String[1]);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new boolean[112];
        field_P = -1;
        field_J = 0;
        field_R = 0;
    }
}
