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
        int var2;
        int var3;
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
        field_X = null;
        field_ab = (int[][]) null;
        field_V = null;
        field_Q = null;
        field_W = null;
        if (!param0) {
            pl.g(-79);
        }
        field_T = null;
        field_S = null;
        field_U = null;
    }

    final static void a(boolean param0, boolean param1, int param2, byte param3) {
        int stackIn_11_0 = 0;
        gh stackIn_25_0 = null;
        gh stackIn_26_0 = null;
        String stackIn_26_1 = null;
        gh stackIn_28_0 = null;
        gh stackIn_29_0 = null;
        String stackIn_29_1 = null;
        String stackIn_57_0 = null;
        gh stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        gh stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        gh stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        gh stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        gh stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        gh stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        gh var5 = null;
        gh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        gh var15 = null;
        String var16 = null;
        gh var17 = null;
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
                            stackIn_11_0 = 0;
                            break L6;
                          } else {
                            stackIn_11_0 = 1;
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
                      stackIn_57_0 = ah.field_fc;
                      break L9;
                    } else {
                      stackIn_57_0 = uj.field_b;
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
                      var9 = (String) (var9) + "..";
                      break L11;
                    }
                  }
                  L12: {
                    if ((qa.field_H & 48) == 48) {
                      var9 = (String) (var9) + "...";
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  rh.field_w.field_S = (String) (var9);
                  fk.field_q.field_S = tj.field_b.toUpperCase();
                  break L1;
                } else {
                  L13: {
                    stackIn_25_0 = fk.field_q;

                    if (var8 != 0) {
                      stackIn_26_0 = (gh) ((Object) stackIn_25_0);
                      stackIn_26_1 = ha.field_P;
                      break L13;
                    } else {
                      stackIn_26_0 = (gh) ((Object) stackIn_25_0);
                      stackIn_26_1 = lj.field_i;
                      break L13;
                    }
                  }
                  L14: {
                    stackIn_26_0.field_S = ((String) (Object) stackIn_26_1).toUpperCase();
                    stackIn_28_0 = wl.field_J;

                    if (var8 != 0) {
                      stackIn_29_0 = (gh) ((Object) stackIn_28_0);
                      stackIn_29_1 = vi.field_P;
                      break L14;
                    } else {
                      stackIn_29_0 = (gh) ((Object) stackIn_28_0);
                      stackIn_29_1 = cm.field_c;
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
                          ll.field_i = "<col=A00000>" + wi.field_G + "<br>" + ke.field_i + (String) (var9);
                          break L1;
                        } else {
                          L20: {
                            if (m.field_h[var10]) {
                              var11_ref = "<col=A00000>" + al.field_a[var10] + "</col>";
                              var9 = var11_ref;
                              var9 = var11_ref;
                              if (var9 == null) {
                                var9 = var11_ref;
                                break L20;
                              } else {
                                var9 = (String) (var9) + ", " + var11_ref;
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
                stackIn_71_0 = ql.field_ec;

                stackIn_71_1 = -26;

                if (!param0) {
                  break L23;
                } else {
                  stackIn_71_0 = (gh) ((Object) stackIn_71_0);

                  if (param1) {
                    break L23;
                  } else {
                    stackIn_71_0 = (gh) ((Object) stackIn_71_0);

                    if (vb.field_c) {
                      break L23;
                    } else {
                      stackIn_72_0 = (gh) ((Object) stackIn_71_0);
                      stackIn_72_1 = stackIn_71_1;
                      stackIn_72_2 = 1;
                      break L22;
                    }
                  }
                }
              }
              stackIn_72_0 = (gh) ((Object) stackIn_71_0);
              stackIn_72_1 = stackIn_71_1;
              stackIn_72_2 = 0;
              break L22;
            }
            L24: {
              L25: {
                ((gh) (Object) stackIn_72_0).a((byte) stackIn_72_1, stackIn_72_2 != 0);
                stackIn_76_0 = gl.field_y;

                stackIn_76_1 = -56;

                if (!param0) {
                  break L25;
                } else {
                  stackIn_76_0 = (gh) ((Object) stackIn_76_0);

                  if (param1) {
                    break L25;
                  } else {
                    stackIn_76_0 = (gh) ((Object) stackIn_76_0);

                    if (vb.field_c) {
                      break L25;
                    } else {
                      stackIn_77_0 = (gh) ((Object) stackIn_76_0);
                      stackIn_77_1 = stackIn_76_1;
                      stackIn_77_2 = 1;
                      break L24;
                    }
                  }
                }
              }
              stackIn_77_0 = (gh) ((Object) stackIn_76_0);
              stackIn_77_1 = stackIn_76_1;
              stackIn_77_2 = 0;
              break L24;
            }
            L26: {
              L27: {
                ((gh) (Object) stackIn_77_0).a((byte) stackIn_77_1, stackIn_77_2 != 0);
                stackIn_81_0 = fb.field_r;

                stackIn_81_1 = 120;

                if (!param0) {
                  break L27;
                } else {
                  stackIn_81_0 = (gh) ((Object) stackIn_81_0);

                  if (param1) {
                    break L27;
                  } else {
                    stackIn_81_0 = (gh) ((Object) stackIn_81_0);

                    if (!vb.field_c) {
                      break L27;
                    } else {
                      stackIn_82_0 = (gh) ((Object) stackIn_81_0);
                      stackIn_82_1 = stackIn_81_1;
                      stackIn_82_2 = 1;
                      break L26;
                    }
                  }
                }
              }
              stackIn_82_0 = (gh) ((Object) stackIn_81_0);
              stackIn_82_1 = stackIn_81_1;
              stackIn_82_2 = 0;
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
