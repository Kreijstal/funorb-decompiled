/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static int[] field_b;
    static String[] field_a;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 68) {
            field_a = (String[]) null;
        }
    }

    final static void a(int param0, int param1, byte param2, tq param3, boolean param4) {
        tq stackIn_42_0;
        int stackIn_42_1;
        boolean stackIn_42_2;
        int stackIn_42_3;
        tq stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        boolean stackIn_43_2 = false;
        int stackIn_43_3 = 0;
        int stackIn_43_4 = 0;
        int stackIn_46_0 = 0;
        int stackIn_60_0 = 0;
        cj stackIn_97_0;
        int stackIn_97_1;
        int stackIn_97_2;
        int stackIn_97_3;
        int stackIn_97_4;
        cj stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        int stackIn_98_3 = 0;
        int stackIn_98_4 = 0;
        int stackIn_98_5 = 0;
        RuntimeException stackIn_219_0 = null;
        StringBuilder stackIn_219_1 = null;
        RuntimeException stackIn_220_0 = null;
        StringBuilder stackIn_220_1 = null;
        String stackIn_220_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        th var10 = null;
        int var11_int = 0;
        Object var11 = null;
        dm var12 = null;
        int var13 = 0;
        cj var14 = null;
        cj var15 = null;
        cj var16 = null;
        cj var17 = null;
        cj var18 = null;
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
        Object var30 = null;
        String var30_ref = null;
        int var30_int = 0;
        int var31 = 0;
        tq var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        var31 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              var7 = 0;
              var8 = 0;
              if (null == mh.field_c) {
                break L1;
              } else {
                L2: {
                  if (null != ch.field_g) {
                    break L2;
                  } else {
                    if (sd.field_G != null) {
                      break L2;
                    } else {
                      if (r.field_c != null) {
                        break L2;
                      } else {
                        if (null != na.field_J) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                var9 = 0;
                L3: while (true) {
                  if (var9 >= kj.field_h) {
                    break L1;
                  } else {
                    L4: {
                      var10_int = mh.field_c.field_Zb[var9] & 255;
                      if (null == ch.field_g) {
                        break L4;
                      } else {
                        if (ch.field_g[var9] != null) {
                          if (!ch.field_g[var9][var10_int]) {
                            break L4;
                          } else {
                            var5_int = 1;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (sd.field_G == null) {
                        break L5;
                      } else {
                        if (null == sd.field_G[var9]) {
                          break L5;
                        } else {
                          L6: {
                            var11_int = sd.field_G[var9][var10_int];
                            if (var11_int == 0) {
                              break L6;
                            } else {
                              if (!bo.field_e) {
                                var5_int = 1;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (var11_int <= var6) {
                            break L5;
                          } else {
                            var6 = var11_int;
                            break L5;
                          }
                        }
                      }
                    }
                    L7: {
                      if (null == r.field_c) {
                        break L7;
                      } else {
                        if (r.field_c[var9] != null) {
                          L8: {
                            var11_int = r.field_c[var9][var10_int];
                            if (var11_int <= var7) {
                              break L8;
                            } else {
                              var7 = var11_int;
                              break L8;
                            }
                          }
                          if (var11_int == 0) {
                            break L7;
                          } else {
                            if (!bo.field_e) {
                              var5_int = 1;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          if (null != na.field_J) {
                            if (null != na.field_J[var9]) {
                              var8 = var8 | na.field_J[var9][var10_int];
                              var9++;
                              continue L3;
                            } else {
                              var9++;
                              continue L3;
                            }
                          } else {
                            var9++;
                            continue L3;
                          }
                        }
                      }
                    }
                    if (null != na.field_J) {
                      if (null != na.field_J[var9]) {
                        var8 = var8 | na.field_J[var9][var10_int];
                        var9++;
                        continue L3;
                      } else {
                        var9++;
                        continue L3;
                      }
                    } else {
                      var9++;
                      continue L3;
                    }
                  }
                }
              }
            }
            L9: {
              stackIn_42_0 = (tq) (param3);

              stackIn_42_1 = 2;

              stackIn_42_2 = param4;

              stackIn_42_3 = (2 + jk.field_f) * 2;

              if (vc.field_d != param3) {
                stackIn_43_0 = (tq) ((Object) stackIn_42_0);
                stackIn_43_1 = stackIn_42_1;
                stackIn_43_2 = stackIn_42_2;
                stackIn_43_3 = stackIn_42_3;
                stackIn_43_4 = 0;
                break L9;
              } else {
                stackIn_43_0 = (tq) ((Object) stackIn_42_0);
                stackIn_43_1 = stackIn_42_1;
                stackIn_43_2 = stackIn_42_2;
                stackIn_43_3 = stackIn_42_3;
                stackIn_43_4 = 1;
                break L9;
              }
            }
            L10: {
              if (!((tq) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_43_2, stackIn_43_3, stackIn_43_4 != 0, 4 * (2 + jk.field_f) * param0, param2 ^ -126)) {
                stackIn_46_0 = 0;
                break L10;
              } else {
                stackIn_46_0 = 1;
                break L10;
              }
            }
            var9 = stackIn_46_0;
            var10 = param3.field_Gb.field_Cb;
            var11 = null;
            var12 = (dm) ((Object) var10.c(124));
            L11: while (true) {
              if (var12 == null) {
                L12: {
                  if (param2 == 45) {
                    break L12;
                  } else {
                    var32 = (tq) null;
                    vi.a(80, -48, (byte) -35, (tq) null, false);
                    break L12;
                  }
                }
                break L0;
              } else {
                L13: {
                  var13 = 0;
                  if (var12.field_Cb == null) {
                    L14: {
                      var12.field_Ub = new cj(0L, m.field_x);
                      var12.a((byte) 50, var12.field_Ub);
                      var12.field_Gb = new cj(0L, wc.field_H);
                      if (tb.field_u) {
                        var12.a((byte) 50, var12.field_Gb);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var12.field_Gb.field_R = 2;
                    var12.field_Hb = new cj(0L, vo.field_m);
                    var12.a((byte) 50, var12.field_Hb);
                    var12.f(-128);
                    var12.field_Tb = new cj(0L, fd.field_O);
                    var12.a((byte) 50, var12.field_Tb);
                    var12.field_cc = new cj(0L, de.field_f);
                    var12.a((byte) 50, var12.field_cc);
                    var13 = 1;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L15: {
                  var12.field_Ub.field_wb = null;
                  var14 = var12.field_Ub;
                  var12.field_Ub.field_z = 0;
                  var12.field_Gb.field_wb = null;
                  var14.field_zb = 0;
                  var15 = var12.field_Gb;
                  var12.field_Gb.field_z = 0;
                  var12.field_Tb.field_wb = null;
                  var15.field_zb = 0;
                  var12.field_Tb.field_z = 0;
                  var16 = var12.field_Tb;
                  var16.field_zb = 0;
                  var12.field_cc.field_wb = null;
                  var17 = var12.field_cc;
                  var12.field_cc.field_z = 0;
                  var17.field_zb = 0;
                  var12.field_Hb.field_wb = null;
                  var18 = var12.field_Hb;
                  var12.field_Hb.field_z = 0;
                  var18.field_zb = 0;
                  var12.field_zb = param3.field_Gb.field_zb;
                  var19 = 0;
                  var33 = var12.field_Lb;
                  var20 = var33;
                  var20 = var33;
                  var21 = 72;
                  if (param3 == hf.field_e) {
                    var21 += 42;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  var34 = fm.a(var12.field_Ub.field_yb, var33, var21);
                  var20 = var34;
                  var20 = var34;
                  var20 = var34;
                  if (var34.equals(var12.field_Lb)) {
                    stackIn_60_0 = 0;
                    break L16;
                  } else {
                    stackIn_60_0 = 1;
                    break L16;
                  }
                }
                L17: {
                  var22 = stackIn_60_0;
                  if (-5 < (var12.field_Yb ^ -1)) {
                    if (-1 > (var12.field_Yb ^ -1)) {
                      var20 = "<img=" + (var12.field_Yb + -1) + ">" + var34;
                      break L17;
                    } else {
                      break L17;
                    }
                  } else {
                    var20 = "<img=" + (-4 + (var12.field_Yb + hg.field_ub)) + ">" + var34;
                    break L17;
                  }
                }
                L18: {
                  var12.field_Ub.field_wb = var20;
                  if (!var12.c((byte) 15)) {
                    L19: {
                      L20: {
                        L21: {
                          var23_int = 16764006;
                          var24_int = 16777215;
                          if (var5_int == 0) {
                            break L21;
                          } else {
                            if (!var12.field_Nb) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if (var6 > var12.field_Mb) {
                          break L20;
                        } else {
                          if (var12.field_Sb < var7) {
                            break L20;
                          } else {
                            if (((var12.field_Vb ^ -1) & var8) <= 0) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      var23_int = 8414771;
                      var24_int = 8421504;
                      break L19;
                    }
                    L22: {
                      var12.field_Tb.field_M = var23_int;
                      var12.field_Gb.field_M = var23_int;
                      var12.field_Ub.field_M = var23_int;
                      var12.field_Ub.field_Db = var24_int;
                      var12.field_Ub.field_xb = var24_int;
                      var12.field_Ub.field_ob = var24_int;
                      var12.field_Gb.field_Db = var24_int;
                      var12.field_Gb.field_xb = var24_int;
                      var12.field_Gb.field_ob = var24_int;
                      var12.field_Tb.field_Db = var24_int;
                      var12.field_Tb.field_xb = var24_int;
                      var12.field_Tb.field_ob = var24_int;
                      if (param3 == bf.field_n) {
                        if (!mh.field_c.field_Fb) {
                          var12.field_cc.field_wb = me.field_d;
                          break L22;
                        } else {
                          break L22;
                        }
                      } else {
                        if (var12.field_Pb) {
                          var12.field_Ub.field_wb = vl.a(ke.field_a, new String[]{var20}, 2);
                          var12.field_cc.field_wb = gk.field_a;
                          break L22;
                        } else {
                          if (var12.field_Ob) {
                            var12.field_Ub.field_wb = vl.a(oi.field_b, new String[]{var20}, 2);
                            var12.field_Tb.field_wb = df.field_J;
                            var12.field_cc.field_wb = bn.field_a;
                            break L22;
                          } else {
                            var12.field_Tb.field_wb = nn.field_a;
                            break L22;
                          }
                        }
                      }
                    }
                    L23: {
                      var25_int = 0;
                      if (null == mh.field_c) {
                        break L23;
                      } else {
                        if (!hl.b(param2 ^ 45)) {
                          break L23;
                        } else {
                          if ((ie.field_sb ^ -1L) == (var12.field_ec ^ -1L)) {
                            break L23;
                          } else {
                            L24: {
                              if (null == var12.field_Tb.field_wb) {
                                break L24;
                              } else {
                                var26 = var12.field_Tb.e(param2 + -45) + 2 * nj.field_h;
                                var12.field_Tb.a(jk.field_f, var19, var26, var25_int, -3344);
                                var25_int = var25_int + var26;
                                break L24;
                              }
                            }
                            if (null != var12.field_cc.field_wb) {
                              L25: {
                                if (bf.field_n == param3) {
                                  var26 = 40;
                                  break L25;
                                } else {
                                  var26 = var12.field_cc.e(0) - -(2 * nj.field_h);
                                  break L25;
                                }
                              }
                              var12.field_cc.a(jk.field_f, var19, var26, var25_int, -3344);
                              var25_int = var25_int + var26;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                    }
                    L26: {
                      stackIn_97_0 = var12.field_Ub;

                      stackIn_97_1 = jk.field_f;

                      stackIn_97_2 = var19;

                      stackIn_97_3 = -var25_int;

                      stackIn_97_4 = var12.field_zb;

                      if (!tb.field_u) {
                        stackIn_98_0 = (cj) ((Object) stackIn_97_0);
                        stackIn_98_1 = stackIn_97_1;
                        stackIn_98_2 = stackIn_97_2;
                        stackIn_98_3 = stackIn_97_3;
                        stackIn_98_4 = stackIn_97_4;
                        stackIn_98_5 = 0;
                        break L26;
                      } else {
                        stackIn_98_0 = (cj) ((Object) stackIn_97_0);
                        stackIn_98_1 = stackIn_97_1;
                        stackIn_98_2 = stackIn_97_2;
                        stackIn_98_3 = stackIn_97_3;
                        stackIn_98_4 = stackIn_97_4;
                        stackIn_98_5 = 42;
                        break L26;
                      }
                    }
                    L27: {
                      L28: {
                        ((cj) (Object) stackIn_98_0).a(stackIn_98_1, stackIn_98_2, stackIn_98_3 + (stackIn_98_4 - stackIn_98_5), var25_int, -3344);
                        var12.field_Gb.field_wb = Integer.toString(var12.field_Mb);
                        var12.field_Gb.a(jk.field_f, var19, 40, var12.field_zb - 40, -3344);
                        if (!var12.field_Ub.field_L) {
                          break L28;
                        } else {
                          if (var22 != 0) {
                            ui.field_j = var12.field_Lb;
                            if (null == rl.field_h) {
                              break L27;
                            } else {
                              if (null != rl.field_h[var12.field_Yb]) {
                                ui.field_j = ui.field_j + " - " + rl.field_h[var12.field_Yb];
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                          } else {
                            break L28;
                          }
                        }
                      }
                      if (!var12.field_Ub.field_L) {
                        break L27;
                      } else {
                        if (rl.field_h == null) {
                          break L27;
                        } else {
                          if (null != rl.field_h[var12.field_Yb]) {
                            ui.field_j = rl.field_h[var12.field_Yb];
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                      }
                    }
                    var19 = var19 + jk.field_f;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L29: {
                  var23 = ua.a((byte) -61, var12.field_Fb, var20);
                  var24 = var23;
                  var30 = var24;
                  var25 = var30;
                  var24 = var23;
                  if (var23 == null) {
                    break L29;
                  } else {
                    var24_int = var12.field_Hb.field_yb.b(var23, -nj.field_h + (var12.field_zb + -nj.field_h));
                    var12.field_Hb.field_wb = var23;
                    var12.field_Hb.field_Y = 256 * var12.field_bc / so.field_r;
                    var12.field_Hb.a(jk.field_f * var24_int, var19, -(2 * nj.field_h) + var12.field_zb, nj.field_h, -3344);
                    var19 = var19 + jk.field_f * var24_int;
                    break L29;
                  }
                }
                L30: {
                  if (var9 == 0) {
                    var12.field_I = -var12.field_z + var19;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (var13 == 0) {
                    break L31;
                  } else {
                    param3.field_Gb.a(2, var12, 1300, (cj) (var11));
                    break L31;
                  }
                }
                L32: {
                  if (-1 == (var12.field_T ^ -1)) {
                    break L32;
                  } else {
                    if (var12.c((byte) 15)) {
                      break L32;
                    } else {
                      if (var12.field_Tb.field_T != 0) {
                        so.a(-21148, var12.field_ec, param1);
                        break L32;
                      } else {
                        if (var12.field_cc.field_T == 0) {
                          wl.a(ka.field_t, param3, 0, 0, (byte) 81, vb.field_f, var12);
                          break L32;
                        } else {
                          cg.a(param1, -27404, var12.field_ec);
                          break L32;
                        }
                      }
                    }
                  }
                }
                L33: {
                  if (!var12.field_pb) {
                    break L33;
                  } else {
                    if (var12.c((byte) 15)) {
                      break L33;
                    } else {
                      L34: {
                        var24 = null;
                        if ((var12.field_ec ^ -1L) == (ie.field_sb ^ -1L)) {
                          L35: {
                            if (var5_int == 0) {
                              break L35;
                            } else {
                              if (var12.field_Nb) {
                                break L35;
                              } else {
                                var24 = lj.field_s;
                                break L34;
                              }
                            }
                          }
                          if (var7 > var12.field_Sb) {
                            L36: {
                              var25_int = -var12.field_Sb + var7;
                              if ((var25_int ^ -1) != -2) {
                                break L36;
                              } else {
                                var24 = jk.field_a;
                                break L36;
                              }
                            }
                            var24 = vl.a(ij.field_f, new String[]{null, Integer.toString(var25_int)}, 2);
                            var30 = var24;
                            var25 = var30;
                            var24 = var25;
                            var30 = var24;
                            var25 = var30;
                            break L34;
                          } else {
                            if (var12.field_Mb < var6) {
                              var24 = vl.a(oi.field_a, new String[]{null, Integer.toString(var6)}, 2);
                              break L34;
                            } else {
                              if (((var12.field_Vb ^ -1) & var8) == 0) {
                                break L34;
                              } else {
                                var25_int = vl.a(var8 & (var12.field_Vb ^ -1), (byte) -103);
                                var24 = af.field_c;
                                if (0 >= var25_int) {
                                  break L34;
                                } else {
                                  if (ki.field_o == null) {
                                    break L34;
                                  } else {
                                    if (ki.field_o.length < var25_int) {
                                      break L34;
                                    } else {
                                      if (ki.field_o[var25_int - 1] == null) {
                                        break L34;
                                      } else {
                                        var24 = ki.field_o[-1 + var25_int][1];
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L37: {
                            if (var5_int == 0) {
                              break L37;
                            } else {
                              if (var12.field_Nb) {
                                break L37;
                              } else {
                                var24 = vl.a(op.field_n, new String[]{var20}, 2);
                                break L34;
                              }
                            }
                          }
                          if (var12.field_Sb < var7) {
                            L38: {
                              var25_int = var7 + -var12.field_Sb;
                              if (-2 != (var25_int ^ -1)) {
                                break L38;
                              } else {
                                var24 = vl.a(ce.field_o, new String[]{var20}, 2);
                                break L38;
                              }
                            }
                            var24 = vl.a(bg.field_m, new String[]{var20, Integer.toString(var25_int)}, 2);
                            break L34;
                          } else {
                            if (var6 <= var12.field_Mb) {
                              if (0 != ((var12.field_Vb ^ -1) & var8)) {
                                var25_int = vl.a(var8 & (var12.field_Vb ^ -1), (byte) -103);
                                var24 = vl.a(ap.field_r, new String[]{var20}, 2);
                                if ((var25_int ^ -1) >= -1) {
                                  break L34;
                                } else {
                                  if (null == ki.field_o) {
                                    break L34;
                                  } else {
                                    if (var25_int > ki.field_o.length) {
                                      break L34;
                                    } else {
                                      if (null != ki.field_o[var25_int - 1]) {
                                        var24 = vl.a(ki.field_o[var25_int + -1][2], new String[]{var20}, param2 + -43);
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L34;
                              }
                            } else {
                              var24 = vl.a(ek.field_y, new String[]{var20, Integer.toString(var6)}, 2);
                              break L34;
                            }
                          }
                        }
                      }
                      if (var24 != null) {
                        var35 = "<col=A00000>" + (String) (var24);
                        var30_ref = var35;
                        var25 = var30_ref;
                        var24 = var25;
                        var30_ref = var35;
                        var25 = var30_ref;
                        var25 = null;
                        var26 = 0;
                        var27_int = 0;
                        L39: while (true) {
                          if (var27_int >= kj.field_h) {
                            L40: {
                              L41: {
                                if (bf.field_n != param3) {
                                  break L41;
                                } else {
                                  if (hl.b(0)) {
                                    if (var26 != 0) {
                                      var24 = var35 + "<br>" + mc.field_b + (String) (var25);
                                      break L40;
                                    } else {
                                      var24 = var35 + "<br>" + vl.a(od.field_Cb, new String[]{(String) (var25)}, 2);
                                      break L40;
                                    }
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                              if (var26 != 0) {
                                var24 = var35 + "<br>" + mb.field_u + (String) (var25);
                                break L40;
                              } else {
                                var24 = var35 + "<br>" + vl.a(dg.field_L, new String[]{(String) (var25)}, 2);
                                break L40;
                              }
                            }
                            L42: {
                              if (bf.field_n != param3) {
                                break L42;
                              } else {
                                if (!hl.b(0)) {
                                  var27 = mh.field_c.field_Nb;
                                  var24 = (String) (var24) + "<br>" + vl.a(mj.field_Ob, new String[]{var27}, param2 + -43);
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                            }
                            ui.field_j = (String) (var24);
                            break L33;
                          } else {
                            L43: {
                              var28 = mh.field_c.field_Zb[var27_int] & 255;
                              var29 = 0;
                              if (ch.field_g == null) {
                                break L43;
                              } else {
                                if (ch.field_g[var27_int] == null) {
                                  break L43;
                                } else {
                                  if (!ch.field_g[var27_int][var28]) {
                                    break L43;
                                  } else {
                                    if (var12.field_Nb) {
                                      break L43;
                                    } else {
                                      var29 = 1;
                                      break L43;
                                    }
                                  }
                                }
                              }
                            }
                            L44: {
                              if (sd.field_G == null) {
                                break L44;
                              } else {
                                if (sd.field_G[var27_int] == null) {
                                  break L44;
                                } else {
                                  L45: {
                                    var30_int = sd.field_G[var27_int][var28];
                                    if (var30_int == 0) {
                                      break L45;
                                    } else {
                                      if (bo.field_e) {
                                        break L45;
                                      } else {
                                        if (var12.field_Nb) {
                                          break L45;
                                        } else {
                                          var29 = 1;
                                          break L45;
                                        }
                                      }
                                    }
                                  }
                                  if (var12.field_Mb < var30_int) {
                                    var29 = 1;
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                            }
                            L46: {
                              if (null == r.field_c) {
                                break L46;
                              } else {
                                if (r.field_c[var27_int] == null) {
                                  break L46;
                                } else {
                                  L47: {
                                    var30_int = r.field_c[var27_int][var28];
                                    if (var30_int == 0) {
                                      break L47;
                                    } else {
                                      if (bo.field_e) {
                                        break L47;
                                      } else {
                                        if (!var12.field_Nb) {
                                          var29 = 1;
                                          break L47;
                                        } else {
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                  if (var30_int <= var12.field_Sb) {
                                    break L46;
                                  } else {
                                    var29 = 1;
                                    break L46;
                                  }
                                }
                              }
                            }
                            L48: {
                              if (na.field_J == null) {
                                break L48;
                              } else {
                                if (na.field_J[var27_int] != null) {
                                  if (-1 != (na.field_J[var27_int][var28] & (var12.field_Vb ^ -1) ^ -1)) {
                                    var29 = 1;
                                    break L48;
                                  } else {
                                    break L48;
                                  }
                                } else {
                                  break L48;
                                }
                              }
                            }
                            if (var29 != 0) {
                              L49: {
                                var30_ref = "<col=A00000>" + cf.field_f[var27_int] + "</col>";
                                var25 = var30_ref;
                                var24 = var25;
                                var25 = var30_ref;
                                if (var25 == null) {
                                  var25 = var30_ref;
                                  var24 = var25;
                                  var24 = var25;
                                  break L49;
                                } else {
                                  var25 = (String) (var25) + ", " + var30_ref;
                                  var26 = 1;
                                  break L49;
                                }
                              }
                              var27_int++;
                              continue L39;
                            } else {
                              var27_int++;
                              continue L39;
                            }
                          }
                        }
                      } else {
                        break L33;
                      }
                    }
                  }
                }
                var11 = var12;
                var12 = (dm) ((Object) var10.b(6));
                continue L11;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L50: {
            var5 = decompiledCaughtException;
            stackIn_219_0 = (RuntimeException) (var5);

            stackIn_219_1 = new StringBuilder().append("vi.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_220_0 = (RuntimeException) ((Object) stackIn_219_0);
              stackIn_220_1 = (StringBuilder) ((Object) stackIn_219_1);
              stackIn_220_2 = "null";
              break L50;
            } else {
              stackIn_220_0 = (RuntimeException) ((Object) stackIn_219_0);
              stackIn_220_1 = (StringBuilder) ((Object) stackIn_219_1);
              stackIn_220_2 = "{...}";
              break L50;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_220_0), stackIn_220_2 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, vg param1, byte param2) {
        ga var3 = ma.field_a;
        if (param2 > -120) {
            return;
        }
        try {
            var3.b((byte) -35, param0);
            var3.a(119, param1.field_i);
            var3.a(-21, param1.field_p);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "vi.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = new String[]{"Tutorial Tips: On", "Tutorial Tips: Off"};
        field_b = new int[8192];
    }
}
