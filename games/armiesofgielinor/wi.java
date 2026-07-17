/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    int field_d;
    static String field_a;
    static int field_c;
    static String field_h;
    int field_e;
    static lk field_f;
    int field_b;
    int field_g;

    final static void a(int param0, int param1, boolean param2, int param3, dn param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        at var10 = null;
        Object var11 = null;
        int var11_int = 0;
        of var12 = null;
        int var13 = 0;
        je var14 = null;
        je var15 = null;
        je var16 = null;
        je var17 = null;
        je var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        String var23 = null;
        int var23_int = 0;
        String var24 = null;
        int var24_int = 0;
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
        dn stackIn_37_0 = null;
        boolean stackIn_37_1 = false;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        dn stackIn_38_0 = null;
        boolean stackIn_38_1 = false;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        dn stackIn_39_0 = null;
        boolean stackIn_39_1 = false;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        int stackIn_39_4 = 0;
        int stackIn_42_0 = 0;
        int stackIn_60_0 = 0;
        je stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        je stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        int stackIn_98_3 = 0;
        je stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        int stackIn_99_4 = 0;
        dn stackOut_36_0 = null;
        boolean stackOut_36_1 = false;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        dn stackOut_38_0 = null;
        boolean stackOut_38_1 = false;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        int stackOut_38_4 = 0;
        dn stackOut_37_0 = null;
        boolean stackOut_37_1 = false;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        je stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        int stackOut_96_3 = 0;
        je stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int stackOut_98_3 = 0;
        int stackOut_98_4 = 0;
        je stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int stackOut_97_3 = 0;
        int stackOut_97_4 = 0;
        L0: {
          L1: {
            var31 = ArmiesOfGielinor.field_M ? 1 : 0;
            var5_int = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            if (vu.field_M == null) {
              break L1;
            } else {
              L2: {
                if (null != ep.field_p) {
                  break L2;
                } else {
                  if (iv.field_e != null) {
                    break L2;
                  } else {
                    if (jv.field_d != null) {
                      break L2;
                    } else {
                      if (sk.field_j != null) {
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
                if (var9 >= tq.field_b) {
                  break L1;
                } else {
                  var10_int = vu.field_M.field_pc[var9] & 255;
                  if (var31 != 0) {
                    break L0;
                  } else {
                    L4: {
                      if (null == ep.field_p) {
                        break L4;
                      } else {
                        if (null == ep.field_p[var9]) {
                          break L4;
                        } else {
                          if (ep.field_p[var9][var10_int]) {
                            var5_int = 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      if (null == iv.field_e) {
                        break L5;
                      } else {
                        if (null == iv.field_e[var9]) {
                          break L5;
                        } else {
                          L6: {
                            var11_int = iv.field_e[var9][var10_int];
                            if (var11_int > var6) {
                              var6 = var11_int;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          if (var11_int == 0) {
                            break L5;
                          } else {
                            if (bj.field_k) {
                              break L5;
                            } else {
                              var5_int = 1;
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    L7: {
                      if (jv.field_d == null) {
                        break L7;
                      } else {
                        if (jv.field_d[var9] != null) {
                          L8: {
                            var11_int = jv.field_d[var9][var10_int];
                            if (var11_int == 0) {
                              break L8;
                            } else {
                              if (!bj.field_k) {
                                var5_int = 1;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          }
                          if (var11_int <= var7) {
                            break L7;
                          } else {
                            var7 = var11_int;
                            break L7;
                          }
                        } else {
                          break L7;
                        }
                      }
                    }
                    L9: {
                      if (null == sk.field_j) {
                        break L9;
                      } else {
                        if (null != sk.field_j[var9]) {
                          var8 = var8 | sk.field_j[var9][var10_int];
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var9++;
                    if (var31 == 0) {
                      continue L3;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          L10: {
            stackOut_36_0 = (dn) param4;
            stackOut_36_1 = param2;
            stackOut_36_2 = param0 * (8 + jn.field_d * 4);
            stackOut_36_3 = jn.field_d * 2 + 4;
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_38_2 = stackOut_36_2;
            stackIn_38_3 = stackOut_36_3;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            stackIn_37_2 = stackOut_36_2;
            stackIn_37_3 = stackOut_36_3;
            if (param4 != pq.field_b) {
              stackOut_38_0 = (dn) (Object) stackIn_38_0;
              stackOut_38_1 = stackIn_38_1;
              stackOut_38_2 = stackIn_38_2;
              stackOut_38_3 = stackIn_38_3;
              stackOut_38_4 = 0;
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              stackIn_39_3 = stackOut_38_3;
              stackIn_39_4 = stackOut_38_4;
              break L10;
            } else {
              stackOut_37_0 = (dn) (Object) stackIn_37_0;
              stackOut_37_1 = stackIn_37_1;
              stackOut_37_2 = stackIn_37_2;
              stackOut_37_3 = stackIn_37_3;
              stackOut_37_4 = 1;
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              stackIn_39_3 = stackOut_37_3;
              stackIn_39_4 = stackOut_37_4;
              break L10;
            }
          }
          L11: {
            if (((dn) (Object) stackIn_39_0).a(stackIn_39_1, stackIn_39_2, stackIn_39_3, stackIn_39_4 == 0, 0, 2)) {
              stackOut_41_0 = 0;
              stackIn_42_0 = stackOut_41_0;
              break L11;
            } else {
              stackOut_40_0 = 1;
              stackIn_42_0 = stackOut_40_0;
              break L11;
            }
          }
          var9 = stackIn_42_0;
          break L0;
        }
        var10 = param4.field_Jb.field_fb;
        var11 = null;
        if (param1 == 255) {
          var12 = (of) (Object) var10.e((byte) 124);
          L12: while (true) {
            L13: {
              if (var12 == null) {
                break L13;
              } else {
                var13 = 0;
                if (var31 != 0) {
                  break L13;
                } else {
                  L14: {
                    if (var12.field_fb == null) {
                      L15: {
                        var12.field_ac = new je(0L, ga.field_i);
                        var12.a(var12.field_ac, 106);
                        var12.field_Tb = new je(0L, ws.field_P);
                        if (fh.field_c) {
                          var12.a(var12.field_Tb, param1 ^ 157);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      var12.field_Tb.field_Eb = 2;
                      var12.field_fc = new je(0L, eq.field_h);
                      var12.a(var12.field_fc, 62);
                      var12.i(-10027);
                      var12.field_dc = new je(0L, rf.field_d);
                      var12.a(var12.field_dc, param1 + -194);
                      var12.field_ec = new je(0L, pt.field_X);
                      var12.a(var12.field_ec, 90);
                      var13 = 1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L16: {
                    var12.field_ac.field_X = null;
                    var14 = var12.field_ac;
                    var12.field_ac.field_ob = 0;
                    var12.field_Tb.field_X = null;
                    var14.field_gb = 0;
                    var12.field_Tb.field_ob = 0;
                    var15 = var12.field_Tb;
                    var15.field_gb = 0;
                    var12.field_dc.field_X = null;
                    var12.field_dc.field_ob = 0;
                    var16 = var12.field_dc;
                    var16.field_gb = 0;
                    var12.field_ec.field_X = null;
                    var12.field_ec.field_ob = 0;
                    var17 = var12.field_ec;
                    var17.field_gb = 0;
                    var12.field_fc.field_X = null;
                    var12.field_fc.field_ob = 0;
                    var18 = var12.field_fc;
                    var18.field_gb = 0;
                    var12.field_gb = param4.field_Jb.field_gb;
                    var19 = 0;
                    var20 = var12.field_Yb;
                    var21 = 72;
                    if (ne.field_f == param4) {
                      var21 += 42;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    var20 = ka.a(var12.field_ac.field_Z, var20, var21);
                    if (var20.equals((Object) (Object) var12.field_Yb)) {
                      stackOut_59_0 = 0;
                      stackIn_60_0 = stackOut_59_0;
                      break L17;
                    } else {
                      stackOut_58_0 = 1;
                      stackIn_60_0 = stackOut_58_0;
                      break L17;
                    }
                  }
                  L18: {
                    L19: {
                      var22 = stackIn_60_0;
                      if (var12.field_Qb < 4) {
                        break L19;
                      } else {
                        var20 = "<img=" + (var12.field_Qb - (4 - vh.field_n)) + ">" + var20;
                        if (var31 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    if (var12.field_Qb <= 0) {
                      break L18;
                    } else {
                      var20 = "<img=" + (-1 + var12.field_Qb) + ">" + var20;
                      break L18;
                    }
                  }
                  L20: {
                    var12.field_ac.field_X = var20;
                    if (var12.k(0)) {
                      break L20;
                    } else {
                      L21: {
                        L22: {
                          L23: {
                            var23_int = 16764006;
                            var24_int = 16777215;
                            if (var5_int == 0) {
                              break L23;
                            } else {
                              if (!var12.field_Zb) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                          if (var6 > var12.field_Sb) {
                            break L22;
                          } else {
                            if (var7 > var12.field_Xb) {
                              break L22;
                            } else {
                              if ((var8 & ~var12.field_Ob) > 0) {
                                break L22;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        var23_int = 8414771;
                        var24_int = 8421504;
                        break L21;
                      }
                      L24: {
                        L25: {
                          var12.field_ac.field_wb = var24_int;
                          var12.field_ac.field_T = var24_int;
                          var12.field_ac.field_W = var24_int;
                          var12.field_dc.field_N = var23_int;
                          var12.field_Tb.field_N = var23_int;
                          var12.field_ac.field_N = var23_int;
                          var12.field_Tb.field_wb = var24_int;
                          je fieldTemp$1 = var12.field_Tb;
                          var12.field_Tb.field_T = var24_int;
                          fieldTemp$1.field_W = var24_int;
                          var12.field_dc.field_wb = var24_int;
                          var12.field_dc.field_T = var24_int;
                          var12.field_dc.field_W = var24_int;
                          if (bu.field_a != param4) {
                            break L25;
                          } else {
                            if (!vu.field_M.field_kc) {
                              var12.field_ec.field_X = bq.field_a;
                              if (var31 == 0) {
                                break L24;
                              } else {
                                break L25;
                              }
                            } else {
                              break L24;
                            }
                          }
                        }
                        L26: {
                          if (var12.field_Wb) {
                            break L26;
                          } else {
                            L27: {
                              if (var12.field_Ub) {
                                break L27;
                              } else {
                                var12.field_dc.field_X = bq.field_b;
                                if (var31 == 0) {
                                  break L24;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            var12.field_ac.field_X = fo.a(param1 + 4545, tr.field_G, new String[1]);
                            var12.field_dc.field_X = gm.field_g;
                            var12.field_ec.field_X = uf.field_l;
                            if (var31 == 0) {
                              break L24;
                            } else {
                              break L26;
                            }
                          }
                        }
                        var12.field_ac.field_X = fo.a(param1 ^ 4671, sm.field_g, new String[1]);
                        var12.field_ec.field_X = ac.field_s;
                        break L24;
                      }
                      L28: {
                        var25_int = 0;
                        if (null == vu.field_M) {
                          break L28;
                        } else {
                          if (!vu.b(false)) {
                            break L28;
                          } else {
                            if (oh.field_H != var12.field_Pb) {
                              L29: {
                                if (null == var12.field_dc.field_X) {
                                  break L29;
                                } else {
                                  var26 = var12.field_dc.j(104) - -(mi.field_l * 2);
                                  var12.field_dc.a(jn.field_d, -20500, var26, var19, var25_int);
                                  var25_int = var25_int + var26;
                                  break L29;
                                }
                              }
                              if (var12.field_ec.field_X != null) {
                                L30: {
                                  L31: {
                                    if (bu.field_a != param4) {
                                      break L31;
                                    } else {
                                      var26 = 40;
                                      if (var31 == 0) {
                                        break L30;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                  var26 = var12.field_ec.j(param1 + -328) - -(mi.field_l * 2);
                                  break L30;
                                }
                                var12.field_ec.a(jn.field_d, param1 + -20755, var26, var19, var25_int);
                                var25_int = var25_int + var26;
                                break L28;
                              } else {
                                break L28;
                              }
                            } else {
                              break L28;
                            }
                          }
                        }
                      }
                      L32: {
                        stackOut_96_0 = var12.field_ac;
                        stackOut_96_1 = jn.field_d;
                        stackOut_96_2 = -20500;
                        stackOut_96_3 = -var25_int + var12.field_gb;
                        stackIn_98_0 = stackOut_96_0;
                        stackIn_98_1 = stackOut_96_1;
                        stackIn_98_2 = stackOut_96_2;
                        stackIn_98_3 = stackOut_96_3;
                        stackIn_97_0 = stackOut_96_0;
                        stackIn_97_1 = stackOut_96_1;
                        stackIn_97_2 = stackOut_96_2;
                        stackIn_97_3 = stackOut_96_3;
                        if (fh.field_c) {
                          stackOut_98_0 = (je) (Object) stackIn_98_0;
                          stackOut_98_1 = stackIn_98_1;
                          stackOut_98_2 = stackIn_98_2;
                          stackOut_98_3 = stackIn_98_3;
                          stackOut_98_4 = 42;
                          stackIn_99_0 = stackOut_98_0;
                          stackIn_99_1 = stackOut_98_1;
                          stackIn_99_2 = stackOut_98_2;
                          stackIn_99_3 = stackOut_98_3;
                          stackIn_99_4 = stackOut_98_4;
                          break L32;
                        } else {
                          stackOut_97_0 = (je) (Object) stackIn_97_0;
                          stackOut_97_1 = stackIn_97_1;
                          stackOut_97_2 = stackIn_97_2;
                          stackOut_97_3 = stackIn_97_3;
                          stackOut_97_4 = 0;
                          stackIn_99_0 = stackOut_97_0;
                          stackIn_99_1 = stackOut_97_1;
                          stackIn_99_2 = stackOut_97_2;
                          stackIn_99_3 = stackOut_97_3;
                          stackIn_99_4 = stackOut_97_4;
                          break L32;
                        }
                      }
                      L33: {
                        L34: {
                          L35: {
                            ((je) (Object) stackIn_99_0).a(stackIn_99_1, stackIn_99_2, stackIn_99_3 + -stackIn_99_4, var19, var25_int);
                            var12.field_Tb.field_X = Integer.toString(var12.field_Sb);
                            var12.field_Tb.a(jn.field_d, -20500, 40, var19, var12.field_gb - 40);
                            if (!var12.field_ac.field_eb) {
                              break L35;
                            } else {
                              if (var22 != 0) {
                                break L34;
                              } else {
                                break L35;
                              }
                            }
                          }
                          if (!var12.field_ac.field_eb) {
                            break L33;
                          } else {
                            if (jc.field_v == null) {
                              break L33;
                            } else {
                              if (null == jc.field_v[var12.field_Qb]) {
                                break L33;
                              } else {
                                ad.field_I = jc.field_v[var12.field_Qb];
                                if (var31 == 0) {
                                  break L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                          }
                        }
                        ad.field_I = var12.field_Yb;
                        if (jc.field_v == null) {
                          break L33;
                        } else {
                          if (jc.field_v[var12.field_Qb] != null) {
                            ad.field_I = ad.field_I + " - " + jc.field_v[var12.field_Qb];
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                      }
                      var19 = var19 + jn.field_d;
                      break L20;
                    }
                  }
                  L36: {
                    var23 = s.a(false, var20, var12.field_Kb);
                    var24 = var23;
                    var24 = var23;
                    if (var23 != null) {
                      var24_int = var12.field_fc.field_Z.c(var23, -mi.field_l + (var12.field_gb - mi.field_l));
                      var12.field_fc.field_C = var12.field_Rb * 256 / qd.field_K;
                      var12.field_fc.field_X = var23;
                      var12.field_fc.a(var24_int * jn.field_d, -20500, var12.field_gb + -(2 * mi.field_l), var19, mi.field_l);
                      var19 = var19 + jn.field_d * var24_int;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if (var9 != 0) {
                      break L37;
                    } else {
                      var12.field_nb = var19 + -var12.field_ob;
                      break L37;
                    }
                  }
                  L38: {
                    if (var13 != 0) {
                      param4.field_Jb.a((je) (Object) var12, true, 2, (je) var11);
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                  L39: {
                    if (var12.field_yb == 0) {
                      break L39;
                    } else {
                      if (var12.k(0)) {
                        break L39;
                      } else {
                        L40: {
                          if (var12.field_dc.field_yb != 0) {
                            break L40;
                          } else {
                            L41: {
                              if (0 == var12.field_ec.field_yb) {
                                break L41;
                              } else {
                                te.a(param3, var12.field_Pb, (byte) 97);
                                if (var31 == 0) {
                                  break L39;
                                } else {
                                  break L41;
                                }
                              }
                            }
                            bk.a(false, 0, iu.field_t, 0, var12, param4, ur.field_z);
                            if (var31 == 0) {
                              break L39;
                            } else {
                              break L40;
                            }
                          }
                        }
                        ra.a(var12.field_Pb, param3, 6);
                        break L39;
                      }
                    }
                  }
                  L42: {
                    var11 = (Object) (Object) var12;
                    if (!var12.field_jb) {
                      break L42;
                    } else {
                      if (!var12.k(0)) {
                        L43: {
                          var24 = null;
                          if (oh.field_H != var12.field_Pb) {
                            L44: {
                              if (var5_int == 0) {
                                break L44;
                              } else {
                                if (!var12.field_Zb) {
                                  var24 = fo.a(param1 + 4545, em.field_b, new String[1]);
                                  break L43;
                                } else {
                                  break L44;
                                }
                              }
                            }
                            if (var7 <= var12.field_Xb) {
                              if (var6 <= var12.field_Sb) {
                                if ((~var12.field_Ob & var8) == 0) {
                                  break L43;
                                } else {
                                  var25_int = fd.a(true, ~var12.field_Ob & var8);
                                  var24 = fo.a(4800, h.field_f, new String[1]);
                                  if (0 >= var25_int) {
                                    break L43;
                                  } else {
                                    if (jl.field_c == null) {
                                      break L43;
                                    } else {
                                      if (jl.field_c.length < var25_int) {
                                        break L43;
                                      } else {
                                        if (jl.field_c[var25_int - 1] == null) {
                                          break L43;
                                        } else {
                                          var24 = fo.a(4800, jl.field_c[-1 + var25_int][2], new String[1]);
                                          break L43;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var24 = fo.a(4800, bk.field_g, new String[2]);
                                break L43;
                              }
                            } else {
                              L45: {
                                var25_int = -var12.field_Xb + var7;
                                if (var25_int == 1) {
                                  var24 = fo.a(4800, co.field_r, new String[1]);
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              var24 = fo.a(4800, oc.field_Ib, new String[2]);
                              break L43;
                            }
                          } else {
                            L46: {
                              if (var5_int == 0) {
                                break L46;
                              } else {
                                if (!var12.field_Zb) {
                                  var24 = is.field_a;
                                  break L43;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            if (var7 > var12.field_Xb) {
                              L47: {
                                var25_int = -var12.field_Xb + var7;
                                if (var25_int == 1) {
                                  var24 = tn.field_Y;
                                  break L47;
                                } else {
                                  break L47;
                                }
                              }
                              var24 = fo.a(4800, al.field_j, new String[2]);
                              break L43;
                            } else {
                              if (var6 <= var12.field_Sb) {
                                if (0 != (var8 & ~var12.field_Ob)) {
                                  var25_int = fd.a(true, ~var12.field_Ob & var8);
                                  var24 = vb.field_l;
                                  if (var25_int <= 0) {
                                    break L43;
                                  } else {
                                    if (null == jl.field_c) {
                                      break L43;
                                    } else {
                                      if (jl.field_c.length < var25_int) {
                                        break L43;
                                      } else {
                                        if (jl.field_c[var25_int - 1] != null) {
                                          var24 = jl.field_c[-1 + var25_int][1];
                                          break L43;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L43;
                                }
                              } else {
                                var24 = fo.a(4800, vi.field_b, new String[2]);
                                break L43;
                              }
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
                          L48: while (true) {
                            L49: {
                              L50: {
                                L51: {
                                  if (var27_int >= tq.field_b) {
                                    break L51;
                                  } else {
                                    var28 = vu.field_M.field_pc[var27_int] & 255;
                                    var29 = 0;
                                    if (var31 != 0) {
                                      break L50;
                                    } else {
                                      L52: {
                                        if (ep.field_p == null) {
                                          break L52;
                                        } else {
                                          if (ep.field_p[var27_int] != null) {
                                            if (!ep.field_p[var27_int][var28]) {
                                              break L52;
                                            } else {
                                              if (var12.field_Zb) {
                                                break L52;
                                              } else {
                                                var29 = 1;
                                                break L52;
                                              }
                                            }
                                          } else {
                                            break L52;
                                          }
                                        }
                                      }
                                      L53: {
                                        if (null == iv.field_e) {
                                          break L53;
                                        } else {
                                          if (null != iv.field_e[var27_int]) {
                                            L54: {
                                              var30_int = iv.field_e[var27_int][var28];
                                              if (var30_int == 0) {
                                                break L54;
                                              } else {
                                                if (bj.field_k) {
                                                  break L54;
                                                } else {
                                                  if (!var12.field_Zb) {
                                                    var29 = 1;
                                                    break L54;
                                                  } else {
                                                    break L54;
                                                  }
                                                }
                                              }
                                            }
                                            if (var12.field_Sb < var30_int) {
                                              var29 = 1;
                                              break L53;
                                            } else {
                                              break L53;
                                            }
                                          } else {
                                            break L53;
                                          }
                                        }
                                      }
                                      L55: {
                                        if (jv.field_d == null) {
                                          break L55;
                                        } else {
                                          if (null == jv.field_d[var27_int]) {
                                            break L55;
                                          } else {
                                            L56: {
                                              var30_int = jv.field_d[var27_int][var28];
                                              if (var30_int == 0) {
                                                break L56;
                                              } else {
                                                if (bj.field_k) {
                                                  break L56;
                                                } else {
                                                  if (!var12.field_Zb) {
                                                    var29 = 1;
                                                    break L56;
                                                  } else {
                                                    break L56;
                                                  }
                                                }
                                              }
                                            }
                                            if (var12.field_Xb < var30_int) {
                                              var29 = 1;
                                              break L55;
                                            } else {
                                              break L55;
                                            }
                                          }
                                        }
                                      }
                                      L57: {
                                        if (sk.field_j == null) {
                                          break L57;
                                        } else {
                                          if (null == sk.field_j[var27_int]) {
                                            break L57;
                                          } else {
                                            if ((~var12.field_Ob & sk.field_j[var27_int][var28]) == 0) {
                                              break L57;
                                            } else {
                                              var29 = 1;
                                              break L57;
                                            }
                                          }
                                        }
                                      }
                                      L58: {
                                        if (var29 != 0) {
                                          L59: {
                                            var30 = "<col=A00000>" + ob.field_M[var27_int] + "</col>";
                                            var25 = var30;
                                            var25 = var30;
                                            if (var25 != null) {
                                              break L59;
                                            } else {
                                              var25 = var30;
                                              if (var31 == 0) {
                                                break L58;
                                              } else {
                                                break L59;
                                              }
                                            }
                                          }
                                          var25 = var25 + ", " + var30;
                                          var24 = var25;
                                          var24 = var25;
                                          var26 = 1;
                                          break L58;
                                        } else {
                                          break L58;
                                        }
                                      }
                                      var27_int++;
                                      if (var31 == 0) {
                                        continue L48;
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                }
                                if (param4 != bu.field_a) {
                                  break L50;
                                } else {
                                  if (!vu.b(false)) {
                                    break L50;
                                  } else {
                                    L60: {
                                      if (var26 != 0) {
                                        break L60;
                                      } else {
                                        var24 = var24 + "<br>" + fo.a(4800, tp.field_c, new String[1]);
                                        if (var31 == 0) {
                                          break L49;
                                        } else {
                                          break L60;
                                        }
                                      }
                                    }
                                    var24 = var24 + "<br>" + wg.field_d + var25;
                                    if (var31 == 0) {
                                      break L49;
                                    } else {
                                      break L50;
                                    }
                                  }
                                }
                              }
                              L61: {
                                if (var26 == 0) {
                                  break L61;
                                } else {
                                  var24 = var24 + "<br>" + nm.field_u + var25;
                                  if (var31 == 0) {
                                    break L49;
                                  } else {
                                    break L61;
                                  }
                                }
                              }
                              var24 = var24 + "<br>" + fo.a(4800, ue.field_e, new String[1]);
                              break L49;
                            }
                            L62: {
                              if (param4 != bu.field_a) {
                                break L62;
                              } else {
                                if (vu.b(false)) {
                                  break L62;
                                } else {
                                  var27 = vu.field_M.field_rc;
                                  var24 = var24 + "<br>" + fo.a(param1 ^ 4671, cj.field_l, new String[1]);
                                  break L62;
                                }
                              }
                            }
                            ad.field_I = var24;
                            break L42;
                          }
                        } else {
                          break L42;
                        }
                      } else {
                        break L42;
                      }
                    }
                  }
                  var12 = (of) (Object) var10.a((byte) 123);
                  if (var31 == 0) {
                    continue L12;
                  } else {
                    break L13;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        if (param0 != -14691) {
            return;
        }
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Gielinor! A new world, rich in powerful magic. The gods seek to dominate this new realm, but only you can determine its fate.";
        field_h = "Equip";
    }
}
