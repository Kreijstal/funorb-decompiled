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
        nm stackIn_41_0;
        int stackIn_41_1;
        int stackIn_41_2;
        int stackIn_41_3;
        nm stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackIn_45_0 = 0;
        int stackIn_57_0 = 0;
        w stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        w stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        RuntimeException stackIn_215_0 = null;
        StringBuilder stackIn_215_1 = null;
        RuntimeException stackIn_216_0 = null;
        StringBuilder stackIn_216_1 = null;
        String stackIn_216_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        vj var10 = null;
        int var11_int = 0;
        Object var11 = null;
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
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30 = null;
        int var30_int = 0;
        int var31 = 0;
        hl var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        var31 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              if (param1 == -17339) {
                break L1;
              } else {
                var32 = (hl) null;
                cl.a((hl) null, true);
                break L1;
              }
            }
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
                    L5: {
                      var10_int = 255 & cd.field_m.field_kc[var9];
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
                    if (ik.field_h != null) {
                      L9: {
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
                          if (-1 != (var11_int ^ -1)) {
                            if (!uc.field_a) {
                              var5_int = 1;
                              break L9;
                            } else {
                              break L9;
                            }
                          } else {
                            var9++;
                            continue L4;
                          }
                        } else {
                          break L9;
                        }
                      }
                      var9++;
                      continue L4;
                    } else {
                      var9++;
                      continue L4;
                    }
                  }
                }
              }
            }
            L11: {
              stackIn_41_0 = (nm) (param3);

              stackIn_41_1 = kf.field_O * 2 - -4;

              stackIn_41_2 = param0 * (8 + kf.field_O * 4);

              stackIn_41_3 = param1 + 2109;

              if (param3 != ki.field_w) {
                stackIn_42_0 = (nm) ((Object) stackIn_41_0);
                stackIn_42_1 = stackIn_41_1;
                stackIn_42_2 = stackIn_41_2;
                stackIn_42_3 = stackIn_41_3;
                stackIn_42_4 = 0;
                break L11;
              } else {
                stackIn_42_0 = (nm) ((Object) stackIn_41_0);
                stackIn_42_1 = stackIn_41_1;
                stackIn_42_2 = stackIn_41_2;
                stackIn_42_3 = stackIn_41_3;
                stackIn_42_4 = 1;
                break L11;
              }
            }
            L12: {
              if (!((nm) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4 != 0, 2, param4)) {
                stackIn_45_0 = 0;
                break L12;
              } else {
                stackIn_45_0 = 1;
                break L12;
              }
            }
            var9 = stackIn_45_0;
            var10 = param3.field_Ob.field_M;
            var11 = null;
            var12 = (tj) ((Object) var10.c((byte) 25));
            L13: while (true) {
              if (var12 == null) {
                break L0;
              } else {
                L14: {
                  var13 = 0;
                  if (var12.field_M == null) {
                    L15: {
                      var12.field_Zb = new w(0L, gg.field_G);
                      var12.a(var12.field_Zb, -16834);
                      var12.field_Tb = new w(0L, fc.field_f);
                      if (!pd.field_a) {
                        break L15;
                      } else {
                        var12.a(var12.field_Tb, -16834);
                        break L15;
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
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L16: {
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
                  var33 = var12.field_Yb;
                  var21 = 72;
                  if (ec.field_k != param3) {
                    break L16;
                  } else {
                    var21 += 42;
                    break L16;
                  }
                }
                L17: {
                  var34 = mm.a(var12.field_Zb.field_J, var33, var21);
                  var20 = var34;
                  if (var34.equals(var12.field_Yb)) {
                    stackIn_57_0 = 0;
                    break L17;
                  } else {
                    stackIn_57_0 = 1;
                    break L17;
                  }
                }
                L18: {
                  var22 = stackIn_57_0;
                  if (var12.field_dc >= 4) {
                    var20 = "<img=" + (n.field_c + -4 + var12.field_dc) + ">" + var34;
                    break L18;
                  } else {
                    if (var12.field_dc <= 0) {
                      break L18;
                    } else {
                      var20 = "<img=" + (var12.field_dc - 1) + ">" + var34;
                      break L18;
                    }
                  }
                }
                L19: {
                  var12.field_Zb.field_Y = var20;
                  if (!var12.g((byte) 101)) {
                    L20: {
                      L21: {
                        L22: {
                          var23_int = 16764006;
                          var24_int = 16777215;
                          if (var5_int == 0) {
                            break L22;
                          } else {
                            if (!var12.field_ec) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        if (var12.field_Ub < var6) {
                          break L21;
                        } else {
                          if (var12.field_Xb < var7) {
                            break L21;
                          } else {
                            if (-1 <= ((var12.field_Sb ^ -1) & var8 ^ -1)) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                      var24_int = 8421504;
                      var23_int = 8414771;
                      break L20;
                    }
                    L23: {
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
                        if (!cd.field_m.field_lc) {
                          var12.field_Ob.field_Y = bn.field_a;
                          break L23;
                        } else {
                          break L23;
                        }
                      } else {
                        if (var12.field_bc) {
                          var12.field_Zb.field_Y = cm.a((byte) 116, lb.field_i, new String[]{var20});
                          var12.field_Ob.field_Y = fc.field_g;
                          break L23;
                        } else {
                          if (!var12.field_fc) {
                            var12.field_Wb.field_Y = a.field_l;
                            break L23;
                          } else {
                            var12.field_Zb.field_Y = cm.a((byte) 91, ad.field_A, new String[]{var20});
                            var12.field_Wb.field_Y = uc.field_f;
                            var12.field_Ob.field_Y = ql.field_f;
                            break L23;
                          }
                        }
                      }
                    }
                    L24: {
                      var25_int = 0;
                      if (cd.field_m == null) {
                        break L24;
                      } else {
                        if (!ig.b(true)) {
                          break L24;
                        } else {
                          if ((var12.field_cc ^ -1L) == (uc.field_g ^ -1L)) {
                            break L24;
                          } else {
                            L25: {
                              if (null != var12.field_Wb.field_Y) {
                                var26 = var12.field_Wb.a(true) + nk.field_b * 2;
                                var12.field_Wb.a(var26, 0, var19, kf.field_O, var25_int);
                                var25_int = var25_int + var26;
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            if (null == var12.field_Ob.field_Y) {
                              break L24;
                            } else {
                              L26: {
                                if (param3 != tb.field_b) {
                                  var26 = var12.field_Ob.a(true) - -(2 * nk.field_b);
                                  break L26;
                                } else {
                                  var26 = 40;
                                  break L26;
                                }
                              }
                              var12.field_Ob.a(var26, param1 + 17339, var19, kf.field_O, var25_int);
                              var25_int = var25_int + var26;
                              break L24;
                            }
                          }
                        }
                      }
                    }
                    L27: {
                      stackIn_93_0 = var12.field_Zb;

                      stackIn_93_1 = var12.field_mb;

                      if (pd.field_a) {
                        stackIn_94_0 = (w) ((Object) stackIn_93_0);
                        stackIn_94_1 = stackIn_93_1;
                        stackIn_94_2 = 42;
                        break L27;
                      } else {
                        stackIn_94_0 = (w) ((Object) stackIn_93_0);
                        stackIn_94_1 = stackIn_93_1;
                        stackIn_94_2 = 0;
                        break L27;
                      }
                    }
                    L28: {
                      L29: {
                        ((w) (Object) stackIn_94_0).a(stackIn_94_1 + -stackIn_94_2 + -var25_int, 0, var19, kf.field_O, var25_int);
                        var12.field_Tb.field_Y = Integer.toString(var12.field_Ub);
                        var12.field_Tb.a(40, param1 + 17339, var19, kf.field_O, var12.field_mb + -40);
                        if (!var12.field_Zb.field_jb) {
                          break L29;
                        } else {
                          if (var22 != 0) {
                            sl.field_g = var12.field_Yb;
                            if (null == vj.field_e) {
                              break L28;
                            } else {
                              if (null != vj.field_e[var12.field_dc]) {
                                sl.field_g = sl.field_g + " - " + vj.field_e[var12.field_dc];
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                          } else {
                            break L29;
                          }
                        }
                      }
                      if (!var12.field_Zb.field_jb) {
                        break L28;
                      } else {
                        if (vj.field_e == null) {
                          break L28;
                        } else {
                          if (null != vj.field_e[var12.field_dc]) {
                            sl.field_g = vj.field_e[var12.field_dc];
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                    var19 = var19 + kf.field_O;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L30: {
                  var23 = je.a(var20, var12.field_hc, (byte) -128);
                  var24 = var23;
                  var24 = var23;
                  if (var23 == null) {
                    break L30;
                  } else {
                    var24_int = var12.field_gc.field_J.a(var23, -nk.field_b + var12.field_mb - nk.field_b);
                    var12.field_gc.field_wb = 256 * var12.field_Qb / oa.field_a;
                    var12.field_gc.field_Y = var23;
                    var12.field_gc.a(var12.field_mb + -(nk.field_b * 2), 0, var19, kf.field_O * var24_int, nk.field_b);
                    var19 = var19 + var24_int * kf.field_O;
                    break L30;
                  }
                }
                L31: {
                  if (var9 == 0) {
                    var12.field_F = -var12.field_N + var19;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (var13 != 0) {
                    param3.field_Ob.a((w) (var11), var12, 2, 0);
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (var12.field_ob == 0) {
                    break L33;
                  } else {
                    if (var12.g((byte) 101)) {
                      break L33;
                    } else {
                      if (0 == var12.field_Wb.field_ob) {
                        if (0 != var12.field_Ob.field_ob) {
                          mn.a(true, var12.field_cc, param2);
                          break L33;
                        } else {
                          fl.a(0, var12, param3, he.field_S, 0, param1 ^ 17358, nf.field_h);
                          break L33;
                        }
                      } else {
                        bn.a(var12.field_cc, param2, (byte) -84);
                        break L33;
                      }
                    }
                  }
                }
                L34: {
                  var11 = var12;
                  if (!var12.field_Kb) {
                    break L34;
                  } else {
                    if (var12.g((byte) 111)) {
                      break L34;
                    } else {
                      L35: {
                        var24 = null;
                        if ((uc.field_g ^ -1L) == (var12.field_cc ^ -1L)) {
                          L36: {
                            if (var5_int == 0) {
                              break L36;
                            } else {
                              if (var12.field_ec) {
                                break L36;
                              } else {
                                var24 = rn.field_a;
                                break L35;
                              }
                            }
                          }
                          if (var12.field_Xb >= var7) {
                            if (var12.field_Ub >= var6) {
                              if ((var8 & (var12.field_Sb ^ -1)) == 0) {
                                break L35;
                              } else {
                                var25_int = wb.b((byte) -94, var8 & (var12.field_Sb ^ -1));
                                var24 = tm.field_e;
                                if ((var25_int ^ -1) >= -1) {
                                  break L35;
                                } else {
                                  if (lc.field_e == null) {
                                    break L35;
                                  } else {
                                    if (var25_int > lc.field_e.length) {
                                      break L35;
                                    } else {
                                      if (lc.field_e[-1 + var25_int] == null) {
                                        break L35;
                                      } else {
                                        var24 = lc.field_e[var25_int - 1][1];
                                        break L35;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var24 = cm.a((byte) 90, gd.field_a, new String[]{null, Integer.toString(var6)});
                              break L35;
                            }
                          } else {
                            L37: {
                              var25_int = -var12.field_Xb + var7;
                              if (var25_int == 1) {
                                var24 = oa.field_d;
                                break L37;
                              } else {
                                break L37;
                              }
                            }
                            var24 = cm.a((byte) 118, lb.field_a, new String[]{null, Integer.toString(var25_int)});
                            break L35;
                          }
                        } else {
                          L38: {
                            if (var5_int == 0) {
                              break L38;
                            } else {
                              if (!var12.field_ec) {
                                var24 = cm.a((byte) 92, in.field_s, new String[]{var20});
                                break L35;
                              } else {
                                break L38;
                              }
                            }
                          }
                          if (var12.field_Xb >= var7) {
                            if (var12.field_Ub >= var6) {
                              if (0 != ((var12.field_Sb ^ -1) & var8)) {
                                var25_int = wb.b((byte) -120, var8 & (var12.field_Sb ^ -1));
                                var24 = cm.a((byte) 91, ci.field_f, new String[]{var20});
                                if ((var25_int ^ -1) >= -1) {
                                  break L35;
                                } else {
                                  if (lc.field_e == null) {
                                    break L35;
                                  } else {
                                    if (lc.field_e.length < var25_int) {
                                      break L35;
                                    } else {
                                      if (lc.field_e[var25_int - 1] != null) {
                                        var24 = cm.a((byte) 93, lc.field_e[-1 + var25_int][2], new String[]{var20});
                                        break L35;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L35;
                              }
                            } else {
                              var24 = cm.a((byte) 98, wm.field_i, new String[]{var20, Integer.toString(var6)});
                              break L35;
                            }
                          } else {
                            L39: {
                              var25_int = -var12.field_Xb + var7;
                              if ((var25_int ^ -1) == -2) {
                                var24 = cm.a((byte) 93, qf.field_m, new String[]{var20});
                                break L39;
                              } else {
                                break L39;
                              }
                            }
                            var24 = cm.a((byte) 99, kn.field_n, new String[]{var20, Integer.toString(var25_int)});
                            break L35;
                          }
                        }
                      }
                      if (var24 != null) {
                        var35 = "<col=A00000>" + (String) (var24);
                        var30 = var35;
                        var25 = var30;
                        var24 = var25;
                        var30 = var35;
                        var25 = var30;
                        var25 = null;
                        var26 = 0;
                        var27_int = 0;
                        L40: while (true) {
                          if (var27_int >= j.field_b) {
                            L41: {
                              L42: {
                                if (param3 != tb.field_b) {
                                  break L42;
                                } else {
                                  if (!ig.b(true)) {
                                    break L42;
                                  } else {
                                    if (var26 != 0) {
                                      var24 = var35 + "<br>" + pb.field_k + (String) (var25);
                                      break L41;
                                    } else {
                                      var24 = var35 + "<br>" + cm.a((byte) 111, ci.field_b, new String[]{(String) (var25)});
                                      break L41;
                                    }
                                  }
                                }
                              }
                              if (var26 != 0) {
                                var24 = var35 + "<br>" + am.field_b + (String) (var25);
                                break L41;
                              } else {
                                var24 = var35 + "<br>" + cm.a((byte) 101, fj.field_i, new String[]{(String) (var25)});
                                break L41;
                              }
                            }
                            L43: {
                              if (tb.field_b != param3) {
                                break L43;
                              } else {
                                if (ig.b(true)) {
                                  break L43;
                                } else {
                                  var27 = cd.field_m.field_Vb;
                                  var24 = (String) (var24) + "<br>" + cm.a((byte) 116, jf.field_b, new String[]{var27});
                                  break L43;
                                }
                              }
                            }
                            sl.field_g = (String) (var24);
                            break L34;
                          } else {
                            L44: {
                              var28 = cd.field_m.field_kc[var27_int] & 255;
                              var29 = 0;
                              if (cb.field_e == null) {
                                break L44;
                              } else {
                                if (null == cb.field_e[var27_int]) {
                                  break L44;
                                } else {
                                  if (!cb.field_e[var27_int][var28]) {
                                    break L44;
                                  } else {
                                    if (var12.field_ec) {
                                      break L44;
                                    } else {
                                      var29 = 1;
                                      break L44;
                                    }
                                  }
                                }
                              }
                            }
                            L45: {
                              if (null == mg.field_Ob) {
                                break L45;
                              } else {
                                if (mg.field_Ob[var27_int] != null) {
                                  L46: {
                                    var30_int = mg.field_Ob[var27_int][var28];
                                    if (var30_int == 0) {
                                      break L46;
                                    } else {
                                      if (uc.field_a) {
                                        break L46;
                                      } else {
                                        if (!var12.field_ec) {
                                          var29 = 1;
                                          break L46;
                                        } else {
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                  if (var30_int <= var12.field_Ub) {
                                    break L45;
                                  } else {
                                    var29 = 1;
                                    break L45;
                                  }
                                } else {
                                  break L45;
                                }
                              }
                            }
                            L47: {
                              if (ik.field_h == null) {
                                break L47;
                              } else {
                                if (ik.field_h[var27_int] == null) {
                                  break L47;
                                } else {
                                  L48: {
                                    var30_int = ik.field_h[var27_int][var28];
                                    if (0 == var30_int) {
                                      break L48;
                                    } else {
                                      if (uc.field_a) {
                                        break L48;
                                      } else {
                                        if (!var12.field_ec) {
                                          var29 = 1;
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                  }
                                  if (var30_int <= var12.field_Xb) {
                                    break L47;
                                  } else {
                                    var29 = 1;
                                    break L47;
                                  }
                                }
                              }
                            }
                            L49: {
                              if (null == af.field_b) {
                                break L49;
                              } else {
                                if (af.field_b[var27_int] != null) {
                                  if (((var12.field_Sb ^ -1) & af.field_b[var27_int][var28]) == 0) {
                                    break L49;
                                  } else {
                                    var29 = 1;
                                    break L49;
                                  }
                                } else {
                                  break L49;
                                }
                              }
                            }
                            if (var29 != 0) {
                              L50: {
                                var30 = "<col=A00000>" + pa.field_db[var27_int] + "</col>";
                                var25 = var30;
                                var24 = var25;
                                var25 = var30;
                                if (var25 != null) {
                                  var26 = 1;
                                  var25 = (String) (var25) + ", " + var30;
                                  var24 = var25;
                                  var24 = var25;
                                  break L50;
                                } else {
                                  var25 = var30;
                                  break L50;
                                }
                              }
                              var27_int++;
                              continue L40;
                            } else {
                              var27_int++;
                              continue L40;
                            }
                          }
                        }
                      } else {
                        break L34;
                      }
                    }
                  }
                }
                var12 = (tj) ((Object) var10.d(true));
                continue L13;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L51: {
            var5 = decompiledCaughtException;
            stackIn_215_0 = (RuntimeException) (var5);

            stackIn_215_1 = new StringBuilder().append("cl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_216_0 = (RuntimeException) ((Object) stackIn_215_0);
              stackIn_216_1 = (StringBuilder) ((Object) stackIn_215_1);
              stackIn_216_2 = "null";
              break L51;
            } else {
              stackIn_216_0 = (RuntimeException) ((Object) stackIn_215_0);
              stackIn_216_1 = (StringBuilder) ((Object) stackIn_215_1);
              stackIn_216_2 = "{...}";
              break L51;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_216_0), stackIn_216_2 + ',' + param4 + ')');
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
            throw dh.a((Throwable) ((Object) runtimeException), "cl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
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
        field_C = null;
        field_n = null;
        field_s = null;
    }

    final static void a(boolean param0) {
        int stackIn_19_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        cc stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
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
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = fc.field_a;
              var2 = 0;
              if (bc.field_B == 2) {
                var3_long = ik.a(4) - di.field_F;
                var2 = (int)((10999L - var3_long) / 1000L);
                if (-1 >= (var2 ^ -1)) {
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
                field_B = (ke) null;
                break L2;
              }
            }
            L3: while (true) {
              if (var3 >= rk.field_P.length) {
                break L0;
              } else {
                L4: {
                  var4 = k.field_g[var3];
                  if (0 > var4) {
                    var5 = wm.field_l;
                    break L4;
                  } else {
                    if (var4 != k.field_f.field_h) {
                      var5 = wa.field_c;
                      break L4;
                    } else {
                      var5 = gn.field_a;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = rk.field_P[var3];
                  if ((bc.field_B ^ -1) != -3) {
                    break L5;
                  } else {
                    if ((var2 ^ -1) == -2) {
                      L6: {
                        if (vb.field_U.length <= tg.field_g.length) {
                          stackIn_19_0 = tg.field_g.length;
                          break L6;
                        } else {
                          stackIn_19_0 = vb.field_U.length;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_19_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (var7 + 6 <= var3) {
                            break L7;
                          } else {
                            L8: {
                              if (-var7 + var3 - (6 - tg.field_g.length) < 0) {
                                stackIn_24_0 = "";
                                break L8;
                              } else {
                                stackIn_24_0 = tg.field_g[-6 + (var3 - -tg.field_g.length - var7)];
                                break L8;
                              }
                            }
                            var6 = stackIn_24_0;
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (wb.field_Qb.length <= dh.field_b.length) {
                          stackIn_28_0 = dh.field_b.length;
                          break L9;
                        } else {
                          stackIn_28_0 = wb.field_Qb.length;
                          break L9;
                        }
                      }
                      var8 = stackIn_28_0;
                      if (var7 + 7 > var3) {
                        break L5;
                      } else {
                        if (var8 + 7 + var7 <= var3) {
                          break L5;
                        } else {
                          L10: {
                            if (-7 + (var3 - var7) >= dh.field_b.length) {
                              stackIn_33_0 = "";
                              break L10;
                            } else {
                              stackIn_33_0 = dh.field_b[-7 + var3 + -var7];
                              break L10;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                L11: {
                  if (var4 == -2) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  stackIn_39_0 = 0;

                  stackIn_39_1 = (String) (var6);

                  if ((var4 ^ -1) > -1) {
                    stackIn_40_0 = stackIn_39_0;
                    stackIn_40_1 = (String) ((Object) stackIn_39_1);
                    stackIn_40_2 = 0;
                    break L12;
                  } else {
                    stackIn_40_0 = stackIn_39_0;
                    stackIn_40_1 = (String) ((Object) stackIn_39_1);
                    stackIn_40_2 = 1;
                    break L12;
                  }
                }
                L13: {
                  var7 = si.a(stackIn_40_0 != 0, stackIn_40_1, stackIn_40_2 != 0);
                  var8 = -(var7 >> -906219967) + qk.field_d;
                  if ((var4 ^ -1) <= -1) {
                    L14: {
                      var1_int = var1_int + qk.field_m;
                      if (k.field_f.field_h != var4) {
                        stackIn_45_0 = da.field_c;
                        break L14;
                      } else {
                        stackIn_45_0 = nf.field_g;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_45_0;
                      if (var9 != null) {
                        var9.a(var7 - -(mb.field_c << -795183135), 102, var8 + -mb.field_c, var1_int, (pa.field_Y << 327376481) + cc.field_a);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var1_int = var1_int + pa.field_Y;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  if (0 <= var4) {
                    bg.field_g.a(var6, var8, a.field_k + var1_int, var5, -1);
                    var1_int = var1_int + (pa.field_Y - (-qk.field_m - cc.field_a));
                    break L16;
                  } else {
                    rk.field_R.a(var6, var8, nd.field_b + var1_int, var5, -1);
                    var1_int = var1_int + ke.field_d;
                    break L16;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "cl.D(" + param0 + ')');
        }
    }

    final static void a(hl param0, boolean param1) {
        int var2_int = 0;
        hl var3 = null;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0.field_h != null) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  cl.c((byte) -122);
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (param0.field_i != 0) {
                    break L3;
                  } else {
                    if (param0.field_n == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var2_int = 0;
                L4: while (true) {
                  if (var2_int >= ic.field_c) {
                    break L2;
                  } else {
                    L5: {
                      var3 = pd.field_g[var2_int];
                      if (-3 != (var3.field_m ^ -1)) {
                        break L5;
                      } else {
                        if (var3.field_i != param0.field_i) {
                          break L5;
                        } else {
                          if (var3.field_n != param0.field_n) {
                            break L5;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L4;
                  }
                }
              }
              L6: {
                if (param0.field_q != null) {
                  wf.field_o = param0.field_q;
                  he.field_Y = param0.field_o;
                  uh.field_d = param0.field_m;
                  ng.field_a = param0.field_r;
                  break L6;
                } else {
                  break L6;
                }
              }
              rb.a(param0, -3);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("cl.B(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    cl() {
    }

    static {
        field_s = "Rated game";
    }
}
