/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends bh {
    static w field_n;
    static ke field_B;
    int field_q;
    int field_z;
    int field_t;
    int[][] field_u;
    static w field_C;
    int field_w;
    String[][] field_x;
    boolean field_A;
    static gk field_r;
    static String field_s;
    static ql field_v;
    int field_p;
    static ji field_y;
    int field_o;

    final static void a(int param0, int param1, int param2, nm param3, boolean param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        vj var10 = null;
        Object var11 = null;
        int var11_int = 0;
        tj var12 = null;
        int var13 = 0;
        w var14 = null;
        w var15 = null;
        w var16 = null;
        w var17 = null;
        w var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        String var24 = null;
        int var25_int = 0;
        String var25 = null;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30 = null;
        int var30_int = 0;
        int var31 = 0;
        Object var32 = null;
        nm stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        nm stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        nm stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        int stackIn_43_0 = 0;
        int stackIn_57_0 = 0;
        w stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        w stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        w stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        nm stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        nm stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        nm stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        int stackOut_38_4 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        w stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        w stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        w stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        L0: {
          var31 = client.field_A ? 1 : 0;
          var5_int = 0;
          var6 = 0;
          if (param1 == -17339) {
            break L0;
          } else {
            var32 = null;
            cl.a((hl) null, true);
            break L0;
          }
        }
        L1: {
          L2: {
            var7 = 0;
            var8 = 0;
            if (cd.field_m == null) {
              break L2;
            } else {
              L3: {
                if (cb.field_e != null) {
                  break L3;
                } else {
                  if (mg.field_Ob != null) {
                    break L3;
                  } else {
                    if (ik.field_h != null) {
                      break L3;
                    } else {
                      if (null != af.field_b) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var9 = 0;
              L4: while (true) {
                if (j.field_b <= var9) {
                  break L2;
                } else {
                  var10_int = 255 & cd.field_m.field_kc[var9];
                  if (var31 != 0) {
                    break L1;
                  } else {
                    L5: {
                      if (cb.field_e == null) {
                        break L5;
                      } else {
                        if (cb.field_e[var9] == null) {
                          break L5;
                        } else {
                          if (!cb.field_e[var9][var10_int]) {
                            break L5;
                          } else {
                            var5_int = 1;
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (mg.field_Ob == null) {
                        break L6;
                      } else {
                        if (null != mg.field_Ob[var9]) {
                          L7: {
                            var11_int = mg.field_Ob[var9][var10_int];
                            if (var11_int == 0) {
                              break L7;
                            } else {
                              if (uc.field_a) {
                                break L7;
                              } else {
                                var5_int = 1;
                                break L7;
                              }
                            }
                          }
                          if (var11_int <= var6) {
                            break L6;
                          } else {
                            var6 = var11_int;
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    L8: {
                      if (af.field_b == null) {
                        break L8;
                      } else {
                        if (null == af.field_b[var9]) {
                          break L8;
                        } else {
                          var8 = var8 | af.field_b[var9][var10_int];
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (ik.field_h == null) {
                        break L9;
                      } else {
                        if (null != ik.field_h[var9]) {
                          L10: {
                            var11_int = ik.field_h[var9][var10_int];
                            if (var7 < var11_int) {
                              var7 = var11_int;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          if (var11_int == 0) {
                            break L9;
                          } else {
                            if (!uc.field_a) {
                              var5_int = 1;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        } else {
                          break L9;
                        }
                      }
                    }
                    var9++;
                    if (var31 == 0) {
                      continue L4;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          L11: {
            stackOut_37_0 = (nm) param3;
            stackOut_37_1 = kf.field_O * 2 - -4;
            stackOut_37_2 = param0 * (8 + kf.field_O * 4);
            stackOut_37_3 = param1 + 2109;
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_39_2 = stackOut_37_2;
            stackIn_39_3 = stackOut_37_3;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            stackIn_38_2 = stackOut_37_2;
            stackIn_38_3 = stackOut_37_3;
            if (param3 != ki.field_w) {
              stackOut_39_0 = (nm) (Object) stackIn_39_0;
              stackOut_39_1 = stackIn_39_1;
              stackOut_39_2 = stackIn_39_2;
              stackOut_39_3 = stackIn_39_3;
              stackOut_39_4 = 0;
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              stackIn_40_3 = stackOut_39_3;
              stackIn_40_4 = stackOut_39_4;
              break L11;
            } else {
              stackOut_38_0 = (nm) (Object) stackIn_38_0;
              stackOut_38_1 = stackIn_38_1;
              stackOut_38_2 = stackIn_38_2;
              stackOut_38_3 = stackIn_38_3;
              stackOut_38_4 = 1;
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              stackIn_40_3 = stackOut_38_3;
              stackIn_40_4 = stackOut_38_4;
              break L11;
            }
          }
          L12: {
            if (((nm) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_40_4 == 0, 2, param4)) {
              stackOut_42_0 = 0;
              stackIn_43_0 = stackOut_42_0;
              break L12;
            } else {
              stackOut_41_0 = 1;
              stackIn_43_0 = stackOut_41_0;
              break L12;
            }
          }
          var9 = stackIn_43_0;
          break L1;
        }
        var10 = param3.field_Ob.field_M;
        var11 = null;
        var12 = (tj) (Object) var10.c((byte) 25);
        L13: while (true) {
          L14: {
            if (var12 == null) {
              break L14;
            } else {
              var13 = 0;
              if (var31 != 0) {
                return;
              } else {
                L15: {
                  if (var12.field_M == null) {
                    L16: {
                      var12.field_Zb = new w(0L, gg.field_G);
                      var12.a(var12.field_Zb, -16834);
                      var12.field_Tb = new w(0L, fc.field_f);
                      if (!pd.field_a) {
                        break L16;
                      } else {
                        var12.a(var12.field_Tb, -16834);
                        break L16;
                      }
                    }
                    var12.field_Tb.field_X = 2;
                    var12.field_gc = new w(0L, ua.field_H);
                    var12.a(var12.field_gc, -16834);
                    var12.d(-117);
                    var12.field_Wb = new w(0L, lj.field_c);
                    var12.a(var12.field_Wb, param1 + 505);
                    var12.field_Ob = new w(0L, gk.field_Hb);
                    var12.a(var12.field_Ob, -16834);
                    var13 = 1;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L17: {
                  var12.field_Zb.field_Y = null;
                  var14 = var12.field_Zb;
                  var12.field_Zb.field_N = 0;
                  var14.field_mb = 0;
                  var12.field_Tb.field_Y = null;
                  var15 = var12.field_Tb;
                  var12.field_Tb.field_N = 0;
                  var15.field_mb = 0;
                  var12.field_Wb.field_Y = null;
                  var12.field_Wb.field_N = 0;
                  var16 = var12.field_Wb;
                  var16.field_mb = 0;
                  var12.field_Ob.field_Y = null;
                  var12.field_Ob.field_N = 0;
                  var17 = var12.field_Ob;
                  var12.field_gc.field_Y = null;
                  var17.field_mb = 0;
                  var18 = var12.field_gc;
                  var12.field_gc.field_N = 0;
                  var18.field_mb = 0;
                  var12.field_mb = param3.field_Ob.field_mb;
                  var19 = 0;
                  var20 = var12.field_Yb;
                  var21 = 72;
                  if (ec.field_k != param3) {
                    break L17;
                  } else {
                    var21 += 42;
                    break L17;
                  }
                }
                L18: {
                  var20 = mm.a(var12.field_Zb.field_J, var20, var21);
                  if (var20.equals((Object) (Object) var12.field_Yb)) {
                    stackOut_56_0 = 0;
                    stackIn_57_0 = stackOut_56_0;
                    break L18;
                  } else {
                    stackOut_55_0 = 1;
                    stackIn_57_0 = stackOut_55_0;
                    break L18;
                  }
                }
                L19: {
                  L20: {
                    var22 = stackIn_57_0;
                    if (var12.field_dc >= 4) {
                      break L20;
                    } else {
                      if (var12.field_dc <= 0) {
                        break L19;
                      } else {
                        var20 = "<img=" + (var12.field_dc - 1) + ">" + var20;
                        if (var31 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                  }
                  var20 = "<img=" + (n.field_c + -4 + var12.field_dc) + ">" + var20;
                  break L19;
                }
                L21: {
                  var12.field_Zb.field_Y = var20;
                  if (!var12.g((byte) 101)) {
                    L22: {
                      L23: {
                        L24: {
                          var23_int = 16764006;
                          var24_int = 16777215;
                          if (var5_int == 0) {
                            break L24;
                          } else {
                            if (!var12.field_ec) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        if (var12.field_Ub < var6) {
                          break L23;
                        } else {
                          if (var12.field_Xb < var7) {
                            break L23;
                          } else {
                            if (-1 >= (var12.field_Sb & var8)) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      var24_int = 8421504;
                      var23_int = 8414771;
                      break L22;
                    }
                    L25: {
                      L26: {
                        var12.field_Zb.field_rb = var24_int;
                        var12.field_Zb.field_fb = var24_int;
                        var12.field_Zb.field_Bb = var24_int;
                        var12.field_Wb.field_G = var23_int;
                        var12.field_Tb.field_G = var23_int;
                        var12.field_Zb.field_G = var23_int;
                        var12.field_Tb.field_rb = var24_int;
                        var12.field_Tb.field_fb = var24_int;
                        var12.field_Tb.field_Bb = var24_int;
                        var12.field_Wb.field_rb = var24_int;
                        var12.field_Wb.field_fb = var24_int;
                        var12.field_Wb.field_Bb = var24_int;
                        if (param3 == tb.field_b) {
                          break L26;
                        } else {
                          L27: {
                            if (var12.field_bc) {
                              break L27;
                            } else {
                              L28: {
                                if (!var12.field_fc) {
                                  break L28;
                                } else {
                                  var12.field_Zb.field_Y = cm.a((byte) 91, ad.field_A, new String[1]);
                                  var12.field_Wb.field_Y = uc.field_f;
                                  var12.field_Ob.field_Y = ql.field_f;
                                  if (var31 == 0) {
                                    break L25;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                              var12.field_Wb.field_Y = a.field_l;
                              if (var31 == 0) {
                                break L25;
                              } else {
                                break L27;
                              }
                            }
                          }
                          var12.field_Zb.field_Y = cm.a((byte) 116, lb.field_i, new String[1]);
                          var12.field_Ob.field_Y = fc.field_g;
                          if (var31 == 0) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      if (!cd.field_m.field_lc) {
                        var12.field_Ob.field_Y = bn.field_a;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L29: {
                      var25_int = 0;
                      if (cd.field_m == null) {
                        break L29;
                      } else {
                        if (!ig.b(true)) {
                          break L29;
                        } else {
                          if (~var12.field_cc == ~uc.field_g) {
                            break L29;
                          } else {
                            L30: {
                              if (null != var12.field_Wb.field_Y) {
                                var26 = var12.field_Wb.a(true) + nk.field_b * 2;
                                var12.field_Wb.a(var26, 0, var19, kf.field_O, var25_int);
                                var25_int = var25_int + var26;
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                            if (null == var12.field_Ob.field_Y) {
                              break L29;
                            } else {
                              L31: {
                                L32: {
                                  if (param3 != tb.field_b) {
                                    break L32;
                                  } else {
                                    var26 = 40;
                                    if (var31 == 0) {
                                      break L31;
                                    } else {
                                      break L32;
                                    }
                                  }
                                }
                                var26 = var12.field_Ob.a(true) - -(2 * nk.field_b);
                                break L31;
                              }
                              var12.field_Ob.a(var26, param1 + 17339, var19, kf.field_O, var25_int);
                              var25_int = var25_int + var26;
                              break L29;
                            }
                          }
                        }
                      }
                    }
                    L33: {
                      stackOut_94_0 = var12.field_Zb;
                      stackOut_94_1 = var12.field_mb;
                      stackIn_96_0 = stackOut_94_0;
                      stackIn_96_1 = stackOut_94_1;
                      stackIn_95_0 = stackOut_94_0;
                      stackIn_95_1 = stackOut_94_1;
                      if (pd.field_a) {
                        stackOut_96_0 = (w) (Object) stackIn_96_0;
                        stackOut_96_1 = stackIn_96_1;
                        stackOut_96_2 = 42;
                        stackIn_97_0 = stackOut_96_0;
                        stackIn_97_1 = stackOut_96_1;
                        stackIn_97_2 = stackOut_96_2;
                        break L33;
                      } else {
                        stackOut_95_0 = (w) (Object) stackIn_95_0;
                        stackOut_95_1 = stackIn_95_1;
                        stackOut_95_2 = 0;
                        stackIn_97_0 = stackOut_95_0;
                        stackIn_97_1 = stackOut_95_1;
                        stackIn_97_2 = stackOut_95_2;
                        break L33;
                      }
                    }
                    L34: {
                      L35: {
                        L36: {
                          ((w) (Object) stackIn_97_0).a(stackIn_97_1 + -stackIn_97_2 + -var25_int, 0, var19, kf.field_O, var25_int);
                          var12.field_Tb.field_Y = Integer.toString(var12.field_Ub);
                          var12.field_Tb.a(40, param1 + 17339, var19, kf.field_O, var12.field_mb + -40);
                          if (!var12.field_Zb.field_jb) {
                            break L36;
                          } else {
                            if (var22 != 0) {
                              break L35;
                            } else {
                              break L36;
                            }
                          }
                        }
                        if (!var12.field_Zb.field_jb) {
                          break L34;
                        } else {
                          if (vj.field_e == null) {
                            break L34;
                          } else {
                            if (null != vj.field_e[var12.field_dc]) {
                              sl.field_g = vj.field_e[var12.field_dc];
                              if (var31 == 0) {
                                break L34;
                              } else {
                                break L35;
                              }
                            } else {
                              break L34;
                            }
                          }
                        }
                      }
                      sl.field_g = var12.field_Yb;
                      if (null == vj.field_e) {
                        break L34;
                      } else {
                        if (null != vj.field_e[var12.field_dc]) {
                          sl.field_g = sl.field_g + " - " + vj.field_e[var12.field_dc];
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                    }
                    var19 = var19 + kf.field_O;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L37: {
                  var23 = je.a(var20, var12.field_hc, (byte) -128);
                  var24 = var23;
                  var24 = var23;
                  if (var23 == null) {
                    break L37;
                  } else {
                    var24_int = var12.field_gc.field_J.a(var23, -nk.field_b + var12.field_mb - nk.field_b);
                    var12.field_gc.field_wb = 256 * var12.field_Qb / oa.field_a;
                    var12.field_gc.field_Y = var23;
                    var12.field_gc.a(var12.field_mb + -(nk.field_b * 2), 0, var19, kf.field_O * var24_int, nk.field_b);
                    var19 = var19 + var24_int * kf.field_O;
                    break L37;
                  }
                }
                L38: {
                  if (var9 == 0) {
                    var12.field_F = -var12.field_N + var19;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if (var13 != 0) {
                    param3.field_Ob.a((w) var11, (w) (Object) var12, 2, 0);
                    break L39;
                  } else {
                    break L39;
                  }
                }
                L40: {
                  if (var12.field_ob == 0) {
                    break L40;
                  } else {
                    if (var12.g((byte) 101)) {
                      break L40;
                    } else {
                      L41: {
                        if (0 == var12.field_Wb.field_ob) {
                          break L41;
                        } else {
                          bn.a(var12.field_cc, param2, (byte) -84);
                          if (var31 == 0) {
                            break L40;
                          } else {
                            break L41;
                          }
                        }
                      }
                      L42: {
                        if (0 != var12.field_Ob.field_ob) {
                          break L42;
                        } else {
                          fl.a(0, var12, param3, he.field_S, 0, param1 ^ 17358, nf.field_h);
                          if (var31 == 0) {
                            break L40;
                          } else {
                            break L42;
                          }
                        }
                      }
                      mn.a(true, var12.field_cc, param2);
                      break L40;
                    }
                  }
                }
                L43: {
                  var11 = (Object) (Object) var12;
                  if (!var12.field_Kb) {
                    break L43;
                  } else {
                    if (var12.g((byte) 111)) {
                      break L43;
                    } else {
                      L44: {
                        var24 = null;
                        if (~uc.field_g == ~var12.field_cc) {
                          L45: {
                            if (var5_int == 0) {
                              break L45;
                            } else {
                              if (var12.field_ec) {
                                break L45;
                              } else {
                                var24 = rn.field_a;
                                break L44;
                              }
                            }
                          }
                          if (var12.field_Xb >= var7) {
                            if (var12.field_Ub >= var6) {
                              if ((var8 & ~var12.field_Sb) == 0) {
                                break L44;
                              } else {
                                var25_int = wb.b((byte) -94, var8 & ~var12.field_Sb);
                                var24 = tm.field_e;
                                if (var25_int <= 0) {
                                  break L44;
                                } else {
                                  if (lc.field_e == null) {
                                    break L44;
                                  } else {
                                    if (var25_int > lc.field_e.length) {
                                      break L44;
                                    } else {
                                      if (lc.field_e[-1 + var25_int] == null) {
                                        break L44;
                                      } else {
                                        var24 = lc.field_e[var25_int - 1][1];
                                        break L44;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var24 = cm.a((byte) 90, gd.field_a, new String[2]);
                              break L44;
                            }
                          } else {
                            L46: {
                              var25_int = -var12.field_Xb + var7;
                              if (var25_int == 1) {
                                var24 = oa.field_d;
                                break L46;
                              } else {
                                break L46;
                              }
                            }
                            var24 = cm.a((byte) 118, lb.field_a, new String[2]);
                            break L44;
                          }
                        } else {
                          L47: {
                            if (var5_int == 0) {
                              break L47;
                            } else {
                              if (!var12.field_ec) {
                                var24 = cm.a((byte) 92, in.field_s, new String[1]);
                                break L44;
                              } else {
                                break L47;
                              }
                            }
                          }
                          if (var12.field_Xb >= var7) {
                            if (var12.field_Ub >= var6) {
                              if (0 != (~var12.field_Sb & var8)) {
                                var25_int = wb.b((byte) -120, var8 & ~var12.field_Sb);
                                var24 = cm.a((byte) 91, ci.field_f, new String[1]);
                                if (var25_int <= 0) {
                                  break L44;
                                } else {
                                  if (lc.field_e == null) {
                                    break L44;
                                  } else {
                                    if (lc.field_e.length < var25_int) {
                                      break L44;
                                    } else {
                                      if (lc.field_e[var25_int - 1] != null) {
                                        var24 = cm.a((byte) 93, lc.field_e[-1 + var25_int][2], new String[1]);
                                        break L44;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L44;
                              }
                            } else {
                              var24 = cm.a((byte) 98, wm.field_i, new String[2]);
                              break L44;
                            }
                          } else {
                            L48: {
                              var25_int = -var12.field_Xb + var7;
                              if (var25_int == 1) {
                                var24 = cm.a((byte) 93, qf.field_m, new String[1]);
                                break L48;
                              } else {
                                break L48;
                              }
                            }
                            var24 = cm.a((byte) 99, kn.field_n, new String[2]);
                            break L44;
                          }
                        }
                      }
                      if (var24 != null) {
                        var24 = "<col=A00000>" + var24;
                        var30 = var24;
                        var25 = var30;
                        var24 = var25;
                        var30 = var24;
                        var25 = var30;
                        var25 = null;
                        var26 = 0;
                        var27_int = 0;
                        L49: while (true) {
                          L50: {
                            L51: {
                              L52: {
                                if (var27_int >= j.field_b) {
                                  break L52;
                                } else {
                                  var28 = cd.field_m.field_kc[var27_int] & 255;
                                  var29 = 0;
                                  if (var31 != 0) {
                                    break L51;
                                  } else {
                                    L53: {
                                      if (cb.field_e == null) {
                                        break L53;
                                      } else {
                                        if (null == cb.field_e[var27_int]) {
                                          break L53;
                                        } else {
                                          if (!cb.field_e[var27_int][var28]) {
                                            break L53;
                                          } else {
                                            if (var12.field_ec) {
                                              break L53;
                                            } else {
                                              var29 = 1;
                                              break L53;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L54: {
                                      if (null == mg.field_Ob) {
                                        break L54;
                                      } else {
                                        if (mg.field_Ob[var27_int] != null) {
                                          L55: {
                                            var30_int = mg.field_Ob[var27_int][var28];
                                            if (var30_int == 0) {
                                              break L55;
                                            } else {
                                              if (uc.field_a) {
                                                break L55;
                                              } else {
                                                if (!var12.field_ec) {
                                                  var29 = 1;
                                                  break L55;
                                                } else {
                                                  break L55;
                                                }
                                              }
                                            }
                                          }
                                          if (var30_int <= var12.field_Ub) {
                                            break L54;
                                          } else {
                                            var29 = 1;
                                            break L54;
                                          }
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                    L56: {
                                      if (ik.field_h == null) {
                                        break L56;
                                      } else {
                                        if (ik.field_h[var27_int] == null) {
                                          break L56;
                                        } else {
                                          L57: {
                                            var30_int = ik.field_h[var27_int][var28];
                                            if (0 == var30_int) {
                                              break L57;
                                            } else {
                                              if (uc.field_a) {
                                                break L57;
                                              } else {
                                                if (!var12.field_ec) {
                                                  var29 = 1;
                                                  break L57;
                                                } else {
                                                  break L57;
                                                }
                                              }
                                            }
                                          }
                                          if (var30_int <= var12.field_Xb) {
                                            break L56;
                                          } else {
                                            var29 = 1;
                                            break L56;
                                          }
                                        }
                                      }
                                    }
                                    L58: {
                                      if (null == af.field_b) {
                                        break L58;
                                      } else {
                                        if (af.field_b[var27_int] != null) {
                                          if ((~var12.field_Sb & af.field_b[var27_int][var28]) == 0) {
                                            break L58;
                                          } else {
                                            var29 = 1;
                                            break L58;
                                          }
                                        } else {
                                          break L58;
                                        }
                                      }
                                    }
                                    L59: {
                                      if (var29 == 0) {
                                        break L59;
                                      } else {
                                        L60: {
                                          var30 = "<col=A00000>" + pa.field_db[var27_int] + "</col>";
                                          var25 = var30;
                                          var25 = var30;
                                          if (var25 != null) {
                                            break L60;
                                          } else {
                                            var25 = var30;
                                            if (var31 == 0) {
                                              break L59;
                                            } else {
                                              break L60;
                                            }
                                          }
                                        }
                                        var26 = 1;
                                        var25 = var25 + ", " + var30;
                                        var24 = var25;
                                        var24 = var25;
                                        break L59;
                                      }
                                    }
                                    var27_int++;
                                    if (var31 == 0) {
                                      continue L49;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                              }
                              if (param3 != tb.field_b) {
                                break L51;
                              } else {
                                if (!ig.b(true)) {
                                  break L51;
                                } else {
                                  L61: {
                                    if (var26 != 0) {
                                      break L61;
                                    } else {
                                      var24 = var24 + "<br>" + cm.a((byte) 111, ci.field_b, new String[1]);
                                      if (var31 == 0) {
                                        break L50;
                                      } else {
                                        break L61;
                                      }
                                    }
                                  }
                                  var24 = var24 + "<br>" + pb.field_k + var25;
                                  if (var31 == 0) {
                                    break L50;
                                  } else {
                                    break L51;
                                  }
                                }
                              }
                            }
                            L62: {
                              if (var26 != 0) {
                                break L62;
                              } else {
                                var24 = var24 + "<br>" + cm.a((byte) 101, fj.field_i, new String[1]);
                                if (var31 == 0) {
                                  break L50;
                                } else {
                                  break L62;
                                }
                              }
                            }
                            var24 = var24 + "<br>" + am.field_b + var25;
                            break L50;
                          }
                          L63: {
                            if (tb.field_b != param3) {
                              break L63;
                            } else {
                              if (ig.b(true)) {
                                break L63;
                              } else {
                                var27 = cd.field_m.field_Vb;
                                var24 = var24 + "<br>" + cm.a((byte) 116, jf.field_b, new String[1]);
                                break L63;
                              }
                            }
                          }
                          sl.field_g = var24;
                          break L43;
                        }
                      } else {
                        break L43;
                      }
                    }
                  }
                }
                var12 = (tj) (Object) var10.d(true);
                if (var31 == 0) {
                  continue L13;
                } else {
                  break L14;
                }
              }
            }
          }
          return;
        }
    }

    final static void a(String param0, int param1, int param2, String param3, int param4) {
        wj.field_Mb.field_G = param2;
        wj.field_Mb.field_T = param0;
        wj.field_Mb.field_mb = wj.field_Mb.field_mb + jb.field_f.field_mb;
        wj.field_Mb.field_Y = param3;
        jb.field_f.field_vb = jb.field_f.field_vb + jb.field_f.field_mb;
        if (param4 != -24503) {
            return;
        }
        try {
            jb.field_f.field_mb = param1;
            wj.field_Mb.field_mb = wj.field_Mb.field_mb - jb.field_f.field_mb;
            jb.field_f.field_vb = jb.field_f.field_vb - jb.field_f.field_mb;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "cl.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    public static void c(byte param0) {
        field_y = null;
        field_v = null;
        field_B = null;
        field_r = null;
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        cc var9 = null;
        int var10 = 0;
        int stackIn_20_0 = 0;
        String stackIn_25_0 = null;
        int stackIn_29_0 = 0;
        String stackIn_34_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_41_0 = 0;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        cc stackIn_46_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_40_0 = 0;
        String stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        cc stackOut_45_0 = null;
        cc stackOut_44_0 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = fc.field_a;
              var2 = 0;
              if (bc.field_B == 2) {
                var3_long = ik.a(4) - di.field_F;
                var2 = (int)((10999L - var3_long) / 1000L);
                if (var2 >= 0) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              var3 = 0;
              if (param0) {
                break L2;
              } else {
                field_B = null;
                break L2;
              }
            }
            L3: while (true) {
              if (var3 >= rk.field_P.length) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var4 = k.field_g[var3];
                if (var10 != 0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      if (0 > var4) {
                        break L5;
                      } else {
                        L6: {
                          if (var4 != k.field_f.field_h) {
                            break L6;
                          } else {
                            var5 = gn.field_a;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var5 = wa.field_c;
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var5 = wm.field_l;
                    break L4;
                  }
                  L7: {
                    var6 = rk.field_P[var3];
                    if (bc.field_B != 2) {
                      break L7;
                    } else {
                      if (var2 == 1) {
                        L8: {
                          if (vb.field_U.length <= tg.field_g.length) {
                            stackOut_19_0 = tg.field_g.length;
                            stackIn_20_0 = stackOut_19_0;
                            break L8;
                          } else {
                            stackOut_18_0 = vb.field_U.length;
                            stackIn_20_0 = stackOut_18_0;
                            break L8;
                          }
                        }
                        L9: {
                          var7 = stackIn_20_0;
                          if (var3 < 6) {
                            break L9;
                          } else {
                            if (var7 + 6 <= var3) {
                              break L9;
                            } else {
                              L10: {
                                if (-var7 + var3 - (6 - tg.field_g.length) < 0) {
                                  stackOut_24_0 = "";
                                  stackIn_25_0 = stackOut_24_0;
                                  break L10;
                                } else {
                                  stackOut_23_0 = tg.field_g[-6 + (var3 - -tg.field_g.length - var7)];
                                  stackIn_25_0 = stackOut_23_0;
                                  break L10;
                                }
                              }
                              var6 = stackIn_25_0;
                              break L9;
                            }
                          }
                        }
                        L11: {
                          if (wb.field_Qb.length <= dh.field_b.length) {
                            stackOut_28_0 = dh.field_b.length;
                            stackIn_29_0 = stackOut_28_0;
                            break L11;
                          } else {
                            stackOut_27_0 = wb.field_Qb.length;
                            stackIn_29_0 = stackOut_27_0;
                            break L11;
                          }
                        }
                        var8 = stackIn_29_0;
                        if (var7 + 7 > var3) {
                          break L7;
                        } else {
                          if (var8 + 7 + var7 <= var3) {
                            break L7;
                          } else {
                            L12: {
                              if (-7 + (var3 - var7) >= dh.field_b.length) {
                                stackOut_33_0 = "";
                                stackIn_34_0 = stackOut_33_0;
                                break L12;
                              } else {
                                stackOut_32_0 = dh.field_b[-7 + var3 + -var7];
                                stackIn_34_0 = stackOut_32_0;
                                break L12;
                              }
                            }
                            var6 = stackIn_34_0;
                            break L7;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  L13: {
                    if (var4 == -2) {
                      var6 = Integer.toString(var2);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    stackOut_38_0 = 0;
                    stackOut_38_1 = (String) var6;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    if (var4 < 0) {
                      stackOut_40_0 = stackIn_40_0;
                      stackOut_40_1 = (String) (Object) stackIn_40_1;
                      stackOut_40_2 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      stackIn_41_1 = stackOut_40_1;
                      stackIn_41_2 = stackOut_40_2;
                      break L14;
                    } else {
                      stackOut_39_0 = stackIn_39_0;
                      stackOut_39_1 = (String) (Object) stackIn_39_1;
                      stackOut_39_2 = 1;
                      stackIn_41_0 = stackOut_39_0;
                      stackIn_41_1 = stackOut_39_1;
                      stackIn_41_2 = stackOut_39_2;
                      break L14;
                    }
                  }
                  L15: {
                    var7 = si.a(stackIn_41_0 != 0, stackIn_41_1, stackIn_41_2 != 0);
                    var8 = -(var7 >> 1) + qk.field_d;
                    if (var4 >= 0) {
                      L16: {
                        var1_int = var1_int + qk.field_m;
                        if (k.field_f.field_h != var4) {
                          stackOut_45_0 = da.field_c;
                          stackIn_46_0 = stackOut_45_0;
                          break L16;
                        } else {
                          stackOut_44_0 = nf.field_g;
                          stackIn_46_0 = stackOut_44_0;
                          break L16;
                        }
                      }
                      L17: {
                        var9 = stackIn_46_0;
                        if (var9 != null) {
                          var9.a(var7 - -(mb.field_c << 1), 102, var8 + -mb.field_c, var1_int, (pa.field_Y << 1) + cc.field_a);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      var1_int = var1_int + pa.field_Y;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L18: {
                    L19: {
                      if (0 <= var4) {
                        break L19;
                      } else {
                        rk.field_R.a(var6, var8, nd.field_b + var1_int, var5, -1);
                        var1_int = var1_int + ke.field_d;
                        if (var10 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    bg.field_g.a(var6, var8, a.field_k + var1_int, var5, -1);
                    var1_int = var1_int + (pa.field_Y - (-qk.field_m - cc.field_a));
                    break L18;
                  }
                  var3++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "cl.D(" + param0 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(hl param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        hl var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0.field_h != null) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      if (param0.field_i != 0) {
                        break L4;
                      } else {
                        if (param0.field_n == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2_int = 0;
                    L5: while (true) {
                      if (var2_int >= ic.field_c) {
                        break L3;
                      } else {
                        var3 = pd.field_g[var2_int];
                        stackOut_8_0 = -3;
                        stackIn_18_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          L6: {
                            if (stackIn_9_0 != ~var3.field_m) {
                              break L6;
                            } else {
                              if (var3.field_i != param0.field_i) {
                                break L6;
                              } else {
                                if (var3.field_n != param0.field_n) {
                                  break L6;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (param0.field_q != null) {
                    wf.field_o = param0.field_q;
                    he.field_Y = param0.field_o;
                    stackOut_17_0 = param0.field_m;
                    stackIn_18_0 = stackOut_17_0;
                    break L2;
                  } else {
                    break L1;
                  }
                }
                uh.field_d = stackIn_18_0;
                ng.field_a = param0.field_r;
                break L1;
              }
              rb.a(param0, -3);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("cl.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + 1 + 41);
        }
    }

    cl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Rated game";
    }
}
