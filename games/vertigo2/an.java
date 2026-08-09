/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    private int[] field_d;
    static boolean field_c;
    private or field_i;
    private int[][] field_h;
    static String field_e;
    private int[][] field_a;
    private or field_b;
    private int[][] field_g;
    static String[][] field_f;

    final static er b(int param0, String param1) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        er stackIn_62_0 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        er var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        er var13 = null;
        int var14 = 0;
        er var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        cc var19 = null;
        var18 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var19 = la.field_a;
            var3 = 64 + (var19.field_z + var19.field_M);
            var4 = 64 + var19.c(param1);
            var5 = var4;
            var6 = var3;
            var7 = new er(var5, var6);
            var7.d();
            bi.e(32, 32, var7.field_y + -64, var7.field_t - 64, 9361151, 1282259);
            var10 = 0;
            var11 = 128;
            var12 = var11 / 2;
            var13_int = 0;
            L1: while (true) {
              if (var7.field_F.length <= var13_int) {
                var13 = new er(var4, var3);
                var13.d();
                var19.b(param1, 32, var19.field_D + 32, 16711680, -1);
                var14 = -35 % ((param0 - 29) / 61);
                var13.d();
                var15 = new er(var5, var6);
                var15.d();
                var16 = 0;
                L2: while (true) {
                  if (var16 >= var13.field_F.length) {
                    var16 = 0;
                    L3: while (true) {
                      if (var16 >= var13.field_F.length) {
                        var13.e(0, 0);
                        var16 = 0;
                        var17 = 0;
                        L4: while (true) {
                          if (var13.field_F.length <= var17) {
                            ro.field_g.a(97);
                            stackIn_62_0 = (er) (var15);
                            break L0;
                          } else {
                            L5: {
                              if (0 != var13.field_F[var17]) {
                                L6: {
                                  L7: {
                                    var16 = 0;
                                    if (var13.field_F[-var13.field_y + var17] == 0) {
                                      break L7;
                                    } else {
                                      if (var13.field_F[var13.field_y + var17] != 0) {
                                        L8: {
                                          if (0 == var13.field_F[var17 - 2 * var13.field_y]) {
                                            break L8;
                                          } else {
                                            if (0 == var13.field_F[var17 + var13.field_y * 2]) {
                                              break L8;
                                            } else {
                                              L9: {
                                                if (var13.field_F[-(3 * var13.field_y) + var17] == 0) {
                                                  break L9;
                                                } else {
                                                  if (var13.field_F[var17 + var13.field_y * 3] == 0) {
                                                    break L9;
                                                  } else {
                                                    break L6;
                                                  }
                                                }
                                              }
                                              var16 = 3;
                                              break L6;
                                            }
                                          }
                                        }
                                        var16 = 2;
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var16 = 1;
                                  break L6;
                                }
                                var15.field_F[var17] = var7.field_F[var17];
                                if (var16 != 1) {
                                  if (2 != var16) {
                                    if (-4 == (var16 ^ -1)) {
                                      var9 = var17 / var13.field_y;
                                      var8 = var17 % var13.field_y;
                                      bi.b(var8, var9, 1118481);
                                      break L5;
                                    } else {
                                      var17++;
                                      continue L4;
                                    }
                                  } else {
                                    var8 = var17 % var13.field_y;
                                    var9 = var17 / var13.field_y;
                                    bi.b(var8, var9, 2236962);
                                    break L5;
                                  }
                                } else {
                                  var8 = var17 % var13.field_y;
                                  var9 = var17 / var13.field_y;
                                  bi.b(var8, var9, 5592405);
                                  break L5;
                                }
                              } else {
                                break L5;
                              }
                            }
                            var17++;
                            continue L4;
                          }
                        }
                      } else {
                        if (-1 != (var13.field_F[var16] ^ -1)) {
                          L10: {
                            if (0 == var13.field_F[var16 + 1]) {
                              break L10;
                            } else {
                              if (0 == var13.field_F[var16 - 1]) {
                                break L10;
                              } else {
                                if (0 == var13.field_F[-var13.field_y + var16]) {
                                  break L10;
                                } else {
                                  if (var13.field_F[var16 + var13.field_y] == 0) {
                                    break L10;
                                  } else {
                                    var16++;
                                    continue L3;
                                  }
                                }
                              }
                            }
                          }
                          var9 = var16 / var13.field_y;
                          var8 = var16 % var13.field_y;
                          bi.f(var8, var9, 5, 3039099);
                          var16++;
                          continue L3;
                        } else {
                          var16++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (var13.field_F[var16] != 0) {
                      L11: {
                        L12: {
                          if (0 == var13.field_F[1 + var16]) {
                            break L12;
                          } else {
                            if (var13.field_F[var16 + -1] == 0) {
                              break L12;
                            } else {
                              if (-1 == (var13.field_F[var16 + -var13.field_y] ^ -1)) {
                                break L12;
                              } else {
                                if (-1 == (var13.field_F[var16 + var13.field_y] ^ -1)) {
                                  break L12;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                        var8 = var16 % var13.field_y;
                        var9 = var16 / var13.field_y;
                        bi.f(var8, var9, 10, 131359);
                        break L11;
                      }
                      var16++;
                      continue L2;
                    } else {
                      var16++;
                      continue L2;
                    }
                  }
                }
              } else {
                L13: {
                  var9 = var13_int / var7.field_y;
                  var8 = var13_int % var7.field_y;
                  if (var8 % var11 <= var12) {
                    stackIn_6_0 = 0;
                    break L13;
                  } else {
                    stackIn_6_0 = 1;
                    break L13;
                  }
                }
                L14: {
                  var10 = stackIn_6_0;
                  if (var9 % var11 > var12) {
                    L15: {
                      if (var10 != 0) {
                        stackIn_11_0 = 0;
                        break L15;
                      } else {
                        stackIn_11_0 = 1;
                        break L15;
                      }
                    }
                    var10 = stackIn_11_0;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L16: {
                  if (var10 != 0) {
                    bi.b(var8, var9, 657930);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                var13_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackIn_65_0 = (RuntimeException) (var2);

            stackIn_65_1 = new StringBuilder().append("an.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "null";
              break L17;
            } else {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "{...}";
              break L17;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ')');
        }
        return stackIn_62_0;
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        int stackIn_11_0 = 0;
        String stackIn_25_0 = null;
        cr stackIn_36_0 = null;
        cr stackIn_37_0 = null;
        String stackIn_37_1 = null;
        cr stackIn_39_0 = null;
        String[] stackIn_39_1 = null;
        cr stackIn_40_0 = null;
        String[] stackIn_40_1 = null;
        String stackIn_40_2 = null;
        cr stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        cr stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        cr stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        cr stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        cr stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        cr stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        cr var5 = null;
        cr var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        cr var15 = null;
        String var16 = null;
        cr var17 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              hq.b(ko.field_P, -128);
              if (sj.field_d != null) {
                L2: {
                  L3: {
                    fo.field_f.field_db = 0;
                    var15 = fo.field_f;
                    var17 = var15;
                    var17.field_Fb = 0;
                    var5 = hd.field_g;
                    hd.field_g.field_db = 0;
                    var5.field_Fb = 0;
                    var6 = kk.field_f;
                    kk.field_f.field_db = 0;
                    var6.field_Fb = 0;
                    ud.field_x.field_S = ej.field_d.toUpperCase();
                    var7 = (lb.field_c.field_Fb - -2) / 2;
                    kk.field_f.a(110, var7 + -2, 40, lb.field_c.field_db + -40, 0);
                    hd.field_g.a(120, lb.field_c.field_Fb + -var7, 40, -40 + lb.field_c.field_db, var7);
                    if (-2 != (rc.field_a.length ^ -1)) {
                      break L3;
                    } else {
                      if (2 != rc.field_a[0]) {
                        break L3;
                      } else {
                        var8 = 0;
                        break L2;
                      }
                    }
                  }
                  var8 = 0;
                  var9_int = 0;
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (rc.field_a.length <= var10) {
                        break L5;
                      } else {
                        L6: {
                          if (-1 == (qc.field_w[var10 / 8] & 1 << (7 & var10) ^ -1)) {
                            stackIn_11_0 = 0;
                            break L6;
                          } else {
                            stackIn_11_0 = 1;
                            break L6;
                          }
                        }
                        L7: {
                          var11_int = stackIn_11_0;
                          if (var11_int == 0) {
                            break L7;
                          } else {
                            var9_int++;
                            break L7;
                          }
                        }
                        L8: {
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if ((rc.field_a[var10] ^ -1) != -3) {
                              var8 = 1;
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var10++;
                        continue L4;
                      }
                    }
                    if (var9_int == 0) {
                      var8 = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                hd.field_g.field_lb = true;
                if (!qn.field_q) {
                  L9: {
                    stackIn_36_0 = hd.field_g;

                    if (var8 == 0) {
                      stackIn_37_0 = (cr) ((Object) stackIn_36_0);
                      stackIn_37_1 = lj.field_o;
                      break L9;
                    } else {
                      stackIn_37_0 = (cr) ((Object) stackIn_36_0);
                      stackIn_37_1 = w.field_y;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_37_0.field_S = ((String) (Object) stackIn_37_1).toUpperCase();
                    stackIn_39_0 = oi.field_a;

                    stackIn_39_1 = new String[]{hd.field_g.field_S};

                    if (var8 == 0) {
                      stackIn_40_0 = (cr) ((Object) stackIn_39_0);
                      stackIn_40_1 = (String[]) ((Object) stackIn_39_1);
                      stackIn_40_2 = h.field_A;
                      break L10;
                    } else {
                      stackIn_40_0 = (cr) ((Object) stackIn_39_0);
                      stackIn_40_1 = (String[]) ((Object) stackIn_39_1);
                      stackIn_40_2 = gh.field_c;
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_40_0.field_S = Vertigo2.a(stackIn_40_1, stackIn_40_2, -122);
                    ne.field_G.field_lb = true;
                    kk.field_f.field_S = lj.field_A;
                    gd.field_r = true;
                    if (null != gr.field_W) {
                      L12: {
                        gd.field_r = false;
                        ng.field_a = false;
                        if (e.field_c != null) {
                          break L12;
                        } else {
                          mn.field_t = new boolean[ol.field_A];
                          e.field_c = new byte[ol.field_A];
                          break L12;
                        }
                      }
                      var13 = 0;
                      var9_int = var13;
                      L13: while (true) {
                        if (var13 >= ol.field_A) {
                          uq.a(sj.field_d, ol.field_A, 20473, 0, -1, -1, -1, true);
                          if ((fn.field_z ^ -1) > -3) {
                            break L11;
                          } else {
                            if (cr.field_eb[12]) {
                              gd.field_r = true;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        } else {
                          mn.field_t[var13] = false;
                          var13++;
                          continue L13;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                  if (!gd.field_r) {
                    hd.field_g.field_lb = false;
                    if (!hd.field_g.field_G) {
                      break L1;
                    } else {
                      L14: {
                        var9 = null;
                        if (ng.field_a) {
                          var9 = "<col=A00000>" + rq.field_v + "</col>";
                          var11 = var9;
                          var9 = var11;
                          var11 = var9;
                          var9 = var11;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var10 = 0;
                      L15: while (true) {
                        if (ol.field_A <= var10) {
                          ko.field_S = "<col=A00000>" + qe.field_X + "<br>" + ah.field_j + (String) (var9);
                          break L1;
                        } else {
                          if (mn.field_t[var10]) {
                            L16: {
                              var11_ref = "<col=A00000>" + md.field_C[var10] + "</col>";
                              var9 = var11_ref;
                              var9 = var11_ref;
                              if (var9 != null) {
                                var9 = (String) (var9) + ", " + var11_ref;
                                break L16;
                              } else {
                                var9 = var11_ref;
                                break L16;
                              }
                            }
                            var10++;
                            continue L15;
                          } else {
                            var10++;
                            continue L15;
                          }
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                } else {
                  L17: {
                    oi.field_a.field_S = pp.field_y;
                    ne.field_G.field_lb = false;
                    if (var8 == 0) {
                      stackIn_25_0 = lr.field_J;
                      break L17;
                    } else {
                      stackIn_25_0 = mo.field_g;
                      break L17;
                    }
                  }
                  L18: {
                    var16 = stackIn_25_0;
                    var9 = var16;
                    var10 = kk.field_f.field_z.c(var16) - -(kk.field_f.field_z.a('.') * 3);
                    kk.field_f.field_O = 0;
                    if ((48 & lo.field_d ^ -1) == -17) {
                      var9 = var16 + ".";
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    kk.field_f.field_R = (kk.field_f.field_Fb - var10) / 2;
                    if (32 == (48 & lo.field_d)) {
                      var9 = (String) (var9) + "..";
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (-49 != (lo.field_d & 48 ^ -1)) {
                      break L20;
                    } else {
                      var9 = (String) (var9) + "...";
                      break L20;
                    }
                  }
                  kk.field_f.field_S = (String) (var9);
                  hd.field_g.field_S = mp.field_c.toUpperCase();
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L21: {
              if (param1 < -43) {
                break L21;
              } else {
                field_f = (String[][]) null;
                break L21;
              }
            }
            L22: {
              L23: {
                stackIn_72_0 = hk.field_o;

                stackIn_72_1 = 0;

                if (!param2) {
                  break L23;
                } else {
                  stackIn_72_0 = (cr) ((Object) stackIn_72_0);

                  if (param0) {
                    break L23;
                  } else {
                    stackIn_72_0 = (cr) ((Object) stackIn_72_0);

                    if (im.field_g) {
                      break L23;
                    } else {
                      stackIn_73_0 = (cr) ((Object) stackIn_72_0);
                      stackIn_73_1 = stackIn_72_1;
                      stackIn_73_2 = 1;
                      break L22;
                    }
                  }
                }
              }
              stackIn_73_0 = (cr) ((Object) stackIn_72_0);
              stackIn_73_1 = stackIn_72_1;
              stackIn_73_2 = 0;
              break L22;
            }
            L24: {
              L25: {
                ((cr) (Object) stackIn_73_0).a(stackIn_73_1, stackIn_73_2 != 0);
                stackIn_77_0 = lb.field_c;

                stackIn_77_1 = 0;

                if (!param2) {
                  break L25;
                } else {
                  stackIn_77_0 = (cr) ((Object) stackIn_77_0);

                  if (param0) {
                    break L25;
                  } else {
                    stackIn_77_0 = (cr) ((Object) stackIn_77_0);

                    if (im.field_g) {
                      break L25;
                    } else {
                      stackIn_78_0 = (cr) ((Object) stackIn_77_0);
                      stackIn_78_1 = stackIn_77_1;
                      stackIn_78_2 = 1;
                      break L24;
                    }
                  }
                }
              }
              stackIn_78_0 = (cr) ((Object) stackIn_77_0);
              stackIn_78_1 = stackIn_77_1;
              stackIn_78_2 = 0;
              break L24;
            }
            L26: {
              L27: {
                ((cr) (Object) stackIn_78_0).a(stackIn_78_1, stackIn_78_2 != 0);
                stackIn_82_0 = wc.field_m;

                stackIn_82_1 = 0;

                if (!param2) {
                  break L27;
                } else {
                  stackIn_82_0 = (cr) ((Object) stackIn_82_0);

                  if (param0) {
                    break L27;
                  } else {
                    stackIn_82_0 = (cr) ((Object) stackIn_82_0);

                    if (!im.field_g) {
                      break L27;
                    } else {
                      stackIn_83_0 = (cr) ((Object) stackIn_82_0);
                      stackIn_83_1 = stackIn_82_1;
                      stackIn_83_2 = 1;
                      break L26;
                    }
                  }
                }
              }
              stackIn_83_0 = (cr) ((Object) stackIn_82_0);
              stackIn_83_1 = stackIn_82_1;
              stackIn_83_2 = 0;
              break L26;
            }
            L28: {
              ((cr) (Object) stackIn_83_0).a(stackIn_83_1, stackIn_83_2 != 0);
              el.field_e.field_b.k(0);
              if (null != sj.field_d) {
                L29: {
                  if (ne.field_G.field_tb != 0) {
                    hc.a(-74, param3);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (0 == hd.field_g.field_tb) {
                    break L30;
                  } else {
                    if (!qn.field_q) {
                      mk.b(-128, param3);
                      break L30;
                    } else {
                      ea.a(param3, true);
                      break L30;
                    }
                  }
                }
                mg.a(false, param3, true, sj.field_d);
                break L28;
              } else {
                break L28;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var4), "an.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static cl[] a(int param0, jj param1) {
        cl[] stackIn_4_0 = null;
        cl[] stackIn_13_0 = null;
        cl[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        cl[] var4 = null;
        int var5 = 0;
        cl var6 = null;
        int var7 = 0;
        r var8 = null;
        wk var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!param1.a(param0 ^ -8193)) {
              stackIn_4_0 = new cl[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 8315) {
                  break L1;
                } else {
                  var8 = (r) null;
                  an.a(48, (r) null, 29, (byte) -55);
                  break L1;
                }
              }
              var9 = param1.b(-108);
              L2: while (true) {
                if (var9.field_b != 0) {
                  if (2 == var9.field_b) {
                    stackIn_13_0 = new cl[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var11 = (int[]) (var9.field_d);
                    var10 = var11;
                    var3 = var10;
                    var4 = new cl[var11.length >> 1903601666];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        stackIn_18_0 = (cl[]) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new cl();
                        var4[var5] = var6;
                        var6.field_b = var3[var5 << 1705977890];
                        var6.field_a = var3[(var5 << 1643529986) - -1];
                        var6.field_g = var3[(var5 << -375077502) + 2];
                        var6.field_e = var3[(var5 << 1043268642) - -3];
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  um.a(true, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("an.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    final static er[] a(int param0, int param1) {
        er[] var3 = new er[9];
        er[] var2 = var3;
        var3[4] = ed.a(param1, 64, false);
        if (param0 > -63) {
            field_c = true;
        }
        return var2;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        String var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (-12 == (hn.field_w ^ -1)) {
                pc.b((byte) -111);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              mg.a(param0 + 1244, nq.field_E, d.field_C, li.field_h);
              dh.a(0, (byte) -99, param1, 0);
              if (param0 == -1243) {
                break L2;
              } else {
                var3 = (String) null;
                an.a(75, (String) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("an.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(long param0, boolean param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            String var4 = null;
            L0: {
              if (!param1) {
                break L0;
              } else {
                var4 = (String) null;
                an.a((byte) -113, (String) null, -32);
                break L0;
              }
            }
            try {
              L1: {
                Thread.sleep(param0);
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        int var12;
        fe var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        fe var13;
        L0: {
          var12 = Vertigo2.field_L ? 1 : 0;
          this.field_i.a((byte) 40, lc.field_g, 0.0, 0.0, 1.0);
          this.field_b.a((byte) 40, fq.field_j, (double)param0, 1.0, 0.0);
          this.field_i.a(this.field_b, 55);
          this.field_i.a(this.field_d, -9);
          if (hn.field_t) {
            qr.field_l.a(this.field_d, 28580);
            break L0;
          } else {
            ue.field_N.c(0, 0);
            break L0;
          }
        }
        L1: {
          if (cn.field_r) {
            lk.a(this.field_d, (byte) -48);
            var13 = sf.field_b;
            var2 = var13;
            var3 = sf.field_b.field_y << -1027913532;
            var4 = sf.field_b.field_t << 735739812;
            var5 = Vertigo2.field_C.field_y << 1862696355;
            var6 = Vertigo2.field_C.field_t << -446507197;
            var7 = ji.field_p.field_y << -36124957;
            var8 = ji.field_p.field_t << -278777053;
            var9 = jf.field_M.field_y << 1768882371;
            var10 = jf.field_M.field_t << 428549123;
            gb.a(this.field_h[0][1], jf.field_M, var10, this.field_h[0][0], this.field_d, this.field_h[0][2], var9, param0 + -128);
            var11 = 0;
            L2: while (true) {
              if ((var11 ^ -1) <= -1001) {
                gb.a(this.field_a[0][1], Vertigo2.field_C, var6, this.field_a[0][0], this.field_d, this.field_a[0][2], var5, param0 ^ -116);
                gb.a(this.field_a[1][1], ji.field_p, var8, this.field_a[1][0], this.field_d, this.field_a[1][2], var7, -118);
                break L1;
              } else {
                gb.a(this.field_g[var11][1], var13, var4, this.field_g[var11][0], this.field_d, this.field_g[var11][2], var3, param0 + -96);
                var11++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
    }

    final static String a(byte param0, String param1, int param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_34_0 = null;
        String stackIn_37_0 = null;
        Object stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (1 != param2) {
              if ((param2 ^ -1) == -3) {
                stackIn_6_0 = Vertigo2.a(new String[]{param1}, nd.field_j, 15);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-4 == (param2 ^ -1)) {
                  stackIn_10_0 = Vertigo2.a(new String[]{param1}, hq.field_q, param0 + 107);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param2 == 4) {
                    stackIn_14_0 = Vertigo2.a(new String[]{param1}, og.field_i, 47);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((param2 ^ -1) != -6) {
                      if (-7 != (param2 ^ -1)) {
                        if ((param2 ^ -1) == -8) {
                          stackIn_24_0 = Vertigo2.a(new String[]{param1}, de.field_b, 49);
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (-9 != (param2 ^ -1)) {
                            if ((param2 ^ -1) != -12) {
                              if ((param2 ^ -1) == -13) {
                                stackIn_34_0 = Vertigo2.a(new String[]{param1}, fn.field_A, 52);
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                if (param2 != 13) {
                                  if (param0 != -1) {
                                    field_c = true;
                                    stackIn_41_0 = null;
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  } else {
                                    return null;
                                  }
                                } else {
                                  stackIn_37_0 = Vertigo2.a(new String[]{param1}, ee.field_a, -23);
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              }
                            } else {
                              stackIn_30_0 = Vertigo2.a(new String[]{param1}, k.field_d, param0 ^ 111);
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          } else {
                            stackIn_27_0 = Vertigo2.a(new String[]{param1}, nk.field_Ib, -126);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      } else {
                        stackIn_20_0 = Vertigo2.a(new String[]{param1}, va.field_r, 18);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_17_0 = Vertigo2.a(new String[]{param1}, ea.field_a, param0 + -124);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackIn_2_0 = Vertigo2.a(new String[]{param1}, pc.field_d, 6);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var3);

            stackIn_44_1 = new StringBuilder().append("an.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L1;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_27_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_30_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_34_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_37_0;
                            } else {
                              return (String) ((Object) stackIn_41_0);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, String param1) {
        try {
            if (param0 != 1) {
                an.a((byte) 80, 40, -119, -127, -68);
            }
            go.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "an.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        param2 -= 4;
        if (param0 != 41) {
            field_e = (String) null;
        }
        param1 += 2;
        param3 -= 4;
        param4 += 2;
        int var5 = param4 * bi.field_e + param1;
        int var6 = bi.field_e + -param2;
        wn.a(bi.field_l, var5, 0, 0, 0, 0, param2, param3, var6);
    }

    public static void a(boolean param0) {
        field_f = (String[][]) null;
        if (!param0) {
            an.a((byte) -39, 103, 98, 0, 70);
        }
        field_e = null;
    }

    an() {
        int var1 = 0;
        int var2 = 0;
        double var3 = 0.0;
        this.field_g = new int[1000][3];
        for (var1 = 0; (var1 ^ -1) > -901; var1++) {
            var2 = 3920 - -be.a(1920, (byte) 83);
            var3 = 3.141592653589793 * Math.random() * 2.0;
            this.field_g[var1][0] = (int)(320.0 + (double)var2 * Math.cos(var3));
            this.field_g[var1][2] = (int)(320.0 + Math.sin(var3) * (double)var2);
            this.field_g[var1][1] = -1800 + be.a(14400, (byte) 83);
        }
        for (var1 = 900; -1001 < (var1 ^ -1); var1++) {
            var2 = be.a(5840, (byte) 83);
            var3 = 2.0 * (3.141592653589793 * Math.random());
            this.field_g[var1][0] = (int)(320.0 + (double)var2 * Math.cos(var3));
            this.field_g[var1][2] = (int)((double)var2 * Math.sin(var3) + 320.0);
            this.field_g[var1][1] = 12600;
        }
        this.field_a = new int[2][3];
        for (var1 = 0; (var1 ^ -1) > -3; var1++) {
            var2 = be.a(2000, (byte) 83) + 1920;
            var3 = 2.0 * (3.141592653589793 * Math.random());
            this.field_a[var1][0] = (int)((double)var2 * Math.cos(var3) + 320.0);
            this.field_a[var1][2] = (int)((double)var2 * Math.sin(var3) + 320.0);
            this.field_a[var1][1] = be.a(7200, (byte) 83) - -1800;
        }
        this.field_h = new int[1][3];
        for (var1 = 0; -2 < (var1 ^ -1); var1++) {
            var2 = 3920 - -be.a(1920, (byte) 83);
            var3 = 2.0 * (Math.random() * 3.141592653589793);
            this.field_h[var1][0] = (int)(320.0 + Math.cos(var3) * (double)var2);
            this.field_h[var1][2] = (int)((double)var2 * Math.sin(var3) + 320.0);
            this.field_h[var1][1] = 1800 + be.a(7200, (byte) 83);
        }
        this.field_i = new or();
        this.field_b = new or();
        this.field_d = new int[12];
    }

    final void b(int param0) {
        lc.field_g = lc.field_g + 0.000625;
        if (param0 != 8) {
            return;
        }
        fq.field_j = fq.field_j + 0.00125;
    }

    final static u[] a(int param0, r param1, int param2, byte param3) {
        RuntimeException var4 = null;
        String var5 = null;
        Object stackIn_2_0 = null;
        u[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (hq.a(124, param2, param0, param1)) {
              L1: {
                if (param3 > 72) {
                  break L1;
                } else {
                  var5 = (String) null;
                  an.b(-122, (String) null);
                  break L1;
                }
              }
              stackIn_6_0 = kr.a((byte) -116);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("an.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (u[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_e = "There are some coins on this level - grab them for an extra 100 points each. Make sure to get them before you paint the last tile purple.";
    }
}
