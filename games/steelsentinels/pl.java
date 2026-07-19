/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends ch implements ae {
    static u field_U;
    static String field_W;
    static volatile long field_Y;
    static cm field_S;
    static String field_V;
    private oa field_R;
    private re field_Z;
    static wk[] field_T;
    static mi field_X;
    static String field_Q;
    static int[][] field_ab;

    final static String a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        var2 = param1;
        if ((var2 ^ -1) != -90) {
          if (-67 != (var2 ^ -1)) {
            if (var2 == 76) {
              return jd.field_nb[2];
            } else {
              var2 = -44 / ((param0 - -9) / 59);
              return null;
            }
          } else {
            return jd.field_nb[1];
          }
        } else {
          return jd.field_nb[0];
        }
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        if (this.field_Z.a(false).a((byte) 21) != vf.field_b) {
            return;
        }
        try {
            ue.a(this.field_Z.j(-97), this.field_Z.h((byte) 18), this.field_Z.k(14879), true);
            int var6_int = 10 / ((param1 - -85) / 36);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "pl.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static java.awt.Container g(int param0) {
        if (!(vd.field_c == null)) {
            return (java.awt.Container) ((Object) vd.field_c);
        }
        int var1 = -117 / ((13 - param0) / 50);
        return (java.awt.Container) ((Object) wl.d((byte) -21));
    }

    public static void c(boolean param0) {
        java.awt.Container discarded$0 = null;
        field_X = null;
        field_ab = (int[][]) null;
        field_V = null;
        field_Q = null;
        field_W = null;
        if (!param0) {
            discarded$0 = pl.g(-79);
        }
        field_T = null;
        field_S = null;
        field_U = null;
    }

    final static void a(boolean param0, boolean param1, int param2, byte param3) {
        RuntimeException var4 = null;
        gh var5 = null;
        gh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        gh var15 = null;
        String var16 = null;
        gh var17 = null;
        int stackIn_11_0 = 0;
        gh stackIn_24_0 = null;
        gh stackIn_25_0 = null;
        gh stackIn_26_0 = null;
        String stackIn_26_1 = null;
        gh stackIn_27_0 = null;
        gh stackIn_28_0 = null;
        gh stackIn_29_0 = null;
        String stackIn_29_1 = null;
        String stackIn_57_0 = null;
        gh stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        gh stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        gh stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        gh stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        gh stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        gh stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        gh stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        gh stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        gh stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        gh stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        gh stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        gh stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        gh stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        gh stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        gh stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        String stackOut_56_0 = null;
        String stackOut_55_0 = null;
        gh stackOut_23_0 = null;
        gh stackOut_25_0 = null;
        String stackOut_25_1 = null;
        gh stackOut_24_0 = null;
        String stackOut_24_1 = null;
        gh stackOut_26_0 = null;
        gh stackOut_28_0 = null;
        String stackOut_28_1 = null;
        gh stackOut_27_0 = null;
        String stackOut_27_1 = null;
        gh stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        gh stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        gh stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        gh stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        gh stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        gh stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        gh stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        gh stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        gh stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        gh stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        gh stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        gh stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        gh stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        gh stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        gh stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              vb.a((byte) 103, bd.field_c);
              if (null != ni.field_a) {
                L2: {
                  L3: {
                    var15 = rn.field_C;
                    var17 = var15;
                    rn.field_C.field_Lb = 0;
                    var17.field_zb = 0;
                    var5 = fk.field_q;
                    fk.field_q.field_Lb = 0;
                    var5.field_zb = 0;
                    rh.field_w.field_Lb = 0;
                    var6 = rh.field_w;
                    var6.field_zb = 0;
                    nm.field_q.field_S = he.field_g.toUpperCase();
                    var7 = (gl.field_y.field_zb + 2) / 2;
                    rh.field_w.a(0, -40 + gl.field_y.field_Lb, 40, 0, -2 + var7);
                    fk.field_q.a(param3 + -66, -40 + gl.field_y.field_Lb, 40, var7, gl.field_y.field_zb + -var7);
                    if ((jg.field_l.length ^ -1) != -2) {
                      break L3;
                    } else {
                      if (-3 == (jg.field_l[0] ^ -1)) {
                        var8 = 0;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var8 = 0;
                  var9_int = 0;
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (var10 >= jg.field_l.length) {
                        break L5;
                      } else {
                        L6: {
                          if (-1 == (rb.field_i[var10 / 8] & 1 << (7 & var10) ^ -1)) {
                            stackOut_10_0 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            break L6;
                          } else {
                            stackOut_9_0 = 1;
                            stackIn_11_0 = stackOut_9_0;
                            break L6;
                          }
                        }
                        L7: {
                          var11_int = stackIn_11_0;
                          if (var11_int == 0) {
                            break L7;
                          } else {
                            var9_int++;
                            break L7;
                          }
                        }
                        L8: {
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if (-3 != (jg.field_l[var10] ^ -1)) {
                              var8 = 1;
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var10++;
                        continue L4;
                      }
                    }
                    if (-1 == (var9_int ^ -1)) {
                      var8 = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                fk.field_q.field_T = true;
                if (ad.field_f) {
                  L9: {
                    mn.field_E.field_T = false;
                    wl.field_J.field_S = oa.field_R;
                    if (var8 == 0) {
                      stackOut_56_0 = ah.field_fc;
                      stackIn_57_0 = stackOut_56_0;
                      break L9;
                    } else {
                      stackOut_55_0 = uj.field_b;
                      stackIn_57_0 = stackOut_55_0;
                      break L9;
                    }
                  }
                  L10: {
                    var16 = stackIn_57_0;
                    var9 = var16;
                    var9 = var16;
                    var9 = var16;
                    var10 = rh.field_w.field_L.c(var16) + 3 * rh.field_w.field_L.a('.');
                    if (-17 != (qa.field_H & 48 ^ -1)) {
                      break L10;
                    } else {
                      var9 = var16 + ".";
                      break L10;
                    }
                  }
                  L11: {
                    rh.field_w.field_Kb = 0;
                    rh.field_w.field_ub = (-var10 + rh.field_w.field_zb) / 2;
                    if (-33 != (qa.field_H & 48 ^ -1)) {
                      break L11;
                    } else {
                      var9 = var9 + "..";
                      break L11;
                    }
                  }
                  L12: {
                    if ((qa.field_H & 48) == 48) {
                      var9 = var9 + "...";
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  rh.field_w.field_S = var9;
                  fk.field_q.field_S = tj.field_b.toUpperCase();
                  break L1;
                } else {
                  L13: {
                    stackOut_23_0 = fk.field_q;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_24_0 = stackOut_23_0;
                    if (var8 != 0) {
                      stackOut_25_0 = (gh) ((Object) stackIn_25_0);
                      stackOut_25_1 = ha.field_P;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      break L13;
                    } else {
                      stackOut_24_0 = (gh) ((Object) stackIn_24_0);
                      stackOut_24_1 = lj.field_i;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      break L13;
                    }
                  }
                  L14: {
                    stackIn_26_0.field_S = ((String) (Object) stackIn_26_1).toUpperCase();
                    stackOut_26_0 = wl.field_J;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (var8 != 0) {
                      stackOut_28_0 = (gh) ((Object) stackIn_28_0);
                      stackOut_28_1 = vi.field_P;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      break L14;
                    } else {
                      stackOut_27_0 = (gh) ((Object) stackIn_27_0);
                      stackOut_27_1 = cm.field_c;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      break L14;
                    }
                  }
                  L15: {
                    stackIn_29_0.field_S = db.a(stackIn_29_1, -30, new String[]{fk.field_q.field_S});
                    mn.field_E.field_T = true;
                    rh.field_w.field_S = dm.field_h;
                    ng.field_k = true;
                    if (m.field_b != null) {
                      L16: {
                        ng.field_k = false;
                        gi.field_u = false;
                        if (null == dl.field_O) {
                          dl.field_O = new byte[be.field_a];
                          m.field_h = new boolean[be.field_a];
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      var13 = 0;
                      var9_int = var13;
                      L17: while (true) {
                        if (var13 >= be.field_a) {
                          lc.a(-1, -1, ni.field_a, be.field_a, -1, -97, 0, true);
                          if (2 > ul.field_d) {
                            break L15;
                          } else {
                            if (!fc.field_e[12]) {
                              break L15;
                            } else {
                              ng.field_k = true;
                              break L15;
                            }
                          }
                        } else {
                          m.field_h[var13] = false;
                          var13++;
                          continue L17;
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                  if (ng.field_k) {
                    break L1;
                  } else {
                    fk.field_q.field_T = false;
                    if (!fk.field_q.field_K) {
                      break L1;
                    } else {
                      L18: {
                        var9 = null;
                        if (gi.field_u) {
                          var9 = "<col=A00000>" + rb.field_d + "</col>";
                          var11 = var9;
                          var9 = var11;
                          var11 = var9;
                          var9 = var11;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      var10 = 0;
                      L19: while (true) {
                        if (be.field_a <= var10) {
                          ll.field_i = "<col=A00000>" + wi.field_G + "<br>" + ke.field_i + var9;
                          break L1;
                        } else {
                          L20: {
                            if (m.field_h[var10]) {
                              var11 = "<col=A00000>" + al.field_a[var10] + "</col>";
                              var9 = var11;
                              var9 = var11;
                              if (var9 == null) {
                                var9 = var11;
                                break L20;
                              } else {
                                var9 = var9 + ", " + var11;
                                break L20;
                              }
                            } else {
                              break L20;
                            }
                          }
                          var10++;
                          continue L19;
                        }
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L21: {
              if (param3 == 66) {
                break L21;
              } else {
                field_W = (String) null;
                break L21;
              }
            }
            L22: {
              L23: {
                stackOut_67_0 = ql.field_ec;
                stackOut_67_1 = -26;
                stackIn_71_0 = stackOut_67_0;
                stackIn_71_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (!param0) {
                  break L23;
                } else {
                  stackOut_68_0 = (gh) ((Object) stackIn_68_0);
                  stackOut_68_1 = stackIn_68_1;
                  stackIn_71_0 = stackOut_68_0;
                  stackIn_71_1 = stackOut_68_1;
                  stackIn_69_0 = stackOut_68_0;
                  stackIn_69_1 = stackOut_68_1;
                  if (param1) {
                    break L23;
                  } else {
                    stackOut_69_0 = (gh) ((Object) stackIn_69_0);
                    stackOut_69_1 = stackIn_69_1;
                    stackIn_71_0 = stackOut_69_0;
                    stackIn_71_1 = stackOut_69_1;
                    stackIn_70_0 = stackOut_69_0;
                    stackIn_70_1 = stackOut_69_1;
                    if (vb.field_c) {
                      break L23;
                    } else {
                      stackOut_70_0 = (gh) ((Object) stackIn_70_0);
                      stackOut_70_1 = stackIn_70_1;
                      stackOut_70_2 = 1;
                      stackIn_72_0 = stackOut_70_0;
                      stackIn_72_1 = stackOut_70_1;
                      stackIn_72_2 = stackOut_70_2;
                      break L22;
                    }
                  }
                }
              }
              stackOut_71_0 = (gh) ((Object) stackIn_71_0);
              stackOut_71_1 = stackIn_71_1;
              stackOut_71_2 = 0;
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L22;
            }
            L24: {
              L25: {
                ((gh) (Object) stackIn_72_0).a((byte) stackIn_72_1, stackIn_72_2 != 0);
                stackOut_72_0 = gl.field_y;
                stackOut_72_1 = -56;
                stackIn_76_0 = stackOut_72_0;
                stackIn_76_1 = stackOut_72_1;
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                if (!param0) {
                  break L25;
                } else {
                  stackOut_73_0 = (gh) ((Object) stackIn_73_0);
                  stackOut_73_1 = stackIn_73_1;
                  stackIn_76_0 = stackOut_73_0;
                  stackIn_76_1 = stackOut_73_1;
                  stackIn_74_0 = stackOut_73_0;
                  stackIn_74_1 = stackOut_73_1;
                  if (param1) {
                    break L25;
                  } else {
                    stackOut_74_0 = (gh) ((Object) stackIn_74_0);
                    stackOut_74_1 = stackIn_74_1;
                    stackIn_76_0 = stackOut_74_0;
                    stackIn_76_1 = stackOut_74_1;
                    stackIn_75_0 = stackOut_74_0;
                    stackIn_75_1 = stackOut_74_1;
                    if (vb.field_c) {
                      break L25;
                    } else {
                      stackOut_75_0 = (gh) ((Object) stackIn_75_0);
                      stackOut_75_1 = stackIn_75_1;
                      stackOut_75_2 = 1;
                      stackIn_77_0 = stackOut_75_0;
                      stackIn_77_1 = stackOut_75_1;
                      stackIn_77_2 = stackOut_75_2;
                      break L24;
                    }
                  }
                }
              }
              stackOut_76_0 = (gh) ((Object) stackIn_76_0);
              stackOut_76_1 = stackIn_76_1;
              stackOut_76_2 = 0;
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L24;
            }
            L26: {
              L27: {
                ((gh) (Object) stackIn_77_0).a((byte) stackIn_77_1, stackIn_77_2 != 0);
                stackOut_77_0 = fb.field_r;
                stackOut_77_1 = 120;
                stackIn_81_0 = stackOut_77_0;
                stackIn_81_1 = stackOut_77_1;
                stackIn_78_0 = stackOut_77_0;
                stackIn_78_1 = stackOut_77_1;
                if (!param0) {
                  break L27;
                } else {
                  stackOut_78_0 = (gh) ((Object) stackIn_78_0);
                  stackOut_78_1 = stackIn_78_1;
                  stackIn_81_0 = stackOut_78_0;
                  stackIn_81_1 = stackOut_78_1;
                  stackIn_79_0 = stackOut_78_0;
                  stackIn_79_1 = stackOut_78_1;
                  if (param1) {
                    break L27;
                  } else {
                    stackOut_79_0 = (gh) ((Object) stackIn_79_0);
                    stackOut_79_1 = stackIn_79_1;
                    stackIn_81_0 = stackOut_79_0;
                    stackIn_81_1 = stackOut_79_1;
                    stackIn_80_0 = stackOut_79_0;
                    stackIn_80_1 = stackOut_79_1;
                    if (!vb.field_c) {
                      break L27;
                    } else {
                      stackOut_80_0 = (gh) ((Object) stackIn_80_0);
                      stackOut_80_1 = stackIn_80_1;
                      stackOut_80_2 = 1;
                      stackIn_82_0 = stackOut_80_0;
                      stackIn_82_1 = stackOut_80_1;
                      stackIn_82_2 = stackOut_80_2;
                      break L26;
                    }
                  }
                }
              }
              stackOut_81_0 = (gh) ((Object) stackIn_81_0);
              stackOut_81_1 = stackIn_81_1;
              stackOut_81_2 = 0;
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L26;
            }
            L28: {
              ((gh) (Object) stackIn_82_0).a((byte) stackIn_82_1, stackIn_82_2 != 0);
              fg.field_Tb.field_d.j(param3 ^ 10066);
              if (ni.field_a != null) {
                L29: {
                  if (mn.field_E.field_Eb != 0) {
                    nm.a(param2, (byte) -80);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (0 != fk.field_q.field_Eb) {
                    if (!ad.field_f) {
                      b.a(-107, param2);
                      break L30;
                    } else {
                      ml.a((byte) 12, param2);
                      break L30;
                    }
                  } else {
                    break L30;
                  }
                }
                cb.a(ni.field_a, (byte) -127, param2, true);
                break L28;
              } else {
                break L28;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "pl.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    pl(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (qk) null);
        this.field_Z = new re(new ag(10000536), kj.field_B, 0, 0, 140, 25);
        this.field_Z.a((byte) -26, new vn());
        this.field_R = new oa(ah.field_Sb, (tn) (this));
        this.field_J = new lh[]{(lh) ((Object) this.field_Z), (lh) ((Object) this.field_R)};
        this.field_R.field_p = (qk) ((Object) new kh());
        this.e((byte) 50);
    }

    final static gh d(boolean param0) {
        if (!param0) {
            field_Q = (String) null;
        }
        return gl.field_t.field_Ub;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -102, param2, param3);
        if (param1 > -99) {
            return;
        }
        rc.field_m.b(wh.field_j, this.field_o + param2 + 4, rc.field_m.field_G + param0 - (-this.field_z - 4), 16777215, -1);
    }

    final void a(int param0, int param1, lh param2, int param3) {
        super.a(param0, 124, param2, param3);
        if (param1 < 56) {
            return;
        }
        try {
            this.field_R.field_K = this.field_Z.a(false).a((byte) 21) == vf.field_b ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "pl.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void f(int param0) {
        int var2 = 250;
        this.field_Z.a(this.field_x - var2 >> -569108543, (byte) -105, -25 + (20 + this.field_E) >> -95360703, param0, 25);
        this.field_R.a(150 + (-var2 + this.field_x >> -1968380479), (byte) -105, (-10 + this.field_E >> 1100283905) - -2, 100, 30);
    }

    static {
        field_V = "V";
        field_Y = 0L;
        field_W = "Email address is unavailable";
        field_ab = new int[][]{new int[]{2, 1, 1, 0}, new int[]{2, 2, 1, 0}, new int[]{2, 3, 1, 0}, new int[]{2, 4, 1, 0}, new int[]{2, 5, 1, 0}, new int[]{2, 3, 1, 1}, new int[]{2, 4, 1, 1}, new int[]{2, 5, 1, 1}};
        field_Q = "Please log in to access this feature.";
    }
}
