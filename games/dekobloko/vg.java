/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    int[] field_K;
    short[] field_J;
    short[] field_M;
    short[] field_N;
    static ck field_h;
    short[] field_o;
    int field_H;
    int[] field_T;
    int[] field_S;
    int field_n;
    int[] field_R;
    int[] field_g;
    static ck field_x;
    static String field_s;
    short[] field_F;
    static oh field_E;
    short[] field_r;
    short field_L;
    int[] field_w;
    int[] field_m;
    short[] field_O;
    int field_f;
    static String[] field_I;
    short field_D;
    byte[] field_Q;
    private boolean field_d;
    int[] field_v;
    short[] field_A;
    short field_l;
    short[] field_e;
    short[] field_z;
    static int[] field_G;
    int[] field_q;
    short[] field_u;
    short[] field_j;
    short[] field_k;
    short[] field_t;
    short[] field_c;
    int field_b;
    short[] field_P;
    short[] field_C;
    static String field_p;
    int field_a;
    byte field_B;
    short[] field_y;
    int field_i;

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = client.field_A ? 1 : 0;
        if (!this.field_d) {
          L0: {
            this.field_d = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            if (param0 == -14200) {
              break L0;
            } else {
              this.a(70, 90, (byte) -86, 59, -78);
              break L0;
            }
          }
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (var8 >= this.field_l) {
              this.field_f = var5;
              this.field_H = var2;
              this.field_i = var7;
              this.field_a = var4;
              this.field_n = var6;
              this.field_b = var3;
              return;
            } else {
              L2: {
                var9 = this.field_J[var8];
                var10 = this.field_o[var8];
                if (var9 <= var5) {
                  break L2;
                } else {
                  var5 = var9;
                  break L2;
                }
              }
              L3: {
                var11 = this.field_e[var8];
                if (var9 < var2) {
                  var2 = var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var10 > var6) {
                  var6 = var10;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var10 < var3) {
                  var3 = var10;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var7 < var11) {
                  var7 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var4 > var11) {
                var4 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        ve var6 = null;
        ve var7 = null;
        uf var4 = null;
        if (ta.field_b != param2) {
            var6 = (ve) ((Object) tg.field_b.a(24710, (long)ta.field_b));
            var7 = var6;
            if (var7 != null) {
                var7.field_xc = null;
            }
            ta.field_b = param2;
            var4 = we.field_b;
            var4.f(param1, -4);
            var4.a(true, 3);
            var4.a(true, 11);
            var4.d(-1, param2);
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        w var5 = null;
        w var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        w var15 = null;
        String var16 = null;
        w var17 = null;
        int stackIn_10_0 = 0;
        w stackIn_22_0 = null;
        w stackIn_23_0 = null;
        w stackIn_24_0 = null;
        String stackIn_24_1 = null;
        w stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        w stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        w stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        String stackIn_27_2 = null;
        String stackIn_52_0 = null;
        w stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        w stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        w stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        w stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        w stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        w stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        w stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        w stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        w stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        w stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        w stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        w stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        w stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        w stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        w stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        String stackOut_51_0 = null;
        String stackOut_50_0 = null;
        w stackOut_21_0 = null;
        w stackOut_23_0 = null;
        String stackOut_23_1 = null;
        w stackOut_22_0 = null;
        String stackOut_22_1 = null;
        w stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        w stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        String stackOut_26_2 = null;
        w stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        String stackOut_25_2 = null;
        w stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        w stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        w stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        w stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        w stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        w stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        w stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        w stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        w stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        w stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        w stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        w stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        w stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        w stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        w stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        var12 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              qf.a(bf.field_r, 109);
              if (g.field_N == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    fh.field_d.field_N = 0;
                    var15 = fh.field_d;
                    var17 = var15;
                    var17.field_mb = 0;
                    nn.field_a.field_N = 0;
                    var5 = nn.field_a;
                    var5.field_mb = 0;
                    var6 = tg.field_i;
                    tg.field_i.field_N = 0;
                    var6.field_mb = 0;
                    fl.field_b.field_Y = cl.field_s.toUpperCase();
                    var7 = (2 + oh.field_d.field_mb) / 2;
                    tg.field_i.a(-2 + var7, 0, -40 + oh.field_d.field_N, 40, 0);
                    nn.field_a.a(oh.field_d.field_mb + -var7, 0, -40 + oh.field_d.field_N, 40, var7);
                    if (b.field_P.length != 1) {
                      break L3;
                    } else {
                      if (b.field_P[0] != 2) {
                        break L3;
                      } else {
                        var8 = 0;
                        break L2;
                      }
                    }
                  }
                  var8 = 0;
                  var9_int = 0;
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (b.field_P.length <= var10) {
                        break L5;
                      } else {
                        L6: {
                          if ((kk.field_l[var10 / 8] & 1 << (var10 & 7)) == 0) {
                            stackOut_9_0 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            break L6;
                          } else {
                            stackOut_8_0 = 1;
                            stackIn_10_0 = stackOut_8_0;
                            break L6;
                          }
                        }
                        L7: {
                          var11_int = stackIn_10_0;
                          if (var11_int != 0) {
                            var9_int++;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if (b.field_P[var10] != 2) {
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
                    if (0 != var9_int) {
                      break L2;
                    } else {
                      var8 = 1;
                      break L2;
                    }
                  }
                }
                nn.field_a.field_Hb = true;
                if (fj.field_h) {
                  L9: {
                    ma.field_G.field_Hb = false;
                    cl.field_n.field_Y = im.field_c;
                    if (var8 == 0) {
                      stackOut_51_0 = wk.field_j;
                      stackIn_52_0 = stackOut_51_0;
                      break L9;
                    } else {
                      stackOut_50_0 = hc.field_e;
                      stackIn_52_0 = stackOut_50_0;
                      break L9;
                    }
                  }
                  L10: {
                    var16 = stackIn_52_0;
                    var9 = var16;
                    var9 = var16;
                    var9 = var16;
                    var10 = tg.field_i.field_J.a(var16) - -(3 * tg.field_i.field_J.a('.'));
                    tg.field_i.field_X = 0;
                    tg.field_i.field_ub = (-var10 + tg.field_i.field_mb) / 2;
                    if ((48 & oe.field_G) != 16) {
                      break L10;
                    } else {
                      var9 = var16 + ".";
                      break L10;
                    }
                  }
                  L11: {
                    if ((oe.field_G & 48) != 32) {
                      break L11;
                    } else {
                      var9 = var9 + "..";
                      break L11;
                    }
                  }
                  L12: {
                    if ((48 & oe.field_G) != 48) {
                      break L12;
                    } else {
                      var9 = var9 + "...";
                      break L12;
                    }
                  }
                  tg.field_i.field_Y = var9;
                  nn.field_a.field_Y = fc.field_g.toUpperCase();
                  break L1;
                } else {
                  L13: {
                    stackOut_21_0 = nn.field_a;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (var8 != 0) {
                      stackOut_23_0 = (w) ((Object) stackIn_23_0);
                      stackOut_23_1 = wg.field_g;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      break L13;
                    } else {
                      stackOut_22_0 = (w) ((Object) stackIn_22_0);
                      stackOut_22_1 = kd.field_r;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      break L13;
                    }
                  }
                  L14: {
                    stackIn_24_0.field_Y = ((String) (Object) stackIn_24_1).toUpperCase();
                    stackOut_24_0 = cl.field_n;
                    stackOut_24_1 = 94;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    if (var8 == 0) {
                      stackOut_26_0 = (w) ((Object) stackIn_26_0);
                      stackOut_26_1 = stackIn_26_1;
                      stackOut_26_2 = wd.field_e;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      stackIn_27_2 = stackOut_26_2;
                      break L14;
                    } else {
                      stackOut_25_0 = (w) ((Object) stackIn_25_0);
                      stackOut_25_1 = stackIn_25_1;
                      stackOut_25_2 = af.field_c;
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_27_1 = stackOut_25_1;
                      stackIn_27_2 = stackOut_25_2;
                      break L14;
                    }
                  }
                  L15: {
                    stackIn_27_0.field_Y = cm.a((byte) stackIn_27_1, stackIn_27_2, new String[]{nn.field_a.field_Y});
                    ma.field_G.field_Hb = true;
                    tg.field_i.field_Y = kh.field_b;
                    ve.field_ac = true;
                    if (bc.field_D == null) {
                      break L15;
                    } else {
                      L16: {
                        gd.field_b = false;
                        if (km.field_D == null) {
                          km.field_D = new byte[j.field_b];
                          rd.field_c = new boolean[j.field_b];
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      ve.field_ac = false;
                      var13 = 0;
                      var9_int = var13;
                      L17: while (true) {
                        if (var13 >= j.field_b) {
                          uc.a(-1, true, -1, 0, -1, j.field_b, g.field_N, false);
                          if (2 > te.field_p) {
                            break L15;
                          } else {
                            if (!bj.field_d[12]) {
                              break L15;
                            } else {
                              ve.field_ac = true;
                              break L15;
                            }
                          }
                        } else {
                          rd.field_c[var13] = false;
                          var13++;
                          continue L17;
                        }
                      }
                    }
                  }
                  if (!ve.field_ac) {
                    nn.field_a.field_Hb = false;
                    if (!nn.field_a.field_Kb) {
                      break L1;
                    } else {
                      L18: {
                        var9 = null;
                        if (gd.field_b) {
                          var9 = "<col=A00000>" + hb.field_Pb + "</col>";
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
                        if (j.field_b <= var10) {
                          sl.field_g = "<col=A00000>" + lk.field_i + "<br>" + hb.field_Tb + var9;
                          break L1;
                        } else {
                          L20: {
                            if (!rd.field_c[var10]) {
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          var10++;
                          continue L19;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            L21: {
              L22: {
                stackOut_59_0 = ee.field_i;
                stackOut_59_1 = 0;
                stackIn_63_0 = stackOut_59_0;
                stackIn_63_1 = stackOut_59_1;
                stackIn_60_0 = stackOut_59_0;
                stackIn_60_1 = stackOut_59_1;
                if (!param1) {
                  break L22;
                } else {
                  stackOut_60_0 = (w) ((Object) stackIn_60_0);
                  stackOut_60_1 = stackIn_60_1;
                  stackIn_63_0 = stackOut_60_0;
                  stackIn_63_1 = stackOut_60_1;
                  stackIn_61_0 = stackOut_60_0;
                  stackIn_61_1 = stackOut_60_1;
                  if (param2) {
                    break L22;
                  } else {
                    stackOut_61_0 = (w) ((Object) stackIn_61_0);
                    stackOut_61_1 = stackIn_61_1;
                    stackIn_63_0 = stackOut_61_0;
                    stackIn_63_1 = stackOut_61_1;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    if (dn.field_k) {
                      break L22;
                    } else {
                      stackOut_62_0 = (w) ((Object) stackIn_62_0);
                      stackOut_62_1 = stackIn_62_1;
                      stackOut_62_2 = 1;
                      stackIn_64_0 = stackOut_62_0;
                      stackIn_64_1 = stackOut_62_1;
                      stackIn_64_2 = stackOut_62_2;
                      break L21;
                    }
                  }
                }
              }
              stackOut_63_0 = (w) ((Object) stackIn_63_0);
              stackOut_63_1 = stackIn_63_1;
              stackOut_63_2 = 0;
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L21;
            }
            L23: {
              L24: {
                ((w) (Object) stackIn_64_0).a(stackIn_64_1 != 0, stackIn_64_2 != 0);
                stackOut_64_0 = oh.field_d;
                stackOut_64_1 = 0;
                stackIn_68_0 = stackOut_64_0;
                stackIn_68_1 = stackOut_64_1;
                stackIn_65_0 = stackOut_64_0;
                stackIn_65_1 = stackOut_64_1;
                if (!param1) {
                  break L24;
                } else {
                  stackOut_65_0 = (w) ((Object) stackIn_65_0);
                  stackOut_65_1 = stackIn_65_1;
                  stackIn_68_0 = stackOut_65_0;
                  stackIn_68_1 = stackOut_65_1;
                  stackIn_66_0 = stackOut_65_0;
                  stackIn_66_1 = stackOut_65_1;
                  if (param2) {
                    break L24;
                  } else {
                    stackOut_66_0 = (w) ((Object) stackIn_66_0);
                    stackOut_66_1 = stackIn_66_1;
                    stackIn_68_0 = stackOut_66_0;
                    stackIn_68_1 = stackOut_66_1;
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    if (dn.field_k) {
                      break L24;
                    } else {
                      stackOut_67_0 = (w) ((Object) stackIn_67_0);
                      stackOut_67_1 = stackIn_67_1;
                      stackOut_67_2 = 1;
                      stackIn_69_0 = stackOut_67_0;
                      stackIn_69_1 = stackOut_67_1;
                      stackIn_69_2 = stackOut_67_2;
                      break L23;
                    }
                  }
                }
              }
              stackOut_68_0 = (w) ((Object) stackIn_68_0);
              stackOut_68_1 = stackIn_68_1;
              stackOut_68_2 = 0;
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L23;
            }
            L25: {
              L26: {
                ((w) (Object) stackIn_69_0).a(stackIn_69_1 != 0, stackIn_69_2 != 0);
                stackOut_69_0 = mn.field_e;
                stackOut_69_1 = 0;
                stackIn_73_0 = stackOut_69_0;
                stackIn_73_1 = stackOut_69_1;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                if (!param1) {
                  break L26;
                } else {
                  stackOut_70_0 = (w) ((Object) stackIn_70_0);
                  stackOut_70_1 = stackIn_70_1;
                  stackIn_73_0 = stackOut_70_0;
                  stackIn_73_1 = stackOut_70_1;
                  stackIn_71_0 = stackOut_70_0;
                  stackIn_71_1 = stackOut_70_1;
                  if (param2) {
                    break L26;
                  } else {
                    stackOut_71_0 = (w) ((Object) stackIn_71_0);
                    stackOut_71_1 = stackIn_71_1;
                    stackIn_73_0 = stackOut_71_0;
                    stackIn_73_1 = stackOut_71_1;
                    stackIn_72_0 = stackOut_71_0;
                    stackIn_72_1 = stackOut_71_1;
                    if (!dn.field_k) {
                      break L26;
                    } else {
                      stackOut_72_0 = (w) ((Object) stackIn_72_0);
                      stackOut_72_1 = stackIn_72_1;
                      stackOut_72_2 = 1;
                      stackIn_74_0 = stackOut_72_0;
                      stackIn_74_1 = stackOut_72_1;
                      stackIn_74_2 = stackOut_72_2;
                      break L25;
                    }
                  }
                }
              }
              stackOut_73_0 = (w) ((Object) stackIn_73_0);
              stackOut_73_1 = stackIn_73_1;
              stackOut_73_2 = 0;
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L25;
            }
            ((w) (Object) stackIn_74_0).a(stackIn_74_1 != 0, stackIn_74_2 != 0);
            je.field_f.field_h.b(false);
            L27: {
              if (g.field_N == null) {
                break L27;
              } else {
                L28: {
                  if (ma.field_G.field_ob != 0) {
                    ul.a(param0, 4);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (nn.field_a.field_ob == 0) {
                    break L29;
                  } else {
                    if (fj.field_h) {
                      ji.c(param0, 1);
                      break L29;
                    } else {
                      th.a(param0, true);
                      break L29;
                    }
                  }
                }
                mc.a(g.field_N, true, param0, (byte) -127);
                break L27;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var4), "vg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + 48 + ')');
        }
    }

    private final void a(boolean param0) {
        this.field_d = false;
    }

    final static ji a(int param0, int param1) {
        if (param1 <= 20) {
            field_G = (int[]) null;
        }
        return kc.a(true, 1, param0, false, false, false);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = client.field_A ? 1 : 0;
        for (var5 = 0; this.field_l > var5; var5++) {
            this.field_J[var5] = (short)(this.field_J[var5] + param1);
            this.field_o[var5] = (short)(this.field_o[var5] + param2);
            this.field_e[var5] = (short)(this.field_e[var5] + param3);
        }
        if (param0 > -62) {
            this.field_B = (byte) 59;
        }
        this.a(false);
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var8 = client.field_A ? 1 : 0;
        int var7 = 19 % ((68 - param2) / 34);
        for (var6 = 0; this.field_l > var6; var6++) {
            this.field_J[var6] = (short)(this.field_J[var6] * param1 / param4);
            this.field_o[var6] = (short)(param0 * this.field_o[var6] / param4);
            this.field_e[var6] = (short)(this.field_e[var6] * param3 / param4);
        }
        this.a(false);
    }

    public static void a(byte param0) {
        field_I = null;
        int var1 = 0;
        field_s = null;
        field_p = null;
        field_h = null;
        field_x = null;
        field_G = null;
        field_E = null;
    }

    vg() {
        this.field_d = false;
        this.field_B = (byte) 0;
    }

    static {
        field_s = "Chat is currently disabled.";
        field_I = new String[16];
        field_G = new int[8192];
        field_p = "Only show lobby chat from my friends";
    }
}
