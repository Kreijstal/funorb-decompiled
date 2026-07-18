/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        er stackIn_50_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        er stackOut_49_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
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
                            stackOut_49_0 = (er) var15;
                            stackIn_50_0 = stackOut_49_0;
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
                                    L10: {
                                      if (var16 != 3) {
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    var17++;
                                    continue L4;
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
                        L11: {
                          if (var13.field_F[var16] == 0) {
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var16++;
                        continue L3;
                      }
                    }
                  } else {
                    L12: {
                      if (var13.field_F[var16] == 0) {
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    var16++;
                    continue L2;
                  }
                }
              } else {
                L13: {
                  var9 = var13_int / var7.field_y;
                  var8 = var13_int % var7.field_y;
                  if (var8 % var11 <= var12) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L13;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L13;
                  }
                }
                L14: {
                  var10 = stackIn_6_0;
                  if (var9 % var11 > var12) {
                    L15: {
                      if (var10 != 0) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        break L15;
                      } else {
                        stackOut_9_0 = 1;
                        stackIn_11_0 = stackOut_9_0;
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
            stackOut_51_0 = (RuntimeException) var2;
            stackOut_51_1 = new StringBuilder().append("an.C(").append(param0).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L17;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L17;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ')');
        }
        return stackIn_50_0;
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
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
        int var12 = 0;
        int var13 = 0;
        cr var15 = null;
        String var16 = null;
        cr var17 = null;
        int stackIn_11_0 = 0;
        String stackIn_25_0 = null;
        cr stackIn_35_0 = null;
        cr stackIn_36_0 = null;
        cr stackIn_37_0 = null;
        String stackIn_37_1 = null;
        cr stackIn_38_0 = null;
        String[] stackIn_38_1 = null;
        cr stackIn_39_0 = null;
        String[] stackIn_39_1 = null;
        cr stackIn_40_0 = null;
        String[] stackIn_40_1 = null;
        String stackIn_40_2 = null;
        cr stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        cr stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        cr stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        cr stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        cr stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        cr stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        cr stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        cr stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        cr stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        cr stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        cr stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        cr stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        cr stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        cr stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        cr stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        cr stackOut_34_0 = null;
        cr stackOut_36_0 = null;
        String stackOut_36_1 = null;
        cr stackOut_35_0 = null;
        String stackOut_35_1 = null;
        cr stackOut_37_0 = null;
        String[] stackOut_37_1 = null;
        cr stackOut_39_0 = null;
        String[] stackOut_39_1 = null;
        String stackOut_39_2 = null;
        cr stackOut_38_0 = null;
        String[] stackOut_38_1 = null;
        String stackOut_38_2 = null;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        cr stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        cr stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        cr stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        cr stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        cr stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        cr stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        cr stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        cr stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        cr stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        cr stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        cr stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        cr stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        cr stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        cr stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        cr stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
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
                    if (rc.field_a.length != 1) {
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
                          if ((qc.field_w[var10 / 8] & 1 << (7 & var10)) == 0) {
                            stackOut_10_0 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            break L6;
                          } else {
                            stackOut_9_0 = 1;
                            stackIn_11_0 = stackOut_9_0;
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
                            if (rc.field_a[var10] != 2) {
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
                    stackOut_34_0 = hd.field_g;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_35_0 = stackOut_34_0;
                    if (var8 == 0) {
                      stackOut_36_0 = (cr) (Object) stackIn_36_0;
                      stackOut_36_1 = lj.field_o;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      break L9;
                    } else {
                      stackOut_35_0 = (cr) (Object) stackIn_35_0;
                      stackOut_35_1 = w.field_y;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_37_0.field_S = ((String) (Object) stackIn_37_1).toUpperCase();
                    stackOut_37_0 = oi.field_a;
                    stackOut_37_1 = new String[]{hd.field_g.field_S};
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    if (var8 == 0) {
                      stackOut_39_0 = (cr) (Object) stackIn_39_0;
                      stackOut_39_1 = (String[]) (Object) stackIn_39_1;
                      stackOut_39_2 = h.field_A;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      stackIn_40_2 = stackOut_39_2;
                      break L10;
                    } else {
                      stackOut_38_0 = (cr) (Object) stackIn_38_0;
                      stackOut_38_1 = (String[]) (Object) stackIn_38_1;
                      stackOut_38_2 = gh.field_c;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_40_2 = stackOut_38_2;
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
                          if (fn.field_z < 2) {
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
                          var9 = (Object) (Object) ("<col=A00000>" + rq.field_v + "</col>");
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
                          ko.field_S = "<col=A00000>" + qe.field_X + "<br>" + ah.field_j + (String) var9;
                          break L1;
                        } else {
                          L16: {
                            if (!mn.field_t[var10]) {
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          var10++;
                          continue L15;
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
                      stackOut_24_0 = lr.field_J;
                      stackIn_25_0 = stackOut_24_0;
                      break L17;
                    } else {
                      stackOut_23_0 = mo.field_g;
                      stackIn_25_0 = stackOut_23_0;
                      break L17;
                    }
                  }
                  L18: {
                    var16 = stackIn_25_0;
                    var9 = (Object) (Object) var16;
                    var10 = kk.field_f.field_z.c(var16) - -(kk.field_f.field_z.a('.') * 3);
                    kk.field_f.field_O = 0;
                    if ((48 & lo.field_d) == 16) {
                      var9 = (Object) (Object) (var16 + ".");
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    kk.field_f.field_R = (kk.field_f.field_Fb - var10) / 2;
                    if (32 == (48 & lo.field_d)) {
                      var9 = (Object) (Object) ((String) var9 + "..");
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if ((lo.field_d & 48) != 48) {
                      break L20;
                    } else {
                      var9 = (Object) (Object) ((String) var9 + "...");
                      break L20;
                    }
                  }
                  kk.field_f.field_S = (String) var9;
                  hd.field_g.field_S = mp.field_c.toUpperCase();
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L21: {
              L22: {
                stackOut_65_0 = hk.field_o;
                stackOut_65_1 = 0;
                stackIn_69_0 = stackOut_65_0;
                stackIn_69_1 = stackOut_65_1;
                stackIn_66_0 = stackOut_65_0;
                stackIn_66_1 = stackOut_65_1;
                if (!param2) {
                  break L22;
                } else {
                  stackOut_66_0 = (cr) (Object) stackIn_66_0;
                  stackOut_66_1 = stackIn_66_1;
                  stackIn_69_0 = stackOut_66_0;
                  stackIn_69_1 = stackOut_66_1;
                  stackIn_67_0 = stackOut_66_0;
                  stackIn_67_1 = stackOut_66_1;
                  if (param0) {
                    break L22;
                  } else {
                    stackOut_67_0 = (cr) (Object) stackIn_67_0;
                    stackOut_67_1 = stackIn_67_1;
                    stackIn_69_0 = stackOut_67_0;
                    stackIn_69_1 = stackOut_67_1;
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    if (im.field_g) {
                      break L22;
                    } else {
                      stackOut_68_0 = (cr) (Object) stackIn_68_0;
                      stackOut_68_1 = stackIn_68_1;
                      stackOut_68_2 = 1;
                      stackIn_70_0 = stackOut_68_0;
                      stackIn_70_1 = stackOut_68_1;
                      stackIn_70_2 = stackOut_68_2;
                      break L21;
                    }
                  }
                }
              }
              stackOut_69_0 = (cr) (Object) stackIn_69_0;
              stackOut_69_1 = stackIn_69_1;
              stackOut_69_2 = 0;
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            }
            L23: {
              L24: {
                ((cr) (Object) stackIn_70_0).a(stackIn_70_1, stackIn_70_2 != 0);
                stackOut_70_0 = lb.field_c;
                stackOut_70_1 = 0;
                stackIn_74_0 = stackOut_70_0;
                stackIn_74_1 = stackOut_70_1;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                if (!param2) {
                  break L24;
                } else {
                  stackOut_71_0 = (cr) (Object) stackIn_71_0;
                  stackOut_71_1 = stackIn_71_1;
                  stackIn_74_0 = stackOut_71_0;
                  stackIn_74_1 = stackOut_71_1;
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  if (param0) {
                    break L24;
                  } else {
                    stackOut_72_0 = (cr) (Object) stackIn_72_0;
                    stackOut_72_1 = stackIn_72_1;
                    stackIn_74_0 = stackOut_72_0;
                    stackIn_74_1 = stackOut_72_1;
                    stackIn_73_0 = stackOut_72_0;
                    stackIn_73_1 = stackOut_72_1;
                    if (im.field_g) {
                      break L24;
                    } else {
                      stackOut_73_0 = (cr) (Object) stackIn_73_0;
                      stackOut_73_1 = stackIn_73_1;
                      stackOut_73_2 = 1;
                      stackIn_75_0 = stackOut_73_0;
                      stackIn_75_1 = stackOut_73_1;
                      stackIn_75_2 = stackOut_73_2;
                      break L23;
                    }
                  }
                }
              }
              stackOut_74_0 = (cr) (Object) stackIn_74_0;
              stackOut_74_1 = stackIn_74_1;
              stackOut_74_2 = 0;
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L23;
            }
            L25: {
              L26: {
                ((cr) (Object) stackIn_75_0).a(stackIn_75_1, stackIn_75_2 != 0);
                stackOut_75_0 = wc.field_m;
                stackOut_75_1 = 0;
                stackIn_79_0 = stackOut_75_0;
                stackIn_79_1 = stackOut_75_1;
                stackIn_76_0 = stackOut_75_0;
                stackIn_76_1 = stackOut_75_1;
                if (!param2) {
                  break L26;
                } else {
                  stackOut_76_0 = (cr) (Object) stackIn_76_0;
                  stackOut_76_1 = stackIn_76_1;
                  stackIn_79_0 = stackOut_76_0;
                  stackIn_79_1 = stackOut_76_1;
                  stackIn_77_0 = stackOut_76_0;
                  stackIn_77_1 = stackOut_76_1;
                  if (param0) {
                    break L26;
                  } else {
                    stackOut_77_0 = (cr) (Object) stackIn_77_0;
                    stackOut_77_1 = stackIn_77_1;
                    stackIn_79_0 = stackOut_77_0;
                    stackIn_79_1 = stackOut_77_1;
                    stackIn_78_0 = stackOut_77_0;
                    stackIn_78_1 = stackOut_77_1;
                    if (!im.field_g) {
                      break L26;
                    } else {
                      stackOut_78_0 = (cr) (Object) stackIn_78_0;
                      stackOut_78_1 = stackIn_78_1;
                      stackOut_78_2 = 1;
                      stackIn_80_0 = stackOut_78_0;
                      stackIn_80_1 = stackOut_78_1;
                      stackIn_80_2 = stackOut_78_2;
                      break L25;
                    }
                  }
                }
              }
              stackOut_79_0 = (cr) (Object) stackIn_79_0;
              stackOut_79_1 = stackIn_79_1;
              stackOut_79_2 = 0;
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L25;
            }
            L27: {
              ((cr) (Object) stackIn_80_0).a(stackIn_80_1, stackIn_80_2 != 0);
              el.field_e.field_b.k(0);
              if (null != sj.field_d) {
                L28: {
                  if (ne.field_G.field_tb != 0) {
                    hc.a(-74, 11);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (0 == hd.field_g.field_tb) {
                    break L29;
                  } else {
                    if (!qn.field_q) {
                      mk.b(-128, 11);
                      break L29;
                    } else {
                      ea.a(11, true);
                      break L29;
                    }
                  }
                }
                mg.a(false, 11, true, sj.field_d);
                break L27;
              } else {
                break L27;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var4, "an.H(" + param0 + ',' + -86 + ',' + param2 + ',' + 11 + ')');
        }
    }

    final static cl[] a(int param0, jj param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        cl[] var4 = null;
        int var5 = 0;
        cl var6 = null;
        int var7 = 0;
        wk var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        cl[] stackIn_4_0 = null;
        cl[] stackIn_11_0 = null;
        cl[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        cl[] stackOut_3_0 = null;
        cl[] stackOut_10_0 = null;
        cl[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!param1.a(-124)) {
              stackOut_3_0 = new cl[]{};
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var8 = param1.b(-108);
              L1: while (true) {
                if (var8.field_b != 0) {
                  if (2 == var8.field_b) {
                    stackOut_10_0 = new cl[]{};
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    var12 = (int[]) var8.field_d;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new cl[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_15_0 = (cl[]) var4;
                        stackIn_16_0 = stackOut_15_0;
                        break L0;
                      } else {
                        var6 = new cl();
                        var4[var5] = var6;
                        var6.field_b = var3[var5 << 2];
                        var6.field_a = var3[(var5 << 2) - -1];
                        var6.field_g = var3[(var5 << 2) + 2];
                        var6.field_e = var3[(var5 << 2) - -3];
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  um.a(true, 10L);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("an.G(").append(8315).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_16_0;
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
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (hn.field_w == 11) {
                pc.b((byte) -111);
                break L1;
              } else {
                break L1;
              }
            }
            mg.a(1, nq.field_E, d.field_C, li.field_h);
            dh.a(0, (byte) -99, param1, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("an.B(").append(-1243).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static void a(long param0, boolean param1) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            {
              L0: {
                Thread.sleep(param0);
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        fe var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        fe var13 = null;
        L0: {
          var12 = Vertigo2.field_L ? 1 : 0;
          ((an) this).field_i.a((byte) 40, lc.field_g, 0.0, 0.0, 1.0);
          ((an) this).field_b.a((byte) 40, fq.field_j, (double)param0, 1.0, 0.0);
          ((an) this).field_i.a(((an) this).field_b, 55);
          ((an) this).field_i.a(((an) this).field_d, -9);
          if (hn.field_t) {
            qr.field_l.a(((an) this).field_d, 28580);
            break L0;
          } else {
            ue.field_N.c(0, 0);
            break L0;
          }
        }
        L1: {
          if (cn.field_r) {
            lk.a(((an) this).field_d, (byte) -48);
            var13 = sf.field_b;
            var2 = var13;
            var3 = sf.field_b.field_y << 4;
            var4 = sf.field_b.field_t << 4;
            var5 = Vertigo2.field_C.field_y << 3;
            var6 = Vertigo2.field_C.field_t << 3;
            var7 = ji.field_p.field_y << 3;
            var8 = ji.field_p.field_t << 3;
            var9 = jf.field_M.field_y << 3;
            var10 = jf.field_M.field_t << 3;
            gb.a(((an) this).field_h[0][1], (fb) (Object) jf.field_M, var10, ((an) this).field_h[0][0], ((an) this).field_d, ((an) this).field_h[0][2], var9, param0 + -128);
            var11 = 0;
            L2: while (true) {
              if (var11 >= 1000) {
                gb.a(((an) this).field_a[0][1], (fb) (Object) Vertigo2.field_C, var6, ((an) this).field_a[0][0], ((an) this).field_d, ((an) this).field_a[0][2], var5, param0 ^ -116);
                gb.a(((an) this).field_a[1][1], (fb) (Object) ji.field_p, var8, ((an) this).field_a[1][0], ((an) this).field_d, ((an) this).field_a[1][2], var7, -118);
                break L1;
              } else {
                gb.a(((an) this).field_g[var11][1], (fb) (Object) var13, var4, ((an) this).field_g[var11][0], ((an) this).field_d, ((an) this).field_g[var11][2], var3, param0 + -96);
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
        RuntimeException var3 = null;
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
        String stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        String stackOut_13_0 = null;
        String stackOut_23_0 = null;
        String stackOut_33_0 = null;
        String stackOut_37_0 = null;
        String stackOut_29_0 = null;
        String stackOut_26_0 = null;
        String stackOut_19_0 = null;
        String stackOut_16_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        try {
          L0: {
            if (1 != param2) {
              if (param2 == 2) {
                stackOut_5_0 = Vertigo2.a(new String[1], nd.field_j, 15);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (param2 == 3) {
                  stackOut_9_0 = Vertigo2.a(new String[1], hq.field_q, 106);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (param2 == 4) {
                    stackOut_13_0 = Vertigo2.a(new String[1], og.field_i, 47);
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (param2 != 5) {
                      if (param2 != 6) {
                        if (param2 == 7) {
                          stackOut_23_0 = Vertigo2.a(new String[1], de.field_b, 49);
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          if (param2 != 8) {
                            if (param2 != 11) {
                              if (param2 == 12) {
                                stackOut_33_0 = Vertigo2.a(new String[1], fn.field_A, 52);
                                stackIn_34_0 = stackOut_33_0;
                                return stackIn_34_0;
                              } else {
                                if (param2 == 13) {
                                  stackOut_37_0 = Vertigo2.a(new String[1], ee.field_a, -23);
                                  stackIn_38_0 = stackOut_37_0;
                                  break L0;
                                } else {
                                  return null;
                                }
                              }
                            } else {
                              stackOut_29_0 = Vertigo2.a(new String[1], k.field_d, -112);
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            }
                          } else {
                            stackOut_26_0 = Vertigo2.a(new String[1], nk.field_Ib, -126);
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0;
                          }
                        }
                      } else {
                        stackOut_19_0 = Vertigo2.a(new String[1], va.field_r, 18);
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    } else {
                      stackOut_16_0 = Vertigo2.a(new String[1], ea.field_a, -125);
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  }
                }
              }
            } else {
              stackOut_1_0 = Vertigo2.a(new String[1], pc.field_d, 6);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var3;
            stackOut_40_1 = new StringBuilder().append("an.J(").append(-1).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L1;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ',' + param2 + ')');
        }
        return stackIn_38_0;
    }

    final static void a(int param0, String param1) {
        try {
            go.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "an.L(" + 1 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        param2 -= 4;
        param1 += 2;
        param3 -= 4;
        param4 += 2;
        int var5 = param4 * bi.field_e + param1;
        int var6 = bi.field_e + -param2;
        wn.a(bi.field_l, var5, 0, 0, 0, 0, param2, param3, var6);
    }

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
    }

    an() {
        int var1 = 0;
        int var2 = 0;
        double var3 = 0.0;
        ((an) this).field_g = new int[1000][3];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 900) {
            var1 = 900;
            L1: while (true) {
              if (var1 >= 1000) {
                ((an) this).field_a = new int[2][3];
                var1 = 0;
                L2: while (true) {
                  if (var1 >= 2) {
                    ((an) this).field_h = new int[1][3];
                    var1 = 0;
                    L3: while (true) {
                      if (var1 >= 1) {
                        ((an) this).field_i = new or();
                        ((an) this).field_b = new or();
                        ((an) this).field_d = new int[12];
                        return;
                      } else {
                        var2 = 3920 - -be.a(1920, (byte) 83);
                        var3 = 2.0 * (Math.random() * 3.141592653589793);
                        ((an) this).field_h[var1][0] = (int)(320.0 + Math.cos(var3) * (double)var2);
                        ((an) this).field_h[var1][2] = (int)((double)var2 * Math.sin(var3) + 320.0);
                        ((an) this).field_h[var1][1] = 1800 + be.a(7200, (byte) 83);
                        var1++;
                        continue L3;
                      }
                    }
                  } else {
                    var2 = be.a(2000, (byte) 83) + 1920;
                    var3 = 2.0 * (3.141592653589793 * Math.random());
                    ((an) this).field_a[var1][0] = (int)((double)var2 * Math.cos(var3) + 320.0);
                    ((an) this).field_a[var1][2] = (int)((double)var2 * Math.sin(var3) + 320.0);
                    ((an) this).field_a[var1][1] = be.a(7200, (byte) 83) - -1800;
                    var1++;
                    continue L2;
                  }
                }
              } else {
                var2 = be.a(5840, (byte) 83);
                var3 = 2.0 * (3.141592653589793 * Math.random());
                ((an) this).field_g[var1][0] = (int)(320.0 + (double)var2 * Math.cos(var3));
                ((an) this).field_g[var1][2] = (int)((double)var2 * Math.sin(var3) + 320.0);
                ((an) this).field_g[var1][1] = 12600;
                var1++;
                continue L1;
              }
            }
          } else {
            var2 = 3920 - -be.a(1920, (byte) 83);
            var3 = 3.141592653589793 * Math.random() * 2.0;
            ((an) this).field_g[var1][0] = (int)(320.0 + (double)var2 * Math.cos(var3));
            ((an) this).field_g[var1][2] = (int)(320.0 + Math.sin(var3) * (double)var2);
            ((an) this).field_g[var1][1] = -1800 + be.a(14400, (byte) 83);
            var1++;
            continue L0;
          }
        }
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
        Object stackIn_2_0 = null;
        u[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        u[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (hq.a(124, param2, param0, param1)) {
              stackOut_3_0 = kr.a((byte) -116);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (u[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("an.M(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + 120 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "There are some coins on this level - grab them for an extra 100 points each. Make sure to get them before you paint the last tile purple.";
    }
}
