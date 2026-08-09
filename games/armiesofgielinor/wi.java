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
        dn stackIn_39_0;
        boolean stackIn_39_1;
        int stackIn_39_2;
        int stackIn_39_3;
        dn stackIn_40_0 = null;
        boolean stackIn_40_1 = false;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        int stackIn_43_0 = 0;
        int stackIn_59_0 = 0;
        je stackIn_95_0;
        int stackIn_95_1;
        int stackIn_95_2;
        int stackIn_95_3;
        je stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        int stackIn_96_4 = 0;
        RuntimeException stackIn_220_0 = null;
        StringBuilder stackIn_220_1 = null;
        RuntimeException stackIn_221_0 = null;
        StringBuilder stackIn_221_1 = null;
        String stackIn_221_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        at var10 = null;
        int var11_int = 0;
        Object var11 = null;
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
        String var32 = null;
        String var33 = null;
        String var34 = null;
        var31 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
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
                    L4: {
                      var10_int = vu.field_M.field_pc[var9] & 255;
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
                            if (-1 == (var11_int ^ -1)) {
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
                    if (null != sk.field_j) {
                      L9: {
                        if (null != sk.field_j[var9]) {
                          var8 = var8 | sk.field_j[var9][var10_int];
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var9++;
                      continue L3;
                    } else {
                      var9++;
                      continue L3;
                    }
                  }
                }
              }
            }
            L10: {
              stackIn_39_0 = (dn) (param4);

              stackIn_39_1 = param2;

              stackIn_39_2 = param0 * (8 + jn.field_d * 4);

              stackIn_39_3 = jn.field_d * 2 + 4;

              if (param4 != pq.field_b) {
                stackIn_40_0 = (dn) ((Object) stackIn_39_0);
                stackIn_40_1 = stackIn_39_1;
                stackIn_40_2 = stackIn_39_2;
                stackIn_40_3 = stackIn_39_3;
                stackIn_40_4 = 0;
                break L10;
              } else {
                stackIn_40_0 = (dn) ((Object) stackIn_39_0);
                stackIn_40_1 = stackIn_39_1;
                stackIn_40_2 = stackIn_39_2;
                stackIn_40_3 = stackIn_39_3;
                stackIn_40_4 = 1;
                break L10;
              }
            }
            L11: {
              if (!((dn) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_40_4 != 0, 0, 2)) {
                stackIn_43_0 = 0;
                break L11;
              } else {
                stackIn_43_0 = 1;
                break L11;
              }
            }
            var9 = stackIn_43_0;
            var10 = param4.field_Jb.field_fb;
            var11 = null;
            if (param1 == 255) {
              var12 = (of) ((Object) var10.e((byte) 124));
              L12: while (true) {
                if (var12 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L13: {
                    var13 = 0;
                    if (var12.field_fb == null) {
                      L14: {
                        var12.field_ac = new je(0L, ga.field_i);
                        var12.a(var12.field_ac, 106);
                        var12.field_Tb = new je(0L, ws.field_P);
                        if (fh.field_c) {
                          var12.a(var12.field_Tb, param1 ^ 157);
                          break L14;
                        } else {
                          break L14;
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
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L15: {
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
                    var32 = var12.field_Yb;
                    var21 = 72;
                    if (ne.field_f == param4) {
                      var21 += 42;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    var33 = ka.a(var12.field_ac.field_Z, var32, var21);
                    var20 = var33;
                    if (var33.equals(var12.field_Yb)) {
                      stackIn_59_0 = 0;
                      break L16;
                    } else {
                      stackIn_59_0 = 1;
                      break L16;
                    }
                  }
                  L17: {
                    var22 = stackIn_59_0;
                    if ((var12.field_Qb ^ -1) > -5) {
                      if ((var12.field_Qb ^ -1) >= -1) {
                        break L17;
                      } else {
                        var20 = "<img=" + (-1 + var12.field_Qb) + ">" + var33;
                        break L17;
                      }
                    } else {
                      var20 = "<img=" + (var12.field_Qb - (4 - vh.field_n)) + ">" + var33;
                      break L17;
                    }
                  }
                  L18: {
                    var12.field_ac.field_X = var20;
                    if (var12.k(0)) {
                      break L18;
                    } else {
                      L19: {
                        L20: {
                          L21: {
                            var23_int = 16764006;
                            var24_int = 16777215;
                            if (var5_int == 0) {
                              break L21;
                            } else {
                              if (!var12.field_Zb) {
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                          if (var6 > var12.field_Sb) {
                            break L20;
                          } else {
                            if (var7 > var12.field_Xb) {
                              break L20;
                            } else {
                              if ((var8 & (var12.field_Ob ^ -1)) > 0) {
                                break L20;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                        var23_int = 8414771;
                        var24_int = 8421504;
                        break L19;
                      }
                      L22: {
                        var12.field_ac.field_wb = var24_int;
                        var12.field_ac.field_T = var24_int;
                        var12.field_ac.field_W = var24_int;
                        var12.field_dc.field_N = var23_int;
                        var12.field_Tb.field_N = var23_int;
                        var12.field_ac.field_N = var23_int;
                        var12.field_Tb.field_wb = var24_int;
                        var12.field_Tb.field_T = var24_int;
                        var12.field_Tb.field_W = var24_int;
                        var12.field_dc.field_wb = var24_int;
                        var12.field_dc.field_T = var24_int;
                        var12.field_dc.field_W = var24_int;
                        if (bu.field_a != param4) {
                          if (var12.field_Wb) {
                            var12.field_ac.field_X = fo.a(param1 ^ 4671, sm.field_g, new String[]{var20});
                            var12.field_ec.field_X = ac.field_s;
                            break L22;
                          } else {
                            if (var12.field_Ub) {
                              var12.field_ac.field_X = fo.a(param1 + 4545, tr.field_G, new String[]{var20});
                              var12.field_dc.field_X = gm.field_g;
                              var12.field_ec.field_X = uf.field_l;
                              break L22;
                            } else {
                              var12.field_dc.field_X = bq.field_b;
                              break L22;
                            }
                          }
                        } else {
                          if (!vu.field_M.field_kc) {
                            var12.field_ec.field_X = bq.field_a;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                      }
                      L23: {
                        var25_int = 0;
                        if (null == vu.field_M) {
                          break L23;
                        } else {
                          if (!vu.b(false)) {
                            break L23;
                          } else {
                            if (oh.field_H != var12.field_Pb) {
                              L24: {
                                if (null == var12.field_dc.field_X) {
                                  break L24;
                                } else {
                                  var26 = var12.field_dc.j(104) - -(mi.field_l * 2);
                                  var12.field_dc.a(jn.field_d, -20500, var26, var19, var25_int);
                                  var25_int = var25_int + var26;
                                  break L24;
                                }
                              }
                              if (var12.field_ec.field_X != null) {
                                L25: {
                                  if (bu.field_a != param4) {
                                    var26 = var12.field_ec.j(param1 + -328) - -(mi.field_l * 2);
                                    break L25;
                                  } else {
                                    var26 = 40;
                                    break L25;
                                  }
                                }
                                var12.field_ec.a(jn.field_d, param1 + -20755, var26, var19, var25_int);
                                var25_int = var25_int + var26;
                                break L23;
                              } else {
                                break L23;
                              }
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      L26: {
                        stackIn_95_0 = var12.field_ac;

                        stackIn_95_1 = jn.field_d;

                        stackIn_95_2 = -20500;

                        stackIn_95_3 = -var25_int + var12.field_gb;

                        if (fh.field_c) {
                          stackIn_96_0 = (je) ((Object) stackIn_95_0);
                          stackIn_96_1 = stackIn_95_1;
                          stackIn_96_2 = stackIn_95_2;
                          stackIn_96_3 = stackIn_95_3;
                          stackIn_96_4 = 42;
                          break L26;
                        } else {
                          stackIn_96_0 = (je) ((Object) stackIn_95_0);
                          stackIn_96_1 = stackIn_95_1;
                          stackIn_96_2 = stackIn_95_2;
                          stackIn_96_3 = stackIn_95_3;
                          stackIn_96_4 = 0;
                          break L26;
                        }
                      }
                      L27: {
                        L28: {
                          ((je) (Object) stackIn_96_0).a(stackIn_96_1, stackIn_96_2, stackIn_96_3 + -stackIn_96_4, var19, var25_int);
                          var12.field_Tb.field_X = Integer.toString(var12.field_Sb);
                          var12.field_Tb.a(jn.field_d, -20500, 40, var19, var12.field_gb - 40);
                          if (!var12.field_ac.field_eb) {
                            break L28;
                          } else {
                            if (var22 != 0) {
                              ad.field_I = var12.field_Yb;
                              if (jc.field_v == null) {
                                break L27;
                              } else {
                                if (jc.field_v[var12.field_Qb] != null) {
                                  ad.field_I = ad.field_I + " - " + jc.field_v[var12.field_Qb];
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
                        if (!var12.field_ac.field_eb) {
                          break L27;
                        } else {
                          if (jc.field_v == null) {
                            break L27;
                          } else {
                            if (null == jc.field_v[var12.field_Qb]) {
                              break L27;
                            } else {
                              ad.field_I = jc.field_v[var12.field_Qb];
                              break L27;
                            }
                          }
                        }
                      }
                      var19 = var19 + jn.field_d;
                      break L18;
                    }
                  }
                  L29: {
                    var23 = s.a(false, var20, var12.field_Kb);
                    var24 = var23;
                    var30 = var24;
                    var25 = var30;
                    var24 = var23;
                    if (var23 != null) {
                      var24_int = var12.field_fc.field_Z.c(var23, -mi.field_l + (var12.field_gb - mi.field_l));
                      var12.field_fc.field_C = var12.field_Rb * 256 / qd.field_K;
                      var12.field_fc.field_X = var23;
                      var12.field_fc.a(var24_int * jn.field_d, -20500, var12.field_gb + -(2 * mi.field_l), var19, mi.field_l);
                      var19 = var19 + jn.field_d * var24_int;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (var9 != 0) {
                      break L30;
                    } else {
                      var12.field_nb = var19 + -var12.field_ob;
                      break L30;
                    }
                  }
                  L31: {
                    if (var13 != 0) {
                      param4.field_Jb.a(var12, true, 2, (je) (var11));
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  L32: {
                    if (var12.field_yb == 0) {
                      break L32;
                    } else {
                      if (var12.k(0)) {
                        break L32;
                      } else {
                        if (var12.field_dc.field_yb != 0) {
                          ra.a(var12.field_Pb, param3, 6);
                          break L32;
                        } else {
                          if (0 == var12.field_ec.field_yb) {
                            bk.a(false, 0, iu.field_t, 0, var12, param4, ur.field_z);
                            break L32;
                          } else {
                            te.a(param3, var12.field_Pb, (byte) 97);
                            break L32;
                          }
                        }
                      }
                    }
                  }
                  L33: {
                    var11 = var12;
                    if (!var12.field_jb) {
                      break L33;
                    } else {
                      if (!var12.k(0)) {
                        L34: {
                          var24 = null;
                          if (oh.field_H != var12.field_Pb) {
                            L35: {
                              if (var5_int == 0) {
                                break L35;
                              } else {
                                if (!var12.field_Zb) {
                                  var24 = fo.a(param1 + 4545, em.field_b, new String[]{var20});
                                  var30 = var24;
                                  var25 = var30;
                                  var24 = var25;
                                  var30 = var24;
                                  var25 = var30;
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            if (var7 <= var12.field_Xb) {
                              if (var6 <= var12.field_Sb) {
                                if (((var12.field_Ob ^ -1) & var8) == 0) {
                                  break L34;
                                } else {
                                  var25_int = fd.a(true, (var12.field_Ob ^ -1) & var8);
                                  var24 = fo.a(4800, h.field_f, new String[]{var20});
                                  if (0 >= var25_int) {
                                    break L34;
                                  } else {
                                    if (jl.field_c == null) {
                                      break L34;
                                    } else {
                                      if (jl.field_c.length < var25_int) {
                                        break L34;
                                      } else {
                                        if (jl.field_c[var25_int - 1] == null) {
                                          break L34;
                                        } else {
                                          var24 = fo.a(4800, jl.field_c[-1 + var25_int][2], new String[]{var20});
                                          break L34;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var24 = fo.a(4800, bk.field_g, new String[]{var20, Integer.toString(var6)});
                                break L34;
                              }
                            } else {
                              L36: {
                                var25_int = -var12.field_Xb + var7;
                                if ((var25_int ^ -1) == -2) {
                                  var24 = fo.a(4800, co.field_r, new String[]{var20});
                                  break L36;
                                } else {
                                  break L36;
                                }
                              }
                              var24 = fo.a(4800, oc.field_Ib, new String[]{var20, Integer.toString(var25_int)});
                              break L34;
                            }
                          } else {
                            L37: {
                              if (var5_int == 0) {
                                break L37;
                              } else {
                                if (!var12.field_Zb) {
                                  var24 = is.field_a;
                                  break L34;
                                } else {
                                  break L37;
                                }
                              }
                            }
                            if (var7 > var12.field_Xb) {
                              L38: {
                                var25_int = -var12.field_Xb + var7;
                                if (-2 == (var25_int ^ -1)) {
                                  var24 = tn.field_Y;
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                              var24 = fo.a(4800, al.field_j, new String[]{null, Integer.toString(var25_int)});
                              break L34;
                            } else {
                              if (var6 <= var12.field_Sb) {
                                if (0 != (var8 & (var12.field_Ob ^ -1))) {
                                  var25_int = fd.a(true, (var12.field_Ob ^ -1) & var8);
                                  var24 = vb.field_l;
                                  if ((var25_int ^ -1) >= -1) {
                                    break L34;
                                  } else {
                                    if (null == jl.field_c) {
                                      break L34;
                                    } else {
                                      if (jl.field_c.length < var25_int) {
                                        break L34;
                                      } else {
                                        if (jl.field_c[var25_int - 1] != null) {
                                          var24 = jl.field_c[-1 + var25_int][1];
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
                                var24 = fo.a(4800, vi.field_b, new String[]{null, Integer.toString(var6)});
                                break L34;
                              }
                            }
                          }
                        }
                        if (var24 != null) {
                          var34 = "<col=A00000>" + (String) (var24);
                          var30_ref = var34;
                          var25 = var30_ref;
                          var24 = var25;
                          var30_ref = var34;
                          var25 = var30_ref;
                          var25 = null;
                          var26 = 0;
                          var27_int = 0;
                          L39: while (true) {
                            if (var27_int >= tq.field_b) {
                              L40: {
                                L41: {
                                  if (param4 != bu.field_a) {
                                    break L41;
                                  } else {
                                    if (!vu.b(false)) {
                                      break L41;
                                    } else {
                                      if (var26 != 0) {
                                        var24 = var34 + "<br>" + wg.field_d + (String) (var25);
                                        break L40;
                                      } else {
                                        var24 = var34 + "<br>" + fo.a(4800, tp.field_c, new String[]{(String) (var25)});
                                        break L40;
                                      }
                                    }
                                  }
                                }
                                if (var26 == 0) {
                                  var24 = var34 + "<br>" + fo.a(4800, ue.field_e, new String[]{(String) (var25)});
                                  break L40;
                                } else {
                                  var24 = var34 + "<br>" + nm.field_u + (String) (var25);
                                  break L40;
                                }
                              }
                              L42: {
                                if (param4 != bu.field_a) {
                                  break L42;
                                } else {
                                  if (vu.b(false)) {
                                    break L42;
                                  } else {
                                    var27 = vu.field_M.field_rc;
                                    var24 = (String) (var24) + "<br>" + fo.a(param1 ^ 4671, cj.field_l, new String[]{var27});
                                    break L42;
                                  }
                                }
                              }
                              ad.field_I = (String) (var24);
                              break L33;
                            } else {
                              L43: {
                                var28 = vu.field_M.field_pc[var27_int] & 255;
                                var29 = 0;
                                if (ep.field_p == null) {
                                  break L43;
                                } else {
                                  if (ep.field_p[var27_int] != null) {
                                    if (!ep.field_p[var27_int][var28]) {
                                      break L43;
                                    } else {
                                      if (var12.field_Zb) {
                                        break L43;
                                      } else {
                                        var29 = 1;
                                        break L43;
                                      }
                                    }
                                  } else {
                                    break L43;
                                  }
                                }
                              }
                              L44: {
                                if (null == iv.field_e) {
                                  break L44;
                                } else {
                                  if (null != iv.field_e[var27_int]) {
                                    L45: {
                                      var30_int = iv.field_e[var27_int][var28];
                                      if (var30_int == 0) {
                                        break L45;
                                      } else {
                                        if (bj.field_k) {
                                          break L45;
                                        } else {
                                          if (!var12.field_Zb) {
                                            var29 = 1;
                                            break L45;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                    }
                                    if (var12.field_Sb < var30_int) {
                                      var29 = 1;
                                      break L44;
                                    } else {
                                      break L44;
                                    }
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              L46: {
                                if (jv.field_d == null) {
                                  break L46;
                                } else {
                                  if (null == jv.field_d[var27_int]) {
                                    break L46;
                                  } else {
                                    L47: {
                                      var30_int = jv.field_d[var27_int][var28];
                                      if (var30_int == 0) {
                                        break L47;
                                      } else {
                                        if (bj.field_k) {
                                          break L47;
                                        } else {
                                          if (!var12.field_Zb) {
                                            var29 = 1;
                                            break L47;
                                          } else {
                                            break L47;
                                          }
                                        }
                                      }
                                    }
                                    if (var12.field_Xb < var30_int) {
                                      var29 = 1;
                                      break L46;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                              }
                              L48: {
                                if (sk.field_j == null) {
                                  break L48;
                                } else {
                                  if (null == sk.field_j[var27_int]) {
                                    break L48;
                                  } else {
                                    if (((var12.field_Ob ^ -1) & sk.field_j[var27_int][var28]) == 0) {
                                      break L48;
                                    } else {
                                      var29 = 1;
                                      break L48;
                                    }
                                  }
                                }
                              }
                              L49: {
                                if (var29 != 0) {
                                  var30_ref = "<col=A00000>" + ob.field_M[var27_int] + "</col>";
                                  var25 = var30_ref;
                                  var24 = var25;
                                  var25 = var30_ref;
                                  if (var25 != null) {
                                    var25 = (String) (var25) + ", " + var30_ref;
                                    var24 = var25;
                                    var24 = var25;
                                    var26 = 1;
                                    break L49;
                                  } else {
                                    var25 = var30_ref;
                                    break L49;
                                  }
                                } else {
                                  break L49;
                                }
                              }
                              var27_int++;
                              continue L39;
                            }
                          }
                        } else {
                          break L33;
                        }
                      } else {
                        var12 = (of) ((Object) var10.a((byte) 123));
                        continue L12;
                      }
                    }
                  }
                  var12 = (of) ((Object) var10.a((byte) 123));
                  continue L12;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L50: {
            var5 = decompiledCaughtException;
            stackIn_220_0 = (RuntimeException) (var5);

            stackIn_220_1 = new StringBuilder().append("wi.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_221_0 = (RuntimeException) ((Object) stackIn_220_0);
              stackIn_221_1 = (StringBuilder) ((Object) stackIn_220_1);
              stackIn_221_2 = "null";
              break L50;
            } else {
              stackIn_221_0 = (RuntimeException) ((Object) stackIn_220_0);
              stackIn_221_1 = (StringBuilder) ((Object) stackIn_220_1);
              stackIn_221_2 = "{...}";
              break L50;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_221_0), stackIn_221_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
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
        field_a = "Gielinor! A new world, rich in powerful magic. The gods seek to dominate this new realm, but only you can determine its fate.";
        field_h = "Equip";
    }
}
