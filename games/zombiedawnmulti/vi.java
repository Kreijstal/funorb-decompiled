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
            field_a = null;
        }
    }

    final static void a(int param0, int param1, byte param2, tq param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        th var10 = null;
        dm var11 = null;
        int var11_int = 0;
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
        String var24 = null;
        String var24_ref = null;
        String var25 = null;
        int var25_int = 0;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30 = null;
        int var30_int = 0;
        int var31 = 0;
        Object var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        tq stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        boolean stackIn_40_2 = false;
        int stackIn_40_3 = 0;
        tq stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        boolean stackIn_41_2 = false;
        int stackIn_41_3 = 0;
        tq stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        boolean stackIn_42_2 = false;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackIn_45_0 = 0;
        int stackIn_59_0 = 0;
        cj stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        int stackIn_95_4 = 0;
        cj stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        int stackIn_96_4 = 0;
        cj stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        int stackIn_97_4 = 0;
        int stackIn_97_5 = 0;
        tq stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        boolean stackOut_39_2 = false;
        int stackOut_39_3 = 0;
        tq stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        boolean stackOut_41_2 = false;
        int stackOut_41_3 = 0;
        int stackOut_41_4 = 0;
        tq stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        boolean stackOut_40_2 = false;
        int stackOut_40_3 = 0;
        int stackOut_40_4 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        cj stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        int stackOut_94_4 = 0;
        cj stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        int stackOut_96_3 = 0;
        int stackOut_96_4 = 0;
        int stackOut_96_5 = 0;
        cj stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        int stackOut_95_3 = 0;
        int stackOut_95_4 = 0;
        int stackOut_95_5 = 0;
        L0: {
          var31 = ZombieDawnMulti.field_E ? 1 : 0;
          var5 = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (null == mh.field_c) {
            break L0;
          } else {
            L1: {
              if (null != ch.field_g) {
                break L1;
              } else {
                if (sd.field_G != null) {
                  break L1;
                } else {
                  if (r.field_c != null) {
                    break L1;
                  } else {
                    if (null != na.field_J) {
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
              if (var9 >= kj.field_h) {
                break L0;
              } else {
                L3: {
                  var10_int = mh.field_c.field_Zb[var9] & 255;
                  if (null == ch.field_g) {
                    break L3;
                  } else {
                    if (ch.field_g[var9] != null) {
                      if (!ch.field_g[var9][var10_int]) {
                        break L3;
                      } else {
                        var5 = 1;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (sd.field_G == null) {
                    break L4;
                  } else {
                    if (null == sd.field_G[var9]) {
                      break L4;
                    } else {
                      L5: {
                        var11_int = sd.field_G[var9][var10_int];
                        if (var11_int == 0) {
                          break L5;
                        } else {
                          if (!bo.field_e) {
                            var5 = 1;
                            break L5;
                          } else {
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
                    }
                  }
                }
                L6: {
                  if (null == r.field_c) {
                    break L6;
                  } else {
                    if (r.field_c[var9] != null) {
                      L7: {
                        var11_int = r.field_c[var9][var10_int];
                        if (var11_int <= var7) {
                          break L7;
                        } else {
                          var7 = var11_int;
                          break L7;
                        }
                      }
                      if (var11_int == 0) {
                        break L6;
                      } else {
                        if (!bo.field_e) {
                          var5 = 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      if (null != na.field_J) {
                        if (null != na.field_J[var9]) {
                          var8 = var8 | na.field_J[var9][var10_int];
                          var9++;
                          continue L2;
                        } else {
                          var9++;
                          continue L2;
                        }
                      } else {
                        var9++;
                        continue L2;
                      }
                    }
                  }
                }
                if (null != na.field_J) {
                  if (null != na.field_J[var9]) {
                    var8 = var8 | na.field_J[var9][var10_int];
                    var9++;
                    continue L2;
                  } else {
                    var9++;
                    continue L2;
                  }
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          }
        }
        L8: {
          stackOut_39_0 = (tq) param3;
          stackOut_39_1 = 2;
          stackOut_39_2 = param4;
          stackOut_39_3 = (2 + jk.field_f) * 2;
          stackIn_41_0 = stackOut_39_0;
          stackIn_41_1 = stackOut_39_1;
          stackIn_41_2 = stackOut_39_2;
          stackIn_41_3 = stackOut_39_3;
          stackIn_40_0 = stackOut_39_0;
          stackIn_40_1 = stackOut_39_1;
          stackIn_40_2 = stackOut_39_2;
          stackIn_40_3 = stackOut_39_3;
          if (vc.field_d != param3) {
            stackOut_41_0 = (tq) (Object) stackIn_41_0;
            stackOut_41_1 = stackIn_41_1;
            stackOut_41_2 = stackIn_41_2;
            stackOut_41_3 = stackIn_41_3;
            stackOut_41_4 = 0;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            stackIn_42_2 = stackOut_41_2;
            stackIn_42_3 = stackOut_41_3;
            stackIn_42_4 = stackOut_41_4;
            break L8;
          } else {
            stackOut_40_0 = (tq) (Object) stackIn_40_0;
            stackOut_40_1 = stackIn_40_1;
            stackOut_40_2 = stackIn_40_2;
            stackOut_40_3 = stackIn_40_3;
            stackOut_40_4 = 1;
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_42_2 = stackOut_40_2;
            stackIn_42_3 = stackOut_40_3;
            stackIn_42_4 = stackOut_40_4;
            break L8;
          }
        }
        L9: {
          if (((tq) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4 == 0, 4 * (2 + jk.field_f) * param0, param2 ^ -126)) {
            stackOut_44_0 = 0;
            stackIn_45_0 = stackOut_44_0;
            break L9;
          } else {
            stackOut_43_0 = 1;
            stackIn_45_0 = stackOut_43_0;
            break L9;
          }
        }
        var9 = stackIn_45_0;
        var10 = param3.field_Gb.field_Cb;
        var11 = null;
        var12 = (dm) (Object) var10.c(124);
        L10: while (true) {
          if (var12 == null) {
            L11: {
              if (param2 == 45) {
                break L11;
              } else {
                var32 = null;
                vi.a(80, -48, (byte) -35, (tq) null, false);
                break L11;
              }
            }
            return;
          } else {
            L12: {
              var13 = 0;
              if (var12.field_Cb == null) {
                L13: {
                  var12.field_Ub = new cj(0L, m.field_x);
                  var12.a((byte) 50, var12.field_Ub);
                  var12.field_Gb = new cj(0L, wc.field_H);
                  if (tb.field_u) {
                    var12.a((byte) 50, var12.field_Gb);
                    break L13;
                  } else {
                    break L13;
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
                break L12;
              } else {
                break L12;
              }
            }
            L14: {
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
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var34 = fm.a(var12.field_Ub.field_yb, var33, var21);
              var20 = var34;
              var20 = var34;
              if (var34.equals((Object) (Object) var12.field_Lb)) {
                stackOut_58_0 = 0;
                stackIn_59_0 = stackOut_58_0;
                break L15;
              } else {
                stackOut_57_0 = 1;
                stackIn_59_0 = stackOut_57_0;
                break L15;
              }
            }
            L16: {
              var22 = stackIn_59_0;
              if (-5 < (var12.field_Yb ^ -1)) {
                if (-1 > (var12.field_Yb ^ -1)) {
                  var20 = "<img=" + (var12.field_Yb + -1) + ">" + var34;
                  break L16;
                } else {
                  break L16;
                }
              } else {
                var20 = "<img=" + (-4 + (var12.field_Yb + hg.field_ub)) + ">" + var34;
                break L16;
              }
            }
            L17: {
              var12.field_Ub.field_wb = var20;
              if (!var12.c((byte) 15)) {
                L18: {
                  L19: {
                    L20: {
                      var23_int = 16764006;
                      var24_int = 16777215;
                      if (var5 == 0) {
                        break L20;
                      } else {
                        if (!var12.field_Nb) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    if (var6 > var12.field_Mb) {
                      break L19;
                    } else {
                      if (var12.field_Sb < var7) {
                        break L19;
                      } else {
                        if (((var12.field_Vb ^ -1) & var8) <= 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                  var23_int = 8414771;
                  var24_int = 8421504;
                  break L18;
                }
                L21: {
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
                      break L21;
                    } else {
                      break L21;
                    }
                  } else {
                    if (var12.field_Pb) {
                      var12.field_Ub.field_wb = vl.a(ke.field_a, new String[1], 2);
                      var12.field_cc.field_wb = gk.field_a;
                      break L21;
                    } else {
                      if (var12.field_Ob) {
                        var12.field_Ub.field_wb = vl.a(oi.field_b, new String[1], 2);
                        var12.field_Tb.field_wb = df.field_J;
                        var12.field_cc.field_wb = bn.field_a;
                        break L21;
                      } else {
                        var12.field_Tb.field_wb = nn.field_a;
                        break L21;
                      }
                    }
                  }
                }
                L22: {
                  var25_int = 0;
                  if (null == mh.field_c) {
                    break L22;
                  } else {
                    if (!hl.b(param2 ^ 45)) {
                      break L22;
                    } else {
                      if ((ie.field_sb ^ -1L) == (var12.field_ec ^ -1L)) {
                        break L22;
                      } else {
                        L23: {
                          if (null == var12.field_Tb.field_wb) {
                            break L23;
                          } else {
                            var26 = var12.field_Tb.e(param2 + -45) + 2 * nj.field_h;
                            var12.field_Tb.a(jk.field_f, var19, var26, var25_int, -3344);
                            var25_int = var25_int + var26;
                            break L23;
                          }
                        }
                        if (null != var12.field_cc.field_wb) {
                          L24: {
                            if (bf.field_n == param3) {
                              var26 = 40;
                              break L24;
                            } else {
                              var26 = var12.field_cc.e(0) - -(2 * nj.field_h);
                              break L24;
                            }
                          }
                          var12.field_cc.a(jk.field_f, var19, var26, var25_int, -3344);
                          var25_int = var25_int + var26;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                }
                L25: {
                  stackOut_94_0 = var12.field_Ub;
                  stackOut_94_1 = jk.field_f;
                  stackOut_94_2 = var19;
                  stackOut_94_3 = -var25_int;
                  stackOut_94_4 = var12.field_zb;
                  stackIn_96_0 = stackOut_94_0;
                  stackIn_96_1 = stackOut_94_1;
                  stackIn_96_2 = stackOut_94_2;
                  stackIn_96_3 = stackOut_94_3;
                  stackIn_96_4 = stackOut_94_4;
                  stackIn_95_0 = stackOut_94_0;
                  stackIn_95_1 = stackOut_94_1;
                  stackIn_95_2 = stackOut_94_2;
                  stackIn_95_3 = stackOut_94_3;
                  stackIn_95_4 = stackOut_94_4;
                  if (!tb.field_u) {
                    stackOut_96_0 = (cj) (Object) stackIn_96_0;
                    stackOut_96_1 = stackIn_96_1;
                    stackOut_96_2 = stackIn_96_2;
                    stackOut_96_3 = stackIn_96_3;
                    stackOut_96_4 = stackIn_96_4;
                    stackOut_96_5 = 0;
                    stackIn_97_0 = stackOut_96_0;
                    stackIn_97_1 = stackOut_96_1;
                    stackIn_97_2 = stackOut_96_2;
                    stackIn_97_3 = stackOut_96_3;
                    stackIn_97_4 = stackOut_96_4;
                    stackIn_97_5 = stackOut_96_5;
                    break L25;
                  } else {
                    stackOut_95_0 = (cj) (Object) stackIn_95_0;
                    stackOut_95_1 = stackIn_95_1;
                    stackOut_95_2 = stackIn_95_2;
                    stackOut_95_3 = stackIn_95_3;
                    stackOut_95_4 = stackIn_95_4;
                    stackOut_95_5 = 42;
                    stackIn_97_0 = stackOut_95_0;
                    stackIn_97_1 = stackOut_95_1;
                    stackIn_97_2 = stackOut_95_2;
                    stackIn_97_3 = stackOut_95_3;
                    stackIn_97_4 = stackOut_95_4;
                    stackIn_97_5 = stackOut_95_5;
                    break L25;
                  }
                }
                L26: {
                  L27: {
                    ((cj) (Object) stackIn_97_0).a(stackIn_97_1, stackIn_97_2, stackIn_97_3 + (stackIn_97_4 - stackIn_97_5), var25_int, -3344);
                    var12.field_Gb.field_wb = Integer.toString(var12.field_Mb);
                    var12.field_Gb.a(jk.field_f, var19, 40, var12.field_zb - 40, -3344);
                    if (!var12.field_Ub.field_L) {
                      break L27;
                    } else {
                      if (var22 != 0) {
                        ui.field_j = var12.field_Lb;
                        if (null == rl.field_h) {
                          break L26;
                        } else {
                          if (null != rl.field_h[var12.field_Yb]) {
                            ui.field_j = ui.field_j + " - " + rl.field_h[var12.field_Yb];
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                      } else {
                        break L27;
                      }
                    }
                  }
                  if (!var12.field_Ub.field_L) {
                    break L26;
                  } else {
                    if (rl.field_h == null) {
                      break L26;
                    } else {
                      if (null != rl.field_h[var12.field_Yb]) {
                        ui.field_j = rl.field_h[var12.field_Yb];
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                  }
                }
                var19 = var19 + jk.field_f;
                break L17;
              } else {
                break L17;
              }
            }
            L28: {
              var23 = ua.a((byte) -61, var12.field_Fb, var20);
              var24 = var23;
              var30 = var24;
              var25 = var30;
              var24 = var23;
              if (var23 == null) {
                break L28;
              } else {
                var24_int = var12.field_Hb.field_yb.b(var23, -nj.field_h + (var12.field_zb + -nj.field_h));
                var12.field_Hb.field_wb = var23;
                var12.field_Hb.field_Y = 256 * var12.field_bc / so.field_r;
                var12.field_Hb.a(jk.field_f * var24_int, var19, -(2 * nj.field_h) + var12.field_zb, nj.field_h, -3344);
                var19 = var19 + jk.field_f * var24_int;
                break L28;
              }
            }
            L29: {
              if (var9 == 0) {
                var12.field_I = -var12.field_z + var19;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (var13 == 0) {
                break L30;
              } else {
                param3.field_Gb.a(2, (cj) (Object) var12, 1300, (cj) (Object) var11);
                break L30;
              }
            }
            L31: {
              if (-1 == (var12.field_T ^ -1)) {
                break L31;
              } else {
                if (var12.c((byte) 15)) {
                  break L31;
                } else {
                  if (var12.field_Tb.field_T != 0) {
                    so.a(-21148, var12.field_ec, param1);
                    break L31;
                  } else {
                    if (var12.field_cc.field_T == 0) {
                      wl.a(ka.field_t, param3, 0, 0, (byte) 81, vb.field_f, var12);
                      break L31;
                    } else {
                      cg.a(param1, -27404, var12.field_ec);
                      break L31;
                    }
                  }
                }
              }
            }
            L32: {
              if (!var12.field_pb) {
                break L32;
              } else {
                if (var12.c((byte) 15)) {
                  break L32;
                } else {
                  L33: {
                    var24 = null;
                    if ((var12.field_ec ^ -1L) == (ie.field_sb ^ -1L)) {
                      L34: {
                        if (var5 == 0) {
                          break L34;
                        } else {
                          if (var12.field_Nb) {
                            break L34;
                          } else {
                            var24 = lj.field_s;
                            break L33;
                          }
                        }
                      }
                      if (var7 > var12.field_Sb) {
                        L35: {
                          var25_int = -var12.field_Sb + var7;
                          if ((var25_int ^ -1) != -2) {
                            break L35;
                          } else {
                            var24 = jk.field_a;
                            break L35;
                          }
                        }
                        var24 = vl.a(ij.field_f, new String[2], 2);
                        var30 = var24;
                        var25 = var30;
                        var24 = var25;
                        var30 = var24;
                        var25 = var30;
                        break L33;
                      } else {
                        if (var12.field_Mb < var6) {
                          var24 = vl.a(oi.field_a, new String[2], 2);
                          break L33;
                        } else {
                          if (((var12.field_Vb ^ -1) & var8) == 0) {
                            break L33;
                          } else {
                            var25_int = vl.a(var8 & (var12.field_Vb ^ -1), (byte) -103);
                            var24 = af.field_c;
                            if (0 >= var25_int) {
                              break L33;
                            } else {
                              if (ki.field_o == null) {
                                break L33;
                              } else {
                                if (ki.field_o.length < var25_int) {
                                  break L33;
                                } else {
                                  if (ki.field_o[var25_int - 1] == null) {
                                    break L33;
                                  } else {
                                    var24_ref = ki.field_o[-1 + var25_int][1];
                                    break L33;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      L36: {
                        if (var5 == 0) {
                          break L36;
                        } else {
                          if (var12.field_Nb) {
                            break L36;
                          } else {
                            var24 = vl.a(op.field_n, new String[1], 2);
                            break L33;
                          }
                        }
                      }
                      if (var12.field_Sb < var7) {
                        L37: {
                          var25_int = var7 + -var12.field_Sb;
                          if (-2 != (var25_int ^ -1)) {
                            break L37;
                          } else {
                            var24 = vl.a(ce.field_o, new String[1], 2);
                            break L37;
                          }
                        }
                        var24 = vl.a(bg.field_m, new String[2], 2);
                        break L33;
                      } else {
                        if (var6 <= var12.field_Mb) {
                          if (0 != ((var12.field_Vb ^ -1) & var8)) {
                            var25_int = vl.a(var8 & (var12.field_Vb ^ -1), (byte) -103);
                            var24 = vl.a(ap.field_r, new String[1], 2);
                            if ((var25_int ^ -1) >= -1) {
                              break L33;
                            } else {
                              if (null == ki.field_o) {
                                break L33;
                              } else {
                                if (var25_int > ki.field_o.length) {
                                  break L33;
                                } else {
                                  if (null != ki.field_o[var25_int - 1]) {
                                    var24 = vl.a(ki.field_o[var25_int + -1][2], new String[1], param2 + -43);
                                    break L33;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                          } else {
                            break L33;
                          }
                        } else {
                          var24 = vl.a(ek.field_y, new String[2], 2);
                          break L33;
                        }
                      }
                    }
                  }
                  if (var24 != null) {
                    var35 = "<col=A00000>" + var24;
                    var30 = var35;
                    var25 = var30;
                    var24 = var25;
                    var30 = var35;
                    var25 = var30;
                    var25 = null;
                    var26 = 0;
                    var27_int = 0;
                    L38: while (true) {
                      if (var27_int >= kj.field_h) {
                        L39: {
                          L40: {
                            if (bf.field_n != param3) {
                              break L40;
                            } else {
                              if (hl.b(0)) {
                                if (var26 != 0) {
                                  var24 = var35 + "<br>" + mc.field_b + var25;
                                  break L39;
                                } else {
                                  var24 = var35 + "<br>" + vl.a(od.field_Cb, new String[1], 2);
                                  break L39;
                                }
                              } else {
                                break L40;
                              }
                            }
                          }
                          if (var26 != 0) {
                            var24 = var35 + "<br>" + mb.field_u + var25;
                            break L39;
                          } else {
                            var24 = var35 + "<br>" + vl.a(dg.field_L, new String[1], 2);
                            break L39;
                          }
                        }
                        L41: {
                          if (bf.field_n != param3) {
                            break L41;
                          } else {
                            if (!hl.b(0)) {
                              var27 = mh.field_c.field_Nb;
                              var24 = var24 + "<br>" + vl.a(mj.field_Ob, new String[1], param2 + -43);
                              break L41;
                            } else {
                              break L41;
                            }
                          }
                        }
                        ui.field_j = var24;
                        break L32;
                      } else {
                        L42: {
                          var28 = mh.field_c.field_Zb[var27_int] & 255;
                          var29 = 0;
                          if (ch.field_g == null) {
                            break L42;
                          } else {
                            if (ch.field_g[var27_int] == null) {
                              break L42;
                            } else {
                              if (!ch.field_g[var27_int][var28]) {
                                break L42;
                              } else {
                                if (var12.field_Nb) {
                                  break L42;
                                } else {
                                  var29 = 1;
                                  break L42;
                                }
                              }
                            }
                          }
                        }
                        L43: {
                          if (sd.field_G == null) {
                            break L43;
                          } else {
                            if (sd.field_G[var27_int] == null) {
                              break L43;
                            } else {
                              L44: {
                                var30_int = sd.field_G[var27_int][var28];
                                if (var30_int == 0) {
                                  break L44;
                                } else {
                                  if (bo.field_e) {
                                    break L44;
                                  } else {
                                    if (var12.field_Nb) {
                                      break L44;
                                    } else {
                                      var29 = 1;
                                      break L44;
                                    }
                                  }
                                }
                              }
                              if (var12.field_Mb < var30_int) {
                                var29 = 1;
                                break L43;
                              } else {
                                break L43;
                              }
                            }
                          }
                        }
                        L45: {
                          if (null == r.field_c) {
                            break L45;
                          } else {
                            if (r.field_c[var27_int] == null) {
                              break L45;
                            } else {
                              L46: {
                                var30_int = r.field_c[var27_int][var28];
                                if (var30_int == 0) {
                                  break L46;
                                } else {
                                  if (bo.field_e) {
                                    break L46;
                                  } else {
                                    if (!var12.field_Nb) {
                                      var29 = 1;
                                      break L46;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                              }
                              if (var30_int <= var12.field_Sb) {
                                break L45;
                              } else {
                                var29 = 1;
                                break L45;
                              }
                            }
                          }
                        }
                        L47: {
                          if (na.field_J == null) {
                            break L47;
                          } else {
                            if (na.field_J[var27_int] != null) {
                              if (-1 != (na.field_J[var27_int][var28] & var12.field_Vb)) {
                                var29 = 1;
                                break L47;
                              } else {
                                break L47;
                              }
                            } else {
                              break L47;
                            }
                          }
                        }
                        if (var29 != 0) {
                          var30 = "<col=A00000>" + cf.field_f[var27_int] + "</col>";
                          var25 = var30;
                          var24 = var25;
                          var25 = var30;
                          if (var25 == null) {
                            var25 = var30;
                            var24 = var25;
                            var24 = var25;
                            var27_int++;
                            continue L38;
                          } else {
                            var25 = var25 + ", " + var30;
                            var26 = 1;
                            var27_int++;
                            continue L38;
                          }
                        } else {
                          var27_int++;
                          continue L38;
                        }
                      }
                    }
                  } else {
                    break L32;
                  }
                }
              }
            }
            var11 = var12;
            var12 = (dm) (Object) var10.b(6);
            continue L10;
          }
        }
    }

    final static void a(int param0, vg param1, byte param2) {
        ga var3 = ma.field_a;
        if (param2 > -120) {
            return;
        }
        var3.b((byte) -35, param0);
        var3.a(119, param1.field_i);
        var3.a(-21, param1.field_p);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Tutorial Tips: On", "Tutorial Tips: Off"};
        field_b = new int[8192];
    }
}
