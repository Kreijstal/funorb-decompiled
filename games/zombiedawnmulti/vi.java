/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static int[] field_b;
    static String[] field_a;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, byte param2, tq param3, boolean param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        th var10 = null;
        Object var11 = null;
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
        String var25 = null;
        int var25_int = 0;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30_ref_String = null;
        int var30 = 0;
        int var31 = 0;
        Object var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        tq stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        boolean stackIn_34_2 = false;
        int stackIn_34_3 = 0;
        tq stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        boolean stackIn_35_2 = false;
        int stackIn_35_3 = 0;
        tq stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        boolean stackIn_36_2 = false;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_39_0 = 0;
        int stackIn_53_0 = 0;
        cj stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_89_2 = 0;
        int stackIn_89_3 = 0;
        int stackIn_89_4 = 0;
        cj stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        int stackIn_90_4 = 0;
        cj stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        int stackIn_91_3 = 0;
        int stackIn_91_4 = 0;
        int stackIn_91_5 = 0;
        tq stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        boolean stackOut_33_2 = false;
        int stackOut_33_3 = 0;
        tq stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        boolean stackOut_35_2 = false;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        tq stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        boolean stackOut_34_2 = false;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        cj stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        int stackOut_88_3 = 0;
        int stackOut_88_4 = 0;
        cj stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        int stackOut_90_3 = 0;
        int stackOut_90_4 = 0;
        int stackOut_90_5 = 0;
        cj stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        int stackOut_89_3 = 0;
        int stackOut_89_4 = 0;
        int stackOut_89_5 = 0;
        L0: {
          var31 = ZombieDawnMulti.field_E ? 1 : 0;
          var5_int = 0;
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
                        var5_int = 1;
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
                            var5_int = 1;
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
                          var5_int = 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      L8: {
                        if (null == na.field_J) {
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                }
                L9: {
                  if (null == na.field_J) {
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        }
        L10: {
          stackOut_33_0 = (tq) param3;
          stackOut_33_1 = 2;
          stackOut_33_2 = param4;
          stackOut_33_3 = (2 + jk.field_f) * 2;
          stackIn_35_0 = stackOut_33_0;
          stackIn_35_1 = stackOut_33_1;
          stackIn_35_2 = stackOut_33_2;
          stackIn_35_3 = stackOut_33_3;
          stackIn_34_0 = stackOut_33_0;
          stackIn_34_1 = stackOut_33_1;
          stackIn_34_2 = stackOut_33_2;
          stackIn_34_3 = stackOut_33_3;
          if (vc.field_d != param3) {
            stackOut_35_0 = (tq) (Object) stackIn_35_0;
            stackOut_35_1 = stackIn_35_1;
            stackOut_35_2 = stackIn_35_2;
            stackOut_35_3 = stackIn_35_3;
            stackOut_35_4 = 0;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            stackIn_36_2 = stackOut_35_2;
            stackIn_36_3 = stackOut_35_3;
            stackIn_36_4 = stackOut_35_4;
            break L10;
          } else {
            stackOut_34_0 = (tq) (Object) stackIn_34_0;
            stackOut_34_1 = stackIn_34_1;
            stackOut_34_2 = stackIn_34_2;
            stackOut_34_3 = stackIn_34_3;
            stackOut_34_4 = 1;
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_36_2 = stackOut_34_2;
            stackIn_36_3 = stackOut_34_3;
            stackIn_36_4 = stackOut_34_4;
            break L10;
          }
        }
        L11: {
          if (((tq) (Object) stackIn_36_0).a(stackIn_36_1, stackIn_36_2, stackIn_36_3, stackIn_36_4 == 0, 4 * (2 + jk.field_f) * param0, param2 ^ -126)) {
            stackOut_38_0 = 0;
            stackIn_39_0 = stackOut_38_0;
            break L11;
          } else {
            stackOut_37_0 = 1;
            stackIn_39_0 = stackOut_37_0;
            break L11;
          }
        }
        var9 = stackIn_39_0;
        var10 = param3.field_Gb.field_Cb;
        var11 = null;
        var12 = (dm) (Object) var10.c(124);
        L12: while (true) {
          if (var12 == null) {
            L13: {
              if (param2 == 45) {
                break L13;
              } else {
                var32 = null;
                vi.a(80, -48, (byte) -35, (tq) null, false);
                break L13;
              }
            }
            return;
          } else {
            L14: {
              var13 = 0;
              if (var12.field_Cb == null) {
                L15: {
                  var12.field_Ub = new cj(0L, m.field_x);
                  var12.a((byte) 50, var12.field_Ub);
                  var12.field_Gb = new cj(0L, wc.field_H);
                  if (tb.field_u) {
                    var12.a((byte) 50, var12.field_Gb);
                    break L15;
                  } else {
                    break L15;
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
                break L14;
              } else {
                break L14;
              }
            }
            L16: {
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
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              var34 = fm.a(var12.field_Ub.field_yb, var33, var21);
              var20 = var34;
              var20 = var34;
              if (var34.equals((Object) (Object) var12.field_Lb)) {
                stackOut_52_0 = 0;
                stackIn_53_0 = stackOut_52_0;
                break L17;
              } else {
                stackOut_51_0 = 1;
                stackIn_53_0 = stackOut_51_0;
                break L17;
              }
            }
            L18: {
              var22 = stackIn_53_0;
              if (var12.field_Yb < 4) {
                if (var12.field_Yb > 0) {
                  var20 = "<img=" + (var12.field_Yb + -1) + ">" + var34;
                  break L18;
                } else {
                  break L18;
                }
              } else {
                var20 = "<img=" + (-4 + (var12.field_Yb + hg.field_ub)) + ">" + var34;
                break L18;
              }
            }
            L19: {
              var12.field_Ub.field_wb = var20;
              if (!var12.c((byte) 15)) {
                L20: {
                  L21: {
                    L22: {
                      var23_int = 16764006;
                      var24_int = 16777215;
                      if (var5_int == 0) {
                        break L22;
                      } else {
                        if (!var12.field_Nb) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                    if (var6 > var12.field_Mb) {
                      break L21;
                    } else {
                      if (var12.field_Sb < var7) {
                        break L21;
                      } else {
                        if ((~var12.field_Vb & var8) <= 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                  }
                  var23_int = 8414771;
                  var24_int = 8421504;
                  break L20;
                }
                L23: {
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
                      break L23;
                    } else {
                      break L23;
                    }
                  } else {
                    if (var12.field_Pb) {
                      var12.field_Ub.field_wb = vl.a(ke.field_a, new String[1], 2);
                      var12.field_cc.field_wb = gk.field_a;
                      break L23;
                    } else {
                      if (var12.field_Ob) {
                        var12.field_Ub.field_wb = vl.a(oi.field_b, new String[1], 2);
                        var12.field_Tb.field_wb = df.field_J;
                        var12.field_cc.field_wb = bn.field_a;
                        break L23;
                      } else {
                        var12.field_Tb.field_wb = nn.field_a;
                        break L23;
                      }
                    }
                  }
                }
                L24: {
                  var25_int = 0;
                  if (null == mh.field_c) {
                    break L24;
                  } else {
                    if (!hl.b(param2 ^ 45)) {
                      break L24;
                    } else {
                      if (~ie.field_sb == ~var12.field_ec) {
                        break L24;
                      } else {
                        L25: {
                          if (null == var12.field_Tb.field_wb) {
                            break L25;
                          } else {
                            var26 = var12.field_Tb.e(param2 + -45) + 2 * nj.field_h;
                            var12.field_Tb.a(jk.field_f, var19, var26, var25_int, -3344);
                            var25_int = var25_int + var26;
                            break L25;
                          }
                        }
                        if (null != var12.field_cc.field_wb) {
                          L26: {
                            if (bf.field_n == param3) {
                              var26 = 40;
                              break L26;
                            } else {
                              var26 = var12.field_cc.e(0) - -(2 * nj.field_h);
                              break L26;
                            }
                          }
                          var12.field_cc.a(jk.field_f, var19, var26, var25_int, -3344);
                          var25_int = var25_int + var26;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                    }
                  }
                }
                L27: {
                  stackOut_88_0 = var12.field_Ub;
                  stackOut_88_1 = jk.field_f;
                  stackOut_88_2 = var19;
                  stackOut_88_3 = -var25_int;
                  stackOut_88_4 = var12.field_zb;
                  stackIn_90_0 = stackOut_88_0;
                  stackIn_90_1 = stackOut_88_1;
                  stackIn_90_2 = stackOut_88_2;
                  stackIn_90_3 = stackOut_88_3;
                  stackIn_90_4 = stackOut_88_4;
                  stackIn_89_0 = stackOut_88_0;
                  stackIn_89_1 = stackOut_88_1;
                  stackIn_89_2 = stackOut_88_2;
                  stackIn_89_3 = stackOut_88_3;
                  stackIn_89_4 = stackOut_88_4;
                  if (!tb.field_u) {
                    stackOut_90_0 = (cj) (Object) stackIn_90_0;
                    stackOut_90_1 = stackIn_90_1;
                    stackOut_90_2 = stackIn_90_2;
                    stackOut_90_3 = stackIn_90_3;
                    stackOut_90_4 = stackIn_90_4;
                    stackOut_90_5 = 0;
                    stackIn_91_0 = stackOut_90_0;
                    stackIn_91_1 = stackOut_90_1;
                    stackIn_91_2 = stackOut_90_2;
                    stackIn_91_3 = stackOut_90_3;
                    stackIn_91_4 = stackOut_90_4;
                    stackIn_91_5 = stackOut_90_5;
                    break L27;
                  } else {
                    stackOut_89_0 = (cj) (Object) stackIn_89_0;
                    stackOut_89_1 = stackIn_89_1;
                    stackOut_89_2 = stackIn_89_2;
                    stackOut_89_3 = stackIn_89_3;
                    stackOut_89_4 = stackIn_89_4;
                    stackOut_89_5 = 42;
                    stackIn_91_0 = stackOut_89_0;
                    stackIn_91_1 = stackOut_89_1;
                    stackIn_91_2 = stackOut_89_2;
                    stackIn_91_3 = stackOut_89_3;
                    stackIn_91_4 = stackOut_89_4;
                    stackIn_91_5 = stackOut_89_5;
                    break L27;
                  }
                }
                L28: {
                  L29: {
                    ((cj) (Object) stackIn_91_0).a(stackIn_91_1, stackIn_91_2, stackIn_91_3 + (stackIn_91_4 - stackIn_91_5), var25_int, -3344);
                    var12.field_Gb.field_wb = Integer.toString(var12.field_Mb);
                    var12.field_Gb.a(jk.field_f, var19, 40, var12.field_zb - 40, -3344);
                    if (!var12.field_Ub.field_L) {
                      break L29;
                    } else {
                      if (var22 != 0) {
                        ui.field_j = var12.field_Lb;
                        if (null == rl.field_h) {
                          break L28;
                        } else {
                          if (null != rl.field_h[var12.field_Yb]) {
                            ui.field_j = ui.field_j + " - " + rl.field_h[var12.field_Yb];
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
                  if (!var12.field_Ub.field_L) {
                    break L28;
                  } else {
                    if (rl.field_h == null) {
                      break L28;
                    } else {
                      if (null != rl.field_h[var12.field_Yb]) {
                        ui.field_j = rl.field_h[var12.field_Yb];
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                  }
                }
                var19 = var19 + jk.field_f;
                break L19;
              } else {
                break L19;
              }
            }
            L30: {
              var23 = ua.a((byte) -61, var12.field_Fb, var20);
              var24 = var23;
              var30_ref_String = var24;
              var25 = var30_ref_String;
              var24 = var23;
              if (var23 == null) {
                break L30;
              } else {
                var24_int = var12.field_Hb.field_yb.b(var23, -nj.field_h + (var12.field_zb + -nj.field_h));
                var12.field_Hb.field_wb = var23;
                var12.field_Hb.field_Y = 256 * var12.field_bc / so.field_r;
                var12.field_Hb.a(jk.field_f * var24_int, var19, -(2 * nj.field_h) + var12.field_zb, nj.field_h, -3344);
                var19 = var19 + jk.field_f * var24_int;
                break L30;
              }
            }
            L31: {
              if (var9 == 0) {
                var12.field_I = -var12.field_z + var19;
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              if (var13 == 0) {
                break L32;
              } else {
                param3.field_Gb.a(2, (cj) (Object) var12, 1300, (cj) var11);
                break L32;
              }
            }
            L33: {
              if (var12.field_T == 0) {
                break L33;
              } else {
                if (var12.c((byte) 15)) {
                  break L33;
                } else {
                  if (var12.field_Tb.field_T != 0) {
                    so.a(-21148, var12.field_ec, param1);
                    break L33;
                  } else {
                    if (var12.field_cc.field_T == 0) {
                      wl.a(ka.field_t, param3, 0, 0, (byte) 81, vb.field_f, var12);
                      break L33;
                    } else {
                      cg.a(param1, -27404, var12.field_ec);
                      break L33;
                    }
                  }
                }
              }
            }
            L34: {
              if (!var12.field_pb) {
                break L34;
              } else {
                if (var12.c((byte) 15)) {
                  break L34;
                } else {
                  L35: {
                    var24 = null;
                    if (~var12.field_ec == ~ie.field_sb) {
                      L36: {
                        if (var5_int == 0) {
                          break L36;
                        } else {
                          if (var12.field_Nb) {
                            break L36;
                          } else {
                            var24 = lj.field_s;
                            break L35;
                          }
                        }
                      }
                      if (var7 > var12.field_Sb) {
                        L37: {
                          var25_int = -var12.field_Sb + var7;
                          if (var25_int != 1) {
                            break L37;
                          } else {
                            var24 = jk.field_a;
                            break L37;
                          }
                        }
                        var24 = vl.a(ij.field_f, new String[2], 2);
                        var30_ref_String = var24;
                        var25 = var30_ref_String;
                        var24 = var25;
                        var30_ref_String = var24;
                        var25 = var30_ref_String;
                        break L35;
                      } else {
                        if (var12.field_Mb < var6) {
                          var24 = vl.a(oi.field_a, new String[2], 2);
                          break L35;
                        } else {
                          if ((~var12.field_Vb & var8) == 0) {
                            break L35;
                          } else {
                            var25_int = vl.a(var8 & ~var12.field_Vb, (byte) -103);
                            var24 = af.field_c;
                            if (0 >= var25_int) {
                              break L35;
                            } else {
                              if (ki.field_o == null) {
                                break L35;
                              } else {
                                if (ki.field_o.length < var25_int) {
                                  break L35;
                                } else {
                                  if (ki.field_o[var25_int - 1] == null) {
                                    break L35;
                                  } else {
                                    var24 = ki.field_o[-1 + var25_int][1];
                                    break L35;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      L38: {
                        if (var5_int == 0) {
                          break L38;
                        } else {
                          if (var12.field_Nb) {
                            break L38;
                          } else {
                            var24 = vl.a(op.field_n, new String[1], 2);
                            break L35;
                          }
                        }
                      }
                      if (var12.field_Sb < var7) {
                        L39: {
                          var25_int = var7 + -var12.field_Sb;
                          if (var25_int != 1) {
                            break L39;
                          } else {
                            var24 = vl.a(ce.field_o, new String[1], 2);
                            break L39;
                          }
                        }
                        var24 = vl.a(bg.field_m, new String[2], 2);
                        break L35;
                      } else {
                        if (var6 <= var12.field_Mb) {
                          if (0 != (~var12.field_Vb & var8)) {
                            var25_int = vl.a(var8 & ~var12.field_Vb, (byte) -103);
                            var24 = vl.a(ap.field_r, new String[1], 2);
                            if (var25_int <= 0) {
                              break L35;
                            } else {
                              if (null == ki.field_o) {
                                break L35;
                              } else {
                                if (var25_int > ki.field_o.length) {
                                  break L35;
                                } else {
                                  if (null != ki.field_o[var25_int - 1]) {
                                    var24 = vl.a(ki.field_o[var25_int + -1][2], new String[1], param2 + -43);
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
                          var24 = vl.a(ek.field_y, new String[2], 2);
                          break L35;
                        }
                      }
                    }
                  }
                  if (var24 != null) {
                    var35 = "<col=A00000>" + var24;
                    var30_ref_String = var35;
                    var25 = var30_ref_String;
                    var24 = var25;
                    var30_ref_String = var35;
                    var25 = var30_ref_String;
                    var25 = null;
                    var26 = 0;
                    var27_int = 0;
                    L40: while (true) {
                      if (var27_int >= kj.field_h) {
                        L41: {
                          L42: {
                            if (bf.field_n != param3) {
                              break L42;
                            } else {
                              if (hl.b(0)) {
                                if (var26 != 0) {
                                  var24 = var35 + "<br>" + mc.field_b + var25;
                                  break L41;
                                } else {
                                  var24 = var35 + "<br>" + vl.a(od.field_Cb, new String[1], 2);
                                  break L41;
                                }
                              } else {
                                break L42;
                              }
                            }
                          }
                          if (var26 != 0) {
                            var24 = var35 + "<br>" + mb.field_u + var25;
                            break L41;
                          } else {
                            var24 = var35 + "<br>" + vl.a(dg.field_L, new String[1], 2);
                            break L41;
                          }
                        }
                        L43: {
                          if (bf.field_n != param3) {
                            break L43;
                          } else {
                            if (!hl.b(0)) {
                              var27 = mh.field_c.field_Nb;
                              var24 = var24 + "<br>" + vl.a(mj.field_Ob, new String[1], param2 + -43);
                              break L43;
                            } else {
                              break L43;
                            }
                          }
                        }
                        ui.field_j = var24;
                        break L34;
                      } else {
                        L44: {
                          var28 = mh.field_c.field_Zb[var27_int] & 255;
                          var29 = 0;
                          if (ch.field_g == null) {
                            break L44;
                          } else {
                            if (ch.field_g[var27_int] == null) {
                              break L44;
                            } else {
                              if (!ch.field_g[var27_int][var28]) {
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
                        }
                        L45: {
                          if (sd.field_G == null) {
                            break L45;
                          } else {
                            if (sd.field_G[var27_int] == null) {
                              break L45;
                            } else {
                              L46: {
                                var30 = sd.field_G[var27_int][var28];
                                if (var30 == 0) {
                                  break L46;
                                } else {
                                  if (bo.field_e) {
                                    break L46;
                                  } else {
                                    if (var12.field_Nb) {
                                      break L46;
                                    } else {
                                      var29 = 1;
                                      break L46;
                                    }
                                  }
                                }
                              }
                              if (var12.field_Mb < var30) {
                                var29 = 1;
                                break L45;
                              } else {
                                break L45;
                              }
                            }
                          }
                        }
                        L47: {
                          if (null == r.field_c) {
                            break L47;
                          } else {
                            if (r.field_c[var27_int] == null) {
                              break L47;
                            } else {
                              L48: {
                                var30 = r.field_c[var27_int][var28];
                                if (var30 == 0) {
                                  break L48;
                                } else {
                                  if (bo.field_e) {
                                    break L48;
                                  } else {
                                    if (!var12.field_Nb) {
                                      var29 = 1;
                                      break L48;
                                    } else {
                                      break L48;
                                    }
                                  }
                                }
                              }
                              if (var30 <= var12.field_Sb) {
                                break L47;
                              } else {
                                var29 = 1;
                                break L47;
                              }
                            }
                          }
                        }
                        L49: {
                          if (na.field_J == null) {
                            break L49;
                          } else {
                            if (na.field_J[var27_int] != null) {
                              if (-1 != (na.field_J[var27_int][var28] & var12.field_Vb)) {
                                var29 = 1;
                                break L49;
                              } else {
                                break L49;
                              }
                            } else {
                              break L49;
                            }
                          }
                        }
                        L50: {
                          if (var29 == 0) {
                            break L50;
                          } else {
                            break L50;
                          }
                        }
                        var27_int++;
                        continue L40;
                      }
                    }
                  } else {
                    break L34;
                  }
                }
              }
            }
            var11 = (Object) (Object) var12;
            var12 = (dm) (Object) var10.b(6);
            continue L12;
          }
        }
    }

    final static void a(int param0, vg param1, byte param2) {
        ga var3 = ma.field_a;
        if (param2 > -120) {
            return;
        }
        try {
            var3.b((byte) -35, 7);
            var3.a(119, param1.field_i);
            var3.a(-21, param1.field_p);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "vi.C(" + 7 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Tutorial Tips: On", "Tutorial Tips: Off"};
        field_b = new int[8192];
    }
}
