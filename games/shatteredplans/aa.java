/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends f implements op, bp, dl {
    private fa field_J;
    private fa field_Q;
    private lk field_K;
    private kg field_E;
    static String field_N;
    private kg field_O;
    static String field_G;
    private fa field_H;
    static String field_P;
    private fa field_L;
    private fa field_M;
    private ts field_I;
    bj field_D;
    private fa field_F;

    public final void a(int param0, int param1, int param2, ts param3) {
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != 0) {
          if ((param1 ^ -1) == -2) {
            gm.a(111, "privacy.ws");
            if (param2 != 2) {
              ((aa) this).field_F = null;
              return;
            } else {
              return;
            }
          } else {
            if (param1 != 2) {
              if (param2 != 2) {
                ((aa) this).field_F = null;
                return;
              } else {
                return;
              }
            } else {
              gm.a(62, "conduct.ws");
              if (param2 == 2) {
                return;
              } else {
                ((aa) this).field_F = null;
                return;
              }
            }
          }
        } else {
          gm.a(64, "terms.ws");
          if (param2 == 2) {
            return;
          } else {
            ((aa) this).field_F = null;
            return;
          }
        }
    }

    final static void a(String param0, boolean param1) {
        if (!param1) {
            Object var3 = null;
            aa.a((String) null, false);
        }
    }

    private final String k(int param0) {
        if (param0 != 15) {
            Object var3 = null;
            ((aa) this).a(102, -126, 94, (ts) null);
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final int a(int param0, int param1, int param2, vg param3, String param4, String param5, int param6) {
        if (param0 < 126) {
            Object var10 = null;
            int discarded$0 = this.a(-107, 92, -35, (vg) null, (String) null, (String) null, 123);
        }
        pg var11 = new pg(20, param2, 120 - -param1, 25, param3, false, 120, 3, gn.field_u, 16777215, param5);
        ((aa) this).b((byte) -120, (vg) (Object) var11);
        ah var9 = new ah(((ki) (Object) param3).a((byte) 96), param4, 126, param2 - -var11.field_n, 50 + param1, param6);
        var9.field_u = (ko) this;
        ((aa) this).b((byte) -52, (vg) (Object) var9);
        return var9.field_n + var11.field_n;
    }

    private final boolean a(boolean param0, ki param1) {
        gk var3 = null;
        u var4 = null;
        var3 = param1.a((byte) 103);
        if (var3 != null) {
          var4 = var3.c(-123);
          if (!param0) {
            if (tj.field_b != var4) {
              if (var4 != pd.field_h) {
                if (un.field_i == var4) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            field_P = null;
            if (tj.field_b != var4) {
              if (var4 != pd.field_h) {
                if (un.field_i == var4) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final int a(String param0, int param1, vg param2, int param3, int param4) {
        pg var6 = null;
        var6 = new pg(20, param3, 120 + param4, 25, param2, false, 120, 3, gn.field_u, 16777215, param0);
        if (param1 != 21760) {
          int discarded$2 = aa.a(-24, (byte) 20);
          ((aa) this).b((byte) -126, (vg) (Object) var6);
          return var6.field_n;
        } else {
          ((aa) this).b((byte) -126, (vg) (Object) var6);
          return var6.field_n;
        }
    }

    public final void a(int param0, String param1) {
        fa var3 = null;
        String var4 = null;
        Object var5 = null;
        var3 = ((aa) this).field_Q;
        var4 = param1;
        ((go) (Object) var3).a(57, var4, false);
        if (param0 != 15270) {
          var5 = null;
          int discarded$2 = this.a(-31, (String) null, 115, (byte) 34, (vg) null, (String) null);
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_G = null;
        field_N = null;
        if (param0 != 32) {
            aa.a((byte) 69);
            field_P = null;
            return;
        }
        field_P = null;
    }

    public aa() {
        super(0, 0, 496, 0, (iq) null);
        ((aa) this).field_Q = new fa("", (ko) null, 12);
        ((aa) this).field_F = new fa("", (ko) null, 100);
        ((aa) this).field_M = new fa("", (ko) null, 100);
        ((aa) this).field_J = new fa("", (ko) null, 20);
        ((aa) this).field_H = new fa("", (ko) null, 20);
        ((aa) this).field_L = new fa("", (ko) null, 3);
        int var1 = 1;
        ((aa) this).field_K = new lk("", (ko) null, var1 != 0);
        ((aa) this).field_E = new kg(qn.field_e, (ko) null);
        ((aa) this).field_O = new kg(rn.field_a, (ko) null);
        ((aa) this).field_Q.field_v = ol.field_i;
        ((aa) this).field_F.field_v = j.field_p;
        ((aa) this).field_M.field_v = sf.field_h;
        ((aa) this).field_J.field_v = wf.field_k;
        ((aa) this).field_H.field_v = he.field_o;
        ((aa) this).field_L.field_v = pc.field_p;
        ((aa) this).field_K.field_v = ca.field_i;
        ((aa) this).field_Q.a((gk) (Object) new ec((go) (Object) ((aa) this).field_Q), 8945);
        ((aa) this).field_F.a((gk) (Object) new mm((go) (Object) ((aa) this).field_F), 8945);
        ((aa) this).field_M.a((gk) (Object) new mf((go) (Object) ((aa) this).field_M, (go) (Object) ((aa) this).field_F), 8945);
        ((aa) this).field_J.a((gk) (Object) new cc((go) (Object) ((aa) this).field_J, (go) (Object) ((aa) this).field_Q, (go) (Object) ((aa) this).field_F), 8945);
        ((aa) this).field_H.a((gk) (Object) new fj((go) (Object) ((aa) this).field_H, (go) (Object) ((aa) this).field_J), 8945);
        ((aa) this).field_L.a((gk) (Object) new mb((go) (Object) ((aa) this).field_L), 8945);
        ((aa) this).field_E.field_y = false;
        ((aa) this).field_E.field_p = (iq) (Object) new qp();
        ((aa) this).field_O.field_p = (iq) (Object) new rq();
        ((aa) this).field_Q.field_p = (iq) (Object) new rr(10000536);
        ((aa) this).field_M.field_p = (iq) (Object) new rr(10000536);
        ((aa) this).field_F.field_p = (iq) (Object) new rr(10000536);
        ((aa) this).field_L.field_p = (iq) (Object) new rr(10000536);
        ((aa) this).field_K.field_p = (iq) (Object) new og();
        ((aa) this).field_H.field_p = (iq) (Object) new ce(10000536);
        ((aa) this).field_J.field_p = (iq) (Object) new ce(10000536);
        String var2 = re.a(bo.field_Y, 4371, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a(on.field_i, 21760, (vg) (Object) ((aa) this).field_F, var3, 170);
        var3 = var3 + (5 + this.a(127, 170, var3, (vg) (Object) ((aa) this).field_M, "", ec.field_u, 20));
        var3 = var3 + this.a(co.field_t, 21760, (vg) (Object) ((aa) this).field_J, var3, 170);
        var3 = var3 + (5 + this.a(170, ab.field_a, var3, (byte) -127, (vg) (Object) ((aa) this).field_H, qq.field_l));
        var3 = var3 + (this.a(170, rf.field_m, var3, (byte) -128, (vg) (Object) ((aa) this).field_Q, tr.field_zb) - -5);
        var3 = var3 + this.a(vl.field_m, (vg) (Object) ((aa) this).field_L, var3, (byte) -123, 170);
        pg var4 = new pg(46, var3, -90 + ((aa) this).field_x, 25, (vg) (Object) ((aa) this).field_K, true, -120 + ((aa) this).field_x, 5, mf.field_x, 11579568, fe.field_E);
        ((aa) this).b((byte) -71, (vg) (Object) var4);
        var3 = var3 + var4.field_n;
        o var5 = new o(gn.field_u, 0, 0, 0, 0, 16777215, -1, 0, 0, gn.field_u.field_J, -1, 2147483647, true);
        ((aa) this).field_I = new ts(var2, (iq) (Object) var5);
        ((aa) this).field_I.field_v = "";
        ((aa) this).field_I.a(0, true, bk.field_c);
        ((aa) this).field_I.a(1, true, bk.field_c);
        ((aa) this).field_I.field_u = (ko) this;
        ((aa) this).field_I.a(46, var3, (byte) 57, -90 + ((aa) this).field_x);
        var3 = var3 + (15 + ((aa) this).field_I.field_n);
        ((aa) this).b((byte) -66, (vg) (Object) ((aa) this).field_I);
        int var6 = 4;
        int var7 = 200;
        ((aa) this).field_E.a(var3, 40, (byte) 102, 496 + -var7 >> -1506995551, var7);
        ((aa) this).field_O.a(15 + var3, 40, (byte) 100, var6 + 3, 60);
        ((aa) this).field_O.field_u = (ko) this;
        ((aa) this).field_E.field_u = (ko) this;
        ((aa) this).b((byte) -115, (vg) (Object) ((aa) this).field_E);
        ((aa) this).b((byte) -119, (vg) (Object) ((aa) this).field_O);
        ((aa) this).field_D = new bj((dl) this);
        ((aa) this).field_D.a(((aa) this).field_Q.field_q + 20, 150, (byte) 115, 60 + (((aa) this).field_Q.field_m + ((aa) this).field_Q.field_x), -60 + (-((aa) this).field_Q.field_m + ((aa) this).field_x) + -((aa) this).field_Q.field_x);
        ((aa) this).b((byte) -120, (vg) (Object) ((aa) this).field_D);
        ((aa) this).a(0, var3 + 55 + var6, (byte) 122, 0, 496);
    }

    private final int a(int param0, String param1, int param2, byte param3, vg param4, String param5) {
        if (param3 >= -126) {
            return -57;
        }
        return this.a(127, param0, param2, param4, param1, param5, 35);
    }

    private final boolean d(boolean param0) {
        if (!(this.m(72))) {
            return false;
        }
        int var2 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            if (param0) {
                ((aa) this).a(-121);
            }
            var2 = Integer.parseInt(((aa) this).field_L.field_s);
        } catch (NumberFormatException numberFormatException) {
        }
        return cg.a(((aa) this).field_F.field_s, ((aa) this).field_K.field_z, ((aa) this).field_Q.field_s, var2, ((aa) this).field_J.field_s, (aa) this, -13037);
    }

    public final void a(int param0) {
        ((ec) (Object) ((aa) this).field_Q.a((byte) 117)).d(0);
        if (param0 != 2147483647) {
            field_P = null;
        }
    }

    final void a(int param0, int param1, vg param2, byte param3) {
        super.a(param0, param1, param2, param3);
        ((aa) this).field_E.field_y = this.m(param3 + -46);
    }

    final static int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = 1 + rs.field_Cb.field_J * 3 / 4;
        var4 = -60 + qg.field_r[6];
        var5 = 40;
        if (0 != param0) {
          if (-2 != (param0 ^ -1)) {
            if (-3 == (param0 ^ -1)) {
              var6 = wk.a(param1 ^ 9672, wg.field_e.a(5607, jd.field_a), (nq) (Object) rs.field_Cb, new int[1]);
              var5 = var5 + var3 * var6;
              if (param1 == -71) {
                L0: {
                  if (var5 > 294) {
                    stackOut_74_0 = var5;
                    stackIn_75_0 = stackOut_74_0;
                    break L0;
                  } else {
                    stackOut_73_0 = 294;
                    stackIn_75_0 = stackOut_73_0;
                    break L0;
                  }
                }
                return stackIn_75_0;
              } else {
                return -98;
              }
            } else {
              if (param0 != 3) {
                if (param0 != -5) {
                  if (-6 != param0) {
                    if ((param0 ^ -1) == -7) {
                      var16 = da.field_a;
                      var6 = wk.a(-9615, wg.field_e.a(5607, var16), (nq) (Object) rs.field_Cb, new int[1]);
                      var17 = er.field_l;
                      var5 = var5 + (var3 * (3 + 4 * var6) >> -272727742);
                      var6 = wk.a(param1 ^ 9672, wg.field_e.a(param1 ^ -5538, var17), (nq) (Object) rs.field_Cb, new int[1]);
                      var18 = fr.field_F;
                      var5 = var5 + ((var6 * 4 + 3) * var3 >> 1680314754);
                      var6 = wk.a(-9615, wg.field_e.a(5607, var18), (nq) (Object) rs.field_Cb, new int[1]);
                      var19 = ub.field_Cb;
                      var5 = var5 + ((4 * var6 - -3) * var3 >> 2025528866);
                      var6 = wk.a(-9615, wg.field_e.a(5607, var19), (nq) (Object) rs.field_Cb, new int[1]);
                      var5 = var5 + var6 * var3;
                      if (param1 == -71) {
                        L1: {
                          if (var5 > 294) {
                            stackOut_67_0 = var5;
                            stackIn_68_0 = stackOut_67_0;
                            break L1;
                          } else {
                            stackOut_66_0 = 294;
                            stackIn_68_0 = stackOut_66_0;
                            break L1;
                          }
                        }
                        return stackIn_68_0;
                      } else {
                        return -98;
                      }
                    } else {
                      if ((param0 ^ -1) == -8) {
                        var15 = jl.field_N;
                        var6 = wk.a(-9615, wg.field_e.a(5607, var15), (nq) (Object) rs.field_Cb, new int[1]);
                        var5 = 294;
                        var5 = var5 + var3 * (-3 + var6);
                        if (param1 == -71) {
                          L2: {
                            if (var5 > 294) {
                              stackOut_60_0 = var5;
                              stackIn_61_0 = stackOut_60_0;
                              break L2;
                            } else {
                              stackOut_59_0 = 294;
                              stackIn_61_0 = stackOut_59_0;
                              break L2;
                            }
                          }
                          return stackIn_61_0;
                        } else {
                          return -98;
                        }
                      } else {
                        if (8 == param0) {
                          var11 = hs.field_g;
                          var6 = wk.a(-9615, wg.field_e.a(5607, var11), (nq) (Object) rs.field_Cb, new int[1]);
                          var12 = sp.field_b;
                          var5 = var5 + ((3 + var6 * 4) * var3 >> 633685634);
                          var6 = wk.a(-9615, wg.field_e.a(5607, var12), (nq) (Object) rs.field_Cb, new int[1]);
                          var5 = var5 + ((4 * var6 + 3) * var3 >> -850385054);
                          var13 = jb.field_f;
                          var6 = wk.a(-9615, wg.field_e.a(5607, var13), (nq) (Object) rs.field_Cb, new int[1]);
                          var14 = ar.field_o;
                          var5 = var5 + ((4 * var6 - -3) * var3 >> 1130130786);
                          var6 = wk.a(param1 ^ 9672, wg.field_e.a(5607, var14), (nq) (Object) rs.field_Cb, new int[1]);
                          var5 = var5 + var6 * var3;
                          var5 = var5 + var3;
                          if (param1 != -71) {
                            return -98;
                          } else {
                            L3: {
                              if (var5 > 294) {
                                stackOut_52_0 = var5;
                                stackIn_53_0 = stackOut_52_0;
                                break L3;
                              } else {
                                stackOut_51_0 = 294;
                                stackIn_53_0 = stackOut_51_0;
                                break L3;
                              }
                            }
                            return stackIn_53_0;
                          }
                        } else {
                          if (param0 == 9) {
                            var6 = wk.a(-9615, wg.field_e.a(5607, dm.field_a), (nq) (Object) rs.field_Cb, new int[1]);
                            var5 = var5 + var3 * var6;
                            if (param1 != -71) {
                              return -98;
                            } else {
                              L4: {
                                if (var5 > 294) {
                                  stackOut_45_0 = var5;
                                  stackIn_46_0 = stackOut_45_0;
                                  break L4;
                                } else {
                                  stackOut_44_0 = 294;
                                  stackIn_46_0 = stackOut_44_0;
                                  break L4;
                                }
                              }
                              return stackIn_46_0;
                            }
                          } else {
                            if (param0 == 10) {
                              var6 = wk.a(param1 + -9544, wg.field_e.a(5607, df.field_m), (nq) (Object) rs.field_Cb, new int[1]);
                              var5 = var5 + var6 * var3;
                              if (param1 != -71) {
                                return -98;
                              } else {
                                L5: {
                                  if (var5 > 294) {
                                    stackOut_38_0 = var5;
                                    stackIn_39_0 = stackOut_38_0;
                                    break L5;
                                  } else {
                                    stackOut_37_0 = 294;
                                    stackIn_39_0 = stackOut_37_0;
                                    break L5;
                                  }
                                }
                                return stackIn_39_0;
                              }
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var8 = er.field_n;
                    var6 = wk.a(-9615, wg.field_e.a(5607, var8), (nq) (Object) rs.field_Cb, new int[1]);
                    var5 = var5 + (var3 * (3 + 4 * var6) >> -1296180670);
                    var9 = ri.field_N;
                    var6 = wk.a(-9615, wg.field_e.a(5607, var9), (nq) (Object) rs.field_Cb, new int[1]);
                    var10 = rk.field_n;
                    var5 = var5 + ((var6 * 4 + 3) * var3 >> -1402017310);
                    var6 = wk.a(-9615, wg.field_e.a(5607, var10), (nq) (Object) rs.field_Cb, new int[1]);
                    var5 = var5 + var6 * var3;
                    if (param1 != -71) {
                      return -98;
                    } else {
                      L6: {
                        if (var5 > 294) {
                          stackOut_25_0 = var5;
                          stackIn_26_0 = stackOut_25_0;
                          break L6;
                        } else {
                          stackOut_24_0 = 294;
                          stackIn_26_0 = stackOut_24_0;
                          break L6;
                        }
                      }
                      return stackIn_26_0;
                    }
                  }
                } else {
                  return 294;
                }
              } else {
                return 294;
              }
            }
          } else {
            var6 = wk.a(-9615, wg.field_e.a(5607, ck.field_g), (nq) (Object) rs.field_Cb, new int[1]);
            var5 = var5 + var3 * var6;
            if (param1 != -71) {
              return -98;
            } else {
              L7: {
                if (var5 > 294) {
                  stackOut_12_0 = var5;
                  stackIn_13_0 = stackOut_12_0;
                  break L7;
                } else {
                  stackOut_11_0 = 294;
                  stackIn_13_0 = stackOut_11_0;
                  break L7;
                }
              }
              return stackIn_13_0;
            }
          }
        } else {
          var6 = wk.a(-9615, wg.field_e.a(5607, vc.field_e), (nq) (Object) rs.field_Cb, new int[1]);
          var5 = var5 + var6 * var3;
          if (param1 != -71) {
            return -98;
          } else {
            L8: {
              if (var5 > 294) {
                stackOut_4_0 = var5;
                stackIn_5_0 = stackOut_4_0;
                break L8;
              } else {
                stackOut_3_0 = 294;
                stackIn_5_0 = stackOut_3_0;
                break L8;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        if (!(!super.a(param0, param1, param2 ^ 0, param3))) {
            return true;
        }
        if (98 == param0) {
            return ((aa) this).a(param3, true);
        }
        if (param2 != 13) {
            int discarded$4 = aa.a(104, (byte) -32);
            if ((param0 ^ -1) == -100) {
                return ((aa) this).a(param3, -96);
            }
            return false;
        }
        if (!((param0 ^ -1) != -100)) {
            return ((aa) this).a(param3, -96);
        }
        return false;
    }

    private final int a(String param0, vg param1, int param2, byte param3, int param4) {
        pg var9 = new pg(20, param2, 120 + param4, 25, param1, false, 120, 3, gn.field_u, 16777215, param0);
        ((aa) this).b((byte) -51, (vg) (Object) var9);
        hl var7 = new hl(((ki) (Object) param1).a((byte) 106));
        int var8 = -33 / ((param3 - -88) / 35);
        ((aa) this).b((byte) -116, (vg) (Object) var7);
        var7.a(var9.field_q - -(-15 + var9.field_n >> -1392232735), 15, (byte) 118, var9.field_x + (var9.field_m - -3), 15);
        return var9.field_n;
    }

    private final String l(int param0) {
        int var2 = -86 / ((param0 - 5) / 48);
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean m(int param0) {
        int var2 = 0;
        var2 = -75 / ((-28 - param0) / 57);
        if (this.a(false, (ki) (Object) ((aa) this).field_Q)) {
          if (this.a(false, (ki) (Object) ((aa) this).field_F)) {
            if (this.a(false, (ki) (Object) ((aa) this).field_M)) {
              if (this.a(false, (ki) (Object) ((aa) this).field_J)) {
                if (this.a(false, (ki) (Object) ((aa) this).field_H)) {
                  if (!this.a(false, (ki) (Object) ((aa) this).field_L)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        if (((aa) this).field_O == param0) {
          ol.b((byte) -120);
          if (param1 == 6) {
            return;
          } else {
            ((aa) this).field_M = null;
            return;
          }
        } else {
          if (param0 != ((aa) this).field_E) {
            if (param1 != 6) {
              ((aa) this).field_M = null;
              return;
            } else {
              return;
            }
          } else {
            boolean discarded$3 = this.d(false);
            if (param1 == 6) {
              return;
            } else {
              ((aa) this).field_M = null;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_P = "These are momentous times. Your colony is preparing to return to space once more. The now-perfected wormhole technology has revealed an array of possibilities and mighty starships shall once again seek destiny in the heavens.";
    }
}
