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
        String var30_ref_String = null;
        int var30 = 0;
        int var31 = 0;
        nm stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        nm stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        nm stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_31_0 = 0;
        int stackIn_43_0 = 0;
        w stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        w stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        w stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        nm stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        nm stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        nm stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        w stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        w stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        w stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        L0: {
          var31 = client.field_A ? 1 : 0;
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (cd.field_m == null) {
            break L0;
          } else {
            L1: {
              if (cb.field_e != null) {
                break L1;
              } else {
                if (mg.field_Ob != null) {
                  break L1;
                } else {
                  if (ik.field_h != null) {
                    break L1;
                  } else {
                    if (null != af.field_b) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            var9 = 0;
            L2: while (true) {
              if (j.field_b <= var9) {
                break L0;
              } else {
                L3: {
                  var10_int = 255 & cd.field_m.field_kc[var9];
                  if (cb.field_e == null) {
                    break L3;
                  } else {
                    if (cb.field_e[var9] == null) {
                      break L3;
                    } else {
                      if (!cb.field_e[var9][var10_int]) {
                        break L3;
                      } else {
                        var5_int = 1;
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (mg.field_Ob == null) {
                    break L4;
                  } else {
                    if (null != mg.field_Ob[var9]) {
                      L5: {
                        var11_int = mg.field_Ob[var9][var10_int];
                        if (var11_int == 0) {
                          break L5;
                        } else {
                          if (uc.field_a) {
                            break L5;
                          } else {
                            var5_int = 1;
                            break L5;
                          }
                        }
                      }
                      if (var11_int <= var6) {
                        break L4;
                      } else {
                        var6 = var11_int;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  if (af.field_b == null) {
                    break L6;
                  } else {
                    if (null == af.field_b[var9]) {
                      break L6;
                    } else {
                      var8 = var8 | af.field_b[var9][var10_int];
                      break L6;
                    }
                  }
                }
                L7: {
                  if (ik.field_h == null) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        }
        L8: {
          stackOut_25_0 = (nm) param3;
          stackOut_25_1 = kf.field_O * 2 - -4;
          stackOut_25_2 = param0 * (8 + kf.field_O * 4);
          stackOut_25_3 = -15230;
          stackIn_27_0 = stackOut_25_0;
          stackIn_27_1 = stackOut_25_1;
          stackIn_27_2 = stackOut_25_2;
          stackIn_27_3 = stackOut_25_3;
          stackIn_26_0 = stackOut_25_0;
          stackIn_26_1 = stackOut_25_1;
          stackIn_26_2 = stackOut_25_2;
          stackIn_26_3 = stackOut_25_3;
          if (param3 != ki.field_w) {
            stackOut_27_0 = (nm) (Object) stackIn_27_0;
            stackOut_27_1 = stackIn_27_1;
            stackOut_27_2 = stackIn_27_2;
            stackOut_27_3 = stackIn_27_3;
            stackOut_27_4 = 0;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            stackIn_28_2 = stackOut_27_2;
            stackIn_28_3 = stackOut_27_3;
            stackIn_28_4 = stackOut_27_4;
            break L8;
          } else {
            stackOut_26_0 = (nm) (Object) stackIn_26_0;
            stackOut_26_1 = stackIn_26_1;
            stackOut_26_2 = stackIn_26_2;
            stackOut_26_3 = stackIn_26_3;
            stackOut_26_4 = 1;
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_28_2 = stackOut_26_2;
            stackIn_28_3 = stackOut_26_3;
            stackIn_28_4 = stackOut_26_4;
            break L8;
          }
        }
        L9: {
          if (((nm) (Object) stackIn_28_0).a(stackIn_28_1, stackIn_28_2, stackIn_28_3, stackIn_28_4 == 0, 2, param4)) {
            stackOut_30_0 = 0;
            stackIn_31_0 = stackOut_30_0;
            break L9;
          } else {
            stackOut_29_0 = 1;
            stackIn_31_0 = stackOut_29_0;
            break L9;
          }
        }
        var9 = stackIn_31_0;
        var10 = param3.field_Ob.field_M;
        var11 = null;
        var12 = (tj) (Object) var10.c((byte) 25);
        L10: while (true) {
          if (var12 == null) {
            return;
          } else {
            L11: {
              var13 = 0;
              if (var12.field_M == null) {
                L12: {
                  var12.field_Zb = new w(0L, gg.field_G);
                  var12.a(var12.field_Zb, -16834);
                  var12.field_Tb = new w(0L, fc.field_f);
                  if (!pd.field_a) {
                    break L12;
                  } else {
                    var12.a(var12.field_Tb, -16834);
                    break L12;
                  }
                }
                var12.field_Tb.field_X = 2;
                var12.field_gc = new w(0L, ua.field_H);
                var12.a(var12.field_gc, -16834);
                var12.d(-117);
                var12.field_Wb = new w(0L, lj.field_c);
                var12.a(var12.field_Wb, -16834);
                var12.field_Ob = new w(0L, gk.field_Hb);
                var12.a(var12.field_Ob, -16834);
                var13 = 1;
                break L11;
              } else {
                break L11;
              }
            }
            L13: {
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
                break L13;
              } else {
                var21 += 42;
                break L13;
              }
            }
            L14: {
              var20 = mm.a(var12.field_Zb.field_J, var20, var21);
              if (var20.equals((Object) (Object) var12.field_Yb)) {
                stackOut_42_0 = 0;
                stackIn_43_0 = stackOut_42_0;
                break L14;
              } else {
                stackOut_41_0 = 1;
                stackIn_43_0 = stackOut_41_0;
                break L14;
              }
            }
            L15: {
              var22 = stackIn_43_0;
              if (var12.field_dc >= 4) {
                var20 = "<img=" + (n.field_c + -4 + var12.field_dc) + ">" + var20;
                break L15;
              } else {
                if (var12.field_dc <= 0) {
                  break L15;
                } else {
                  var20 = "<img=" + (var12.field_dc - 1) + ">" + var20;
                  break L15;
                }
              }
            }
            L16: {
              var12.field_Zb.field_Y = var20;
              if (!var12.g((byte) 101)) {
                L17: {
                  L18: {
                    L19: {
                      var23_int = 16764006;
                      var24_int = 16777215;
                      if (var5_int == 0) {
                        break L19;
                      } else {
                        if (!var12.field_ec) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    if (var12.field_Ub < var6) {
                      break L18;
                    } else {
                      if (var12.field_Xb < var7) {
                        break L18;
                      } else {
                        if (-1 >= (var12.field_Sb & var8)) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  var24_int = 8421504;
                  var23_int = 8414771;
                  break L17;
                }
                L20: {
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
                      break L20;
                    } else {
                      break L20;
                    }
                  } else {
                    if (var12.field_bc) {
                      var12.field_Zb.field_Y = cm.a((byte) 116, lb.field_i, new String[1]);
                      var12.field_Ob.field_Y = fc.field_g;
                      break L20;
                    } else {
                      if (!var12.field_fc) {
                        var12.field_Wb.field_Y = a.field_l;
                        break L20;
                      } else {
                        var12.field_Zb.field_Y = cm.a((byte) 91, ad.field_A, new String[1]);
                        var12.field_Wb.field_Y = uc.field_f;
                        var12.field_Ob.field_Y = ql.field_f;
                        break L20;
                      }
                    }
                  }
                }
                L21: {
                  var25_int = 0;
                  if (cd.field_m == null) {
                    break L21;
                  } else {
                    int discarded$4 = 1;
                    if (!ig.b()) {
                      break L21;
                    } else {
                      if (~var12.field_cc == ~uc.field_g) {
                        break L21;
                      } else {
                        L22: {
                          if (null != var12.field_Wb.field_Y) {
                            var26 = var12.field_Wb.a(true) + nk.field_b * 2;
                            var12.field_Wb.a(var26, 0, var19, kf.field_O, var25_int);
                            var25_int = var25_int + var26;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        if (null == var12.field_Ob.field_Y) {
                          break L21;
                        } else {
                          L23: {
                            if (param3 != tb.field_b) {
                              var26 = var12.field_Ob.a(true) - -(2 * nk.field_b);
                              break L23;
                            } else {
                              var26 = 40;
                              break L23;
                            }
                          }
                          var12.field_Ob.a(var26, 0, var19, kf.field_O, var25_int);
                          var25_int = var25_int + var26;
                          break L21;
                        }
                      }
                    }
                  }
                }
                L24: {
                  stackOut_77_0 = var12.field_Zb;
                  stackOut_77_1 = var12.field_mb;
                  stackIn_79_0 = stackOut_77_0;
                  stackIn_79_1 = stackOut_77_1;
                  stackIn_78_0 = stackOut_77_0;
                  stackIn_78_1 = stackOut_77_1;
                  if (pd.field_a) {
                    stackOut_79_0 = (w) (Object) stackIn_79_0;
                    stackOut_79_1 = stackIn_79_1;
                    stackOut_79_2 = 42;
                    stackIn_80_0 = stackOut_79_0;
                    stackIn_80_1 = stackOut_79_1;
                    stackIn_80_2 = stackOut_79_2;
                    break L24;
                  } else {
                    stackOut_78_0 = (w) (Object) stackIn_78_0;
                    stackOut_78_1 = stackIn_78_1;
                    stackOut_78_2 = 0;
                    stackIn_80_0 = stackOut_78_0;
                    stackIn_80_1 = stackOut_78_1;
                    stackIn_80_2 = stackOut_78_2;
                    break L24;
                  }
                }
                L25: {
                  L26: {
                    ((w) (Object) stackIn_80_0).a(stackIn_80_1 + -stackIn_80_2 + -var25_int, 0, var19, kf.field_O, var25_int);
                    var12.field_Tb.field_Y = Integer.toString(var12.field_Ub);
                    var12.field_Tb.a(40, 0, var19, kf.field_O, var12.field_mb + -40);
                    if (!var12.field_Zb.field_jb) {
                      break L26;
                    } else {
                      if (var22 != 0) {
                        sl.field_g = var12.field_Yb;
                        if (null == vj.field_e) {
                          break L25;
                        } else {
                          if (null != vj.field_e[var12.field_dc]) {
                            sl.field_g = sl.field_g + " - " + vj.field_e[var12.field_dc];
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                      } else {
                        break L26;
                      }
                    }
                  }
                  if (!var12.field_Zb.field_jb) {
                    break L25;
                  } else {
                    if (vj.field_e == null) {
                      break L25;
                    } else {
                      if (null != vj.field_e[var12.field_dc]) {
                        sl.field_g = vj.field_e[var12.field_dc];
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                }
                var19 = var19 + kf.field_O;
                break L16;
              } else {
                break L16;
              }
            }
            L27: {
              var23 = je.a(var20, var12.field_hc, (byte) -128);
              var24 = var23;
              var24 = var23;
              if (var23 == null) {
                break L27;
              } else {
                var24_int = var12.field_gc.field_J.a(var23, -nk.field_b + var12.field_mb - nk.field_b);
                var12.field_gc.field_wb = 256 * var12.field_Qb / oa.field_a;
                var12.field_gc.field_Y = var23;
                var12.field_gc.a(var12.field_mb + -(nk.field_b * 2), 0, var19, kf.field_O * var24_int, nk.field_b);
                var19 = var19 + var24_int * kf.field_O;
                break L27;
              }
            }
            L28: {
              if (var9 == 0) {
                var12.field_F = -var12.field_N + var19;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (var13 != 0) {
                param3.field_Ob.a((w) var11, (w) (Object) var12, 2, 0);
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (var12.field_ob == 0) {
                break L30;
              } else {
                if (var12.g((byte) 101)) {
                  break L30;
                } else {
                  if (0 == var12.field_Wb.field_ob) {
                    if (0 != var12.field_Ob.field_ob) {
                      mn.a(true, var12.field_cc, param2);
                      break L30;
                    } else {
                      fl.a(0, var12, param3, he.field_S, 0, -117, nf.field_h);
                      break L30;
                    }
                  } else {
                    int discarded$5 = -84;
                    bn.a(var12.field_cc, param2);
                    break L30;
                  }
                }
              }
            }
            L31: {
              var11 = (Object) (Object) var12;
              if (!var12.field_Kb) {
                break L31;
              } else {
                if (var12.g((byte) 111)) {
                  break L31;
                } else {
                  L32: {
                    var24 = null;
                    if (~uc.field_g == ~var12.field_cc) {
                      L33: {
                        if (var5_int == 0) {
                          break L33;
                        } else {
                          if (var12.field_ec) {
                            break L33;
                          } else {
                            var24 = rn.field_a;
                            break L32;
                          }
                        }
                      }
                      if (var12.field_Xb >= var7) {
                        if (var12.field_Ub >= var6) {
                          if ((var8 & ~var12.field_Sb) == 0) {
                            break L32;
                          } else {
                            var25_int = wb.b((byte) -94, var8 & ~var12.field_Sb);
                            var24 = tm.field_e;
                            if (var25_int <= 0) {
                              break L32;
                            } else {
                              if (lc.field_e == null) {
                                break L32;
                              } else {
                                if (var25_int > lc.field_e.length) {
                                  break L32;
                                } else {
                                  if (lc.field_e[-1 + var25_int] == null) {
                                    break L32;
                                  } else {
                                    var24 = lc.field_e[var25_int - 1][1];
                                    break L32;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var24 = cm.a((byte) 90, gd.field_a, new String[2]);
                          break L32;
                        }
                      } else {
                        L34: {
                          var25_int = -var12.field_Xb + var7;
                          if (var25_int == 1) {
                            var24 = oa.field_d;
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        var24 = cm.a((byte) 118, lb.field_a, new String[2]);
                        break L32;
                      }
                    } else {
                      L35: {
                        if (var5_int == 0) {
                          break L35;
                        } else {
                          if (!var12.field_ec) {
                            var24 = cm.a((byte) 92, in.field_s, new String[1]);
                            break L32;
                          } else {
                            break L35;
                          }
                        }
                      }
                      if (var12.field_Xb >= var7) {
                        if (var12.field_Ub >= var6) {
                          if (0 != (~var12.field_Sb & var8)) {
                            var25_int = wb.b((byte) -120, var8 & ~var12.field_Sb);
                            var24 = cm.a((byte) 91, ci.field_f, new String[1]);
                            if (var25_int <= 0) {
                              break L32;
                            } else {
                              if (lc.field_e == null) {
                                break L32;
                              } else {
                                if (lc.field_e.length < var25_int) {
                                  break L32;
                                } else {
                                  if (lc.field_e[var25_int - 1] != null) {
                                    var24 = cm.a((byte) 93, lc.field_e[-1 + var25_int][2], new String[1]);
                                    break L32;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                            }
                          } else {
                            break L32;
                          }
                        } else {
                          var24 = cm.a((byte) 98, wm.field_i, new String[2]);
                          break L32;
                        }
                      } else {
                        L36: {
                          var25_int = -var12.field_Xb + var7;
                          if (var25_int == 1) {
                            var24 = cm.a((byte) 93, qf.field_m, new String[1]);
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                        var24 = cm.a((byte) 99, kn.field_n, new String[2]);
                        break L32;
                      }
                    }
                  }
                  if (var24 != null) {
                    var24 = "<col=A00000>" + var24;
                    var30_ref_String = var24;
                    var25 = var30_ref_String;
                    var24 = var25;
                    var30_ref_String = var24;
                    var25 = var30_ref_String;
                    var25 = null;
                    var26 = 0;
                    var27_int = 0;
                    L37: while (true) {
                      if (var27_int >= j.field_b) {
                        L38: {
                          L39: {
                            if (param3 != tb.field_b) {
                              break L39;
                            } else {
                              int discarded$6 = 1;
                              if (!ig.b()) {
                                break L39;
                              } else {
                                if (var26 != 0) {
                                  var24 = var24 + "<br>" + pb.field_k + var25;
                                  break L38;
                                } else {
                                  var24 = var24 + "<br>" + cm.a((byte) 111, ci.field_b, new String[1]);
                                  break L38;
                                }
                              }
                            }
                          }
                          if (var26 != 0) {
                            var24 = var24 + "<br>" + am.field_b + var25;
                            break L38;
                          } else {
                            var24 = var24 + "<br>" + cm.a((byte) 101, fj.field_i, new String[1]);
                            break L38;
                          }
                        }
                        L40: {
                          if (tb.field_b != param3) {
                            break L40;
                          } else {
                            int discarded$7 = 1;
                            if (ig.b()) {
                              break L40;
                            } else {
                              var27 = cd.field_m.field_Vb;
                              var24 = var24 + "<br>" + cm.a((byte) 116, jf.field_b, new String[1]);
                              break L40;
                            }
                          }
                        }
                        sl.field_g = var24;
                        break L31;
                      } else {
                        L41: {
                          var28 = cd.field_m.field_kc[var27_int] & 255;
                          var29 = 0;
                          if (cb.field_e == null) {
                            break L41;
                          } else {
                            if (null == cb.field_e[var27_int]) {
                              break L41;
                            } else {
                              if (!cb.field_e[var27_int][var28]) {
                                break L41;
                              } else {
                                if (var12.field_ec) {
                                  break L41;
                                } else {
                                  var29 = 1;
                                  break L41;
                                }
                              }
                            }
                          }
                        }
                        L42: {
                          if (null == mg.field_Ob) {
                            break L42;
                          } else {
                            if (mg.field_Ob[var27_int] != null) {
                              L43: {
                                var30 = mg.field_Ob[var27_int][var28];
                                if (var30 == 0) {
                                  break L43;
                                } else {
                                  if (uc.field_a) {
                                    break L43;
                                  } else {
                                    if (!var12.field_ec) {
                                      var29 = 1;
                                      break L43;
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                              }
                              if (var30 <= var12.field_Ub) {
                                break L42;
                              } else {
                                var29 = 1;
                                break L42;
                              }
                            } else {
                              break L42;
                            }
                          }
                        }
                        L44: {
                          if (ik.field_h == null) {
                            break L44;
                          } else {
                            if (ik.field_h[var27_int] == null) {
                              break L44;
                            } else {
                              L45: {
                                var30 = ik.field_h[var27_int][var28];
                                if (0 == var30) {
                                  break L45;
                                } else {
                                  if (uc.field_a) {
                                    break L45;
                                  } else {
                                    if (!var12.field_ec) {
                                      var29 = 1;
                                      break L45;
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                              }
                              if (var30 <= var12.field_Xb) {
                                break L44;
                              } else {
                                var29 = 1;
                                break L44;
                              }
                            }
                          }
                        }
                        L46: {
                          if (null == af.field_b) {
                            break L46;
                          } else {
                            if (af.field_b[var27_int] != null) {
                              if ((~var12.field_Sb & af.field_b[var27_int][var28]) == 0) {
                                break L46;
                              } else {
                                var29 = 1;
                                break L46;
                              }
                            } else {
                              break L46;
                            }
                          }
                        }
                        L47: {
                          if (var29 == 0) {
                            break L47;
                          } else {
                            break L47;
                          }
                        }
                        var27_int++;
                        continue L37;
                      }
                    }
                  } else {
                    break L31;
                  }
                }
              }
            }
            var12 = (tj) (Object) var10.d(true);
            continue L10;
          }
        }
    }

    final static void a(String param0, int param1, int param2, String param3) {
        wj.field_Mb.field_G = param2;
        wj.field_Mb.field_T = param0;
        wj.field_Mb.field_mb = wj.field_Mb.field_mb + jb.field_f.field_mb;
        wj.field_Mb.field_Y = param3;
        jb.field_f.field_vb = jb.field_f.field_vb + jb.field_f.field_mb;
        try {
            jb.field_f.field_mb = 0;
            wj.field_Mb.field_mb = wj.field_Mb.field_mb - jb.field_f.field_mb;
            jb.field_f.field_vb = jb.field_f.field_vb - jb.field_f.field_mb;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "cl.E(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + -24503 + 41);
        }
    }

    public static void c() {
        field_y = null;
        field_v = null;
        field_B = null;
        field_r = null;
        field_C = null;
        field_n = null;
        field_s = null;
    }

    final static void a() {
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
        int stackIn_18_0 = 0;
        String stackIn_23_0 = null;
        int stackIn_27_0 = 0;
        String stackIn_32_0 = null;
        int stackIn_37_0 = 0;
        String stackIn_37_1 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        cc stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        String stackOut_22_0 = null;
        String stackOut_21_0 = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        int stackOut_36_0 = 0;
        String stackOut_36_1 = null;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        cc stackOut_43_0 = null;
        cc stackOut_42_0 = null;
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
            var3 = 0;
            L2: while (true) {
              if (var3 >= rk.field_P.length) {
                break L0;
              } else {
                L3: {
                  var4 = k.field_g[var3];
                  if (0 > var4) {
                    var5 = wm.field_l;
                    break L3;
                  } else {
                    if (var4 != k.field_f.field_h) {
                      var5 = wa.field_c;
                      break L3;
                    } else {
                      var5 = gn.field_a;
                      break L3;
                    }
                  }
                }
                L4: {
                  var6 = rk.field_P[var3];
                  if (bc.field_B != 2) {
                    break L4;
                  } else {
                    if (var2 == 1) {
                      L5: {
                        if (vb.field_U.length <= tg.field_g.length) {
                          stackOut_17_0 = tg.field_g.length;
                          stackIn_18_0 = stackOut_17_0;
                          break L5;
                        } else {
                          stackOut_16_0 = vb.field_U.length;
                          stackIn_18_0 = stackOut_16_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_18_0;
                        if (var3 < 6) {
                          break L6;
                        } else {
                          if (var7 + 6 <= var3) {
                            break L6;
                          } else {
                            L7: {
                              if (-var7 + var3 - (6 - tg.field_g.length) < 0) {
                                stackOut_22_0 = "";
                                stackIn_23_0 = stackOut_22_0;
                                break L7;
                              } else {
                                stackOut_21_0 = tg.field_g[-6 + (var3 - -tg.field_g.length - var7)];
                                stackIn_23_0 = stackOut_21_0;
                                break L7;
                              }
                            }
                            var6 = stackIn_23_0;
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if (wb.field_Qb.length <= dh.field_b.length) {
                          stackOut_26_0 = dh.field_b.length;
                          stackIn_27_0 = stackOut_26_0;
                          break L8;
                        } else {
                          stackOut_25_0 = wb.field_Qb.length;
                          stackIn_27_0 = stackOut_25_0;
                          break L8;
                        }
                      }
                      var8 = stackIn_27_0;
                      if (var7 + 7 > var3) {
                        break L4;
                      } else {
                        if (var8 + 7 + var7 <= var3) {
                          break L4;
                        } else {
                          L9: {
                            if (-7 + (var3 - var7) >= dh.field_b.length) {
                              stackOut_31_0 = "";
                              stackIn_32_0 = stackOut_31_0;
                              break L9;
                            } else {
                              stackOut_30_0 = dh.field_b[-7 + var3 + -var7];
                              stackIn_32_0 = stackOut_30_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_32_0;
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (var4 == -2) {
                    var6 = Integer.toString(var2);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  stackOut_36_0 = 0;
                  stackOut_36_1 = (String) var6;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  if (var4 < 0) {
                    stackOut_38_0 = stackIn_38_0;
                    stackOut_38_1 = (String) (Object) stackIn_38_1;
                    stackOut_38_2 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    stackIn_39_2 = stackOut_38_2;
                    break L11;
                  } else {
                    stackOut_37_0 = stackIn_37_0;
                    stackOut_37_1 = (String) (Object) stackIn_37_1;
                    stackOut_37_2 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_39_2 = stackOut_37_2;
                    break L11;
                  }
                }
                L12: {
                  var7 = si.a(stackIn_39_0 != 0, stackIn_39_1, stackIn_39_2 != 0);
                  var8 = -(var7 >> 1) + qk.field_d;
                  if (var4 >= 0) {
                    L13: {
                      var1_int = var1_int + qk.field_m;
                      if (k.field_f.field_h != var4) {
                        stackOut_43_0 = da.field_c;
                        stackIn_44_0 = stackOut_43_0;
                        break L13;
                      } else {
                        stackOut_42_0 = nf.field_g;
                        stackIn_44_0 = stackOut_42_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_44_0;
                      if (var9 != null) {
                        var9.a(var7 - -(mb.field_c << 1), 102, var8 + -mb.field_c, var1_int, (pa.field_Y << 1) + cc.field_a);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + pa.field_Y;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L15: {
                  if (0 <= var4) {
                    bg.field_g.a(var6, var8, a.field_k + var1_int, var5, -1);
                    var1_int = var1_int + (pa.field_Y - (-qk.field_m - cc.field_a));
                    break L15;
                  } else {
                    rk.field_R.a(var6, var8, nd.field_b + var1_int, var5, -1);
                    var1_int = var1_int + ke.field_d;
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "cl.D(" + 1 + 41);
        }
    }

    final static void a(hl param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        hl var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0.field_h != null) {
              L1: {
                L2: {
                  if (param0.field_i != 0) {
                    break L2;
                  } else {
                    if (param0.field_n == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= ic.field_c) {
                    break L1;
                  } else {
                    L4: {
                      var3 = pd.field_g[var2_int];
                      if (var3.field_m != 2) {
                        break L4;
                      } else {
                        if (~var3.field_i != ~param0.field_i) {
                          break L4;
                        } else {
                          if (~var3.field_n != ~param0.field_n) {
                            break L4;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param0.field_q != null) {
                  wf.field_o = param0.field_q;
                  he.field_Y = param0.field_o;
                  uh.field_d = param0.field_m;
                  ng.field_a = param0.field_r;
                  break L5;
                } else {
                  break L5;
                }
              }
              int discarded$2 = -3;
              rb.a(param0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("cl.B(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + 1 + 41);
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
