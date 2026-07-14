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
        Object var11 = null;
        int var11_int = 0;
        tj var11_ref = null;
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
        Object var24 = null;
        String var24_ref = null;
        int var25_int = 0;
        Object var25 = null;
        String var25_ref = null;
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
                      param3.field_Ob.a((w) var11, (w) (Object) var12, 2, 0);
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
                    var11_ref = var12;
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
                                  var24_ref = rn.field_a;
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
                                  var24_ref = tm.field_e;
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
                                var24_ref = cm.a((byte) 90, gd.field_a, new String[2]);
                                break L44;
                              }
                            } else {
                              L46: {
                                var25_int = -var12.field_Xb + var7;
                                if (var25_int == 1) {
                                  var24_ref = oa.field_d;
                                  break L46;
                                } else {
                                  break L46;
                                }
                              }
                              var24_ref = cm.a((byte) 118, lb.field_a, new String[2]);
                              break L44;
                            }
                          } else {
                            L47: {
                              if (var5_int == 0) {
                                break L47;
                              } else {
                                if (!var12.field_ec) {
                                  var24_ref = cm.a((byte) 92, in.field_s, new String[1]);
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
                                    var24_ref = cm.a((byte) 91, ci.field_f, new String[1]);
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
                                            var24_ref = cm.a((byte) 93, lc.field_e[-1 + var25_int][2], new String[1]);
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
                                var24_ref = cm.a((byte) 98, wm.field_i, new String[2]);
                                break L44;
                              }
                            } else {
                              L49: {
                                var25_int = -var12.field_Xb + var7;
                                if ((var25_int ^ -1) == -2) {
                                  var24_ref = cm.a((byte) 93, qf.field_m, new String[1]);
                                  break L49;
                                } else {
                                  break L49;
                                }
                              }
                              var24_ref = cm.a((byte) 99, kn.field_n, new String[2]);
                              break L44;
                            }
                          }
                        }
                        if (var24_ref != null) {
                          var24_ref = "<col=A00000>" + var24_ref;
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
                                              var25_ref = var30;
                                              if (var31 == 0) {
                                                break L60;
                                              } else {
                                                break L61;
                                              }
                                            }
                                          }
                                          var26 = 1;
                                          var25_ref = var25_ref + ", " + var30;
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
                                        var24_ref = var24_ref + "<br>" + cm.a((byte) 111, ci.field_b, new String[1]);
                                        if (var31 == 0) {
                                          break L51;
                                        } else {
                                          break L62;
                                        }
                                      }
                                    }
                                    var24_ref = var24_ref + "<br>" + pb.field_k + var25_ref;
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
                                  var24_ref = var24_ref + "<br>" + cm.a((byte) 101, fj.field_i, new String[1]);
                                  if (var31 == 0) {
                                    break L51;
                                  } else {
                                    break L63;
                                  }
                                }
                              }
                              var24_ref = var24_ref + "<br>" + am.field_b + var25_ref;
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
                                  var24_ref = var24_ref + "<br>" + cm.a((byte) 116, jf.field_b, new String[1]);
                                  break L64;
                                }
                              }
                            }
                            sl.field_g = var24_ref;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          wj.field_Mb.field_G = param2;
          wj.field_Mb.field_T = param0;
          wj.field_Mb.field_mb = wj.field_Mb.field_mb + jb.field_f.field_mb;
          wj.field_Mb.field_Y = param3;
          jb.field_f.field_vb = jb.field_f.field_vb + jb.field_f.field_mb;
          if (param4 == -24503) {
            jb.field_f.field_mb = param1;
            wj.field_Mb.field_mb = wj.field_Mb.field_mb - jb.field_f.field_mb;
            jb.field_f.field_vb = jb.field_f.field_vb - jb.field_f.field_mb;
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("cl.E(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L0;
            }
          }
          L1: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param4 + 41);
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
        int var7 = 0;
        int var8 = 0;
        cc var9 = null;
        int var10 = 0;
        int stackIn_30_0 = 0;
        String stackIn_40_0 = null;
        int stackIn_45_0 = 0;
        String stackIn_55_0 = null;
        int stackIn_61_0 = 0;
        String stackIn_61_1 = null;
        int stackIn_63_0 = 0;
        String stackIn_63_1 = null;
        int stackIn_64_0 = 0;
        String stackIn_64_1 = null;
        int stackIn_64_2 = 0;
        cc stackIn_71_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        String stackOut_39_0 = null;
        String stackOut_37_0 = null;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        String stackOut_54_0 = null;
        String stackOut_52_0 = null;
        int stackOut_60_0 = 0;
        String stackOut_60_1 = null;
        int stackOut_63_0 = 0;
        String stackOut_63_1 = null;
        int stackOut_63_2 = 0;
        int stackOut_61_0 = 0;
        String stackOut_61_1 = null;
        int stackOut_61_2 = 0;
        cc stackOut_70_0 = null;
        cc stackOut_68_0 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            var1_int = fc.field_a;
            var2 = 0;
            if (bc.field_B == 2) {
              var3_long = ik.a(4) - di.field_F;
              var2 = (int)((10999L - var3_long) / 1000L);
              if (-1 >= (var2 ^ -1)) {
                break L0;
              } else {
                var2 = 0;
                break L0;
              }
            } else {
              break L0;
            }
          }
          L1: {
            var3 = 0;
            if (param0) {
              break L1;
            } else {
              field_B = null;
              break L1;
            }
          }
          L2: while (true) {
            L3: {
              L4: {
                if (var3 >= rk.field_P.length) {
                  break L4;
                } else {
                  var4 = k.field_g[var3];
                  if (var10 != 0) {
                    break L3;
                  } else {
                    L5: {
                      L6: {
                        if (0 > var4) {
                          break L6;
                        } else {
                          L7: {
                            if (var4 != k.field_f.field_h) {
                              break L7;
                            } else {
                              var5 = gn.field_a;
                              if (var10 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var5 = wa.field_c;
                          if (var10 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var5 = wm.field_l;
                      break L5;
                    }
                    L8: {
                      var6 = rk.field_P[var3];
                      if ((bc.field_B ^ -1) != -3) {
                        break L8;
                      } else {
                        if ((var2 ^ -1) == -2) {
                          L9: {
                            if (vb.field_U.length <= tg.field_g.length) {
                              stackOut_29_0 = tg.field_g.length;
                              stackIn_30_0 = stackOut_29_0;
                              break L9;
                            } else {
                              stackOut_27_0 = vb.field_U.length;
                              stackIn_30_0 = stackOut_27_0;
                              break L9;
                            }
                          }
                          L10: {
                            var7 = stackIn_30_0;
                            if (var3 < 6) {
                              break L10;
                            } else {
                              if ((var7 + 6 ^ -1) >= (var3 ^ -1)) {
                                break L10;
                              } else {
                                L11: {
                                  if (-var7 + var3 - (6 - tg.field_g.length) < 0) {
                                    stackOut_39_0 = "";
                                    stackIn_40_0 = stackOut_39_0;
                                    break L11;
                                  } else {
                                    stackOut_37_0 = tg.field_g[-6 + (var3 - -tg.field_g.length - var7)];
                                    stackIn_40_0 = stackOut_37_0;
                                    break L11;
                                  }
                                }
                                var6 = stackIn_40_0;
                                break L10;
                              }
                            }
                          }
                          L12: {
                            if (wb.field_Qb.length <= dh.field_b.length) {
                              stackOut_44_0 = dh.field_b.length;
                              stackIn_45_0 = stackOut_44_0;
                              break L12;
                            } else {
                              stackOut_42_0 = wb.field_Qb.length;
                              stackIn_45_0 = stackOut_42_0;
                              break L12;
                            }
                          }
                          var8 = stackIn_45_0;
                          if ((var7 + 7 ^ -1) < (var3 ^ -1)) {
                            break L8;
                          } else {
                            if (var8 + 7 + var7 <= var3) {
                              break L8;
                            } else {
                              L13: {
                                if (-7 + (var3 - var7) >= dh.field_b.length) {
                                  stackOut_54_0 = "";
                                  stackIn_55_0 = stackOut_54_0;
                                  break L13;
                                } else {
                                  stackOut_52_0 = dh.field_b[-7 + var3 + -var7];
                                  stackIn_55_0 = stackOut_52_0;
                                  break L13;
                                }
                              }
                              var6 = stackIn_55_0;
                              break L8;
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    L14: {
                      if (var4 == -2) {
                        var6 = Integer.toString(var2);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      stackOut_60_0 = 0;
                      stackOut_60_1 = (String) var6;
                      stackIn_63_0 = stackOut_60_0;
                      stackIn_63_1 = stackOut_60_1;
                      stackIn_61_0 = stackOut_60_0;
                      stackIn_61_1 = stackOut_60_1;
                      if ((var4 ^ -1) > -1) {
                        stackOut_63_0 = stackIn_63_0;
                        stackOut_63_1 = (String) (Object) stackIn_63_1;
                        stackOut_63_2 = 0;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        stackIn_64_2 = stackOut_63_2;
                        break L15;
                      } else {
                        stackOut_61_0 = stackIn_61_0;
                        stackOut_61_1 = (String) (Object) stackIn_61_1;
                        stackOut_61_2 = 1;
                        stackIn_64_0 = stackOut_61_0;
                        stackIn_64_1 = stackOut_61_1;
                        stackIn_64_2 = stackOut_61_2;
                        break L15;
                      }
                    }
                    L16: {
                      var7 = si.a(stackIn_64_0 != 0, stackIn_64_1, stackIn_64_2 != 0);
                      var8 = -(var7 >> -906219967) + qk.field_d;
                      if ((var4 ^ -1) <= -1) {
                        L17: {
                          var1_int = var1_int + qk.field_m;
                          if ((k.field_f.field_h ^ -1) != (var4 ^ -1)) {
                            stackOut_70_0 = da.field_c;
                            stackIn_71_0 = stackOut_70_0;
                            break L17;
                          } else {
                            stackOut_68_0 = nf.field_g;
                            stackIn_71_0 = stackOut_68_0;
                            break L17;
                          }
                        }
                        L18: {
                          var9 = stackIn_71_0;
                          if (null != var9) {
                            var9.a(var7 - -(mb.field_c << -795183135), 102, var8 + -mb.field_c, var1_int, (pa.field_Y << 327376481) + cc.field_a);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        var1_int = var1_int + pa.field_Y;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L19: {
                      L20: {
                        if (0 <= var4) {
                          break L20;
                        } else {
                          rk.field_R.a(var6, var8, nd.field_b + var1_int, var5, -1);
                          var1_int = var1_int + ke.field_d;
                          if (var10 == 0) {
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                      bg.field_g.a(var6, var8, a.field_k + var1_int, var5, -1);
                      var1_int = var1_int + (pa.field_Y - (-qk.field_m - cc.field_a));
                      break L19;
                    }
                    var3++;
                    if (var10 == 0) {
                      continue L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              break L3;
            }
            break L2;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "cl.D(" + param0 + 41);
        }
    }

    final static void a(hl param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        hl var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          if (param0.field_h != null) {
            L0: {
              if (param1) {
                break L0;
              } else {
                cl.c((byte) -122);
                break L0;
              }
            }
            L1: {
              L2: {
                L3: {
                  L4: {
                    if ((param0.field_i ^ -1) != -1) {
                      break L4;
                    } else {
                      if ((param0.field_n ^ -1) == -1) {
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
                      stackOut_12_0 = -3;
                      stackIn_28_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L6: {
                          if (stackIn_13_0 != (var3.field_m ^ -1)) {
                            break L6;
                          } else {
                            if ((var3.field_i ^ -1) != (param0.field_i ^ -1)) {
                              break L6;
                            } else {
                              if ((var3.field_n ^ -1) != (param0.field_n ^ -1)) {
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
                  stackOut_27_0 = param0.field_m;
                  stackIn_28_0 = stackOut_27_0;
                  break L2;
                } else {
                  break L1;
                }
              }
              uh.field_d = stackIn_28_0;
              ng.field_a = param0.field_r;
              break L1;
            }
            rb.a(param0, -3);
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("cl.B(");
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L7;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + param1 + 41);
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
