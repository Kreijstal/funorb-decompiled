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
        vj var10 = null;
        int var10_int = 0;
        tj var11 = null;
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
        String var24_ref = null;
        int var25_int = 0;
        String var25 = null;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        int var30_int = 0;
        String var30 = null;
        int var31 = 0;
        nm stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        nm stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        nm stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        int stackIn_67_0 = 0;
        w stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        w stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        w stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        nm stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        nm stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        nm stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        int stackOut_50_4 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        w stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        w stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        int stackOut_116_2 = 0;
        w stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        L0: {
          var31 = client.field_A ? 1 : 0;
          var5_int = 0;
          var6 = 0;
          if (param1 == -17339) {
            break L0;
          } else {
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
                            if (-1 == (var11_int ^ -1)) {
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
                          if ((var11_int ^ -1) >= (var6 ^ -1)) {
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
                            if ((var7 ^ -1) > (var11_int ^ -1)) {
                              var7 = var11_int;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          if (-1 == (var11_int ^ -1)) {
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
            stackOut_49_0 = (nm) param3;
            stackOut_49_1 = kf.field_O * 2 - -4;
            stackOut_49_2 = param0 * (8 + kf.field_O * 4);
            stackOut_49_3 = param1 + 2109;
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_51_2 = stackOut_49_2;
            stackIn_51_3 = stackOut_49_3;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            stackIn_50_2 = stackOut_49_2;
            stackIn_50_3 = stackOut_49_3;
            if (param3 != ki.field_w) {
              stackOut_51_0 = (nm) (Object) stackIn_51_0;
              stackOut_51_1 = stackIn_51_1;
              stackOut_51_2 = stackIn_51_2;
              stackOut_51_3 = stackIn_51_3;
              stackOut_51_4 = 0;
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              stackIn_52_3 = stackOut_51_3;
              stackIn_52_4 = stackOut_51_4;
              break L11;
            } else {
              stackOut_50_0 = (nm) (Object) stackIn_50_0;
              stackOut_50_1 = stackIn_50_1;
              stackOut_50_2 = stackIn_50_2;
              stackOut_50_3 = stackIn_50_3;
              stackOut_50_4 = 1;
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              stackIn_52_3 = stackOut_50_3;
              stackIn_52_4 = stackOut_50_4;
              break L11;
            }
          }
          var9 = ((nm) (Object) stackIn_52_0).a(stackIn_52_1, stackIn_52_2, stackIn_52_3, stackIn_52_4 != 0, 2, param4) ? 1 : 0;
          break L1;
        }
        var10 = param3.field_Ob.field_M;
        var11 = null;
        var12 = (tj) (Object) var10.c((byte) 25);
        L12: while (true) {
          L13: {
            L14: {
              if (null == var12) {
                break L14;
              } else {
                var13 = 0;
                if (var31 != 0) {
                  break L13;
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
                      stackOut_66_0 = 0;
                      stackIn_67_0 = stackOut_66_0;
                      break L18;
                    } else {
                      stackOut_65_0 = 1;
                      stackIn_67_0 = stackOut_65_0;
                      break L18;
                    }
                  }
                  L19: {
                    L20: {
                      var22 = stackIn_67_0;
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
                            if ((var12.field_Xb ^ -1) > (var7 ^ -1)) {
                              break L23;
                            } else {
                              if (-1 <= ((var12.field_Sb ^ -1) & var8 ^ -1)) {
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
                            if ((var12.field_cc ^ -1L) == (uc.field_g ^ -1L)) {
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
                        stackOut_114_0 = var12.field_Zb;
                        stackOut_114_1 = var12.field_mb;
                        stackIn_116_0 = stackOut_114_0;
                        stackIn_116_1 = stackOut_114_1;
                        stackIn_115_0 = stackOut_114_0;
                        stackIn_115_1 = stackOut_114_1;
                        if (pd.field_a) {
                          stackOut_116_0 = (w) (Object) stackIn_116_0;
                          stackOut_116_1 = stackIn_116_1;
                          stackOut_116_2 = 42;
                          stackIn_117_0 = stackOut_116_0;
                          stackIn_117_1 = stackOut_116_1;
                          stackIn_117_2 = stackOut_116_2;
                          break L33;
                        } else {
                          stackOut_115_0 = (w) (Object) stackIn_115_0;
                          stackOut_115_1 = stackIn_115_1;
                          stackOut_115_2 = 0;
                          stackIn_117_0 = stackOut_115_0;
                          stackIn_117_1 = stackOut_115_1;
                          stackIn_117_2 = stackOut_115_2;
                          break L33;
                        }
                      }
                      L34: {
                        L35: {
                          L36: {
                            ((w) (Object) stackIn_117_0).a(stackIn_117_1 + -stackIn_117_2 + -var25_int, 0, var19, kf.field_O, var25_int);
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
                    if (null == var23) {
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
                      param3.field_Ob.a((w) (Object) var11, (w) (Object) var12, 2, 0);
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                  L40: {
                    if ((var12.field_ob ^ -1) == -1) {
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
                    var11 = var12;
                    if (!var12.field_Kb) {
                      break L43;
                    } else {
                      if (var12.g((byte) 111)) {
                        break L43;
                      } else {
                        L44: {
                          var24 = null;
                          if ((uc.field_g ^ -1L) == (var12.field_cc ^ -1L)) {
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
                            if ((var12.field_Xb ^ -1) <= (var7 ^ -1)) {
                              if ((var12.field_Ub ^ -1) <= (var6 ^ -1)) {
                                if ((var8 & (var12.field_Sb ^ -1)) == 0) {
                                  break L44;
                                } else {
                                  var25_int = wb.b((byte) -94, var8 & (var12.field_Sb ^ -1));
                                  var24 = tm.field_e;
                                  if ((var25_int ^ -1) >= -1) {
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
                                          var24_ref = lc.field_e[var25_int - 1][1];
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
                              if ((var12.field_Ub ^ -1) <= (var6 ^ -1)) {
                                if (0 != ((var12.field_Sb ^ -1) & var8)) {
                                  L48: {
                                    var25_int = wb.b((byte) -120, var8 & (var12.field_Sb ^ -1));
                                    var24 = cm.a((byte) 91, ci.field_f, new String[1]);
                                    if ((var25_int ^ -1) >= -1) {
                                      break L48;
                                    } else {
                                      if (lc.field_e == null) {
                                        break L48;
                                      } else {
                                        if (lc.field_e.length < var25_int) {
                                          break L48;
                                        } else {
                                          if (lc.field_e[var25_int - 1] != null) {
                                            var24 = cm.a((byte) 93, lc.field_e[-1 + var25_int][2], new String[1]);
                                            break L48;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L44;
                                } else {
                                  break L44;
                                }
                              } else {
                                var24 = cm.a((byte) 98, wm.field_i, new String[2]);
                                break L44;
                              }
                            } else {
                              L49: {
                                var25_int = -var12.field_Xb + var7;
                                if ((var25_int ^ -1) == -2) {
                                  var24 = cm.a((byte) 93, qf.field_m, new String[1]);
                                  break L49;
                                } else {
                                  break L49;
                                }
                              }
                              var24 = cm.a((byte) 99, kn.field_n, new String[2]);
                              break L44;
                            }
                          }
                        }
                        if (var24_ref != null) {
                          var24 = "<col=A00000>" + var24_ref;
                          var25 = null;
                          var26 = 0;
                          var27_int = 0;
                          L50: while (true) {
                            L51: {
                              L52: {
                                L53: {
                                  if ((var27_int ^ -1) <= (j.field_b ^ -1)) {
                                    break L53;
                                  } else {
                                    var28 = cd.field_m.field_kc[var27_int] & 255;
                                    var29 = 0;
                                    if (var31 != 0) {
                                      break L52;
                                    } else {
                                      L54: {
                                        if (cb.field_e == null) {
                                          break L54;
                                        } else {
                                          if (null == cb.field_e[var27_int]) {
                                            break L54;
                                          } else {
                                            if (!cb.field_e[var27_int][var28]) {
                                              break L54;
                                            } else {
                                              if (var12.field_ec) {
                                                break L54;
                                              } else {
                                                var29 = 1;
                                                break L54;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L55: {
                                        if (null == mg.field_Ob) {
                                          break L55;
                                        } else {
                                          if (mg.field_Ob[var27_int] != null) {
                                            L56: {
                                              var30_int = mg.field_Ob[var27_int][var28];
                                              if (var30_int == 0) {
                                                break L56;
                                              } else {
                                                if (uc.field_a) {
                                                  break L56;
                                                } else {
                                                  if (!var12.field_ec) {
                                                    var29 = 1;
                                                    break L56;
                                                  } else {
                                                    break L56;
                                                  }
                                                }
                                              }
                                            }
                                            if ((var30_int ^ -1) >= (var12.field_Ub ^ -1)) {
                                              break L55;
                                            } else {
                                              var29 = 1;
                                              break L55;
                                            }
                                          } else {
                                            break L55;
                                          }
                                        }
                                      }
                                      L57: {
                                        if (ik.field_h == null) {
                                          break L57;
                                        } else {
                                          if (ik.field_h[var27_int] == null) {
                                            break L57;
                                          } else {
                                            L58: {
                                              var30_int = ik.field_h[var27_int][var28];
                                              if (0 == var30_int) {
                                                break L58;
                                              } else {
                                                if (uc.field_a) {
                                                  break L58;
                                                } else {
                                                  if (!var12.field_ec) {
                                                    var29 = 1;
                                                    break L58;
                                                  } else {
                                                    break L58;
                                                  }
                                                }
                                              }
                                            }
                                            if ((var30_int ^ -1) >= (var12.field_Xb ^ -1)) {
                                              break L57;
                                            } else {
                                              var29 = 1;
                                              break L57;
                                            }
                                          }
                                        }
                                      }
                                      L59: {
                                        if (null == af.field_b) {
                                          break L59;
                                        } else {
                                          if (af.field_b[var27_int] != null) {
                                            if (((var12.field_Sb ^ -1) & af.field_b[var27_int][var28]) == 0) {
                                              break L59;
                                            } else {
                                              var29 = 1;
                                              break L59;
                                            }
                                          } else {
                                            break L59;
                                          }
                                        }
                                      }
                                      L60: {
                                        if (var29 == 0) {
                                          break L60;
                                        } else {
                                          L61: {
                                            var30 = "<col=A00000>" + pa.field_db[var27_int] + "</col>";
                                            if (var25 != null) {
                                              break L61;
                                            } else {
                                              var25 = var30;
                                              if (var31 == 0) {
                                                break L60;
                                              } else {
                                                break L61;
                                              }
                                            }
                                          }
                                          var26 = 1;
                                          var25 = var25 + ", " + var30;
                                          break L60;
                                        }
                                      }
                                      var27_int++;
                                      if (var31 == 0) {
                                        continue L50;
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                }
                                if (param3 != tb.field_b) {
                                  break L52;
                                } else {
                                  if (!ig.b(true)) {
                                    break L52;
                                  } else {
                                    L62: {
                                      if (var26 != 0) {
                                        break L62;
                                      } else {
                                        var24 = var24 + "<br>" + cm.a((byte) 111, ci.field_b, new String[1]);
                                        if (var31 == 0) {
                                          break L51;
                                        } else {
                                          break L62;
                                        }
                                      }
                                    }
                                    var24 = var24 + "<br>" + pb.field_k + var25;
                                    if (var31 == 0) {
                                      break L51;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                              }
                              L63: {
                                if (var26 != 0) {
                                  break L63;
                                } else {
                                  var24 = var24 + "<br>" + cm.a((byte) 101, fj.field_i, new String[1]);
                                  if (var31 == 0) {
                                    break L51;
                                  } else {
                                    break L63;
                                  }
                                }
                              }
                              var24 = var24 + "<br>" + am.field_b + var25;
                              break L51;
                            }
                            L64: {
                              if (tb.field_b != param3) {
                                break L64;
                              } else {
                                if (ig.b(true)) {
                                  break L64;
                                } else {
                                  var27 = cd.field_m.field_Vb;
                                  var24 = var24 + "<br>" + cm.a((byte) 116, jf.field_b, new String[1]);
                                  break L64;
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
                    continue L12;
                  } else {
                    break L14;
                  }
                }
              }
            }
            break L13;
          }
          return;
        }
    }

    final static void a(String param0, int param1, int param2, String param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        wj.field_Mb.field_G = param2;
                        wj.field_Mb.field_T = param0;
                        wj.field_Mb.field_mb = wj.field_Mb.field_mb + jb.field_f.field_mb;
                        wj.field_Mb.field_Y = param3;
                        jb.field_f.field_vb = jb.field_f.field_vb + jb.field_f.field_mb;
                        if (param4 == -24503) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        jb.field_f.field_mb = param1;
                        wj.field_Mb.field_mb = wj.field_Mb.field_mb - jb.field_f.field_mb;
                        jb.field_f.field_vb = jb.field_f.field_vb - jb.field_f.field_mb;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) runtimeException;
                        stackOut_5_1 = new StringBuilder().append("cl.E(");
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (param0 == null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                        stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                        stackOut_6_2 = "{...}";
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_9_2 = stackOut_6_2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 8: {
                    stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                    stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                    stackOut_8_2 = "null";
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (param3 == null) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                        stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                        stackOut_10_2 = "{...}";
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_13_2 = stackOut_10_2;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 12: {
                    stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                    stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                    stackOut_12_2 = "null";
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw dh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param4 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(byte param0) {
        field_y = null;
        field_v = null;
        field_B = null;
        field_r = null;
        if (param0 != -39) {
            return;
        }
        try {
            field_C = null;
            field_n = null;
            field_s = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "cl.A(" + param0 + 41);
        }
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
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        cc var9 = null;
        int var10 = 0;
        int stackIn_16_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        String stackIn_49_0 = null;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        String stackIn_66_0 = null;
        int stackIn_72_0 = 0;
        String stackIn_72_1 = null;
        int stackIn_74_0 = 0;
        String stackIn_74_1 = null;
        int stackIn_75_0 = 0;
        String stackIn_75_1 = null;
        int stackIn_75_2 = 0;
        cc stackIn_84_0 = null;
        int stackOut_15_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        String stackOut_46_0 = null;
        String stackOut_48_0 = null;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_56_0 = 0;
        String stackOut_63_0 = null;
        String stackOut_65_0 = null;
        int stackOut_71_0 = 0;
        String stackOut_71_1 = null;
        int stackOut_72_0 = 0;
        String stackOut_72_1 = null;
        int stackOut_72_2 = 0;
        int stackOut_74_0 = 0;
        String stackOut_74_1 = null;
        int stackOut_74_2 = 0;
        cc stackOut_81_0 = null;
        cc stackOut_83_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = fc.field_a;
                        var2 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (bc.field_B == 2) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_long = ik.a(4) - di.field_F;
                        var2 = (int)((10999L - var3_long) / 1000L);
                        if (-1 >= (var2 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        field_B = null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var3 >= rk.field_P.length) {
                            statePc = 96;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4 = k.field_g[var3];
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var10 != 0) {
                            statePc = 96;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 > var4) {
                            statePc = 24;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var4 != k.field_f.field_h) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5 = gn.field_a;
                        if (var10 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5 = wa.field_c;
                        if (var10 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5 = wm.field_l;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6 = rk.field_P[var3];
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((bc.field_B ^ -1) != -3) {
                            statePc = 67;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = var2;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((stackIn_28_0 ^ -1) == -2) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (vb.field_U.length <= tg.field_g.length) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = vb.field_U.length;
                        stackIn_37_0 = stackOut_34_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = tg.field_g.length;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var7 = stackIn_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var3 < 6) {
                            statePc = 50;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = var7;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((stackIn_40_0 + 6 ^ -1) >= (var3 ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (-var7 + var3 - (6 - tg.field_g.length) < 0) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = tg.field_g[-6 + (var3 - -tg.field_g.length - var7)];
                        stackIn_49_0 = stackOut_46_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = "";
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var6_ref = stackIn_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (wb.field_Qb.length <= dh.field_b.length) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = wb.field_Qb.length;
                        stackIn_54_0 = stackOut_51_0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = dh.field_b.length;
                        stackIn_54_0 = stackOut_53_0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var8 = stackIn_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((var7 + 7 ^ -1) < (var3 ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = var8;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0 + 7 + var7 <= var3) {
                            statePc = 67;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (-7 + (var3 - var7) >= dh.field_b.length) {
                            statePc = 65;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = dh.field_b[-7 + var3 + -var7];
                        stackIn_66_0 = stackOut_63_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = "";
                        stackIn_66_0 = stackOut_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var6_ref = stackIn_66_0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var4 == -2) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var6_ref = Integer.toString(var2);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = 0;
                        stackOut_71_1 = (String) var6_ref;
                        stackIn_74_0 = stackOut_71_0;
                        stackIn_74_1 = stackOut_71_1;
                        stackIn_72_0 = stackOut_71_0;
                        stackIn_72_1 = stackOut_71_1;
                        if ((var4 ^ -1) > -1) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = stackIn_72_0;
                        stackOut_72_1 = (String) (Object) stackIn_72_1;
                        stackOut_72_2 = 1;
                        stackIn_75_0 = stackOut_72_0;
                        stackIn_75_1 = stackOut_72_1;
                        stackIn_75_2 = stackOut_72_2;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = stackIn_74_0;
                        stackOut_74_1 = (String) (Object) stackIn_74_1;
                        stackOut_74_2 = 0;
                        stackIn_75_0 = stackOut_74_0;
                        stackIn_75_1 = stackOut_74_1;
                        stackIn_75_2 = stackOut_74_2;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var7 = si.a(stackIn_75_0 != 0, stackIn_75_1, stackIn_75_2 != 0);
                        var8 = -(var7 >> -906219967) + qk.field_d;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if ((var4 ^ -1) <= -1) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var1_int = var1_int + qk.field_m;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if ((k.field_f.field_h ^ -1) != (var4 ^ -1)) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackOut_81_0 = nf.field_g;
                        stackIn_84_0 = stackOut_81_0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackOut_83_0 = da.field_c;
                        stackIn_84_0 = stackOut_83_0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var9 = stackIn_84_0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (null != var9) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var9.a(var7 - -(mb.field_c << -795183135), 102, var8 + -mb.field_c, var1_int, (pa.field_Y << 327376481) + cc.field_a);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var1_int = var1_int + pa.field_Y;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (0 <= var4) {
                            statePc = 92;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        rk.field_R.a(var6_ref, var8, nd.field_b + var1_int, var5, -1);
                        var1_int = var1_int + ke.field_d;
                        if (var10 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        bg.field_g.a(var6_ref, var8, a.field_k + var1_int, var5, -1);
                        var1_int = var1_int + (pa.field_Y - (-qk.field_m - cc.field_a));
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var3++;
                        if (var10 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 95: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw dh.a((Throwable) (Object) var1, "cl.D(" + param0 + 41);
                }
                case 96: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(hl param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        hl var3 = null;
        int var4 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        hl stackIn_16_1 = null;
        hl stackIn_20_0 = null;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        hl stackOut_15_1 = null;
        hl stackOut_19_0 = null;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0.field_h != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (param1) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        cl.c((byte) -122);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((param0.field_i ^ -1) != -1) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param0.field_n ^ -1) == -1) {
                            statePc = 28;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_int = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var2_int >= ic.field_c) {
                            statePc = 28;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = pd.field_g[var2_int];
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = -3;
                        stackIn_32_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var4 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = stackIn_15_0;
                        stackOut_15_1 = (hl) var3;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 != (stackIn_16_1.field_m ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = (hl) var3;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((stackIn_20_0.field_i ^ -1) != (param0.field_i ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var3.field_n ^ -1) != (param0.field_n ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return;
                }
                case 27: {
                    try {
                        var2_int++;
                        if (var4 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param0.field_q != null) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        wf.field_o = param0.field_q;
                        he.field_Y = param0.field_o;
                        stackOut_31_0 = param0.field_m;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        uh.field_d = stackIn_32_0;
                        ng.field_a = param0.field_r;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        rb.a(param0, -3);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    try {
                        stackOut_36_0 = (RuntimeException) var2;
                        stackOut_36_1 = new StringBuilder().append("cl.B(");
                        stackIn_39_0 = stackOut_36_0;
                        stackIn_39_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (param0 == null) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                        stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                        stackOut_37_2 = "{...}";
                        stackIn_40_0 = stackOut_37_0;
                        stackIn_40_1 = stackOut_37_1;
                        stackIn_40_2 = stackOut_37_2;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 39: {
                    stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                    stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                    stackOut_39_2 = "null";
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    stackIn_40_2 = stackOut_39_2;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    throw dh.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param1 + 41);
                }
                case 41: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
