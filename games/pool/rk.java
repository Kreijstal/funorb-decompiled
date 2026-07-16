/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static String field_e;
    private byte[] field_a;
    static int field_d;
    static String field_h;
    static String field_i;
    static String field_f;
    private int[] field_c;
    private int[] field_b;
    static String field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, dd[] param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        if (param6 == null) {
          return;
        } else {
          if (0 >= param4) {
            return;
          } else {
            L0: {
              if ((param5 ^ -1) >= -1) {
                break L0;
              } else {
                if (0 == param2) {
                  break L0;
                } else {
                  L1: {
                    if (null != param6[3]) {
                      stackOut_10_0 = param6[3].field_w;
                      stackIn_11_0 = stackOut_10_0;
                      break L1;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_11_0 = stackOut_9_0;
                      break L1;
                    }
                  }
                  L2: {
                    var7 = stackIn_11_0;
                    if (param6[5] == null) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L2;
                    } else {
                      stackOut_12_0 = param6[5].field_w;
                      stackIn_14_0 = stackOut_12_0;
                      break L2;
                    }
                  }
                  L3: {
                    var8 = stackIn_14_0;
                    if (null != param6[1]) {
                      stackOut_16_0 = param6[1].field_y;
                      stackIn_17_0 = stackOut_16_0;
                      break L3;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_17_0 = stackOut_15_0;
                      break L3;
                    }
                  }
                  L4: {
                    var9 = stackIn_17_0;
                    if (param6[7] != null) {
                      stackOut_19_0 = param6[7].field_y;
                      stackIn_20_0 = stackOut_19_0;
                      break L4;
                    } else {
                      stackOut_18_0 = 0;
                      stackIn_20_0 = stackOut_18_0;
                      break L4;
                    }
                  }
                  var10 = stackIn_20_0;
                  var11 = param3 + param4;
                  var12 = param5 + param1;
                  var13 = param3 - -var7;
                  var14 = -var8 + var11;
                  var15 = param1 + var9;
                  var16 = var12 + -var10;
                  var17 = var13;
                  var18 = var14;
                  if (param0 >= 71) {
                    L5: {
                      if (var18 < var17) {
                        var18 = param3 - -(param4 * var7 / (var8 + var7));
                        var17 = param3 - -(param4 * var7 / (var8 + var7));
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      var19 = var15;
                      var20 = var16;
                      qh.a(mb.field_b);
                      if (var19 > var20) {
                        var20 = var9 * param5 / (var9 + var10) + param1;
                        var19 = var9 * param5 / (var9 + var10) + param1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (null != param6[0]) {
                        qh.d(param3, param1, var17, var19);
                        param6[0].a(param3, param1, param2);
                        qh.b(mb.field_b);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (null != param6[2]) {
                        qh.d(var18, param1, var11, var19);
                        param6[2].a(var14, param1, param2);
                        qh.b(mb.field_b);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param6[6] != null) {
                        qh.d(param3, var20, var17, var12);
                        param6[6].a(param3, var16, param2);
                        qh.b(mb.field_b);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param6[8] != null) {
                        qh.d(var18, var20, var11, var12);
                        param6[8].a(var14, var16, param2);
                        qh.b(mb.field_b);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param6[1] == null) {
                        break L11;
                      } else {
                        if (param6[1].field_w != 0) {
                          qh.d(var17, param1, var18, var19);
                          var21 = var13;
                          L12: while (true) {
                            if (var21 >= var14) {
                              qh.b(mb.field_b);
                              break L11;
                            } else {
                              param6[1].a(var21, param1, param2);
                              var21 = var21 + param6[1].field_w;
                              continue L12;
                            }
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    L13: {
                      if (param6[7] == null) {
                        break L13;
                      } else {
                        if (0 != param6[7].field_w) {
                          qh.d(var17, var20, var18, var12);
                          var21 = var13;
                          L14: while (true) {
                            if (var14 <= var21) {
                              qh.b(mb.field_b);
                              break L13;
                            } else {
                              param6[7].a(var21, var16, param2);
                              var21 = var21 + param6[7].field_w;
                              continue L14;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (param6[3] == null) {
                        break L15;
                      } else {
                        if (0 == param6[3].field_y) {
                          break L15;
                        } else {
                          qh.d(param3, var19, var17, var20);
                          var21 = var15;
                          L16: while (true) {
                            if (var21 >= var16) {
                              qh.b(mb.field_b);
                              break L15;
                            } else {
                              param6[3].a(param3, var21, param2);
                              var21 = var21 + param6[3].field_y;
                              continue L16;
                            }
                          }
                        }
                      }
                    }
                    L17: {
                      if (param6[5] == null) {
                        break L17;
                      } else {
                        if (param6[5].field_y != 0) {
                          qh.d(var18, var19, var11, var20);
                          var21 = var15;
                          L18: while (true) {
                            if (var16 <= var21) {
                              qh.b(mb.field_b);
                              break L17;
                            } else {
                              param6[5].a(var14, var21, param2);
                              var21 = var21 + param6[5].field_y;
                              continue L18;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                    }
                    L19: {
                      if (param6[4] == null) {
                        break L19;
                      } else {
                        if (0 == param6[4].field_w) {
                          break L19;
                        } else {
                          if (0 != param6[4].field_y) {
                            qh.d(var17, var19, var18, var20);
                            var21 = var15;
                            L20: while (true) {
                              if (var16 <= var21) {
                                qh.b(mb.field_b);
                                break L19;
                              } else {
                                var22 = var13;
                                L21: while (true) {
                                  if (var22 >= var14) {
                                    var21 = var21 + param6[4].field_y;
                                    continue L20;
                                  } else {
                                    param6[4].a(var22, var21, param2);
                                    var22 = var22 + param6[4].field_w;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final static void a(byte param0) {
        de.a(-100);
        int var1 = 4 + sa.field_h.field_w + sa.field_h.field_C;
        qh.c(0, -var1 + 376, 32 + aq.field_a.length * 32, var1 + 112, 8421504, 127);
        int var2 = 0;
        int var3 = 56 / ((-35 - param0) / 33);
        while (var2 < aq.field_a.length) {
            aq.field_a[var2].c(3);
            var2++;
        }
    }

    final static void a(boolean param0, int param1, of param2, int param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        ko var10 = null;
        Object var11 = null;
        int var11_int = 0;
        im var12 = null;
        int var13 = 0;
        vh var14 = null;
        vh var15 = null;
        vh var16 = null;
        vh var17 = null;
        vh var18 = null;
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
        String var30 = null;
        int var30_int = 0;
        int var31 = 0;
        of stackIn_36_0 = null;
        boolean stackIn_36_1 = false;
        of stackIn_37_0 = null;
        boolean stackIn_37_1 = false;
        of stackIn_38_0 = null;
        boolean stackIn_38_1 = false;
        int stackIn_38_2 = 0;
        int stackIn_41_0 = 0;
        int stackIn_56_0 = 0;
        vh stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        vh stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        vh stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        int stackIn_95_4 = 0;
        of stackOut_35_0 = null;
        boolean stackOut_35_1 = false;
        of stackOut_37_0 = null;
        boolean stackOut_37_1 = false;
        int stackOut_37_2 = 0;
        of stackOut_36_0 = null;
        boolean stackOut_36_1 = false;
        int stackOut_36_2 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        vh stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        vh stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        int stackOut_94_4 = 0;
        vh stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        int stackOut_93_4 = 0;
        L0: {
          L1: {
            var31 = Pool.field_O;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            if (null == em.field_L) {
              break L1;
            } else {
              L2: {
                if (null != dl.field_j) {
                  break L2;
                } else {
                  if (null != ci.field_d) {
                    break L2;
                  } else {
                    if (w.field_j != null) {
                      break L2;
                    } else {
                      if (null == op.field_a) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var9 = 0;
              L3: while (true) {
                if (dr.field_c <= var9) {
                  break L1;
                } else {
                  var10_int = 255 & em.field_L.field_tc[var9];
                  if (var31 != 0) {
                    break L0;
                  } else {
                    L4: {
                      if (null == dl.field_j) {
                        break L4;
                      } else {
                        if (dl.field_j[var9] != null) {
                          if (!dl.field_j[var9][var10_int]) {
                            break L4;
                          } else {
                            var5 = 1;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (null == ci.field_d) {
                        break L5;
                      } else {
                        if (null != ci.field_d[var9]) {
                          L6: {
                            var11_int = ci.field_d[var9][var10_int];
                            if (var6 >= var11_int) {
                              break L6;
                            } else {
                              var6 = var11_int;
                              break L6;
                            }
                          }
                          if (0 == var11_int) {
                            break L5;
                          } else {
                            if (rg.field_s) {
                              break L5;
                            } else {
                              var5 = 1;
                              break L5;
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L7: {
                      if (op.field_a == null) {
                        break L7;
                      } else {
                        if (op.field_a[var9] != null) {
                          var8 = var8 | op.field_a[var9][var10_int];
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (null == w.field_j) {
                        break L8;
                      } else {
                        if (null == w.field_j[var9]) {
                          break L8;
                        } else {
                          L9: {
                            var11_int = w.field_j[var9][var10_int];
                            if (var11_int > var7) {
                              var7 = var11_int;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if (rg.field_s) {
                              break L8;
                            } else {
                              var5 = 1;
                              break L8;
                            }
                          }
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
            stackOut_35_0 = (of) param2;
            stackOut_35_1 = param0;
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (pf.field_c != param2) {
              stackOut_37_0 = (of) (Object) stackIn_37_0;
              stackOut_37_1 = stackIn_37_1;
              stackOut_37_2 = 0;
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L10;
            } else {
              stackOut_36_0 = (of) (Object) stackIn_36_0;
              stackOut_36_1 = stackIn_36_1;
              stackOut_36_2 = 1;
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L10;
            }
          }
          L11: {
            if (((of) (Object) stackIn_38_0).a(stackIn_38_1, stackIn_38_2 == 0, 2, (byte) 86, 2 * (ad.field_x - -2), (2 + ad.field_x) * (4 * param1))) {
              stackOut_40_0 = 0;
              stackIn_41_0 = stackOut_40_0;
              break L11;
            } else {
              stackOut_39_0 = 1;
              stackIn_41_0 = stackOut_39_0;
              break L11;
            }
          }
          var9 = stackIn_41_0;
          break L0;
        }
        L12: {
          var10 = param2.field_Rb.field_T;
          var11 = null;
          if (param4 == -83) {
            break L12;
          } else {
            rk.a(true, -46, (of) null, -111, (byte) 66);
            break L12;
          }
        }
        var12 = (im) (Object) var10.c((byte) 115);
        L13: while (true) {
          L14: {
            if (var12 == null) {
              break L14;
            } else {
              var13 = 0;
              if (var31 != 0) {
                break L14;
              } else {
                L15: {
                  if (null != var12.field_T) {
                    break L15;
                  } else {
                    L16: {
                      var12.field_ac = new vh(0L, ge.field_s);
                      var12.a(-106, var12.field_ac);
                      var12.field_Tb = new vh(0L, tm.field_d);
                      if (!tq.field_p) {
                        break L16;
                      } else {
                        var12.a(param4 + 165, var12.field_Tb);
                        break L16;
                      }
                    }
                    var12.field_Tb.field_Fb = 2;
                    var12.field_kc = new vh(0L, uo.field_Lb);
                    var12.a(3, var12.field_kc);
                    var12.d((byte) -125);
                    var12.field_lc = new vh(0L, p.field_i);
                    var12.a(13, var12.field_lc);
                    var12.field_Zb = new vh(0L, lh.field_g);
                    var13 = 1;
                    var12.a(37, var12.field_Zb);
                    break L15;
                  }
                }
                L17: {
                  var12.field_ac.field_nb = null;
                  var14 = var12.field_ac;
                  var12.field_ac.field_Db = 0;
                  var14.field_gb = 0;
                  var12.field_Tb.field_nb = null;
                  var12.field_Tb.field_Db = 0;
                  var15 = var12.field_Tb;
                  var12.field_lc.field_nb = null;
                  var15.field_gb = 0;
                  var16 = var12.field_lc;
                  var12.field_lc.field_Db = 0;
                  var12.field_Zb.field_nb = null;
                  var16.field_gb = 0;
                  var17 = var12.field_Zb;
                  var12.field_Zb.field_Db = 0;
                  var17.field_gb = 0;
                  var12.field_kc.field_nb = null;
                  var18 = var12.field_kc;
                  var12.field_kc.field_Db = 0;
                  var18.field_gb = 0;
                  var12.field_gb = param2.field_Rb.field_gb;
                  var19 = 0;
                  var20 = var12.field_jc;
                  var21 = 72;
                  if (ci.field_c != param2) {
                    break L17;
                  } else {
                    var21 += 42;
                    break L17;
                  }
                }
                L18: {
                  var20 = lr.a(var12.field_ac.field_I, var20, var21);
                  if (var20.equals((Object) (Object) var12.field_jc)) {
                    stackOut_55_0 = 0;
                    stackIn_56_0 = stackOut_55_0;
                    break L18;
                  } else {
                    stackOut_54_0 = 1;
                    stackIn_56_0 = stackOut_54_0;
                    break L18;
                  }
                }
                L19: {
                  L20: {
                    var22 = stackIn_56_0;
                    if ((var12.field_bc ^ -1) <= -5) {
                      break L20;
                    } else {
                      if (var12.field_bc > 0) {
                        var20 = "<img=" + (var12.field_bc - 1) + ">" + var20;
                        if (var31 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      } else {
                        break L19;
                      }
                    }
                  }
                  var20 = "<img=" + (gf.field_a + -4 + var12.field_bc) + ">" + var20;
                  break L19;
                }
                L21: {
                  var12.field_ac.field_nb = var20;
                  if (!var12.c(true)) {
                    L22: {
                      L23: {
                        L24: {
                          var23_int = 16764006;
                          var24_int = 16777215;
                          if (var5 == 0) {
                            break L24;
                          } else {
                            if (!var12.field_Pb) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        if (var12.field_Rb < var6) {
                          break L23;
                        } else {
                          if (var12.field_Xb < var7) {
                            break L23;
                          } else {
                            if ((var8 & (var12.field_Nb ^ -1) ^ -1) >= -1) {
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
                        var12.field_lc.field_N = var23_int;
                        var12.field_Tb.field_N = var23_int;
                        var12.field_ac.field_N = var23_int;
                        var12.field_ac.field_Bb = var24_int;
                        var12.field_ac.field_P = var24_int;
                        var12.field_ac.field_K = var24_int;
                        var12.field_Tb.field_Bb = var24_int;
                        var12.field_Tb.field_P = var24_int;
                        var12.field_Tb.field_K = var24_int;
                        var12.field_lc.field_Bb = var24_int;
                        var12.field_lc.field_P = var24_int;
                        var12.field_lc.field_K = var24_int;
                        if (wo.field_f != param2) {
                          break L26;
                        } else {
                          if (!em.field_L.field_ec) {
                            var12.field_Zb.field_nb = bl.field_e;
                            if (var31 == 0) {
                              break L25;
                            } else {
                              break L26;
                            }
                          } else {
                            break L25;
                          }
                        }
                      }
                      L27: {
                        if (var12.field_mc) {
                          break L27;
                        } else {
                          L28: {
                            if (var12.field_Yb) {
                              break L28;
                            } else {
                              var12.field_lc.field_nb = kn.field_k;
                              break L28;
                            }
                          }
                          var12.field_ac.field_nb = nr.a(new String[1], -1, dj.field_j);
                          var12.field_lc.field_nb = ie.field_b;
                          var12.field_Zb.field_nb = qa.field_u;
                          break L27;
                        }
                      }
                      var12.field_ac.field_nb = nr.a(new String[1], -1, ma.field_f);
                      var12.field_Zb.field_nb = be.field_K;
                      break L25;
                    }
                    L29: {
                      var25_int = 0;
                      if (null == em.field_L) {
                        break L29;
                      } else {
                        if (!cj.e((byte) 85)) {
                          break L29;
                        } else {
                          if (var12.field_Sb == ve.field_m) {
                            break L29;
                          } else {
                            L30: {
                              if (null != var12.field_lc.field_nb) {
                                var26 = var12.field_lc.b(true) - -(kj.field_j * 2);
                                var12.field_lc.b(var19, 2147483647, var25_int, var26, ad.field_x);
                                var25_int = var25_int + var26;
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                            if (null != var12.field_Zb.field_nb) {
                              L31: {
                                L32: {
                                  if (param2 == wo.field_f) {
                                    break L32;
                                  } else {
                                    var26 = var12.field_Zb.b(true) - -(kj.field_j * 2);
                                    if (var31 == 0) {
                                      break L31;
                                    } else {
                                      break L32;
                                    }
                                  }
                                }
                                var26 = 40;
                                break L31;
                              }
                              var12.field_Zb.b(var19, 2147483647, var25_int, var26, ad.field_x);
                              var25_int = var25_int + var26;
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                        }
                      }
                    }
                    L33: {
                      stackOut_92_0 = var12.field_ac;
                      stackOut_92_1 = var19;
                      stackOut_92_2 = 2147483647;
                      stackOut_92_3 = var25_int;
                      stackIn_94_0 = stackOut_92_0;
                      stackIn_94_1 = stackOut_92_1;
                      stackIn_94_2 = stackOut_92_2;
                      stackIn_94_3 = stackOut_92_3;
                      stackIn_93_0 = stackOut_92_0;
                      stackIn_93_1 = stackOut_92_1;
                      stackIn_93_2 = stackOut_92_2;
                      stackIn_93_3 = stackOut_92_3;
                      if (!tq.field_p) {
                        stackOut_94_0 = (vh) (Object) stackIn_94_0;
                        stackOut_94_1 = stackIn_94_1;
                        stackOut_94_2 = stackIn_94_2;
                        stackOut_94_3 = stackIn_94_3;
                        stackOut_94_4 = 0;
                        stackIn_95_0 = stackOut_94_0;
                        stackIn_95_1 = stackOut_94_1;
                        stackIn_95_2 = stackOut_94_2;
                        stackIn_95_3 = stackOut_94_3;
                        stackIn_95_4 = stackOut_94_4;
                        break L33;
                      } else {
                        stackOut_93_0 = (vh) (Object) stackIn_93_0;
                        stackOut_93_1 = stackIn_93_1;
                        stackOut_93_2 = stackIn_93_2;
                        stackOut_93_3 = stackIn_93_3;
                        stackOut_93_4 = 42;
                        stackIn_95_0 = stackOut_93_0;
                        stackIn_95_1 = stackOut_93_1;
                        stackIn_95_2 = stackOut_93_2;
                        stackIn_95_3 = stackOut_93_3;
                        stackIn_95_4 = stackOut_93_4;
                        break L33;
                      }
                    }
                    L34: {
                      ((vh) (Object) stackIn_95_0).b(stackIn_95_1, stackIn_95_2, stackIn_95_3, -stackIn_95_4 + (var12.field_gb - var25_int), ad.field_x);
                      var12.field_Tb.field_nb = Integer.toString(var12.field_Rb);
                      var12.field_Tb.b(var19, param4 + -2147483566, -40 + var12.field_gb, 40, ad.field_x);
                      if (var12.field_ac.field_W) {
                        if (var22 != 0) {
                          kk.field_B = var12.field_jc;
                          if (null == lo.field_c) {
                            break L34;
                          } else {
                            if (null == lo.field_c[var12.field_bc]) {
                              break L34;
                            } else {
                              kk.field_B = kk.field_B + " - " + lo.field_c[var12.field_bc];
                              if (var31 == 0) {
                                break L34;
                              } else {
                                if (!var12.field_ac.field_W) {
                                  break L34;
                                } else {
                                  if (null == lo.field_c) {
                                    break L34;
                                  } else {
                                    if (lo.field_c[var12.field_bc] == null) {
                                      break L34;
                                    } else {
                                      kk.field_B = lo.field_c[var12.field_bc];
                                      break L34;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (!var12.field_ac.field_W) {
                            break L34;
                          } else {
                            if (null == lo.field_c) {
                              break L34;
                            } else {
                              if (lo.field_c[var12.field_bc] == null) {
                                break L34;
                              } else {
                                kk.field_B = lo.field_c[var12.field_bc];
                                break L34;
                              }
                            }
                          }
                        }
                      } else {
                        if (!var12.field_ac.field_W) {
                          break L34;
                        } else {
                          if (null == lo.field_c) {
                            break L34;
                          } else {
                            if (lo.field_c[var12.field_bc] == null) {
                              break L34;
                            } else {
                              kk.field_B = lo.field_c[var12.field_bc];
                              break L34;
                            }
                          }
                        }
                      }
                    }
                    var19 = var19 + ad.field_x;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L35: {
                  var23 = vk.a(var20, var12.field_hc, (byte) -126);
                  var24 = var23;
                  var24 = var23;
                  if (var23 != null) {
                    var24_int = var12.field_kc.field_I.b(var23, -kj.field_j + (var12.field_gb - kj.field_j));
                    var12.field_kc.field_Eb = var12.field_gc * 256 / mq.field_f;
                    var12.field_kc.field_nb = var23;
                    var12.field_kc.b(var19, 2147483647, kj.field_j, -(2 * kj.field_j) + var12.field_gb, ad.field_x * var24_int);
                    var19 = var19 + ad.field_x * var24_int;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (var9 == 0) {
                    var12.field_Cb = var19 + -var12.field_Db;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (var13 == 0) {
                    break L37;
                  } else {
                    param2.field_Rb.a((vh) var11, 2, (vh) (Object) var12, -119);
                    break L37;
                  }
                }
                L38: {
                  if (-1 == (var12.field_R ^ -1)) {
                    break L38;
                  } else {
                    if (var12.c(true)) {
                      break L38;
                    } else {
                      L39: {
                        if (0 != var12.field_lc.field_R) {
                          break L39;
                        } else {
                          L40: {
                            if (0 == var12.field_Zb.field_R) {
                              break L40;
                            } else {
                              jk.a(var12.field_Sb, param3, 0);
                              if (var31 == 0) {
                                break L38;
                              } else {
                                break L40;
                              }
                            }
                          }
                          ob.a(0, param2, 0, param4 ^ -9770, ua.field_o, lq.field_W, var12);
                          break L39;
                        }
                      }
                      k.a(param3, (byte) -127, var12.field_Sb);
                      break L38;
                    }
                  }
                }
                L41: {
                  if (!var12.field_db) {
                    break L41;
                  } else {
                    if (!var12.c(true)) {
                      L42: {
                        var24 = null;
                        if (var12.field_Sb == ve.field_m) {
                          L43: {
                            if (var5 == 0) {
                              break L43;
                            } else {
                              if (!var12.field_Pb) {
                                var24 = nr.field_db;
                                break L42;
                              } else {
                                break L43;
                              }
                            }
                          }
                          if (var7 > var12.field_Xb) {
                            L44: {
                              var25_int = var7 + -var12.field_Xb;
                              if ((var25_int ^ -1) != -2) {
                                break L44;
                              } else {
                                var24 = rf.field_f;
                                break L44;
                              }
                            }
                            var24 = nr.a(new String[2], -1, vm.field_n);
                            break L42;
                          } else {
                            if (var12.field_Rb < var6) {
                              var24 = nr.a(new String[2], -1, ld.field_i);
                              break L42;
                            } else {
                              if (-1 != (var8 & var12.field_Nb)) {
                                var25_int = s.a((var12.field_Nb ^ -1) & var8, (byte) 111);
                                var24 = dl.field_a;
                                if (var25_int <= 0) {
                                  break L42;
                                } else {
                                  if (null == fg.field_f) {
                                    break L42;
                                  } else {
                                    if (fg.field_f.length < var25_int) {
                                      break L42;
                                    } else {
                                      if (fg.field_f[var25_int - 1] != null) {
                                        var24 = fg.field_f[var25_int - 1][1];
                                        break L42;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L42;
                              }
                            }
                          }
                        } else {
                          L45: {
                            if (var5 == 0) {
                              break L45;
                            } else {
                              if (!var12.field_Pb) {
                                var24 = nr.a(new String[1], -1, dq.field_c);
                                break L42;
                              } else {
                                break L45;
                              }
                            }
                          }
                          if (var7 <= var12.field_Xb) {
                            if (var6 <= var12.field_Rb) {
                              if (-1 == (var8 & var12.field_Nb)) {
                                break L42;
                              } else {
                                var25_int = s.a((var12.field_Nb ^ -1) & var8, (byte) 100);
                                var24 = nr.a(new String[1], -1, en.field_a);
                                if ((var25_int ^ -1) >= -1) {
                                  break L42;
                                } else {
                                  if (fg.field_f == null) {
                                    break L42;
                                  } else {
                                    if (var25_int > fg.field_f.length) {
                                      break L42;
                                    } else {
                                      if (null == fg.field_f[-1 + var25_int]) {
                                        break L42;
                                      } else {
                                        var24 = nr.a(new String[1], -1, fg.field_f[var25_int - 1][2]);
                                        break L42;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var24 = nr.a(new String[2], -1, jq.field_a);
                              break L42;
                            }
                          } else {
                            L46: {
                              var25_int = -var12.field_Xb + var7;
                              if (1 != var25_int) {
                                break L46;
                              } else {
                                var24 = nr.a(new String[1], -1, jd.field_i);
                                break L46;
                              }
                            }
                            var24 = nr.a(new String[2], -1, sm.field_A);
                            break L42;
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
                        L47: while (true) {
                          L48: {
                            L49: {
                              L50: {
                                L51: {
                                  if (dr.field_c <= var27_int) {
                                    break L51;
                                  } else {
                                    var28 = 255 & em.field_L.field_tc[var27_int];
                                    var29 = 0;
                                    if (var31 != 0) {
                                      break L50;
                                    } else {
                                      L52: {
                                        if (dl.field_j == null) {
                                          break L52;
                                        } else {
                                          if (dl.field_j[var27_int] != null) {
                                            if (!dl.field_j[var27_int][var28]) {
                                              break L52;
                                            } else {
                                              if (var12.field_Pb) {
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
                                        if (ci.field_d == null) {
                                          break L53;
                                        } else {
                                          if (ci.field_d[var27_int] == null) {
                                            break L53;
                                          } else {
                                            L54: {
                                              var30_int = ci.field_d[var27_int][var28];
                                              if (var30_int == 0) {
                                                break L54;
                                              } else {
                                                if (rg.field_s) {
                                                  break L54;
                                                } else {
                                                  if (var12.field_Pb) {
                                                    break L54;
                                                  } else {
                                                    var29 = 1;
                                                    break L54;
                                                  }
                                                }
                                              }
                                            }
                                            if (var30_int <= var12.field_Rb) {
                                              break L53;
                                            } else {
                                              var29 = 1;
                                              break L53;
                                            }
                                          }
                                        }
                                      }
                                      L55: {
                                        if (null == w.field_j) {
                                          break L55;
                                        } else {
                                          if (w.field_j[var27_int] == null) {
                                            break L55;
                                          } else {
                                            L56: {
                                              var30_int = w.field_j[var27_int][var28];
                                              if (-1 == (var30_int ^ -1)) {
                                                break L56;
                                              } else {
                                                if (rg.field_s) {
                                                  break L56;
                                                } else {
                                                  if (var12.field_Pb) {
                                                    break L56;
                                                  } else {
                                                    var29 = 1;
                                                    break L56;
                                                  }
                                                }
                                              }
                                            }
                                            if (var30_int > var12.field_Xb) {
                                              var29 = 1;
                                              break L55;
                                            } else {
                                              break L55;
                                            }
                                          }
                                        }
                                      }
                                      L57: {
                                        if (op.field_a == null) {
                                          break L57;
                                        } else {
                                          if (op.field_a[var27_int] != null) {
                                            if ((op.field_a[var27_int][var28] & (var12.field_Nb ^ -1)) != 0) {
                                              var29 = 1;
                                              break L57;
                                            } else {
                                              break L57;
                                            }
                                          } else {
                                            break L57;
                                          }
                                        }
                                      }
                                      L58: {
                                        if (var29 != 0) {
                                          L59: {
                                            var30 = "<col=A00000>" + ck.field_R[var27_int] + "</col>";
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
                                          var26 = 1;
                                          var25 = var25 + ", " + var30;
                                          var24 = var25;
                                          var24 = var25;
                                          break L58;
                                        } else {
                                          break L58;
                                        }
                                      }
                                      var27_int++;
                                      if (var31 == 0) {
                                        continue L47;
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                }
                                if (param2 != wo.field_f) {
                                  break L50;
                                } else {
                                  if (cj.e((byte) 85)) {
                                    break L49;
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                              L60: {
                                if (var26 == 0) {
                                  break L60;
                                } else {
                                  var24 = var24 + "<br>" + tp.field_d + var25;
                                  if (var31 == 0) {
                                    break L48;
                                  } else {
                                    break L60;
                                  }
                                }
                              }
                              var24 = var24 + "<br>" + nr.a(new String[1], -1, sf.field_x);
                              break L49;
                            }
                            L61: {
                              if (var26 == 0) {
                                break L61;
                              } else {
                                var24 = var24 + "<br>" + hm.field_g + var25;
                                break L61;
                              }
                            }
                            var24 = var24 + "<br>" + nr.a(new String[1], -1, ii.field_c);
                            break L48;
                          }
                          L62: {
                            if (param2 != wo.field_f) {
                              break L62;
                            } else {
                              if (cj.e((byte) 85)) {
                                break L62;
                              } else {
                                var27 = em.field_L.field_Ob;
                                var24 = var24 + "<br>" + nr.a(new String[1], param4 ^ 82, ke.field_b);
                                break L62;
                              }
                            }
                          }
                          kk.field_B = var24;
                          break L41;
                        }
                      } else {
                        break L41;
                      }
                    } else {
                      break L41;
                    }
                  }
                }
                var11 = (Object) (Object) var12;
                var12 = (im) (Object) var10.f((byte) -5);
                continue L13;
              }
            }
          }
          return;
        }
    }

    final int a(byte param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Pool.field_O;
        if (param5 != 0) {
          L0: {
            L1: {
              param5 = param5 + param1;
              var7 = 0;
              var8 = param2;
              var9 = param4[var8];
              if (0 > var9) {
                break L1;
              } else {
                var7++;
                if (var11 != 0) {
                  break L0;
                } else {
                  if (var11 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var7 = ((rk) this).field_c[var7];
            break L0;
          }
          L2: {
            L3: {
              var10 = ((rk) this).field_c[var7];
              if (((rk) this).field_c[var7] >= 0) {
                break L3;
              } else {
                int incrementValue$8 = param1;
                param1++;
                param3[incrementValue$8] = (byte)(var10 ^ -1);
                if (param5 <= param1) {
                  break L2;
                } else {
                  var7 = 0;
                  break L3;
                }
              }
            }
            L4: {
              if (0 == (64 & var9)) {
                break L4;
              } else {
                break L4;
              }
            }
            var7++;
            L5: {
              var10 = ((rk) this).field_c[var7];
              if (-1 < (((rk) this).field_c[var7] ^ -1)) {
                L6: {
                  int incrementValue$9 = param1;
                  param1++;
                  param3[incrementValue$9] = (byte)var10;
                  if (param1 < param5) {
                    break L6;
                  } else {
                    if (var11 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                }
                var7 = 0;
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              if (-1 == (32 & var9)) {
                break L7;
              } else {
                break L7;
              }
            }
            var7++;
            L8: {
              var10 = ((rk) this).field_c[var7];
              if (((rk) this).field_c[var7] < 0) {
                int incrementValue$10 = param1;
                param1++;
                param3[incrementValue$10] = (byte)(var10 ^ -1);
                if (param1 >= param5) {
                  break L2;
                } else {
                  var7 = 0;
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L9: {
              if ((var9 & 16) != 0) {
                break L9;
              } else {
                var7++;
                break L9;
              }
            }
            L10: {
              var7 = ((rk) this).field_c[var7];
              var10 = ((rk) this).field_c[var7];
              if (((rk) this).field_c[var7] >= 0) {
                break L10;
              } else {
                L11: {
                  int incrementValue$11 = param1;
                  param1++;
                  param3[incrementValue$11] = (byte)(var10 ^ -1);
                  if (param1 < param5) {
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var7 = 0;
                break L10;
              }
            }
            L12: {
              if ((8 & var9) == 0) {
                break L12;
              } else {
                break L12;
              }
            }
            var7++;
            L13: {
              var10 = ((rk) this).field_c[var7];
              if (-1 < (((rk) this).field_c[var7] ^ -1)) {
                int incrementValue$12 = param1;
                param1++;
                param3[incrementValue$12] = (byte)(var10 ^ -1);
                if (param5 <= param1) {
                  break L2;
                } else {
                  var7 = 0;
                  break L13;
                }
              } else {
                break L13;
              }
            }
            L14: {
              if ((4 & var9) != 0) {
                break L14;
              } else {
                var7++;
                break L14;
              }
            }
            L15: {
              var7 = ((rk) this).field_c[var7];
              var10 = ((rk) this).field_c[var7];
              if (((rk) this).field_c[var7] >= 0) {
                break L15;
              } else {
                int incrementValue$13 = param1;
                param1++;
                param3[incrementValue$13] = (byte)(var10 ^ -1);
                if (param5 <= param1) {
                  break L2;
                } else {
                  var7 = 0;
                  break L15;
                }
              }
            }
            L16: {
              if ((2 & var9) != 0) {
                break L16;
              } else {
                var7++;
                break L16;
              }
            }
            L17: {
              var7 = ((rk) this).field_c[var7];
              var10 = ((rk) this).field_c[var7];
              if (((rk) this).field_c[var7] < 0) {
                int incrementValue$14 = param1;
                param1++;
                param3[incrementValue$14] = (byte)var10;
                if (param5 <= param1) {
                  break L2;
                } else {
                  var7 = 0;
                  break L17;
                }
              } else {
                break L17;
              }
            }
            L18: {
              if (-1 != (1 & var9)) {
                break L18;
              } else {
                var7++;
                break L18;
              }
            }
            L19: {
              var7 = ((rk) this).field_c[var7];
              var10 = ((rk) this).field_c[var7];
              if (0 > ((rk) this).field_c[var7]) {
                L20: {
                  int incrementValue$15 = param1;
                  param1++;
                  param3[incrementValue$15] = (byte)(var10 ^ -1);
                  if (param5 > param1) {
                    break L20;
                  } else {
                    break L20;
                  }
                }
                var7 = 0;
                break L19;
              } else {
                break L19;
              }
            }
            var8++;
            break L2;
          }
          L21: {
            if (param0 == 36) {
              break L21;
            } else {
              field_h = null;
              break L21;
            }
          }
          return -param2 + 1 + var8;
        } else {
          return 0;
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3, byte[] param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var7 = 0;
        param1 = param1 + param0;
        var8 = param3 << -1597699549;
        L0: while (true) {
          if (param1 <= param0) {
            L1: {
              if (param5) {
                break L1;
              } else {
                int discarded$2 = rk.b(false);
                break L1;
              }
            }
            return -param3 + (7 + var8 >> 1517095843);
          } else {
            var9 = param4[param0] & 255;
            var10 = ((rk) this).field_b[var9];
            var11 = ((rk) this).field_a[var9];
            if (var11 != 0) {
              var12 = var8 >> -938037629;
              var13 = 7 & var8;
              var7 = var7 & -var13 >> 342817823;
              var14 = (var11 + var13 - 1 >> 522306211) + var12;
              var13 += 24;
              int dupTemp$3 = md.a(var7, var10 >>> var13);
              var7 = dupTemp$3;
              param2[var12] = (byte)dupTemp$3;
              if (var14 > var12) {
                L2: {
                  var13 -= 8;
                  var12++;
                  var7 = var10 >>> var13;
                  param2[var12] = (byte)(var10 >>> var13);
                  if (var12 >= var14) {
                    break L2;
                  } else {
                    var12++;
                    var13 -= 8;
                    var7 = var10 >>> var13;
                    param2[var12] = (byte)(var10 >>> var13);
                    if (var12 >= var14) {
                      break L2;
                    } else {
                      var12++;
                      var13 -= 8;
                      var7 = var10 >>> var13;
                      param2[var12] = (byte)(var10 >>> var13);
                      if (var14 > var12) {
                        var13 -= 8;
                        var12++;
                        var7 = var10 << -var13;
                        param2[var12] = (byte)(var10 << -var13);
                        break L2;
                      } else {
                        var8 = var8 + var11;
                        param0++;
                        continue L0;
                      }
                    }
                  }
                }
                var8 = var8 + var11;
                param0++;
                continue L0;
              } else {
                var8 = var8 + var11;
                param0++;
                continue L0;
              }
            } else {
              throw new RuntimeException("" + var9);
            }
          }
        }
    }

    final static boolean a(int param0, int[] param1) {
        long var2 = 0L;
        fr var4_ref_fr = null;
        int var4 = 0;
        int var5_int = 0;
        fr var5 = null;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_22_0 = false;
        boolean stackOut_16_0 = false;
        boolean stackOut_21_0 = false;
        var7 = Pool.field_O;
        if (tl.field_J == ta.field_a) {
          L0: {
            var2 = rl.a((byte) -103);
            if (param0 == ii.field_d) {
              break L0;
            } else {
              if ((wq.field_b ^ -1) <= -1) {
                break L0;
              } else {
                var4_ref_fr = (fr) (Object) vn.field_g.c((byte) -112);
                if (var4_ref_fr == null) {
                  break L0;
                } else {
                  if (var4_ref_fr.field_p < var2) {
                    var4_ref_fr.a((byte) -117);
                    of.field_Pb = var4_ref_fr.field_l.length;
                    kn.field_e.field_v = 0;
                    var5_int = 0;
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (var5_int >= of.field_Pb) {
                            break L3;
                          } else {
                            kn.field_e.field_t[var5_int] = var4_ref_fr.field_l[var5_int];
                            var5_int++;
                            if (var7 != 0) {
                              break L2;
                            } else {
                              if (var7 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        hb.field_e = vd.field_g;
                        vd.field_g = ia.field_l;
                        ia.field_l = uq.field_c;
                        uq.field_c = var4_ref_fr.field_r;
                        break L2;
                      }
                      return true;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          L4: while (true) {
            L5: {
              L6: {
                if (wq.field_b >= 0) {
                  break L6;
                } else {
                  kn.field_e.field_v = 0;
                  stackOut_16_0 = lq.b((byte) 107, 1);
                  stackIn_22_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (var7 != 0) {
                    break L5;
                  } else {
                    if (!stackIn_17_0) {
                      return false;
                    } else {
                      wq.field_b = kn.field_e.q(param0 + 107);
                      kn.field_e.field_v = 0;
                      of.field_Pb = param1[wq.field_b];
                      break L6;
                    }
                  }
                }
              }
              stackOut_21_0 = wf.a((byte) 39);
              stackIn_22_0 = stackOut_21_0;
              break L5;
            }
            if (!stackIn_22_0) {
              return false;
            } else {
              if (ii.field_d != 0) {
                L7: {
                  var4 = ii.field_d;
                  if (hn.field_a == 0.0) {
                    break L7;
                  } else {
                    var4 = (int)((double)var4 + lc.field_P.nextGaussian() * hn.field_a);
                    if ((var4 ^ -1) <= -1) {
                      break L7;
                    } else {
                      var4 = 0;
                      break L7;
                    }
                  }
                }
                var5 = new fr(var2 + (long)var4, wq.field_b, new byte[of.field_Pb]);
                var6 = 0;
                if (var6 >= of.field_Pb) {
                  vn.field_g.b((byte) -64, (ma) (Object) var5);
                  wq.field_b = -1;
                  continue L4;
                } else {
                  var5.field_l[var6] = kn.field_e.field_t[var6];
                  var6++;
                  continue L4;
                }
              } else {
                hb.field_e = vd.field_g;
                vd.field_g = ia.field_l;
                ia.field_l = uq.field_c;
                uq.field_c = wq.field_b;
                wq.field_b = -1;
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static int b(boolean param0) {
        if (!param0) {
            rk.a(37, -53, 4, 85, 43, -30, (dd[]) null);
        }
        return di.field_e + (ol.field_e << 775822690) + (ec.field_i << 961008452);
    }

    public static void a(boolean param0) {
        field_e = null;
        field_g = null;
        field_h = null;
        if (param0) {
            field_e = null;
        }
        field_i = null;
        field_f = null;
    }

    rk(byte[] param0) {
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        var15 = Pool.field_O;
        var2 = param0.length;
        ((rk) this).field_a = param0;
        ((rk) this).field_b = new int[var2];
        ((rk) this).field_c = new int[8];
        var3 = new int[33];
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var2 <= var5) {
              break L1;
            } else {
              var6 = param0[var5];
              if (var15 != 0) {
                break L1;
              } else {
                L2: {
                  if (0 == var6) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        var7 = 1 << 32 - var6;
                        var8 = var3[var6];
                        ((rk) this).field_b[var5] = var8;
                        if (-1 == (var8 & var7 ^ -1)) {
                          var9 = var7 | var8;
                          var10 = var6 + -1;
                          L5: while (true) {
                            if (var10 < 1) {
                              break L4;
                            } else {
                              var11 = var3[var10];
                              stackOut_9_0 = var11;
                              stackOut_9_1 = var8;
                              stackIn_23_0 = stackOut_9_0;
                              stackIn_23_1 = stackOut_9_1;
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              if (var15 != 0) {
                                break L3;
                              } else {
                                if (stackIn_10_0 != stackIn_10_1) {
                                  break L4;
                                } else {
                                  L6: {
                                    L7: {
                                      var12 = 1 << 32 + -var10;
                                      if ((var12 & var11) != 0) {
                                        break L7;
                                      } else {
                                        var3[var10] = md.a(var12, var11);
                                        if (var15 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var3[var10] = var3[var10 - 1];
                                    break L6;
                                  }
                                  var10--;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          var9 = var3[-1 + var6];
                          if (var15 == 0) {
                            break L4;
                          } else {
                            var9 = var7 | var8;
                            var10 = var6 + -1;
                            L8: while (true) {
                              if (var10 < 1) {
                                break L4;
                              } else {
                                var11 = var3[var10];
                                if (var11 != var8) {
                                  break L4;
                                } else {
                                  L9: {
                                    L10: {
                                      var12 = 1 << 32 + -var10;
                                      if ((var12 & var11) != 0) {
                                        break L10;
                                      } else {
                                        var3[var10] = md.a(var12, var11);
                                        if (var15 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    var3[var10] = var3[var10 - 1];
                                    break L9;
                                  }
                                  var10--;
                                  continue L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      var3[var6] = var9;
                      stackOut_22_0 = 1;
                      stackOut_22_1 = var6;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      break L3;
                    }
                    var10 = stackIn_23_0 + stackIn_23_1;
                    L11: while (true) {
                      if (var10 > 32) {
                        var10 = 0;
                        var11 = 0;
                        L12: while (true) {
                          if (var6 <= var11) {
                            ((rk) this).field_c[var10] = var5 ^ -1;
                            if (var10 < var4) {
                              break L2;
                            } else {
                              var4 = var10 + 1;
                              break L2;
                            }
                          } else {
                            L13: {
                              L14: {
                                var12 = -2147483648 >>> var11;
                                if ((var8 & var12) == 0) {
                                  break L14;
                                } else {
                                  L15: {
                                    if (((rk) this).field_c[var10] != 0) {
                                      break L15;
                                    } else {
                                      ((rk) this).field_c[var10] = var4;
                                      break L15;
                                    }
                                  }
                                  var10 = ((rk) this).field_c[var10];
                                  if (var15 == 0) {
                                    break L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              var10++;
                              break L13;
                            }
                            L16: {
                              L17: {
                                if (((rk) this).field_c.length > var10) {
                                  break L17;
                                } else {
                                  var13 = new int[((rk) this).field_c.length * 2];
                                  var14 = 0;
                                  L18: while (true) {
                                    if (var14 >= ((rk) this).field_c.length) {
                                      ((rk) this).field_c = var13;
                                      break L17;
                                    } else {
                                      var13[var14] = ((rk) this).field_c[var14];
                                      var14++;
                                      if (var15 != 0) {
                                        break L16;
                                      } else {
                                        continue L18;
                                      }
                                    }
                                  }
                                }
                              }
                              var12 = var12 >>> 1;
                              var11++;
                              break L16;
                            }
                            continue L12;
                          }
                        }
                      } else {
                        L19: {
                          if (var8 != var3[var10]) {
                            break L19;
                          } else {
                            var3[var10] = var9;
                            break L19;
                          }
                        }
                        var10++;
                        continue L11;
                      }
                    }
                  }
                }
                var5++;
                continue L0;
              }
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "You<%0> are all out of lives!";
        field_h = "Waiting for sound effects";
        field_i = "This entry doesn't match";
        field_f = "Report abuse";
        field_g = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
