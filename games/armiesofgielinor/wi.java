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
        dn stackIn_33_0 = null;
        boolean stackIn_33_1 = false;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        dn stackIn_34_0 = null;
        boolean stackIn_34_1 = false;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        dn stackIn_35_0 = null;
        boolean stackIn_35_1 = false;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        int stackIn_38_0 = 0;
        int stackIn_53_0 = 0;
        je stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_88_3 = 0;
        je stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_89_2 = 0;
        int stackIn_89_3 = 0;
        je stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        int stackIn_90_4 = 0;
        dn stackOut_32_0 = null;
        boolean stackOut_32_1 = false;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        dn stackOut_34_0 = null;
        boolean stackOut_34_1 = false;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        dn stackOut_33_0 = null;
        boolean stackOut_33_1 = false;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        je stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        int stackOut_87_3 = 0;
        je stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        int stackOut_89_3 = 0;
        int stackOut_89_4 = 0;
        je stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        int stackOut_88_3 = 0;
        int stackOut_88_4 = 0;
        L0: {
          var31 = ArmiesOfGielinor.field_M ? 1 : 0;
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (vu.field_M == null) {
            break L0;
          } else {
            L1: {
              if (null != ep.field_p) {
                break L1;
              } else {
                if (iv.field_e != null) {
                  break L1;
                } else {
                  if (jv.field_d != null) {
                    break L1;
                  } else {
                    if (sk.field_j != null) {
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
              if (var9 >= tq.field_b) {
                break L0;
              } else {
                L3: {
                  var10_int = vu.field_M.field_pc[var9] & 255;
                  if (null == ep.field_p) {
                    break L3;
                  } else {
                    if (null == ep.field_p[var9]) {
                      break L3;
                    } else {
                      if (ep.field_p[var9][var10_int]) {
                        var5_int = 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (null == iv.field_e) {
                    break L4;
                  } else {
                    if (null == iv.field_e[var9]) {
                      break L4;
                    } else {
                      L5: {
                        var11_int = iv.field_e[var9][var10_int];
                        if (var11_int > var6) {
                          var6 = var11_int;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (var11_int == 0) {
                        break L4;
                      } else {
                        if (bj.field_k) {
                          break L4;
                        } else {
                          var5_int = 1;
                          break L4;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (jv.field_d == null) {
                    break L6;
                  } else {
                    if (jv.field_d[var9] != null) {
                      L7: {
                        var11_int = jv.field_d[var9][var10_int];
                        if (var11_int == 0) {
                          break L7;
                        } else {
                          if (!bj.field_k) {
                            var5_int = 1;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var11_int <= var7) {
                        break L6;
                      } else {
                        var7 = var11_int;
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                L8: {
                  if (null == sk.field_j) {
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
        }
        L9: {
          stackOut_32_0 = (dn) param4;
          stackOut_32_1 = param2;
          stackOut_32_2 = param0 * (8 + jn.field_d * 4);
          stackOut_32_3 = jn.field_d * 2 + 4;
          stackIn_34_0 = stackOut_32_0;
          stackIn_34_1 = stackOut_32_1;
          stackIn_34_2 = stackOut_32_2;
          stackIn_34_3 = stackOut_32_3;
          stackIn_33_0 = stackOut_32_0;
          stackIn_33_1 = stackOut_32_1;
          stackIn_33_2 = stackOut_32_2;
          stackIn_33_3 = stackOut_32_3;
          if (param4 != pq.field_b) {
            stackOut_34_0 = (dn) (Object) stackIn_34_0;
            stackOut_34_1 = stackIn_34_1;
            stackOut_34_2 = stackIn_34_2;
            stackOut_34_3 = stackIn_34_3;
            stackOut_34_4 = 0;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            stackIn_35_2 = stackOut_34_2;
            stackIn_35_3 = stackOut_34_3;
            stackIn_35_4 = stackOut_34_4;
            break L9;
          } else {
            stackOut_33_0 = (dn) (Object) stackIn_33_0;
            stackOut_33_1 = stackIn_33_1;
            stackOut_33_2 = stackIn_33_2;
            stackOut_33_3 = stackIn_33_3;
            stackOut_33_4 = 1;
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_35_2 = stackOut_33_2;
            stackIn_35_3 = stackOut_33_3;
            stackIn_35_4 = stackOut_33_4;
            break L9;
          }
        }
        L10: {
          if (((dn) (Object) stackIn_35_0).a(stackIn_35_1, stackIn_35_2, stackIn_35_3, stackIn_35_4 == 0, 0, 2)) {
            stackOut_37_0 = 0;
            stackIn_38_0 = stackOut_37_0;
            break L10;
          } else {
            stackOut_36_0 = 1;
            stackIn_38_0 = stackOut_36_0;
            break L10;
          }
        }
        var9 = stackIn_38_0;
        var10 = param4.field_Jb.field_fb;
        var11 = null;
        var12 = (of) (Object) var10.e((byte) 124);
        L11: while (true) {
          if (var12 == null) {
            return;
          } else {
            L12: {
              var13 = 0;
              if (var12.field_fb == null) {
                L13: {
                  var12.field_ac = new je(0L, ga.field_i);
                  var12.a(var12.field_ac, 106);
                  var12.field_Tb = new je(0L, ws.field_P);
                  if (fh.field_c) {
                    var12.a(var12.field_Tb, 98);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var12.field_Tb.field_Eb = 2;
                var12.field_fc = new je(0L, eq.field_h);
                var12.a(var12.field_fc, 62);
                var12.i(-10027);
                var12.field_dc = new je(0L, rf.field_d);
                var12.a(var12.field_dc, 61);
                var12.field_ec = new je(0L, pt.field_X);
                var12.a(var12.field_ec, 90);
                var13 = 1;
                break L12;
              } else {
                break L12;
              }
            }
            L14: {
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
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var20 = ka.a(var12.field_ac.field_Z, var20, var21);
              if (var20.equals((Object) (Object) var12.field_Yb)) {
                stackOut_52_0 = 0;
                stackIn_53_0 = stackOut_52_0;
                break L15;
              } else {
                stackOut_51_0 = 1;
                stackIn_53_0 = stackOut_51_0;
                break L15;
              }
            }
            L16: {
              var22 = stackIn_53_0;
              if (var12.field_Qb < 4) {
                if (var12.field_Qb <= 0) {
                  break L16;
                } else {
                  var20 = "<img=" + (-1 + var12.field_Qb) + ">" + var20;
                  break L16;
                }
              } else {
                var20 = "<img=" + (var12.field_Qb - (4 - vh.field_n)) + ">" + var20;
                break L16;
              }
            }
            L17: {
              var12.field_ac.field_X = var20;
              if (var12.k(0)) {
                break L17;
              } else {
                L18: {
                  L19: {
                    L20: {
                      var23_int = 16764006;
                      var24_int = 16777215;
                      if (var5_int == 0) {
                        break L20;
                      } else {
                        if (!var12.field_Zb) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    if (var6 > var12.field_Sb) {
                      break L19;
                    } else {
                      if (var7 > var12.field_Xb) {
                        break L19;
                      } else {
                        if ((var8 & ~var12.field_Ob) > 0) {
                          break L19;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  var23_int = 8414771;
                  var24_int = 8421504;
                  break L18;
                }
                L21: {
                  var12.field_ac.field_wb = var24_int;
                  var12.field_ac.field_T = var24_int;
                  var12.field_ac.field_W = var24_int;
                  var12.field_dc.field_N = var23_int;
                  var12.field_Tb.field_N = var23_int;
                  var12.field_ac.field_N = var23_int;
                  var12.field_Tb.field_wb = var24_int;
                  je fieldTemp$5 = var12.field_Tb;
                  var12.field_Tb.field_T = var24_int;
                  fieldTemp$5.field_W = var24_int;
                  var12.field_dc.field_wb = var24_int;
                  var12.field_dc.field_T = var24_int;
                  var12.field_dc.field_W = var24_int;
                  if (bu.field_a != param4) {
                    if (var12.field_Wb) {
                      var12.field_ac.field_X = fo.a(4800, sm.field_g, new String[1]);
                      var12.field_ec.field_X = ac.field_s;
                      break L21;
                    } else {
                      if (var12.field_Ub) {
                        var12.field_ac.field_X = fo.a(4800, tr.field_G, new String[1]);
                        var12.field_dc.field_X = gm.field_g;
                        var12.field_ec.field_X = uf.field_l;
                        break L21;
                      } else {
                        var12.field_dc.field_X = bq.field_b;
                        break L21;
                      }
                    }
                  } else {
                    if (!vu.field_M.field_kc) {
                      var12.field_ec.field_X = bq.field_a;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  var25_int = 0;
                  if (null == vu.field_M) {
                    break L22;
                  } else {
                    int discarded$6 = 0;
                    if (!vu.b()) {
                      break L22;
                    } else {
                      if (oh.field_H != var12.field_Pb) {
                        L23: {
                          if (null == var12.field_dc.field_X) {
                            break L23;
                          } else {
                            var26 = var12.field_dc.j(104) - -(mi.field_l * 2);
                            var12.field_dc.a(jn.field_d, -20500, var26, var19, var25_int);
                            var25_int = var25_int + var26;
                            break L23;
                          }
                        }
                        if (var12.field_ec.field_X != null) {
                          L24: {
                            if (bu.field_a != param4) {
                              var26 = var12.field_ec.j(-73) - -(mi.field_l * 2);
                              break L24;
                            } else {
                              var26 = 40;
                              break L24;
                            }
                          }
                          var12.field_ec.a(jn.field_d, -20500, var26, var19, var25_int);
                          var25_int = var25_int + var26;
                          break L22;
                        } else {
                          break L22;
                        }
                      } else {
                        break L22;
                      }
                    }
                  }
                }
                L25: {
                  stackOut_87_0 = var12.field_ac;
                  stackOut_87_1 = jn.field_d;
                  stackOut_87_2 = -20500;
                  stackOut_87_3 = -var25_int + var12.field_gb;
                  stackIn_89_0 = stackOut_87_0;
                  stackIn_89_1 = stackOut_87_1;
                  stackIn_89_2 = stackOut_87_2;
                  stackIn_89_3 = stackOut_87_3;
                  stackIn_88_0 = stackOut_87_0;
                  stackIn_88_1 = stackOut_87_1;
                  stackIn_88_2 = stackOut_87_2;
                  stackIn_88_3 = stackOut_87_3;
                  if (fh.field_c) {
                    stackOut_89_0 = (je) (Object) stackIn_89_0;
                    stackOut_89_1 = stackIn_89_1;
                    stackOut_89_2 = stackIn_89_2;
                    stackOut_89_3 = stackIn_89_3;
                    stackOut_89_4 = 42;
                    stackIn_90_0 = stackOut_89_0;
                    stackIn_90_1 = stackOut_89_1;
                    stackIn_90_2 = stackOut_89_2;
                    stackIn_90_3 = stackOut_89_3;
                    stackIn_90_4 = stackOut_89_4;
                    break L25;
                  } else {
                    stackOut_88_0 = (je) (Object) stackIn_88_0;
                    stackOut_88_1 = stackIn_88_1;
                    stackOut_88_2 = stackIn_88_2;
                    stackOut_88_3 = stackIn_88_3;
                    stackOut_88_4 = 0;
                    stackIn_90_0 = stackOut_88_0;
                    stackIn_90_1 = stackOut_88_1;
                    stackIn_90_2 = stackOut_88_2;
                    stackIn_90_3 = stackOut_88_3;
                    stackIn_90_4 = stackOut_88_4;
                    break L25;
                  }
                }
                L26: {
                  L27: {
                    ((je) (Object) stackIn_90_0).a(stackIn_90_1, stackIn_90_2, stackIn_90_3 + -stackIn_90_4, var19, var25_int);
                    var12.field_Tb.field_X = Integer.toString(var12.field_Sb);
                    var12.field_Tb.a(jn.field_d, -20500, 40, var19, var12.field_gb - 40);
                    if (!var12.field_ac.field_eb) {
                      break L27;
                    } else {
                      if (var22 != 0) {
                        ad.field_I = var12.field_Yb;
                        if (jc.field_v == null) {
                          break L26;
                        } else {
                          if (jc.field_v[var12.field_Qb] != null) {
                            ad.field_I = ad.field_I + " - " + jc.field_v[var12.field_Qb];
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
                  if (!var12.field_ac.field_eb) {
                    break L26;
                  } else {
                    if (jc.field_v == null) {
                      break L26;
                    } else {
                      if (null == jc.field_v[var12.field_Qb]) {
                        break L26;
                      } else {
                        ad.field_I = jc.field_v[var12.field_Qb];
                        break L26;
                      }
                    }
                  }
                }
                var19 = var19 + jn.field_d;
                break L17;
              }
            }
            L28: {
              var23 = s.a(false, var20, var12.field_Kb);
              var24 = var23;
              var24 = var23;
              if (var23 != null) {
                var24_int = var12.field_fc.field_Z.c(var23, -mi.field_l + (var12.field_gb - mi.field_l));
                var12.field_fc.field_C = var12.field_Rb * 256 / qd.field_K;
                var12.field_fc.field_X = var23;
                var12.field_fc.a(var24_int * jn.field_d, -20500, var12.field_gb + -(2 * mi.field_l), var19, mi.field_l);
                var19 = var19 + jn.field_d * var24_int;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (var9 != 0) {
                break L29;
              } else {
                var12.field_nb = var19 + -var12.field_ob;
                break L29;
              }
            }
            L30: {
              if (var13 != 0) {
                param4.field_Jb.a((je) (Object) var12, true, 2, (je) var11);
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (var12.field_yb == 0) {
                break L31;
              } else {
                if (var12.k(0)) {
                  break L31;
                } else {
                  if (var12.field_dc.field_yb != 0) {
                    int discarded$7 = 6;
                    ra.a(var12.field_Pb, 11);
                    break L31;
                  } else {
                    if (0 == var12.field_ec.field_yb) {
                      bk.a(false, 0, iu.field_t, 0, var12, param4, ur.field_z);
                      break L31;
                    } else {
                      te.a(11, var12.field_Pb, (byte) 97);
                      break L31;
                    }
                  }
                }
              }
            }
            L32: {
              var11 = (Object) (Object) var12;
              if (!var12.field_jb) {
                break L32;
              } else {
                if (!var12.k(0)) {
                  L33: {
                    var24 = null;
                    if (oh.field_H != var12.field_Pb) {
                      L34: {
                        if (var5_int == 0) {
                          break L34;
                        } else {
                          if (!var12.field_Zb) {
                            var24 = fo.a(4800, em.field_b, new String[1]);
                            break L33;
                          } else {
                            break L34;
                          }
                        }
                      }
                      if (var7 <= var12.field_Xb) {
                        if (var6 <= var12.field_Sb) {
                          if ((~var12.field_Ob & var8) == 0) {
                            break L33;
                          } else {
                            var25_int = fd.a(true, ~var12.field_Ob & var8);
                            var24 = fo.a(4800, h.field_f, new String[1]);
                            if (0 >= var25_int) {
                              break L33;
                            } else {
                              if (jl.field_c == null) {
                                break L33;
                              } else {
                                if (jl.field_c.length < var25_int) {
                                  break L33;
                                } else {
                                  if (jl.field_c[var25_int - 1] == null) {
                                    break L33;
                                  } else {
                                    var24 = fo.a(4800, jl.field_c[-1 + var25_int][2], new String[1]);
                                    break L33;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var24 = fo.a(4800, bk.field_g, new String[2]);
                          break L33;
                        }
                      } else {
                        L35: {
                          var25_int = -var12.field_Xb + var7;
                          if (var25_int == 1) {
                            var24 = fo.a(4800, co.field_r, new String[1]);
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                        var24 = fo.a(4800, oc.field_Ib, new String[2]);
                        break L33;
                      }
                    } else {
                      L36: {
                        if (var5_int == 0) {
                          break L36;
                        } else {
                          if (!var12.field_Zb) {
                            var24 = is.field_a;
                            break L33;
                          } else {
                            break L36;
                          }
                        }
                      }
                      if (var7 > var12.field_Xb) {
                        L37: {
                          var25_int = -var12.field_Xb + var7;
                          if (var25_int == 1) {
                            var24 = tn.field_Y;
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                        var24 = fo.a(4800, al.field_j, new String[2]);
                        break L33;
                      } else {
                        if (var6 <= var12.field_Sb) {
                          if (0 != (var8 & ~var12.field_Ob)) {
                            var25_int = fd.a(true, ~var12.field_Ob & var8);
                            var24 = vb.field_l;
                            if (var25_int <= 0) {
                              break L33;
                            } else {
                              if (null == jl.field_c) {
                                break L33;
                              } else {
                                if (jl.field_c.length < var25_int) {
                                  break L33;
                                } else {
                                  if (jl.field_c[var25_int - 1] != null) {
                                    var24 = jl.field_c[-1 + var25_int][1];
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
                          var24 = fo.a(4800, vi.field_b, new String[2]);
                          break L33;
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
                    L38: while (true) {
                      if (var27_int >= tq.field_b) {
                        L39: {
                          L40: {
                            if (param4 != bu.field_a) {
                              break L40;
                            } else {
                              int discarded$8 = 0;
                              if (!vu.b()) {
                                break L40;
                              } else {
                                if (var26 != 0) {
                                  var24 = var24 + "<br>" + wg.field_d + var25;
                                  break L39;
                                } else {
                                  var24 = var24 + "<br>" + fo.a(4800, tp.field_c, new String[1]);
                                  break L39;
                                }
                              }
                            }
                          }
                          if (var26 == 0) {
                            var24 = var24 + "<br>" + fo.a(4800, ue.field_e, new String[1]);
                            break L39;
                          } else {
                            var24 = var24 + "<br>" + nm.field_u + var25;
                            break L39;
                          }
                        }
                        L41: {
                          if (param4 != bu.field_a) {
                            break L41;
                          } else {
                            int discarded$9 = 0;
                            if (vu.b()) {
                              break L41;
                            } else {
                              var27 = vu.field_M.field_rc;
                              var24 = var24 + "<br>" + fo.a(4800, cj.field_l, new String[1]);
                              break L41;
                            }
                          }
                        }
                        ad.field_I = var24;
                        break L32;
                      } else {
                        L42: {
                          var28 = vu.field_M.field_pc[var27_int] & 255;
                          var29 = 0;
                          if (ep.field_p == null) {
                            break L42;
                          } else {
                            if (ep.field_p[var27_int] != null) {
                              if (!ep.field_p[var27_int][var28]) {
                                break L42;
                              } else {
                                if (var12.field_Zb) {
                                  break L42;
                                } else {
                                  var29 = 1;
                                  break L42;
                                }
                              }
                            } else {
                              break L42;
                            }
                          }
                        }
                        L43: {
                          if (null == iv.field_e) {
                            break L43;
                          } else {
                            if (null != iv.field_e[var27_int]) {
                              L44: {
                                var30_int = iv.field_e[var27_int][var28];
                                if (var30_int == 0) {
                                  break L44;
                                } else {
                                  if (bj.field_k) {
                                    break L44;
                                  } else {
                                    if (!var12.field_Zb) {
                                      var29 = 1;
                                      break L44;
                                    } else {
                                      break L44;
                                    }
                                  }
                                }
                              }
                              if (var12.field_Sb < var30_int) {
                                var29 = 1;
                                break L43;
                              } else {
                                break L43;
                              }
                            } else {
                              break L43;
                            }
                          }
                        }
                        L45: {
                          if (jv.field_d == null) {
                            break L45;
                          } else {
                            if (null == jv.field_d[var27_int]) {
                              break L45;
                            } else {
                              L46: {
                                var30_int = jv.field_d[var27_int][var28];
                                if (var30_int == 0) {
                                  break L46;
                                } else {
                                  if (bj.field_k) {
                                    break L46;
                                  } else {
                                    if (!var12.field_Zb) {
                                      var29 = 1;
                                      break L46;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                              }
                              if (var12.field_Xb < var30_int) {
                                var29 = 1;
                                break L45;
                              } else {
                                break L45;
                              }
                            }
                          }
                        }
                        L47: {
                          if (sk.field_j == null) {
                            break L47;
                          } else {
                            if (null == sk.field_j[var27_int]) {
                              break L47;
                            } else {
                              if ((~var12.field_Ob & sk.field_j[var27_int][var28]) == 0) {
                                break L47;
                              } else {
                                var29 = 1;
                                break L47;
                              }
                            }
                          }
                        }
                        L48: {
                          if (var29 != 0) {
                            var30 = "<col=A00000>" + ob.field_M[var27_int] + "</col>";
                            var25 = var30;
                            var24 = var25;
                            var25 = var30;
                            if (var25 != null) {
                              var25 = var25 + ", " + var30;
                              var24 = var25;
                              var24 = var25;
                              var26 = 1;
                              break L48;
                            } else {
                              var25 = var30;
                              break L48;
                            }
                          } else {
                            break L48;
                          }
                        }
                        var27_int++;
                        continue L38;
                      }
                    }
                  } else {
                    break L32;
                  }
                } else {
                  var12 = (of) (Object) var10.a((byte) 123);
                  continue L11;
                }
              }
            }
            var12 = (of) (Object) var10.a((byte) 123);
            continue L11;
          }
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
